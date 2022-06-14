public class HelloWorld {

    public static void main(String[] args) {
        String word="Codytex";

       // StringBuffer my1=new StringBuffer(word);
       // my1.reverse();

        String reverse="";
        for (int i = word.length()-1; i >=0; i--) {
            reverse=reverse+word.charAt(i);

        }

        System.out.println(reverse);


    }
}
