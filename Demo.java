class Instagram
{
int posts;
int followers;
String name;
int number;
String account;
int following;
}
class Facebook
{
int posts;
int followers;
String name;
int number;
int likes;
int comments;
int share;
}
class Demo
{
public static void main(String args[])
{
Instagram pushpa=new Instagram();
pushpa. posts=10;
pushpa. followers=5;
pushpa.name="latha";
pushpa. number=8976543;
pushpa.account="bharathi";
pushpa.following=34;
System.out.println("======Instagram Details=====");
System.out.println("posts:"+pushpa.posts);
System.out.println("followers:"+pushpa.followers);
System.out.println("name="+pushpa.name);
System.out.println("number:"+pushpa.number);
System.out.println("account:"+pushpa.account);
System.out.println("following="+pushpa.following);
Facebook junnu=new Facebook();
junnu.posts=15;
junnu.followers=45;
junnu.name="kumar";
junnu.number=1235678;
junnu.likes=25;
junnu.comments=13;
junnu.share=38;
System.out.println("========Facebook Details=======");
System.out.println("posts:" +junnu.posts);
System.out.println("followers:"+junnu.followers);
System.out.println("name="+junnu.name);
System.out.println("number:"+junnu.number);
System.out.println("like:"+junnu.likes);
System.out.println("comment:"+junnu.comments);
System.out.println("share="+junnu.share);
}
}





