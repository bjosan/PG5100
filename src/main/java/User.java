/**
 * Created by sander on 17.09.15.
 */
public class User {
    int ID;
    String Email;
    String Password;
    String Type;

    public User (int ID, String Email, String Password, String Type){
        this.ID = ID;
        this.Email = Email;
        this.Password = Password;
        this.Type = Type;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }


}
