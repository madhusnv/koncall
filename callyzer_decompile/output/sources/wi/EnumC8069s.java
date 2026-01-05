package wi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.s */
/* loaded from: classes.dex */
public enum EnumC8069s {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: id, reason: collision with root package name */
    private final int f44865id;

    EnumC8069s(int i10) {
        this.f44865id = i10;
    }

    public static EnumC8069s determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f44865id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f44865id);
    }
}
