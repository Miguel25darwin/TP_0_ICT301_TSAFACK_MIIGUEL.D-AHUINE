interface Employee {
    double calculateSalary();
}

class FullTimeEmployee implements Employee {
    public double calculateSalary() {
        return 500000;
    }
}

class PartTimeEmployee implements Employee {
    public double calculateSalary() {
        return 300000;
    }
}

public class SalaryCalculator {
    public double calculate(Employee employee) {
        return employee.calculateSalary();
    }
}
