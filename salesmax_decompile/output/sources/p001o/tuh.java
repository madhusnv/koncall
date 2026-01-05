package p001o;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import p001o.gc1;

/* loaded from: classes3.dex */
public class tuh {

    /* renamed from: a */
    public final Matrix f47924a = new Matrix();

    /* renamed from: b */
    public final Matrix f47925b;

    /* renamed from: c */
    public final Matrix f47926c;

    /* renamed from: d */
    public final Matrix f47927d;

    /* renamed from: e */
    public final float[] f47928e;

    /* renamed from: f */
    public gc1 f47929f;

    /* renamed from: g */
    public gc1 f47930g;

    /* renamed from: h */
    public gc1 f47931h;

    /* renamed from: i */
    public gc1 f47932i;

    /* renamed from: j */
    public gc1 f47933j;

    /* renamed from: k */
    public g37 f47934k;

    /* renamed from: l */
    public g37 f47935l;

    /* renamed from: m */
    public gc1 f47936m;

    /* renamed from: n */
    public gc1 f47937n;

    public tuh(rg0 rg0Var) {
        this.f47929f = rg0Var.m46678c() == null ? null : rg0Var.m46678c().mo24960a();
        this.f47930g = rg0Var.m46681f() == null ? null : rg0Var.m46681f().mo24960a();
        this.f47931h = rg0Var.m46683h() == null ? null : rg0Var.m46683h().mo24960a();
        this.f47932i = rg0Var.m46682g() == null ? null : rg0Var.m46682g().mo24960a();
        g37 g37Var = rg0Var.m46684i() == null ? null : (g37) rg0Var.m46684i().mo24960a();
        this.f47934k = g37Var;
        if (g37Var != null) {
            this.f47925b = new Matrix();
            this.f47926c = new Matrix();
            this.f47927d = new Matrix();
            this.f47928e = new float[9];
        } else {
            this.f47925b = null;
            this.f47926c = null;
            this.f47927d = null;
            this.f47928e = null;
        }
        this.f47935l = rg0Var.m46685j() == null ? null : (g37) rg0Var.m46685j().mo24960a();
        if (rg0Var.m46680e() != null) {
            this.f47933j = rg0Var.m46680e().mo24960a();
        }
        if (rg0Var.m46686k() != null) {
            this.f47936m = rg0Var.m46686k().mo24960a();
        } else {
            this.f47936m = null;
        }
        if (rg0Var.m46679d() != null) {
            this.f47937n = rg0Var.m46679d().mo24960a();
        } else {
            this.f47937n = null;
        }
    }

    /* renamed from: a */
    public void m50694a(hc1 hc1Var) {
        hc1Var.m30184i(this.f47933j);
        hc1Var.m30184i(this.f47936m);
        hc1Var.m30184i(this.f47937n);
        hc1Var.m30184i(this.f47929f);
        hc1Var.m30184i(this.f47930g);
        hc1Var.m30184i(this.f47931h);
        hc1Var.m30184i(this.f47932i);
        hc1Var.m30184i(this.f47934k);
        hc1Var.m30184i(this.f47935l);
    }

    /* renamed from: b */
    public void m50695b(gc1.InterfaceC13670b interfaceC13670b) {
        gc1 gc1Var = this.f47933j;
        if (gc1Var != null) {
            gc1Var.m28369a(interfaceC13670b);
        }
        gc1 gc1Var2 = this.f47936m;
        if (gc1Var2 != null) {
            gc1Var2.m28369a(interfaceC13670b);
        }
        gc1 gc1Var3 = this.f47937n;
        if (gc1Var3 != null) {
            gc1Var3.m28369a(interfaceC13670b);
        }
        gc1 gc1Var4 = this.f47929f;
        if (gc1Var4 != null) {
            gc1Var4.m28369a(interfaceC13670b);
        }
        gc1 gc1Var5 = this.f47930g;
        if (gc1Var5 != null) {
            gc1Var5.m28369a(interfaceC13670b);
        }
        gc1 gc1Var6 = this.f47931h;
        if (gc1Var6 != null) {
            gc1Var6.m28369a(interfaceC13670b);
        }
        gc1 gc1Var7 = this.f47932i;
        if (gc1Var7 != null) {
            gc1Var7.m28369a(interfaceC13670b);
        }
        g37 g37Var = this.f47934k;
        if (g37Var != null) {
            g37Var.m28369a(interfaceC13670b);
        }
        g37 g37Var2 = this.f47935l;
        if (g37Var2 != null) {
            g37Var2.m28369a(interfaceC13670b);
        }
    }

