import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Sports {
	public Sports() {
	}
	public ArrayList <Sports> sportList = new ArrayList<Sports>();
	
	public void sportData(Sports sportList) throws Exception{
		File file = new File("sport.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			String sportID = sc.next();
			String sportName = sc.next();
			Integer sportCalorie = sc.nextInt();
			sportList.addSport(sportID,sportName,sportCalorie);
		}
		}
	
	
	
	String sportID;
	String sportName;
	Integer sportCalorie;
	public Sports(String sportID, String sportName, Integer sportCalorie) {
		this.sportID = sportID;
		this.sportName = sportName;
		this.sportCalorie = sportCalorie;}
	
	
	
	public void addSport(String sportID, String sportName, Integer sportCalorie) {
		sportList.add(new Sports(sportID, sportName,sportCalorie));		
	}
	
	public String getSportID() {
		return sportID;
	}
	public void setSportID(String sportID) {
		this.sportID = sportID;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	public Integer getSportCalorie() {
		return sportCalorie;
	}
	public void setSportCalorie(Integer sportCalorie) {
		this.sportCalorie = sportCalorie;
	}
	
	
	public ArrayList<Sports> getSports(){
		return sportList;
	}
	

}


