package com.CuriousCoder.interview_practice_service.Repository;

import com.CuriousCoder.interview_practice_service.entity.Employee;
import com.CuriousCoder.interview_practice_service.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public Employee getEmployee(Integer id){
      return  new Employee("kamlesh",1,"IT","27");
    }
}
