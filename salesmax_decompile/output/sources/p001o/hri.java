package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes3.dex */
public abstract class hri {

    /* renamed from: a */
    public static final ThreadLocal f27410a = new C14048a();

    /* renamed from: b */
    public static final ThreadLocal f27411b = new C14049b();

    /* renamed from: c */
    public static final ThreadLocal f27412c = new C14050c();

    /* renamed from: d */
    public static final ThreadLocal f27413d = new C14051d();

    /* renamed from: e */
    public static final float f27414e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: f */
    public static float f27415f = -1.0f;

    /* renamed from: o.hri$a */
    public class C14048a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* renamed from: o.hri$b */
    public class C14049b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: o.hri$c */
    public class C14050c extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: o.hri$d */
    public class C14051d extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* renamed from: a */
    public static void m31021a(Path path, float f, float f2, float f3) {
        ve9.m52656a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = (PathMeasure) f27410a.get();
        Path path2 = (Path) f27411b.get();
        Path path3 = (Path) f27412c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            ve9.m52657b("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            ve9.m52657b("applyTrimPathIfNeeded");
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = zeb.m59352g(fMin, length);
            fMax = zeb.m59352g(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = zeb.m59352g(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = zeb.m59352g(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            ve9.m52657b("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        ve9.m52657b("applyTrimPathIfNeeded");
    }

    /* renamed from: b */
    public static void m31022b(Path path, txh txhVar) {
        if (txhVar == null || txhVar.m50756j()) {
            return;
        }
        m31021a(path, ((g37) txhVar.m50754h()).m28012p() / 100.0f, ((g37) txhVar.m50752d()).m28012p() / 100.0f, ((g37) txhVar.m50753f()).m28012p() / 360.0f);
    }

    /* renamed from: c */
    public static void m31023c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m31024d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        return path;
    }

    /* renamed from: e */
    public static float m31025e() {
        if (f27415f == -1.0f) {
            f27415f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f27415f;
    }

    /* renamed from: f */
    public static float m31026f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: g */
    public static float m31027g(Matrix matrix) {
        float[] fArr = (float[]) f27413d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f27414e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* renamed from: h */
    public static boolean m31028h(Matrix matrix) {
        float[] fArr = (float[]) f27413d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    /* renamed from: i */
    public static int m31029i(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    /* renamed from: j */
    public static boolean m31030j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: k */
    public static boolean m31031k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: l */
    public static Bitmap m31032l(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    /* renamed from: m */
    public static void m31033m(Canvas canvas, RectF rectF, Paint paint) {
        m31034n(canvas, rectF, paint, 31);
    }

    /* renamed from: n */
    public static void m31034n(Canvas canvas, RectF rectF, Paint paint, int i) {
        ve9.m52656a("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        ve9.m52657b("Utils#saveLayer");
    }
}
