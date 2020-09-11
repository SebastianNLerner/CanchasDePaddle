package db;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Reservas")
public class Reserva implements Serializable{
	@Id
	Calendar inicio_partido;

	@Id
	Calendar fin_partido;

	@Id
	@ManyToOne
	Cancha cancha;

	@ManyToOne
	Jugador JugResponable;
}
