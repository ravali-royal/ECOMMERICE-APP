package info.ravali.serviceimp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.ravali.binding.MobileBinding;
import info.ravali.entity.Mobile;
import info.ravali.repository.MobileRepo;
import info.ravali.service.ServiceInterface;

@Service
public class MobileService implements ServiceInterface {
	@Autowired
	private MobileRepo mobileRepo;

	@Override
	public List<Mobile> searchMobile(MobileBinding mobileBinding) {
		Mobile mobile = new Mobile();
		BeanUtils.copyProperties(mobileBinding, mobile);
		List<Mobile> findAll = mobileRepo.findAll();
		return findAll;
	}

	@Override
	public List<Mobile> getbrands(String mbrand) {
		List<Mobile> findBymbrand = mobileRepo.findBymbrand(mbrand);
		if (findBymbrand != null) {
			return findBymbrand;
		}
		return null;
	}

	@Override
	public List<Mobile> getMram(String mram) {
		List<Mobile> findBymram = mobileRepo.findBymram(mram);
		return findBymram;
	}

	@Override
	public List<Mobile> getPrice(Double mprice) {
		//List<Mobile> listofprice = mobileRepo.findAll();
		//List<Mobile> price18=listofprice.stream().filter((i)->i.getMprice()<=mprice).collect(Collectors.toList());
		List<Mobile> listofprice = mobileRepo.findBympriceIsLessThanEqual(mprice);
		//return price18;
		return listofprice;
	}

}
