/**
 * Created by sander on 17.09.15.
 */
public class User {
    int id;
    String email;
    String password;
    String type;


    public User (int id, String email, String password, String type){
        this.id = id;
        this.email = email;
        this.password = password;
        this.type = type;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id == user.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        email = email;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        password = password;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        type = type;
    }


}
