package t3;

import ex.InterfaceC2139c;
import pg.w9;
import s4.C6745a;
import s4.C6756l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a */
    public int f34030a;

    /* renamed from: b */
    public int f34031b;

    /* renamed from: c */
    public long f34032c;

    /* renamed from: d */
    public long f34033d = y0.f34046a;

    /* renamed from: e */
    public long f34034e = 0;

    public w0() {
        long j6 = 0;
        this.f34032c = (j6 & 4294967295L) | (j6 << 32);
    }

    /* renamed from: C */
    public Object mo13310C() {
        return null;
    }

    public abstract int d0(C7027n c7027n);

    public int f0() {
        return (int) (this.f34032c & 4294967295L);
    }

    public int h0() {
        return (int) (this.f34032c >> 32);
    }

    public final void j0() {
        this.f34030a = w9.m11912c((int) (this.f34032c >> 32), C6745a.m12920k(this.f34033d), C6745a.m12918i(this.f34033d));
        this.f34031b = w9.m11912c((int) (this.f34032c & 4294967295L), C6745a.m12919j(this.f34033d), C6745a.m12917h(this.f34033d));
        int i10 = this.f34030a;
        long j6 = this.f34032c;
        this.f34034e = (((i10 - ((int) (j6 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j6 & 4294967295L))) / 2));
    }

    public abstract void k0(long j6, float f6, InterfaceC2139c interfaceC2139c);

    public final void m0(long j6) {
        if (C6756l.m12948a(this.f34032c, j6)) {
            return;
        }
        this.f34032c = j6;
        j0();
    }

    public final void q0(long j6) {
        if (C6745a.m12912c(this.f34033d, j6)) {
            return;
        }
        this.f34033d = j6;
        j0();
    }
}
