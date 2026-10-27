package com.CuriousCoder.interview_practice_service.services;

import com.CuriousCoder.interview_practice_service.Repository.EmployeeRepository;
import com.CuriousCoder.interview_practice_service.dto.EmployeeDTO;
import com.CuriousCoder.interview_practice_service.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeDTO getEmployee(Integer id){
      Employee employee =  employeeRepository.getEmployee(id);
        EmployeeDTO employeeDTO = new EmployeeDTO();
      return EmployeeDTO.fromEntity(employee);
    }
}
