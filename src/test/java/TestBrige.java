import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zc.bridge.Image;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) 
public class TestBrige {
	@Resource(name="BMPImage")
	public Image image;
	@Resource(name="JPGImage")
	public Image image2;
	
	@Test
	public void client(){
		image.parseFile("123");
		
		image2.parseFile("kkk");
	}
}
