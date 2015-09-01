import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.template.Account;


@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) 
public class TestTemplate {
	
	@Resource(name="newAccount")
	public Account account;
	
	@Test
	public void client(){
		account.templateMethod("123");
	}
}
