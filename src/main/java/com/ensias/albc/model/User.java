package com.ensias.albc.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;
	
	@Column(name = "USERNAME", nullable = false, columnDefinition = "TEXT")
	private String username;
	
	@Column(name = "PASSWORD", nullable = false, columnDefinition = "TEXT")
	private String password;

	@Column(name = "EMAIL", nullable = false, columnDefinition = "TEXT")
	private String email;

	@Column(name = "PROFILE_PIC", nullable = false, columnDefinition = "TEXT")
	private String profilePic;

	@Column(name = "BIRTH_DATE", columnDefinition = "DATE")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate birthDate;
	
	@Column(name = "LOCATION", nullable = false, columnDefinition = "TEXT")
	private String location;
	
	@Column(name = "FIRST_NAME", nullable = false, columnDefinition = "TEXT")
	private String firstName;

	@Column(name = "MIDDLE_NAME", columnDefinition = "TEXT")
	private String middleName;
	
	@Column(name = "LAST_NAME", nullable = false, columnDefinition = "TEXT")
	private String lastName;
	
	@Column(name = "PHONE", columnDefinition = "INT")
	private int phone;
	
	@Column(name = "BIO", columnDefinition = "TEXT")
	private String bio;
	
	@Column(name = "HEADER_PIC", columnDefinition = "TEXT")
	private String headerPic;

	@Column(name = "VERIFIED", columnDefinition = "BOOLEAN")
	private boolean verified;

	@Column(name = "CREATED_AT", columnDefinition = "DATE")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate createdAt;

	@Column(name = "LANG", nullable = false, columnDefinition = "TEXT")
	private String lang;

	@Column(name = "NOTIFICATIONS", columnDefinition = "TEXT")
	private String notifications;
}
