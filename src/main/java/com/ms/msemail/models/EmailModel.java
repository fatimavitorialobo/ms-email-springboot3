package com.ms.msemail.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.ms.msemail.enums.StatusEmail;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@EqualsAndHashCode.Include
	private Long id;

	@Getter
	@Setter
	private String ownerRef;

	@Getter
	@Setter
	private String emailFrom;

	@Getter
	@Setter
	private String emailTo;

	@Getter
	@Setter
	private String subject;

	@Column(columnDefinition = "TEXT")
	@Getter
	@Setter
	private String text;

	@Getter
	@Setter
	private LocalDateTime sendDateEmail;

	@Getter
	@Setter
	private StatusEmail statusEmail;

}