    /* renamed from: c */
    public boolean m50696c(Object obj, qma qmaVar) {
        g37 g37Var;
        g37 g37Var2;
        gc1 gc1Var;
        gc1 gc1Var2;
        if (obj == mma.f35715f) {
            gc1 gc1Var3 = this.f47929f;
            if (gc1Var3 == null) {
                this.f47929f = new vri(qmaVar, new PointF());
                return true;
            }
            gc1Var3.m28380n(qmaVar);
            return true;
        }
        if (obj == mma.f35716g) {
            gc1 gc1Var4 = this.f47930g;
            if (gc1Var4 == null) {
                this.f47930g = new vri(qmaVar, new PointF());
                return true;
            }
            gc1Var4.m28380n(qmaVar);
            return true;
        }
        if (obj == mma.f35717h) {
            gc1 gc1Var5 = this.f47930g;
            if (gc1Var5 instanceof w0g) {
                ((w0g) gc1Var5).m53763r(qmaVar);
                return true;
            }
        }
        if (obj == mma.f35718i) {
            gc1 gc1Var6 = this.f47930g;
            if (gc1Var6 instanceof w0g) {
                ((w0g) gc1Var6).m53764s(qmaVar);
                return true;
            }
        }
        if (obj == mma.f35724o) {
            gc1 gc1Var7 = this.f47931h;
            if (gc1Var7 == null) {
                this.f47931h = new vri(qmaVar, new n4f());
                return true;
            }
            gc1Var7.m28380n(qmaVar);
            return true;
        }
        if (obj == mma.f35725p) {
            gc1 gc1Var8 = this.f47932i;
            if (gc1Var8 == null) {
                this.f47932i = new vri(qmaVar, Float.valueOf(0.0f));
                return true;
            }
            gc1Var8.m28380n(qmaVar);
            return true;
        }
        if (obj == mma.f35712c) {
            gc1 gc1Var9 = this.f47933j;
            if (gc1Var9 == null) {
                this.f47933j = new vri(qmaVar, 100);
                return true;
            }
            gc1Var9.m28380n(qmaVar);
            return true;
        }
        if (obj == mma.f35698C && (gc1Var2 = this.f47936m) != null) {
            if (gc1Var2 == null) {
                this.f47936m = new vri(qmaVar, 100);
                return true;
            }
            gc1Var2.m28380n(qmaVar);
            return true;
        }
        if (obj == mma.f35699D && (gc1Var = this.f47937n) != null) {
            if (gc1Var == null) {
                this.f47937n = new vri(qmaVar, 100);
                return true;
            }
            gc1Var.m28380n(qmaVar);
            return true;
        }
        if (obj == mma.f35726q && (g37Var2 = this.f47934k) != null) {
            if (g37Var2 == null) {
                this.f47934k = new g37(Collections.singletonList(new sd9(Float.valueOf(0.0f))));
            }
            this.f47934k.m28380n(qmaVar);
            return true;
        }
        if (obj != mma.f35727r || (g37Var = this.f47935l) == null) {
            return false;
        }
        if (g37Var == null) {
            this.f47935l = new g37(Collections.singletonList(new sd9(Float.valueOf(0.0f))));
        }
        this.f47935l.m28380n(qmaVar);
        return true;
    }

    /* renamed from: d */
    public final void m50697d() {
        for (int i = 0; i < 9; i++) {
            this.f47928e[i] = 0.0f;
        }
    }

    /* renamed from: e */
    public gc1 m50698e() {
        return this.f47937n;
    }

