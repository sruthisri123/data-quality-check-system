import java.util.*;

public class DataValidator {
    public static void main(String[] args) {
        System.out.println("---- Employee Data Validation Report ----\n");

        String[][] employees = {
            {"E101", "Anusha", "Developer", "75000"},
            {"E102", "Vikram", "", "67000"},
            {"E103", "Divya", "Tester", ""},
            {"E104", "", "Analyst", "81000"},
            {"E105", "Ravi", "HR", "null"}
        };

        int totalRecords = employees.length;
        int invalidCount = 0;

        for (int i = 0; i < totalRecords; i++) {
            boolean hasIssue = false;

            for (int j = 0; j < employees[i].length; j++) {
                if (employees[i][j].isEmpty() || employees[i][j].equalsIgnoreCase("null")) {
                    hasIssue = true;
                    break;
                }
            }

            if (hasIssue) {
                System.out.println("⚠️ Record " + (i + 1) + " has missing or invalid data.");
                invalidCount++;
            } else {
                System.out.println("✅ Record " + (i + 1) + " is valid.");
            }
        }

        double score = ((totalRecords - invalidCount) * 100.0) / totalRecords;
        System.out.println("\nTotal Records: " + totalRecords);
        System.out.println("Invalid Records: " + invalidCount);
        System.out.println("Overall Data Accuracy: " + String.format("%.2f", score) + "%");
    }
}
