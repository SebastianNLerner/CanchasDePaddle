package db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Constructores")
public class Constructor {
	@Id
	@GeneratedValue
	Long codigo;
	
	@Column(length=128)
	String nombre;

	@Column(length=128)
	String docmicilio;
}
