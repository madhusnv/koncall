package p001o;

import android.graphics.PointF;
import java.util.Collections;
import p001o.gc1;

/* loaded from: classes3.dex */
public class w0g extends gc1 {

    /* renamed from: i */
    public final PointF f51247i;

    /* renamed from: j */
    public final PointF f51248j;

    /* renamed from: k */
    public final gc1 f51249k;

    /* renamed from: l */
    public final gc1 f51250l;

    /* renamed from: m */
    public qma f51251m;

    /* renamed from: n */
    public qma f51252n;

    public w0g(gc1 gc1Var, gc1 gc1Var2) {
        super(Collections.emptyList());
        this.f51247i = new PointF();
        this.f51248j = new PointF();
        this.f51249k = gc1Var;
        this.f51250l = gc1Var2;
        mo28379m(m28374f());
    }

    @Override // p001o.gc1
    /* renamed from: m */
    public void mo28379m(float f) {
        this.f51249k.mo28379m(f);
        this.f51250l.mo28379m(f);
        this.f51247i.set(((Float) this.f51249k.mo28376h()).floatValue(), ((Float) this.f51250l.mo28376h()).floatValue());
        for (int i = 0; i < this.f24892a.size(); i++) {
            ((gc1.InterfaceC13670b) this.f24892a.get(i)).mo19333a();
        }
    }

    @Override // p001o.gc1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF mo28376h() {
        return mo20015i(null, 0.0f);
    }

    @Override // p001o.gc1
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF mo20015i(sd9 sd9Var, float f) {
        Float f2;
        sd9 sd9VarM28370b;
        sd9 sd9VarM28370b2;
        Float f3 = null;
        if (this.f51251m == null || (sd9VarM28370b2 = this.f51249k.m28370b()) == null) {
            f2 = null;
        } else {
            float fM28372d = this.f51249k.m28372d();
            Float f4 = sd9VarM28370b2.f45249h;
            qma qmaVar = this.f51251m;
            float f5 = sd9VarM28370b2.f45248g;
            f2 = (Float) qmaVar.m45654b(f5, f4 == null ? f5 : f4.floatValue(), (Float) sd9VarM28370b2.f45243b, (Float) sd9VarM28370b2.f45244c, f, f, fM28372d);
        }
        if (this.f51252n != null && (sd9VarM28370b = this.f51250l.m28370b()) != null) {
            float fM28372d2 = this.f51250l.m28372d();
            Float f6 = sd9VarM28370b.f45249h;
            qma qmaVar2 = this.f51252n;
            float f7 = sd9VarM28370b.f45248g;
            f3 = (Float) qmaVar2.m45654b(f7, f6 == null ? f7 : f6.floatValue(), (Float) sd9VarM28370b.f45243b, (Float) sd9VarM28370b.f45244c, f, f, fM28372d2);
        }
        if (f2 == null) {
            this.f51248j.set(this.f51247i.x, 0.0f);
        } else {
            this.f51248j.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            PointF pointF = this.f51248j;
            pointF.set(pointF.x, this.f51247i.y);
        } else {
            PointF pointF2 = this.f51248j;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.f51248j;
    }

    /* renamed from: r */
    public void m53763r(qma qmaVar) {
        qma qmaVar2 = this.f51251m;
        if (qmaVar2 != null) {
            qmaVar2.m45655c(null);
        }
        this.f51251m = qmaVar;
        if (qmaVar != null) {
            qmaVar.m45655c(this);
        }
    }

    /* renamed from: s */
    public void m53764s(qma qmaVar) {
        qma qmaVar2 = this.f51252n;
        if (qmaVar2 != null) {
            qmaVar2.m45655c(null);
        }
        this.f51252n = qmaVar;
        if (qmaVar != null) {
            qmaVar.m45655c(this);
        }
    }
}
