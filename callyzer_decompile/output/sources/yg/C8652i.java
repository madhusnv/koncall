package yg;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yg.i */
/* loaded from: classes.dex */
public final class C8652i implements InterfaceC8648e, InterfaceC8647d, InterfaceC8645b {

    /* renamed from: a */
    public final Object f41933a = new Object();

    /* renamed from: b */
    public final int f41934b;

    /* renamed from: c */
    public final C8656m f41935c;

    /* renamed from: d */
    public int f41936d;

    /* renamed from: e */
    public int f41937e;

    /* renamed from: f */
    public int f41938f;

    /* renamed from: g */
    public Exception f41939g;

    /* renamed from: h */
    public boolean f41940h;

    public C8652i(int i10, C8656m c8656m) {
        this.f41934b = i10;
        this.f41935c = c8656m;
    }

    /* renamed from: a */
    public final void m15972a() {
        int i10 = this.f41936d + this.f41937e + this.f41938f;
        int i11 = this.f41934b;
        if (i10 == i11) {
            Exception exc = this.f41939g;
            C8656m c8656m = this.f41935c;
            if (exc == null) {
                if (this.f41940h) {
                    c8656m.m15989p();
                    return;
                } else {
                    c8656m.m15988o(null);
                    return;
                }
            }
            c8656m.m15987n(new ExecutionException(this.f41937e + " out of " + i11 + " underlying tasks failed", this.f41939g));
        }
    }

    @Override // yg.InterfaceC8648e
    /* renamed from: g */
    public final void mo27g(Object obj) {
        synchronized (this.f41933a) {
            this.f41936d++;
            m15972a();
        }
    }

    @Override // yg.InterfaceC8645b
    /* renamed from: k */
    public final void mo1946k() {
        synchronized (this.f41933a) {
            this.f41938f++;
            this.f41940h = true;
            m15972a();
        }
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public final void mo780n(Exception exc) {
        synchronized (this.f41933a) {
            this.f41937e++;
            this.f41939g = exc;
            m15972a();
        }
    }
}
