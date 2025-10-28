package sample;

import com.ssg.springwebmvc.prof.TeachingRoom;
import com.ssg.springwebmvc.sample.restaurant.Restaurant;
import com.ssg.springwebmvc.sample.SampleService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@ExtendWith(SpringExtension.class) // Junit 버전에서 Spring-test 이용하기 위한 설정 어노테이션
// 스프링의 설정 정보를 로딩하기 위한
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//@RequiredArgsConstructor
@Log4j2
public class sampleTests {

    @Autowired // 스프링에게 보드서비스를 꽂아달라고 요청 -> 스프링에서 사용하는 의존성 주입 어노테이션
    private SampleService sampleService; // sampleService 를 멤버 변수 선언
    // 만일 지정된 빈이 컨테이너에 존재한다면 이곳에 주입해주기를 원한다고 요청하는 것

    @Autowired
    private Restaurant restaurant;

    @Autowired
    private TeachingRoom teachingRoom;

    @Autowired
    private DataSource dataSource;

    @Test
    public void testSampleService() {
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }

    @Test
    public void testRestaurant() {
        log.info(restaurant);
        Assertions.assertNotNull(restaurant);
    }

    @Test
    public void testStudent(){
        log.info(teachingRoom);
        Assertions.assertNotNull(teachingRoom);
    }

    // 스프링은 필요한 객체를 스프링이 주입해 주기 떄문에 개별적으로 클래스를 작성해서 빈(bean)으로 등록해두기만하면 원하는 곳에서 쉽게 다른 객체를 사용할 수 있다.
    @Test
    public void testDataSource() throws SQLException {
        Connection connection = dataSource.getConnection();
        log.info(connection);
        Assertions.assertNotNull(connection);
        connection.close();
    }
}
