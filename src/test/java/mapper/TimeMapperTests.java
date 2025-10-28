package mapper;

import com.ssg.springwebmvc.mapper.TimeMapper;
import com.ssg.springwebmvc.mapper.TimeMapper2;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class TimeMapperTests {

    @Autowired(required = false)// 인터페이스이기에 생성자 불가
    private TimeMapper2 timeMapper2;

    @Test
    public void testTimeMapper(){
        log.info(timeMapper2.getNow());
    }








}
