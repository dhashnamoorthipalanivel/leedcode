class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for (String op : operations) {
            switch (op) {
                case "+":
                    int top = s.pop();
                    int newScore = top + s.peek();
                    s.push(top);
                    s.push(newScore);
                    break;

                case "D":
                    s.push(s.peek() * 2);
                    break;

                case "C":
                    s.pop();
                    break;

                default:
                    s.push(Integer.parseInt(op));
                    break;
            }
        }

        int sum = 0;
        for (int score : s) {
            sum += score;
        }

        return sum;
    }
}
