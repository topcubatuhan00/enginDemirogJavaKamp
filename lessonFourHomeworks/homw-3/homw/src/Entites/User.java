package Entites;

public class User {

    private String name;
    private String lastName;
    private String nationalityId;
    private int yearOfBirth;

    public User(String name, String lastName, String nationalityId, int yearOfBirth){
        this.name = name;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() { return name;}
    public void setName(String name) { this.name = name;}
    public String getLastName() { return lastName;}
    public void setLastName(String lastName) { this.lastName = lastName;}
    public String getNationalityId() { return nationalityId;}
    public void setNationalityId( String nationalityId) { this.nationalityId = nationalityId;}
    public int getYearOfBirth() { return yearOfBirth;}
    public void setYearOfBirth(int yearOfBirth) { this.yearOfBirth = yearOfBirth;}
}
