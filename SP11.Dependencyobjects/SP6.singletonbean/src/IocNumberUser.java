import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class IocNumberUser 
{

	public static void main(String[] args)
	{
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory f=new XmlBeanFactory(r);
		System.out.println("Obtaining numbers n1 & n2 from the IOC Container...");
		Number n1=(Number)f.getBean("number");
		Number n2=(Number)f.getBean("number");
		System.out.println("Number n1 is:");
		n1.display();
		System.out.println("Number n2 is:");
		n2.display();
		Number n3=n1.add(n2);
		System.out.println("Sum of n1 and n2");
		n3.display();
	}

}