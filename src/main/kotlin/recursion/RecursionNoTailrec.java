package recursion;

import kotlin.Metadata;

@Metadata(
        mv = {1, 4, 0},
        bv = {1, 0, 3},
        k = 2,
        d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¨\u0006\u0006"},
        d2 = {"main", "", "sum", "", "x", "total", "examples"}
)
public final class RecursionNoTailrec {
    public static final int sum(int x, int total) {
        return x == 0 ? total : sum(x - 1, total + x);
    }

    // $FF: synthetic method
    public static int sum$default(int var0, int var1, int var2, Object var3) {
        if ((var2 & 2) != 0) {
            var1 = 0;
        }

        return sum(var0, var1);
    }

    public static final void main() {
        int var0 = sum$default(5, 0, 2, (Object)null);
        boolean var1 = false;
        System.out.println(var0);
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }
}
