package p001o;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.List;
import p001o.gc1;

/* loaded from: classes3.dex */
public class qu7 implements dz5, gc1.InterfaceC13670b, ad9 {

    /* renamed from: a */
    public final String f42428a;

    /* renamed from: b */
    public final boolean f42429b;

    /* renamed from: c */
    public final hc1 f42430c;

    /* renamed from: d */
    public final rla f42431d = new rla();

    /* renamed from: e */
    public final rla f42432e = new rla();

    /* renamed from: f */
    public final Path f42433f;

    /* renamed from: g */
    public final Paint f42434g;

    /* renamed from: h */
    public final RectF f42435h;

    /* renamed from: i */
    public final List f42436i;

    /* renamed from: j */
    public final vu7 f42437j;

    /* renamed from: k */
    public final gc1 f42438k;

    /* renamed from: l */
    public final gc1 f42439l;

    /* renamed from: m */
    public final gc1 f42440m;

    /* renamed from: n */
    public final gc1 f42441n;

    /* renamed from: o */
    public gc1 f42442o;

    /* renamed from: p */
    public vri f42443p;

    /* renamed from: q */
    public final ema f42444q;

    /* renamed from: r */
    public final int f42445r;

    /* renamed from: s */
    public gc1 f42446s;

    /* renamed from: t */
    public float f42447t;

    /* renamed from: u */
    public vz5 f42448u;

