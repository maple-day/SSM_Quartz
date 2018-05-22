import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fangda.quartz.service.ReddsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:spring/*.xml")
public class TestRedds {

	@Autowired
	private ReddsService reddsService;
	
	@Test
	public void testRedds() {
		reddsService.addRedds();
	}
}
