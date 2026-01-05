package g1;

import androidx.compose.animation.AbstractC0234a;
import h1.l1;
import h1.m1;
import rw.C6669s;
import s4.C6756l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.q */
/* loaded from: classes.dex */
public final class C2437q extends a1 {

    /* renamed from: q */
    public m1 f11051q;

    /* renamed from: r */
    public k2.w0 f11052r;

    /* renamed from: s */
    public C2438r f11053s;

    /* renamed from: t */
    public long f11054t;

    @Override // w2.AbstractC7878q
    public final void F0() {
        this.f11054t = AbstractC0234a.f1882a;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        long j10;
        t3.w0 w0VarMo13314z = i0Var.mo13314z(j6);
        if (l0Var.mo12874R()) {
            j10 = (w0VarMo13314z.f34030a << 32) | (w0VarMo13314z.f34031b & 4294967295L);
        } else {
            m1 m1Var = this.f11051q;
            if (m1Var == null) {
                j10 = (w0VarMo13314z.f34030a << 32) | (w0VarMo13314z.f34031b & 4294967295L);
                this.f11054t = j10;
            } else {
                long j11 = (w0VarMo13314z.f34031b & 4294967295L) | (w0VarMo13314z.f34030a << 32);
                l1 l1VarM6838a = m1Var.m6838a(new C2436p(this, j11, 0), new C2436p(this, j11, 1));
                this.f11053s.getClass();
                j10 = ((C6756l) l1VarM6838a.getValue()).f32210a;
                this.f11054t = ((C6756l) l1VarM6838a.getValue()).f32210a;
            }
        }
        return l0Var.g0((int) (j10 >> 32), (int) (4294967295L & j10), C6669s.f31944a, new C2435o(this, w0VarMo13314z, j10));
    }
}
