package info.ravali.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="MOBILE_TABLE")
@Data
public class Mobile {
	@Id
	@Column(name="MOBILE_ID")
	private Integer mid;
	@Column(name="MOBILE_BRAND")
	private String mbrand;
	@Column(name="MOBILE_RAM")
	private String mram;
	@Column(name="MOBILE_PRICE")
	private Double mprice;
	
}
