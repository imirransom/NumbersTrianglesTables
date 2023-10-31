package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return null;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++){
                sb.append(i*j);
            } if (i < 10){
                sb.append("\n  ");
            } else if (i >= 10 && i <= 99){
                sb.append("\n ");
            } else {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
