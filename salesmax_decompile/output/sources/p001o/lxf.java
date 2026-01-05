package p001o;

/* loaded from: classes2.dex */
public abstract class lxf implements d5g, dpb, nxf {

    /* renamed from: a */
    public C15176a f34498a;

    /* renamed from: o.lxf$a */
    public static final class C15176a extends f5g {

        /* renamed from: c */
        public int f34499c;

        public C15176a(int i) {
            this.f34499c = i;
        }

        @Override // p001o.f5g
        /* renamed from: c */
        public void mo26181c(f5g f5gVar) {
            sq8.m48649h(f5gVar, "value");
            this.f34499c = ((C15176a) f5gVar).f34499c;
        }

        @Override // p001o.f5g
        /* renamed from: d */
        public f5g mo26182d() {
            return new C15176a(this.f34499c);
        }

        /* renamed from: i */
        public final int m38098i() {
            return this.f34499c;
        }

        /* renamed from: j */
        public final void m38099j(int i) {
            this.f34499c = i;
        }
    }

    public lxf(int i) {
        this.f34498a = new C15176a(i);
    }

    @Override // p001o.nxf
    /* renamed from: a */
    public pxf mo34661a() {
        return qxf.m45957h();
    }

    @Override // p001o.dpb, p001o.ql8
    /* renamed from: b */
    public int mo23664b() {
        return ((C15176a) exf.m25790V(this.f34498a, this)).m38098i();
    }

    @Override // p001o.d5g
    /* renamed from: d */
    public f5g mo22331d(f5g f5gVar, f5g f5gVar2, f5g f5gVar3) {
        sq8.m48649h(f5gVar, "previous");
        sq8.m48649h(f5gVar2, "current");
        sq8.m48649h(f5gVar3, "applied");
        if (((C15176a) f5gVar2).m38098i() == ((C15176a) f5gVar3).m38098i()) {
            return f5gVar2;
        }
        return null;
    }

    @Override // p001o.dpb
    /* renamed from: f */
    public void mo23665f(int i) {
        xwf xwfVarM56928b;
        C15176a c15176a = (C15176a) exf.m25772D(this.f34498a);
        if (c15176a.m38098i() != i) {
            C15176a c15176a2 = this.f34498a;
            exf.m25776H();
            synchronized (exf.m25775G()) {
                xwfVarM56928b = xwf.f54441e.m56928b();
                ((C15176a) exf.m25785Q(c15176a2, this, xwfVarM56928b, c15176a)).m38099j(i);
                y3i y3iVar = y3i.f54824a;
            }
            exf.m25783O(xwfVarM56928b, this);
        }
    }

    @Override // p001o.d5g
    /* renamed from: n */
    public f5g mo22332n() {
        return this.f34498a;
    }

    @Override // p001o.d5g
    /* renamed from: r */
    public void mo22333r(f5g f5gVar) {
        sq8.m48649h(f5gVar, "value");
        this.f34498a = (C15176a) f5gVar;
    }

    public String toString() {
        return "MutableIntState(value=" + ((C15176a) exf.m25772D(this.f34498a)).m38098i() + ")@" + hashCode();
    }
}
