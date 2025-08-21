class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int c=0;c<=rowIndex;c++) {
            long value = nCr(rowIndex, c);

            list.add((int) value);
        }

        return list;
    }

    public long nCr(int n, int r) {
        long res = 1;
        for (int i=0;i<r;i++) {
            res *= n-i;
            res /= i+1;
        }

        return res;
    }
}