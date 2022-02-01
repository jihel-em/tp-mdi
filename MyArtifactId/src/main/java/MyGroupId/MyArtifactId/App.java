package MyGroupId.MyArtifactId;

/**
 * @author Jean-Loup
 * Test class.
 */
public final class App {
   /**
   * Test main.
   * @param args
   */
   public static void main(final String[] args) {
      System.out.println("Hello World!");
   }

   private App() { }
   
   public String codeMort(final String s) {
	   String res = "Haha c tro maran il saire a r ce turc :D";
	   return res+s+"Hihi";
   }
   
   public static int copyPaste(int[] l) {
	   int res = 10;
	   for(int i=0; i<10; i++) {
		   res = copyPasteCorrection(l, res);
	   }
	   return res;
   }
   
   private static int copyPasteCorrection(int[] l, int base_value) {
	   int res = base_value;
	   for(int i=0; i<l.length; i++) {
		   res+=l[i];
		   System.out.println("lmao");
	   }
	   return res;
   }
}
