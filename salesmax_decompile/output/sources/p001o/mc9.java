package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class mc9 {

    /* renamed from: a */
    public rd4 f35148a;

    /* renamed from: b */
    public C15280b f35149b;

    /* renamed from: c */
    public String f35150c;

    /* renamed from: d */
    public int f35151d = 0;

    /* renamed from: e */
    public String f35152e = null;

    /* renamed from: f */
    public int f35153f = 0;

    /* renamed from: g */
    public ArrayList f35154g = new ArrayList();

    /* renamed from: o.mc9$a */
    public class C15279a implements Comparator {
        public C15279a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C15281c c15281c, C15281c c15281c2) {
            return Integer.compare(c15281c.f35172a, c15281c2.f35172a);
        }
    }

    /* renamed from: o.mc9$b */
    public static class C15280b {

        /* renamed from: a */
        public final int f35156a;

        /* renamed from: b */
        public qfc f35157b;

        /* renamed from: c */
        public final int f35158c;

        /* renamed from: d */
        public final int f35159d;

        /* renamed from: e */
        public final int f35160e;

        /* renamed from: f */
        public float[] f35161f;

        /* renamed from: g */
        public double[] f35162g;

        /* renamed from: h */
        public float[] f35163h;

        /* renamed from: i */
        public float[] f35164i;

        /* renamed from: j */
        public float[] f35165j;

        /* renamed from: k */
        public float[] f35166k;

        /* renamed from: l */
        public int f35167l;

        /* renamed from: m */
        public rd4 f35168m;

        /* renamed from: n */
        public double[] f35169n;

        /* renamed from: o */
        public double[] f35170o;

        /* renamed from: p */
        public float f35171p;

        public C15280b(int i, String str, int i2, int i3) {
            qfc qfcVar = new qfc();
            this.f35157b = qfcVar;
            this.f35158c = 0;
            this.f35159d = 1;
            this.f35160e = 2;
            this.f35167l = i;
            this.f35156a = i2;
            qfcVar.m45364g(i, str);
            this.f35161f = new float[i3];
            this.f35162g = new double[i3];
            this.f35163h = new float[i3];
            this.f35164i = new float[i3];
            this.f35165j = new float[i3];
            this.f35166k = new float[i3];
        }

        /* renamed from: a */
        public double m38736a(float f) {
            rd4 rd4Var = this.f35168m;
            if (rd4Var != null) {
                double d = f;
                rd4Var.mo19477g(d, this.f35170o);
                this.f35168m.mo19474d(d, this.f35169n);
            } else {
                double[] dArr = this.f35170o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = f;
            double dM45362e = this.f35157b.m45362e(d2, this.f35169n[1]);
            double dM45361d = this.f35157b.m45361d(d2, this.f35169n[1], this.f35170o[1]);
            double[] dArr2 = this.f35170o;
            return dArr2[0] + (dM45362e * dArr2[2]) + (dM45361d * this.f35169n[2]);
        }

        /* renamed from: b */
        public double m38737b(float f) {
            rd4 rd4Var = this.f35168m;
            if (rd4Var != null) {
                rd4Var.mo19474d(f, this.f35169n);
            } else {
                double[] dArr = this.f35169n;
                dArr[0] = this.f35164i[0];
                dArr[1] = this.f35165j[0];
                dArr[2] = this.f35161f[0];
            }
            double[] dArr2 = this.f35169n;
            return dArr2[0] + (this.f35157b.m45362e(f, dArr2[1]) * this.f35169n[2]);
        }

        /* renamed from: c */
        public void m38738c(int i, int i2, float f, float f2, float f3, float f4) {
            this.f35162g[i] = i2 / 100.0d;
            this.f35163h[i] = f;
            this.f35164i[i] = f2;
            this.f35165j[i] = f3;
            this.f35161f[i] = f4;
        }

        /* renamed from: d */
        public void m38739d(float f) {
            this.f35171p = f;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f35162g.length, 3);
            float[] fArr = this.f35161f;
            this.f35169n = new double[fArr.length + 2];
            this.f35170o = new double[fArr.length + 2];
            if (this.f35162g[0] > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f35157b.m45358a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, this.f35163h[0]);
            }
            double[] dArr2 = this.f35162g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f35157b.m45358a(1.0d, this.f35163h[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.f35164i[i];
                dArr3[1] = this.f35165j[i];
                dArr3[2] = this.f35161f[i];
                this.f35157b.m45358a(this.f35162g[i], this.f35163h[i]);
            }
            this.f35157b.m45363f();
            double[] dArr4 = this.f35162g;
            if (dArr4.length > 1) {
                this.f35168m = rd4.m46542a(0, dArr4, dArr);
            } else {
                this.f35168m = null;
            }
        }
    }

    /* renamed from: o.mc9$c */
    public static class C15281c {

        /* renamed from: a */
        public int f35172a;

        /* renamed from: b */
        public float f35173b;

        /* renamed from: c */
        public float f35174c;

        /* renamed from: d */
        public float f35175d;

        /* renamed from: e */
        public float f35176e;

        public C15281c(int i, float f, float f2, float f3, float f4) {
            this.f35172a = i;
            this.f35173b = f4;
            this.f35174c = f2;
            this.f35175d = f;
            this.f35176e = f3;
        }
    }

    /* renamed from: a */
    public float m38727a(float f) {
        return (float) this.f35149b.m38737b(f);
    }

    /* renamed from: b */
    public float m38728b(float f) {
        return (float) this.f35149b.m38736a(f);
    }

    /* renamed from: c */
    public void mo38729c(Object obj) {
    }

    /* renamed from: d */
    public void m38730d(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        this.f35154g.add(new C15281c(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f35153f = i3;
        }
        this.f35151d = i2;
        this.f35152e = str;
    }

    /* renamed from: e */
    public void m38731e(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.f35154g.add(new C15281c(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f35153f = i3;
        }
        this.f35151d = i2;
        mo38729c(obj);
        this.f35152e = str;
    }

    /* renamed from: f */
    public void m38732f(String str) {
        this.f35150c = str;
    }

    /* renamed from: g */
    public void m38733g(float f) {
        int size = this.f35154g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f35154g, new C15279a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f35149b = new C15280b(this.f35151d, this.f35152e, this.f35153f, size);
        Iterator it = this.f35154g.iterator();
        int i = 0;
        while (it.hasNext()) {
            C15281c c15281c = (C15281c) it.next();
            float f2 = c15281c.f35175d;
            dArr[i] = f2 * 0.01d;
            double[] dArr3 = dArr2[i];
            float f3 = c15281c.f35173b;
            dArr3[0] = f3;
            float f4 = c15281c.f35174c;
            dArr3[1] = f4;
            float f5 = c15281c.f35176e;
            dArr3[2] = f5;
            this.f35149b.m38738c(i, c15281c.f35172a, f2, f4, f5, f3);
            i++;
        }
        this.f35149b.m38739d(f);
        this.f35148a = rd4.m46542a(0, dArr, dArr2);
    }

    /* renamed from: h */
    public boolean m38734h() {
        return this.f35153f == 1;
    }

    public String toString() {
        String str = this.f35150c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator it = this.f35154g.iterator();
        while (it.hasNext()) {
            str = str + "[" + ((C15281c) it.next()).f35172a + " , " + decimalFormat.format(r3.f35173b) + "] ";
        }
        return str;
    }
}
