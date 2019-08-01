package git.gaozhanghappy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/springboot")
@SpringBootApplication
@MapperScan("git.gaozhanghappy.mapper")
public class ThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafApplication.class, args);
	}
	@RequestMapping("/hello")
	@ResponseBody
	public String getHello(){
		return "hello";
}
}
