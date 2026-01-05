package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class ez5 {

    /* renamed from: a */
    public je1 f22427a;

    /* renamed from: b */
    public final Path f22428b;

    /* renamed from: c */
    public final Path f22429c;

    /* renamed from: d */
    public final PathMeasure f22430d;

    /* renamed from: e */
    public final Matrix f22431e;

    /* renamed from: o.ez5$a */
    public static class C13289a {

        /* renamed from: a */
        public float f22432a;

        /* renamed from: b */
        public float f22433b;

        /* renamed from: c */
        public int f22434c;

        /* renamed from: d */
        public int f22435d;

        /* renamed from: e */
        public float f22436e = 1.0f;

        /* renamed from: f */
        public float f22437f;

        /* renamed from: g */
        public float f22438g;

        /* renamed from: h */
        public boolean f22439h;
    }

    public ez5(je1 je1Var) {
        Path path = new Path();
        this.f22428b = path;
        this.f22429c = new Path();
        this.f22430d = new PathMeasure(path, false);
        this.f22427a = je1Var;
        this.f22431e = new Matrix();
    }

    /* renamed from: a */
    public abstract void mo25862a(Canvas canvas, Rect rect, float f, boolean z, boolean z2);

    /* renamed from: b */
    public abstract void mo25863b(Canvas canvas, Paint paint, int i, int i2);

    /* renamed from: c */
    public abstract void mo25864c(Canvas canvas, Paint paint, C13289a c13289a, int i);

    /* renamed from: d */
    public abstract void mo25865d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    /* renamed from: e */
    public abstract int mo25866e();

    /* renamed from: f */
    public abstract int mo25867f();

    /* renamed from: g */
    public abstract void mo25868g();

    /* renamed from: h */
    public void m25869h(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.f22427a.mo14912h();
        mo25862a(canvas, rect, f, z, z2);
    }

    /* renamed from: i */
    public float m25870i(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    /* renamed from: o.ez5$b */
    public class C13290b {

        /* renamed from: a */
        public float[] f22440a;

        /* renamed from: b */
        public float[] f22441b;

        /* renamed from: c */
        public final Matrix f22442c;

        public C13290b() {
            this.f22440a = new float[2];
            this.f22441b = new float[]{1.0f, 0.0f};
            this.f22442c = new Matrix();
        }

        /* renamed from: a */
        public void m25871a(float f) {
            float[] fArr = this.f22441b;
            float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            double d = f;
            double d2 = fAtan2;
            this.f22440a[0] = (float) (r2[0] + (Math.cos(d2) * d));
            this.f22440a[1] = (float) (r14[1] + (d * Math.sin(d2)));
        }

        /* renamed from: b */
        public void m25872b(float f) {
            float[] fArr = this.f22441b;
            float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
            double d = f;
            double d2 = fAtan2;
            this.f22440a[0] = (float) (r2[0] + (Math.cos(d2) * d));
            this.f22440a[1] = (float) (r14[1] + (d * Math.sin(d2)));
        }

        /* renamed from: c */
        public void m25873c() {
            Arrays.fill(this.f22440a, 0.0f);
            Arrays.fill(this.f22441b, 0.0f);
            this.f22441b[0] = 1.0f;
            this.f22442c.reset();
        }

        /* renamed from: d */
        public void m25874d(float f) {
            this.f22442c.reset();
            this.f22442c.setRotate(f);
            this.f22442c.mapPoints(this.f22440a);
            this.f22442c.mapPoints(this.f22441b);
        }

        /* renamed from: e */
        public void m25875e(float f, float f2) {
            float[] fArr = this.f22440a;
            fArr[0] = fArr[0] * f;
            fArr[1] = fArr[1] * f2;
            float[] fArr2 = this.f22441b;
            fArr2[0] = fArr2[0] * f;
            fArr2[1] = fArr2[1] * f2;
        }

        /* renamed from: f */
        public void m25876f(float f, float f2) {
            float[] fArr = this.f22440a;
            fArr[0] = fArr[0] + f;
            fArr[1] = fArr[1] + f2;
        }

        public C13290b(ez5 ez5Var, C13290b c13290b) {
            this(c13290b.f22440a, c13290b.f22441b);
        }

        public C13290b(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.f22440a = fArr3;
            this.f22441b = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.f22441b, 0, 2);
            this.f22442c = new Matrix();
        }
    }
}
