public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year){
        if(day>=1 && day<=30){
            day++;
        }else {
            day = 1;
            if(month>=1 && month<12){
                month++;
            }else {
                month = 1;
                 year++;
            }
        }
//return "" + day + " " + month + " " +year + "";
        return ""+day+" "+month+" "+year+"";
    }
}
