package org.karma.crann.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {
	public static final long serialVersionID = 23492940340389424L;

}
