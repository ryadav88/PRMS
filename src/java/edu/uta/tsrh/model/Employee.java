package edu.uta.tsrh.model;

public class Employee
{
    private int id;

    private String firstName;

    private String lastName;

    private String designation;

    public Employee()
    {
        super();
    }

    public Employee(int id, String firstName, String lastName, String designation)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getDesignation()
    {
        return designation;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    @Override
    public String toString()
    {
        return "Staff [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", designation="
            + designation + "]";
    }
}
