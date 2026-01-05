package p001o;

/* loaded from: classes2.dex */
public abstract class oxf implements d5g, nxf {

    /* renamed from: a */
    public final pxf f39029a;

    /* renamed from: b */
    public C15910a f39030b;

    /* renamed from: o.oxf$a */
    public static final class C15910a extends f5g {

        /* renamed from: c */
        public Object f39031c;

        public C15910a(Object obj) {
            this.f39031c = obj;
        }

        @Override // p001o.f5g
        /* renamed from: c */
        public void mo26181c(f5g f5gVar) {
            sq8.m48649h(f5gVar, "value");
            this.f39031c = ((C15910a) f5gVar).f39031c;
        }

        @Override // p001o.f5g
        /* renamed from: d */
        public f5g mo26182d() {
            return new C15910a(this.f39031c);
        }

        /* renamed from: i */
        public final Object m42757i() {
            return this.f39031c;
        }

        /* renamed from: j */
        public final void m42758j(Object obj) {
            this.f39031c = obj;
        }
    }

    public oxf(Object obj, pxf pxfVar) {
        sq8.m48649h(pxfVar, "policy");
        this.f39029a = pxfVar;
        this.f39030b = new C15910a(obj);
    }

    @Override // p001o.nxf
    /* renamed from: a */
    public pxf mo34661a() {
        return this.f39029a;
    }

    @Override // p001o.d5g
    /* renamed from: d */
    public f5g mo22331d(f5g f5gVar, f5g f5gVar2, f5g f5gVar3) {
        sq8.m48649h(f5gVar, "previous");
        sq8.m48649h(f5gVar2, "current");
        sq8.m48649h(f5gVar3, "applied");
        C15910a c15910a = (C15910a) f5gVar;
        C15910a c15910a2 = (C15910a) f5gVar2;
        C15910a c15910a3 = (C15910a) f5gVar3;
        if (mo34661a().mo32849b(c15910a2.m42757i(), c15910a3.m42757i())) {
            return f5gVar2;
        }
        Object objM44269a = mo34661a().m44269a(c15910a.m42757i(), c15910a2.m42757i(), c15910a3.m42757i());
        if (objM44269a == null) {
            return null;
        }
        f5g f5gVarMo26182d = c15910a3.mo26182d();
        sq8.m48647f(f5gVarMo26182d, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$2>");
        ((C15910a) f5gVarMo26182d).m42758j(objM44269a);
        return f5gVarMo26182d;
    }

    @Override // p001o.bqb, p001o.p4g
    public Object getValue() {
        return ((C15910a) exf.m25790V(this.f39030b, this)).m42757i();
    }

    @Override // p001o.d5g
    /* renamed from: n */
    public f5g mo22332n() {
        return this.f39030b;
    }

    @Override // p001o.d5g
    /* renamed from: r */
    public void mo22333r(f5g f5gVar) {
        sq8.m48649h(f5gVar, "value");
        this.f39030b = (C15910a) f5gVar;
    }

    @Override // p001o.bqb
    public void setValue(Object obj) {
        xwf xwfVarM56928b;
        C15910a c15910a = (C15910a) exf.m25772D(this.f39030b);
        if (mo34661a().mo32849b(c15910a.m42757i(), obj)) {
            return;
        }
        C15910a c15910a2 = this.f39030b;
        exf.m25776H();
        synchronized (exf.m25775G()) {
            xwfVarM56928b = xwf.f54441e.m56928b();
            ((C15910a) exf.m25785Q(c15910a2, this, xwfVarM56928b, c15910a)).m42758j(obj);
            y3i y3iVar = y3i.f54824a;
        }
        exf.m25783O(xwfVarM56928b, this);
    }

    public String toString() {
        return "MutableState(value=" + ((C15910a) exf.m25772D(this.f39030b)).m42757i() + ")@" + hashCode();
    }
}
