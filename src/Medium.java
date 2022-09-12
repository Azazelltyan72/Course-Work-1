public class Medium {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
    }

    public static void increaseSalary(int percent) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
        }
    }

    public static int calculateSumSalaryCostsPerMonthOfDepartment(int departmentNum) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() == departmentNum) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeOfDepartmentWithMaxSalary(int departmentNum) {
        int maxSalary = Integer.MIN_VALUE;
        Employee max = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != departmentNum) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                max = employee;
            }
        }
        return max;
    }

    public static Employee findEmployeeOfDepartmentWithMinSalary(int departmentNum) {
        int minSalary = Integer.MAX_VALUE;
        Employee min = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != departmentNum) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                min = employee;
            }
        }
        return min;
    }

    public static double calculateAverageSalaryOfDepartment(int departmentNum) {
        int sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNum) {
                count++;
                sum += employee.getSalary();
            }
        }
        return (double) sum / count;
    }

    public static void increaseSalaryOfDepartment(int percent, int departmentNum) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNum) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }

    public static void printDepartment(int departmentNum) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentNum) {
            System.out.println(employee);
            }
        }
    }

    public static void printEmployeesWithLessThanSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee);
            }
        }
    }
    public static void printEmployeesWithMoreOrEqualThanSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employee);
            }
        }
    }
}

