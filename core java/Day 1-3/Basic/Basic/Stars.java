class Stars {
  public static void main(String[] args) {
    
 
    for (int n = 1; n <= 5; n++) {
      for(int j = 4; j >= n; j--) {
        System.out.print("*");
      }
      System.out.println(); // Go to next line
    }
  }
}