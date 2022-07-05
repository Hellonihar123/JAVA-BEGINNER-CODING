
public class CountAllTHeWords {
//WAP to count all words in a string
	
	  static int wordcount(String string)  
      {  
        int count=0;  
    
          char ch[]= new char[string.length()];     
          for(int i=0;i<string.length();i++)  
          {  
              ch[i]= string.charAt(i);  
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  count++;  
          }  
          return count;  
      } 
	  
    public static void main(String[] args) {  
        String string ="   Hello everyone have a nice day";  
       System.out.println(wordcount(string) + " words.");   
  }  
		

	

}
