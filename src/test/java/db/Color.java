package db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Colores")
public class Color {
	@Id
	@GeneratedValue
	Long id;
	
	@Column(length = 128)
	String detalle;

}
