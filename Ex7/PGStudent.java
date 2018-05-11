import java.util.Date;
public class PGStudent extends Student{
	private String ugDegree;
	private Date dateOfJoining;
	
	public boolean equals(Object othr){
		if(super.equals(othr)){
			PGStudent temp = (PGStudent)othr;
			return	temp.ugDegree.equals(ugDegree) &&
					temp.dateOfJoining.equals(dateOfJoining);
		}
		else
			return false;
	}

	public PGStudent(int no,String name,int []arr,String deg,Date joining_date){
		super(no,name,arr);
		this.ugDegree = deg;
		this.dateOfJoining = joining_date;
	}

	public String toString(){
		
		return "[ " + super.toString()  + "\nUg Degree : " + ugDegree + "\n Date Of Joining" + dateOfJoining;
	}
	
}	
