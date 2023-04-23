import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Scanner;

public class dude {
//    public static void main(String[] args) {
//        HashMap<String, String> names= new HashMap<>();
//        names.put("322274085", "Daniel Novo");
//        names.put("212451", "David Nazi");
//    List<Integer> numbers= new ArrayList<>();
//    numbers.add(50);
//    numbers.add(101);
//    numbers.add(202);
//    numbers.add(890);
//    fileName("faggot4", 14);
//    }
    public static void changeNameById(HashMap<String,String> names){
        System.out.println(names);
        int counter =0;
        while (counter<5){
            System.out.println("Enter the id you want the change name: ");
            Scanner scanner = new Scanner(System.in);
            String id = scanner.nextLine();
            System.out.println("Enter new name: ");
            String name = scanner.nextLine();
            names.replace(id, name);
            counter++;
            System.out.println(names);
        }


    }
    public static void removeNumberInList (List<Integer> numbers){
        System.out.println(numbers);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want to remove from list: ");
        Integer num= scanner.nextInt();
        numbers.remove(num);
        System.out.println(numbers);
    }


    public static void fileName (String fileName, Integer number){
    File file= new File(fileName+".txt");
    try{
        boolean success = file.createNewFile();
        if (success){
            System.out.println("Created Successfully");
        } else {
            System.out.println("Already exists.");
        }
    } catch (IOException e){
        System.out.println("Error Occurred.");
    }
    try{
        if (file!= null && file.exists()){
            FileWriter fileWriter= new FileWriter(file);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            for (int i = 1 ; i <=number;i++){
                if (i%7==0 || containsSeven(i)){
                    bufferedWriter.write("boom \n");
                } else {
                    bufferedWriter.write(Integer.toString(i)+" \n");
                }
            }
            bufferedWriter.close();
            fileWriter.close();
    }
    } catch (IOException e){
        e.printStackTrace();
    }

    }

    public static boolean containsSeven (Integer num){
        boolean result = false;
        while (num>0){
            if (num%10==7){
                result=true;
                break;
                } else {
                num/=10;
            }
        }
        return result;
    }
}