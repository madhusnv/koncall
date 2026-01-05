package p001o;

import androidx.media3.common.C2181a;
import p001o.l93;

/* loaded from: classes2.dex */
public class i14 extends yd1 {

    /* renamed from: o */
    public final int f27894o;

    /* renamed from: p */
    public final long f27895p;

    /* renamed from: q */
    public final l93 f27896q;

    /* renamed from: r */
    public long f27897r;

    /* renamed from: s */
    public volatile boolean f27898s;

    /* renamed from: t */
    public boolean f27899t;

    public i14(dz4 dz4Var, iz4 iz4Var, C2181a c2181a, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, l93 l93Var) {
        super(dz4Var, iz4Var, c2181a, i, obj, j, j2, j3, j4, j5);
        this.f27894o = i2;
        this.f27895p = j6;
        this.f27896q = l93Var;
    }

    @Override // p001o.xga.InterfaceC18153e
    /* renamed from: b */
    public final void mo22073b() {
        this.f27898s = true;
    }

    @Override // p001o.j1b
    /* renamed from: e */
    public long mo31352e() {
        return this.f29566j + this.f27894o;
    }

    @Override // p001o.j1b
    /* renamed from: f */
    public boolean mo31353f() {
        return this.f27899t;
    }

    /* renamed from: j */
    public l93.InterfaceC15043b m31354j(ae1 ae1Var) {
        return ae1Var;
    }

    /* renamed from: k */
    public final void m31355k(ae1 ae1Var) {
        if (xeb.m56186n(this.f31662d.f7942m)) {
            C2181a c2181a = this.f31662d;
            int i = c2181a.f7926I;
            if ((i <= 1 && c2181a.f7927J <= 1) || i == -1 || c2181a.f7927J == -1) {
                return;
            }
            uth uthVarMo16940f = ae1Var.mo16940f(0, 4);
            C2181a c2181a2 = this.f31662d;
            int i2 = c2181a2.f7927J * c2181a2.f7926I;
            long j = (this.f31666h - this.f31665g) / i2;
            for (int i3 = 1; i3 < i2; i3++) {
                uthVarMo16940f.m52027e(new zwc(), 0);
                uthVarMo16940f.mo7071a(i3 * j, 0, 0, 0, null);
            }
        }
    }

    @Override // p001o.xga.InterfaceC18153e
    public final void load() {
        ae1 ae1VarM57615h = m57615h();
        if (this.f27897r == 0) {
            ae1VarM57615h.m16939b(this.f27895p);
            l93 l93Var = this.f27896q;
            l93.InterfaceC15043b interfaceC15043bM31354j = m31354j(ae1VarM57615h);
            long j = this.f55283k;
            long j2 = j == -9223372036854775807L ? -9223372036854775807L : j - this.f27895p;
            long j3 = this.f55284l;
            l93Var.mo34110b(interfaceC15043bM31354j, j2, j3 == -9223372036854775807L ? -9223372036854775807L : j3 - this.f27895p);
        }
        try {
            iz4 iz4VarM32922e = this.f31660b.m32922e(this.f27897r);
            o5g o5gVar = this.f31667i;
            yd5 yd5Var = new yd5(o5gVar, iz4VarM32922e.f29386g, o5gVar.mo23960e(iz4VarM32922e));
            do {
                try {
                    if (this.f27898s) {
                        break;
                    }
                } finally {
                    this.f27897r = yd5Var.getPosition() - this.f31660b.f29386g;
                }
            } while (this.f27896q.mo34109a(yd5Var));
            m31355k(ae1VarM57615h);
            hz4.m31298a(this.f31667i);
            this.f27899t = !this.f27898s;
        } catch (Throwable th) {
            hz4.m31298a(this.f31667i);
            throw th;
        }
    }
}
