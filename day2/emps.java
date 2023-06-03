import java.util.ArrayList;
import java.util.List;

class emp1 implements empIn {

    @Override
    public void role() {
        System.out.println("Trainer");
    }

    @Override
    public void salary() {
        System.out.println("10000");
    }
}

class emp2 implements empIn {

    @Override
    public void role() {
        System.out.println("Developer");
    }

    @Override
    public void salary() {
        System.out.println("20000");
    }   
}

public class emps {
    @FunctionalInterface
    interface in {
        void work();
    }
    public static empIn createEmp(String role, String salary) {
        return new empIn() {
            @Override
            public void role() {
                System.out.println("Role : " + role);
            }

            @Override
            public void salary() {
                System.out.println("Salary : " + salary);
            }
        };
    }
    public static void main(String[] args) {
        List<empIn> eList = new ArrayList<>();
        
        empIn e1 = createEmp("Developer", "300000");
        empIn e2 = createEmp("Trainer", "12345");
        empIn e3 = createEmp("Project Manager", "0000");
        
        eList.add(e1);
        eList.add(e2);
        eList.add(e3);

        eList.forEach(e -> {
            e.role();
            e.salary();
        });

        // eList.forEach(System.out::println);
    }
    
}
