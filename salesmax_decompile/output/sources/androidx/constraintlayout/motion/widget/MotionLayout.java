package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.C1988a;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C2005b;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.objectweb.asm.Opcodes;
import p001o.au3;
import p001o.by7;
import p001o.dy7;
import p001o.e6g;
import p001o.en5;
import p001o.g5g;
import p001o.gmb;
import p001o.gtb;
import p001o.k75;
import p001o.kc9;
import p001o.mbe;
import p001o.pmb;
import p001o.rv7;
import p001o.s8d;
import p001o.tq;
import p001o.u37;
import p001o.vt3;
import p001o.x0j;
import p001o.ya1;
import p001o.zt3;

/* loaded from: classes2.dex */
public class MotionLayout extends ConstraintLayout implements gtb {
    public static boolean R1;
    public HashMap A0;
    public int[] A1;
    public long B0;
    public int B1;
    public float C0;
    public boolean C1;
    public float D0;
    public int D1;
    public float E0;
    public HashMap E1;
    public long F0;
    public int F1;
    public float G0;
    public int G1;
    public boolean H0;
    public int H1;
    public boolean I0;
    public Rect I1;
    public boolean J0;
    public boolean J1;
    public InterfaceC1986i K0;
    public EnumC1987j K1;
    public float L0;
    public C1982e L1;
    public float M0;
    public boolean M1;
    public int N0;
    public RectF N1;
    public C1981d O0;
    public View O1;
    public boolean P0;
    public Matrix P1;
    public e6g Q0;
    public ArrayList Q1;
    public C1980c R0;
    public en5 S0;
    public boolean T0;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public boolean Y0;
    public float Z0;
    public float a1;
    public long b1;
    public float c1;
    public boolean d1;
    public ArrayList e1;
    public ArrayList f1;
    public ArrayList g1;
    public CopyOnWriteArrayList h1;
    public int i1;
    public long j1;
    public float k1;
    public int l1;
    public float m1;
    public boolean n1;
    public boolean o1;
    public int p1;
    public C1988a q0;
    public int q1;
    public Interpolator r0;
    public int r1;
    public Interpolator s0;
    public int s1;
    public float t0;
    public int t1;
    public int u0;
    public int u1;
    public int v0;
    public float v1;
    public int w0;
    public kc9 w1;
    public int x0;
    public boolean x1;
    public int y0;
    public C1985h y1;
    public boolean z0;
    public Runnable z1;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    public class RunnableC1978a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f6594a;

