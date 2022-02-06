package ec.anställda;

public class Employees {
    private String name;
    private Gender gender;
    private double salary;

    public Employees(String name, Gender gender, double salary){
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public Gender getGender(){
        return gender;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return name +
//                ", gender " + gender +
                ", inkomst " + salary;
    }
}
