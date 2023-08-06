import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class DataReader{
  public static ArrayList<Crypto> readData(String f_name){
    ArrayList<Crypto> dataList = new ArrayList<Crypto>();
    File dataFile = new File(f_name);
    try (Scanner fileScanner = new Scanner(dataFile)){
      ArrayList<String> lines = new ArrayList<String>();
      while (fileScanner.hasNextLine()){
        lines.add(fileScanner.nextLine());
      }
      for (int index = 2; index < lines.size(); index++){
        String line = lines.get(index);
        String[] c_data = line.split(",");
        String uniq_ID = c_data[0];
        String date = c_data[1];
        String symbol = c_data[2];
        double open = Double.parseDouble(c_data[3]);
        double high = Double.parseDouble(c_data[4]);
        double low = Double.parseDouble(c_data[5]);
        double close = Double.parseDouble(c_data[6]);
        double vol = Double.parseDouble(c_data[7]);
        double vol_USD = Double.parseDouble(c_data[8]);
        Crypto model = new Crypto(uniq_ID, date, symbol, open, high, low, close, vol, vol_USD);
        dataList.add(model);
      }
    }
    catch(FileNotFoundException error){
      handleError(error);
    }
    catch(NumberFormatException NFE){
      System.out.println("INVALID FORMAT");
    }
    return dataList;
  }
  public static void handleError(Exception error){
    System.out.println("ERROR CAUGHT:");
    System.out.println(error.getMessage());
  }
}