package Chapter1;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of CaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class CaesarCipher {
    public String encrypt(String input,int key)
    {
        String alphabet=new String("abcdefghijklmnopqrstuvwxyz");
        String encr=alphabet.substring(key)+alphabet.substring(0,key);
        String origInput=new String(input);
        input=input.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
           char c=input.charAt(i);
           int idx=alphabet.indexOf(c);
           if(idx!=-1)
           {
               sb.append(encr.charAt(idx));
           }
           else
           {
               sb.append(c);
           }
        }
        return sb.toString();
    }
    
     public static String encrypt2(String input,int key1,int key2)
    {
        String alphabet=new String("abcdefghijklmnopqrstuvwxyz");
        String encr1=alphabet.substring(key1)+alphabet.substring(0,key1);
        String encr2=alphabet.substring(key2)+alphabet.substring(0,key2);
        input=input.toLowerCase();
        int num=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
           char c=input.charAt(i);
           int idx=alphabet.indexOf(c);
           if(idx!=-1)
           {
               if(i%2==0){ sb.append(encr1.charAt(idx));}
               else{sb.append(encr2.charAt(idx));}
               num++;
           }
           else
           {
               sb.append(c);
           }
        }
        return sb.toString();
    }
    
    public static String getStringFromPos(int start,String str)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=start;i<str.length();i=i+2)
        {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    
    public static int getDkey(String str)
    {
        int ans=0;
        int a[]=new int[26];
        str=str.toLowerCase();
        int temp;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                temp=str.charAt(i)-97;
                a[temp]++;
            }
        }
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<26;i++)
        {
            if(maxValue<a[i])
            {
                maxValue=a[i];
                ans=i;
            }
        }
        ans=ans-4;
        if(ans<0){ans=ans+26;}
        return ans;
    }
    
    public static String decryptDouble(String str)
    {
        //get str1 and str2
        String str1=getStringFromPos(0,str);
        String str2=getStringFromPos(1,str);
        System.out.println(str1+"\t"+str2);
        //get dkeys for str1 and str2
        int dkey1=26-getDkey(str1);
        int dkey2=26-getDkey(str2);
        System.out.println(dkey1+"\t"+dkey2);
        return encrypt2(str,dkey1,dkey2);
        //get String as encrypt(str,dkey1,dkey2)
    }
    
    public void test() throws FileNotFoundException
    {
       //String str=new String("Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!");
       //String temp=encrypt2(str,24,6);
    	String str = new Scanner(new File("test1")).useDelimiter("\\Z").next();
    	System.out.println(decryptDouble(str));
       
       //String temp2=encrypt(str,15);
       //System.out.println(temp2);
        //System.out.println(encrypt(temp,23));
    }
    
    public static void main(String args[]) throws FileNotFoundException
    {
    	CaesarCipher cc=new CaesarCipher();
    	cc.test();
    }
}
