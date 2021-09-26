package info.ravali.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import info.ravali.binding.MobileBinding;
import info.ravali.entity.Mobile;
import info.ravali.serviceimp.MobileService;

@RestController
public class MobileController {

	private MobileService mobileService;

	private MobileBinding mobileBinding;

	public MobileController(MobileService mobileService, MobileBinding mobileBinding) {
		this.mobileBinding = mobileBinding;
		this.mobileService = mobileService;
	}

	@GetMapping("/mobiles")
	public List<Mobile> getMobile(String mobile) {

		List<Mobile> searchMobile = mobileService.searchMobile(mobileBinding);
		return searchMobile;
	}

	@GetMapping("/brands/{mbrand}")
	public List<Mobile> getBrands(@PathVariable String mbrand) {
		List<Mobile> getbrands = mobileService.getbrands(mbrand);
		return getbrands;
	}

	@GetMapping("/mobileRam/{mram}")
	public List<Mobile> getMram(@PathVariable String mram) {
		List<Mobile> list = mobileService.getMram(mram);
		return list;
	}

	@GetMapping("/mobilePrice/{mprice}")
	public List<Mobile> getMprice(@PathVariable Double mprice) {
		List<Mobile> price = mobileService.getPrice(mprice);
		return price;
	}
}