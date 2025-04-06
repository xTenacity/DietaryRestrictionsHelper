package src.main.java.com.tenacity.diethelper;

import java.util.*;

public class Health { 
private ArrayList<String> conditions; 
private ArrayList<ArrayList<String>> recipeNames; 

//constructor
public Health(ArrayList<String> conditions, ArrayList<ArrayList<String>> recipeNames) { 
    this.conditions = conditions; 
    this.recipeNames = recipeNames;
} 

//user input??
public void User(){ 
    try (Scanner myObj = new Scanner(System.in)) {
        for (int i = 0; i < conditions.size(); i++){
            System.out.println((i+1) + ": " + conditions.get(i));
        }
        System.out.println("Enter your number: ");
        conditionRecipes(myObj.nextInt());
    }
} 
public void conditionRecipes(int num){ 
    for (int i = 0; i < recipeNames.get(num-1).size(); i++) { 
        System.out.println((num + ": " + recipeNames.get(num-1)) + "\n "); 
    }  
}

    public void recipeDetails(){
    .conditions;
    }  

public static void main(String[] args) {
    ArrayList<ArrayList<String>> all = new ArrayList<>();
    ArrayList<String> a = new ArrayList<String>(Arrays.asList("a","b","c"));
    ArrayList<String> one = .readDataFromFile("type2.txt"); 
    ArrayList<String> two = .readDataFromFile("nut.txt"); 
    ArrayList<String> three = .readDataFromFile("veg.txt"); 
    ArrayList<String> four = .readDataFromFile("df.txt"); 
    ArrayList<String> five= .readDataFromFile("gf.txt"); 
    all.add(one);
    all.add(two);
    all.add(three);
    all.add(four);
    all.add(five);        

        Health health = new Health(a, all);
    health.User();

    String CONNECT_API_URL = "";

    String 
}
} 