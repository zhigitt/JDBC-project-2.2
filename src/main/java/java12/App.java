package java12;

import java12.config.JdbcConfig;
import java12.models.Employee;
import java12.models.Job;
import service.EmployeeService;
import service.JobService;
import service.impl.EmployeeImpl;
import service.impl.JobImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        JobService jobService = new JobImpl();
        EmployeeService employeeService = new EmployeeImpl();

        //Connected
//        JdbcConfig.getConnection();

        //Create table
//        jobService.createJobTable();
//        employeeService.createEmployee();

        //Add
//        jobService.addJob(new Job("Mentor", "Java", "Backend developer", 1));
//        jobService.addJob(new Job("Management", "JavaScript", "Fronted developer", 3));
//        jobService.addJob(new Job("Instructor", "JavaScript", "Backend developer", 5));

//        employeeService.addEmployee(new Employee("Mirlan", "Arstanbekov", 20, "mirlan@gmail.com", 1));
//        employeeService.addEmployee(new Employee("Aliaskar", "Temirbekov", 20, "ali@gmail.com", 2));
//        employeeService.addEmployee(new Employee("Nurgazy", "Temiraliev", 20, "nur@gmail.com", 3));


        //Get by id
//        System.out.println(jobService.getJobByEmployeeId(1L));
//        System.out.println(employeeService.getEmployeeById(1L));
//        System.out.println(jobService.getJobById(1L));
//        System.out.println(employeeService.getAllEmployees());


//        System.out.println(employeeService.getEmployeeByPosition("Mentor"));

        //

    }
}
