import java.io.*;
import java.util.*;

public class People {
	public People() {
		
	}
	ArrayList<People> PeopleList = new ArrayList<>();
	
		
	public void peopleData(People PeopleList) throws Exception{
		File file = new File("people.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			String ID = sc.next();
			String name  = sc.next();
			String gender = sc.next();
			Integer weight = sc.nextInt();
			Integer height = sc.nextInt();
			Integer age = 2022-(sc.nextInt());
			PeopleList.addPeople(ID, name, gender, weight, height, age);
			}			
			}
	
	String ID;
	String name;
	String gender;
	Integer weight;
	Integer height;
	Integer age;
	Integer currentCalorie = 0;
	Integer CalorieTaken = 0;
	Integer CalorieGiven = 0;
	Integer dailyCalorieNeeds = 0;
	public People (String ID, String name,String gender, int weight, int height, int birthyear) throws Exception {
		this.ID = ID;
		this.name = name;
		this.gender = gender;
			/*if(gender == "male") {
				this.gender = "male";}
			else if(gender == "female") {
				this.gender = "female";	}	*/
		this.weight = weight;
		this.height = height;
		this.age = (2022-birthyear);
		this.dailyCalorieNeeds();		
	}
	
	
	public void addPeople(String ID, String name, String gender, Integer weight, Integer height, Integer birthYear) throws Exception {
		PeopleList.add(new People(ID, name, gender, weight, height, birthYear));}
	
	
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getCurrentCalorie() {
		return currentCalorie;
	}
	public void setCurrentCalorie(Integer currentCalorie) {
		this.currentCalorie = currentCalorie;
	}
	public Integer getCalorieTaken() {
		return CalorieTaken;
	}
	public void setCalorieTaken(Integer calorieTaken) {
		CalorieTaken = calorieTaken;
	}
	public Integer getCalorieGiven() {
		return CalorieGiven;
	}
	public void setCalorieGiven(Integer calorieGiven) {
		CalorieGiven = calorieGiven;
	}
	public Integer getDailyCalorieNeeds() {
		return dailyCalorieNeeds;
	}
	/*public void setDailyCalorieNeeds(Integer dailyCalorieNeeds) {
		this.dailyCalorieNeeds = dailyCalorieNeeds;
	}*/
	
	private void dailyCalorieNeeds() {
		if (this.gender.equals("male")) {
			double CalorieMale = (66 + (13.75 * this.weight) + (5 * this.height) - (6.8 * (2022-(this.age))));
	        this.dailyCalorieNeeds += (int) Math.round(CalorieMale);}
		
	    else if(this.gender.equals("female")) {
	        double CalorieFemale = (665 + (9.6 * this.weight) + (1.7 * this.height) - (4.7 * (2022-(this.age))));
	        this.dailyCalorieNeeds += (int) Math.round(CalorieFemale);}
	        }
		
	
	public void takeCalorie(Integer calorie) {
		this.currentCalorie += calorie;
		this.CalorieTaken += calorie;
	}
		
	
	public void giveCalorie(Integer calorie) {
		this.currentCalorie -= calorie;
		this.CalorieGiven += calorie;
	}
	
	
	
	
	
	public ArrayList<People> getPeople(){
		return PeopleList;
	}
}
		
		
		
	
	
	


	
	
	
	
	

	

	
	
	
		