    /* renamed from: f */
    public Matrix m50699f() {
        this.f47924a.reset();
        gc1 gc1Var = this.f47930g;
        if (gc1Var != null) {
            PointF pointF = (PointF) gc1Var.mo28376h();
            float f = pointF.x;
            if (f != 0.0f || pointF.y != 0.0f) {
                this.f47924a.preTranslate(f, pointF.y);
            }
        }
        gc1 gc1Var2 = this.f47932i;
        if (gc1Var2 != null) {
            float fFloatValue = gc1Var2 instanceof vri ? ((Float) gc1Var2.mo28376h()).floatValue() : ((g37) gc1Var2).m28012p();
            if (fFloatValue != 0.0f) {
                this.f47924a.preRotate(fFloatValue);
            }
        }
        if (this.f47934k != null) {
            float fCos = this.f47935l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r0.m28012p()) + 90.0f));
            float fSin = this.f47935l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r4.m28012p()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(this.f47934k.m28012p()));
            m50697d();
            float[] fArr = this.f47928e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f47925b.setValues(fArr);
            m50697d();
            float[] fArr2 = this.f47928e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f47926c.setValues(fArr2);
            m50697d();
            float[] fArr3 = this.f47928e;
            fArr3[0] = fCos;
            fArr3[1] = f2;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f47927d.setValues(fArr3);
            this.f47926c.preConcat(this.f47925b);
            this.f47927d.preConcat(this.f47926c);
            this.f47924a.preConcat(this.f47927d);
        }
        gc1 gc1Var3 = this.f47931h;
        if (gc1Var3 != null) {
            n4f n4fVar = (n4f) gc1Var3.mo28376h();
            if (n4fVar.m40075b() != 1.0f || n4fVar.m40076c() != 1.0f) {
                this.f47924a.preScale(n4fVar.m40075b(), n4fVar.m40076c());
            }
        }
        gc1 gc1Var4 = this.f47929f;
        if (gc1Var4 != null) {
            PointF pointF2 = (PointF) gc1Var4.mo28376h();
            float f3 = pointF2.x;
            if (f3 != 0.0f || pointF2.y != 0.0f) {
                this.f47924a.preTranslate(-f3, -pointF2.y);
            }
        }
        return this.f47924a;
    }

    /* renamed from: g */
    public Matrix m50700g(float f) {
        gc1 gc1Var = this.f47930g;
        PointF pointF = gc1Var == null ? null : (PointF) gc1Var.mo28376h();
        gc1 gc1Var2 = this.f47931h;
        n4f n4fVar = gc1Var2 == null ? null : (n4f) gc1Var2.mo28376h();
        this.f47924a.reset();
        if (pointF != null) {
            this.f47924a.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (n4fVar != null) {
            double d = f;
            this.f47924a.preScale((float) Math.pow(n4fVar.m40075b(), d), (float) Math.pow(n4fVar.m40076c(), d));
        }
        gc1 gc1Var3 = this.f47932i;
        if (gc1Var3 != null) {
            float fFloatValue = ((Float) gc1Var3.mo28376h()).floatValue();
            gc1 gc1Var4 = this.f47929f;
            PointF pointF2 = gc1Var4 != null ? (PointF) gc1Var4.mo28376h() : null;
            this.f47924a.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.f47924a;
    }

    /* renamed from: h */
    public gc1 m50701h() {
        return this.f47933j;
    }

    /* renamed from: i */
    public gc1 m50702i() {
        return this.f47936m;
    }

    /* renamed from: j */
    public void m50703j(float f) {
        gc1 gc1Var = this.f47933j;
        if (gc1Var != null) {
            gc1Var.mo28379m(f);
        }
        gc1 gc1Var2 = this.f47936m;
        if (gc1Var2 != null) {
            gc1Var2.mo28379m(f);
        }
        gc1 gc1Var3 = this.f47937n;
        if (gc1Var3 != null) {
            gc1Var3.mo28379m(f);
        }
        gc1 gc1Var4 = this.f47929f;
        if (gc1Var4 != null) {
            gc1Var4.mo28379m(f);
        }
        gc1 gc1Var5 = this.f47930g;
        if (gc1Var5 != null) {
            gc1Var5.mo28379m(f);
        }
        gc1 gc1Var6 = this.f47931h;
        if (gc1Var6 != null) {
            gc1Var6.mo28379m(f);
        }
        gc1 gc1Var7 = this.f47932i;
        if (gc1Var7 != null) {
            gc1Var7.mo28379m(f);
        }
        g37 g37Var = this.f47934k;
        if (g37Var != null) {
            g37Var.mo28379m(f);
        }
        g37 g37Var2 = this.f47935l;
        if (g37Var2 != null) {
            g37Var2.mo28379m(f);
        }
    }
}
