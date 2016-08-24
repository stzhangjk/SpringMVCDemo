package DTO;

/**
 * Created by STZHANGJK on 2016/8/24.
 */
public class RegisterWorkInfoDTO {
    private String city; //所在城市
    private String job; //职位
    private String year; //工作年限

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "RegisterWorkInfoDTO{" +
                "city='" + city + '\'' +
                ", job='" + job + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
