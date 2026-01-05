package p001o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.List;
import p001o.gc1;

/* loaded from: classes3.dex */
public class c07 implements dz5, gc1.InterfaceC13670b, ad9 {

    /* renamed from: a */
    public final Path f17047a;

    /* renamed from: b */
    public final Paint f17048b;

    /* renamed from: c */
    public final hc1 f17049c;

    /* renamed from: d */
    public final String f17050d;

    /* renamed from: e */
    public final boolean f17051e;

    /* renamed from: f */
    public final List f17052f;

    /* renamed from: g */
    public final gc1 f17053g;

    /* renamed from: h */
    public final gc1 f17054h;

    /* renamed from: i */
    public gc1 f17055i;

    /* renamed from: j */
    public final ema f17056j;

    /* renamed from: k */
    public gc1 f17057k;

    /* renamed from: l */
    public float f17058l;

    /* renamed from: m */
    public vz5 f17059m;

    public c07(ema emaVar, hc1 hc1Var, elf elfVar) {
        Path path = new Path();
        this.f17047a = path;
        this.f17048b = new we9(1);
        this.f17052f = new ArrayList();
        this.f17049c = hc1Var;
        this.f17050d = elfVar.m25217d();
        this.f17051e = elfVar.m25219f();
        this.f17056j = emaVar;
        if (hc1Var.mo30195v() != null) {
            gc1 gc1VarMo24960a = hc1Var.mo30195v().m57859a().mo24960a();
            this.f17057k = gc1VarMo24960a;
            gc1VarMo24960a.m28369a(this);
            hc1Var.m30184i(this.f17057k);
        }
        if (hc1Var.mo30197x() != null) {
            this.f17059m = new vz5(this, hc1Var, hc1Var.mo30197x());
        }
        if (elfVar.m25215b() == null || elfVar.m25218e() == null) {
            this.f17053g = null;
            this.f17054h = null;
            return;
        }
        path.setFillType(elfVar.m25216c());
        gc1 gc1VarMo24960a2 = elfVar.m25215b().mo24960a();
        this.f17053g = gc1VarMo24960a2;
        gc1VarMo24960a2.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a2);
        gc1 gc1VarMo24960a3 = elfVar.m25218e().mo24960a();
        this.f17054h = gc1VarMo24960a3;
        gc1VarMo24960a3.m28369a(this);
        hc1Var.m30184i(gc1VarMo24960a3);
    }

    @Override // p001o.gc1.InterfaceC13670b
    /* renamed from: a */
    public void mo19333a() {
        this.f17056j.invalidateSelf();
    }

    @Override // p001o.j14
    /* renamed from: b */
    public void mo19334b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            j14 j14Var = (j14) list2.get(i);
            if (j14Var instanceof zzc) {
                this.f17052f.add((zzc) j14Var);
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
        if (obj == mma.f35710a) {
            this.f17053g.m28380n(qmaVar);
            return;
        }
        if (obj == mma.f35713d) {
            this.f17054h.m28380n(qmaVar);
            return;
        }
        if (obj == mma.f35706K) {
            gc1 gc1Var = this.f17055i;
            if (gc1Var != null) {
                this.f17049c.m30176F(gc1Var);
            }
            if (qmaVar == null) {
                this.f17055i = null;
                return;
            }
            vri vriVar = new vri(qmaVar);
            this.f17055i = vriVar;
            vriVar.m28369a(this);
            this.f17049c.m30184i(this.f17055i);
            return;
        }
        if (obj == mma.f35719j) {
            gc1 gc1Var2 = this.f17057k;
            if (gc1Var2 != null) {
                gc1Var2.m28380n(qmaVar);
                return;
            }
            vri vriVar2 = new vri(qmaVar);
            this.f17057k = vriVar2;
            vriVar2.m28369a(this);
            this.f17049c.m30184i(this.f17057k);
            return;
        }
        if (obj == mma.f35714e && (vz5Var5 = this.f17059m) != null) {
            vz5Var5.m53623c(qmaVar);
            return;
        }
        if (obj == mma.f35702G && (vz5Var4 = this.f17059m) != null) {
            vz5Var4.m53626f(qmaVar);
            return;
        }
        if (obj == mma.f35703H && (vz5Var3 = this.f17059m) != null) {
            vz5Var3.m53624d(qmaVar);
            return;
        }
        if (obj == mma.f35704I && (vz5Var2 = this.f17059m) != null) {
            vz5Var2.m53625e(qmaVar);
        } else {
            if (obj != mma.f35705J || (vz5Var = this.f17059m) == null) {
                return;
            }
            vz5Var.m53627g(qmaVar);
        }
    }

    @Override // p001o.dz5
    /* renamed from: e */
    public void mo20001e(RectF rectF, Matrix matrix, boolean z) {
        this.f17047a.reset();
        for (int i = 0; i < this.f17052f.size(); i++) {
            this.f17047a.addPath(((zzc) this.f17052f.get(i)).getPath(), matrix);
        }
        this.f17047a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p001o.dz5
    /* renamed from: g */
    public void mo20002g(Canvas canvas, Matrix matrix, int i) {
        if (this.f17051e) {
            return;
        }
        ve9.m52656a("FillContent#draw");
        this.f17048b.setColor(((qh3) this.f17053g).m45489p());
        this.f17048b.setAlpha(zeb.m59349d((int) ((((i / 255.0f) * ((Integer) this.f17054h.mo28376h()).intValue()) / 100.0f) * 255.0f), 0, Constants.MAX_HOST_LENGTH));
        gc1 gc1Var = this.f17055i;
        if (gc1Var != null) {
            this.f17048b.setColorFilter((ColorFilter) gc1Var.mo28376h());
        }
        gc1 gc1Var2 = this.f17057k;
        if (gc1Var2 != null) {
            float fFloatValue = ((Float) gc1Var2.mo28376h()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f17048b.setMaskFilter(null);
            } else if (fFloatValue != this.f17058l) {
                this.f17048b.setMaskFilter(this.f17049c.m30196w(fFloatValue));
            }
            this.f17058l = fFloatValue;
        }
        vz5 vz5Var = this.f17059m;
        if (vz5Var != null) {
            vz5Var.m53622b(this.f17048b);
        }
        this.f17047a.reset();
        for (int i2 = 0; i2 < this.f17052f.size(); i2++) {
            this.f17047a.addPath(((zzc) this.f17052f.get(i2)).getPath(), matrix);
        }
        canvas.drawPath(this.f17047a, this.f17048b);
        ve9.m52657b("FillContent#draw");
    }

    @Override // p001o.j14
    public String getName() {
        return this.f17050d;
    }
}
