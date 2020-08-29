package ALL.services;

import ALL.forms.UserForm;
import ALL.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by asu on 24.08.2020.
 */

public interface SignUpService {

   void signUp(UserForm userForm);


}

