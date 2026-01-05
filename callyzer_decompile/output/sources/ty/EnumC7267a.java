package ty;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.a */
/* loaded from: classes3.dex */
public enum EnumC7267a {
    SIZE(1),
    UIDGID(2),
    MODE(4),
    ACMODTIME(8),
    EXTENDED(Integer.MIN_VALUE);

    private final int flag;

    EnumC7267a(int i10) {
        this.flag = i10;
    }

    public int get() {
        return this.flag;
    }

    public boolean isSet(int i10) {
        int i11 = this.flag;
        return (i10 & i11) == i11;
    }
}
