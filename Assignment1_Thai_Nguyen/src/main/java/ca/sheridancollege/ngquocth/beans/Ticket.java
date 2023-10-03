package ca.sheridancollege.ngquocth.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ticket {

	private String name, email, phone, date, address;
	private int quantity;
	private String price;
	
	private String prices[]= {"$150", "$250 (with a hotel room)", 
							"$350 (with a hotel room + a trip)", 
							"$450 (Full services)"};
	
}
