package p001o;

/* loaded from: classes6.dex */
public enum hj6 {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final hj6[] FOR_BITS;
    private final int bits;

    static {
        hj6 hj6Var = L;
        hj6 hj6Var2 = M;
        hj6 hj6Var3 = Q;
        FOR_BITS = new hj6[]{hj6Var2, hj6Var, H, hj6Var3};
    }

    hj6(int i) {
        this.bits = i;
    }

    public static hj6 forBits(int i) {
        if (i >= 0) {
            hj6[] hj6VarArr = FOR_BITS;
            if (i < hj6VarArr.length) {
                return hj6VarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }
}
