package co.kr.fakebook;

import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.kr.fakebook.dto.UsersDTO;
import co.kr.fakebook.mapper.UserMapper;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	 private SqlSession sqlSession;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
//		TestMapper mapper w= sqlSession.getMapper(TestMapper.class);
//		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//		UsersDTO user = mapper.selectUsers().get(0);
//        System.out.println(user.getId());
//        System.out.println(user.getUsername());
        
		return "home";
	}
	
	
	
}