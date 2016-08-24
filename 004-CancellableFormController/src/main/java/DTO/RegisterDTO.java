package DTO;

/**
 * Created by STZHANGJK on 2016/8/23.
 */
public class RegisterDTO {
    private String username;
    private String password;
    private String pswConfirm;
    private String city;

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

    public String getPswConfirm() {
        return pswConfirm;
    }

    public void setPswConfirm(String pswConfirm) {
        this.pswConfirm = pswConfirm;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "RegisterDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", pswConfirm='" + pswConfirm + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