        public RunnableC1978a(View view) {
            this.f6594a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6594a.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    public class RunnableC1979b implements Runnable {
        public RunnableC1979b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.y1.m5405a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    public class C1980c extends pmb {

        /* renamed from: a */
        public float f6597a = 0.0f;

        /* renamed from: b */
        public float f6598b = 0.0f;

        /* renamed from: c */
        public float f6599c;

        public C1980c() {
        }

        @Override // p001o.pmb
        /* renamed from: a */
        public float mo5375a() {
            return MotionLayout.this.t0;
        }

        /* renamed from: b */
        public void m5376b(float f, float f2, float f3) {
            this.f6597a = f;
            this.f6598b = f2;
            this.f6599c = f3;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.f6597a;
            if (f4 > 0.0f) {
                float f5 = this.f6599c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.t0 = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.f6598b;
            } else {
                float f6 = this.f6599c;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.t0 = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.f6598b;
            }
            return f2 + f3;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    public class C1981d {

        /* renamed from: a */
        public float[] f6601a;

        /* renamed from: b */
        public int[] f6602b;

        /* renamed from: c */
        public float[] f6603c;

        /* renamed from: d */
        public Path f6604d;

        /* renamed from: e */
        public Paint f6605e;

        /* renamed from: f */
        public Paint f6606f;

        /* renamed from: g */
        public Paint f6607g;

        /* renamed from: h */
        public Paint f6608h;

        /* renamed from: i */
        public Paint f6609i;

        /* renamed from: j */
        public float[] f6610j;

        /* renamed from: p */
        public DashPathEffect f6616p;

        /* renamed from: q */
        public int f6617q;

        /* renamed from: t */
        public int f6620t;

        /* renamed from: k */
        public final int f6611k = -21965;

        /* renamed from: l */
        public final int f6612l = -2067046;

        /* renamed from: m */
        public final int f6613m = -13391360;

        /* renamed from: n */
        public final int f6614n = 1996488704;

        /* renamed from: o */
        public final int f6615o = 10;

        /* renamed from: r */
        public Rect f6618r = new Rect();

        /* renamed from: s */
        public boolean f6619s = false;

        public C1981d() {
            this.f6620t = 1;
            Paint paint = new Paint();
            this.f6605e = paint;
            paint.setAntiAlias(true);
            this.f6605e.setColor(-21965);
            this.f6605e.setStrokeWidth(2.0f);
            this.f6605e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f6606f = paint2;
            paint2.setAntiAlias(true);
            this.f6606f.setColor(-2067046);
            this.f6606f.setStrokeWidth(2.0f);
            this.f6606f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f6607g = paint3;
            paint3.setAntiAlias(true);
            this.f6607g.setColor(-13391360);
            this.f6607g.setStrokeWidth(2.0f);
            this.f6607g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f6608h = paint4;
            paint4.setAntiAlias(true);
            this.f6608h.setColor(-13391360);
            this.f6608h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f6610j = new float[8];
            Paint paint5 = new Paint();
            this.f6609i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f6616p = dashPathEffect;
            this.f6607g.setPathEffect(dashPathEffect);
            this.f6603c = new float[100];
            this.f6602b = new int[50];
            if (this.f6619s) {
                this.f6605e.setStrokeWidth(8.0f);
                this.f6609i.setStrokeWidth(8.0f);
                this.f6606f.setStrokeWidth(8.0f);
                this.f6620t = 4;
            }
        }

        /* renamed from: a */
        public void m5377a(Canvas canvas, HashMap map, int i, int i2) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.w0) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f6608h);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f6605e);
            }
            for (gmb gmbVar : map.values()) {
                int iM29076m = gmbVar.m29076m();
                if (i2 > 0 && iM29076m == 0) {
                    iM29076m = 1;
                }
                if (iM29076m != 0) {
                    this.f6617q = gmbVar.m29066c(this.f6603c, this.f6602b);
                    if (iM29076m >= 1) {
                        int i3 = i / 16;
                        float[] fArr = this.f6601a;
                        if (fArr == null || fArr.length != i3 * 2) {
                            this.f6601a = new float[i3 * 2];
                            this.f6604d = new Path();
                        }
                        int i4 = this.f6620t;
                        canvas.translate(i4, i4);
                        this.f6605e.setColor(1996488704);
                        this.f6609i.setColor(1996488704);
                        this.f6606f.setColor(1996488704);
                        this.f6607g.setColor(1996488704);
                        gmbVar.m29067d(this.f6601a, i3);
                        m5378b(canvas, iM29076m, this.f6617q, gmbVar);
                        this.f6605e.setColor(-21965);
                        this.f6606f.setColor(-2067046);
                        this.f6609i.setColor(-2067046);
                        this.f6607g.setColor(-13391360);
                        int i5 = this.f6620t;
                        canvas.translate(-i5, -i5);
                        m5378b(canvas, iM29076m, this.f6617q, gmbVar);
                        if (iM29076m == 5) {
                            m5386j(canvas, gmbVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        /* renamed from: b */
        public void m5378b(Canvas canvas, int i, int i2, gmb gmbVar) {
            if (i == 4) {
                m5380d(canvas);
            }
            if (i == 2) {
                m5383g(canvas);
            }
            if (i == 3) {
                m5381e(canvas);
            }
            m5379c(canvas);
            m5387k(canvas, i, i2, gmbVar);
        }

        /* renamed from: c */
        public final void m5379c(Canvas canvas) {
            canvas.drawLines(this.f6601a, this.f6605e);
        }

        /* renamed from: d */
        public final void m5380d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f6617q; i++) {
                int i2 = this.f6602b[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                m5383g(canvas);
            }
            if (z2) {
                m5381e(canvas);
            }
        }

        /* renamed from: e */
        public final void m5381e(Canvas canvas) {
            float[] fArr = this.f6601a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f6607g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f6607g);
        }

        /* renamed from: f */
        public final void m5382f(Canvas canvas, float f, float f2) {
            float[] fArr = this.f6601a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fMin = Math.min(f3, f5);
            float fMax = Math.max(f4, f6);
            float fMin2 = f - Math.min(f3, f5);
            float fMax2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((fMin2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            m5388l(str, this.f6608h);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f6618r.width() / 2)) + fMin, f2 - 20.0f, this.f6608h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f6607g);
            String str2 = "" + (((int) (((fMax2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            m5388l(str2, this.f6608h);
            canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f6618r.height() / 2)), this.f6608h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f6607g);
        }

        /* renamed from: g */
        public final void m5383g(Canvas canvas) {
            float[] fArr = this.f6601a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f6607g);
        }

        /* renamed from: h */
        public final void m5384h(Canvas canvas, float f, float f2) {
            float[] fArr = this.f6601a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (fHypot * fHypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            m5388l(str, this.f6608h);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f6618r.width() / 2), -20.0f, this.f6608h);
            canvas.drawLine(f, f2, f10, f11, this.f6607g);
        }

        /* renamed from: i */
        public final void m5385i(Canvas canvas, float f, float f2, int i, int i2) {
            String str = "" + (((int) ((((f - (i / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i)) + 0.5d)) / 100.0f);
            m5388l(str, this.f6608h);
            canvas.drawText(str, ((f / 2.0f) - (this.f6618r.width() / 2)) + 0.0f, f2 - 20.0f, this.f6608h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f6607g);
            String str2 = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i2)) + 0.5d)) / 100.0f);
            m5388l(str2, this.f6608h);
            canvas.drawText(str2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.f6618r.height() / 2)), this.f6608h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f6607g);
        }

        /* renamed from: j */
        public final void m5386j(Canvas canvas, gmb gmbVar) {
            this.f6604d.reset();
            for (int i = 0; i <= 50; i++) {
                gmbVar.m29068e(i / 50, this.f6610j, 0);
                Path path = this.f6604d;
                float[] fArr = this.f6610j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f6604d;
                float[] fArr2 = this.f6610j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f6604d;
                float[] fArr3 = this.f6610j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f6604d;
                float[] fArr4 = this.f6610j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f6604d.close();
            }
            this.f6605e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f6604d, this.f6605e);
            canvas.translate(-2.0f, -2.0f);
            this.f6605e.setColor(Opcodes.V_PREVIEW);
            canvas.drawPath(this.f6604d, this.f6605e);
        }

        /* renamed from: k */
        public final void m5387k(Canvas canvas, int i, int i2, gmb gmbVar) {
            int width;
            int height;
            float f;
            float f2;
            View view = gmbVar.f25477b;
            if (view != null) {
                width = view.getWidth();
                height = gmbVar.f25477b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i3 = 1; i3 < i2 - 1; i3++) {
                if (i != 4 || this.f6602b[i3 - 1] != 0) {
                    float[] fArr = this.f6603c;
                    int i4 = i3 * 2;
                    float f3 = fArr[i4];
                    float f4 = fArr[i4 + 1];
                    this.f6604d.reset();
                    this.f6604d.moveTo(f3, f4 + 10.0f);
                    this.f6604d.lineTo(f3 + 10.0f, f4);
                    this.f6604d.lineTo(f3, f4 - 10.0f);
                    this.f6604d.lineTo(f3 - 10.0f, f4);
                    this.f6604d.close();
                    int i5 = i3 - 1;
                    gmbVar.m29079q(i5);
                    if (i == 4) {
                        int i6 = this.f6602b[i5];
                        if (i6 == 1) {
                            m5384h(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i6 == 0) {
                            m5382f(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else {
                            if (i6 == 2) {
                                f = f4;
                                f2 = f3;
                                m5385i(canvas, f3 - 0.0f, f4 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.f6604d, this.f6609i);
                        }
                        f = f4;
                        f2 = f3;
                        canvas.drawPath(this.f6604d, this.f6609i);
                    } else {
                        f = f4;
                        f2 = f3;
                    }
                    if (i == 2) {
                        m5384h(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 3) {
                        m5382f(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 6) {
                        m5385i(canvas, f2 - 0.0f, f - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f6604d, this.f6609i);
                }
            }
            float[] fArr2 = this.f6601a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f6606f);
                float[] fArr3 = this.f6601a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f6606f);
            }
        }

        /* renamed from: l */
        public void m5388l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f6618r);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    public class C1982e {

        /* renamed from: a */
        public au3 f6622a = new au3();

        /* renamed from: b */
        public au3 f6623b = new au3();

        /* renamed from: c */
        public C2005b f6624c = null;

        /* renamed from: d */
        public C2005b f6625d = null;

        /* renamed from: e */
        public int f6626e;

        /* renamed from: f */
        public int f6627f;

        public C1982e() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0124 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m5389a() {
            String str;
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.A0.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                gmb gmbVar = new gmb(childAt);
                int id = childAt.getId();
                iArr[i] = id;
                sparseArray.put(id, gmbVar);
                MotionLayout.this.A0.put(childAt, gmbVar);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                gmb gmbVar2 = (gmb) MotionLayout.this.A0.get(childAt2);
                if (gmbVar2 != null) {
                    if (this.f6624c != null) {
                        zt3 zt3VarM5392d = m5392d(this.f6622a, childAt2);
                        if (zt3VarM5392d != null) {
                            gmbVar2.m29059F(MotionLayout.this.A0(zt3VarM5392d), this.f6624c, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.N0 != 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(k75.m35103b());
                            sb.append("no widget for  ");
                            sb.append(k75.m35105d(childAt2));
                            sb.append(" (");
                            sb.append(childAt2.getClass().getName());
                            sb.append(")");
                        }
                    } else {
                        if (MotionLayout.this.C1) {
                            tq.m50332a(MotionLayout.this.E1.get(childAt2));
                            MotionLayout motionLayout = MotionLayout.this;
                            str = "no widget for  ";
                            gmbVar2.m29060G(null, childAt2, motionLayout.D1, motionLayout.F1, MotionLayout.this.G1);
                        }
                        if (this.f6625d != null) {
                            zt3 zt3VarM5392d2 = m5392d(this.f6623b, childAt2);
                            if (zt3VarM5392d2 != null) {
                                gmbVar2.m29056C(MotionLayout.this.A0(zt3VarM5392d2), this.f6625d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                            } else if (MotionLayout.this.N0 != 0) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(k75.m35103b());
                                sb2.append(str);
                                sb2.append(k75.m35105d(childAt2));
                                sb2.append(" (");
                                sb2.append(childAt2.getClass().getName());
                                sb2.append(")");
                            }
                        }
                    }
                    str = "no widget for  ";
                    if (this.f6625d != null) {
                    }
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                gmb gmbVar3 = (gmb) sparseArray.get(iArr[i3]);
                int iM29071h = gmbVar3.m29071h();
                if (iM29071h != -1) {
                    gmbVar3.m29063J((gmb) sparseArray.get(iM29071h));
                }
            }
        }

        /* renamed from: b */
        public final void m5390b(int i, int i2) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.v0 == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                au3 au3Var = this.f6623b;
                C2005b c2005b = this.f6625d;
                motionLayout2.m5619x(au3Var, optimizationLevel, (c2005b == null || c2005b.f6963e == 0) ? i : i2, (c2005b == null || c2005b.f6963e == 0) ? i2 : i);
                C2005b c2005b2 = this.f6624c;
                if (c2005b2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    au3 au3Var2 = this.f6622a;
                    int i3 = c2005b2.f6963e;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout3.m5619x(au3Var2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            C2005b c2005b3 = this.f6624c;
            if (c2005b3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                au3 au3Var3 = this.f6622a;
                int i5 = c2005b3.f6963e;
                motionLayout4.m5619x(au3Var3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            au3 au3Var4 = this.f6623b;
            C2005b c2005b4 = this.f6625d;
            int i6 = (c2005b4 == null || c2005b4.f6963e == 0) ? i : i2;
            if (c2005b4 == null || c2005b4.f6963e == 0) {
                i = i2;
            }
            motionLayout5.m5619x(au3Var4, optimizationLevel, i6, i);
        }

        /* renamed from: c */
        public void m5391c(au3 au3Var, au3 au3Var2) {
            ArrayList arrayListW1 = au3Var.w1();
            HashMap map = new HashMap();
            map.put(au3Var, au3Var2);
            au3Var2.w1().clear();
            au3Var2.mo23956n(au3Var, map);
            Iterator it = arrayListW1.iterator();
            while (it.hasNext()) {
                zt3 zt3Var = (zt3) it.next();
                zt3 ya1Var = zt3Var instanceof ya1 ? new ya1() : zt3Var instanceof rv7 ? new rv7() : zt3Var instanceof u37 ? new u37() : zt3Var instanceof s8d ? new s8d() : zt3Var instanceof by7 ? new dy7() : new zt3();
                au3Var2.m41784a(ya1Var);
                map.put(zt3Var, ya1Var);
            }
            Iterator it2 = arrayListW1.iterator();
            while (it2.hasNext()) {
                zt3 zt3Var2 = (zt3) it2.next();
                ((zt3) map.get(zt3Var2)).mo23956n(zt3Var2, map);
            }
        }

        /* renamed from: d */
        public zt3 m5392d(au3 au3Var, View view) {
            if (au3Var.m59861u() == view) {
                return au3Var;
            }
            ArrayList arrayListW1 = au3Var.w1();
            int size = arrayListW1.size();
            for (int i = 0; i < size; i++) {
                zt3 zt3Var = (zt3) arrayListW1.get(i);
                if (zt3Var.m59861u() == view) {
                    return zt3Var;
                }
            }
            return null;
        }

        /* renamed from: e */
        public void m5393e(au3 au3Var, C2005b c2005b, C2005b c2005b2) {
            this.f6624c = c2005b;
            this.f6625d = c2005b2;
            this.f6622a = new au3();
            this.f6623b = new au3();
            this.f6622a.b2(MotionLayout.this.f6865c.O1());
            this.f6623b.b2(MotionLayout.this.f6865c.O1());
            this.f6622a.z1();
            this.f6623b.z1();
            m5391c(MotionLayout.this.f6865c, this.f6622a);
            m5391c(MotionLayout.this.f6865c, this.f6623b);
            if (MotionLayout.this.E0 > 0.5d) {
                if (c2005b != null) {
                    m5398j(this.f6622a, c2005b);
                }
                m5398j(this.f6623b, c2005b2);
            } else {
                m5398j(this.f6623b, c2005b2);
                if (c2005b != null) {
                    m5398j(this.f6622a, c2005b);
                }
            }
            this.f6622a.e2(MotionLayout.this.m5616t());
            this.f6622a.g2();
            this.f6623b.e2(MotionLayout.this.m5616t());
            this.f6623b.g2();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    au3 au3Var2 = this.f6622a;
                    zt3.EnumC18702b enumC18702b = zt3.EnumC18702b.WRAP_CONTENT;
                    au3Var2.U0(enumC18702b);
                    this.f6623b.U0(enumC18702b);
                }
                if (layoutParams.height == -2) {
                    au3 au3Var3 = this.f6622a;
                    zt3.EnumC18702b enumC18702b2 = zt3.EnumC18702b.WRAP_CONTENT;
                    au3Var3.l1(enumC18702b2);
                    this.f6623b.l1(enumC18702b2);
                }
            }
        }

        /* renamed from: f */
        public boolean m5394f(int i, int i2) {
            return (i == this.f6626e && i2 == this.f6627f) ? false : true;
        }

        /* renamed from: g */
        public void m5395g(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.t1 = mode;
            motionLayout.u1 = mode2;
            m5390b(i, i2);
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                m5390b(i, i2);
                MotionLayout.this.p1 = this.f6622a.m59846Y();
                MotionLayout.this.q1 = this.f6622a.m59866z();
                MotionLayout.this.r1 = this.f6623b.m59846Y();
                MotionLayout.this.s1 = this.f6623b.m59866z();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.o1 = (motionLayout2.p1 == motionLayout2.r1 && motionLayout2.q1 == motionLayout2.s1) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i3 = motionLayout3.p1;
            int i4 = motionLayout3.q1;
            int i5 = motionLayout3.t1;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (i3 + (motionLayout3.v1 * (motionLayout3.r1 - i3)));
            }
            int i6 = i3;
            int i7 = motionLayout3.u1;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i4 = (int) (i4 + (motionLayout3.v1 * (motionLayout3.s1 - i4)));
            }
            MotionLayout.this.m5618w(i, i2, i6, i4, this.f6622a.W1() || this.f6623b.W1(), this.f6622a.U1() || this.f6623b.U1());
        }

        /* renamed from: h */
        public void m5396h() {
            m5395g(MotionLayout.this.x0, MotionLayout.this.y0);
            MotionLayout.this.z0();
        }

        /* renamed from: i */
        public void m5397i(int i, int i2) {
            this.f6626e = i;
            this.f6627f = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: j */
        public final void m5398j(au3 au3Var, C2005b c2005b) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, au3Var);
            sparseArray.put(MotionLayout.this.getId(), au3Var);
            if (c2005b != null && c2005b.f6963e != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.m5619x(this.f6623b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator it = au3Var.w1().iterator();
            while (it.hasNext()) {
                zt3 zt3Var = (zt3) it.next();
                zt3Var.E0(true);
                sparseArray.put(((View) zt3Var.m59861u()).getId(), zt3Var);
            }
            Iterator it2 = au3Var.w1().iterator();
            while (it2.hasNext()) {
                zt3 zt3Var2 = (zt3) it2.next();
                View view = (View) zt3Var2.m59861u();
                c2005b.m5680l(view.getId(), layoutParams);
                zt3Var2.p1(c2005b.m5665C(view.getId()));
                zt3Var2.Q0(c2005b.m5691x(view.getId()));
                if (view instanceof ConstraintHelper) {
                    c2005b.m5678j((ConstraintHelper) view, zt3Var2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).m5601w();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.m5607e(false, view, zt3Var2, layoutParams, sparseArray);
                if (c2005b.m5664B(view.getId()) == 1) {
                    zt3Var2.o1(view.getVisibility());
                } else {
                    zt3Var2.o1(c2005b.m5663A(view.getId()));
                }
            }
            Iterator it3 = au3Var.w1().iterator();
            while (it3.hasNext()) {
                zt3 zt3Var3 = (zt3) it3.next();
                if (zt3Var3 instanceof x0j) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) zt3Var3.m59861u();
                    by7 by7Var = (by7) zt3Var3;
                    constraintHelper.mo5342v(au3Var, by7Var, sparseArray);
                    ((x0j) by7Var).z1();
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    public interface InterfaceC1983f {
        /* renamed from: b */
        void mo5399b();

        /* renamed from: c */
        void mo5400c(MotionEvent motionEvent);

        /* renamed from: d */
        float mo5401d();

        /* renamed from: e */
        float mo5402e();

        /* renamed from: f */
        void mo5403f(int i);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    public static class C1984g implements InterfaceC1983f {

        /* renamed from: b */
        public static C1984g f6629b = new C1984g();

        /* renamed from: a */
        public VelocityTracker f6630a;

        /* renamed from: a */
        public static C1984g m5404a() {
            f6629b.f6630a = VelocityTracker.obtain();
            return f6629b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1983f
        /* renamed from: b */
        public void mo5399b() {
            VelocityTracker velocityTracker = this.f6630a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f6630a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1983f
        /* renamed from: c */
        public void mo5400c(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f6630a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1983f
        /* renamed from: d */
        public float mo5401d() {
            VelocityTracker velocityTracker = this.f6630a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1983f
        /* renamed from: e */
        public float mo5402e() {
            VelocityTracker velocityTracker = this.f6630a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1983f
        /* renamed from: f */
        public void mo5403f(int i) {
            VelocityTracker velocityTracker = this.f6630a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    public class C1985h {

        /* renamed from: a */
        public float f6631a = Float.NaN;

        /* renamed from: b */
        public float f6632b = Float.NaN;

        /* renamed from: c */
        public int f6633c = -1;

        /* renamed from: d */
        public int f6634d = -1;

        /* renamed from: e */
        public final String f6635e = "motion.progress";

        /* renamed from: f */
        public final String f6636f = "motion.velocity";

        /* renamed from: g */
        public final String f6637g = "motion.StartState";

        /* renamed from: h */
        public final String f6638h = "motion.EndState";

        public C1985h() {
        }

        /* renamed from: a */
        public void m5405a() {
            int i = this.f6633c;
            if (i != -1 || this.f6634d != -1) {
                if (i == -1) {
                    MotionLayout.this.F0(this.f6634d);
                } else {
                    int i2 = this.f6634d;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(EnumC1987j.SETUP);
            }
            if (Float.isNaN(this.f6632b)) {
                if (Float.isNaN(this.f6631a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f6631a);
            } else {
                MotionLayout.this.setProgress(this.f6631a, this.f6632b);
                this.f6631a = Float.NaN;
                this.f6632b = Float.NaN;
                this.f6633c = -1;
                this.f6634d = -1;
            }
        }

        /* renamed from: b */
        public Bundle m5406b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f6631a);
            bundle.putFloat("motion.velocity", this.f6632b);
            bundle.putInt("motion.StartState", this.f6633c);
            bundle.putInt("motion.EndState", this.f6634d);
            return bundle;
        }

        /* renamed from: c */
        public void m5407c() {
            this.f6634d = MotionLayout.this.w0;
            this.f6633c = MotionLayout.this.u0;
            this.f6632b = MotionLayout.this.getVelocity();
            this.f6631a = MotionLayout.this.getProgress();
        }

        /* renamed from: d */
        public void m5408d(int i) {
            this.f6634d = i;
        }

        /* renamed from: e */
        public void m5409e(float f) {
            this.f6631a = f;
        }

        /* renamed from: f */
        public void m5410f(int i) {
            this.f6633c = i;
        }

        /* renamed from: g */
        public void m5411g(Bundle bundle) {
            this.f6631a = bundle.getFloat("motion.progress");
            this.f6632b = bundle.getFloat("motion.velocity");
            this.f6633c = bundle.getInt("motion.StartState");
            this.f6634d = bundle.getInt("motion.EndState");
        }

        /* renamed from: h */
        public void m5412h(float f) {
            this.f6632b = f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    public interface InterfaceC1986i {
        /* renamed from: a */
        void mo5303a(MotionLayout motionLayout, int i, int i2, float f);

        /* renamed from: b */
        void mo5304b(MotionLayout motionLayout, int i);

        /* renamed from: c */
        void mo5346c(MotionLayout motionLayout, int i, int i2);

        /* renamed from: d */
        void mo5347d(MotionLayout motionLayout, int i, boolean z, float f);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$j */
    public enum EnumC1987j {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(Context context) {
        super(context);
        this.s0 = null;
        this.t0 = 0.0f;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = 0;
        this.y0 = 0;
        this.z0 = true;
        this.A0 = new HashMap();
        this.B0 = 0L;
        this.C0 = 1.0f;
        this.D0 = 0.0f;
        this.E0 = 0.0f;
        this.G0 = 0.0f;
        this.I0 = false;
        this.J0 = false;
        this.N0 = 0;
        this.P0 = false;
        this.Q0 = new e6g();
        this.R0 = new C1980c();
        this.T0 = true;
        this.Y0 = false;
        this.d1 = false;
        this.e1 = null;
        this.f1 = null;
        this.g1 = null;
        this.h1 = null;
        this.i1 = 0;
        this.j1 = -1L;
        this.k1 = 0.0f;
        this.l1 = 0;
        this.m1 = 0.0f;
        this.n1 = false;
        this.o1 = false;
        this.w1 = new kc9();
        this.x1 = false;
        this.z1 = null;
        this.A1 = null;
        this.B1 = 0;
        this.C1 = false;
        this.D1 = 0;
        this.E1 = new HashMap();
        this.I1 = new Rect();
        this.J1 = false;
        this.K1 = EnumC1987j.UNDEFINED;
        this.L1 = new C1982e();
        this.M1 = false;
        this.N1 = new RectF();
        this.O1 = null;
        this.P1 = null;
        this.Q1 = new ArrayList();
        t0(null);
    }

    public static boolean L0(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < 0.0f;
    }

    public final Rect A0(zt3 zt3Var) {
        this.I1.top = zt3Var.a0();
        this.I1.left = zt3Var.m59847Z();
        Rect rect = this.I1;
        int iM59846Y = zt3Var.m59846Y();
        Rect rect2 = this.I1;
        rect.right = iM59846Y + rect2.left;
        int iM59866z = zt3Var.m59866z();
        Rect rect3 = this.I1;
        rect2.bottom = iM59866z + rect3.top;
        return rect3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B0(int i, float f, float f2) {
        if (this.q0 == null || this.E0 == f) {
            return;
        }
        this.P0 = true;
        this.B0 = getNanoTime();
        this.C0 = this.q0.m5454p() / 1000.0f;
        this.G0 = f;
        this.I0 = true;
        if (i == 0 || i == 1 || i == 2) {
            if (i == 1 || i == 7) {
                f = 0.0f;
            } else if (i == 2 || i == 6) {
                f = 1.0f;
            }
            if (this.q0.m5449k() == 0) {
                this.Q0.m24417b(this.E0, f, f2, this.C0, this.q0.m5459u(), this.q0.m5460v());
            } else {
                this.Q0.m24419d(this.E0, f, f2, this.q0.m5419B(), this.q0.m5420C(), this.q0.m5418A(), this.q0.m5421D(), this.q0.m5464z());
            }
            int i2 = this.v0;
            this.G0 = f;
            this.v0 = i2;
            this.r0 = this.Q0;
        } else if (i == 4) {
            this.R0.m5376b(f2, this.E0, this.q0.m5459u());
            this.r0 = this.R0;
        } else if (i != 5) {
            if (i == 6 || i == 7) {
            }
        } else if (L0(f2, this.E0, this.q0.m5459u())) {
            this.R0.m5376b(f2, this.E0, this.q0.m5459u());
            this.r0 = this.R0;
        } else {
            this.Q0.m24417b(this.E0, f, f2, this.C0, this.q0.m5459u(), this.q0.m5460v());
            this.t0 = 0.0f;
            int i3 = this.v0;
            this.G0 = f;
            this.v0 = i3;
            this.r0 = this.Q0;
        }
        this.H0 = false;
        this.B0 = getNanoTime();
        invalidate();
    }

    public void C0() {
        m5373Z(1.0f);
        this.z1 = null;
    }

    public void D0(Runnable runnable) {
        m5373Z(1.0f);
        this.z1 = runnable;
    }

    public void E0() {
        m5373Z(0.0f);
    }

    public void F0(int i) {
        if (isAttachedToWindow()) {
            G0(i, -1, -1);
            return;
        }
        if (this.y1 == null) {
            this.y1 = new C1985h();
        }
        this.y1.m5408d(i);
    }

    public void G0(int i, int i2, int i3) {
        H0(i, i2, i3, -1);
    }

    public void H0(int i, int i2, int i3, int i4) {
        g5g g5gVar;
        int iM28076a;
        C1988a c1988a = this.q0;
        if (c1988a != null && (g5gVar = c1988a.f6641b) != null && (iM28076a = g5gVar.m28076a(this.v0, i, i2, i3)) != -1) {
            i = iM28076a;
        }
        int i5 = this.v0;
        if (i5 == i) {
            return;
        }
        if (this.u0 == i) {
            m5373Z(0.0f);
            if (i4 > 0) {
                this.C0 = i4 / 1000.0f;
                return;
            }
            return;
        }
        if (this.w0 == i) {
            m5373Z(1.0f);
            if (i4 > 0) {
                this.C0 = i4 / 1000.0f;
                return;
            }
            return;
        }
        this.w0 = i;
        if (i5 != -1) {
            setTransition(i5, i);
            m5373Z(1.0f);
            this.E0 = 0.0f;
            C0();
            if (i4 > 0) {
                this.C0 = i4 / 1000.0f;
                return;
            }
            return;
        }
        this.P0 = false;
        this.G0 = 1.0f;
        this.D0 = 0.0f;
        this.E0 = 0.0f;
        this.F0 = getNanoTime();
        this.B0 = getNanoTime();
        this.H0 = false;
        this.r0 = null;
        if (i4 == -1) {
            this.C0 = this.q0.m5454p() / 1000.0f;
        }
        this.u0 = -1;
        this.q0.m5441X(-1, this.w0);
        SparseArray sparseArray = new SparseArray();
        if (i4 == 0) {
            this.C0 = this.q0.m5454p() / 1000.0f;
        } else if (i4 > 0) {
            this.C0 = i4 / 1000.0f;
        }
        int childCount = getChildCount();
        this.A0.clear();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            this.A0.put(childAt, new gmb(childAt));
            sparseArray.put(childAt.getId(), (gmb) this.A0.get(childAt));
        }
        this.I0 = true;
        this.L1.m5393e(this.f6865c, null, this.q0.m5450l(i));
        y0();
        this.L1.m5389a();
        f0();
        int width = getWidth();
        int height = getHeight();
        if (this.g1 != null) {
            for (int i7 = 0; i7 < childCount; i7++) {
                gmb gmbVar = (gmb) this.A0.get(getChildAt(i7));
                if (gmbVar != null) {
                    this.q0.m5458t(gmbVar);
                }
            }
            Iterator it = this.g1.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).mo5339D(this, this.A0);
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                gmb gmbVar2 = (gmb) this.A0.get(getChildAt(i8));
                if (gmbVar2 != null) {
                    gmbVar2.m29062I(width, height, this.C0, getNanoTime());
                }
            }
        } else {
            for (int i9 = 0; i9 < childCount; i9++) {
                gmb gmbVar3 = (gmb) this.A0.get(getChildAt(i9));
                if (gmbVar3 != null) {
                    this.q0.m5458t(gmbVar3);
                    gmbVar3.m29062I(width, height, this.C0, getNanoTime());
                }
            }
        }
        float fM5422E = this.q0.m5422E();
        if (fM5422E != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i10 = 0; i10 < childCount; i10++) {
                gmb gmbVar4 = (gmb) this.A0.get(getChildAt(i10));
                float fM29078o = gmbVar4.m29078o() + gmbVar4.m29077n();
                fMin = Math.min(fMin, fM29078o);
                fMax = Math.max(fMax, fM29078o);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                gmb gmbVar5 = (gmb) this.A0.get(getChildAt(i11));
                float fM29077n = gmbVar5.m29077n();
                float fM29078o2 = gmbVar5.m29078o();
                gmbVar5.f25490o = 1.0f / (1.0f - fM5422E);
                gmbVar5.f25489n = fM5422E - ((((fM29077n + fM29078o2) - fMin) * fM5422E) / (fMax - fMin));
            }
        }
        this.D0 = 0.0f;
        this.E0 = 0.0f;
        this.I0 = true;
        invalidate();
    }

    public void I0() {
        this.L1.m5393e(this.f6865c, this.q0.m5450l(this.u0), this.q0.m5450l(this.w0));
        y0();
    }

    public void J0(int i, C2005b c2005b) {
        C1988a c1988a = this.q0;
        if (c1988a != null) {
            c1988a.m5438U(i, c2005b);
        }
        I0();
        if (this.v0 == i) {
            c2005b.m5677i(this);
        }
    }

    public void K0(int i, View... viewArr) {
        C1988a c1988a = this.q0;
        if (c1988a != null) {
            c1988a.c0(i, viewArr);
        }
    }

    /* renamed from: Z */
    public void m5373Z(float f) {
        if (this.q0 == null) {
            return;
        }
        float f2 = this.E0;
        float f3 = this.D0;
        if (f2 != f3 && this.H0) {
            this.E0 = f3;
        }
        float f4 = this.E0;
        if (f4 == f) {
            return;
        }
        this.P0 = false;
        this.G0 = f;
        this.C0 = r0.m5454p() / 1000.0f;
        setProgress(this.G0);
        this.r0 = null;
        this.s0 = this.q0.m5457s();
        this.H0 = false;
        this.B0 = getNanoTime();
        this.I0 = true;
        this.D0 = f4;
        this.E0 = f4;
        invalidate();
    }

    public boolean a0(int i, gmb gmbVar) {
        C1988a c1988a = this.q0;
        if (c1988a != null) {
            return c1988a.m5445g(i, gmbVar);
        }
        return false;
    }

    public final boolean b0(View view, MotionEvent motionEvent, float f, float f2) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f, f2);
            boolean zOnTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f, -f2);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(f, f2);
        if (this.P1 == null) {
            this.P1 = new Matrix();
        }
        matrix.invert(this.P1);
        motionEventObtain.transform(this.P1);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    public final void c0() {
        C1988a c1988a = this.q0;
        if (c1988a == null) {
            return;
        }
        int iM5423F = c1988a.m5423F();
        C1988a c1988a2 = this.q0;
        d0(iM5423F, c1988a2.m5450l(c1988a2.m5423F()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator it = this.q0.m5453o().iterator();
        while (it.hasNext()) {
            C1988a.b bVar = (C1988a.b) it.next();
            C1988a.b bVar2 = this.q0.f6642c;
            e0(bVar);
            int iM5484A = bVar.m5484A();
            int iM5497y = bVar.m5497y();
            String strM35104c = k75.m35104c(getContext(), iM5484A);
            String strM35104c2 = k75.m35104c(getContext(), iM5497y);
            if (sparseIntArray.get(iM5484A) == iM5497y) {
                StringBuilder sb = new StringBuilder();
                sb.append("CHECK: two transitions with the same start and end ");
                sb.append(strM35104c);
                sb.append("->");
                sb.append(strM35104c2);
            }
            if (sparseIntArray2.get(iM5497y) == iM5484A) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CHECK: you can't have reverse transitions");
                sb2.append(strM35104c);
                sb2.append("->");
                sb2.append(strM35104c2);
            }
            sparseIntArray.put(iM5484A, iM5497y);
            sparseIntArray2.put(iM5497y, iM5484A);
            if (this.q0.m5450l(iM5484A) == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" no such constraintSetStart ");
                sb3.append(strM35104c);
            }
            if (this.q0.m5450l(iM5497y) == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" no such constraintSetEnd ");
                sb4.append(strM35104c);
            }
        }
    }

    public final void d0(int i, C2005b c2005b) {
        String strM35104c = k75.m35104c(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("CHECK: ");
                sb.append(strM35104c);
                sb.append(" ALL VIEWS SHOULD HAVE ID's ");
                sb.append(childAt.getClass().getName());
                sb.append(" does not!");
            }
            if (c2005b.m5690w(id) == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CHECK: ");
                sb2.append(strM35104c);
                sb2.append(" NO CONSTRAINTS for ");
                sb2.append(k75.m35105d(childAt));
            }
        }
        int[] iArrM5692y = c2005b.m5692y();
        for (int i3 = 0; i3 < iArrM5692y.length; i3++) {
            int i4 = iArrM5692y[i3];
            String strM35104c2 = k75.m35104c(getContext(), i4);
            if (findViewById(iArrM5692y[i3]) == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("CHECK: ");
                sb3.append(strM35104c);
                sb3.append(" NO View matches id ");
                sb3.append(strM35104c2);
            }
            if (c2005b.m5691x(i4) == -1) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("CHECK: ");
                sb4.append(strM35104c);
                sb4.append("(");
                sb4.append(strM35104c2);
                sb4.append(") no LAYOUT_HEIGHT");
            }
            if (c2005b.m5665C(i4) == -1) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("CHECK: ");
                sb5.append(strM35104c);
                sb5.append("(");
                sb5.append(strM35104c2);
                sb5.append(") no LAYOUT_HEIGHT");
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        C1991d c1991d;
        ArrayList arrayList = this.g1;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).m5345C(canvas);
            }
        }
        h0(false);
        C1988a c1988a = this.q0;
        if (c1988a != null && (c1991d = c1988a.f6657r) != null) {
            c1991d.m5551c();
        }
        super.dispatchDraw(canvas);
        if (this.q0 == null) {
            return;
        }
        if ((this.N0 & 1) == 1 && !isInEditMode()) {
            this.i1++;
            long nanoTime = getNanoTime();
            long j = this.j1;
            if (j != -1) {
                if (nanoTime - j > 200000000) {
                    this.k1 = ((int) ((this.i1 / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.i1 = 0;
                    this.j1 = nanoTime;
                }
            } else {
                this.j1 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            String str = this.k1 + " fps " + k75.m35106e(this, this.u0) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(k75.m35106e(this, this.w0));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i = this.v0;
            sb.append(i == -1 ? SQLiteCommandFactory.UNDEFINED : k75.m35106e(this, i));
            String string = sb.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.N0 > 1) {
            if (this.O0 == null) {
                this.O0 = new C1981d();
            }
            this.O0.m5377a(canvas, this.A0, this.q0.m5454p(), this.N0);
        }
        ArrayList arrayList2 = this.g1;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((MotionHelper) it2.next()).m5344B(canvas);
            }
        }
    }

    public final void e0(C1988a.b bVar) {
        bVar.m5484A();
        bVar.m5497y();
    }

    public final void f0() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            gmb gmbVar = (gmb) this.A0.get(childAt);
            if (gmbVar != null) {
                gmbVar.m29058E(childAt);
            }
        }
    }

    @Override // p001o.ftb
    /* renamed from: g */
    public void mo4127g(View view, View view2, int i, int i2) {
        this.b1 = getNanoTime();
        this.c1 = 0.0f;
        this.Z0 = 0.0f;
        this.a1 = 0.0f;
    }

    public void g0(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            gmb gmbVar = (gmb) this.A0.get(getChildAt(i));
            if (gmbVar != null) {
                gmbVar.m29069f(z);
            }
        }
    }

    public int[] getConstraintSetIds() {
        C1988a c1988a = this.q0;
        if (c1988a == null) {
            return null;
        }
        return c1988a.m5452n();
    }

    public int getCurrentState() {
        return this.v0;
    }

    public ArrayList<C1988a.b> getDefinedTransitions() {
        C1988a c1988a = this.q0;
        if (c1988a == null) {
            return null;
        }
        return c1988a.m5453o();
    }

    public en5 getDesignTool() {
        if (this.S0 == null) {
            this.S0 = new en5(this);
        }
        return this.S0;
    }

    public int getEndState() {
        return this.w0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.E0;
    }

    public C1988a getScene() {
        return this.q0;
    }

    public int getStartState() {
        return this.u0;
    }

    public float getTargetPosition() {
        return this.G0;
    }

    public Bundle getTransitionState() {
        if (this.y1 == null) {
            this.y1 = new C1985h();
        }
        this.y1.m5407c();
        return this.y1.m5406b();
    }

    public long getTransitionTimeMs() {
        if (this.q0 != null) {
            this.C0 = r0.m5454p() / 1000.0f;
        }
        return (long) (this.C0 * 1000.0f);
    }

    public float getVelocity() {
        return this.t0;
    }

    @Override // p001o.ftb
    /* renamed from: h */
    public void mo4128h(View view, int i) {
        C1988a c1988a = this.q0;
        if (c1988a != null) {
            float f = this.c1;
            if (f == 0.0f) {
                return;
            }
            c1988a.m5434Q(this.Z0 / f, this.a1 / f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ab, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h0(boolean z) {
        boolean z2;
        char c;
        int childCount;
        Interpolator interpolator;
        int i;
        int i2;
        boolean z3;
        if (this.F0 == -1) {
            this.F0 = getNanoTime();
        }
        float f = this.E0;
        if (f > 0.0f && f < 1.0f) {
            this.v0 = -1;
        }
        boolean z4 = false;
        if (this.d1 || (this.I0 && (z || this.G0 != f))) {
            float fSignum = Math.signum(this.G0 - f);
            long nanoTime = getNanoTime();
            Interpolator interpolator2 = this.r0;
            float f2 = !(interpolator2 instanceof pmb) ? (((nanoTime - this.F0) * fSignum) * 1.0E-9f) / this.C0 : 0.0f;
            float f3 = this.E0 + f2;
            if (this.H0) {
                f3 = this.G0;
            }
            if ((fSignum <= 0.0f || f3 < this.G0) && (fSignum > 0.0f || f3 > this.G0)) {
                z2 = false;
            } else {
                f3 = this.G0;
                this.I0 = false;
                z2 = true;
            }
            this.E0 = f3;
            this.D0 = f3;
            this.F0 = nanoTime;
            if (interpolator2 == null || z2) {
                this.t0 = f2;
            } else if (this.P0) {
                float interpolation = interpolator2.getInterpolation((nanoTime - this.B0) * 1.0E-9f);
                Interpolator interpolator3 = this.r0;
                e6g e6gVar = this.Q0;
                c = interpolator3 == e6gVar ? e6gVar.m24418c() ? (char) 2 : (char) 1 : (char) 0;
                this.E0 = interpolation;
                this.F0 = nanoTime;
                Interpolator interpolator4 = this.r0;
                if (interpolator4 instanceof pmb) {
                    float fMo5375a = ((pmb) interpolator4).mo5375a();
                    this.t0 = fMo5375a;
                    if (Math.abs(fMo5375a) * this.C0 <= 1.0E-5f && c == 2) {
                        this.I0 = false;
                    }
                    if (fMo5375a > 0.0f && interpolation >= 1.0f) {
                        this.E0 = 1.0f;
                        this.I0 = false;
                        interpolation = 1.0f;
                    }
                    if (fMo5375a >= 0.0f || interpolation > 0.0f) {
                        f3 = interpolation;
                    } else {
                        this.E0 = 0.0f;
                        this.I0 = false;
                        f3 = 0.0f;
                    }
                    if (Math.abs(this.t0) > 1.0E-5f) {
                        setState(EnumC1987j.MOVING);
                    }
                    if (c != 1) {
                        if ((fSignum > 0.0f && f3 >= this.G0) || (fSignum <= 0.0f && f3 <= this.G0)) {
                            f3 = this.G0;
                            this.I0 = false;
                        }
                        if (f3 >= 1.0f || f3 <= 0.0f) {
                            this.I0 = false;
                            setState(EnumC1987j.FINISHED);
                        }
                    }
                    childCount = getChildCount();
                    this.d1 = false;
                    long nanoTime2 = getNanoTime();
                    this.v1 = f3;
                    Interpolator interpolator5 = this.s0;
                    float interpolation2 = interpolator5 != null ? f3 : interpolator5.getInterpolation(f3);
                    interpolator = this.s0;
                    if (interpolator != null) {
                        float interpolation3 = interpolator.getInterpolation((fSignum / this.C0) + f3);
                        this.t0 = interpolation3;
                        this.t0 = interpolation3 - this.s0.getInterpolation(f3);
                    }
                    for (i = 0; i < childCount; i++) {
                        View childAt = getChildAt(i);
                        gmb gmbVar = (gmb) this.A0.get(childAt);
                        if (gmbVar != null) {
                            this.d1 = gmbVar.m29086x(childAt, interpolation2, nanoTime2, this.w1) | this.d1;
                        }
                    }
                    boolean z5 = (fSignum <= 0.0f && f3 >= this.G0) || (fSignum <= 0.0f && f3 <= this.G0);
                    if (!this.d1 && !this.I0 && z5) {
                        setState(EnumC1987j.FINISHED);
                    }
                    if (this.o1) {
                        requestLayout();
                    }
                    this.d1 = (!z5) | this.d1;
                    if (f3 <= 0.0f && (i2 = this.u0) != -1 && this.v0 != i2) {
                        this.v0 = i2;
                        this.q0.m5450l(i2).m5675g(this);
                        setState(EnumC1987j.FINISHED);
                        z4 = true;
                    }
                    if (f3 >= 1.0d) {
                        int i3 = this.v0;
                        int i4 = this.w0;
                        if (i3 != i4) {
                            this.v0 = i4;
                            this.q0.m5450l(i4).m5675g(this);
                            setState(EnumC1987j.FINISHED);
                            z4 = true;
                        }
                    }
                    if (this.d1 || this.I0) {
                        invalidate();
                    } else if ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                        setState(EnumC1987j.FINISHED);
                    }
                    if (!this.d1 && !this.I0 && ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f))) {
                        w0();
                    }
                }
            } else {
                float interpolation4 = interpolator2.getInterpolation(f3);
                Interpolator interpolator6 = this.r0;
                if (interpolator6 instanceof pmb) {
                    this.t0 = ((pmb) interpolator6).mo5375a();
                } else {
                    this.t0 = ((interpolator6.getInterpolation(f3 + f2) - interpolation4) * fSignum) / f2;
                }
                f3 = interpolation4;
            }
            c = 0;
            if (Math.abs(this.t0) > 1.0E-5f) {
            }
            if (c != 1) {
            }
            childCount = getChildCount();
            this.d1 = false;
            long nanoTime22 = getNanoTime();
            this.v1 = f3;
            Interpolator interpolator52 = this.s0;
            if (interpolator52 != null) {
            }
            interpolator = this.s0;
            if (interpolator != null) {
            }
            while (i < childCount) {
            }
            if (fSignum <= 0.0f) {
                if (!this.d1) {
                    setState(EnumC1987j.FINISHED);
                }
                if (this.o1) {
                }
                this.d1 = (!z5) | this.d1;
                if (f3 <= 0.0f) {
                    this.v0 = i2;
                    this.q0.m5450l(i2).m5675g(this);
                    setState(EnumC1987j.FINISHED);
                    z4 = true;
                }
                if (f3 >= 1.0d) {
                }
                if (this.d1) {
                    invalidate();
                    if (!this.d1) {
                        w0();
                    }
                }
            } else {
                if (!this.d1) {
                }
                if (this.o1) {
                }
                this.d1 = (!z5) | this.d1;
                if (f3 <= 0.0f) {
                }
                if (f3 >= 1.0d) {
                }
                if (this.d1) {
                }
            }
        }
        float f4 = this.E0;
        if (f4 < 1.0f) {
            if (f4 <= 0.0f) {
                int i5 = this.v0;
                int i6 = this.u0;
                z3 = i5 == i6 ? z4 : true;
                this.v0 = i6;
            }
            this.M1 |= z4;
            if (z4 && !this.x1) {
                requestLayout();
            }
            this.D0 = this.E0;
        }
        int i7 = this.v0;
        int i8 = this.w0;
        z3 = i7 == i8 ? z4 : true;
        this.v0 = i8;
        z4 = z3;
        this.M1 |= z4;
        if (z4) {
            requestLayout();
        }
        this.D0 = this.E0;
    }

    @Override // p001o.ftb
    /* renamed from: i */
    public void mo4129i(View view, int i, int i2, int[] iArr, int i3) {
        C1988a.b bVar;
        C1989b c1989bM5485B;
        int iM5519q;
        C1988a c1988a = this.q0;
        if (c1988a == null || (bVar = c1988a.f6642c) == null || !bVar.m5486C()) {
            return;
        }
        int i4 = -1;
        if (!bVar.m5486C() || (c1989bM5485B = bVar.m5485B()) == null || (iM5519q = c1989bM5485B.m5519q()) == -1 || view.getId() == iM5519q) {
            if (c1988a.m5461w()) {
                C1989b c1989bM5485B2 = bVar.m5485B();
                if (c1989bM5485B2 != null && (c1989bM5485B2.m5507e() & 4) != 0) {
                    i4 = i2;
                }
                float f = this.D0;
                if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(i4)) {
                    return;
                }
            }
            if (bVar.m5485B() != null && (bVar.m5485B().m5507e() & 1) != 0) {
                float fM5462x = c1988a.m5462x(i, i2);
                float f2 = this.E0;
                if ((f2 <= 0.0f && fM5462x < 0.0f) || (f2 >= 1.0f && fM5462x > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC1978a(view));
                    return;
                }
            }
            float f3 = this.D0;
            long nanoTime = getNanoTime();
            float f4 = i;
            this.Z0 = f4;
            float f5 = i2;
            this.a1 = f5;
            this.c1 = (float) ((nanoTime - this.b1) * 1.0E-9d);
            this.b1 = nanoTime;
            c1988a.m5433P(f4, f5);
            if (f3 != this.D0) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            h0(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.Y0 = true;
        }
    }

    public final void i0() {
        boolean z;
        float fSignum = Math.signum(this.G0 - this.E0);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.r0;
        float interpolation = this.E0 + (!(interpolator instanceof e6g) ? (((nanoTime - this.F0) * fSignum) * 1.0E-9f) / this.C0 : 0.0f);
        if (this.H0) {
            interpolation = this.G0;
        }
        if ((fSignum <= 0.0f || interpolation < this.G0) && (fSignum > 0.0f || interpolation > this.G0)) {
            z = false;
        } else {
            interpolation = this.G0;
            z = true;
        }
        if (interpolator != null && !z) {
            interpolation = this.P0 ? interpolator.getInterpolation((nanoTime - this.B0) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.G0) || (fSignum <= 0.0f && interpolation <= this.G0)) {
            interpolation = this.G0;
        }
        this.v1 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.s0;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            gmb gmbVar = (gmb) this.A0.get(childAt);
            if (gmbVar != null) {
                gmbVar.m29086x(childAt, interpolation, nanoTime2, this.w1);
            }
        }
        if (this.o1) {
            requestLayout();
        }
    }

    public final void j0() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.K0 == null && ((copyOnWriteArrayList = this.h1) == null || copyOnWriteArrayList.isEmpty())) || this.m1 == this.D0) {
            return;
        }
        if (this.l1 != -1) {
            l0();
            this.n1 = true;
        }
        this.l1 = -1;
        float f = this.D0;
        this.m1 = f;
        InterfaceC1986i interfaceC1986i = this.K0;
        if (interfaceC1986i != null) {
            interfaceC1986i.mo5303a(this, this.u0, this.w0, f);
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.h1;
        if (copyOnWriteArrayList2 != null) {
            Iterator it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                ((InterfaceC1986i) it.next()).mo5303a(this, this.u0, this.w0, this.D0);
            }
        }
        this.n1 = true;
    }

    @Override // p001o.gtb
    /* renamed from: k */
    public void mo4131k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.Y0 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.Y0 = false;
    }

    public void k0() {
        int iIntValue;
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.K0 != null || ((copyOnWriteArrayList = this.h1) != null && !copyOnWriteArrayList.isEmpty())) && this.l1 == -1) {
            this.l1 = this.v0;
            if (this.Q1.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList arrayList = this.Q1;
                iIntValue = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
            }
            int i = this.v0;
            if (iIntValue != i && i != -1) {
                this.Q1.add(Integer.valueOf(i));
            }
        }
        x0();
        Runnable runnable = this.z1;
        if (runnable != null) {
            runnable.run();
            this.z1 = null;
        }
        int[] iArr = this.A1;
        if (iArr == null || this.B1 <= 0) {
            return;
        }
        F0(iArr[0]);
        int[] iArr2 = this.A1;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.B1--;
    }

    @Override // p001o.ftb
    /* renamed from: l */
    public void mo4132l(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public final void l0() {
        InterfaceC1986i interfaceC1986i = this.K0;
        if (interfaceC1986i != null) {
            interfaceC1986i.mo5346c(this, this.u0, this.w0);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.h1;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1986i) it.next()).mo5346c(this, this.u0, this.w0);
            }
        }
    }

    @Override // p001o.ftb
    /* renamed from: m */
    public boolean mo4133m(View view, View view2, int i, int i2) {
        C1988a.b bVar;
        C1988a c1988a = this.q0;
        return (c1988a == null || (bVar = c1988a.f6642c) == null || bVar.m5485B() == null || (this.q0.f6642c.m5485B().m5507e() & 2) != 0) ? false : true;
    }

    public void m0(int i, boolean z, float f) {
        InterfaceC1986i interfaceC1986i = this.K0;
        if (interfaceC1986i != null) {
            interfaceC1986i.mo5347d(this, i, z, f);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.h1;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1986i) it.next()).mo5347d(this, i, z, f);
            }
        }
    }

    public void n0(int i, float f, float f2, float f3, float[] fArr) throws Resources.NotFoundException {
        String resourceName;
        HashMap map = this.A0;
        View viewM5613q = m5613q(i);
        gmb gmbVar = (gmb) map.get(viewM5613q);
        if (gmbVar != null) {
            gmbVar.m29075l(f, f2, f3, fArr);
            float y = viewM5613q.getY();
            this.L0 = f;
            this.M0 = y;
            return;
        }
        if (viewM5613q == null) {
            resourceName = "" + i;
        } else {
            resourceName = viewM5613q.getContext().getResources().getResourceName(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("WARNING could not find view id ");
        sb.append(resourceName);
    }

    public C2005b o0(int i) {
        C1988a c1988a = this.q0;
        if (c1988a == null) {
            return null;
        }
        return c1988a.m5450l(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C1988a.b bVar;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.H1 = display.getRotation();
        }
        C1988a c1988a = this.q0;
        if (c1988a != null && (i = this.v0) != -1) {
            C2005b c2005bM5450l = c1988a.m5450l(i);
            this.q0.m5437T(this);
            ArrayList arrayList = this.g1;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((MotionHelper) it.next()).m5343A(this);
                }
            }
            if (c2005bM5450l != null) {
                c2005bM5450l.m5677i(this);
            }
            this.u0 = this.v0;
        }
        w0();
        C1985h c1985h = this.y1;
        if (c1985h != null) {
            if (this.J1) {
                post(new RunnableC1979b());
                return;
            } else {
                c1985h.m5405a();
                return;
            }
        }
        C1988a c1988a2 = this.q0;
        if (c1988a2 == null || (bVar = c1988a2.f6642c) == null || bVar.m5496x() != 4) {
            return;
        }
        C0();
        setState(EnumC1987j.SETUP);
        setState(EnumC1987j.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1989b c1989bM5485B;
        int iM5519q;
        RectF rectFM5518p;
        C1988a c1988a = this.q0;
        if (c1988a != null && this.z0) {
            C1991d c1991d = c1988a.f6657r;
            if (c1991d != null) {
                c1991d.m5556h(motionEvent);
            }
            C1988a.b bVar = this.q0.f6642c;
            if (bVar != null && bVar.m5486C() && (c1989bM5485B = bVar.m5485B()) != null && ((motionEvent.getAction() != 0 || (rectFM5518p = c1989bM5485B.m5518p(this, new RectF())) == null || rectFM5518p.contains(motionEvent.getX(), motionEvent.getY())) && (iM5519q = c1989bM5485B.m5519q()) != -1)) {
                View view = this.O1;
                if (view == null || view.getId() != iM5519q) {
                    this.O1 = findViewById(iM5519q);
                }
                if (this.O1 != null) {
                    this.N1.set(r0.getLeft(), this.O1.getTop(), this.O1.getRight(), this.O1.getBottom());
                    if (this.N1.contains(motionEvent.getX(), motionEvent.getY()) && !s0(this.O1.getLeft(), this.O1.getTop(), this.O1, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.x1 = true;
        try {
            if (this.q0 == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.W0 != i5 || this.X0 != i6) {
                y0();
                h0(true);
            }
            this.W0 = i5;
            this.X0 = i6;
            this.U0 = i5;
            this.V0 = i6;
        } finally {
            this.x1 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.q0 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = false;
        boolean z2 = (this.x0 == i && this.y0 == i2) ? false : true;
        if (this.M1) {
            this.M1 = false;
            w0();
            x0();
            z2 = true;
        }
        if (this.f6870h) {
            z2 = true;
        }
        this.x0 = i;
        this.y0 = i2;
        int iM5423F = this.q0.m5423F();
        int iM5455q = this.q0.m5455q();
        if ((z2 || this.L1.m5394f(iM5423F, iM5455q)) && this.u0 != -1) {
            super.onMeasure(i, i2);
            this.L1.m5393e(this.f6865c, this.q0.m5450l(iM5423F), this.q0.m5450l(iM5455q));
            this.L1.m5396h();
            this.L1.m5397i(iM5423F, iM5455q);
        } else {
            if (z2) {
                super.onMeasure(i, i2);
            }
            z = true;
        }
        if (this.o1 || z) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iM59846Y = this.f6865c.m59846Y() + getPaddingLeft() + getPaddingRight();
            int iM59866z = this.f6865c.m59866z() + paddingTop;
            int i3 = this.t1;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                iM59846Y = (int) (this.p1 + (this.v1 * (this.r1 - r8)));
                requestLayout();
            }
            int i4 = this.u1;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                iM59866z = (int) (this.q1 + (this.v1 * (this.s1 - r8)));
                requestLayout();
            }
            setMeasuredDimension(iM59846Y, iM59866z);
        }
        i0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        C1988a c1988a = this.q0;
        if (c1988a != null) {
            c1988a.m5440W(m5616t());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C1988a c1988a = this.q0;
        if (c1988a == null || !this.z0 || !c1988a.b0()) {
            return super.onTouchEvent(motionEvent);
        }
        C1988a.b bVar = this.q0.f6642c;
        if (bVar != null && !bVar.m5486C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.q0.m5435R(motionEvent, getCurrentState(), this);
        if (this.q0.f6642c.m5487D(4)) {
            return this.q0.f6642c.m5485B().m5520r();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.h1 == null) {
                this.h1 = new CopyOnWriteArrayList();
            }
            this.h1.add(motionHelper);
            if (motionHelper.m5349z()) {
                if (this.e1 == null) {
                    this.e1 = new ArrayList();
                }
                this.e1.add(motionHelper);
            }
            if (motionHelper.m5348y()) {
                if (this.f1 == null) {
                    this.f1 = new ArrayList();
                }
                this.f1.add(motionHelper);
            }
            if (motionHelper.mo5341x()) {
                if (this.g1 == null) {
                    this.g1 = new ArrayList();
                }
                this.g1.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.e1;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f1;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public gmb p0(int i) {
        return (gmb) this.A0.get(findViewById(i));
    }

    public C1988a.b q0(int i) {
        return this.q0.m5424G(i);
    }

    public void r0(View view, float f, float f2, float[] fArr, int i) {
        float interpolation;
        float fMo5375a = this.t0;
        float f3 = this.E0;
        if (this.r0 != null) {
            float fSignum = Math.signum(this.G0 - f3);
            float interpolation2 = this.r0.getInterpolation(this.E0 + 1.0E-5f);
            interpolation = this.r0.getInterpolation(this.E0);
            fMo5375a = (fSignum * ((interpolation2 - interpolation) / 1.0E-5f)) / this.C0;
        } else {
            interpolation = f3;
        }
        Interpolator interpolator = this.r0;
        if (interpolator instanceof pmb) {
            fMo5375a = ((pmb) interpolator).mo5375a();
        }
        gmb gmbVar = (gmb) this.A0.get(view);
        if ((i & 1) == 0) {
            gmbVar.m29080r(interpolation, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            gmbVar.m29075l(interpolation, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * fMo5375a;
            fArr[1] = fArr[1] * fMo5375a;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        C1988a c1988a;
        C1988a.b bVar;
        if (!this.o1 && this.v0 == -1 && (c1988a = this.q0) != null && (bVar = c1988a.f6642c) != null) {
            int iM5498z = bVar.m5498z();
            if (iM5498z == 0) {
                return;
            }
            if (iM5498z == 2) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    ((gmb) this.A0.get(getChildAt(i))).m29088z();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final boolean s0(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (s0((r3.getLeft() + f) - view.getScrollX(), (r3.getTop() + f2) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (!z) {
            this.N1.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.N1.contains(motionEvent.getX(), motionEvent.getY())) && b0(view, motionEvent, -f, -f2)) {
                return true;
            }
        }
        return z;
    }

    public void setDebugMode(int i) {
        this.N0 = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.J1 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.z0 = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.q0 != null) {
            setState(EnumC1987j.MOVING);
            Interpolator interpolatorM5457s = this.q0.m5457s();
            if (interpolatorM5457s != null) {
                setProgress(interpolatorM5457s.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList arrayList = this.f1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((MotionHelper) this.f1.get(i)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList arrayList = this.e1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((MotionHelper) this.e1.get(i)).setProgress(f);
            }
        }
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.y1 == null) {
                this.y1 = new C1985h();
            }
            this.y1.m5409e(f);
            this.y1.m5412h(f2);
            return;
        }
        setProgress(f);
        setState(EnumC1987j.MOVING);
        this.t0 = f2;
        if (f2 != 0.0f) {
            m5373Z(f2 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f == 0.0f || f == 1.0f) {
                return;
            }
            m5373Z(f > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void setScene(C1988a c1988a) {
        this.q0 = c1988a;
        c1988a.m5440W(m5616t());
        y0();
    }

    public void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.v0 = i;
            return;
        }
        if (this.y1 == null) {
            this.y1 = new C1985h();
        }
        this.y1.m5410f(i);
        this.y1.m5408d(i);
    }

    public void setState(EnumC1987j enumC1987j) {
        EnumC1987j enumC1987j2 = EnumC1987j.FINISHED;
        if (enumC1987j == enumC1987j2 && this.v0 == -1) {
            return;
        }
        EnumC1987j enumC1987j3 = this.K1;
        this.K1 = enumC1987j;
        EnumC1987j enumC1987j4 = EnumC1987j.MOVING;
        if (enumC1987j3 == enumC1987j4 && enumC1987j == enumC1987j4) {
            j0();
        }
        int iOrdinal = enumC1987j3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && enumC1987j == enumC1987j2) {
                k0();
                return;
            }
            return;
        }
        if (enumC1987j == enumC1987j4) {
            j0();
        }
        if (enumC1987j == enumC1987j2) {
            k0();
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.y1 == null) {
                this.y1 = new C1985h();
            }
            this.y1.m5410f(i);
            this.y1.m5408d(i2);
            return;
        }
        C1988a c1988a = this.q0;
        if (c1988a != null) {
            this.u0 = i;
            this.w0 = i2;
            c1988a.m5441X(i, i2);
            this.L1.m5393e(this.f6865c, this.q0.m5450l(i), this.q0.m5450l(i2));
            y0();
            this.E0 = 0.0f;
            E0();
        }
    }

    public void setTransitionDuration(int i) {
        C1988a c1988a = this.q0;
        if (c1988a == null) {
            return;
        }
        c1988a.m5439V(i);
    }

    public void setTransitionListener(InterfaceC1986i interfaceC1986i) {
        this.K0 = interfaceC1986i;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.y1 == null) {
            this.y1 = new C1985h();
        }
        this.y1.m5411g(bundle);
        if (isAttachedToWindow()) {
            this.y1.m5405a();
        }
    }

    public final void t0(AttributeSet attributeSet) {
        C1988a c1988a;
        R1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.MotionLayout_layoutDescription) {
                    this.q0 = new C1988a(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == mbe.MotionLayout_currentState) {
                    this.v0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == mbe.MotionLayout_motionProgress) {
                    this.G0 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.I0 = true;
                } else if (index == mbe.MotionLayout_applyMotionScene) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == mbe.MotionLayout_showPaths) {
                    if (this.N0 == 0) {
                        this.N0 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == mbe.MotionLayout_motionDebug) {
                    this.N0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                this.q0 = null;
            }
        }
        if (this.N0 != 0) {
            c0();
        }
        if (this.v0 != -1 || (c1988a = this.q0) == null) {
            return;
        }
        this.v0 = c1988a.m5423F();
        this.u0 = this.q0.m5423F();
        this.w0 = this.q0.m5455q();
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return k75.m35104c(context, this.u0) + "->" + k75.m35104c(context, this.w0) + " (pos:" + this.E0 + " Dpos/Dt:" + this.t0;
    }

    public boolean u0() {
        return this.z0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* renamed from: v */
    public void mo5374v(int i) {
        this.f6873x = null;
    }

    public InterfaceC1983f v0() {
        return C1984g.m5404a();
    }

    public void w0() {
        C1988a c1988a = this.q0;
        if (c1988a == null) {
            return;
        }
        if (c1988a.m5446h(this, this.v0)) {
            requestLayout();
            return;
        }
        int i = this.v0;
        if (i != -1) {
            this.q0.m5444f(this, i);
        }
        if (this.q0.b0()) {
            this.q0.m5443Z();
        }
    }

    public final void x0() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.K0 == null && ((copyOnWriteArrayList = this.h1) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.n1 = false;
        Iterator it = this.Q1.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            InterfaceC1986i interfaceC1986i = this.K0;
            if (interfaceC1986i != null) {
                interfaceC1986i.mo5304b(this, num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.h1;
            if (copyOnWriteArrayList2 != null) {
                Iterator it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1986i) it2.next()).mo5304b(this, num.intValue());
                }
            }
        }
        this.Q1.clear();
    }

    public void y0() {
        this.L1.m5396h();
        invalidate();
    }

    public final void z0() {
        int childCount = getChildCount();
        this.L1.m5389a();
        boolean z = true;
        this.I0 = true;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), (gmb) this.A0.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int iM5448j = this.q0.m5448j();
        if (iM5448j != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                gmb gmbVar = (gmb) this.A0.get(getChildAt(i3));
                if (gmbVar != null) {
                    gmbVar.m29057D(iM5448j);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.A0.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            gmb gmbVar2 = (gmb) this.A0.get(getChildAt(i5));
            if (gmbVar2.m29071h() != -1) {
                sparseBooleanArray.put(gmbVar2.m29071h(), true);
                iArr[i4] = gmbVar2.m29071h();
                i4++;
            }
        }
        if (this.g1 != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                gmb gmbVar3 = (gmb) this.A0.get(findViewById(iArr[i6]));
                if (gmbVar3 != null) {
                    this.q0.m5458t(gmbVar3);
                }
            }
            Iterator it = this.g1.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).mo5339D(this, this.A0);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                gmb gmbVar4 = (gmb) this.A0.get(findViewById(iArr[i7]));
                if (gmbVar4 != null) {
                    gmbVar4.m29062I(width, height, this.C0, getNanoTime());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                gmb gmbVar5 = (gmb) this.A0.get(findViewById(iArr[i8]));
                if (gmbVar5 != null) {
                    this.q0.m5458t(gmbVar5);
                    gmbVar5.m29062I(width, height, this.C0, getNanoTime());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            gmb gmbVar6 = (gmb) this.A0.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && gmbVar6 != null) {
                this.q0.m5458t(gmbVar6);
                gmbVar6.m29062I(width, height, this.C0, getNanoTime());
            }
        }
        float fM5422E = this.q0.m5422E();
        if (fM5422E != 0.0f) {
            boolean z2 = ((double) fM5422E) < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            float fAbs = Math.abs(fM5422E);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            int i10 = 0;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            while (true) {
                if (i10 >= childCount) {
                    z = false;
                    break;
                }
                gmb gmbVar7 = (gmb) this.A0.get(getChildAt(i10));
                if (!Float.isNaN(gmbVar7.f25488m)) {
                    break;
                }
                float fM29077n = gmbVar7.m29077n();
                float fM29078o = gmbVar7.m29078o();
                float f = z2 ? fM29078o - fM29077n : fM29078o + fM29077n;
                fMin2 = Math.min(fMin2, f);
                fMax2 = Math.max(fMax2, f);
                i10++;
            }
            if (!z) {
                while (i < childCount) {
                    gmb gmbVar8 = (gmb) this.A0.get(getChildAt(i));
                    float fM29077n2 = gmbVar8.m29077n();
                    float fM29078o2 = gmbVar8.m29078o();
                    float f2 = z2 ? fM29078o2 - fM29077n2 : fM29078o2 + fM29077n2;
                    gmbVar8.f25490o = 1.0f / (1.0f - fAbs);
                    gmbVar8.f25489n = fAbs - (((f2 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i++;
                }
                return;
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                gmb gmbVar9 = (gmb) this.A0.get(getChildAt(i11));
                if (!Float.isNaN(gmbVar9.f25488m)) {
                    fMin = Math.min(fMin, gmbVar9.f25488m);
                    fMax = Math.max(fMax, gmbVar9.f25488m);
                }
            }
            while (i < childCount) {
                gmb gmbVar10 = (gmb) this.A0.get(getChildAt(i));
                if (!Float.isNaN(gmbVar10.f25488m)) {
                    gmbVar10.f25490o = 1.0f / (1.0f - fAbs);
                    if (z2) {
                        gmbVar10.f25489n = fAbs - (((fMax - gmbVar10.f25488m) / (fMax - fMin)) * fAbs);
                    } else {
                        gmbVar10.f25489n = fAbs - (((gmbVar10.f25488m - fMin) * fAbs) / (fMax - fMin));
                    }
                }
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        setState(EnumC1987j.SETUP);
        this.v0 = i;
        this.u0 = -1;
        this.w0 = -1;
        vt3 vt3Var = this.f6873x;
        if (vt3Var != null) {
            vt3Var.m53396d(i, i2, i3);
            return;
        }
        C1988a c1988a = this.q0;
        if (c1988a != null) {
            c1988a.m5450l(i).m5677i(this);
        }
    }

    public void setProgress(float f) {
        if (f >= 0.0f) {
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.y1 == null) {
                this.y1 = new C1985h();
            }
            this.y1.m5409e(f);
            return;
        }
        if (f <= 0.0f) {
            if (this.E0 == 1.0f && this.v0 == this.w0) {
                setState(EnumC1987j.MOVING);
            }
            this.v0 = this.u0;
            if (this.E0 == 0.0f) {
                setState(EnumC1987j.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.E0 == 0.0f && this.v0 == this.u0) {
                setState(EnumC1987j.MOVING);
            }
            this.v0 = this.w0;
            if (this.E0 == 1.0f) {
                setState(EnumC1987j.FINISHED);
            }
        } else {
            this.v0 = -1;
            setState(EnumC1987j.MOVING);
        }
        if (this.q0 == null) {
            return;
        }
        this.H0 = true;
        this.G0 = f;
        this.D0 = f;
        this.F0 = -1L;
        this.B0 = -1L;
        this.r0 = null;
        this.I0 = true;
        invalidate();
    }

    public void setTransition(int i) {
        float f;
        if (this.q0 != null) {
            C1988a.b bVarQ0 = q0(i);
            this.u0 = bVarQ0.m5484A();
            this.w0 = bVarQ0.m5497y();
            if (!isAttachedToWindow()) {
                if (this.y1 == null) {
                    this.y1 = new C1985h();
                }
                this.y1.m5410f(this.u0);
                this.y1.m5408d(this.w0);
                return;
            }
            int i2 = this.v0;
            if (i2 == this.u0) {
                f = 0.0f;
            } else {
                f = i2 == this.w0 ? 1.0f : Float.NaN;
            }
            this.q0.m5442Y(bVarQ0);
            this.L1.m5393e(this.f6865c, this.q0.m5450l(this.u0), this.q0.m5450l(this.w0));
            y0();
            if (this.E0 != f) {
                if (f == 0.0f) {
                    g0(true);
                    this.q0.m5450l(this.u0).m5677i(this);
                } else if (f == 1.0f) {
                    g0(false);
                    this.q0.m5450l(this.w0).m5677i(this);
                }
            }
            this.E0 = Float.isNaN(f) ? 0.0f : f;
            if (Float.isNaN(f)) {
                StringBuilder sb = new StringBuilder();
                sb.append(k75.m35103b());
                sb.append(" transitionToStart ");
                E0();
                return;
            }
            setProgress(f);
        }
    }

    public void setTransition(C1988a.b bVar) {
        this.q0.m5442Y(bVar);
        setState(EnumC1987j.SETUP);
        if (this.v0 == this.q0.m5455q()) {
            this.E0 = 1.0f;
            this.D0 = 1.0f;
            this.G0 = 1.0f;
        } else {
            this.E0 = 0.0f;
            this.D0 = 0.0f;
            this.G0 = 0.0f;
        }
        this.F0 = bVar.m5487D(1) ? -1L : getNanoTime();
        int iM5423F = this.q0.m5423F();
        int iM5455q = this.q0.m5455q();
        if (iM5423F == this.u0 && iM5455q == this.w0) {
            return;
        }
        this.u0 = iM5423F;
        this.w0 = iM5455q;
        this.q0.m5441X(iM5423F, iM5455q);
        this.L1.m5393e(this.f6865c, this.q0.m5450l(this.u0), this.q0.m5450l(this.w0));
        this.L1.m5397i(this.u0, this.w0);
        this.L1.m5396h();
        y0();
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s0 = null;
        this.t0 = 0.0f;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = 0;
        this.y0 = 0;
        this.z0 = true;
        this.A0 = new HashMap();
        this.B0 = 0L;
        this.C0 = 1.0f;
        this.D0 = 0.0f;
        this.E0 = 0.0f;
        this.G0 = 0.0f;
        this.I0 = false;
        this.J0 = false;
        this.N0 = 0;
        this.P0 = false;
        this.Q0 = new e6g();
        this.R0 = new C1980c();
        this.T0 = true;
        this.Y0 = false;
        this.d1 = false;
        this.e1 = null;
        this.f1 = null;
        this.g1 = null;
        this.h1 = null;
        this.i1 = 0;
        this.j1 = -1L;
        this.k1 = 0.0f;
        this.l1 = 0;
        this.m1 = 0.0f;
        this.n1 = false;
        this.o1 = false;
        this.w1 = new kc9();
        this.x1 = false;
        this.z1 = null;
        this.A1 = null;
        this.B1 = 0;
        this.C1 = false;
        this.D1 = 0;
        this.E1 = new HashMap();
        this.I1 = new Rect();
        this.J1 = false;
        this.K1 = EnumC1987j.UNDEFINED;
        this.L1 = new C1982e();
        this.M1 = false;
        this.N1 = new RectF();
        this.O1 = null;
        this.P1 = null;
        this.Q1 = new ArrayList();
        t0(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s0 = null;
        this.t0 = 0.0f;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = 0;
        this.y0 = 0;
        this.z0 = true;
        this.A0 = new HashMap();
        this.B0 = 0L;
        this.C0 = 1.0f;
        this.D0 = 0.0f;
        this.E0 = 0.0f;
        this.G0 = 0.0f;
        this.I0 = false;
        this.J0 = false;
        this.N0 = 0;
        this.P0 = false;
        this.Q0 = new e6g();
        this.R0 = new C1980c();
        this.T0 = true;
        this.Y0 = false;
        this.d1 = false;
        this.e1 = null;
        this.f1 = null;
        this.g1 = null;
        this.h1 = null;
        this.i1 = 0;
        this.j1 = -1L;
        this.k1 = 0.0f;
        this.l1 = 0;
        this.m1 = 0.0f;
        this.n1 = false;
        this.o1 = false;
        this.w1 = new kc9();
        this.x1 = false;
        this.z1 = null;
        this.A1 = null;
        this.B1 = 0;
        this.C1 = false;
        this.D1 = 0;
        this.E1 = new HashMap();
        this.I1 = new Rect();
        this.J1 = false;
        this.K1 = EnumC1987j.UNDEFINED;
        this.L1 = new C1982e();
        this.M1 = false;
        this.N1 = new RectF();
        this.O1 = null;
        this.P1 = null;
        this.Q1 = new ArrayList();
        t0(attributeSet);
    }
}
