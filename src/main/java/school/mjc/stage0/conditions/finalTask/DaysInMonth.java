package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int check = year % 4;
        int roundYearCheck = year % 400;
        String TypeYear;
        if (year % 100 == 0) {
            switch (roundYearCheck) {
                default:
                    TypeYear = "not leap";
                    break;
                case (0):
                    TypeYear = "leap";
                    break;
            }
        } else {
            switch (check) {
                default:
                    TypeYear = "not leap";
                    break;
                case (0):
                    TypeYear = "leap";
                    break;
            }
        }
        if (TypeYear == "leap") {
            switch (month) {
                default:
                    System.out.println("invalid date");
                    break;
                case (1):
                case (3):
                case (12):
                case (5):
                case (7):
                case (8):
                case (10):
                    System.out.println("31");
                    break;
                case (2):
                    System.out.println("29");
                    break;
                case (4):
                case (6):
                case (9):
                case (11):
                    System.out.println("30");
                    break;
            }
        } else {
            switch (month) {
                default:
                    System.out.println("invalid date");
                    break;
                case (1):
                case (3):
                case (12):
                case (5):
                case (7):
                case (8):
                case (10):
                    System.out.println("31");
                    break;
                case (2):
                    System.out.println("28");
                    break;
                case (4):
                case (6):
                case (9):
                case (11):
                    System.out.println("30");
                    break;
            }
        }
    }
}