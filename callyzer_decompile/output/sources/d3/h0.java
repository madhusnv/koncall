package d3;

import al.C0174b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import c3.C0848c;
import c3.C0849d;
import com.skydoves.balloon.internals.DefinitionKt;
import e3.AbstractC1926b;
import e3.AbstractC1927c;
import e3.C1928d;
import e3.C1936l;
import e3.C1937m;
import e3.C1941q;
import f3.C2201g;
import f3.InterfaceC2198d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import of.C5359n;
import pg.AbstractC5941v;
import s4.C6755k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a */
    public static final C0174b f7748a = new C0174b(5);

    /* renamed from: b */
    public static Method f7749b;

    /* renamed from: c */
    public static Method f7750c;

    /* renamed from: d */
    public static boolean f7751d;

    /* renamed from: a */
    public static final C1549c m5129a(C1552f c1552f) {
        Canvas canvas = AbstractC1550d.f7737a;
        C1549c c1549c = new C1549c();
        c1549c.f7733a = new Canvas(AbstractC1553g.m5123a(c1552f));
        return c1549c;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m5130b(float r21, float r22, float r23, float r24, e3.AbstractC1927c r25) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.h0.m5130b(float, float, float, float, e3.c):long");
    }

    /* renamed from: c */
    public static final long m5131c(int i10) {
        long j6 = i10 << 32;
        int i11 = C1565s.f7818k;
        return j6;
    }

    /* renamed from: d */
    public static final long m5132d(long j6) {
        long j10 = j6 << 32;
        int i10 = C1565s.f7818k;
        return j10;
    }

    /* renamed from: e */
    public static long m5133e(int i10, int i11, int i12) {
        return m5131c(((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255));
    }

    /* renamed from: f */
    public static C1552f m5134f(int i10, int i11, int i12) {
        Bitmap bitmapCreateBitmap;
        C1941q c1941q = C1928d.f9107e;
        Bitmap.Config configM5125c = AbstractC1553g.m5125c(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = AbstractC1553g.m5124b(i10, i11, i12, c1941q);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configM5125c);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new C1552f(bitmapCreateBitmap);
    }

    /* renamed from: g */
    public static final C5359n m5135g() {
        return new C5359n(new Paint(7));
    }

    /* renamed from: h */
    public static final long m5136h(float f6, float f10) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        int i10 = p0.f7806c;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m5137i(float r17, float r18, float r19, float r20, e3.AbstractC1927c r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.h0.m5137i(float, float, float, float, e3.c):long");
    }

    /* renamed from: j */
    public static final long m5138j(long j6, long j10) {
        float f6;
        float f10;
        long jM5185a = C1565s.m5185a(j6, C1565s.m5190f(j10));
        float fM5188d = C1565s.m5188d(j10);
        float fM5188d2 = C1565s.m5188d(jM5185a);
        float f11 = 1.0f - fM5188d2;
        float f12 = (fM5188d * f11) + fM5188d2;
        float fM5192h = C1565s.m5192h(jM5185a);
        float fM5192h2 = C1565s.m5192h(j10);
        float f13 = DefinitionKt.NO_Float_VALUE;
        if (f12 == DefinitionKt.NO_Float_VALUE) {
            f6 = 0.0f;
        } else {
            f6 = (((fM5192h2 * fM5188d) * f11) + (fM5192h * fM5188d2)) / f12;
        }
        float fM5191g = C1565s.m5191g(jM5185a);
        float fM5191g2 = C1565s.m5191g(j10);
        if (f12 == DefinitionKt.NO_Float_VALUE) {
            f10 = 0.0f;
        } else {
            f10 = (((fM5191g2 * fM5188d) * f11) + (fM5191g * fM5188d2)) / f12;
        }
        float fM5189e = C1565s.m5189e(jM5185a);
        float fM5189e2 = C1565s.m5189e(j10);
        if (f12 != DefinitionKt.NO_Float_VALUE) {
            f13 = (((fM5189e2 * fM5188d) * f11) + (fM5189e * fM5188d2)) / f12;
        }
        return m5137i(f6, f10, f13, f12, C1565s.m5190f(j10));
    }

    /* renamed from: k */
    public static void m5139k(InterfaceC2198d interfaceC2198d, h0 h0Var, long j6) {
        if (h0Var instanceof d0) {
            C0848c c0848c = ((d0) h0Var).f7738e;
            float f6 = c0848c.f5354a;
            float f10 = c0848c.f5355b;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
            float f11 = c0848c.f5356c - c0848c.f5354a;
            float f12 = c0848c.f5357d - c0848c.f5355b;
            interfaceC2198d.mo5905o(j6, jFloatToRawIntBits, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), 1.0f, null, 3);
            return;
        }
        boolean z6 = h0Var instanceof e0;
        C2201g c2201g = C2201g.f10129a;
        if (!z6) {
            if (!(h0Var instanceof c0)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC2198d.mo5903g(((c0) h0Var).f7736e, j6, 1.0f, c2201g);
            return;
        }
        e0 e0Var = (e0) h0Var;
        C1555i c1555i = e0Var.f7744f;
        if (c1555i != null) {
            interfaceC2198d.mo5903g(c1555i, j6, 1.0f, c2201g);
            return;
        }
        C0849d c0849d = e0Var.f7743e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0849d.f5365h >> 32));
        float f13 = c0849d.f5358a;
        float f14 = c0849d.f5359b;
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
        float fM2289b = c0849d.m2289b();
        float fM2288a = c0849d.m2288a();
        interfaceC2198d.p0(j6, jFloatToRawIntBits2, (Float.floatToRawIntBits(fM2289b) << 32) | (Float.floatToRawIntBits(fM2288a) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), c2201g, 3);
    }

    /* renamed from: l */
    public static void m5140l(Canvas canvas, boolean z6) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            AbstractC1548b.m5089a(canvas, z6);
            return;
        }
        if (!f7751d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f7749b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f7750c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f7749b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f7750c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f7749b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f7750c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f7751d = true;
        }
        if (z6) {
            try {
                Method method4 = f7749b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z6 || (method = f7750c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* renamed from: m */
    public static final boolean m5141m(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == DefinitionKt.NO_Float_VALUE && fArr[2] == DefinitionKt.NO_Float_VALUE && fArr[3] == DefinitionKt.NO_Float_VALUE && fArr[4] == DefinitionKt.NO_Float_VALUE && fArr[5] == 1.0f && fArr[6] == DefinitionKt.NO_Float_VALUE && fArr[7] == DefinitionKt.NO_Float_VALUE && fArr[8] == DefinitionKt.NO_Float_VALUE && fArr[9] == DefinitionKt.NO_Float_VALUE && fArr[10] == 1.0f && fArr[11] == DefinitionKt.NO_Float_VALUE && fArr[12] == DefinitionKt.NO_Float_VALUE && fArr[13] == DefinitionKt.NO_Float_VALUE && fArr[14] == DefinitionKt.NO_Float_VALUE && fArr[15] == 1.0f;
    }

    /* renamed from: n */
    public static final long m5142n(long j6, long j10, float f6) {
        C1936l c1936l = C1928d.f9126x;
        long jM5185a = C1565s.m5185a(j6, c1936l);
        long jM5185a2 = C1565s.m5185a(j10, c1936l);
        float fM5188d = C1565s.m5188d(jM5185a);
        float fM5192h = C1565s.m5192h(jM5185a);
        float fM5191g = C1565s.m5191g(jM5185a);
        float fM5189e = C1565s.m5189e(jM5185a);
        float fM5188d2 = C1565s.m5188d(jM5185a2);
        float fM5192h2 = C1565s.m5192h(jM5185a2);
        float fM5191g2 = C1565s.m5191g(jM5185a2);
        float fM5189e2 = C1565s.m5189e(jM5185a2);
        if (f6 < DefinitionKt.NO_Float_VALUE) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        return C1565s.m5185a(m5137i(AbstractC5941v.m11891e(fM5192h, fM5192h2, f6), AbstractC5941v.m11891e(fM5191g, fM5191g2, f6), AbstractC5941v.m11891e(fM5189e, fM5189e2, f6), AbstractC5941v.m11891e(fM5188d, fM5188d2, f6), c1936l), C1565s.m5190f(j10));
    }

    /* renamed from: o */
    public static final float m5143o(long j6) {
        AbstractC1927c abstractC1927cM5190f = C1565s.m5190f(j6);
        if (!AbstractC1926b.m5671a(abstractC1927cM5190f.f9101b, AbstractC1926b.f9095a)) {
            a0.m5088a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC1926b.m5672b(abstractC1927cM5190f.f9101b)));
        }
        C1937m c1937m = ((C1941q) abstractC1927cM5190f).f9167p;
        double dMo5263a = c1937m.mo5263a(C1565s.m5192h(j6));
        float fMo5263a = (float) ((c1937m.mo5263a(C1565s.m5189e(j6)) * 0.0722d) + (c1937m.mo5263a(C1565s.m5191g(j6)) * 0.7152d) + (dMo5263a * 0.2126d));
        if (fMo5263a < DefinitionKt.NO_Float_VALUE) {
            fMo5263a = 0.0f;
        }
        if (fMo5263a > 1.0f) {
            return 1.0f;
        }
        return fMo5263a;
    }

    /* renamed from: p */
    public static final void m5144p(Matrix matrix, float[] fArr) {
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[15];
        fArr[0] = f6;
        fArr[1] = f13;
        fArr[2] = f18;
        fArr[3] = f10;
        fArr[4] = f14;
        fArr[5] = f19;
        fArr[6] = f12;
        fArr[7] = f16;
        fArr[8] = f20;
        matrix.setValues(fArr);
        fArr[0] = f6;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
        fArr[8] = f17;
    }

    /* renamed from: q */
    public static final void m5145q(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        fArr[0] = f6;
        fArr[1] = f12;
        fArr[2] = 0.0f;
        fArr[3] = f15;
        fArr[4] = f10;
        fArr[5] = f13;
        fArr[6] = 0.0f;
        fArr[7] = f16;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f11;
        fArr[13] = f14;
        fArr[14] = 0.0f;
        fArr[15] = f17;
    }

    /* renamed from: r */
    public static final Rect m5146r(C0848c c0848c) {
        return new Rect((int) c0848c.f5354a, (int) c0848c.f5355b, (int) c0848c.f5356c, (int) c0848c.f5357d);
    }

    /* renamed from: s */
    public static final Rect m5147s(C6755k c6755k) {
        return new Rect(c6755k.f32206a, c6755k.f32207b, c6755k.f32208c, c6755k.f32209d);
    }

    /* renamed from: t */
    public static final RectF m5148t(C0848c c0848c) {
        return new RectF(c0848c.f5354a, c0848c.f5355b, c0848c.f5356c, c0848c.f5357d);
    }

    /* renamed from: u */
    public static final int m5149u(long j6) {
        float[] fArr = C1928d.f9103a;
        return (int) (C1565s.m5185a(j6, C1928d.f9107e) >>> 32);
    }

    /* renamed from: v */
    public static final C0848c m5150v(Rect rect) {
        return new C0848c(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: w */
    public static final C0848c m5151w(RectF rectF) {
        return new C0848c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: x */
    public static final int m5152x(float f6, float[] fArr, int i10) {
        float f10 = DefinitionKt.NO_Float_VALUE;
        if (f6 >= DefinitionKt.NO_Float_VALUE) {
            f10 = f6;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (Math.abs(f10 - f6) > 1.05E-6f) {
            f10 = Float.NaN;
        }
        fArr[i10] = f10;
        return !Float.isNaN(f10) ? 1 : 0;
    }
}
