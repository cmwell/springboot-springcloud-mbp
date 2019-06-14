import com.springboot.MySpringbootApplication;
import com.springboot.test01.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * <ul>
 * <li>项目名称：MyTest</li>
 * <li>文件名称：SampleTest</li>
 * <li>author：张浩</li>
 * <li>日期：2019年04月09日 14时30分</li>
 * <li>Copyright ©2017, 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={MySpringbootApplication.class})
public class SampleTest {
   @Autowired
   private UserService userService;


    @Test
    public void testABC() {
       userService.addSomething();

    }

    @Test
    public void restMan(){

    }


}




