package p001o;

import p001o.s2b;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class oq6 extends be1 {

    /* renamed from: h */
    public final long f38719h;

    /* renamed from: q */
    public s2b f38720q;

    /* renamed from: o.oq6$b */
    public static final class C15868b implements x8b.InterfaceC18075a {

        /* renamed from: c */
        public final long f38721c;

        public C15868b(long j, gq6 gq6Var) {
            this.f38721c = j;
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: c */
        public x8b.InterfaceC18075a mo6938c(sga sgaVar) {
            return this;
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: d */
        public x8b.InterfaceC18075a mo6939d(pz5 pz5Var) {
            return this;
        }

        @Override // p001o.x8b.InterfaceC18075a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oq6 mo6940e(s2b s2bVar) {
            return new oq6(s2bVar, this.f38721c, null);
        }
    }

    @Override // p001o.be1
    /* renamed from: B */
    public void mo6919B(juh juhVar) {
        m18729C(new nuf(this.f38719h, true, false, false, null, mo6932b()));
    }

    @Override // p001o.be1
    /* renamed from: D */
    public void mo6920D() {
    }

    @Override // p001o.x8b
    /* renamed from: a */
    public x4b mo6931a(x8b.C18076b c18076b, ob0 ob0Var, long j) {
        s2b s2bVarMo6932b = mo6932b();
        op0.m42515e(s2bVarMo6932b.f44480b);
        op0.m42516f(s2bVarMo6932b.f44480b.f44573b, "Externally loaded mediaItems require a MIME type.");
        s2b.C16723h c16723h = s2bVarMo6932b.f44480b;
        return new nq6(c16723h.f44572a, c16723h.f44573b, null);
    }

    @Override // p001o.x8b
    /* renamed from: b */
    public synchronized s2b mo6932b() {
        return this.f38720q;
    }

    @Override // p001o.x8b
    /* renamed from: e */
    public void mo6933e(x4b x4bVar) {
        ((nq6) x4bVar).m40917m();
    }

    @Override // p001o.x8b
    /* renamed from: j */
    public void mo6934j() {
    }

    @Override // p001o.x8b
    /* renamed from: n */
    public synchronized void mo6935n(s2b s2bVar) {
        this.f38720q = s2bVar;
    }

    public oq6(s2b s2bVar, long j, gq6 gq6Var) {
        this.f38720q = s2bVar;
        this.f38719h = j;
    }
}
