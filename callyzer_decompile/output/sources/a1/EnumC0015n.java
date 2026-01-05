package a1;

import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.n */
/* loaded from: classes.dex */
public enum EnumC0015n {
    PERFORMANCE(0),
    COMPATIBLE(1);

    private final int mId;

    EnumC0015n(int i10) {
        this.mId = i10;
    }

    public static EnumC0015n fromId(int i10) {
        for (EnumC0015n enumC0015n : values()) {
            if (enumC0015n.mId == i10) {
                return enumC0015n;
            }
        }
        throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Unknown implementation mode id "));
    }

    public int getId() {
        return this.mId;
    }
}
