public class solution{
 private String username;
  public Account(String requestedName){
  username = requestedName;
    int k = 1;
    if(isAvailable(username)){
     username = requestedName;
    } else if(!isAvailable(username)){
      while(k>0){
        String newName = username + k;
        if(isAvailable(newName)){
          username = newName;
          break;
        } else{
         k++;
        }
      }
    }
  }

 public String getShortenedName(){
  String result = "";
  int i = 0;
   while(i < username.length()){
    if(i + 1 < username.length() && username.substring(i+1, i+2)){
     i+= 2;
    } else {
     result += username.substring(i,i+1);
     i++;
    }
   }
  return result;
 }
}
