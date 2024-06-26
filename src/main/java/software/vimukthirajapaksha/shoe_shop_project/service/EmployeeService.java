package software.vimukthirajapaksha.shoe_shop_project.service;

import software.vimukthirajapaksha.shoe_shop_project.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    void saveEmployee(EmployeeDTO employeeDTO);
    void deleteEmployee(String employeeId);
    EmployeeDTO getSelectedEmployee(String employeeId);
    List<EmployeeDTO> getAllEmployees();
    void updateEmployee(String employeeId,EmployeeDTO employeeDTO);
}
