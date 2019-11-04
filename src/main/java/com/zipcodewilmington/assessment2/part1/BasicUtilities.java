package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        Boolean result = value >= 5;
        return result;
    }

    public Boolean isLessThan7(Integer value) {
        Boolean result = value <= 7;
        return result;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {

        if (valueToEvaluate <= 7) {
            if (valueToEvaluate >= 5) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
//    public static void main(String[] args){
//        String response = "Yello";
//        char c = response.charAt(0);
//        if(c == 'Y'){
//            System.out.println("Do something");
//        }
//        else if(c == 'y'){
//            System.out.println("Do another thing");
//        }
//    }
//}

    public Boolean startsWith(String string, Character character) {
        char input = string.charAt(0);
        string.charAt(0);
        if (input == character){
            return true;
        }
        else if (input == character.toUpperCase(input)){
            return true;
        }
        return false;
    }
}
