package p001o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p001o.gc1;
import p001o.plf;

/* loaded from: classes3.dex */
public class p46 implements zzc, gc1.InterfaceC13670b, ad9 {

    /* renamed from: b */
    public final String f39312b;

    /* renamed from: c */
    public final ema f39313c;

    /* renamed from: d */
    public final gc1 f39314d;

    /* renamed from: e */
    public final gc1 f39315e;

    /* renamed from: f */
    public final u93 f39316f;

    /* renamed from: h */
    public boolean f39318h;

    /* renamed from: a */
    public final Path f39311a = new Path();

    /* renamed from: g */
    public final qp3 f39317g = new qp3();

    public p46(ema emaVar, hc1 hc1Var, u93 u93Var) {
        this.f39312b = u93Var.m51234b();
        this.f39313c = emaVar;
        gc1 gc1VarMo24960a = u93Var.m51236d().mo24960a();
        this.f39314d = gc1VarMo24960a;
        gc1 gc1VarMo24960a2 = u93Var.m51235c().mo24960a();
        this.f39315e = gc1VarMo24960a2;
        this.f39316f = u93Var;
        hc1Var.m30184i(gc1VarMo24960a);
        hc1Var.m30184i(gc1VarMo24960a2);
        gc1VarMo24960a.m28369a(this);
        gc1VarMo24960a2.m28369a(this);
    }

    @Override // p001o.gc1.InterfaceC13670b
    /* renamed from: a */
    public void mo19333a() {
        m42959f();
    }

    @Override // p001o.j14
    /* renamed from: b */
    public void mo19334b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            j14 j14Var = (j14) list.get(i);
            if (j14Var instanceof txh) {
                txh txhVar = (txh) j14Var;
                if (txhVar.m50755i() == plf.EnumC16137a.SIMULTANEOUSLY) {
                    this.f39317g.m45742a(txhVar);
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
        if (obj == mma.f35720k) {
            this.f39314d.m28380n(qmaVar);
        } else if (obj == mma.f35723n) {
            this.f39315e.m28380n(qmaVar);
        }
    }

    /* renamed from: f */
    public final void m42959f() {
        this.f39318h = false;
        this.f39313c.invalidateSelf();
    }

    @Override // p001o.j14
    public String getName() {
        return this.f39312b;
    }

    @Override // p001o.zzc
    public Path getPath() {
        if (this.f39318h) {
            return this.f39311a;
        }
        this.f39311a.reset();
        if (this.f39316f.m51237e()) {
            this.f39318h = true;
            return this.f39311a;
        }
        PointF pointF = (PointF) this.f39314d.mo28376h();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f39311a.reset();
        if (this.f39316f.m51238f()) {
            float f5 = -f2;
            this.f39311a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f39311a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f39311a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f39311a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f39311a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f39311a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f39311a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f39311a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f39311a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f39311a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.f39315e.mo28376h();
        this.f39311a.offset(pointF2.x, pointF2.y);
        this.f39311a.close();
        this.f39317g.m45743b(this.f39311a);
        this.f39318h = true;
        return this.f39311a;
    }
}
