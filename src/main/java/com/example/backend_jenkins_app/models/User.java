package com.example.backend_jenkins_app.models;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "users")

public class User {

	@Id
	private int userId;
	private String userName;
	private String email;
	private String password;

	@Enumerated(EnumType.STRING)
	private String role;

	public int getUserId() {
		return this.userId;
	}

	@ManyToOne
	private Group group;

}
