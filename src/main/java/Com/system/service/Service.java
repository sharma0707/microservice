package Com.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Com.system.entity.User;
import Com.system.repo.Repository;

@org.springframework.stereotype.Service

public class Service {
	
	@Autowired
	Repository rep;
	
	public User saveuser(User u) {
		return rep.save(u);
		
	}
	
	public Optional<User> getUser(int id) {
		return rep.findById(id);
				
	}
	public List<User> alluser(User u) {
		return rep.findAll();
		
	}
	
	public void delete(int id){
		System.out.println("deleted sucessfully");
		 rep.deleteById(id);
		 
	}

}
