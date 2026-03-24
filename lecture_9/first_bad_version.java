public class first_bad_version {

    // let's assume version 4 is first bad
    static int bad = 4;

    public static void main(String[] args) {
        int n = 10;

        first_bad_version obj = new first_bad_version();
        System.out.println(obj.firstBadVersion(n));
    }

    public int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        int ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (isBadVersion(mid)) {
                ans = mid;
                hi = mid - 1;   // search left
            } else {
                lo = mid + 1;   // search right
            }
        }
        return ans;
    }

    private boolean isBadVersion(int mid) {
        return mid >= bad;   // simulate API
    }
}
