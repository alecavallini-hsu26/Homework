public class Madlibs {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        Madlibs myStory= new Madlibs();
    }//Main method

    public Madlibs(){
        System.out.print("halo varld");
        System.out.println(story);
    }// constructor method
    public String classmate="Matteo";
    public String city="Milton";
    public String noun="chair";
    public String adjective="long";
    public String pluralNoun="Hamburgers";
    public String pluralAnimal="dolphins";
    public boolean trueOrFalse=false;
    public double decimalBiggerThan1=9.8;
    public int number1=4;
    public int number2=18;
    public int wholeNumberBetween1And4=3;
    public String miltonTeacher="Ms.Lockwood";
    public String miltonDean="Mr.Furst";
    public String letterGrade="F";
    public String season="Fall";
    //define a string called story for mad lib
    String story = "This weekend I am going camping with "
            +classmate+ ". We are going to a campsite in "
            +city+ ". I packed my "+noun+ " and "
            +pluralNoun + ".  The forecast is calling for a high of "
            +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
            +adjective+" day! This year, the park rangers have seen "
            +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
            +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
            +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
            +miltonDean+ " said it actually has only happened "
            + number2+" times. Wish us luck! If we survive, we will earn a "
            +letterGrade+ "- in P.E. class.";

//now print story to the dos window



}

