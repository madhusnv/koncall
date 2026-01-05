package p001o;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import p001o.gc1;
import p001o.plf;

/* loaded from: classes3.dex */
public class rfe implements gc1.InterfaceC13670b, ad9, zzc {

    /* renamed from: c */
    public final String f43501c;

    /* renamed from: d */
    public final boolean f43502d;

    /* renamed from: e */
    public final ema f43503e;

    /* renamed from: f */
    public final gc1 f43504f;

    /* renamed from: g */
    public final gc1 f43505g;

    /* renamed from: h */
    public final gc1 f43506h;

    /* renamed from: j */
    public boolean f43508j;

    /* renamed from: a */
    public final Path f43499a = new Path();

    /* renamed from: b */
    public final RectF f43500b = new RectF();

    /* renamed from: i */
    public final qp3 f43507i = new qp3();

    public rfe(ema emaVar, hc1 hc1Var, sfe sfeVar) {
        this.f43501c = sfeVar.m48293c();
        this.f43502d = sfeVar.m48296f();
        this.f43503e = emaVar;
        gc1 gc1VarMo24960a = sfeVar.m48294d().mo24960a();
        this.f43504f = gc1VarMo24960a;
        gc1 gc1VarMo24960a2 = sfeVar.m48295e().mo24960a();
        this.f43505g = gc1VarMo24960a2;
        gc1 gc1VarMo24960a3 = sfeVar.m48292b().mo24960a();
        this.f43506h = gc1VarMo24960a3;
        hc1Var.m30184i(gc1VarMo24960a);
        hc1Var.m30184i(gc1VarMo24960a2);
        hc1Var.m30184i(gc1VarMo24960a3);
        gc1VarMo24960a.m28369a(this);
        gc1VarMo24960a2.m28369a(this);
        gc1VarMo24960a3.m28369a(this);
    }

    @Override // p001o.gc1.InterfaceC13670b
    /* renamed from: a */
    public void mo19333a() {
        m46657f();
    }

    @Override // p001o.j14
    /* renamed from: b */
    public void mo19334b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            j14 j14Var = (j14) list.get(i);
            if (j14Var instanceof txh) {
                txh txhVar = (txh) j14Var;
                if (txhVar.m50755i() == plf.EnumC16137a.SIMULTANEOUSLY) {
                    this.f43507i.m45742a(txhVar);
                    txhVar.m50751c(this);
                }
            }
        }
    }

    @Override // p001o.zc9
    /* renamed from: c */
    public void mo19999c(yc9 yc9Var, int i, List list, yc9 yc9Var2) {
        zeb.m59358m(yc9Var, i, list, yc9Var2, this);
    }

    @Override // p001o.zc9
    /* renamed from: d */
    public void mo20000d(Object obj, qma qmaVar) {
        if (obj == mma.f35721l) {
            this.f43505g.m28380n(qmaVar);
        } else if (obj == mma.f35723n) {
            this.f43504f.m28380n(qmaVar);
        } else if (obj == mma.f35722m) {
            this.f43506h.m28380n(qmaVar);
        }
    }

    /* renamed from: f */
    public final void m46657f() {
        this.f43508j = false;
        this.f43503e.invalidateSelf();
    }

    @Override // p001o.j14
    public String getName() {
        return this.f43501c;
    }

    @Override // p001o.zzc
    public Path getPath() {
        if (this.f43508j) {
            return this.f43499a;
        }
        this.f43499a.reset();
        if (this.f43502d) {
            this.f43508j = true;
            return this.f43499a;
        }
        PointF pointF = (PointF) this.f43505g.mo28376h();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        gc1 gc1Var = this.f43506h;
        float fM28012p = gc1Var == null ? 0.0f : ((g37) gc1Var).m28012p();
        float fMin = Math.min(f, f2);
        if (fM28012p > fMin) {
            fM28012p = fMin;
        }
        PointF pointF2 = (PointF) this.f43504f.mo28376h();
        this.f43499a.moveTo(pointF2.x + f, (pointF2.y - f2) + fM28012p);
        this.f43499a.lineTo(pointF2.x + f, (pointF2.y + f2) - fM28012p);
        if (fM28012p > 0.0f) {
            RectF rectF = this.f43500b;
            float f3 = pointF2.x;
            float f4 = fM28012p * 2.0f;
            float f5 = pointF2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.f43499a.arcTo(this.f43500b, 0.0f, 90.0f, false);
        }
        this.f43499a.lineTo((pointF2.x - f) + fM28012p, pointF2.y + f2);
        if (fM28012p > 0.0f) {
            RectF rectF2 = this.f43500b;
            float f6 = pointF2.x;
            float f7 = pointF2.y;
            float f8 = fM28012p * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.f43499a.arcTo(this.f43500b, 90.0f, 90.0f, false);
        }
        this.f43499a.lineTo(pointF2.x - f, (pointF2.y - f2) + fM28012p);
        if (fM28012p > 0.0f) {
            RectF rectF3 = this.f43500b;
            float f9 = pointF2.x;
            float f10 = pointF2.y;
            float f11 = fM28012p * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.f43499a.arcTo(this.f43500b, 180.0f, 90.0f, false);
        }
        this.f43499a.lineTo((pointF2.x + f) - fM28012p, pointF2.y - f2);
        if (fM28012p > 0.0f) {
            RectF rectF4 = this.f43500b;
            float f12 = pointF2.x;
            float f13 = fM28012p * 2.0f;
            float f14 = pointF2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.f43499a.arcTo(this.f43500b, 270.0f, 90.0f, false);
        }
        this.f43499a.close();
        this.f43507i.m45743b(this.f43499a);
        this.f43508j = true;
        return this.f43499a;
    }
}
