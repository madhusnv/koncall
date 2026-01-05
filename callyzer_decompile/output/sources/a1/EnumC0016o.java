package a1;

import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.o */
/* loaded from: classes.dex */
public enum EnumC0016o {
    FILL_START(0),
    FILL_CENTER(1),
    FILL_END(2),
    FIT_START(3),
    FIT_CENTER(4),
    FIT_END(5);

    private final int mId;

    EnumC0016o(int i10) {
        this.mId = i10;
    }

    public static EnumC0016o fromId(int i10) {
        for (EnumC0016o enumC0016o : values()) {
            if (enumC0016o.mId == i10) {
                return enumC0016o;
            }
        }
        throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Unknown scale type id "));
    }

    public int getId() {
        return this.mId;
    }
}
