package app.entities;


public class User {
    private String name;
    private String password;
    String id;

    public User() {
    }

    public User(String name, String password, String id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getName() != null ? !getName().equals(user.getName()) : user.getName() != null) return false;
        if (getPassword() != null ? !getPassword().equals(user.getPassword()) : user.getPassword() != null)
            return false;
        return getId() != null ? getId().equals(user.getId()) : user.getId() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        return result;
    }
}
