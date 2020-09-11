package db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Paletas")
public class Paleta {
	@Id
	@GeneratedValue
	Long codigo;
	
	@Column(length=128)
	String nombre;

	int grosor;

	@ManyToOne
	Color color;

	@ManyToOne
	Constructor constructor;
}
