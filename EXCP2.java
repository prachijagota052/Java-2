
class EXCP2 {
 static String s = null;
    public static void main(String[] args) {


        //getLength(s);

        try {
            getLength(s);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
       

        
       


        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
        
        
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
       
        
    }
   
    public static int getLength(String s) {
       
        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null");

        return s.length();
    }
}