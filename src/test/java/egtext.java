import com.eg.UserSeverImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class egtext {
    @Test
    public  void login(){
      ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserSeverImp userservice = ac.getBean("userservice", UserSeverImp.class);
        boolean czh = userservice.login("czh", 123);
        System.out.println(czh);
    }
}
