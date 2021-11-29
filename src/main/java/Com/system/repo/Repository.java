package Com.system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.system.entity.User;
@org.springframework.stereotype.Repository

public interface Repository extends JpaRepository<User, Integer>{
	

}
