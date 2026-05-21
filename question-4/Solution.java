public class Solution{
  private int r;
  public int getPointsForRow(int targetRow){
   r = targetRow;
    int sum = 0;
    int k = 0;
    for(int c = 0; c < board[0].length ; c++){
      sum += board[r][c].getPoints();
      if(board[r][c].getColor().equals(board[r][c-1].getColor())){
        k++;
      }
    }
    if(k == 5){
      sum *= 2;
    }
    return sum;
  }
}
