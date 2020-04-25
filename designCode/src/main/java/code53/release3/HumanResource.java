package code53.release3;

public abstract class HumanResource {
    public long id;
    public double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId(){
        return id;
    }

    public abstract double calculateSalary();
}
