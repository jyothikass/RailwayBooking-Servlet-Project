package dto;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class TrainTicket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int trainNumber;
	String from;
	String to;
	int numberOfSeats;
	double amount;
	Date dateOfBooking;
	Date dateOfJourney;
	
	@ManyToOne
	User user;
}
