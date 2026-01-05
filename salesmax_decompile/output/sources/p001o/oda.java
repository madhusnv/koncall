package p001o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import p001o.ez5;

/* loaded from: classes3.dex */
public final class oda extends ez5 {

    /* renamed from: f */
    public float f38147f;

    /* renamed from: g */
    public float f38148g;

    /* renamed from: h */
    public float f38149h;

    /* renamed from: i */
    public float f38150i;

    /* renamed from: j */
    public float f38151j;

    /* renamed from: k */
    public float f38152k;

    /* renamed from: l */
    public int f38153l;

    /* renamed from: m */
    public boolean f38154m;

    /* renamed from: n */
    public float f38155n;

    /* renamed from: o */
    public Pair f38156o;

    public oda(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f38147f = 300.0f;
        this.f38156o = new Pair(new ez5.C13290b(), new ez5.C13290b());
    }

    @Override // p001o.ez5
    /* renamed from: a */
    public void mo25862a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        if (this.f38147f != rect.width()) {
            this.f38147f = rect.width();
            mo25868g();
        }
        float fMo25866e = mo25866e();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - fMo25866e) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f22427a).f12823q) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.f38147f / 2.0f;
        float f3 = fMo25866e / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        je1 je1Var = this.f22427a;
        this.f38148g = ((LinearProgressIndicatorSpec) je1Var).f30233a * f;
        this.f38149h = Math.min(((LinearProgressIndicatorSpec) je1Var).f30233a / 2, ((LinearProgressIndicatorSpec) je1Var).m33607a()) * f;
        je1 je1Var2 = this.f22427a;
        this.f38151j = ((LinearProgressIndicatorSpec) je1Var2).f30244l * f;
        this.f38150i = Math.min(((LinearProgressIndicatorSpec) je1Var2).f30233a / 2.0f, ((LinearProgressIndicatorSpec) je1Var2).m14913i()) * f;
        if (z || z2) {
            if ((z && ((LinearProgressIndicatorSpec) this.f22427a).f30239g == 2) || (z2 && ((LinearProgressIndicatorSpec) this.f22427a).f30240h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && ((LinearProgressIndicatorSpec) this.f22427a).f30240h != 3)) {
                canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f22427a).f30233a * (1.0f - f)) / 2.0f);
            }
        }
        if (z2 && ((LinearProgressIndicatorSpec) this.f22427a).f30240h == 3) {
            this.f38155n = f;
        } else {
            this.f38155n = 1.0f;
        }
    }

    @Override // p001o.ez5
    /* renamed from: b */
    public void mo25863b(Canvas canvas, Paint paint, int i, int i2) {
        int iM29502a = gua.m29502a(i, i2);
        this.f38154m = false;
        if (((LinearProgressIndicatorSpec) this.f22427a).f12824r <= 0 || iM29502a == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iM29502a);
        je1 je1Var = this.f22427a;
        ez5.C13290b c13290b = new ez5.C13290b(new float[]{(this.f38147f / 2.0f) - (((LinearProgressIndicatorSpec) je1Var).f12825s != null ? ((LinearProgressIndicatorSpec) je1Var).f12825s.floatValue() + (((LinearProgressIndicatorSpec) this.f22427a).f12824r / 2.0f) : this.f38148g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        je1 je1Var2 = this.f22427a;
        m42077l(canvas, paint, c13290b, ((LinearProgressIndicatorSpec) je1Var2).f12824r, ((LinearProgressIndicatorSpec) je1Var2).f12824r, (this.f38149h * ((LinearProgressIndicatorSpec) je1Var2).f12824r) / this.f38148g);
    }

    @Override // p001o.ez5
    /* renamed from: c */
    public void mo25864c(Canvas canvas, Paint paint, ez5.C13289a c13289a, int i) {
        int iM29502a = gua.m29502a(c13289a.f22434c, i);
        this.f38154m = c13289a.f22439h;
        float f = c13289a.f22432a;
        float f2 = c13289a.f22433b;
        int i2 = c13289a.f22435d;
        m42076k(canvas, paint, f, f2, iM29502a, i2, i2, c13289a.f22436e, c13289a.f22437f, true);
    }

    @Override // p001o.ez5
    /* renamed from: d */
    public void mo25865d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iM29502a = gua.m29502a(i, i2);
        this.f38154m = false;
        m42076k(canvas, paint, f, f2, iM29502a, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // p001o.ez5
    /* renamed from: e */
    public int mo25866e() {
        je1 je1Var = this.f22427a;
        return ((LinearProgressIndicatorSpec) je1Var).f30233a + (((LinearProgressIndicatorSpec) je1Var).f30244l * 2);
    }

    @Override // p001o.ez5
    /* renamed from: f */
    public int mo25867f() {
        return -1;
    }

    @Override // p001o.ez5
    /* renamed from: g */
    public void mo25868g() {
        this.f22428b.rewind();
        if (((LinearProgressIndicatorSpec) this.f22427a).m33608b(this.f38154m)) {
            int i = this.f38154m ? ((LinearProgressIndicatorSpec) this.f22427a).f30242j : ((LinearProgressIndicatorSpec) this.f22427a).f30243k;
            float f = this.f38147f;
            int i2 = (int) (f / i);
            this.f38152k = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                this.f22428b.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = i4 + 2;
                this.f22428b.cubicTo(f2 + 0.48f, 1.0f, f3 - 0.48f, 0.0f, f3, 0.0f);
            }
            this.f22431e.reset();
            this.f22431e.setScale(this.f38152k / 2.0f, -2.0f);
            this.f22431e.postTranslate(0.0f, 1.0f);
            this.f22428b.transform(this.f22431e);
        } else {
            this.f22428b.lineTo(this.f38147f, 0.0f);
        }
        this.f22430d.setPath(this.f22428b, false);
    }

    /* renamed from: j */
    public final void m42075j(PathMeasure pathMeasure, Path path, Pair pair, float f, float f2, float f3, float f4) {
        int i = this.f38154m ? ((LinearProgressIndicatorSpec) this.f22427a).f30242j : ((LinearProgressIndicatorSpec) this.f22427a).f30243k;
        if (pathMeasure == this.f22430d && i != this.f38153l) {
            this.f38153l = i;
            mo25868g();
        }
        path.rewind();
        float f5 = (-this.f38147f) / 2.0f;
        boolean zM33608b = ((LinearProgressIndicatorSpec) this.f22427a).m33608b(this.f38154m);
        if (zM33608b) {
            float f6 = this.f38147f;
            float f7 = this.f38152k;
            float f8 = f6 / f7;
            float f9 = f4 / f8;
            float f10 = f8 / (f8 + 1.0f);
            f = (f + f9) * f10;
            f2 = (f2 + f9) * f10;
            f5 -= f4 * f7;
        }
        float length = f * pathMeasure.getLength();
        float length2 = f2 * pathMeasure.getLength();
        pathMeasure.getSegment(length, length2, path, true);
        ez5.C13290b c13290b = (ez5.C13290b) pair.first;
        c13290b.m25873c();
        pathMeasure.getPosTan(length, c13290b.f22440a, c13290b.f22441b);
        ez5.C13290b c13290b2 = (ez5.C13290b) pair.second;
        c13290b2.m25873c();
        pathMeasure.getPosTan(length2, c13290b2.f22440a, c13290b2.f22441b);
        this.f22431e.reset();
        this.f22431e.setTranslate(f5, 0.0f);
        c13290b.m25876f(f5, 0.0f);
        c13290b2.m25876f(f5, 0.0f);
        if (zM33608b) {
            float f11 = this.f38151j * f3;
            this.f22431e.postScale(1.0f, f11);
            c13290b.m25875e(1.0f, f11);
            c13290b2.m25875e(1.0f, f11);
        }
        path.transform(this.f22431e);
    }

    /* renamed from: k */
    public final void m42076k(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float fM42807f;
        float fM44555a = pza.m44555a(f, 0.0f, 1.0f);
        float fM44555a2 = pza.m44555a(f2, 0.0f, 1.0f);
        float fM42807f2 = oza.m42807f(1.0f - this.f38155n, 1.0f, fM44555a);
        float fM42807f3 = oza.m42807f(1.0f - this.f38155n, 1.0f, fM44555a2);
        int iM44555a = (int) ((i2 * pza.m44555a(fM42807f2, 0.0f, 0.01f)) / 0.01f);
        int iM44555a2 = (int) ((i3 * (1.0f - pza.m44555a(fM42807f3, 0.99f, 1.0f))) / 0.01f);
        float f6 = this.f38147f;
        int i4 = (int) ((fM42807f2 * f6) + iM44555a);
        int i5 = (int) ((fM42807f3 * f6) - iM44555a2);
        float f7 = this.f38149h;
        float f8 = this.f38150i;
        if (f7 != f8) {
            float fMax = Math.max(f7, f8);
            float f9 = this.f38147f;
            float f10 = fMax / f9;
            float fM42807f4 = oza.m42807f(this.f38149h, this.f38150i, pza.m44555a(i4 / f9, 0.0f, f10) / f10);
            float f11 = this.f38149h;
            float f12 = this.f38150i;
            float f13 = this.f38147f;
            fM42807f = oza.m42807f(f11, f12, pza.m44555a((f13 - i5) / f13, 0.0f, f10) / f10);
            f5 = fM42807f4;
        } else {
            f5 = f7;
            fM42807f = f5;
        }
        float f14 = (-this.f38147f) / 2.0f;
        boolean z2 = ((LinearProgressIndicatorSpec) this.f22427a).m33608b(this.f38154m) && z && f3 > 0.0f;
        if (i4 <= i5) {
            float f15 = i4 + f5;
            float f16 = i5 - fM42807f;
            float f17 = f5 * 2.0f;
            float f18 = fM42807f * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f38148g);
            ((ez5.C13290b) this.f38156o.first).m25873c();
            ((ez5.C13290b) this.f38156o.second).m25873c();
            ((ez5.C13290b) this.f38156o.first).m25876f(f15 + f14, 0.0f);
            ((ez5.C13290b) this.f38156o.second).m25876f(f14 + f16, 0.0f);
            if (i4 == 0 && f16 + fM42807f < f15 + f5) {
                Pair pair = this.f38156o;
                ez5.C13290b c13290b = (ez5.C13290b) pair.first;
                float f19 = this.f38148g;
                m42078m(canvas, paint, c13290b, f17, f19, f5, (ez5.C13290b) pair.second, f18, f19, fM42807f, true);
                return;
            }
            if (f15 - f5 > f16 - fM42807f) {
                Pair pair2 = this.f38156o;
                ez5.C13290b c13290b2 = (ez5.C13290b) pair2.second;
                float f20 = this.f38148g;
                m42078m(canvas, paint, c13290b2, f18, f20, fM42807f, (ez5.C13290b) pair2.first, f17, f20, f5, false);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(((LinearProgressIndicatorSpec) this.f22427a).mo14911g() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                PathMeasure pathMeasure = this.f22430d;
                Path path = this.f22429c;
                Pair pair3 = this.f38156o;
                float f21 = this.f38147f;
                m42075j(pathMeasure, path, pair3, f15 / f21, f16 / f21, f3, f4);
                canvas.drawPath(this.f22429c, paint);
            } else {
                Pair pair4 = this.f38156o;
                Object obj = pair4.first;
                float f22 = ((ez5.C13290b) obj).f22440a[0];
                float f23 = ((ez5.C13290b) obj).f22440a[1];
                Object obj2 = pair4.second;
                canvas.drawLine(f22, f23, ((ez5.C13290b) obj2).f22440a[0], ((ez5.C13290b) obj2).f22440a[1], paint);
            }
            if (((LinearProgressIndicatorSpec) this.f22427a).mo14911g()) {
                return;
            }
            if (f15 > 0.0f && f5 > 0.0f) {
                m42077l(canvas, paint, (ez5.C13290b) this.f38156o.first, f17, this.f38148g, f5);
            }
            if (f16 >= this.f38147f || fM42807f <= 0.0f) {
                return;
            }
            m42077l(canvas, paint, (ez5.C13290b) this.f38156o.second, f18, this.f38148g, fM42807f);
        }
    }

    /* renamed from: l */
    public final void m42077l(Canvas canvas, Paint paint, ez5.C13290b c13290b, float f, float f2, float f3) {
        m42078m(canvas, paint, c13290b, f, f2, f3, null, 0.0f, 0.0f, 0.0f, false);
    }

    /* renamed from: m */
    public final void m42078m(Canvas canvas, Paint paint, ez5.C13290b c13290b, float f, float f2, float f3, ez5.C13290b c13290b2, float f4, float f5, float f6, boolean z) {
        float f7;
        float f8;
        float f9;
        float fMin = Math.min(f2, this.f38148g);
        float f10 = (-f) / 2.0f;
        float f11 = (-fMin) / 2.0f;
        float f12 = f / 2.0f;
        float f13 = fMin / 2.0f;
        RectF rectF = new RectF(f10, f11, f12, f13);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (c13290b2 != null) {
            float fMin2 = Math.min(f5, this.f38148g);
            float fMin3 = Math.min(f4 / 2.0f, (f6 * fMin2) / this.f38148g);
            RectF rectF2 = new RectF();
            if (z) {
                float f14 = (c13290b2.f22440a[0] - fMin3) - (c13290b.f22440a[0] - f3);
                if (f14 > 0.0f) {
                    c13290b2.m25876f((-f14) / 2.0f, 0.0f);
                    f9 = f4 + f14;
                } else {
                    f9 = f4;
                }
                rectF2.set(0.0f, f11, f12, f13);
                f7 = 2.0f;
            } else {
                float f15 = (c13290b2.f22440a[0] + fMin3) - (c13290b.f22440a[0] + f3);
                if (f15 < 0.0f) {
                    f7 = 2.0f;
                    c13290b2.m25876f((-f15) / 2.0f, 0.0f);
                    f8 = f4 - f15;
                } else {
                    f7 = 2.0f;
                    f8 = f4;
                }
                rectF2.set(f10, f11, 0.0f, f13);
                f9 = f8;
            }
            RectF rectF3 = new RectF((-f9) / f7, (-fMin2) / f7, f9 / f7, fMin2 / f7);
            float[] fArr = c13290b2.f22440a;
            canvas.translate(fArr[0], fArr[1]);
            canvas.rotate(m25870i(c13290b2.f22441b));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-m25870i(c13290b2.f22441b));
            float[] fArr2 = c13290b2.f22440a;
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = c13290b.f22440a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(m25870i(c13290b.f22441b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = c13290b.f22440a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(m25870i(c13290b.f22441b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }
}
