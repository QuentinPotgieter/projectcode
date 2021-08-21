public class User {
    private int id, roleId;
    private String name, surname, password;

    public User() {
        this(0, "", "", "", 0);
    }

    public User(int id, String name, String surname, String password, int roleId) {
        setUser(id, name, surname, password, roleId);
    }

    private void setUser(int id, String name, String surname, String password, int roleId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.roleId = roleId;
    }

    private int getId() {
        return id;
    }

    private String getName() {
        return name;
    }

    private String getSurname() {
        return surname;
    }

    private int getRoleId() {
        return roleId;
    }

    @Override
    public String toString() {
        return "User: (" + getId() + ", " + getName() + ", " + getSurname() + ", " + getRoleId() + ")";
    }

}