    public qu7(ema emaVar, hc1 hc1Var, pu7 pu7Var) {
        Path path = new Path();
        this.f42433f = path;
        this.f42434g = new we9(1);
        this.f42435h = new RectF();
        this.f42436i = new ArrayList();
        this.f42447t = 0.0f;
        this.f42430c = hc1Var;
        this.f42428a = pu7Var.m44204f();
        this.f42429b = pu7Var.m44207i();
        this.f42444q = emaVar;
        this.f42437j = pu7Var.m44203e();
        path.setFillType(pu7Var.m44201c());
        this.f42445r = (int) (emaVar.m25327p().m17440d() / 32.0f);
        gc1 gc1VarMo24960a = pu7Var.m44202d().mo24960a();
        this.f42438k = gc1VarMo24960a;
        gc1VarMo24960a.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a);
        gc1 gc1VarMo24960a2 = pu7Var.m44205g().mo24960a();
        this.f42439l = gc1VarMo24960a2;
        gc1VarMo24960a2.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a2);
        gc1 gc1VarMo24960a3 = pu7Var.m44206h().mo24960a();
        this.f42440m = gc1VarMo24960a3;
        gc1VarMo24960a3.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a3);
        gc1 gc1VarMo24960a4 = pu7Var.m44200b().mo24960a();
        this.f42441n = gc1VarMo24960a4;
        gc1VarMo24960a4.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a4);
        if (hc1Var.mo30195v() != null) {
            gc1 gc1VarMo24960a5 = hc1Var.mo30195v().m57859a().mo24960a();
            this.f42446s = gc1VarMo24960a5;
            gc1VarMo24960a5.m28369a(this);
            hc1Var.m30184i(this.f42446s);
        }
        if (hc1Var.mo30197x() != null) {
            this.f42448u = new vz5(this, hc1Var, hc1Var.mo30197x());
        }
    }

    @Override // p001o.gc1.InterfaceC13670b
    /* renamed from: a */
    public void mo19333a() {
        this.f42444q.invalidateSelf();
    }

    @Override // p001o.j14
    /* renamed from: b */
    public void mo19334b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            j14 j14Var = (j14) list2.get(i);
            if (j14Var instanceof zzc) {
                this.f42436i.add((zzc) j14Var);
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
        vz5 vz5Var;
        vz5 vz5Var2;
        vz5 vz5Var3;
        vz5 vz5Var4;
        vz5 vz5Var5;
        if (obj == mma.f35713d) {
            this.f42439l.m28380n(qmaVar);
            return;
        }
        if (obj == mma.f35706K) {
            gc1 gc1Var = this.f42442o;
            if (gc1Var != null) {
                this.f42430c.m30176F(gc1Var);
            }
            if (qmaVar == null) {
                this.f42442o = null;
                return;
            }
            vri vriVar = new vri(qmaVar);
            this.f42442o = vriVar;
            vriVar.m28369a(this);
            this.f42430c.m30184i(this.f42442o);
            return;
        }
        if (obj == mma.f35707L) {
            vri vriVar2 = this.f42443p;
            if (vriVar2 != null) {
                this.f42430c.m30176F(vriVar2);
            }
            if (qmaVar == null) {
                this.f42443p = null;
                return;
            }
            this.f42431d.clear();
            this.f42432e.clear();
            vri vriVar3 = new vri(qmaVar);
            this.f42443p = vriVar3;
            vriVar3.m28369a(this);
            this.f42430c.m30184i(this.f42443p);
            return;
        }
        if (obj == mma.f35719j) {
            gc1 gc1Var2 = this.f42446s;
            if (gc1Var2 != null) {
                gc1Var2.m28380n(qmaVar);
                return;
            }
            vri vriVar4 = new vri(qmaVar);
            this.f42446s = vriVar4;
            vriVar4.m28369a(this);
            this.f42430c.m30184i(this.f42446s);
            return;
        }
        if (obj == mma.f35714e && (vz5Var5 = this.f42448u) != null) {
            vz5Var5.m53623c(qmaVar);
            return;
        }
        if (obj == mma.f35702G && (vz5Var4 = this.f42448u) != null) {
            vz5Var4.m53626f(qmaVar);
            return;
        }
        if (obj == mma.f35703H && (vz5Var3 = this.f42448u) != null) {
            vz5Var3.m53624d(qmaVar);
            return;
        }
        if (obj == mma.f35704I && (vz5Var2 = this.f42448u) != null) {
            vz5Var2.m53625e(qmaVar);
        } else {
            if (obj != mma.f35705J || (vz5Var = this.f42448u) == null) {
                return;
            }
            vz5Var.m53627g(qmaVar);
        }
    }

    @Override // p001o.dz5
    /* renamed from: e */
    public void mo20001e(RectF rectF, Matrix matrix, boolean z) {
        this.f42433f.reset();
        for (int i = 0; i < this.f42436i.size(); i++) {
            this.f42433f.addPath(((zzc) this.f42436i.get(i)).getPath(), matrix);
        }
        this.f42433f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: f */
    public final int[] m45849f(int[] iArr) {
        vri vriVar = this.f42443p;
        if (vriVar != null) {
            Integer[] numArr = (Integer[]) vriVar.mo28376h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // p001o.dz5
    /* renamed from: g */
    public void mo20002g(Canvas canvas, Matrix matrix, int i) {
        if (this.f42429b) {
            return;
        }
        ve9.m52656a("GradientFillContent#draw");
        this.f42433f.reset();
        for (int i2 = 0; i2 < this.f42436i.size(); i2++) {
            this.f42433f.addPath(((zzc) this.f42436i.get(i2)).getPath(), matrix);
        }
        this.f42433f.computeBounds(this.f42435h, false);
        Shader shaderM45851i = this.f42437j == vu7.LINEAR ? m45851i() : m45852j();
        shaderM45851i.setLocalMatrix(matrix);
        this.f42434g.setShader(shaderM45851i);
        gc1 gc1Var = this.f42442o;
        if (gc1Var != null) {
            this.f42434g.setColorFilter((ColorFilter) gc1Var.mo28376h());
        }
        gc1 gc1Var2 = this.f42446s;
        if (gc1Var2 != null) {
            float fFloatValue = ((Float) gc1Var2.mo28376h()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f42434g.setMaskFilter(null);
            } else if (fFloatValue != this.f42447t) {
                this.f42434g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f42447t = fFloatValue;
        }
        vz5 vz5Var = this.f42448u;
        if (vz5Var != null) {
            vz5Var.m53622b(this.f42434g);
        }
        this.f42434g.setAlpha(zeb.m59349d((int) ((((i / 255.0f) * ((Integer) this.f42439l.mo28376h()).intValue()) / 100.0f) * 255.0f), 0, Constants.MAX_HOST_LENGTH));
        canvas.drawPath(this.f42433f, this.f42434g);
        ve9.m52657b("GradientFillContent#draw");
    }

    @Override // p001o.j14
    public String getName() {
        return this.f42428a;
    }

    /* renamed from: h */
    public final int m45850h() {
        int iRound = Math.round(this.f42440m.m28374f() * this.f42445r);
        int iRound2 = Math.round(this.f42441n.m28374f() * this.f42445r);
        int iRound3 = Math.round(this.f42438k.m28374f() * this.f42445r);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    /* renamed from: i */
    public final LinearGradient m45851i() {
        long jM45850h = m45850h();
        LinearGradient linearGradient = (LinearGradient) this.f42431d.m46932c(jM45850h);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f42440m.mo28376h();
        PointF pointF2 = (PointF) this.f42441n.mo28376h();
        lu7 lu7Var = (lu7) this.f42438k.mo28376h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m45849f(lu7Var.m37893a()), lu7Var.m37894b(), Shader.TileMode.CLAMP);
        this.f42431d.m46936i(jM45850h, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: j */
    public final RadialGradient m45852j() {
        long jM45850h = m45850h();
        RadialGradient radialGradient = (RadialGradient) this.f42432e.m46932c(jM45850h);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f42440m.mo28376h();
        PointF pointF2 = (PointF) this.f42441n.mo28376h();
        lu7 lu7Var = (lu7) this.f42438k.mo28376h();
        int[] iArrM45849f = m45849f(lu7Var.m37893a());
        float[] fArrM37894b = lu7Var.m37894b();
        float f = pointF.x;
        float f2 = pointF.y;
        float fHypot = (float) Math.hypot(pointF2.x - f, pointF2.y - f2);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArrM45849f, fArrM37894b, Shader.TileMode.CLAMP);
        this.f42432e.m46936i(jM45850h, radialGradient2);
        return radialGradient2;
    }
}
