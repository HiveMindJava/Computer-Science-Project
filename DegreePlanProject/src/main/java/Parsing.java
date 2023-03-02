import java.util.*;


public class Parsing {
    private String firstName, lastName, ID;

    Vector<Vector<String>> parseTranscript(String data){
        Scanner myScanner = new Scanner(data);
        Vector<Vector<String>> myVector = new Vector<Vector<String>>();

        Integer counter = 0;
        while(myScanner.hasNextLine()){
            String token = myScanner.nextLine();
            String courseSplit[] = token.split(" ");
            System.out.println(" ");
            if(courseSplit[0].equals("Name:")){
                firstName = courseSplit[courseSplit.length - 2];
                lastName = courseSplit[courseSplit.length - 1];
            }
            else if(courseSplit[0].equals("Student") && courseSplit[1].equals("ID:")){
                ID = courseSplit[courseSplit.length - 1];
            }
            else if(token.charAt(0) == 'C' && token.charAt(1) == 'S'){
                Vector<String> courseHold = formatCourse(courseSplit);
                myVector.add(courseHold);
            }
            System.out.println("counter: " + counter + " " + token);
            counter++;
        }

        myScanner.close();

        return myVector;
    }
    
    void printCourses(Vector<Vector<String>> x){
        System.out.println("Data pulled from: " + firstName + " " + lastName);
        System.out.println("ID: " + ID);
        for(Vector<String> y : x){
            for(String info : y){
                System.out.print(info + " ");
            }
            System.out.println("");
        }
    }
    /* 
    String [] formatCourse(String[] input){
        Integer startingIndex = 2, endIndex = input.length - 5;
        Integer size = input.length - (input.length - 7);
        String[] newStringArr = new String[size];
        for(int i = 0; i < size; i++){
            if(i < startingIndex || i > endIndex){
                newStringArr[i] = input[i];
            }
            else if(i == startingIndex){
                newStringArr[startingIndex] = String.join(" ", Arrays.copyOfRange(input, startingIndex, endIndex)); 
            }
            else{
                continue;
            }
        }
        return newStringArr;
    }
    */
    Vector<String> formatCourse(String[] input){
        Integer startingIndex = 2, endIndex = input.length - 5;
        Vector<String> myVector = new Vector<String>();
        for(int i = 0; i < input.length; i++){
            if(i < startingIndex || i > endIndex){
                myVector.add(input[i]);
            }
            else if(i == startingIndex){
                myVector.add(String.join(" ", Arrays.copyOfRange(input, startingIndex, endIndex))); 
            }
        }
        return myVector;
    }

}

