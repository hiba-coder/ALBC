package com.ensias.albc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RELATION")
public class Relation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRelation;
	
	@Column(name = "ID_FOLLOWER", nullable = false, columnDefinition = "INT")
	private int idFollower;
	
	@Column(name = "ID_FOLLOWED", nullable = false, columnDefinition = "INT")
	private int idFollowed;
}
