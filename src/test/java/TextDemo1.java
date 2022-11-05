import com.caz.domin.Meat;
import com.caz.domin.Potato;
import com.caz.domin.User;
import com.caz.domin.Userinfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextDemo1
{
    /*****
     * 使用spring  避免 new  spring帮我们 以达到最优解
      */
    @Test
    public void textpotato() {
        //1知道筷子去哪里夹什么菜
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");//生成筷子（）里对应位置
        //2 默认Sprong锅
        //3  筷子ac夹菜
       Potato potato = (Potato) ac.getBean("potato");//对应xml里的id   要强转
        System.out.println(potato);
        Meat meat = ac.getBean("meat", Meat.class); //避免强转
        System.out.println(meat);
    }


    @Test
    public void textuser()//使用setter方法实现依赖注入
    {
         ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = ac.getBean("user", User.class);
        user.show();
    }
    @Test
    //使用构造方法实现依赖注入
    public void  textuser1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Userinfo userinfo = ac.getBean("userinfo", Userinfo.class);
        userinfo.show();
    }

    @Test
    //一对多映射
    public  void  textuser2(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = ac.getBean("user", User.class);

        System.out.println(user);
    }


}

