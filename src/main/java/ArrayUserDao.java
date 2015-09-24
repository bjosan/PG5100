import java.util.ArrayList;
import java.util.List;

public class ArrayUserDao implements UserInterface{
    private List<User> users = new ArrayList<User>();


    @Override
    public void create(User u) {
       users.add(u);
    }

    @Override
    public void update(User u) {
            users.equals(u);
            users.remove(u);
            users.add(u);
    }

    @Override
    public User getUser(int id) {
        for( User user : users){
            if(user.getid()==id){
                return user;
            }
        }
        return null;
    }

    @Override
    public List getAllUsers() {
        for(User user : users){
            return users;
        }
        return null;
    }

    @Override
    public void deleteUser(int id) {
        
    }
}