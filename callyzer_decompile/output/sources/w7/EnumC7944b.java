package w7;

import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w7.b */
/* loaded from: classes.dex */
public enum EnumC7944b {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    EnumC7944b(long j6) {
        this.mValue = j6;
    }

    public static EnumC7944b fromValue(long j6) {
        EnumC7944b[] enumC7944bArrValues = values();
        for (int i10 = 0; i10 < enumC7944bArrValues.length; i10++) {
            if (enumC7944bArrValues[i10].getValue() == j6) {
                return enumC7944bArrValues[i10];
            }
        }
        throw new IllegalArgumentException(a1.m14330j("Unsupported FileSection Type ", j6));
    }

    public long getValue() {
        return this.mValue;
    }
}
