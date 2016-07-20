package com.mfu.ejb;

import java.util.List;

import com.mfu.entity.Department;

public interface DepartmentService {
	public void insert(Department d);
	
	public Department findDepartmentID(long id);
	
	public List<Department> getAllDepartment();

	public void delete(long id);

	public void update(Department d);
	
	


}
