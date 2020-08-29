package ALL.services;

import ALL.forms.UserForm;
import ALL.models.US_LG;
import ALL.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by wasja on 24.08.2020.
 */
@Service
public class SignUpServiceImpl implements SignUpService {
    @Autowired
   private UsersRepository usersRepository;
    //@Autowired
    //public SignUpServiceImpl(UsersRepository usersRepository){
    //    this.usersRepository=usersRepository;
   // }
@Autowired
private PasswordEncoder passwordEncoder;
    @Override
    public void signUp(UserForm userForm) {
        String hashPassword = passwordEncoder.encode(userForm.getP);
//users usu=users.bi
        US_LG user= US_LG.
                .firstname("userForm.getFirstname()")
                .lastname(userForm.getLastname())
                .hashPassword(hashPassword)
                .login(userForm.getLogin())
                .role(Mode.USER)
                .s(userForm.getFirstname())
    }
}
