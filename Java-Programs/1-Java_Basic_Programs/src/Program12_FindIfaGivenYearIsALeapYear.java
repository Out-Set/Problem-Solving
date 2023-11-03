public class Program12_FindIfaGivenYearIsALeapYear {
    public static void main(String[] args){

        LeapYear.isLeapYear(2022);
        LeapYear.isLeapYear(2012);
    }
}

// A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
// A leap year (except a century year) can be identified if it is exactly divisible by 4.
// A century year should be divisible by 4 and 100 both.
// A non-century year should be divisible only by 4.

class LeapYear{
    static void isLeapYear(int year){
        // 1st, check if It is century leap year
        // 2nd, check if It is leap year and not century year
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}