package p001o;

import java.util.Collections;

/* loaded from: classes3.dex */
public class vri extends gc1 {

    /* renamed from: i */
    public final gma f50800i;

    /* renamed from: j */
    public final Object f50801j;

    public vri(qma qmaVar) {
        this(qmaVar, null);
    }

    @Override // p001o.gc1
    /* renamed from: c */
    public float mo28371c() {
        return 1.0f;
    }

    @Override // p001o.gc1
    /* renamed from: h */
    public Object mo28376h() {
        qma qmaVar = this.f24896e;
        Object obj = this.f50801j;
        return qmaVar.m45654b(0.0f, 0.0f, obj, obj, m28374f(), m28374f(), m28374f());
    }

    @Override // p001o.gc1
    /* renamed from: i */
    public Object mo20015i(sd9 sd9Var, float f) {
        return mo28376h();
    }

    @Override // p001o.gc1
    /* renamed from: k */
    public void mo28377k() {
        if (this.f24896e != null) {
            super.mo28377k();
        }
    }

    @Override // p001o.gc1
    /* renamed from: m */
    public void mo28379m(float f) {
        this.f24895d = f;
    }

    public vri(qma qmaVar, Object obj) {
        super(Collections.emptyList());
        this.f50800i = new gma();
        m28380n(qmaVar);
        this.f50801j = obj;
    }
}
