package modelos;

/**
 *
 * @author gabri
 */
public class Usuario {
    private String user;
    private String password;
    private int age;

    public Usuario() {
    }

    public Usuario(String user, String password, int age) {
        this.user = user;
        this.password = password;
        this.age = age;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 11){
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return user + "|" + password;
    }
    
}
