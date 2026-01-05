package p001o;

/* loaded from: classes2.dex */
public abstract class mxf implements d5g, ipb, nxf {

    /* renamed from: a */
    public C15447a f36078a;

    /* renamed from: o.mxf$a */
    public static final class C15447a extends f5g {

        /* renamed from: c */
        public long f36079c;

        public C15447a(long j) {
            this.f36079c = j;
        }

        @Override // p001o.f5g
        /* renamed from: c */
        public void mo26181c(f5g f5gVar) {
            sq8.m48649h(f5gVar, "value");
            this.f36079c = ((C15447a) f5gVar).f36079c;
        }

        @Override // p001o.f5g
        /* renamed from: d */
        public f5g mo26182d() {
            return new C15447a(this.f36079c);
        }

        /* renamed from: i */
        public final long m39760i() {
            return this.f36079c;
        }

        /* renamed from: j */
        public final void m39761j(long j) {
            this.f36079c = j;
        }
    }

    public mxf(long j) {
        this.f36078a = new C15447a(j);
    }

    @Override // p001o.nxf
    /* renamed from: a */
    public pxf mo34661a() {
        return qxf.m45957h();
    }

    @Override // p001o.d5g
    /* renamed from: d */
    public f5g mo22331d(f5g f5gVar, f5g f5gVar2, f5g f5gVar3) {
        sq8.m48649h(f5gVar, "previous");
        sq8.m48649h(f5gVar2, "current");
        sq8.m48649h(f5gVar3, "applied");
        if (((C15447a) f5gVar2).m39760i() == ((C15447a) f5gVar3).m39760i()) {
            return f5gVar2;
        }
        return null;
    }

    @Override // p001o.ipb
    /* renamed from: l */
    public long mo32535l() {
        return ((C15447a) exf.m25790V(this.f36078a, this)).m39760i();
    }

    @Override // p001o.d5g
    /* renamed from: n */
    public f5g mo22332n() {
        return this.f36078a;
    }

    @Override // p001o.ipb
    /* renamed from: p */
    public void mo32536p(long j) {
        xwf xwfVarM56928b;
        C15447a c15447a = (C15447a) exf.m25772D(this.f36078a);
        if (c15447a.m39760i() != j) {
            C15447a c15447a2 = this.f36078a;
            exf.m25776H();
            synchronized (exf.m25775G()) {
                xwfVarM56928b = xwf.f54441e.m56928b();
                ((C15447a) exf.m25785Q(c15447a2, this, xwfVarM56928b, c15447a)).m39761j(j);
                y3i y3iVar = y3i.f54824a;
            }
            exf.m25783O(xwfVarM56928b, this);
        }
    }

    @Override // p001o.d5g
    /* renamed from: r */
    public void mo22333r(f5g f5gVar) {
        sq8.m48649h(f5gVar, "value");
        this.f36078a = (C15447a) f5gVar;
    }

    public String toString() {
        return "MutableLongState(value=" + ((C15447a) exf.m25772D(this.f36078a)).m39760i() + ")@" + hashCode();
    }
}
