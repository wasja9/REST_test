package ALL.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wasja on 19.08.2020.
 */

@Controller
public class LoginController {
    @GetMapping("/login")
    public String getLoginPage(ModelMap model, HttpServletRequest request){
        if (request.getParameterMap().containsKey("error")) //Если страница содержала ошибку
        {
            model.addAttribute("error",true);
        }
        return "login";
    }
}
