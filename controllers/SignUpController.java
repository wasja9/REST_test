package ALL.controllers;

import ALL.forms.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by asu on 24.08.2020.
 */

@Controller
public class SignUpController {
    @PostMapping("/signUp")
    public  String signUp(UserForm userForm){

    return  null;

    }
}
