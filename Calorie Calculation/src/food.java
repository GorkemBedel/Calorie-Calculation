import java.util.*;
import java.io.*;


public class food {
	public food() {
		
	}
	ArrayList<food> foodList = new ArrayList<>();
	
	
	public void foodData(food foodList) throws Exception{
	File file = new File("food.txt");
	Scanner sc = new Scanner(file);
	while(sc.hasNext()) {
		String foodID = sc.next();
		String foodName = sc.next();
		Integer foodCalorie = sc.nextInt();
		foodList.addFood(foodID,foodName,foodCalorie);
		}	
		}



	
	
	String foodID;
	String foodName;
	Integer foodCalorie;
	public food(String foodID, String foodName, Integer foodCalorie) {
		this.foodID = foodID;
		this.foodName = foodName;
		this.foodCalorie = foodCalorie;
	
	}
	public void addFood(String foodID, String foodName, Integer foodCalorie) {
		foodList.add(new food(foodID, foodName, foodCalorie));}	
	
	public String getFoodID() {
		return foodID;
	}
	public void setFoodID(String foodID) {
		this.foodID = foodID;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public Integer getFoodCalorie() {
		return foodCalorie;
	}
	public void setFoodCalorie(Integer foodCalorie) {
		this.foodCalorie = foodCalorie;
	}
	public ArrayList <food> getFoods(){
		return foodList;
	}
}


/*class foods{
	String foodID;
	String foodName;
	Integer foodCalorie;
	public foods(String foodID, String foodName, Integer foodCalorie) {
		this.foodID = foodID;
		this.foodName = foodName;
		this.foodCalorie = foodCalorie;
		
	}
	public String getFoodID() {
		return foodID;
	}
	public void setFoodID(String foodID) {
		this.foodID = foodID;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public Integer getFoodCalorie() {
		return foodCalorie;
	}
	public void setFoodCalorie(Integer foodCalorie) {
		this.foodCalorie = foodCalorie;
	}
	
}*/
	

