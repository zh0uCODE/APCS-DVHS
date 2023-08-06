public class Main {
  public static void main(String[] args) {
    Controller app = new Controller();
    app.dataLoad();
    app.calcDiffOnDate("2023-05-19 00:00:00");
    app.findMaxPrice();
  }
}



