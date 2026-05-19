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
}
