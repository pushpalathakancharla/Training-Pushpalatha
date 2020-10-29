class Movie
{
String moviename;
float budget;
int duration;
String actor;
int price;
Movie(String moviename,float budget,int duration,String actor,int price)
{
this.moviename=moviename;
this.budget=budget;
this.duration=duration;
this.actor=actor;
this.price=price;
}
public void display()
{
System.out.println("moviename="+moviename);
System.out.println("budget="+budget);
System.out.println("duration="+duration);
System.out.println("actor="+actor);
System.out.println("price="+price);
}
}
class Constructor1
{
public static void main(String args[])
{
Movie ref=new Movie("dhee",55.6f,64,"surya",100);
Movie ref1=new Movie("bhishma",5.6f,76,"vijaya",10);
}
}

