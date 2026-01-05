package l1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l1.n */
/* loaded from: classes.dex */
public final class C4325n implements InterfaceC4326o {

    /* renamed from: b */
    public static final C4325n f21784b = new C4325n(0);

    /* renamed from: c */
    public static final C4325n f21785c = new C4325n(1);

    /* renamed from: a */
    public final /* synthetic */ int f21786a;

    public /* synthetic */ C4325n(int i10) {
        this.f21786a = i10;
    }

    @Override // l1.InterfaceC4326o
    /* renamed from: a */
    public final int mo9045a(int i10, int i11, int i12, int i13) {
        switch (this.f21786a) {
            case 0:
                return (((i10 - i12) - i13) / 2) - (i11 / 2);
            default:
                return 0;
        }
    }

    public final String toString() {
        switch (this.f21786a) {
            case 0:
                return "Center";
            default:
                return "Start";
        }
    }
}
