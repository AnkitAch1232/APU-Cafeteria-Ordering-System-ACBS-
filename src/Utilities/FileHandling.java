package Utilities;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

// All file related actions
public class FileHandling {
    
      
    // Filter lines that contains the query if it matches the entire word
    public static String filterLines(String query, String line) throws FileNotFoundException, IOException {

        Pattern pattern = Pattern.compile(query, Pattern.LITERAL);
        Matcher matcher = pattern.matcher(line);
        boolean matchFound = matcher.find();
        if (matchFound) {
            return line;
        }
        return "NA";
    }
    
    // Read through the specified file for a specified string by comparing tokens, and return the line
    public static String locateItemInFile(String query, File file, int sectionNumber) throws FileNotFoundException, IOException {
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        String [] lineArray;
  
        while ((line = br.readLine()) != null){
            // Split the lines into tokens
            lineArray = line.split("\\|");
            
            // Only returns line when condition is met
            if (lineArray[sectionNumber].equals(query)){
                return line; 
            }
        }
        return "NA";
    }

    // Read through the specified file for a specified string by comparing 2 tokens, and return the line
    public static String locateItemInFile(String query, String query2, File file, int sectionNumber, int sectionNumber2) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        String [] lineArray;
        while ((line = br.readLine()) != null){
            // Split the lines into tokens
            lineArray = line.split("\\|");

            // Only returns line when condition is met
            if (lineArray[sectionNumber].equals(query) && lineArray[sectionNumber2].equals(query2)){
                return line;
            }
        }
        return "NA";
    }
   
    
    // Appending data to file
     public static void appendToFile(String line, File file) throws IOException {
        FileWriter fw = new FileWriter(file, true);  
        fw.write(line + "\n");
        fw.close();
    }
    
    // Count the number of lines in the file
    public static int numberOfLines(File file) {
        int count = 0;
        try {
            Scanner sc = new Scanner(file);
            // Read each line and count the number of lines
            while(sc.hasNextLine()) {
              sc.nextLine();
              count++;
            }
            // Close scanner
            sc.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: File does not exist!");
            System.err.println("Exception occurred - " + e.toString());
        }
        return count;
    }
    
    // Putting the lines of a file into an array
    public ArrayList<String> returnLines(File file)throws FileNotFoundException, IOException {
    
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        ArrayList<String> lines = new ArrayList<String>();
        
        while ((str = br.readLine()) != null){   
            if (!str.isEmpty()){
             lines.add(str);            
            }
        }
        return lines;
    }
      
    // Rewriting one line in the file (Rewriting an entire file)
    public void rewriteContent(File file, int sectionNumber, String query, String textToBeRewritten) {
        try {
            // Stores all lines
            ArrayList<String> lines = new ArrayList<String>();
            
            // Putting new and old lines into the array
            for (int i = 0; i < numberOfLines(file); i++) {
                String data = returnLines(file).get(i);
                // Split the lines into tokens
                String[] section = data.split("\\|");
                
                // If the query matches with a certain row, rewrite that row
                if ((section[sectionNumber]).equals(query)) {
                    String newLine = (section[0] + "|" + section[1] + "|" + section[2] + "|" + section[3] + "|" + textToBeRewritten);
                    lines.add(newLine);
                // Else, rewrite the same line
                } else {
                    String oldLine = (section[0] + "|" + section[1] + "|" + section[2] + "|" + section[3] + "|" + section[4]);
                    lines.add(oldLine);
                }
            }
            // Printing the lines into the file
            FileWriter fw = new FileWriter(file); 
            for (int i = 0; i < lines.size(); i++) {
                fw.write(lines.get(i) + "\n");
            }
            fw.close();             
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            System.err.println("Exception occurred - " + e.toString());
        }
    }
    
    
    // Removing one line in the file (Rewriting an entire file)
    public void removeLine(File file, int sectionNumber, String query) {
        try {
            // Stores all lines
            ArrayList<String> lines = new ArrayList<String>();
            
            // Putting old lines into the array
            for (int i = 0; i < numberOfLines(file); i++) {
                String data = returnLines(file).get(i);
                // Split the lines into tokens
                String[] section = data.split("\\|");
                
                // If the query matches with a certain row, don't write that row
                if (!(section[sectionNumber]).equals(query)) {
                    String newLine = (section[0] + "|" + section[1] + "|" + section[2] + "|" + section[3] + "|" + section[4]);
                    lines.add(newLine);
                }
            }
            
            // Printing the lines into the file
            FileWriter fw = new FileWriter(file); 
            for (int i = 0; i < lines.size(); i++) {
                fw.write(lines.get(i) + "\n");
            }
            fw.close();  
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            System.err.println("Exception occurred - " + e.toString());
        }
    }  
    
    // Removing one line in the file (Rewriting an entire file)
    public void removeLine(File file, int sectionNumber1, int sectionNumber2, String query1, String query2) {
        try {
            // Stores all lines
            ArrayList<String> lines = new ArrayList<String>();
            
            // Putting old lines into the array
            for (int i = 0; i < numberOfLines(file); i++) {
                String data = returnLines(file).get(i);
                // Split the lines into tokens
                String[] section = data.split("\\|");
                
                // If the query matches with a certain row, don't write that row
                if (!((section[sectionNumber1]).equals(query1) && (section[sectionNumber2]).equals(query2))) {
                    String newLine = (section[0] + "|" + section[1] + "|" + section[2] + "|" + section[3] + "|" + section[4] + "|" + section[5]);
                    lines.add(newLine);
                }
            }
            
            // Printing the lines into the file
            FileWriter fw = new FileWriter(file); 
            for (int i = 0; i < lines.size(); i++) {
                fw.write(lines.get(i) + "\n");
            }
            fw.close();  
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            System.err.println("Exception occurred - " + e.toString());
        }
    }   
}
