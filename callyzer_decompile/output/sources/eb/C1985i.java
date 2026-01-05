package eb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eb.i */
/* loaded from: classes.dex */
public final class C1985i extends AbstractC1991o {

    /* renamed from: b */
    public static final C1985i f9329b = new C1985i(0);

    /* renamed from: c */
    public static final C1985i f9330c = new C1985i(1);

    /* renamed from: d */
    public static final C1985i f9331d = new C1985i(2);

    /* renamed from: a */
    public final /* synthetic */ int f9332a;

    public /* synthetic */ C1985i(int i10) {
        this.f9332a = i10;
    }

    @Override // eb.AbstractC1991o
    /* renamed from: a */
    public final String mo5721a() {
        switch (this.f9332a) {
            case 0:
                return "ADMIN_NO_SRP_AUTH";
            case 1:
                return "ADMIN_USER_PASSWORD_AUTH";
            default:
                return "REFRESH_TOKEN_AUTH";
        }
    }

    public final String toString() {
        switch (this.f9332a) {
            case 0:
                return "AdminNoSrpAuth";
            case 1:
                return "AdminUserPasswordAuth";
            default:
                return "RefreshTokenAuth";
        }
    }
}
