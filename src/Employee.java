public class Employee {
    private static int counter = 1;
    private Integer id;
    private String firstName;
    private String surName;
    private String patronymic;
    private int department;
    private int salary;

    public Employee(String surName, String firstName, String patronymic, int department, int salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Integer getId() {
        return this.id;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: номер id {" + id +
                "};  Ф. И. О. {" + surName +
                " " + firstName + " " + patronymic +
                "}; отдел {" + department +
                "}; зарплата {" + salary + "}.";
    }
}
