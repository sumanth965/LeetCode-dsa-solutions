class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row=0;
        int col=0;
        for(String command:commands){
            if (command.equals("RIGHT")) {
                col++;
            }
            if (command.equals("DOWN")) {
                row++;
            }
            if (command.equals("UP")) {
                row--;
            }
            if (command.equals("LEFT")) {
                col--;
            }
        } return row * n + col;
    }
}