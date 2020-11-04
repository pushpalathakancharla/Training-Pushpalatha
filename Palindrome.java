class Palindrome
{
public static void main(String[] args)
{
int n=145,sum=0,temp,r;
temp=n;
while(n>0)
{
r=n%10;
sum=sum*10+r;
n=n/10;
}
if(temp==sum)
System.out.print("palindrome");
else
System.out.print(" not palindrome");

}
}