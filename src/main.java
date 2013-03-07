public class main {
	
	public int add(int a, int b){
		return a+b;
	}
	
  public int multiply(int x, int y) {
    if (x > 999) {
      throw new IllegalArgumentException("X should be less than 999");
    }
    return x / y;
  }

}
