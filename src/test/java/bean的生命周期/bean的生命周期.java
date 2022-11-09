package bean的生命周期;

import com.bean的生命周期.User;
import com.bean的装配.基于注解的装配.PersonController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class bean的生命周期 {
    @Test
    public void text(){
        //创建容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext1.xml");
        User user = ac.getBean("user2", User.class);
        User user1 = ac.getBean("user2", User.class);
        System.out.println(user+"_____________"+user1);//prototype下 初始化有两次  说明调用一次初始化一次
//        System.out.println(user1);


        //销毁容器里的bean
        AbstractApplicationContext aa=(AbstractApplicationContext) ac;
        aa.registerShutdownHook();

    }
    }

