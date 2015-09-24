import java.util.List;

public interface UserInterface {
    public void create(User u);
    public void update(User u);
    public User getUser(int id);
    public List getAllUsers();
    public void deleteUser(int id);
}
