public class Crypto{
  private String uniq_ID;
  private String date;
  private String symbol;
  private double open;
  private double high;
  private double low;
  private double close;
  private double vol;
  private double vol_USD;
  public Crypto(String u, String d, String s, double o, double h, double l, double c, double v, double v_usd){
    this.uniq_ID = u;
    this.date = d;
    this.symbol = s;
    this.open = o;
    this.high = h;
    this.low = l;
    this.close = c;
    this.vol = v;
    this.vol_USD = v_usd;
  }
  public String getUniqID(){
    return uniq_ID;
  }
  public String getDate(){
    return date;
  }
  public String getSymbol(){
    return symbol;
  }
  public double getOpen(){
    return open;
  }
  public double getHigh(){
    return high;
  }
  public double getLow(){
    return low;
  }
  public double getClose(){
    return close;
  }
  public double getVolume(){
    return vol;
  }
  public double getVolumeUSD(){
    return vol_USD;
  }
  public double calcEndOpenDiff(){
    return close - open;
  }
  public double findMax(){
    return high; 
  }
}