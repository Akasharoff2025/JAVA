public class RectArea
{
double l,b;
void getdata(double length,double breadth){
    l=length;
    b=breadth;
}
double calArea(){
return l*b;
}
public static void main(String args[]){
{
    RectArea r =new RectArea();
    r.getdata(12.38,13);
    System.out.println("Area of Rect:"+r.calArea());

}
}
}