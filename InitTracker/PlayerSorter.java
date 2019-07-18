public class PlayerSorter {

    public static void sort(initiativeList list) {
        Player check0;
        Player check1;

        for (int i = 0; i < list.size(); i++) {
            check0 = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                check1 = list.get(j);
                if (check0.compareTo(check1) == 1) {
                    list.swap(i, j);
                    check0 = list.get(i);
                    check1 = list.get(j);
                }
            }
        }
        list.print();
    }
}