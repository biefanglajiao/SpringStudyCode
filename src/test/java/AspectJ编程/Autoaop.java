package AspectJ编程;

import com.AspectJ编程.基于注解实现aop.target.TrainStation;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autoaop {
    @Test
    public void autocglibtext(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContextAutocglib.xml");
        TrainStation trainstation = ac.getBean("trainstation", TrainStation.class);
        trainstation.sale();
    }
}
