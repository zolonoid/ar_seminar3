package SRP;

import java.util.HashMap;

public class UserDataStorage {
    private HashMap<Integer, String> userData;

    public UserDataStorage() {
        userData = new HashMap<>();
    }

    public void saveUser(User user) {
        userData.put(user.getId(), user.getName());
    }

    public User loadUser(int id) {
        return new User(id, userData.get(id));
    }
}
