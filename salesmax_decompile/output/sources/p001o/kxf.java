package p001o;

/* loaded from: classes2.dex */
public abstract class kxf implements d5g, cpb, nxf {

    /* renamed from: a */
    public C14931a f32798a;

    /* renamed from: o.kxf$a */
    public static final class C14931a extends f5g {

        /* renamed from: c */
        public float f32799c;

        public C14931a(float f) {
            this.f32799c = f;
        }

        @Override // p001o.f5g
        /* renamed from: c */
        public void mo26181c(f5g f5gVar) {
            sq8.m48649h(f5gVar, "value");
            this.f32799c = ((C14931a) f5gVar).f32799c;
        }

        @Override // p001o.f5g
        /* renamed from: d */
        public f5g mo26182d() {
            return new C14931a(this.f32799c);
        }

        /* renamed from: i */
        public final float m36296i() {
            return this.f32799c;
        }

        /* renamed from: j */
        public final void m36297j(float f) {
            this.f32799c = f;
        }
    }

    public kxf(float f) {
        this.f32798a = new C14931a(f);
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
        if (((C14931a) f5gVar2).m36296i() == ((C14931a) f5gVar3).m36296i()) {
            return f5gVar2;
        }
        return null;
    }

    @Override // p001o.cpb
    /* renamed from: e */
    public float mo21573e() {
        return ((C14931a) exf.m25790V(this.f32798a, this)).m36296i();
    }

    @Override // p001o.cpb
    /* renamed from: m */
    public void mo36295m(float f) {
        xwf xwfVarM56928b;
        C14931a c14931a = (C14931a) exf.m25772D(this.f32798a);
        if (c14931a.m36296i() == f) {
            return;
        }
        C14931a c14931a2 = this.f32798a;
        exf.m25776H();
        synchronized (exf.m25775G()) {
            xwfVarM56928b = xwf.f54441e.m56928b();
            ((C14931a) exf.m25785Q(c14931a2, this, xwfVarM56928b, c14931a)).m36297j(f);
            y3i y3iVar = y3i.f54824a;
        }
        exf.m25783O(xwfVarM56928b, this);
    }

    @Override // p001o.d5g
    /* renamed from: n */
    public f5g mo22332n() {
        return this.f32798a;
    }

    @Override // p001o.d5g
    /* renamed from: r */
    public void mo22333r(f5g f5gVar) {
        sq8.m48649h(f5gVar, "value");
        this.f32798a = (C14931a) f5gVar;
    }

    public String toString() {
        return "MutableFloatState(value=" + ((C14931a) exf.m25772D(this.f32798a)).m36296i() + ")@" + hashCode();
    }
}
