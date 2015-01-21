package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith( SpringJUnit4ClassRunner.class )
@SpringApplicationConfiguration( classes = Application.class )
public class SampleControllerTest {
	@Autowired SampleController controller;

	@Test
	public void testHome() throws Exception {
		assertEquals("Hello World!", controller.home());

	}
}
