package com.cognizant.auth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Pratik, Shubham, Pratik, Kavya
 * 
 * 		model class for user details
 * 
 * 		@Entity indicates Spring Data JPA that it is an entity class for the
 *      application
 *   
 *
 */
@Getter
@Setter
@Entity(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

	/**
	 * instance variables
	 * 
	 * @Id helps in defining the primary key
	 */
	
	@Id
	@Column(name = "userid", length = 20)
	private String userid;

	@Column(name = "upassword", length = 20)
	private String upassword;

	@Column(name = "uname", length = 20)
	private String uname;

	private String authToken;
}
