import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class NumberTest {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory f=new XmlBeanFactory(r);
		System.out.println("Obtaining numbers from the IOC Container...");
		NumberDisplay n1=(NumberDisplay)f.getBean("number");
		n1.display();
		
	}

}