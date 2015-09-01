import javax.mail.Header;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zc.service.Hello;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})  
public class TestDI {
	@Autowired
	public Hello hello;
	
	@Test
	public void testSayHello(){
		hello.sayHello();
	}
}
