package we;

import android.util.SparseArray;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: we.z */
/* loaded from: classes.dex */
public enum EnumC8024z {
    NOT_SET(0),
    EVENT_OVERRIDE(5);

    private static final SparseArray<EnumC8024z> valueMap;
    private final int value;

    static {
        EnumC8024z enumC8024z = NOT_SET;
        EnumC8024z enumC8024z2 = EVENT_OVERRIDE;
        SparseArray<EnumC8024z> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, enumC8024z);
        sparseArray.put(5, enumC8024z2);
    }

    EnumC8024z(int i10) {
        this.value = i10;
    }

    public static EnumC8024z forNumber(int i10) {
        return valueMap.get(i10);
    }

    public int getValue() {
        return this.value;
    }
}
