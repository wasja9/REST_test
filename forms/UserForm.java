package ALL.forms;

import lombok.Data;

/**
 * Created by asu on 24.08.2020.
 */
@Data
public class UserForm {
    private  String login;
    private  String password;

    private  String firstname;
    private  String lastname;
    private  String middlename;
    private  int status;
}
