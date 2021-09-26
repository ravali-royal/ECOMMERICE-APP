package info.ravali.service;

import java.util.List;

import info.ravali.binding.MobileBinding;
import info.ravali.entity.Mobile;

public interface ServiceInterface {

	public List<Mobile> searchMobile(MobileBinding mobileBinding);
	
	public List<Mobile> getbrands(String mbrand);	
	
	public List<Mobile> getMram(String mram);
	
	public List<Mobile> getPrice(Double mprice);
}
