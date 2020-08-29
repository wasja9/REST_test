package ALL.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "us")


public class US {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_US;
        //
        //@Column(name = "login")
        private String login;
        //
       // @Column(name = "password")
        private String password;
        //
      //  @Column(name = "firstname")
        private String firstname;
        //
     //   @Column(name = "lastname")
        private String lastname;
        //
     //   @Column(name = "middlename")
        private String middlename;
        //
    //    @Column(name = "status")
        private int status;




    //public US_(String iRf, String s, String ira, String ira1, String ira2, int i) {}




    }