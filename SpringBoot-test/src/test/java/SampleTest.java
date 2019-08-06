import cn.hutool.core.date.DateUtil;
import com.springboot.MySpringbootApplication;
import com.springboot.test01.entity.TestC;
import com.springboot.test02.entity.WellUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.phprpc.util.PHPSerializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


/**
 * <ul>
 * <li>项目名称：MyTest</li>
 * <li>文件名称：china</li>
 * <li>author: 张浩</li>
 * <li>日期：2019年04月09日 14时30分</li>
 * <li>Copyright ©2017, 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={MySpringbootApplication.class})
public class SampleTest {


   @Test
   public void testString() throws Exception {
      System.out.println("github测试");
   }


}




