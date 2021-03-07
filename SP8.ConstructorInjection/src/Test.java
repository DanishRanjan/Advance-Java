import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String ar[]){
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory f=new XmlBeanFactory(r);
		System.out.println("Constructor value are following");
		A a1=(A)f.getBean("ab");
		a1.display();
	}

}