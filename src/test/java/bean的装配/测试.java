package bean的装配;

import com.bean的装配.基于注解的装配.Jobs;
import com.bean的装配.基于注解的装配.User;
import com.eg.UserSeverImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class 测试 {
    @Test
    public void  text(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext1.xml");
        User user = ac.getBean("user", User.class);

        System.out.println(user);
    }
    @Test
    public void  text一对多(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext1.xml");
        Jobs jobs = ac.getBean("jobs", Jobs.class);

        System.out.println(jobs);
    }
    @Test
    public void  text一对多自动装配(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        com.bean的装配.自动装配.User user = ac.getBean("user1", com.bean的装配.自动装配.User.class);

        System.out.println(user);
    }

}
