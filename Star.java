# Starr
import java.io.*;
import java.util.*;
public class Star
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    int l=s.length();
    char[] c=s.toCharArray();
    for(int i=0,j=i+1;i<l&&j<l;i++,j++)
    {
      if(c[i]==c[j])
      {
        System.out.print(c[i]+"*");
      }
      else
      {
        System.out.print(c[i]);
        
      }
    }
    for(int i=l-1;i<l;i++)
    {
      System.out.print(c[i]);
    }
    
  }
}
      
      
    
