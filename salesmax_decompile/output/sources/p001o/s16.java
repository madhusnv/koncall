package p001o;

import androidx.media3.common.C2181a;
import java.util.Collections;
import java.util.List;
import p001o.hyh;

/* loaded from: classes2.dex */
public final class s16 implements n46 {

    /* renamed from: a */
    public final List f44429a;

    /* renamed from: b */
    public final uth[] f44430b;

    /* renamed from: c */
    public boolean f44431c;

    /* renamed from: d */
    public int f44432d;

    /* renamed from: e */
    public int f44433e;

    /* renamed from: f */
    public long f44434f = -9223372036854775807L;

    public s16(List list) {
        this.f44429a = list;
        this.f44430b = new uth[list.size()];
    }

    @Override // p001o.n46
    /* renamed from: a */
    public void mo24646a(zwc zwcVar) {
        if (this.f44431c) {
            if (this.f44432d != 2 || m47445f(zwcVar, 32)) {
                if (this.f44432d != 1 || m47445f(zwcVar, 0)) {
                    int iM60025f = zwcVar.m60025f();
                    int iM60020a = zwcVar.m60020a();
                    for (uth uthVar : this.f44430b) {
                        zwcVar.m60017U(iM60025f);
                        uthVar.m52027e(zwcVar, iM60020a);
                    }
                    this.f44433e += iM60020a;
                }
            }
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        this.f44431c = false;
        this.f44434f = -9223372036854775807L;
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
        if (this.f44431c) {
            op0.m42517g(this.f44434f != -9223372036854775807L);
            for (uth uthVar : this.f44430b) {
                uthVar.mo7071a(this.f44434f, 1, this.f44433e, 0, null);
            }
            this.f44431c = false;
        }
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        for (int i = 0; i < this.f44430b.length; i++) {
            hyh.C14126a c14126a = (hyh.C14126a) this.f44429a.get(i);
            c14129d.m31294a();
            uth uthVarMo32487f = vq6Var.mo32487f(c14129d.m31296c(), 3);
            uthVarMo32487f.mo7072b(new C2181a.b().a0(c14129d.m31295b()).o0("application/dvbsubs").b0(Collections.singletonList(c14126a.f27801c)).e0(c14126a.f27799a).m6748K());
            this.f44430b[i] = uthVarMo32487f;
        }
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f44431c = true;
        this.f44434f = j;
        this.f44433e = 0;
        this.f44432d = 2;
    }

    /* renamed from: f */
    public final boolean m47445f(zwc zwcVar, int i) {
        if (zwcVar.m60020a() == 0) {
            return false;
        }
        if (zwcVar.m60004H() != i) {
            this.f44431c = false;
        }
        this.f44432d--;
        return this.f44431c;
    }
}
