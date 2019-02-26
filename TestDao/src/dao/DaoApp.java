package dao;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
//DAO(Data Access Object) 数据访问对象, 是一个面向对象的数据库接口，
//此例没有写DAO工厂
public class DaoApp {

	public static void main(String[] args) {
		   
        XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        IPersonDao personDao=(IPersonDao)factory.getBean("personDao");

        Person person=new Person();
        person.setName("hongyu");
        person.setAge(30);

        personDao.addPerson(person);

        System.out.println(personDao.getPersonName(1));

    }
}
