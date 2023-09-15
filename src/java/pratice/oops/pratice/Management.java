package java_pratice.array_examples.oops_pratice;

abstract class Managemen {
    private final int salary;
    private final String name;
    private final int experience;
    private final int employee_id;

    Managemen(String name, int salary, int experience, int employee_id) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
        this.employee_id = employee_id;
    }

    public abstract void work();

    void displayinformation() {
        System.out.println(name + " " + salary + " " + employee_id + " " + experience);
    }
}

class Manager extends Managemen {

    private final String department;

    Manager(String name, int salary, int experience, int employee_id, String department) {
        super(name, salary, experience, employee_id);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println("the manager will manage" + department);
    }
}

class Employee extends Managemen {

    private final int cabinnumber;

    Employee(String name, int salary, int experience, int employee_id, int cabinnumber) {
        super(name, salary, experience, employee_id);
        this.cabinnumber = cabinnumber;
    }

    @Override
    public void work() {
        System.out.println("the cabinnumber of employee is" + cabinnumber);
    }
}

class Intern extends Managemen {

    private final String mentor;

    Intern(String name, int salary, int employee_id, int experience, String mentor) {
        super(name, salary, employee_id, experience);
        this.mentor = mentor;
    }

    @Override
    public void work() {
        System.out.println("the mentor name is" + mentor);

    }
}

class Management {
    public static void main(String[] args) {
        Managemen s1 = new Manager("KOWSHIK", 100000, 10, 101, "it");
        Managemen s2 = new Employee("sathya", 800000, 6, 60, 8);
        Managemen s3 = new Intern("deepthi", 20000, 15, 0, "sai");
        s1.displayinformation();
        s1.work();
        s2.displayinformation();
        s2.work();
        s3.displayinformation();
        s3.work();
    }
}



