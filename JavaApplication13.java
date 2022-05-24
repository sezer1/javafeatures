
package javaapplication13;
import java.util.Random;
//import java.util.ArrayList;

class Figure{
    private String color;
    Figure(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void changeColor(String color){
        this.color = color;
    }
    
/*         public ArrayList <Figure> figo = new ArrayList<>(); 
         public void pushquadra(Quadrangle qr2){
   figo.add(qr2);
 }
*/
    
    public String toString() {
        return "Figure{" +
                "color='" + color + '\'' +
                '}';
    
    
    }
}
class Quadrangle extends Figure{
    Point p1,p2,p3,p4;
    Quadrangle(String color,Point p1,Point p2, Point p3, Point p4){
        super(color);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    Quadrangle(String color,Point p1,Point p3){
        super(color);
        this.p1 = p1;
        this.p3 = p3;
    }
    Quadrangle(String color,Point p1){
        super(color);
        this.p1 = p1;
    }
    
    public String toString(){
        return  getColor() + " {"+p1+p2+p3+p4+"}";    
         }
   
}
class Rectangle extends Quadrangle{
    Rectangle(String color,Point p1,Point p3){
        super(color, p1,p3);
        this.p2 = new Point(p1.getX(),p3.getY());
        this.p4 = new Point(p3.getX(),p1.getY());
    }
    public String toString(){
        return  getColor() + " {"+p1+p2+p3+p4+"}\n";    
         }
}
class Square extends Quadrangle{
    Square(String color,Point p1,int side){
        super(color,p1);
        int a = (int) Math.sqrt(side);
        this.p2 = new Point(p1.getX()+a,p1.getY());
        this.p3 = new Point(p1.getX(),p1.getY()+a);
        this.p4 = new Point(p1.getX()+a,p1.getY()+a);
    }
    public String toString(){
        return  getColor() + " {"+p1+p2+p3+p4+"}\n";    
         }
}
class Point{
    private int x;
    private int y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void move(int dx,int dy){
        this.x += dx;
        this.y += dy;
    }
    public String toString(){
        return  "{"+x+","+y+"}";    
        } 
}
class Line {
    private Point p1;
    private Point p2;
   public  Line(Point p1,Point p2){
        this.p1 = new Point(p1.getX(),p1.getY());
        this.p2 = new Point(p2.getX(),p2.getY());
    }
    public Point getX() {
        return p1;
    }
    public Point getY() {
        return p2;
    }
    public String toString(){
        return  "{"+p1+","+p2+"}\n";    
         }
}

class GenerateRandom {
    
      Random rand = new Random(); //instance of random class
      int upperbound = 4;
       private int int_random;
     
        public int getnumber(){
        return int_random = rand.nextInt(upperbound);
        }
    }
/*
class Counter {
    public int length;
    public void count(int length,Figure a){
    for(int i=0;i<this.length;i++){
    System.out.println(Figure instanceof a); 
}
}
 
}
*/

public class JavaApplication13 {
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int figo=0;
        int quad=0;
        int recto=0;
        int squo=0;
        Point p1 = new Point(2,2);
        Point p2 = new Point(3,4);
        Point p3 = new Point(0,0);
        Point p4 = new Point(7,8);
        Figure f = new Figure("red");
        GenerateRandom rando=new GenerateRandom();
         Figure[] figures = new Figure[10];
         Square[] squares= new Square[10];
       Figure s= new Square("blue",p1,100);
       for(i=0;i<figures.length;i++){
            if(rando.getnumber()==0){
           Figure r= new Figure("blue");
             figures[i]=r;
         }
         if(rando.getnumber()==1){
            Figure q=new Quadrangle("red", p1, p2, p3, p4);
             figures[i]=q;
         }
         if(rando.getnumber()==2){
           Figure r= new Rectangle("blue", p1, p3);
             figures[i]=r;
         }
          if(rando.getnumber()==3){
          
             figures[i]=s;
             
         }
          if(figures[i] instanceof Figure){
           figo=++figo;
           };
          
           if(figures[i] instanceof Quadrangle){
           quad=++quad;
           };
          if(figures[i] instanceof Rectangle){
           recto=++recto;
           };
           if(figures[i] instanceof Square){
           squo=++squo;
           Square s1=(Square)s;
           squares[squo]=s1;
           
           };
           
           
          
           
           
       }
       
        System.out.println("İn the figures table has "+figo+" Figure "+quad+" Quadrangle "
                +recto+" Rectangle "+squo+" Square");
        
       
       
       
       
       
       
       
   /*    
        Quadrangle a = new Quadrangle("red", p1, p2, p3, p4);
        Rectangle b = new Rectangle("blue", p1, p3);
        Square c = new Square("green", p2,100);
        System.out.println(b);
        p1.move(2, 3);
        System.out.println(c);
        System.out.println(a);
        System.out.println(f);
        
    */
        
    }
    
}
