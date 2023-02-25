public class Main {
/*We got an array of names.
 Create a program which will be
 output palindrome names, using StringBuilder */
    public static boolean ispalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
       String reverse = sb.reverse().toString().toLowerCase();
       return s.equals(reverse);
    }

    public static void main(String[] args) {
        String [] array = {"Nica", "Thomas", "Sam", "Kirill","Anna" ,"Anton", "Otto", "Bob"};
        for(int i =0; i<array.length; i++){
            if(ispalindrome(array[i].toLowerCase())){
                System.out.println("Palindrome name: "+ array[i] );
            }
        }
    }
}