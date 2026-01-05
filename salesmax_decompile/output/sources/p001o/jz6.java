package p001o;

/* loaded from: classes2.dex */
public enum jz6 {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    jz6(long j) {
        this.mValue = j;
    }

    public static jz6 fromValue(long j) {
        jz6[] jz6VarArrValues = values();
        for (int i = 0; i < jz6VarArrValues.length; i++) {
            if (jz6VarArrValues[i].getValue() == j) {
                return jz6VarArrValues[i];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j);
    }

    public long getValue() {
        return this.mValue;
    }
}
