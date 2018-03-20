package abhi.test.login;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
  
@Controller  
public class HelloWorldController {  
      
    @RequestMapping("/hello")  
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res) {  
        String name=request.getParameter("name").toUpperCase();  
        String password=request.getParameter("password");  
          
        if(password.equals("admin")){  
        String message = "Hello <b>&nbsp Mr. "+name+"</b>";  
        //Jsp page name and passing parameter
        return new ModelAndView("loginPage", "message", message);  
        }  
        else{  
            return new ModelAndView("errorPage", "message","Sorry, username or password error");  
        }  
    }  
      
}  