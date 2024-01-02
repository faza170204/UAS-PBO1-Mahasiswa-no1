package employee;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println("Employee " + name + " sedang Bekerja: ");
    }
}

class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " sedang mengelola tugas.");
    }
}

class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Developer " + getName() + " sedang Pengembangan code.");
    }
}

class Designer extends Employee {

    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Designer " + getName() + " sedang membuat desain.");
    }
}

class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("programming");
        Manager manager = new Manager("ikhan");
        Developer developer = new Developer("Daffa");
        Designer designer = new Designer("Nopal");

        employee.work();
        manager.work();
        developer.work();
        designer.work();
    }
}