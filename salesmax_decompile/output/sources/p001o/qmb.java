package p001o;

import android.view.View;
import androidx.constraintlayout.widget.C2004a;
import androidx.constraintlayout.widget.C2005b;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public class qmb implements Comparable {
    public static String[] h0 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: H */
    public float f42154H;

    /* renamed from: L */
    public gmb f42155L;

    /* renamed from: M */
    public LinkedHashMap f42156M;

    /* renamed from: Q */
    public int f42157Q;

    /* renamed from: X */
    public int f42158X;

    /* renamed from: Y */
    public double[] f42159Y;

    /* renamed from: Z */
    public double[] f42160Z;

    /* renamed from: a */
    public q26 f42161a;

    /* renamed from: c */
    public float f42163c;

    /* renamed from: d */
    public float f42164d;

    /* renamed from: e */
    public float f42165e;

    /* renamed from: f */
    public float f42166f;

    /* renamed from: g */
    public float f42167g;

    /* renamed from: h */
    public float f42168h;

    /* renamed from: x */
    public int f42171x;

    /* renamed from: y */
    public int f42172y;

    /* renamed from: b */
    public int f42162b = 0;

    /* renamed from: q */
    public float f42169q = Float.NaN;

    /* renamed from: s */
    public float f42170s = Float.NaN;

    public qmb() {
        int i = hc9.f26654f;
        this.f42171x = i;
        this.f42172y = i;
        this.f42154H = Float.NaN;
        this.f42155L = null;
        this.f42156M = new LinkedHashMap();
        this.f42157Q = 0;
        this.f42159Y = new double[18];
        this.f42160Z = new double[18];
    }

    /* renamed from: A */
    public void m45656A(gmb gmbVar, qmb qmbVar) {
        double d = ((this.f42165e + (this.f42167g / 2.0f)) - qmbVar.f42165e) - (qmbVar.f42167g / 2.0f);
        double d2 = ((this.f42166f + (this.f42168h / 2.0f)) - qmbVar.f42166f) - (qmbVar.f42168h / 2.0f);
        this.f42155L = gmbVar;
        this.f42165e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f42154H)) {
            this.f42166f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f42166f = (float) Math.toRadians(this.f42154H);
        }
    }

    /* renamed from: a */
    public void m45657a(C2005b.a aVar) {
        this.f42161a = q26.m44740c(aVar.f6970d.f7043d);
        C2005b.c cVar = aVar.f6970d;
        this.f42171x = cVar.f7044e;
        this.f42172y = cVar.f7041b;
        this.f42169q = cVar.f7048i;
        this.f42162b = cVar.f7045f;
        this.f42158X = cVar.f7042c;
        this.f42170s = aVar.f6969c.f7058e;
        this.f42154H = aVar.f6971e.f6990D;
        for (String str : aVar.f6973g.keySet()) {
            C2004a c2004a = (C2004a) aVar.f6973g.get(str);
            if (c2004a != null && c2004a.m5644g()) {
                this.f42156M.put(str, c2004a);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(qmb qmbVar) {
        return Float.compare(this.f42164d, qmbVar.f42164d);
    }

    /* renamed from: d */
    public final boolean m45659d(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* renamed from: e */
    public void m45660e(qmb qmbVar, boolean[] zArr, String[] strArr, boolean z) {
        boolean zM45659d = m45659d(this.f42165e, qmbVar.f42165e);
        boolean zM45659d2 = m45659d(this.f42166f, qmbVar.f42166f);
        zArr[0] = zArr[0] | m45659d(this.f42164d, qmbVar.f42164d);
        boolean z2 = zM45659d | zM45659d2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | m45659d(this.f42167g, qmbVar.f42167g);
        zArr[4] = m45659d(this.f42168h, qmbVar.f42168h) | zArr[4];
    }

    /* renamed from: g */
    public void m45661g(double[] dArr, int[] iArr) {
        float[] fArr = {this.f42164d, this.f42165e, this.f42166f, this.f42167g, this.f42168h, this.f42169q};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[r4];
                i++;
            }
        }
    }

    /* renamed from: h */
    public void m45662h(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.f42165e;
        float fCos = this.f42166f;
        float f = this.f42167g;
        float f2 = this.f42168h;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fSin = f3;
            } else if (i3 == 2) {
                fCos = f3;
            } else if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        gmb gmbVar = this.f42155L;
        if (gmbVar != null) {
            float[] fArr2 = new float[2];
            gmbVar.m29072i(d, fArr2, new float[2]);
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            double d2 = f4;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) ((d2 + (Math.sin(d4) * d3)) - (f / 2.0f));
            fCos = (float) ((f5 - (d3 * Math.cos(d4))) - (f2 / 2.0f));
        }
        fArr[i] = fSin + (f / 2.0f) + 0.0f;
        fArr[i + 1] = fCos + (f2 / 2.0f) + 0.0f;
    }

    /* renamed from: j */
    public void m45663j(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float f2 = this.f42165e;
        float f3 = this.f42166f;
        float f4 = this.f42167g;
        float f5 = this.f42168h;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f10;
                f6 = f11;
            } else if (i2 == 2) {
                f3 = f10;
                f8 = f11;
            } else if (i2 == 3) {
                f4 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float fCos = (f9 / 2.0f) + f8;
        gmb gmbVar = this.f42155L;
        if (gmbVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gmbVar.m29072i(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f2;
            double d3 = f3;
            f = f4;
            float fSin = (float) ((f14 + (Math.sin(d3) * d2)) - (f4 / 2.0f));
            float fCos2 = (float) ((f15 - (d2 * Math.cos(d3))) - (f5 / 2.0f));
            double d4 = f6;
            double d5 = f8;
            float fSin2 = (float) (f16 + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            fCos = (float) ((f17 - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f13 = fSin2;
            f2 = fSin;
            f3 = fCos2;
            f12 = 2.0f;
        } else {
            f = f4;
        }
        fArr[0] = f2 + (f / f12) + 0.0f;
        fArr[1] = f3 + (f5 / f12) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = fCos;
    }

    /* renamed from: m */
    public int m45664m(String str, double[] dArr, int i) {
        C2004a c2004a = (C2004a) this.f42156M.get(str);
        int i2 = 0;
        if (c2004a == null) {
            return 0;
        }
        if (c2004a.m5645h() == 1) {
            dArr[i] = c2004a.m5642e();
            return 1;
        }
        int iM5645h = c2004a.m5645h();
        c2004a.m5643f(new float[iM5645h]);
        while (i2 < iM5645h) {
            dArr[i] = r2[i2];
            i2++;
            i++;
        }
        return iM5645h;
    }

    /* renamed from: n */
    public int m45665n(String str) {
        C2004a c2004a = (C2004a) this.f42156M.get(str);
        if (c2004a == null) {
            return 0;
        }
        return c2004a.m5645h();
    }

    /* renamed from: o */
    public void m45666o(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f42165e;
        float fCos = this.f42166f;
        float f2 = this.f42167g;
        float f3 = this.f42168h;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f4 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        gmb gmbVar = this.f42155L;
        if (gmbVar != null) {
            float fM29073j = gmbVar.m29073j();
            float fM29074k = this.f42155L.m29074k();
            double d = f;
            double d2 = fCos;
            float fSin = (float) ((fM29073j + (Math.sin(d2) * d)) - (f2 / 2.0f));
            fCos = (float) ((fM29074k - (d * Math.cos(d2))) - (f3 / 2.0f));
            f = fSin;
        }
        float f5 = f2 + f;
        float f6 = f3 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = fCos + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f5 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = fCos + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f5 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f6 + 0.0f;
        fArr[i9] = f + 0.0f;
        fArr[i9 + 1] = f6 + 0.0f;
    }

    /* renamed from: r */
    public boolean m45667r(String str) {
        return this.f42156M.containsKey(str);
    }

    /* renamed from: s */
    public void m45668s(ed9 ed9Var, qmb qmbVar, qmb qmbVar2) {
        float f = ed9Var.f26655a / 100.0f;
        this.f42163c = f;
        this.f42162b = ed9Var.f21422j;
        float f2 = Float.isNaN(ed9Var.f21423k) ? f : ed9Var.f21423k;
        float f3 = Float.isNaN(ed9Var.f21424l) ? f : ed9Var.f21424l;
        float f4 = qmbVar2.f42167g;
        float f5 = qmbVar.f42167g;
        float f6 = f4 - f5;
        float f7 = qmbVar2.f42168h;
        float f8 = qmbVar.f42168h;
        float f9 = f7 - f8;
        this.f42164d = this.f42163c;
        float f10 = (f5 / 2.0f) + qmbVar.f42165e;
        float f11 = qmbVar.f42166f + (f8 / 2.0f);
        float f12 = qmbVar2.f42165e + (f4 / 2.0f);
        float f13 = qmbVar2.f42166f + (f7 / 2.0f);
        if (f10 > f12) {
            f10 = f12;
            f12 = f10;
        }
        if (f11 <= f13) {
            f11 = f13;
            f13 = f11;
        }
        float f14 = f12 - f10;
        float f15 = f11 - f13;
        float f16 = (f6 * f2) / 2.0f;
        this.f42165e = (int) ((r13 + (f14 * f)) - f16);
        float f17 = (f9 * f3) / 2.0f;
        this.f42166f = (int) ((r1 + (f15 * f)) - f17);
        this.f42167g = (int) (f5 + r9);
        this.f42168h = (int) (f8 + r12);
        float f18 = Float.isNaN(ed9Var.f21425m) ? f : ed9Var.f21425m;
        float f19 = Float.isNaN(ed9Var.f21428p) ? 0.0f : ed9Var.f21428p;
        if (!Float.isNaN(ed9Var.f21426n)) {
            f = ed9Var.f21426n;
        }
        float f20 = Float.isNaN(ed9Var.f21427o) ? 0.0f : ed9Var.f21427o;
        this.f42157Q = 0;
        this.f42165e = (int) (((qmbVar.f42165e + (f18 * f14)) + (f20 * f15)) - f16);
        this.f42166f = (int) (((qmbVar.f42166f + (f14 * f19)) + (f15 * f)) - f17);
        this.f42161a = q26.m44740c(ed9Var.f21420h);
        this.f42171x = ed9Var.f21421i;
    }

    /* renamed from: t */
    public void m45669t(ed9 ed9Var, qmb qmbVar, qmb qmbVar2) {
        float f = ed9Var.f26655a / 100.0f;
        this.f42163c = f;
        this.f42162b = ed9Var.f21422j;
        float f2 = Float.isNaN(ed9Var.f21423k) ? f : ed9Var.f21423k;
        float f3 = Float.isNaN(ed9Var.f21424l) ? f : ed9Var.f21424l;
        float f4 = qmbVar2.f42167g;
        float f5 = qmbVar.f42167g;
        float f6 = qmbVar2.f42168h;
        float f7 = qmbVar.f42168h;
        this.f42164d = this.f42163c;
        float f8 = qmbVar.f42165e;
        float f9 = qmbVar.f42166f;
        float f10 = (qmbVar2.f42165e + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (qmbVar2.f42166f + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f12 = ((f4 - f5) * f2) / 2.0f;
        this.f42165e = (int) ((f8 + (f10 * f)) - f12);
        float f13 = ((f6 - f7) * f3) / 2.0f;
        this.f42166f = (int) ((f9 + (f11 * f)) - f13);
        this.f42167g = (int) (f5 + r9);
        this.f42168h = (int) (f7 + r12);
        float f14 = Float.isNaN(ed9Var.f21425m) ? f : ed9Var.f21425m;
        float f15 = Float.isNaN(ed9Var.f21428p) ? 0.0f : ed9Var.f21428p;
        if (!Float.isNaN(ed9Var.f21426n)) {
            f = ed9Var.f21426n;
        }
        float f16 = Float.isNaN(ed9Var.f21427o) ? 0.0f : ed9Var.f21427o;
        this.f42157Q = 0;
        this.f42165e = (int) (((qmbVar.f42165e + (f14 * f10)) + (f16 * f11)) - f12);
        this.f42166f = (int) (((qmbVar.f42166f + (f10 * f15)) + (f11 * f)) - f13);
        this.f42161a = q26.m44740c(ed9Var.f21420h);
        this.f42171x = ed9Var.f21421i;
    }

    /* renamed from: u */
    public void m45670u(ed9 ed9Var, qmb qmbVar, qmb qmbVar2) {
        float f = ed9Var.f26655a / 100.0f;
        this.f42163c = f;
        this.f42162b = ed9Var.f21422j;
        float f2 = Float.isNaN(ed9Var.f21423k) ? f : ed9Var.f21423k;
        float f3 = Float.isNaN(ed9Var.f21424l) ? f : ed9Var.f21424l;
        float f4 = qmbVar2.f42167g - qmbVar.f42167g;
        float f5 = qmbVar2.f42168h - qmbVar.f42168h;
        this.f42164d = this.f42163c;
        if (!Float.isNaN(ed9Var.f21425m)) {
            f = ed9Var.f21425m;
        }
        float f6 = qmbVar.f42165e;
        float f7 = qmbVar.f42167g;
        float f8 = qmbVar.f42166f;
        float f9 = qmbVar.f42168h;
        float f10 = (qmbVar2.f42165e + (qmbVar2.f42167g / 2.0f)) - ((f7 / 2.0f) + f6);
        float f11 = (qmbVar2.f42166f + (qmbVar2.f42168h / 2.0f)) - ((f9 / 2.0f) + f8);
        float f12 = f10 * f;
        float f13 = (f4 * f2) / 2.0f;
        this.f42165e = (int) ((f6 + f12) - f13);
        float f14 = f * f11;
        float f15 = (f5 * f3) / 2.0f;
        this.f42166f = (int) ((f8 + f14) - f15);
        this.f42167g = (int) (f7 + r7);
        this.f42168h = (int) (f9 + r8);
        float f16 = Float.isNaN(ed9Var.f21426n) ? 0.0f : ed9Var.f21426n;
        this.f42157Q = 1;
        float f17 = (int) ((qmbVar.f42165e + f12) - f13);
        float f18 = (int) ((qmbVar.f42166f + f14) - f15);
        this.f42165e = f17 + ((-f11) * f16);
        this.f42166f = f18 + (f10 * f16);
        this.f42172y = this.f42172y;
        this.f42161a = q26.m44740c(ed9Var.f21420h);
        this.f42171x = ed9Var.f21421i;
    }

    /* renamed from: v */
    public void m45671v(int i, int i2, ed9 ed9Var, qmb qmbVar, qmb qmbVar2) {
        float fMin;
        float f;
        float f2 = ed9Var.f26655a / 100.0f;
        this.f42163c = f2;
        this.f42162b = ed9Var.f21422j;
        this.f42157Q = ed9Var.f21429q;
        float f3 = Float.isNaN(ed9Var.f21423k) ? f2 : ed9Var.f21423k;
        float f4 = Float.isNaN(ed9Var.f21424l) ? f2 : ed9Var.f21424l;
        float f5 = qmbVar2.f42167g;
        float f6 = qmbVar.f42167g;
        float f7 = qmbVar2.f42168h;
        float f8 = qmbVar.f42168h;
        this.f42164d = this.f42163c;
        this.f42167g = (int) (f6 + ((f5 - f6) * f3));
        this.f42168h = (int) (f8 + ((f7 - f8) * f4));
        if (ed9Var.f21429q != 2) {
            float f9 = Float.isNaN(ed9Var.f21425m) ? f2 : ed9Var.f21425m;
            float f10 = qmbVar2.f42165e;
            float f11 = qmbVar.f42165e;
            this.f42165e = (f9 * (f10 - f11)) + f11;
            if (!Float.isNaN(ed9Var.f21426n)) {
                f2 = ed9Var.f21426n;
            }
            float f12 = qmbVar2.f42166f;
            float f13 = qmbVar.f42166f;
            this.f42166f = (f2 * (f12 - f13)) + f13;
        } else {
            if (Float.isNaN(ed9Var.f21425m)) {
                float f14 = qmbVar2.f42165e;
                float f15 = qmbVar.f42165e;
                fMin = ((f14 - f15) * f2) + f15;
            } else {
                fMin = Math.min(f4, f3) * ed9Var.f21425m;
            }
            this.f42165e = fMin;
            if (Float.isNaN(ed9Var.f21426n)) {
                float f16 = qmbVar2.f42166f;
                float f17 = qmbVar.f42166f;
                f = (f2 * (f16 - f17)) + f17;
            } else {
                f = ed9Var.f21426n;
            }
            this.f42166f = f;
        }
        this.f42172y = qmbVar.f42172y;
        this.f42161a = q26.m44740c(ed9Var.f21420h);
        this.f42171x = ed9Var.f21421i;
    }

    /* renamed from: w */
    public void m45672w(int i, int i2, ed9 ed9Var, qmb qmbVar, qmb qmbVar2) {
        float f = ed9Var.f26655a / 100.0f;
        this.f42163c = f;
        this.f42162b = ed9Var.f21422j;
        float f2 = Float.isNaN(ed9Var.f21423k) ? f : ed9Var.f21423k;
        float f3 = Float.isNaN(ed9Var.f21424l) ? f : ed9Var.f21424l;
        float f4 = qmbVar2.f42167g;
        float f5 = qmbVar.f42167g;
        float f6 = qmbVar2.f42168h;
        float f7 = qmbVar.f42168h;
        this.f42164d = this.f42163c;
        float f8 = qmbVar.f42165e;
        float f9 = qmbVar.f42166f;
        float f10 = qmbVar2.f42165e + (f4 / 2.0f);
        float f11 = qmbVar2.f42166f + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f42165e = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f3;
        this.f42166f = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f));
        this.f42167g = (int) (f5 + f12);
        this.f42168h = (int) (f7 + f13);
        this.f42157Q = 2;
        if (!Float.isNaN(ed9Var.f21425m)) {
            this.f42165e = (int) (ed9Var.f21425m * (i - ((int) this.f42167g)));
        }
        if (!Float.isNaN(ed9Var.f21426n)) {
            this.f42166f = (int) (ed9Var.f21426n * (i2 - ((int) this.f42168h)));
        }
        this.f42172y = this.f42172y;
        this.f42161a = q26.m44740c(ed9Var.f21420h);
        this.f42171x = ed9Var.f21421i;
    }

    /* renamed from: x */
    public void m45673x(float f, float f2, float f3, float f4) {
        this.f42165e = f;
        this.f42166f = f2;
        this.f42167g = f3;
        this.f42168h = f4;
    }

    /* renamed from: y */
    public void m45674y(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public void m45675z(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        boolean z2;
        boolean z3;
        float f3;
        float f4 = this.f42165e;
        float f5 = this.f42166f;
        float f6 = this.f42167g;
        float f7 = this.f42168h;
        if (iArr.length != 0 && this.f42159Y.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.f42159Y = new double[i];
            this.f42160Z = new double[i];
        }
        Arrays.fill(this.f42159Y, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.f42159Y;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.f42160Z[i3] = dArr2[i2];
        }
        float f8 = Float.NaN;
        int i4 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.f42159Y;
            if (i4 >= dArr5.length) {
                break;
            }
            boolean zIsNaN = Double.isNaN(dArr5[i4]);
            double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (zIsNaN && (dArr3 == null || dArr3[i4] == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
                f3 = f8;
            } else {
                if (dArr3 != null) {
                    d = dArr3[i4];
                }
                if (!Double.isNaN(this.f42159Y[i4])) {
                    d = this.f42159Y[i4] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f42160Z[i4];
                if (i4 == 1) {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                } else if (i4 == 2) {
                    f8 = f3;
                    f10 = f14;
                    f5 = f13;
                } else if (i4 == 3) {
                    f8 = f3;
                    f11 = f14;
                    f6 = f13;
                } else if (i4 == 4) {
                    f8 = f3;
                    f12 = f14;
                    f7 = f13;
                } else if (i4 == 5) {
                    f8 = f13;
                }
                i4++;
            }
            f8 = f3;
            i4++;
        }
        float f15 = f8;
        gmb gmbVar = this.f42155L;
        if (gmbVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gmbVar.m29072i(f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = f4;
            double d3 = f5;
            float fSin = (float) ((f16 + (Math.sin(d3) * d2)) - (f6 / 2.0f));
            f2 = f7;
            float fCos = (float) ((f17 - (Math.cos(d3) * d2)) - (f7 / 2.0f));
            double d4 = f9;
            double d5 = f10;
            float fSin2 = (float) (f18 + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float fCos2 = (float) ((f19 - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            if (dArr2.length >= 2) {
                z2 = false;
                dArr2[0] = fSin2;
                z3 = true;
                dArr2[1] = fCos2;
            } else {
                z2 = false;
                z3 = true;
            }
            if (!Float.isNaN(f15)) {
                view.setRotation((float) (f15 + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f4 = fSin;
            f5 = fCos;
        } else {
            f2 = f7;
            z2 = false;
            z3 = true;
            if (!Float.isNaN(f15)) {
                view.setRotation(((float) Math.toDegrees(Math.atan2(f10 + (f12 / 2.0f), f9 + (f11 / 2.0f)))) + f15 + 0.0f);
            }
        }
        if (view instanceof h37) {
            ((h37) view).mo5579a(f4, f5, f6 + f4, f5 + f2);
            return;
        }
        float f20 = f4 + 0.5f;
        int i5 = (int) f20;
        float f21 = f5 + 0.5f;
        int i6 = (int) f21;
        int i7 = (int) (f20 + f6);
        int i8 = (int) (f21 + f2);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight()) {
            z2 = z3;
        }
        if (z2 || z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }

    public qmb(int i, int i2, ed9 ed9Var, qmb qmbVar, qmb qmbVar2) {
        int i3 = hc9.f26654f;
        this.f42171x = i3;
        this.f42172y = i3;
        this.f42154H = Float.NaN;
        this.f42155L = null;
        this.f42156M = new LinkedHashMap();
        this.f42157Q = 0;
        this.f42159Y = new double[18];
        this.f42160Z = new double[18];
        if (qmbVar.f42172y != hc9.f26654f) {
            m45671v(i, i2, ed9Var, qmbVar, qmbVar2);
            return;
        }
        int i4 = ed9Var.f21429q;
        if (i4 == 1) {
            m45670u(ed9Var, qmbVar, qmbVar2);
            return;
        }
        if (i4 == 2) {
            m45672w(i, i2, ed9Var, qmbVar, qmbVar2);
        } else if (i4 != 3) {
            m45669t(ed9Var, qmbVar, qmbVar2);
        } else {
            m45668s(ed9Var, qmbVar, qmbVar2);
        }
    }
}
