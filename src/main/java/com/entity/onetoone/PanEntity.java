package com.entity.onetoone;

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
@Table(name = "pan")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PanEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer panId;
	String panNum;
	String address;

	// fk
	// pan->citizen
	@OneToOne
	@JoinColumn(name = "citizenId")
	CitizenEntity citizen;
	//citizen_citizen_id
}


//one to many 
