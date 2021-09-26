package info.ravali.binding;

import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
public class MobileBinding {
	private String mbrand;
	private String mram;
	private Double mprice;
}
