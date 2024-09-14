package org.karma.crann.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "notes")
public class Note implements Serializable {
	@Serial
	private static final long serialVersionUID = 2245613874502221677L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String email, password;
	private boolean activated;

}
