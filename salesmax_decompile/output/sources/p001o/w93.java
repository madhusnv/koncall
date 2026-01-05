package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import java.util.ArrayList;
import p001o.ez5;

/* loaded from: classes3.dex */
public final class w93 extends ez5 {

    /* renamed from: f */
    public float f51638f;

    /* renamed from: g */
    public float f51639g;

    /* renamed from: h */
    public float f51640h;

    /* renamed from: i */
    public float f51641i;

    /* renamed from: j */
    public float f51642j;

    /* renamed from: k */
    public float f51643k;

    /* renamed from: l */
    public int f51644l;

    /* renamed from: m */
    public float f51645m;

    /* renamed from: n */
    public boolean f51646n;

    /* renamed from: o */
    public float f51647o;

    /* renamed from: p */
    public final RectF f51648p;

    /* renamed from: q */
    public final Pair f51649q;

    public w93(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f51648p = new RectF();
        this.f51649q = new Pair(new ez5.C13290b(), new ez5.C13290b());
    }

    @Override // p001o.ez5
    /* renamed from: a */
    public void mo25862a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        float fWidth = rect.width() / mo25867f();
        float fHeight = rect.height() / mo25866e();
        je1 je1Var = this.f22427a;
        float f2 = (((CircularProgressIndicatorSpec) je1Var).f12816p / 2.0f) + ((CircularProgressIndicatorSpec) je1Var).f12817q;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) this.f22427a).f12818r != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        je1 je1Var2 = this.f22427a;
        this.f51638f = ((CircularProgressIndicatorSpec) je1Var2).f30233a * f;
        this.f51639g = Math.min(((CircularProgressIndicatorSpec) je1Var2).f30233a / 2, ((CircularProgressIndicatorSpec) je1Var2).m33607a()) * f;
        je1 je1Var3 = this.f22427a;
        this.f51640h = ((CircularProgressIndicatorSpec) je1Var3).f30244l * f;
        float f4 = (((CircularProgressIndicatorSpec) je1Var3).f12816p - ((CircularProgressIndicatorSpec) je1Var3).f30233a) / 2.0f;
        this.f51641i = f4;
        if (z || z2) {
            float f5 = ((1.0f - f) * ((CircularProgressIndicatorSpec) je1Var3).f30233a) / 2.0f;
            if ((z && ((CircularProgressIndicatorSpec) je1Var3).f30239g == 2) || (z2 && ((CircularProgressIndicatorSpec) je1Var3).f30240h == 1)) {
                this.f51641i = f4 + f5;
            } else if ((z && ((CircularProgressIndicatorSpec) je1Var3).f30239g == 1) || (z2 && ((CircularProgressIndicatorSpec) je1Var3).f30240h == 2)) {
                this.f51641i = f4 - f5;
            }
        }
        if (z2 && ((CircularProgressIndicatorSpec) je1Var3).f30240h == 3) {
            this.f51647o = f;
        } else {
            this.f51647o = 1.0f;
        }
    }

    @Override // p001o.ez5
    /* renamed from: b */
    public void mo25863b(Canvas canvas, Paint paint, int i, int i2) {
    }

    @Override // p001o.ez5
    /* renamed from: c */
    public void mo25864c(Canvas canvas, Paint paint, ez5.C13289a c13289a, int i) {
        int iM29502a = gua.m29502a(c13289a.f22434c, i);
        canvas.save();
        canvas.rotate(c13289a.f22438g);
        this.f51646n = c13289a.f22439h;
        float f = c13289a.f22432a;
        float f2 = c13289a.f22433b;
        int i2 = c13289a.f22435d;
        m54112m(canvas, paint, f, f2, iM29502a, i2, i2, c13289a.f22436e, c13289a.f22437f, true);
        canvas.restore();
    }

    @Override // p001o.ez5
    /* renamed from: d */
    public void mo25865d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iM29502a = gua.m29502a(i, i2);
        this.f51646n = false;
        m54112m(canvas, paint, f, f2, iM29502a, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // p001o.ez5
    /* renamed from: e */
    public int mo25866e() {
        return m54115p();
    }

    @Override // p001o.ez5
    /* renamed from: f */
    public int mo25867f() {
        return m54115p();
    }

    @Override // p001o.ez5
    /* renamed from: g */
    public void mo25868g() {
        this.f22428b.rewind();
        this.f22428b.moveTo(1.0f, 0.0f);
        for (int i = 0; i < 2; i++) {
            this.f22428b.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            this.f22428b.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            this.f22428b.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            this.f22428b.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        this.f22431e.reset();
        Matrix matrix = this.f22431e;
        float f = this.f51641i;
        matrix.setScale(f, f);
        this.f22428b.transform(this.f22431e);
        if (((CircularProgressIndicatorSpec) this.f22427a).m33608b(this.f51646n)) {
            this.f22430d.setPath(this.f22428b, false);
            m54111l(this.f22430d, this.f22428b, this.f51643k);
        }
        this.f22430d.setPath(this.f22428b, false);
    }

    /* renamed from: j */
    public final void m54109j(Path path, ez5.C13290b c13290b, ez5.C13290b c13290b2) {
        float f = (this.f51642j / 2.0f) * 0.48f;
        ez5.C13290b c13290b3 = new ez5.C13290b(this, c13290b);
        ez5.C13290b c13290b4 = new ez5.C13290b(this, c13290b2);
        c13290b3.m25872b(f);
        c13290b4.m25872b(-f);
        float[] fArr = c13290b3.f22440a;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float[] fArr2 = c13290b4.f22440a;
        float f4 = fArr2[0];
        float f5 = fArr2[1];
        float[] fArr3 = c13290b2.f22440a;
        path.cubicTo(f2, f3, f4, f5, fArr3[0], fArr3[1]);
    }

    /* renamed from: k */
    public final void m54110k(PathMeasure pathMeasure, Path path, Pair pair, float f, float f2, float f3, float f4) {
        float f5 = this.f51640h * f3;
        int i = this.f51646n ? ((CircularProgressIndicatorSpec) this.f22427a).f30242j : ((CircularProgressIndicatorSpec) this.f22427a).f30243k;
        float f6 = this.f51641i;
        if (f6 != this.f51645m || (pathMeasure == this.f22430d && (f5 != this.f51643k || i != this.f51644l))) {
            this.f51643k = f5;
            this.f51644l = i;
            this.f51645m = f6;
            mo25868g();
        }
        path.rewind();
        float f7 = 0.0f;
        float fM44555a = pza.m44555a(f2, 0.0f, 1.0f);
        if (((CircularProgressIndicatorSpec) this.f22427a).m33608b(this.f51646n)) {
            float f8 = f4 / ((float) ((this.f51641i * 6.283185307179586d) / this.f51642j));
            f += f8;
            f7 = 0.0f - (f8 * 360.0f);
        }
        float f9 = f % 1.0f;
        float length = (pathMeasure.getLength() * f9) / 2.0f;
        float length2 = ((f9 + fM44555a) * pathMeasure.getLength()) / 2.0f;
        pathMeasure.getSegment(length, length2, path, true);
        ez5.C13290b c13290b = (ez5.C13290b) pair.first;
        c13290b.m25873c();
        pathMeasure.getPosTan(length, c13290b.f22440a, c13290b.f22441b);
        ez5.C13290b c13290b2 = (ez5.C13290b) pair.second;
        c13290b2.m25873c();
        pathMeasure.getPosTan(length2, c13290b2.f22440a, c13290b2.f22441b);
        this.f22431e.reset();
        this.f22431e.setRotate(f7);
        c13290b.m25874d(f7);
        c13290b2.m25874d(f7);
        path.transform(this.f22431e);
    }

    /* renamed from: l */
    public final void m54111l(PathMeasure pathMeasure, Path path, float f) {
        path.rewind();
        float length = pathMeasure.getLength();
        int iMax = Math.max(3, (int) ((length / (this.f51646n ? ((CircularProgressIndicatorSpec) this.f22427a).f30242j : ((CircularProgressIndicatorSpec) this.f22427a).f30243k)) / 2.0f)) * 2;
        this.f51642j = length / iMax;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iMax; i++) {
            ez5.C13290b c13290b = new ez5.C13290b();
            float f2 = i;
            pathMeasure.getPosTan(this.f51642j * f2, c13290b.f22440a, c13290b.f22441b);
            ez5.C13290b c13290b2 = new ez5.C13290b();
            float f3 = this.f51642j;
            pathMeasure.getPosTan((f2 * f3) + (f3 / 2.0f), c13290b2.f22440a, c13290b2.f22441b);
            arrayList.add(c13290b);
            c13290b2.m25871a(f * 2.0f);
            arrayList.add(c13290b2);
        }
        arrayList.add((ez5.C13290b) arrayList.get(0));
        ez5.C13290b c13290b3 = (ez5.C13290b) arrayList.get(0);
        float[] fArr = c13290b3.f22440a;
        int i2 = 1;
        path.moveTo(fArr[0], fArr[1]);
        while (i2 < arrayList.size()) {
            ez5.C13290b c13290b4 = (ez5.C13290b) arrayList.get(i2);
            m54109j(path, c13290b3, c13290b4);
            i2++;
            c13290b3 = c13290b4;
        }
    }

    /* renamed from: m */
    public final void m54112m(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f6 = f % 1.0f;
        if (f6 < 0.0f) {
            f6 += 1.0f;
        }
        float f7 = f6;
        if (this.f51647o < 1.0f) {
            float f8 = f7 + f5;
            if (f8 > 1.0f) {
                m54112m(canvas, paint, f7, 1.0f, i, i2, 0, f3, f4, z);
                m54112m(canvas, paint, 1.0f, f8, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f51639g / this.f51641i);
        float f9 = f5 - 0.99f;
        if (f9 >= 0.0f) {
            float f10 = ((f9 * degrees) / 180.0f) / 0.01f;
            f5 += f10;
            if (!z) {
                f7 -= f10 / 2.0f;
            }
        }
        float fM42807f = oza.m42807f(1.0f - this.f51647o, 1.0f, f7);
        float fM42807f2 = oza.m42807f(0.0f, this.f51647o, f5);
        float degrees2 = (float) Math.toDegrees(i2 / this.f51641i);
        float degrees3 = ((fM42807f2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.f51641i));
        float f11 = (fM42807f * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        boolean z2 = ((CircularProgressIndicatorSpec) this.f22427a).m33608b(this.f51646n) && z && f3 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f51638f);
        float f12 = this.f51639g * 2.0f;
        float f13 = degrees * 2.0f;
        if (degrees3 < f13) {
            float f14 = degrees3 / f13;
            float f15 = f11 + (degrees * f14);
            ez5.C13290b c13290b = new ez5.C13290b();
            if (z2) {
                float length = ((f15 / 360.0f) * this.f22430d.getLength()) / 2.0f;
                float f16 = this.f51640h * f3;
                float f17 = this.f51641i;
                if (f17 != this.f51645m || f16 != this.f51643k) {
                    this.f51643k = f16;
                    this.f51645m = f17;
                    mo25868g();
                }
                this.f22430d.getPosTan(length, c13290b.f22440a, c13290b.f22441b);
            } else {
                c13290b.m25874d(f15 + 90.0f);
                c13290b.m25871a(-this.f51641i);
            }
            paint.setStyle(Paint.Style.FILL);
            m54114o(canvas, paint, c13290b, f12, this.f51638f, f14);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(((CircularProgressIndicatorSpec) this.f22427a).mo14911g() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f18 = f11 + degrees;
        float f19 = degrees3 - f13;
        ((ez5.C13290b) this.f51649q.first).m25873c();
        ((ez5.C13290b) this.f51649q.second).m25873c();
        if (z2) {
            m54110k(this.f22430d, this.f22429c, this.f51649q, f18 / 360.0f, f19 / 360.0f, f3, f4);
            canvas.drawPath(this.f22429c, paint);
        } else {
            ((ez5.C13290b) this.f51649q.first).m25874d(f18 + 90.0f);
            ((ez5.C13290b) this.f51649q.first).m25871a(-this.f51641i);
            ((ez5.C13290b) this.f51649q.second).m25874d(f18 + f19 + 90.0f);
            ((ez5.C13290b) this.f51649q.second).m25871a(-this.f51641i);
            RectF rectF = this.f51648p;
            float f20 = this.f51641i;
            rectF.set(-f20, -f20, f20, f20);
            canvas.drawArc(this.f51648p, f18, f19, false, paint);
        }
        if (((CircularProgressIndicatorSpec) this.f22427a).mo14911g() || this.f51639g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        m54113n(canvas, paint, (ez5.C13290b) this.f51649q.first, f12, this.f51638f);
        m54113n(canvas, paint, (ez5.C13290b) this.f51649q.second, f12, this.f51638f);
    }

    /* renamed from: n */
    public final void m54113n(Canvas canvas, Paint paint, ez5.C13290b c13290b, float f, float f2) {
        m54114o(canvas, paint, c13290b, f, f2, 1.0f);
    }

    /* renamed from: o */
    public final void m54114o(Canvas canvas, Paint paint, ez5.C13290b c13290b, float f, float f2, float f3) {
        float fMin = Math.min(f2, this.f51638f);
        float f4 = f / 2.0f;
        float fMin2 = Math.min(f4, (this.f51639g * fMin) / this.f51638f);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f4, fMin / 2.0f);
        canvas.save();
        float[] fArr = c13290b.f22440a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(m25870i(c13290b.f22441b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    /* renamed from: p */
    public final int m54115p() {
        je1 je1Var = this.f22427a;
        return ((CircularProgressIndicatorSpec) je1Var).f12816p + (((CircularProgressIndicatorSpec) je1Var).f12817q * 2);
    }
}
