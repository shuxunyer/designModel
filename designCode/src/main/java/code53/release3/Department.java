package code53.release3;

import java.util.ArrayList;
import java.util.List;

public class Department extends HumanResource {
    public List<HumanResource> subNodes = new ArrayList<HumanResource>();

    public Department(long id) {
        super(id);
    }

    @Override
    public double calculateSalary() {
        double sumSalary = 0;
        for (HumanResource employeeOrDepartment : subNodes) {
            sumSalary += employeeOrDepartment.calculateSalary();
        }
        this.salary = sumSalary;
        return sumSalary;
    }

    public void addSubNode(HumanResource humanResource) {
        subNodes.add(humanResource);
    }
}
