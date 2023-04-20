import java.io.*;
import java.util.*;


public class Main {	

	public static void main(String[] args) throws Exception {

		try {
			PrintWriter outputStream = new PrintWriter("monitoring.txt");

			ArrayList<String> printWarnArray = new ArrayList<>();		
			ArrayList<String> givenPeopleIDArray = new ArrayList<>();
			

			
			
			People people = new People();
			Sports sports = new Sports();
			food food = new food();
			food.foodData(food);
			people.peopleData(people);
			sports.sportData(sports);
										
			File commands = new File("command.txt"); // command.txt
			Scanner sc = new Scanner(commands);
			while(sc.hasNext()) {
				String command = sc.nextLine();
				String [] commandArray = command.split("\t");
				
				
				//for(person certainPerson : people.getPeople()) {								
					
					if (commandArray[0].startsWith("1")){                               // STARTS WITH ID 
						for(People certainPerson : people.getPeople())
						if(certainPerson.getID().equals(commandArray[0])) {
							String FoodOrSportID = commandArray[1];


												
							if (FoodOrSportID.length()==4 &&  FoodOrSportID.startsWith("1")){ //FOOD
								for(food certainFood : food.getFoods()) {
									if(certainFood.foodID.equals(FoodOrSportID)) {
										if(!givenPeopleIDArray.contains(certainPerson.getID())) {
											givenPeopleIDArray.add(certainPerson.getID());								
										}
										Integer portion =Integer.parseInt(commandArray[2]);
										certainPerson.takeCalorie((certainFood.foodCalorie)*portion);
										outputStream.println(certainPerson.getID()+ " has taken " + (certainFood.foodCalorie)*portion + "kcal from " + certainFood.foodName);
										if(sc.hasNextLine()) {
											outputStream.println("***************");
										}
										}}}
							
							
							else if(FoodOrSportID.length()==4 && FoodOrSportID.startsWith("2")) { //SPORT
								for(Sports certainSport : sports.getSports()) {
									if(certainSport.getSportID().equals(FoodOrSportID)) {
										if(!givenPeopleIDArray.contains(certainPerson.getID())) {
											givenPeopleIDArray.add(certainPerson.getID());								
										}									Integer times = Integer.parseInt(commandArray[2]);
										Integer calorieSport = ((certainSport.getSportCalorie()*times)/60);
										certainPerson.giveCalorie(calorieSport);
										outputStream.println(certainPerson.getID()+" has burned " +calorieSport +"kcal thanks to "+certainSport.getSportName());

										if(sc.hasNextLine()) {
											outputStream.println("***************");

										}}}}
						}
						
					}
													
					
					
					else if (commandArray[0].startsWith("print(")){                     // PRINT(ID)
						String printID = command.substring(6,11);
						for(People certainPerson : people.getPeople())
						if (certainPerson.getID().equals(printID)) {
							outputStream.println(certainPerson.getName()+ " " +(2022-certainPerson.getAge())+" "+certainPerson.getDailyCalorieNeeds()+"kcal "+certainPerson.getCalorieTaken()+"kcal "+certainPerson.getCalorieGiven()+"kcal "+ (certainPerson.getCurrentCalorie()-certainPerson.getDailyCalorieNeeds()+"kcal"));
							if(sc.hasNextLine()) {
								outputStream.println("***************");

							}		
						}
					


					}
					
					else if(commandArray[0].startsWith("printList")) {
						for(String a: givenPeopleIDArray) {
							for(People certainPerson : people.getPeople()) {
								if(certainPerson.getID().equals(a)) {
									outputStream.println(certainPerson.getName()+ " " +(2022-certainPerson.getAge())+" "+certainPerson.getDailyCalorieNeeds()+"kcal "+certainPerson.getCalorieTaken()+"kcal "+certainPerson.getCalorieGiven()+"kcal "+ (certainPerson.getCurrentCalorie()-certainPerson.getDailyCalorieNeeds()+"kcal"));
								}
							}

							
						}
						if(sc.hasNextLine()) {
							outputStream.println("***************");
						}		
					}
					
					for(People certainPerson2 : people.getPeople()) {
						if( (certainPerson2.getCurrentCalorie()-certainPerson2.getDailyCalorieNeeds()) >0 ) {
							if(!printWarnArray.contains(certainPerson2.getID())) {
								printWarnArray.add(certainPerson2.getID());
							}

						}
					}
					
					
					
					if(commandArray[0].startsWith("printWarn")) {	
						for(String b: printWarnArray) {
							for(People certainPerson2 : people.getPeople()) {
								if(certainPerson2.getID().equals(b)) {
									if((certainPerson2.getCurrentCalorie()-certainPerson2.getDailyCalorieNeeds()) > 0){
										outputStream.println(certainPerson2.getName()+ " " +(2022-certainPerson2.getAge())+" "+certainPerson2.getDailyCalorieNeeds()+"kcal "+certainPerson2.getCalorieTaken()+"kcal "+certainPerson2.getCalorieGiven()+"kcal "+ (certainPerson2.getCurrentCalorie()-certainPerson2.getDailyCalorieNeeds()+"kcal"));
									}
									else if((certainPerson2.getCurrentCalorie()-certainPerson2.getDailyCalorieNeeds()) < 0 || printWarnArray.size() == 0 ){										
										//printWarnArray.remove(certainPerson2.getID());
										outputStream.println("There is no such person");
									}
								}							
							}
						}
						if(sc.hasNextLine()) {
							outputStream.println("**************");
						}		
						}
					
					if(!sc.hasNextLine()) {
						outputStream.close();
						sc.close();
					}
					}

			
			
					
				//}
				
			}catch(Exception e) {
			}
	}
}		
	


	


