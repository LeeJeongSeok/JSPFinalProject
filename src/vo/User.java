package vo;

import java.sql.Timestamp;

public class User {

    int id;
    String user_id;
    String password;
    String name;
    String email;
    Timestamp create_date;
    Timestamp modified_date;

    public User() {

    }


    public User(int id, String user_id, String password, String name, String email, Timestamp create_date, Timestamp modified_date) {
        this.id = id;
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.create_date = create_date;
        this.modified_date = modified_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public Timestamp getModified_date() {
        return modified_date;
    }

    public void setModified_date(Timestamp modified_date) {
        this.modified_date = modified_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", create_date=" + create_date +
                ", modified_date=" + modified_date +
                '}';
    }
}
