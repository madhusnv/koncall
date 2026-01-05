package p001o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.List;
import p001o.gc1;
import p001o.plf;

/* loaded from: classes3.dex */
public abstract class oe1 implements gc1.InterfaceC13670b, ad9, dz5 {

    /* renamed from: e */
    public final ema f38184e;

    /* renamed from: f */
    public final hc1 f38185f;

    /* renamed from: h */
    public final float[] f38187h;

    /* renamed from: i */
    public final Paint f38188i;

    /* renamed from: j */
    public final gc1 f38189j;

    /* renamed from: k */
    public final gc1 f38190k;

    /* renamed from: l */
    public final List f38191l;

    /* renamed from: m */
    public final gc1 f38192m;

    /* renamed from: n */
    public gc1 f38193n;

    /* renamed from: o */
    public gc1 f38194o;

    /* renamed from: p */
    public float f38195p;

    /* renamed from: q */
    public vz5 f38196q;

    /* renamed from: a */
    public final PathMeasure f38180a = new PathMeasure();

    /* renamed from: b */
    public final Path f38181b = new Path();

    /* renamed from: c */
    public final Path f38182c = new Path();

    /* renamed from: d */
    public final RectF f38183d = new RectF();

    /* renamed from: g */
    public final List f38186g = new ArrayList();

    /* renamed from: o.oe1$b */
    public static final class C15768b {

        /* renamed from: a */
        public final List f38197a;

        /* renamed from: b */
        public final txh f38198b;

        public C15768b(txh txhVar) {
            this.f38197a = new ArrayList();
            this.f38198b = txhVar;
        }
    }

