package basic;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    public static void main(String[] args) {
        List <Employee> emps = new ArrayList<Employee> ( );
        printEmployees(emps);
    }

    private static void printEmployees(List<Employee> emps)
    {
        for(int i = 0 ; i < emps.size() ; i++) {
            if(emps.get(i).firstName.equals("Roger"))
            {
                System.out.println(emps.get(i).firstName);
            }
        }
    }
}
