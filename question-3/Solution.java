public class Solution{
 public int moreHistoryThanMathAbsences(ArrayList<CourseRecord> historyList, ArrayList <CourseRecord> mathList){
  int count = 0;
   for(CourseRecord historyRecord : historyList){
     String targetID = historyRecord.getStudentID();
      for(CourseRecord mathRecord : mathList){
        if(mathRecord.getStudentID().equals(targetID){
          if(historyRecord.getAbsences() > mathRecord.getAbsences()){
            count++
          }
          break;
        }
      }
   }
   return count;
 }
}
