package Week4.Day13.Assignment;

public class Employee {
    int emp_id;
    String emp_name;
    String emp_address;
    int emp_sal;

    public Employee(int emp_id, String emp_name, String emp_address, int emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_sal = emp_sal;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_address='" + emp_address + '\'' +
                ", emp_sal=" + emp_sal +
                '}';
    }


}

class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Before reinitializing :: ");
        System.out.println(employee);


        employee = new Employee(1,"Ashraf","Jalgaon",45190);
        System.out.println("After reinitializing :: ");
        System.out.println(employee);
    }
}

/*

Before reinitializing ::
Employee{emp_id=0, emp_name='null', emp_address='null', emp_sal=0}

After reinitializing ::
Employee{emp_id=1, emp_name='Ashraf', emp_address='Jalgaon', emp_sal=45190}


* */