    public oe1(ema emaVar, hc1 hc1Var, Paint.Cap cap, Paint.Join join, float f, hg0 hg0Var, fg0 fg0Var, List list, fg0 fg0Var2) {
        we9 we9Var = new we9(1);
        this.f38188i = we9Var;
        this.f38195p = 0.0f;
        this.f38184e = emaVar;
        this.f38185f = hc1Var;
        we9Var.setStyle(Paint.Style.STROKE);
        we9Var.setStrokeCap(cap);
        we9Var.setStrokeJoin(join);
        we9Var.setStrokeMiter(f);
        this.f38190k = hg0Var.mo24960a();
        this.f38189j = fg0Var.mo24960a();
        if (fg0Var2 == null) {
            this.f38192m = null;
        } else {
            this.f38192m = fg0Var2.mo24960a();
        }
        this.f38191l = new ArrayList(list.size());
        this.f38187h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f38191l.add(((fg0) list.get(i)).mo24960a());
        }
        hc1Var.m30184i(this.f38190k);
        hc1Var.m30184i(this.f38189j);
        for (int i2 = 0; i2 < this.f38191l.size(); i2++) {
            hc1Var.m30184i((gc1) this.f38191l.get(i2));
        }
        gc1 gc1Var = this.f38192m;
        if (gc1Var != null) {
            hc1Var.m30184i(gc1Var);
        }
        this.f38190k.m28369a(this);
        this.f38189j.m28369a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((gc1) this.f38191l.get(i3)).m28369a(this);
        }
        gc1 gc1Var2 = this.f38192m;
        if (gc1Var2 != null) {
            gc1Var2.m28369a(this);
        }
        if (hc1Var.mo30195v() != null) {
            gc1 gc1VarMo24960a = hc1Var.mo30195v().m57859a().mo24960a();
            this.f38194o = gc1VarMo24960a;
            gc1VarMo24960a.m28369a(this);
            hc1Var.m30184i(this.f38194o);
        }
        if (hc1Var.mo30197x() != null) {
            this.f38196q = new vz5(this, hc1Var, hc1Var.mo30197x());
        }
    }

    @Override // p001o.gc1.InterfaceC13670b
    /* renamed from: a */
    public void mo19333a() {
        this.f38184e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // p001o.j14
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo19334b(List list, List list2) {
        txh txhVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            j14 j14Var = (j14) list.get(size);
            if (j14Var instanceof txh) {
                txh txhVar2 = (txh) j14Var;
                if (txhVar2.m50755i() == plf.EnumC16137a.INDIVIDUALLY) {
                    txhVar = txhVar2;
                }
            }
        }
        if (txhVar != null) {
            txhVar.m50751c(this);
        }
        C15768b c15768b = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            j14 j14Var2 = (j14) list2.get(size2);
            if (j14Var2 instanceof txh) {
                txh txhVar3 = (txh) j14Var2;
                if (txhVar3.m50755i() == plf.EnumC16137a.INDIVIDUALLY) {
                    if (c15768b != null) {
                        this.f38186g.add(c15768b);
                    }
                    c15768b = new C15768b(txhVar3);
                    txhVar3.m50751c(this);
                } else if (j14Var2 instanceof zzc) {
                    if (c15768b == null) {
                        c15768b = new C15768b(txhVar);
                    }
                    c15768b.f38197a.add((zzc) j14Var2);
                }
            }
        }
        if (c15768b != null) {
            this.f38186g.add(c15768b);
        }
    }

    @Override // p001o.zc9
    /* renamed from: c */
    public void mo19999c(yc9 yc9Var, int i, List list, yc9 yc9Var2) {
        zeb.m59358m(yc9Var, i, list, yc9Var2, this);
    }

    /* renamed from: d */
    public void mo20000d(Object obj, qma qmaVar) {
        vz5 vz5Var;
        vz5 vz5Var2;
        vz5 vz5Var3;
        vz5 vz5Var4;
        vz5 vz5Var5;
        if (obj == mma.f35713d) {
            this.f38190k.m28380n(qmaVar);
            return;
        }
        if (obj == mma.f35728s) {
            this.f38189j.m28380n(qmaVar);
            return;
        }
        if (obj == mma.f35706K) {
            gc1 gc1Var = this.f38193n;
            if (gc1Var != null) {
                this.f38185f.m30176F(gc1Var);
            }
            if (qmaVar == null) {
                this.f38193n = null;
                return;
            }
            vri vriVar = new vri(qmaVar);
            this.f38193n = vriVar;
            vriVar.m28369a(this);
            this.f38185f.m30184i(this.f38193n);
            return;
        }
        if (obj == mma.f35719j) {
            gc1 gc1Var2 = this.f38194o;
            if (gc1Var2 != null) {
                gc1Var2.m28380n(qmaVar);
                return;
            }
            vri vriVar2 = new vri(qmaVar);
            this.f38194o = vriVar2;
            vriVar2.m28369a(this);
            this.f38185f.m30184i(this.f38194o);
            return;
        }
        if (obj == mma.f35714e && (vz5Var5 = this.f38196q) != null) {
            vz5Var5.m53623c(qmaVar);
            return;
        }
        if (obj == mma.f35702G && (vz5Var4 = this.f38196q) != null) {
            vz5Var4.m53626f(qmaVar);
            return;
        }
        if (obj == mma.f35703H && (vz5Var3 = this.f38196q) != null) {
            vz5Var3.m53624d(qmaVar);
            return;
        }
        if (obj == mma.f35704I && (vz5Var2 = this.f38196q) != null) {
            vz5Var2.m53625e(qmaVar);
        } else {
            if (obj != mma.f35705J || (vz5Var = this.f38196q) == null) {
                return;
            }
            vz5Var.m53627g(qmaVar);
        }
    }

    @Override // p001o.dz5
    /* renamed from: e */
    public void mo20001e(RectF rectF, Matrix matrix, boolean z) {
        ve9.m52656a("StrokeContent#getBounds");
        this.f38181b.reset();
        for (int i = 0; i < this.f38186g.size(); i++) {
            C15768b c15768b = (C15768b) this.f38186g.get(i);
            for (int i2 = 0; i2 < c15768b.f38197a.size(); i2++) {
                this.f38181b.addPath(((zzc) c15768b.f38197a.get(i2)).getPath(), matrix);
            }
        }
        this.f38181b.computeBounds(this.f38183d, false);
        float fM28012p = ((g37) this.f38189j).m28012p();
        RectF rectF2 = this.f38183d;
        float f = fM28012p / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f38183d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        ve9.m52657b("StrokeContent#getBounds");
    }

    /* renamed from: f */
    public final void m42103f(Matrix matrix) {
        ve9.m52656a("StrokeContent#applyDashPattern");
        if (this.f38191l.isEmpty()) {
            ve9.m52657b("StrokeContent#applyDashPattern");
            return;
        }
        float fM31027g = hri.m31027g(matrix);
        for (int i = 0; i < this.f38191l.size(); i++) {
            this.f38187h[i] = ((Float) ((gc1) this.f38191l.get(i)).mo28376h()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f38187h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f38187h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f38187h;
            fArr3[i] = fArr3[i] * fM31027g;
        }
        gc1 gc1Var = this.f38192m;
        this.f38188i.setPathEffect(new DashPathEffect(this.f38187h, gc1Var == null ? 0.0f : fM31027g * ((Float) gc1Var.mo28376h()).floatValue()));
        ve9.m52657b("StrokeContent#applyDashPattern");
    }

    /* renamed from: g */
    public void mo20002g(Canvas canvas, Matrix matrix, int i) {
        ve9.m52656a("StrokeContent#draw");
        if (hri.m31028h(matrix)) {
            ve9.m52657b("StrokeContent#draw");
            return;
        }
        this.f38188i.setAlpha(zeb.m59349d((int) ((((i / 255.0f) * ((sl8) this.f38190k).m48456p()) / 100.0f) * 255.0f), 0, Constants.MAX_HOST_LENGTH));
        this.f38188i.setStrokeWidth(((g37) this.f38189j).m28012p() * hri.m31027g(matrix));
        if (this.f38188i.getStrokeWidth() <= 0.0f) {
            ve9.m52657b("StrokeContent#draw");
            return;
        }
        m42103f(matrix);
        gc1 gc1Var = this.f38193n;
        if (gc1Var != null) {
            this.f38188i.setColorFilter((ColorFilter) gc1Var.mo28376h());
        }
        gc1 gc1Var2 = this.f38194o;
        if (gc1Var2 != null) {
            float fFloatValue = ((Float) gc1Var2.mo28376h()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f38188i.setMaskFilter(null);
            } else if (fFloatValue != this.f38195p) {
                this.f38188i.setMaskFilter(this.f38185f.m30196w(fFloatValue));
            }
            this.f38195p = fFloatValue;
        }
        vz5 vz5Var = this.f38196q;
        if (vz5Var != null) {
            vz5Var.m53622b(this.f38188i);
        }
        for (int i2 = 0; i2 < this.f38186g.size(); i2++) {
            C15768b c15768b = (C15768b) this.f38186g.get(i2);
            if (c15768b.f38198b != null) {
                m42104h(canvas, c15768b, matrix);
            } else {
                ve9.m52656a("StrokeContent#buildPath");
                this.f38181b.reset();
                for (int size = c15768b.f38197a.size() - 1; size >= 0; size--) {
                    this.f38181b.addPath(((zzc) c15768b.f38197a.get(size)).getPath(), matrix);
                }
                ve9.m52657b("StrokeContent#buildPath");
                ve9.m52656a("StrokeContent#drawPath");
                canvas.drawPath(this.f38181b, this.f38188i);
                ve9.m52657b("StrokeContent#drawPath");
            }
        }
        ve9.m52657b("StrokeContent#draw");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m42104h(Canvas canvas, C15768b c15768b, Matrix matrix) {
        ve9.m52656a("StrokeContent#applyTrimPath");
        if (c15768b.f38198b == null) {
            ve9.m52657b("StrokeContent#applyTrimPath");
            return;
        }
        this.f38181b.reset();
        for (int size = c15768b.f38197a.size() - 1; size >= 0; size--) {
            this.f38181b.addPath(((zzc) c15768b.f38197a.get(size)).getPath(), matrix);
        }
        this.f38180a.setPath(this.f38181b, false);
        float length = this.f38180a.getLength();
        while (this.f38180a.nextContour()) {
            length += this.f38180a.getLength();
        }
        float fFloatValue = (((Float) c15768b.f38198b.m50753f().mo28376h()).floatValue() * length) / 360.0f;
        float fFloatValue2 = ((((Float) c15768b.f38198b.m50754h().mo28376h()).floatValue() / 100.0f) * length) + fFloatValue;
        float fFloatValue3 = ((((Float) c15768b.f38198b.m50752d().mo28376h()).floatValue() / 100.0f) * length) + fFloatValue;
        float f = 0.0f;
        for (int size2 = c15768b.f38197a.size() - 1; size2 >= 0; size2--) {
            this.f38182c.set(((zzc) c15768b.f38197a.get(size2)).getPath());
            this.f38182c.transform(matrix);
            this.f38180a.setPath(this.f38182c, false);
            float length2 = this.f38180a.getLength();
            if (fFloatValue3 > length) {
                float f2 = fFloatValue3 - length;
                if (f2 >= f + length2 || f >= f2) {
                    float f3 = f + length2;
                    if (f3 >= fFloatValue2 && f <= fFloatValue3) {
                        if (f3 > fFloatValue3 || fFloatValue2 >= f) {
                            hri.m31021a(this.f38182c, fFloatValue2 < f ? 0.0f : (fFloatValue2 - f) / length2, fFloatValue3 <= f3 ? (fFloatValue3 - f) / length2 : 1.0f, 0.0f);
                            canvas.drawPath(this.f38182c, this.f38188i);
                        } else {
                            canvas.drawPath(this.f38182c, this.f38188i);
                        }
                    }
                } else {
                    hri.m31021a(this.f38182c, fFloatValue2 > length ? (fFloatValue2 - length) / length2 : 0.0f, Math.min(f2 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f38182c, this.f38188i);
                }
            }
            f += length2;
        }
        ve9.m52657b("StrokeContent#applyTrimPath");
    }
}
