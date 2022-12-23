package me.pianorang.em.core.user.application;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import me.pianorang.em.core.user.domain.User;

@AllArgsConstructor
@NoArgsConstructor
public class UserCommand {
    private Long userId;
    private String userName;
    private String userAccount;
    private String userPassword;
    private String email;

    public UserCommand(String userName, String userAccount, String userPassword, String email) {
        this.userName = userName;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User mapToEntity() {
        return User.create(this.userName, this.userAccount, this.userPassword, this.email);
    }
}
