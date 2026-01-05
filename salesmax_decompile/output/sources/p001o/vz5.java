package p001o;

import android.graphics.Color;
import android.graphics.Paint;
import p001o.gc1;

/* loaded from: classes3.dex */
public class vz5 implements gc1.InterfaceC13670b {

    /* renamed from: a */
    public final gc1.InterfaceC13670b f51058a;

    /* renamed from: b */
    public final gc1 f51059b;

    /* renamed from: c */
    public final gc1 f51060c;

    /* renamed from: d */
    public final gc1 f51061d;

    /* renamed from: e */
    public final gc1 f51062e;

    /* renamed from: f */
    public final gc1 f51063f;

    /* renamed from: g */
    public boolean f51064g = true;

    /* renamed from: o.vz5$a */
    public class C17696a extends qma {

        /* renamed from: d */
        public final /* synthetic */ qma f51065d;

        public C17696a(qma qmaVar) {
            this.f51065d = qmaVar;
        }

        @Override // p001o.qma
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float mo45653a(gma gmaVar) {
            Float f = (Float) this.f51065d.mo45653a(gmaVar);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public vz5(gc1.InterfaceC13670b interfaceC13670b, hc1 hc1Var, tz5 tz5Var) {
        this.f51058a = interfaceC13670b;
        gc1 gc1VarMo24960a = tz5Var.m50799a().mo24960a();
        this.f51059b = gc1VarMo24960a;
        gc1VarMo24960a.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a);
        gc1 gc1VarMo24960a2 = tz5Var.m50802d().mo24960a();
        this.f51060c = gc1VarMo24960a2;
        gc1VarMo24960a2.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a2);
        gc1 gc1VarMo24960a3 = tz5Var.m50800b().mo24960a();
        this.f51061d = gc1VarMo24960a3;
        gc1VarMo24960a3.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a3);
        gc1 gc1VarMo24960a4 = tz5Var.m50801c().mo24960a();
        this.f51062e = gc1VarMo24960a4;
        gc1VarMo24960a4.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a4);
        gc1 gc1VarMo24960a5 = tz5Var.m50803e().mo24960a();
        this.f51063f = gc1VarMo24960a5;
        gc1VarMo24960a5.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a5);
    }

    @Override // p001o.gc1.InterfaceC13670b
    /* renamed from: a */
    public void mo19333a() {
        this.f51064g = true;
        this.f51058a.mo19333a();
    }

    /* renamed from: b */
    public void m53622b(Paint paint) {
        if (this.f51064g) {
            this.f51064g = false;
            double dFloatValue = ((Float) this.f51061d.mo28376h()).floatValue() * 0.017453292519943295d;
            float fFloatValue = ((Float) this.f51062e.mo28376h()).floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.f51059b.mo28376h()).intValue();
            paint.setShadowLayer(((Float) this.f51063f.mo28376h()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.f51060c.mo28376h()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    /* renamed from: c */
    public void m53623c(qma qmaVar) {
        this.f51059b.m28380n(qmaVar);
    }

    /* renamed from: d */
    public void m53624d(qma qmaVar) {
        this.f51061d.m28380n(qmaVar);
    }

    /* renamed from: e */
    public void m53625e(qma qmaVar) {
        this.f51062e.m28380n(qmaVar);
    }

    /* renamed from: f */
    public void m53626f(qma qmaVar) {
        if (qmaVar == null) {
            this.f51060c.m28380n(null);
        } else {
            this.f51060c.m28380n(new C17696a(qmaVar));
        }
    }

    /* renamed from: g */
    public void m53627g(qma qmaVar) {
        this.f51063f.m28380n(qmaVar);
    }
}
