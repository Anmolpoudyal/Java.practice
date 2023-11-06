import java.util.*;
public class Love_Calculator

{
    public static void Main (String args[])
    {
     Map <String, Integer> values = new HashMap<String, Integer>();
     values.put("a" ,67);
      values.put("b" ,25);
       values.put("c" ,67);
        values.put("d" ,64);
         values.put("e" ,56);
          values.put("f" ,34);
           values.put("g" ,76);
            values.put("h" ,65);
             values.put("i" ,56);
              values.put("j" ,34);
               values.put("k" ,90);
                values.put("l" ,27);
                 values.put("m" ,45);
                  values.put("n" ,23);
                   values.put("o" ,23);
                    values.put("p" ,89);
                     values.put("q" ,45);
                      values.put("r" ,27);
                       values.put("s" ,58);
                        values.put("t" ,90);
                         values.put("u" ,29);
                          values.put("v" ,68);
                           values.put("w" ,98); 
                            values.put("x" ,89);
                             values.put("y" ,27);
                              values.put("z" ,56);
                              System.out.println ("please enter values in \"lower case\"");
                              System.out.println ("Enter the first letter of your name");
                              Scanner letter = new Scanner(System.in);
                              String input1 =letter.next();
                              System.out.println ("please Enter the first letter of your Loved one name");
                              String input2= letter.next();
                              
                              int inputnum1 =values.get(input1);
                              int inputnum2 =values.get(input2);
                              int lovesum = inputnum1 + inputnum2;
                              System.out.println( "God\'s computer found out that you\'re love is " + lovesum+"%");
                              
                              
                              
                              
                              
                              
                              
                              
                              
                              
                
       
      
     
    
    }
    
} 
