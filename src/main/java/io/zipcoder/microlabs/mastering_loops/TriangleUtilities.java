package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfRows; i++){
            for (int j = 0; j < numberOfRows; j++){
                sb.append("*\n");
            }
        } sb.append("*\n");
        return sb.toString();
    }

    public static String getRow(int numberOfStars) {
    return null;}

    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
