package entities;

import java.util.Objects;

public class User {

    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User users)) return false;
        return Objects.equals(userName, users.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }
}
