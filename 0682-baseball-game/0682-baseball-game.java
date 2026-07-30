class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        
        for (String op : operations) {
            int size = list.size();
            if (op.equals("C")) {
                list.remove(size - 1);
            } else if (op.equals("D")) {
                list.add(list.get(size - 1) * 2);
            } else if (op.equals("+")) {
                list.add(list.get(size - 1) + list.get(size - 2));
            } else {
                list.add(Integer.parseInt(op));
            }
        }
        
        int totalSum = 0;
        for (int score : list) {
            totalSum += score;
        }
        return totalSum;
    }
}
