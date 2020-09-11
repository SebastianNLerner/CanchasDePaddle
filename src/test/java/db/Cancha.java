package db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Canchas")
public class Cancha {
	@Id
	@GeneratedValue
	Long id;
	
	@Column(length = 128)
	String nombre;
	
	boolean esta_iluminada;
	
	@ManyToOne
	Color color;

}
