package we;

import android.util.SparseArray;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum j0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<j0> valueMap;
    private final int value;

    static {
        j0 j0Var = DEFAULT;
        j0 j0Var2 = UNMETERED_ONLY;
        j0 j0Var3 = UNMETERED_OR_DAILY;
        j0 j0Var4 = FAST_IF_RADIO_AWAKE;
        j0 j0Var5 = NEVER;
        j0 j0Var6 = UNRECOGNIZED;
        SparseArray<j0> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, j0Var);
        sparseArray.put(1, j0Var2);
        sparseArray.put(2, j0Var3);
        sparseArray.put(3, j0Var4);
        sparseArray.put(4, j0Var5);
        sparseArray.put(-1, j0Var6);
    }

    j0(int i10) {
        this.value = i10;
    }

    public static j0 forNumber(int i10) {
        if (i10 == 0) {
            return DEFAULT;
        }
        if (i10 == 1) {
            return UNMETERED_ONLY;
        }
        if (i10 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i10 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i10 != 4) {
            return null;
        }
        return NEVER;
    }

    public final int getNumber() {
        return this.value;
    }
}
