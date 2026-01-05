package g1;

import androidx.compose.animation.AbstractC0236c;
import h1.C2772c;
import h1.y1;
import k2.C3953b;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6756l;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 extends a1 {

    /* renamed from: q */
    public h1.a1 f10974q;

    /* renamed from: t */
    public boolean f10977t;

    /* renamed from: r */
    public long f10975r = AbstractC0236c.f1883a;

    /* renamed from: s */
    public long f10976s = AbstractC6746b.m12924b(0, 0, 15);

    /* renamed from: v */
    public final k2.e1 f10978v = C3953b.m8517t(null);

    public e1(h1.a1 a1Var) {
        this.f10974q = a1Var;
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        this.f10975r = AbstractC0236c.f1883a;
        this.f10977t = false;
    }

    @Override // w2.AbstractC7878q
    public final void F0() {
        this.f10978v.setValue(null);
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        t3.w0 w0VarMo13314z;
        char c2;
        long j10;
        c1 c1Var;
        long jM12926d;
        c1 c1Var2;
        if (l0Var.mo12874R()) {
            this.f10976s = j6;
            this.f10977t = true;
            w0VarMo13314z = i0Var.mo13314z(j6);
        } else {
            w0VarMo13314z = i0Var.mo13314z(this.f10977t ? this.f10976s : j6);
        }
        t3.w0 w0Var = w0VarMo13314z;
        long j11 = (w0Var.f34031b & 4294967295L) | (w0Var.f34030a << 32);
        if (l0Var.mo12874R()) {
            this.f10975r = j11;
            c2 = ' ';
            jM12926d = j11;
            j10 = jM12926d;
        } else {
            long j12 = !C6756l.m12948a(this.f10975r, AbstractC0236c.f1883a) ? this.f10975r : j11;
            k2.e1 e1Var = this.f10978v;
            c1 c1Var3 = (c1) e1Var.getValue();
            if (c1Var3 != null) {
                C2772c c2772c = c1Var3.f10947a;
                c2 = ' ';
                j10 = j11;
                boolean z6 = (C6756l.m12948a(j12, ((C6756l) c2772c.m6775d()).f32210a) || ((Boolean) c2772c.f15361d.getValue()).booleanValue()) ? false : true;
                if (!C6756l.m12948a(j12, ((C6756l) c2772c.f15362e.getValue()).f32210a) || z6) {
                    c1Var3.f10948b = ((C6756l) c2772c.m6775d()).f32210a;
                    c1Var2 = c1Var3;
                    tx.c0.m13502y(z0(), null, null, new k1.i0(c1Var2, j12, this, (InterfaceC7559c) null), 3);
                } else {
                    c1Var2 = c1Var3;
                }
                c1Var = c1Var2;
            } else {
                c2 = ' ';
                j10 = j11;
                long j13 = 1;
                c1Var = new c1(new C2772c(new C6756l(j12), y1.f15671h, new C6756l((j13 << 32) | (j13 & 4294967295L)), 8), j12);
            }
            e1Var.setValue(c1Var);
            jM12926d = AbstractC6746b.m12926d(j6, ((C6756l) c1Var.f10947a.m6775d()).f32210a);
        }
        int i10 = (int) (jM12926d >> c2);
        int i11 = (int) (jM12926d & 4294967295L);
        return l0Var.g0(i10, i11, C6669s.f31944a, new d1(this, j10, i10, i11, l0Var, w0Var));
    }
}
