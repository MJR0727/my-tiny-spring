package us.codecraft.tinyioc.bean;

import com.MJR.bean.BeanFactory;
import org.junit.Test;

/**
 * @author Mjr
 * @version 1.0
 * @description: 版本一，最简单的Bean工厂
 * @date 2023/3/14 20:06
 */
public class SimpleBeanFactoryTest {

    @Test
    public void testBeanFactory(){
        BeanFactory beanFactory = new BeanFactory();
        HelloService helloService = new HelloService();
        beanFactory.registerBean("helloService",helloService);
        HelloService service = (HelloService) beanFactory.getBean("helloService");
        service.hello();
    }

    class HelloService{

        public HelloService(){
        }

        public void hello(){
            System.out.println("hello-IOC");
        }

    }
    /*
    存在的问题：
             1、IOC容器（BeanFactory）的功能标准化不好，注册Bean和获取Bean的工作应该实现接口标准化
             2、Bean缺少一些统一的信息标识（元数据）。
     */
}
