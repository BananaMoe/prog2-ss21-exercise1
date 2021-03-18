import java.util.*;

public class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {

        if(!isValidList(grades)){
            return null;
        }

        if(!isValidNumberOfStudents(grades.get(0))){
            return null;
        }

        List<Integer> result = new ArrayList<Integer>();

        for(int i = 1; i <= grades.get(0); i++){
            if (isValidGrade(grades.get(i))) {
                result.add(roundUpGrade(grades.get(i)));
            } else {
                return null;
            }
        }

        return result;
    }

    private static int roundUpGrade(int x){
        if(x%10 < 5 && x%10 > 2 && isPassedGrade(x))
            return x + (5-x%10);
        else if(x%10 > 7 && x%10 != 0 && isPassedGrade(x))
            return x + (10-x%10);
        else
            return x;
    }

    private static boolean isPassedGrade(int x){
        if(x < 38)
            return false;
        else
            return true;
    }

    private static boolean isValidGrade(Integer x){
        if(x != null) {
            if (x <= 100 && x >= 0)
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

    private static boolean isValidList(List<Integer> x){
        if(x != null)
            return true;
        else
            return false;
    }

    private static boolean isValidNumberOfStudents(Integer x){
        if(x != null && x >= 1 && x <= 60)
            return true;
        else
            return false;
    }

}
