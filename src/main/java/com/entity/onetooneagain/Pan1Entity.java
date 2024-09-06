package com.entity.onetooneagain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "pan1")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pan1Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer panId;
	String panNum;
	String address;
	String state;
	boolean status;

	@OneToOne // fk self
	@JoinColumn(name = "citizenId")
	Citizen1Entity citizen;

}
