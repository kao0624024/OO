interface Shape{
  double getArea();
}


class Rectangle implements Shape{
  private static double length,width;
  public Rectangle(double length, double width){
    this.length = length;
    this.width = width;
  }

  public double getArea(){
    return length * width;
  }

  public String toString(){
    return Double.toString(getArea());
  }
}


class Triangle implements Shape{
  private double base, height; 
  public Triangle(double base, double height){
    this.height = height;
    this.base = base;
  }

  public double getArea(){
    return height * base / 2;
  }

  public String toString(){
    return Double.toString(getArea());
  }
}


class MyShape{
  public static void main(String[] args){
    Rectangle rectangle = new Rectangle(6,6);
    System.out.println(rectangle.toString());
    Triangle triangle = new Triangle(6,6);
    System.out.println(triangle.toString());
  }
}
