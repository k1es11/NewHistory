public class Main
{
    public static void main(String[] args) {
        solve(980, 2, 12, 10, 30, 1,
                980, 3, 1, 10, 31, 37);

        solve(1001, 5, 20, 14, 15, 16,
                9009, 9, 11, 12, 21, 11);
    }

    public static long[] solve(long y1, long m1, long d1, long h1, long min1, long s1,
                             long y2, long m2, long d2, long h2, long min2, long s2) {
        long firstSeconds = convertToSeconds(y1, m1, d1, h1, min1, s1);
        long secondSeconds = convertToSeconds(y2, m2, d2, h2, min2, s2);
        System.out.print(Math.abs(secondSeconds - firstSeconds) / (3600 * 24) + " ");
        System.out.println(Math.abs(secondSeconds - firstSeconds) % (3600 * 24));
        return new long[] {Math.abs(secondSeconds - firstSeconds) / (3600 * 24),
                Math.abs(secondSeconds - firstSeconds) % (3600 * 24)
        };
    }

    public static long convertToSeconds(long y, long m, long d,
                                        long h, long min, long s) {
        return s
                + min * 60
                + h * 3600
                + d * 24 * 3600
                + getMonthSeconds(m)
                + y * 365 * 24 * 3600;
    }

    public static long getMonthSeconds(long m) {
        long[] mDays = new long[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        long result = 0;
        for (int i = 0; i < m - 1; i++) {
            result += mDays[i] * 24 * 3600;
        }

        return result;
    }
}