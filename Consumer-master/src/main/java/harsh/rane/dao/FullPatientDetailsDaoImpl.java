package harsh.rane.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import harsh.rane.model.FullPatientDetails;

@Repository
public class FullPatientDetailsDaoImpl {

	private static final Logger LOGGER = LogManager.getLogger(FullPatientDetailsDaoImpl.class);
	@Autowired
	private SessionFactory sessionfactory; 
	Session session=null;
	
	public void UpdatePatientDetails(int id,String name, String department)
	{
		session=sessionfactory.openSession();
		session.beginTransaction();
		
		FullPatientDetails fd=new FullPatientDetails();
		fd.setId(id);
		fd.setName(name);
		fd.setDepartment(department);
		
		session.save(fd);
		
		session.getTransaction().commit();
		session.close();
		LOGGER.info("Data saved successfuly in FullPatientDetails");
	}
	
	
}
