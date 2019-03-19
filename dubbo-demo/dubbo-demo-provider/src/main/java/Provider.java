import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: dubbo-demo
 * @description: 启动
 * @author: yechao
 * @create: 2019-03-18 17:18
 **/

public class Provider {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("Provider started.");

        System.in.read(); // press any key to exit
    }
}
