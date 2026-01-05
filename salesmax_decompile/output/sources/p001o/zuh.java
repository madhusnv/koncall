package p001o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public abstract class zuh {

    /* renamed from: a */
    public static final Paint f57728a = new Paint(6);

    /* renamed from: b */
    public static final Paint f57729b = new Paint(7);

    /* renamed from: c */
    public static final Paint f57730c;

    /* renamed from: d */
    public static final Set f57731d;

    /* renamed from: e */
    public static final Lock f57732e;

    /* renamed from: o.zuh$a */
    public static final class LockC18712a implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f57731d = hashSet;
        f57732e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new LockC18712a();
        Paint paint = new Paint(7);
        f57730c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m59952a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f57732e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f57728a);
            m59956e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f57732e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m59953b(mi1 mi1Var, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo39089d = mi1Var.mo39089d(i, i2, m59962k(bitmap));
        m59966o(bitmap, bitmapMo39089d);
        m59952a(bitmap, bitmapMo39089d, matrix);
        return bitmapMo39089d;
    }

    /* renamed from: c */
    public static Bitmap m59954c(mi1 mi1Var, Bitmap bitmap, int i, int i2) {
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? m59957f(mi1Var, bitmap, i, i2) : bitmap;
    }

    /* renamed from: d */
    public static Bitmap m59955d(mi1 mi1Var, Bitmap bitmap, int i, int i2) {
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap bitmapM59958g = m59958g(mi1Var, bitmap);
        Bitmap bitmapMo39089d = mi1Var.mo39089d(iMin, iMin, m59959h(bitmap));
        bitmapMo39089d.setHasAlpha(true);
        Lock lock = f57732e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo39089d);
            canvas.drawCircle(f2, f2, f2, f57729b);
            canvas.drawBitmap(bitmapM59958g, (Rect) null, rectF, f57730c);
            m59956e(canvas);
            lock.unlock();
            if (!bitmapM59958g.equals(bitmap)) {
                mi1Var.mo38104c(bitmapM59958g);
            }
            return bitmapMo39089d;
        } catch (Throwable th) {
            f57732e.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public static void m59956e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: f */
    public static Bitmap m59957f(mi1 mi1Var, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            return bitmap;
        }
        Bitmap bitmapMo39089d = mi1Var.mo39089d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m59962k(bitmap));
        m59966o(bitmap, bitmapMo39089d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append("x");
            sb2.append(bitmap.getHeight());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(bitmapMo39089d.getWidth());
            sb3.append("x");
            sb3.append(bitmapMo39089d.getHeight());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(fMin);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m59952a(bitmap, bitmapMo39089d, matrix);
        return bitmapMo39089d;
    }

    /* renamed from: g */
    public static Bitmap m59958g(mi1 mi1Var, Bitmap bitmap) {
        Bitmap.Config configM59959h = m59959h(bitmap);
        if (configM59959h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo39089d = mi1Var.mo39089d(bitmap.getWidth(), bitmap.getHeight(), configM59959h);
        new Canvas(bitmapMo39089d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo39089d;
    }

    /* renamed from: h */
    public static Bitmap.Config m59959h(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m59960i() {
        return f57732e;
    }

    /* renamed from: j */
    public static int m59961j(int i) {
        switch (i) {
            case 3:
            case 4:
                return Opcodes.GETFIELD;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: k */
    public static Bitmap.Config m59962k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: l */
    public static void m59963l(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    /* renamed from: m */
    public static boolean m59964m(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: n */
    public static Bitmap m59965n(mi1 mi1Var, Bitmap bitmap, int i) {
        if (!m59964m(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m59963l(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapMo39089d = mi1Var.mo39089d(Math.round(rectF.width()), Math.round(rectF.height()), m59962k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapMo39089d.setHasAlpha(bitmap.hasAlpha());
        m59952a(bitmap, bitmapMo39089d, matrix);
        return bitmapMo39089d;
    }

    /* renamed from: o */
    public static void m59966o(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
