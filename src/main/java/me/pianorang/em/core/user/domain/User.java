package me.pianorang.em.core.user.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="T_USER")
@Access(AccessType.FIELD)
public class User {

    private User() {
    }
    private User(String userName, String userAccount, String userPassword) {
        this.userName = userName;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String userAccount;
    private String userPassword;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public static User create(String userName, String userAccount, String userPassword){
        return new User(userName, userAccount, userPassword);
    }
}
