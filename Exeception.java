class Exeception
{

public static void main(String args[])
{
int i,j;
int[][] k=new int[5][5];
for(i=0;i<=5;i++)
{
for(j=0;j<=i;j++)
{
if(j==0)
{
k[i][j]=1;
}
else if(i==j)
{
k[i][j]=1;
}
else
{
k[i][j]=k[i-1][j-1]+k[i-1][j];
}
System.out.print(k[i][j]);
}
System.out.println();
}
}
}
