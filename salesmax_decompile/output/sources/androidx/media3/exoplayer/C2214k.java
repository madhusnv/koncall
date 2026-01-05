package androidx.media3.exoplayer;

import androidx.media3.exoplayer.C2213j;
import java.io.IOException;
import p001o.auh;
import p001o.buh;
import p001o.fb3;
import p001o.ko6;
import p001o.lmh;
import p001o.ob0;
import p001o.op0;
import p001o.p66;
import p001o.ria;
import p001o.sth;
import p001o.t0f;
import p001o.x4b;
import p001o.x8b;
import p001o.y4b;

/* renamed from: androidx.media3.exoplayer.k */
/* loaded from: classes2.dex */
public final class C2214k {

    /* renamed from: a */
    public final x4b f8427a;

    /* renamed from: b */
    public final Object f8428b;

    /* renamed from: c */
    public final t0f[] f8429c;

    /* renamed from: d */
    public boolean f8430d;

    /* renamed from: e */
    public boolean f8431e;

    /* renamed from: f */
    public y4b f8432f;

    /* renamed from: g */
    public boolean f8433g;

    /* renamed from: h */
    public final boolean[] f8434h;

    /* renamed from: i */
    public final InterfaceC2221p[] f8435i;

    /* renamed from: j */
    public final auh f8436j;

    /* renamed from: k */
    public final C2216m f8437k;

    /* renamed from: l */
    public C2214k f8438l;

    /* renamed from: m */
    public sth f8439m;

    /* renamed from: n */
    public buh f8440n;

    /* renamed from: o */
    public long f8441o;

    /* renamed from: androidx.media3.exoplayer.k$a */
    public interface a {
        /* renamed from: a */
        C2214k mo7304a(y4b y4bVar, long j);
    }

    public C2214k(InterfaceC2221p[] interfaceC2221pArr, long j, auh auhVar, ob0 ob0Var, C2216m c2216m, y4b y4bVar, buh buhVar) {
        this.f8435i = interfaceC2221pArr;
        this.f8441o = j;
        this.f8436j = auhVar;
        this.f8437k = c2216m;
        x8b.C18076b c18076b = y4bVar.f54866a;
        this.f8428b = c18076b.f53356a;
        this.f8432f = y4bVar;
        this.f8439m = sth.f45921d;
        this.f8440n = buhVar;
        this.f8429c = new t0f[interfaceC2221pArr.length];
        this.f8434h = new boolean[interfaceC2221pArr.length];
        this.f8427a = m7275f(c18076b, c2216m, ob0Var, y4bVar.f54867b, y4bVar.f54869d);
    }

    /* renamed from: f */
    public static x4b m7275f(x8b.C18076b c18076b, C2216m c2216m, ob0 ob0Var, long j, long j2) {
        x4b x4bVarM7369h = c2216m.m7369h(c18076b, ob0Var, j);
        return j2 != -9223372036854775807L ? new fb3(x4bVarM7369h, true, 0L, j2) : x4bVarM7369h;
    }

