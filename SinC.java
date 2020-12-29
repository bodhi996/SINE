class SinC
{
 public static void main()
  {
     int i,j,a,b;
     for(i=0;i<=59;i++)
     {
        if(i==0)
         System.out.print("<");
        System.out.print("-");
        if(i==59)
         System.out.print(">");
     }
     System.out.println();
     for(i=0;i<340;i=i+10)
     {
       
       a=(int)((Math.sin((Math.PI/180)*i))*25);
       if(i>=0&&i<=180)
       {
       for(j=0;j<25;j++)
       System.out.print(" ");
       System.out.print("|"); 
       for(j=0;j<a;j++)
       System.out.print(" ");
       }
       else if(i>180)
       {
       for(j=0;j<=25+a;j++)
       {
       System.out.print(" ");
       
       
       }
       }
       if(i<330)
       System.out.print("GO Man Go");
       else if(i==330)
       System.out.print("  GO Man Go|");
       if(i>200&&i<330)
       {
       for(j=0;j<=23-(25+a+9);j++)
       System.out.print(" ");
       
       System.out.print("|");
    }
       System.out.println();
    }
 }
}
