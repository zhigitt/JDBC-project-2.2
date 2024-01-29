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

//        Employee
//        employeeService.createEmployee();
//        employeeService.addEmployee(new Employee("Mirlan", "Arstanbekov", 20, "mirlan@gmail.com", 1));
//        employeeService.addEmployee(new Employee("Aliaskar", "Temirbekov", 20, "ali@gmail.com", 1));
//        employeeService.addEmployee(new Employee("Nurgazy", "Temiraliev", 20, "nur@gmail.com", 1));
//        System.out.println(employeeService.getEmployeeById(1L));
//        System.out.println(employeeService.getAllEmployees());
//        System.out.println(employeeService.getEmployeeByPosition("Mentor"));
//        System.out.println(employeeService.findByEmail("nuke@gmail.com"));
//        employeeService.updateEmployee(1L, new Employee("Nuk", "Muk", 29, "n@gmail.com", 1));
//        employeeService.cleanTable();

//        employeeService.dropTable();


        //JOBs
//        jobService.createJobTable();
//        jobService.addJob(new Job("Instructor", "C", "back", 3));
//        jobService.addJob(new Job("Mentor", "C", "front", 3));
//        System.out.println(jobService.getJobByEmployeeId(9L));
//        System.out.println(jobService.getJobById(1L));
//        System.out.println(jobService.sortByExperience("asc"));
//        jobService.deleteDescriptionColumn();
    }
}
