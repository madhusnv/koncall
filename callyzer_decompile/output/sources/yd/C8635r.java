package yd;

import b00.AbstractC0532q;
import b00.C0539x;
import b00.InterfaceC0528m;
import ke.AbstractC4066g;
import kotlin.jvm.internal.AbstractC4154l;
import pg.k8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yd.r */
/* loaded from: classes.dex */
public final class C8635r extends AbstractC8633p {

    /* renamed from: a */
    public final k8 f41913a;

    /* renamed from: b */
    public boolean f41914b;

    /* renamed from: c */
    public final InterfaceC0528m f41915c;

    public C8635r(InterfaceC0528m interfaceC0528m, k8 k8Var) {
        this.f41913a = k8Var;
        this.f41915c = interfaceC0528m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f41914b = true;
        InterfaceC0528m interfaceC0528m = this.f41915c;
        if (interfaceC0528m != null) {
            AbstractC4066g.m8840a(interfaceC0528m);
        }
    }

    @Override // yd.AbstractC8633p
    /* renamed from: h */
    public final k8 mo15961h() {
        return this.f41913a;
    }

    @Override // yd.AbstractC8633p
    /* renamed from: j */
    public final synchronized InterfaceC0528m mo15962j() {
        InterfaceC0528m interfaceC0528m;
        try {
            if (this.f41914b) {
                throw new IllegalStateException("closed");
            }
            interfaceC0528m = this.f41915c;
            if (interfaceC0528m == null) {
                C0539x c0539x = AbstractC0532q.f3663a;
                AbstractC4154l.m8920c(null);
                c0539x.mo1604S(null);
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return interfaceC0528m;
    }
}
