package Com.system.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.system.entity.User;
import Com.system.service.Service;

@RestController
@RequestMapping("/user")
public class Data {
	
	@Autowired
	Service s;
	@PostMapping("/add")
	
	public User add(@RequestBody User u) {
		
		return s.saveuser(u);
		
	}
	@GetMapping("/{id}")
	public Optional<User> get(@PathVariable("id") int id) {
		return s.getUser(id);
		
	}
	
	@GetMapping("/get")
	public List<User> alluser(User u) {
		return s.alluser(u);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") int id) {
		
		s.delete(id);
		return "sucessfully deleted ";
		
	}
	
	

}
