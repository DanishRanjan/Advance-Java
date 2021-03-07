import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String ar[]){
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory f=new XmlBeanFactory(r);
		Student a1=(Student)f.getBean("ab");
		System.out.println("Student information is,");
		System.out.println(a1);
	}

}