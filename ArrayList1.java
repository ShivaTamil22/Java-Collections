import java.util.ArrayList;

public class ArrayList1 {
    public static void main (String args[]){
        ArrayList<String> Names = new ArrayList<>();
        Names.add("Shiva");
        Names.add("Raj");
        Names.add("Kavi");

        // System.out.println(Names);

        // Names.add(1,"Sathish");

        // System.out.println(Names);

        // Names.set(0, "pari");

        // System.out.println(Names);

        // System.out.println(Names.get(2));

        // Names.remove(1);

        // System.out.println(Names);

        // System.out.println(Names.size());

        ArrayList<String> Students = new ArrayList<>();
        Students.add("Ram");
        Students.add("Suresh");

        Students.addAll(Names);
        // System.out.println(Students);

        // System.out.println(Students.contains("Shiva"));
        // System.out.println(Students.contains("Kumar"));

        //  ForEach Loop
        // Students.forEach(name -> System.out.println(name));

        // System.out.println(Students.indexOf("Shiva"));

        // System.out.println(Students.isEmpty());

        // Students.add("Shiva");
        // System.out.println(Students.indexOf("Shiva"));
        // System.out.println(Students.lastIndexOf("Shiva"));

        // Students.replaceAll(name -> name.toUpperCase());
        // System.out.println(Students);

        // for (int i = 1; i < Students.size(); i++){
        //     System.out.println(Students.get(i));
        // }

        // for (String name:Students){
        //     System.out.println(name);
        // }

        ArrayList<Integer> Numbers = new ArrayList<>();
        Numbers.add(10);
        Numbers.add(20);
        Numbers.add(30);
        Numbers.add(40);
        Numbers.add(50);

        System.out.println(Numbers);

        



    }    
}
