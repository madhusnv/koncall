package p001o;

import android.net.Uri;
import androidx.media3.common.C2181a;
import p001o.dz4;
import p001o.iz4;
import p001o.s2b;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class tuf extends be1 {

    /* renamed from: H */
    public final boolean f47910H;

    /* renamed from: L */
    public final lmh f47911L;

    /* renamed from: M */
    public final s2b f47912M;

    /* renamed from: Q */
    public juh f47913Q;

    /* renamed from: h */
    public final iz4 f47914h;

    /* renamed from: q */
    public final dz4.InterfaceC13064a f47915q;

    /* renamed from: s */
    public final C2181a f47916s;

    /* renamed from: x */
    public final long f47917x;

    /* renamed from: y */
    public final sga f47918y;

    /* renamed from: o.tuf$b */
    public static final class C17238b {

        /* renamed from: a */
        public final dz4.InterfaceC13064a f47919a;

        /* renamed from: b */
        public sga f47920b = new ue5();

        /* renamed from: c */
        public boolean f47921c = true;

        /* renamed from: d */
        public Object f47922d;

        /* renamed from: e */
        public String f47923e;

        public C17238b(dz4.InterfaceC13064a interfaceC13064a) {
            this.f47919a = (dz4.InterfaceC13064a) op0.m42515e(interfaceC13064a);
        }

        /* renamed from: a */
        public tuf m50692a(s2b.C16726k c16726k, long j) {
            return new tuf(this.f47923e, c16726k, this.f47919a, j, this.f47920b, this.f47921c, this.f47922d);
        }

        /* renamed from: b */
        public C17238b m50693b(sga sgaVar) {
            if (sgaVar == null) {
                sgaVar = new ue5();
            }
            this.f47920b = sgaVar;
            return this;
        }
    }

    @Override // p001o.be1
    /* renamed from: B */
    public void mo6919B(juh juhVar) {
        this.f47913Q = juhVar;
        m18729C(this.f47911L);
    }

    @Override // p001o.be1
    /* renamed from: D */
    public void mo6920D() {
    }

    @Override // p001o.x8b
    /* renamed from: a */
    public x4b mo6931a(x8b.C18076b c18076b, ob0 ob0Var, long j) {
        return new suf(this.f47914h, this.f47915q, this.f47913Q, this.f47916s, this.f47917x, this.f47918y, m18741w(c18076b), this.f47910H);
    }

    @Override // p001o.x8b
    /* renamed from: b */
    public s2b mo6932b() {
        return this.f47912M;
    }

    @Override // p001o.x8b
    /* renamed from: e */
    public void mo6933e(x4b x4bVar) {
        ((suf) x4bVar).m48947r();
    }

    @Override // p001o.x8b
    /* renamed from: j */
    public void mo6934j() {
    }

    public tuf(String str, s2b.C16726k c16726k, dz4.InterfaceC13064a interfaceC13064a, long j, sga sgaVar, boolean z, Object obj) {
        this.f47915q = interfaceC13064a;
        this.f47917x = j;
        this.f47918y = sgaVar;
        this.f47910H = z;
        s2b s2bVarM47470a = new s2b.C16718c().m47475f(Uri.EMPTY).m47472c(c16726k.f44591a.toString()).m47473d(nf8.m40500F(c16726k)).m47474e(obj).m47470a();
        this.f47912M = s2bVarM47470a;
        C2181a.b bVarC0 = new C2181a.b().o0((String) cmb.m21420a(c16726k.f44592b, "text/x-unknown")).e0(c16726k.f44593c).q0(c16726k.f44594d).m0(c16726k.f44595e).c0(c16726k.f44596f);
        String str2 = c16726k.f44597g;
        this.f47916s = bVarC0.a0(str2 == null ? str : str2).m6748K();
        this.f47914h = new iz4.C14403b().m32932i(c16726k.f44591a).m32925b(1).m32924a();
        this.f47911L = new nuf(j, true, false, false, null, s2bVarM47470a);
    }
}
