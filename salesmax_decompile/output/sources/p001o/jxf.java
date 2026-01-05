package p001o;

/* loaded from: classes2.dex */
public abstract class jxf implements d5g, yob, nxf {

    /* renamed from: a */
    public C14680a f31231a;

    /* renamed from: o.jxf$a */
    public static final class C14680a extends f5g {

        /* renamed from: c */
        public double f31232c;

        public C14680a(double d) {
            this.f31232c = d;
        }

        @Override // p001o.f5g
        /* renamed from: c */
        public void mo26181c(f5g f5gVar) {
            sq8.m48649h(f5gVar, "value");
            this.f31232c = ((C14680a) f5gVar).f31232c;
        }

        @Override // p001o.f5g
        /* renamed from: d */
        public f5g mo26182d() {
            return new C14680a(this.f31232c);
        }

        /* renamed from: i */
        public final double m34664i() {
            return this.f31232c;
        }

        /* renamed from: j */
        public final void m34665j(double d) {
            this.f31232c = d;
        }
    }

    public jxf(double d) {
        this.f31231a = new C14680a(d);
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
        if (((C14680a) f5gVar2).m34664i() == ((C14680a) f5gVar3).m34664i()) {
            return f5gVar2;
        }
        return null;
    }

    @Override // p001o.yob
    /* renamed from: k */
    public void mo34662k(double d) {
        xwf xwfVarM56928b;
        C14680a c14680a = (C14680a) exf.m25772D(this.f31231a);
        if (c14680a.m34664i() == d) {
            return;
        }
        C14680a c14680a2 = this.f31231a;
        exf.m25776H();
        synchronized (exf.m25775G()) {
            xwfVarM56928b = xwf.f54441e.m56928b();
            ((C14680a) exf.m25785Q(c14680a2, this, xwfVarM56928b, c14680a)).m34665j(d);
            y3i y3iVar = y3i.f54824a;
        }
        exf.m25783O(xwfVarM56928b, this);
    }

    @Override // p001o.d5g
    /* renamed from: n */
    public f5g mo22332n() {
        return this.f31231a;
    }

    @Override // p001o.yob
    /* renamed from: o */
    public double mo34663o() {
        return ((C14680a) exf.m25790V(this.f31231a, this)).m34664i();
    }

    @Override // p001o.d5g
    /* renamed from: r */
    public void mo22333r(f5g f5gVar) {
        sq8.m48649h(f5gVar, "value");
        this.f31231a = (C14680a) f5gVar;
    }

    public String toString() {
        return "MutableDoubleState(value=" + ((C14680a) exf.m25772D(this.f31231a)).m34664i() + ")@" + hashCode();
    }
}
