
//  operators

public class op {
  public static void main(String[] args){
    int n = 123;
    System.out.println("step0: n = " + n);
    // ++ operator
    n++;
    System.out.println("step1: n = " + n);
    ++n;
    System.out.println("step2: n = " + n);

    // -- operator
    --n;
    System.out.println("step3: n = " + n);
    n--;
    System.out.println("step4: n = " + n);
   
    //! operator
    boolean flag = true;
    System.out.println("step5: flag = " + flag);
    flag = !flag; 
    System.out.println("step6: flag = " + flag);
    flag = !flag; 
    System.out.println("step7: flag = " + flag);

    // < operator
    flag = (3 < 4);
    System.out.println("step8: flag = " + flag);
    // > operator
    flag = (3 > 4);
    System.out.println("step9: flag = " + flag);
    // <= operator
    flag = (3 <= 4);
    System.out.println("step10: flag = " + flag);
    // >= operator
    flag = (3 >= 4);
    System.out.println("step11: flag = " + flag);
    // != operator
    flag = (4!=4);
    System.out.println("step12: flag = " + flag);
    // == operator
    flag = (4==4);
    System.out.println("step13: flag = " + flag);
      
    // && operator, means "AND",  both parts have to be true to make the whole thing true
    flag = (1==2 && 2>3);
    System.out.println("step14: flag = " + flag);
    // || operator, means "OR", either part is true will make the whole thing true
    flag = (1>0 || 3<2);
    System.out.println("step15: flag = " + flag);

    // += operator, add, then assign
    int a = 7;
    a += 7;
    System.out.println("step16: a = " + a);

    // *= operator, multiply, then assign
    a = 2;
    a *= 3;
    System.out.println("step17: a = " + a);

    // /= operator , divide, then assign
    a = 6;
    a /= 2;
    System.out.println("step18: a = " + a);

  }
}
 
