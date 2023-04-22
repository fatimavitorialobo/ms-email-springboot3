package com.ms.msemail.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class EmailDto {
	
	@Getter
	@Setter
	@NotBlank
	private String ownerRef;
	
	@Getter
	@Setter
	@NotBlank
	@Email
	private String emailFrom;
	
	@Getter
	@Setter
	@NotBlank
	@Email
	private String emailTo;
	
	@Getter
	@Setter
	@NotBlank
	private String subject;
	
	@Getter
	@Setter
	@NotBlank
	private String text;

}
