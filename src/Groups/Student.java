package Groups;


public class Student {
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String gender;
    private String groupName;


    public Student() {
    }

    public Student(int ID, String firstName, String lastName, String email, String password, String gender,String groupName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.groupName = groupName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student{\n" +
                "ID=" + ID +
                ", firstName='" + firstName + '\n' +
                ", lastName='" + lastName + '\n' +
                ", email='" + email + '\n' +
                ", password='" + password + '\n' +
                ", gender='" + gender + '\n' +

                '}';
    }
}
