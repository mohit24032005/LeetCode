class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                char num = board[i][j];
                if (!set.add(num + " in row " + i)) {
                    return false;
                }
                if (!set.add(num + " in column " + j)) {
                    return false;
                }
                // 3 x 3 block
                int block = (i / 3) * 3 + (j / 3);
                if (!set.add(num + " in block " + block)) {
                    return false;
                }
            }
        }
        return true;
    }
}