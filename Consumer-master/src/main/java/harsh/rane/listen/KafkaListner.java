package harsh.rane.listen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import harsh.rane.dao.FullPatientDetailsDaoImpl;
import harsh.rane.model.Patient;
import harsh.rane.model.PatientAccount;

@Service
public class KafkaListner {

	 @Autowired
	 private RestTemplate restTemplate;
	 
	 @Autowired
	 FullPatientDetailsDaoImpl fullpatientdetails;
	 
	 private static final Logger LOGGER = LogManager.getLogger(KafkaListner.class);
	 
	@KafkaListener(topics = "topic1", group = "group_id", containerFactory="kafkaListenerContainerFactory")
	public void consumeJson(Patient patient)
	{
		PatientAccount patientacc=restTemplate.getForObject("http://localhost:8081/getdetails/"+patient.getId(),
		PatientAccount.class);
		
		if(patientacc==null)
		{
			LOGGER.error("Received null object from RestCall");
		}
		fullpatientdetails.UpdatePatientDetails(Integer.valueOf(patient.getId()), patient.getName(), patientacc.getDepartment());
	}
}
