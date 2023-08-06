import java.util.ArrayList;
public class Controller{
  private ArrayList<Crypto> dataList;
  public Controller(){}
  public void dataLoad(){
    this.dataList = DataReader.readData("Gemini_1INCHUSD_d (3).csv");
  }
  public double calcDiffOnDate(String date){
    double diff = -1;
    for (int i = 0; i < this.dataList.size(); i++){
      if(this.dataList.get(i).getDate().equals(date)){
        diff = this.dataList.get(i).calcEndOpenDiff();
        System.out.println("The difference in start and end price is: "+diff+ " on "+date);
        return diff;
      }
    }
    System.out.println("Sorry, couldn't calculate anything!");
    return diff;
  }
  public double findMaxPrice(){
    double maxPrice = this.dataList.get(0).getHigh();
    String maxDate = this.dataList.get(0).getDate();
    for (int i = 0; i < this.dataList.size(); i++){
      double high = this.dataList.get(i).getHigh();
      if (high > maxPrice){
        maxPrice = high;
        maxDate = this.dataList.get(i).getDate();
      }
    }
    System.out.println("The highest High Price is: "+maxPrice+" on "+maxDate);
    return maxPrice;
  }
}


