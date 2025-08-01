public class HomeMakeoverReportT2 {
    public static void main(String[] args) {
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
        int[][] makeovers = {
            {8, 2, 6},
            {7, 4, 5},
            {5, 6, 2},
            {2, 2, 3},
            {7, 7, 9},
            {7, 9, 6}
        };

        System.out.println("-------------------------------------------------------");
        System.out.println("                 HOME MAKEOVER REPORT                  ");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-10s%-12s%-12s%-12s%n", "", "Bathrooms", "Kitchens", "Garden");

        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-10s%-12d%-12d%-12d%n", months[i],
                    makeovers[i][0], makeovers[i][1], makeovers[i][2]);
        }

        System.out.println("\n-------------------- MONTHLY TOTALS -------------------");

        for (int i = 0; i < months.length; i++) {
            int total = makeovers[i][0] + makeovers[i][1] + makeovers[i][2];
            System.out.printf("%-10s%-5d", months[i], total);

            if (total >= 15) {
                System.out.print("   ***");
            }

            System.out.println();
        }

        System.out.println("-------------------------------------------------------");
    }
}