    /* renamed from: w */
    public static void m7276w(C2216m c2216m, x4b x4bVar) {
        try {
            if (x4bVar instanceof fb3) {
                c2216m.m7381z(((fb3) x4bVar).f23078a);
            } else {
                c2216m.m7381z(x4bVar);
            }
        } catch (RuntimeException e) {
            ria.m46820d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: A */
    public long m7277A(long j) {
        return j - m7291m();
    }

    /* renamed from: B */
    public long m7278B(long j) {
        return j + m7291m();
    }

    /* renamed from: C */
    public void m7279C() {
        x4b x4bVar = this.f8427a;
        if (x4bVar instanceof fb3) {
            long j = this.f8432f.f54869d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((fb3) x4bVar).m26370r(0L, j);
        }
    }

    /* renamed from: a */
    public long m7280a(buh buhVar, long j, boolean z) {
        return m7281b(buhVar, j, z, new boolean[this.f8435i.length]);
    }

    /* renamed from: b */
    public long m7281b(buh buhVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= buhVar.f16840a) {
                break;
            }
            boolean[] zArr2 = this.f8434h;
            if (z || !buhVar.m19841b(this.f8440n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        m7286h(this.f8429c);
        m7285g();
        this.f8440n = buhVar;
        m7287i();
        long jMo7016u = this.f8427a.mo7016u(buhVar.f16842c, this.f8434h, this.f8429c, zArr, j);
        m7282c(this.f8429c);
        this.f8431e = false;
        int i2 = 0;
        while (true) {
            t0f[] t0fVarArr = this.f8429c;
            if (i2 >= t0fVarArr.length) {
                return jMo7016u;
            }
            if (t0fVarArr[i2] != null) {
                op0.m42517g(buhVar.m19842c(i2));
                if (this.f8435i[i2].mo6888f() != -2) {
                    this.f8431e = true;
                }
            } else {
                op0.m42517g(buhVar.f16842c[i2] == null);
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void m7282c(t0f[] t0fVarArr) {
        int i = 0;
        while (true) {
            InterfaceC2221p[] interfaceC2221pArr = this.f8435i;
            if (i >= interfaceC2221pArr.length) {
                return;
            }
            if (interfaceC2221pArr[i].mo6888f() == -2 && this.f8440n.m19842c(i)) {
                t0fVarArr[i] = new p66();
            }
            i++;
        }
    }

    /* renamed from: d */
    public boolean m7283d(y4b y4bVar) {
        if (C2215l.m7309d(this.f8432f.f54870e, y4bVar.f54870e)) {
            y4b y4bVar2 = this.f8432f;
            if (y4bVar2.f54867b == y4bVar.f54867b && y4bVar2.f54866a.equals(y4bVar.f54866a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m7284e(long j, float f, long j2) {
        op0.m42517g(m7298t());
        this.f8427a.mo7003c(new C2213j.b().m7273f(m7277A(j)).m7274g(f).m7272e(j2).m7271d());
    }

    /* renamed from: g */
    public final void m7285g() {
        if (!m7298t()) {
            return;
        }
        int i = 0;
        while (true) {
            buh buhVar = this.f8440n;
            if (i >= buhVar.f16840a) {
                return;
            }
            boolean zM19842c = buhVar.m19842c(i);
            ko6 ko6Var = this.f8440n.f16842c[i];
            if (zM19842c && ko6Var != null) {
                ko6Var.disable();
            }
            i++;
        }
    }

    /* renamed from: h */
    public final void m7286h(t0f[] t0fVarArr) {
        int i = 0;
        while (true) {
            InterfaceC2221p[] interfaceC2221pArr = this.f8435i;
            if (i >= interfaceC2221pArr.length) {
                return;
            }
            if (interfaceC2221pArr[i].mo6888f() == -2) {
                t0fVarArr[i] = null;
            }
            i++;
        }
    }

    /* renamed from: i */
    public final void m7287i() {
        if (!m7298t()) {
            return;
        }
        int i = 0;
        while (true) {
            buh buhVar = this.f8440n;
            if (i >= buhVar.f16840a) {
                return;
            }
            boolean zM19842c = buhVar.m19842c(i);
            ko6 ko6Var = this.f8440n.f16842c[i];
            if (zM19842c && ko6Var != null) {
                ko6Var.enable();
            }
            i++;
        }
    }

    /* renamed from: j */
    public long m7288j() {
        if (!this.f8430d) {
            return this.f8432f.f54867b;
        }
        long jMo7006g = this.f8431e ? this.f8427a.mo7006g() : Long.MIN_VALUE;
        return jMo7006g == Long.MIN_VALUE ? this.f8432f.f54870e : jMo7006g;
    }

    /* renamed from: k */
    public C2214k m7289k() {
        return this.f8438l;
    }

    /* renamed from: l */
    public long m7290l() {
        if (this.f8430d) {
            return this.f8427a.mo7004d();
        }
        return 0L;
    }

    /* renamed from: m */
    public long m7291m() {
        return this.f8441o;
    }

    /* renamed from: n */
    public long m7292n() {
        return this.f8432f.f54867b + this.f8441o;
    }

    /* renamed from: o */
    public sth m7293o() {
        return this.f8439m;
    }

    /* renamed from: p */
    public buh m7294p() {
        return this.f8440n;
    }

    /* renamed from: q */
    public void m7295q(float f, lmh lmhVar) {
        this.f8430d = true;
        this.f8439m = this.f8427a.mo7014s();
        buh buhVarM7301x = m7301x(f, lmhVar);
        y4b y4bVar = this.f8432f;
        long jMax = y4bVar.f54867b;
        long j = y4bVar.f54870e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jM7280a = m7280a(buhVarM7301x, jMax, false);
        long j2 = this.f8441o;
        y4b y4bVar2 = this.f8432f;
        this.f8441o = j2 + (y4bVar2.f54867b - jM7280a);
        this.f8432f = y4bVar2.m57200b(jM7280a);
    }

    /* renamed from: r */
    public boolean m7296r() {
        try {
            if (this.f8430d) {
                for (t0f t0fVar : this.f8429c) {
                    if (t0fVar != null) {
                        t0fVar.mo26371a();
                    }
                }
            } else {
                this.f8427a.mo7011n();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    /* renamed from: s */
    public boolean m7297s() {
        return this.f8430d && (!this.f8431e || this.f8427a.mo7006g() == Long.MIN_VALUE);
    }

    /* renamed from: t */
    public final boolean m7298t() {
        return this.f8438l == null;
    }

    /* renamed from: u */
    public void m7299u(long j) {
        op0.m42517g(m7298t());
        if (this.f8430d) {
            this.f8427a.mo7007h(m7277A(j));
        }
    }

    /* renamed from: v */
    public void m7300v() {
        m7285g();
        m7276w(this.f8437k, this.f8427a);
    }

    /* renamed from: x */
    public buh m7301x(float f, lmh lmhVar) {
        buh buhVarMo17859k = this.f8436j.mo17859k(this.f8435i, m7293o(), this.f8432f.f54866a, lmhVar);
        for (int i = 0; i < buhVarMo17859k.f16840a; i++) {
            if (buhVarMo17859k.m19842c(i)) {
                if (buhVarMo17859k.f16842c[i] == null && this.f8435i[i].mo6888f() != -2) {
                    z = false;
                }
                op0.m42517g(z);
            } else {
                op0.m42517g(buhVarMo17859k.f16842c[i] == null);
            }
        }
        for (ko6 ko6Var : buhVarMo17859k.f16842c) {
            if (ko6Var != null) {
                ko6Var.mo19891h(f);
            }
        }
        return buhVarMo17859k;
    }

    /* renamed from: y */
    public void m7302y(C2214k c2214k) {
        if (c2214k == this.f8438l) {
            return;
        }
        m7285g();
        this.f8438l = c2214k;
        m7287i();
    }

    /* renamed from: z */
    public void m7303z(long j) {
        this.f8441o = j;
    }
}
