package DTO;

/**
 * Created by STZHANGJK on 2016/8/23.
 */
public class RegisterBaseInfoDTO {
    private String username;
    private String password;
    private String pswConfirm;
    private String city;
    private RegisterSchoolInfoDTO schoolInfo;
    private RegisterWorkInfoDTO workInfo;

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

    public RegisterSchoolInfoDTO getSchoolInfo() {
        return schoolInfo;
    }

    public void setSchoolInfo(RegisterSchoolInfoDTO schoolInfo) {
        this.schoolInfo = schoolInfo;
    }

    public RegisterWorkInfoDTO getWorkInfo() {
        return workInfo;
    }

    public void setWorkInfo(RegisterWorkInfoDTO workInfo) {
        this.workInfo = workInfo;
    }


    @Override
    public String toString() {
        return "RegisterBaseInfoDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", pswConfirm='" + pswConfirm + '\'' +
                ", city='" + city + '\'' +
                ", schoolInfo=" + schoolInfo +
                ", workInfo=" + workInfo +
                '}';
    }
}
