 class Degreecerificate
{
public abstract void firstyear();
public abstract void secondyear();
public abstract void thirdyear();
public abstract void finalyear();
}
abstract class Firstattempt extends Degreecerificate
{
public void firstyear()
{
System.out.println("First year implemetion");
}
abstract class Secondattempt extends Degreecerificate
{
public void secondyear()
{
System.out.println("second year implemetion");
}
abstract class Thirdattempt extends Degreecerificate
{
public void thirdyear()
{
System.out.println("third year implemetion");
}
class Finalattempt extends Degreecerificate
{
public void finalyear()
{
System.out.println("final year implemetion");
}
}
}
}
}
class Abstract
{
public static void main(String[] args)
{
Degreecerificate d1=new Degreecerificate();
d1.firstyear();
d1.secondyear();
d1.thirdyear();
d1.finalyear();
}
}


