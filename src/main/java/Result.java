import java.util.*;

public class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<Integer>();

        for(int i = 1; i <= grades.get(0); i++){
                result.add(roundUpGrade(grades.get(i)));
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

}
