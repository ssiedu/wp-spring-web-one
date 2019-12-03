package com.ssi;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("verify")
	public ModelAndView userAuthentication(@ModelAttribute("userinfo") User user, HttpServletRequest request) {
		
		if(userService.authenticateUser(user)) {
			ModelAndView mv=new ModelAndView("success.jsp");
			mv.addObject("author", "manoj");
			return mv;
		}else {
			ModelAndView mv=new ModelAndView("loginpage.jsp");
			return mv;
		}
		
		
		
		
		/*PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		
		//String id=request.getParameter("t1");
		//String pw=request.getParameter("t2");
		
		/*if(user.getUserid().equals("abc") && user.getPassword().equals("xyz")) {
			//request.setAttribute("userinfo", user);
			//return "success.jsp";
			ModelAndView mv=new ModelAndView();
			mv.addObject("author", "manoj");
			mv.setViewName("success.jsp");
			return mv;
			
		}else {
			ModelAndView mv=new ModelAndView("loginpage.jsp");
			return mv;
		}*/
	}
	
	@RequestMapping("login")
	public String showLoginForm() {
		return "loginpage.jsp";
	}
	
	@RequestMapping("currentrate")
	public String hello() {
		return "indore";
	}
	
}
