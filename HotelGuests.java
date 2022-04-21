public class HotelGuests {

    //average attendance throughout the year
    public int average(int[] monthlyStatistics){
        int sum = 0;
        for (int numbers : monthlyStatistics){
            sum += numbers;
        }
        return sum/monthlyStatistics.length;
    }

    //total number of visitors in the summer months (6, 7, 8)
    public int summerHoliday(int[] monthlyStatistics){
        return monthlyStatistics[5] + monthlyStatistics[6]+ monthlyStatistics[7];
    }

    //month in which the maximum number of visitors was registered
    public int bestMonth(int[] monthlyStatistics){
        int bMonthIndex = 0;
        int bMonthValue = 0;
        for (int i = 0; i < monthlyStatistics.length; i++){
            if(monthlyStatistics[i] > bMonthValue){
                bMonthValue = monthlyStatistics[i];
                bMonthIndex = i+1;
            }
        }
        return bMonthIndex;
    }

    //month in which the minimum number of visitors was registered
    public int worstNumber(int[] monthlyStatistics) {
        int wMonthIndex = 0;
        int wMonthValue = 0;
        for (int i = 0; i < monthlyStatistics.length; i++){
            if (monthlyStatistics[i] < wMonthValue){
                wMonthValue = monthlyStatistics[i];
                wMonthIndex = i+1;
            }
        }
        return wMonthIndex;
    }

    //average attendance excluding the summer months
    public int avgNoSummer(int[] monthlyStatistics){
        int sum = 0;
        for(int i = 0; i < monthlyStatistics.length; i++){
            if(i != 5 && i != 6 && i != 7){
                sum += monthlyStatistics[i];
            }
        }
        return sum/9;
    }

    public static void main(String[] args){

        HotelGuests hG = new HotelGuests();

        //input
        int[] monthlyStatistics = {18,89,50,39,38,17,56,85,64,53,12,31};

        //calc
        int averageNumberOfGuests = hG.average(monthlyStatistics);
        int totalSummerGuests = hG.summerHoliday(monthlyStatistics);
        int monthWithMaxGuests = hG.bestMonth(monthlyStatistics);
        int monthWithMinGuests = hG.worstNumber(monthlyStatistics);
        int averageWithoutSummer = hG.avgNoSummer(monthlyStatistics);

        //sysout
        System.out.println("Avg number of guests: " + averageNumberOfGuests);
        System.out.println("Total number of guests in summer: " + totalSummerGuests);
        System.out.println("Month with max number of guests: " + monthWithMaxGuests);
        System.out.println("Month with min number of guests: " + monthWithMinGuests);
        System.out.println("Avg number of guests (no summer): " + averageWithoutSummer);
    }

}
