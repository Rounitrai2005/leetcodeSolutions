class Solution {
    public int daysBetweenDates(String date1, String date2) {

        return Math.abs(convertToDays(date1) - convertToDays(date2));
    }

    public int convertToDays(String date) {

        String[] arr = date.split("-");

        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        int y = year - 1;

        int totalDays = y * 365
                      + y / 4
                      - y / 100
                      + y / 400;

        int[] days = {31, 28, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            days[1] = 29;
        }
        for (int i = 0; i < month - 1; i++) {
            totalDays += days[i];
        }
        totalDays += day;

        return totalDays;
    }
}