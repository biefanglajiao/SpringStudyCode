package bean的装配;

import com.bean的装配.基于注解的装配.PersonController;
import com.bean的装配.基于注解的装配.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mvc案例测试 {
    @Test
public void  text(){
    ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext1.xml");
        PersonController personController = ac.getBean("personController", PersonController.class);
        personController.islogin("czh","yhf");
    }
}
