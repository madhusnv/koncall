package p001o;

import androidx.media3.common.C2181a;
import p001o.hyh;

/* loaded from: classes2.dex */
public final class wa8 implements n46 {

    /* renamed from: b */
    public uth f51688b;

    /* renamed from: c */
    public boolean f51689c;

    /* renamed from: e */
    public int f51691e;

    /* renamed from: f */
    public int f51692f;

    /* renamed from: a */
    public final zwc f51687a = new zwc(10);

    /* renamed from: d */
    public long f51690d = -9223372036854775807L;

    @Override // p001o.n46
    /* renamed from: a */
    public void mo24646a(zwc zwcVar) {
        op0.m42519i(this.f51688b);
        if (this.f51689c) {
            int iM60020a = zwcVar.m60020a();
            int i = this.f51692f;
            if (i < 10) {
                int iMin = Math.min(iM60020a, 10 - i);
                System.arraycopy(zwcVar.m60024e(), zwcVar.m60025f(), this.f51687a.m60024e(), this.f51692f, iMin);
                if (this.f51692f + iMin == 10) {
                    this.f51687a.m60017U(0);
                    if (73 != this.f51687a.m60004H() || 68 != this.f51687a.m60004H() || 51 != this.f51687a.m60004H()) {
                        ria.m46824h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f51689c = false;
                        return;
                    } else {
                        this.f51687a.m60018V(3);
                        this.f51691e = this.f51687a.m60003G() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iM60020a, this.f51691e - this.f51692f);
            this.f51688b.m52027e(zwcVar, iMin2);
            this.f51692f += iMin2;
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        this.f51689c = false;
        this.f51690d = -9223372036854775807L;
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
        int i;
        op0.m42519i(this.f51688b);
        if (this.f51689c && (i = this.f51691e) != 0 && this.f51692f == i) {
            op0.m42517g(this.f51690d != -9223372036854775807L);
            this.f51688b.mo7071a(this.f51690d, 1, this.f51691e, 0, null);
            this.f51689c = false;
        }
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        c14129d.m31294a();
        uth uthVarMo32487f = vq6Var.mo32487f(c14129d.m31296c(), 5);
        this.f51688b = uthVarMo32487f;
        uthVarMo32487f.mo7072b(new C2181a.b().a0(c14129d.m31295b()).o0("application/id3").m6748K());
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f51689c = true;
        this.f51690d = j;
        this.f51691e = 0;
        this.f51692f = 0;
    }
}
