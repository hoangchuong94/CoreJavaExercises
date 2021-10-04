package model;
public class Account {
    private  String username ;
    private  String password ;
    private  Integer role;

    public Account() {
    }

    public Account(String username, String password, Integer role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", permission=" + role +
                '}';
    }

    public String toStringCsv() {
        return username + ";" + password + ";" + role + "\n";
    }
}
