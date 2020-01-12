import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) throws IOException {
        ArrayList<Double> arrayListData = new ArrayList<Double>();
        String Templine;
        String Temp;
        String Temp2;
        double Templin2;
        double max;
        double mini;



        try {
            BufferedReader bufertIn = new BufferedReader(new FileReader("C:\\Users\\Felix\\OneDrive - System Provider Edenborgh AB\\Dokument\\Java2019\\Övningsuppgfit7\\Personuppgifter.txt"));
            while ((Templine = bufertIn.readLine()) != null) {
                System.out.println(Templine);

                Temp = Templine.replaceAll("\\D+","");


                System.out.println(Temp);
                Temp2 = Temp.substring(Temp.length() -3);
                System.out.println(Temp2);

                Templin2 = Double.parseDouble(Temp2);
                System.out.println(Templin2);

                arrayListData.add(Templin2);

                if(Templin2 > 200){
                    System.out.println(Templin2 > 200);

                    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Felix\\OneDrive - System Provider Edenborgh AB\\Dokument\\Java2019\\Övningsuppgfit7\\Längstapersonerna.txt"));
                    writer.write("cm: " + Templin2 + "  Nisse Nilsson");
                    System.out.println("Writed!");
                    writer.close();
                }


            }

        }
        catch(Exception e){
            System.out.println("File ERROR!");
        }


    }

}
