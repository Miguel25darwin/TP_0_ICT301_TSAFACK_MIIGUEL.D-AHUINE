public class SalaryCalculator {

    public double calculateSalary(String employeeType) {
        if (employeeType.equals("FULL_TIME")) {
            return 500000;
        } else if (employeeType.equals("PART_TIME")) {
            return 300000;
        }
        return 0;
    }
}
