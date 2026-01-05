package p001o;

import android.util.SparseArray;

/* loaded from: classes5.dex */
public enum z3e {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<z3e> valueMap;
    private final int value;

    static {
        z3e z3eVar = DEFAULT;
        z3e z3eVar2 = UNMETERED_ONLY;
        z3e z3eVar3 = UNMETERED_OR_DAILY;
        z3e z3eVar4 = FAST_IF_RADIO_AWAKE;
        z3e z3eVar5 = NEVER;
        z3e z3eVar6 = UNRECOGNIZED;
        SparseArray<z3e> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, z3eVar);
        sparseArray.put(1, z3eVar2);
        sparseArray.put(2, z3eVar3);
        sparseArray.put(3, z3eVar4);
        sparseArray.put(4, z3eVar5);
        sparseArray.put(-1, z3eVar6);
    }

    z3e(int i) {
        this.value = i;
    }

    public static z3e forNumber(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i != 4) {
            return null;
        }
        return NEVER;
    }

    public final int getNumber() {
        return this.value;
    }
}
