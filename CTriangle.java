public class CTriangle extends CShape{
  protected double a,b,c;
  public CTriangle(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public void show(){
    System.out.print("color="+color+", ");
    System.out.println("area="+ 0.5*a*b);
  }
}

