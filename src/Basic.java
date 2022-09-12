import java.util.Arrays;

public class Basic {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee firstPers = new Employee("Tagirova", "Azaliya", "Azamatovana", 3, 54800);
        Employee secondPers = new Employee("Tagirova", "Azaliya", "Azamatovana", 3, 54800);
        Employee thirdPers = new Employee("Tagirova", "Azaliya", "Azamatovana", 3, 54800);
        Employee fourthPers = new Employee("Tagirova", "Azaliya", "Azamatovana", 3, 54800);
        Employee fifthPers = new Employee("Tagirova", "Azaliya", "Azamatovana", 3, 54800);
        Employee sixthPers = new Employee("Tagirova", "Azaliya", "Azamatovana", 3, 54800);
        Employee seventhPers = new Employee("Tagirova", "Azaliya", "Azamatovana", 3, 54800);
        Employee eighthPers = new Employee("Tagirova", "Azaliya", "Azamatovana", 3, 54800);
        Employee ninthPers = new Employee("Tagirova", "Azaliya", "Azamatovana", 3, 54800);
        Employee tenthPers = new Employee("Tagirova", "Azaliya", "Azamatovana", 3, 54800);

        employees[0] = firstPers;
        employees[1] = secondPers;
        employees[2] = thirdPers;
        employees[3] = fourthPers;
        employees[4] = fifthPers;
        employees[5] = sixthPers;
        employees[6] = seventhPers;
        employees[7] = eighthPers;
        employees[8] = ninthPers;
        employees[9] = tenthPers;

        Employee[] pers = Arrays.copyOf(employees, 10);

        Arrays.stream(pers).forEach(System.out::println);
        System.out.println(pers.length);
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateSumSalaryCostsPerMonth() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee max = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                max = employee;
            }
        }
        return max;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee min = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                min = employee;
            }
        }
        return min;
    }

    public static double calculateAverageSalary() {
        int sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
                sum += employee.getSalary();
            }
        }
        return (double) sum / count;
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
