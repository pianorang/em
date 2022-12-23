package me.pianorang.em.core.user.domain;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;


@Entity
@Table(name="T_USER")
@Access(AccessType.FIELD)
public class User {

    private User() {
    }
    private User(String userName, String userAccount, String userPassword, String email) {
        this.userName = userName;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userName;
    private String userAccount;
    private String userPassword;
    private String email;

    public Long getId() {
        return userId;
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

    public static User create(String userName, String userAccount, String userPassword, String email){
        return new User(userName, userAccount, userPassword, email);
    }
}
