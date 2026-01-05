package d7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a */
    public final h0 f8075a;

    /* renamed from: b */
    public boolean f8076b;

    /* renamed from: c */
    public int f8077c = -1;

    /* renamed from: d */
    public final /* synthetic */ d0 f8078d;

    public c0(d0 d0Var, h0 h0Var) {
        this.f8078d = d0Var;
        this.f8075a = h0Var;
    }

    /* renamed from: a */
    public final void m5308a(boolean z6) {
        if (z6 == this.f8076b) {
            return;
        }
        this.f8076b = z6;
        int i10 = z6 ? 1 : -1;
        d0 d0Var = this.f8078d;
        int i11 = d0Var.f8085c;
        d0Var.f8085c = i10 + i11;
        if (!d0Var.f8086d) {
            d0Var.f8086d = true;
            while (true) {
                try {
                    int i12 = d0Var.f8085c;
                    if (i11 == i12) {
                        break;
                    }
                    boolean z10 = i11 == 0 && i12 > 0;
                    boolean z11 = i11 > 0 && i12 == 0;
                    if (z10) {
                        d0Var.mo5317g();
                    } else if (z11) {
                        d0Var.mo5318h();
                    }
                    i11 = i12;
                } catch (Throwable th2) {
                    d0Var.f8086d = false;
                    throw th2;
                }
            }
            d0Var.f8086d = false;
        }
        if (this.f8076b) {
            d0Var.m5313c(this);
        }
    }

    /* renamed from: c */
    public boolean mo5306c(InterfaceC1649u interfaceC1649u) {
        return false;
    }

    /* renamed from: d */
    public abstract boolean mo5302d();

    /* renamed from: b */
    public void mo5305b() {
    }
}
