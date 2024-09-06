package com.entity.onetooneagain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "citizen1")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Citizen1Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer citizenId;
	String firstName;
	String lastName;
	String gender;

}
