package Streams;

import java.util.Iterator;

public class IterateurDirectionLycee implements Iterator <EmployeLycee> {

	private DirectionLycee browsDirection;
	private int mmbrReturned = 0;
	public IterateurDirectionLycee(DirectionLycee browsDirection) {
		this.browsDirection = browsDirection;
	}
	@Override
	public boolean hasNext() {
		
		return mmbrReturned<5;
	}
	@Override
	public EmployeLycee next() {
				
	//switch methos to brows into the Employees need to use the method done en cours!
		
		
		switch (mmbrReturned) {
		case 0:
			mmbrReturned ++;
			return browsDirection.getProviseur();
			
			//browsDirection.getProviseur();
			//break;
		case 1:
			mmbrReturned ++;
			return browsDirection.getProviseurAdjoint();
			//break;
		case 2:
			mmbrReturned++;
			return browsDirection.getGestionnaire();
			//break;
		case 3:
			mmbrReturned++;
			return browsDirection.getConseillerPrincipaldEducation();
			//break;
		case 4:
			mmbrReturned++;
			return browsDirection.getChefDeTravaux();
			//break;
		
			 
		}

		return null;
		
	}
	
	
}
