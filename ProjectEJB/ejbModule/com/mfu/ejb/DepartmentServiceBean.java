package com.mfu.ejb;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.Department;

@Stateless
@Remote(DepartmentService.class)
public class DepartmentServiceBean implements DepartmentService {
	
	@PersistenceContext(unitName = "myDatabase") //™◊ËÕ‡∫    ∑¥≈Õßßßßß
	EntityManager em;

	@Override
	public void insert(Department d) {
		// TODO Auto-generated method stub
		em.persist(d);
	}
	@Override
	public Department findDepartmentID(long id) {
		// TODO Auto-generated method stub
		return em.find(Department.class, id);
	}
	@Override
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT x FROM Department x").getResultList();
	}
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		Department department = findDepartmentID(id);
		if (department != null) {
			em.remove(department);
		}
	}
	@Override
	public void update(Department d) {
		// TODO Auto-generated method stub
		em.merge(d);
	}

}
