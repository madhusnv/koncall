package zb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zb.e */
/* loaded from: classes.dex */
public final class C8911e extends AbstractC8912f {

    /* renamed from: d */
    public static final C8911e f42873d = new C8911e(0, 0);

    /* renamed from: e */
    public static final C8911e f42874e = new C8911e(1, 1);

    /* renamed from: f */
    public static final C8911e f42875f = new C8911e(3, 2);

    /* renamed from: g */
    public static final C8911e f42876g = new C8911e(4, 3);

    /* renamed from: h */
    public static final C8911e f42877h = new C8911e(12, 4);

    /* renamed from: c */
    public final /* synthetic */ int f42878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8911e(int i10, int i11) {
        super(i10);
        this.f42878c = i11;
    }

    @Override // zb.AbstractC8912f
    public String toString() {
        switch (this.f42878c) {
            case 0:
                return "Default";
            case 1:
                return "LogRequest";
            case 2:
                return "LogRequestWithBody";
            case 3:
                return "LogResponse";
            case 4:
                return "LogResponseWithBody";
            default:
                return super.toString();
        }
    }
}
