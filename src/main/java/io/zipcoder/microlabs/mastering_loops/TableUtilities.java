package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++){
             if ((i*j)< 10){
                sb.append("  " + (i*j) +" |");
            } else if ((i*j) <= 99){
                sb.append(" " + (i*j) +" |");
            } else {
                sb.append((i*j) +" |");
            }

            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
