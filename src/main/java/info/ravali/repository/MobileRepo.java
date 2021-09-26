package info.ravali.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import info.ravali.entity.Mobile;

public interface MobileRepo extends JpaRepository<Mobile, Serializable> {
	
	public List<Mobile> findBymbrand(String mbrand);
	
	public List<Mobile> findBymram(String mram);
	
	public List<Mobile> findBymprice(Double mprice);
	
	public List<Mobile> findBympriceIsLessThanEqual(Double mprice);

	
	

}
