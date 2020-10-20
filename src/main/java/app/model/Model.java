package app.model;

import app.entities.User;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();
    private List<User> model;

    private Model() {
        this.model = new ArrayList<>();
    }

    public static Model getInstance() {
        return instance;
    }

    public void add(User user) {
        model.add(user);
    }

    public boolean delete(String id) {
        return model.removeIf(user -> user.getId().equals(id));
    }

    public User getUserById(String id) {
        User user = null;
        for (User u : model) {
            if (u.getId().equals(id)){
                user=u;
                break;
            }
        }
        return user;
    }

    public List<String> list() {
        List<String> result = new ArrayList<>();
        model.forEach(user -> result.add(String.format("User name: %s ID %s", user.getName(), user.getId())));
        return result;
    }
}
