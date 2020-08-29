package ALL.controllers;

import ALL.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.we


/**
 * Created by asu on 15.08.2020.
 */
@Controller
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users")
    public  String getUsersPage(ModelMap model){

        System.out.println("Hello SPRING!!!");
        //model.addAttribute("userName","Marsel");
        model.addAttribute("usersFromServer",usersRepository.findAll());
        System.out.println(usersRepository.findAll());

        return  "users";
       // return  null;

    }
}
