package p001o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p001o.mx5;
import p001o.yd8;

/* loaded from: classes5.dex */
public final class sx5 {

    /* renamed from: f */
    public static final mec f46063f = mec.m38833f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", s75.DEFAULT);

    /* renamed from: g */
    public static final mec f46064g = mec.m38832e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h */
    public static final mec f46065h = mx5.f36070h;

    /* renamed from: i */
    public static final mec f46066i;

    /* renamed from: j */
    public static final mec f46067j;

    /* renamed from: k */
    public static final Set f46068k;

    /* renamed from: l */
    public static final InterfaceC16933b f46069l;

    /* renamed from: m */
    public static final Set f46070m;

    /* renamed from: n */
    public static final Queue f46071n;

    /* renamed from: a */
    public final mi1 f46072a;

    /* renamed from: b */
    public final DisplayMetrics f46073b;

    /* renamed from: c */
    public final wo0 f46074c;

    /* renamed from: d */
    public final List f46075d;

    /* renamed from: e */
    public final yw7 f46076e = yw7.m58428b();

    /* renamed from: o.sx5$a */
    public class C16932a implements InterfaceC16933b {
        @Override // p001o.sx5.InterfaceC16933b
        /* renamed from: a */
        public void mo43011a(mi1 mi1Var, Bitmap bitmap) {
        }

        @Override // p001o.sx5.InterfaceC16933b
        /* renamed from: b */
        public void mo43012b() {
        }
    }

    /* renamed from: o.sx5$b */
    public interface InterfaceC16933b {
        /* renamed from: a */
        void mo43011a(mi1 mi1Var, Bitmap bitmap);

        /* renamed from: b */
        void mo43012b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f46066i = mec.m38833f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f46067j = mec.m38833f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f46068k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f46069l = new C16932a();
        f46070m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f46071n = uqi.m51924e(0);
    }

    public sx5(List list, DisplayMetrics displayMetrics, mi1 mi1Var, wo0 wo0Var) {
        this.f46075d = list;
        this.f46073b = (DisplayMetrics) bgd.m18886d(displayMetrics);
        this.f46072a = (mi1) bgd.m18886d(mi1Var);
        this.f46074c = (wo0) bgd.m18886d(wo0Var);
    }

    /* renamed from: a */
    public static int m49044a(double d) {
        return m49058x((d / (r1 / r0)) * m49058x(m49049l(d) * d));
    }

    /* renamed from: c */
    public static void m49045c(ImageHeaderParser.ImageType imageType, yd8 yd8Var, InterfaceC16933b interfaceC16933b, mi1 mi1Var, mx5 mx5Var, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) {
        int i6;
        int i7;
        int iFloor;
        int iFloor2;
        if (i2 <= 0 || i3 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType);
                sb.append(" with target [");
                sb.append(i4);
                sb.append("x");
                sb.append(i5);
                sb.append("]");
                return;
            }
            return;
        }
        if (m49052r(i)) {
            i7 = i2;
            i6 = i3;
        } else {
            i6 = i2;
            i7 = i3;
        }
        float fMo39755b = mx5Var.mo39755b(i6, i7, i4, i5);
        if (fMo39755b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fMo39755b + " from: " + mx5Var + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "]");
        }
        mx5.EnumC15446g enumC15446gMo39754a = mx5Var.mo39754a(i6, i7, i4, i5);
        if (enumC15446gMo39754a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f = i6;
        float f2 = i7;
        int iM49058x = i6 / m49058x(fMo39755b * f);
        int iM49058x2 = i7 / m49058x(fMo39755b * f2);
        mx5.EnumC15446g enumC15446g = mx5.EnumC15446g.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(enumC15446gMo39754a == enumC15446g ? Math.max(iM49058x, iM49058x2) : Math.min(iM49058x, iM49058x2)));
        if (enumC15446gMo39754a == enumC15446g && iMax < 1.0f / fMo39755b) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f / fMin);
            iFloor2 = (int) Math.ceil(f2 / fMin);
            int i8 = iMax / 8;
            if (i8 > 0) {
                iFloor /= i8;
                iFloor2 /= i8;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f3 = iMax;
            iFloor = (int) Math.floor(f / f3);
            iFloor2 = (int) Math.floor(f2 / f3);
        } else if (imageType.isWebp()) {
            float f4 = iMax;
            iFloor = Math.round(f / f4);
            iFloor2 = Math.round(f2 / f4);
        } else if (i6 % iMax == 0 && i7 % iMax == 0) {
            iFloor = i6 / iMax;
            iFloor2 = i7 / iMax;
        } else {
            int[] iArrM49050m = m49050m(yd8Var, options, interfaceC16933b, mi1Var);
            iFloor = iArrM49050m[0];
            iFloor2 = iArrM49050m[1];
        }
        double dMo39755b = mx5Var.mo39755b(iFloor, iFloor2, i4, i5);
        options.inTargetDensity = m49044a(dMo39755b);
        options.inDensity = m49049l(dMo39755b);
        if (m49053s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculate scaling, source: [");
            sb2.append(i2);
            sb2.append("x");
            sb2.append(i3);
            sb2.append("], degreesToRotate: ");
            sb2.append(i);
            sb2.append(", target: [");
            sb2.append(i4);
            sb2.append("x");
            sb2.append(i5);
            sb2.append("], power of two scaled: [");
            sb2.append(iFloor);
            sb2.append("x");
            sb2.append(iFloor2);
            sb2.append("], exact scale factor: ");
            sb2.append(fMo39755b);
            sb2.append(", power of 2 sample size: ");
            sb2.append(iMax);
            sb2.append(", adjusted scale factor: ");
            sb2.append(dMo39755b);
            sb2.append(", target density: ");
            sb2.append(options.inTargetDensity);
            sb2.append(", density: ");
            sb2.append(options.inDensity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m49046i(yd8 yd8Var, BitmapFactory.Options options, InterfaceC16933b interfaceC16933b, mi1 mi1Var) {
        if (!options.inJustDecodeBounds) {
            interfaceC16933b.mo43012b();
            yd8Var.mo57625b();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        zuh.m59960i().lock();
        try {
            try {
                Bitmap bitmapMo57624a = yd8Var.mo57624a(options);
                zuh.m59960i().unlock();
                return bitmapMo57624a;
            } catch (IllegalArgumentException e) {
                IOException iOExceptionM49055u = m49055u(e, i, i2, str, options);
                Log.isLoggable("Downsampler", 3);
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionM49055u;
                }
                try {
                    mi1Var.mo38104c(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapM49046i = m49046i(yd8Var, options, interfaceC16933b, mi1Var);
                    zuh.m59960i().unlock();
                    return bitmapM49046i;
                } catch (IOException unused) {
                    throw iOExceptionM49055u;
                }
            }
        } catch (Throwable th) {
            zuh.m59960i().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, org.eclipse.jdt.core.IAnnotation[]] */
    /* renamed from: j */
    public static String m49047j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + ((int) bitmap.getAnnotations()) + ")");
    }

    /* renamed from: k */
    public static synchronized BitmapFactory.Options m49048k() {
        BitmapFactory.Options options;
        Queue queue = f46071n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            m49057w(options);
        }
        return options;
    }

    /* renamed from: l */
    public static int m49049l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: m */
    public static int[] m49050m(yd8 yd8Var, BitmapFactory.Options options, InterfaceC16933b interfaceC16933b, mi1 mi1Var) {
        options.inJustDecodeBounds = true;
        m49046i(yd8Var, options, interfaceC16933b, mi1Var);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    public static String m49051n(BitmapFactory.Options options) {
        return m49047j(options.inBitmap);
    }

    /* renamed from: r */
    public static boolean m49052r(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: s */
    public static boolean m49053s(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    /* renamed from: t */
    public static void m49054t(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(m49047j(bitmap));
        sb.append(" from [");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(m49051n(options));
        sb.append(" for [");
        sb.append(i3);
        sb.append("x");
        sb.append(i4);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(lja.m37349a(j));
    }

    /* renamed from: u */
    public static IOException m49055u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m49051n(options), illegalArgumentException);
    }

    /* renamed from: v */
    public static void m49056v(BitmapFactory.Options options) {
        m49057w(options);
        Queue queue = f46071n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    public static void m49057w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    public static int m49058x(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: y */
    public static void m49059y(BitmapFactory.Options options, mi1 mi1Var, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = mi1Var.mo39090e(i, i2, config);
    }

    /* renamed from: b */
    public final void m49060b(yd8 yd8Var, s75 s75Var, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        boolean zHasAlpha;
        if (this.f46076e.m58436i(i, i2, options, z, z2)) {
            return;
        }
        if (s75Var == s75.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = yd8Var.mo57627d().hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot determine whether the image has alpha or not from header, format ");
                sb.append(s75Var);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    /* renamed from: d */
    public zne m49061d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, rec recVar) {
        return m49064g(new yd8.C18384c(parcelFileDescriptor, this.f46075d, this.f46074c), i, i2, recVar, f46069l);
    }

    /* renamed from: e */
    public zne m49062e(InputStream inputStream, int i, int i2, rec recVar, InterfaceC16933b interfaceC16933b) {
        return m49064g(new yd8.C18383b(inputStream, this.f46075d, this.f46074c), i, i2, recVar, interfaceC16933b);
    }

    /* renamed from: f */
    public zne m49063f(ByteBuffer byteBuffer, int i, int i2, rec recVar) {
        return m49064g(new yd8.C18382a(byteBuffer, this.f46075d, this.f46074c), i, i2, recVar, f46069l);
    }

    /* renamed from: g */
    public final zne m49064g(yd8 yd8Var, int i, int i2, rec recVar, InterfaceC16933b interfaceC16933b) {
        byte[] bArr = (byte[]) this.f46074c.mo46964c(65536, byte[].class);
        BitmapFactory.Options optionsM49048k = m49048k();
        optionsM49048k.inTempStorage = bArr;
        s75 s75Var = (s75) recVar.m46585c(f46063f);
        mgd mgdVar = (mgd) recVar.m46585c(f46064g);
        mx5 mx5Var = (mx5) recVar.m46585c(mx5.f36070h);
        boolean zBooleanValue = ((Boolean) recVar.m46585c(f46066i)).booleanValue();
        mec mecVar = f46067j;
        try {
            return oi1.m42257d(m49065h(yd8Var, optionsM49048k, mx5Var, s75Var, mgdVar, recVar.m46585c(mecVar) != null && ((Boolean) recVar.m46585c(mecVar)).booleanValue(), i, i2, zBooleanValue, interfaceC16933b), this.f46072a);
        } finally {
            m49056v(optionsM49048k);
            this.f46074c.mo46966e(bArr);
        }
    }

    /* renamed from: h */
    public final Bitmap m49065h(yd8 yd8Var, BitmapFactory.Options options, mx5 mx5Var, s75 s75Var, mgd mgdVar, boolean z, int i, int i2, boolean z2, InterfaceC16933b interfaceC16933b) {
        int i3;
        int i4;
        String str;
        int iRound;
        int iRound2;
        long jM37350b = lja.m37350b();
        int[] iArrM49050m = m49050m(yd8Var, options, interfaceC16933b, this.f46072a);
        boolean z3 = false;
        int i5 = iArrM49050m[0];
        int i6 = iArrM49050m[1];
        String str2 = options.outMimeType;
        boolean z4 = (i5 == -1 || i6 == -1) ? false : z;
        int iMo57626c = yd8Var.mo57626c();
        int iM59961j = zuh.m59961j(iMo57626c);
        boolean zM59964m = zuh.m59964m(iMo57626c);
        if (i == Integer.MIN_VALUE) {
            i3 = i2;
            i4 = m49052r(iM59961j) ? i6 : i5;
        } else {
            i3 = i2;
            i4 = i;
        }
        int i7 = i3 == Integer.MIN_VALUE ? m49052r(iM59961j) ? i5 : i6 : i3;
        ImageHeaderParser.ImageType imageTypeMo57627d = yd8Var.mo57627d();
        m49045c(imageTypeMo57627d, yd8Var, interfaceC16933b, this.f46072a, mx5Var, iM59961j, i5, i6, i4, i7, options);
        m49060b(yd8Var, s75Var, z4, zM59964m, options, i4, i7);
        int i8 = Build.VERSION.SDK_INT;
        int i9 = options.inSampleSize;
        if (m49069z(imageTypeMo57627d)) {
            if (i5 < 0 || i6 < 0 || !z2) {
                float f = m49053s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i10 = options.inSampleSize;
                float f2 = i10;
                int iCeil = (int) Math.ceil(i5 / f2);
                int iCeil2 = (int) Math.ceil(i6 / f2);
                iRound = Math.round(iCeil * f);
                iRound2 = Math.round(iCeil2 * f);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(iRound);
                    sb.append("x");
                    sb.append(iRound2);
                    sb.append("] for source [");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("], sampleSize: ");
                    sb.append(i10);
                    sb.append(", targetDensity: ");
                    sb.append(options.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f);
                }
            } else {
                str = "Downsampler";
                iRound = i4;
                iRound2 = i7;
            }
            if (iRound > 0 && iRound2 > 0) {
                m49059y(options, this.f46072a, iRound, iRound2);
            }
        } else {
            str = "Downsampler";
        }
        if (mgdVar != null) {
            if (i8 >= 28) {
                if (mgdVar == mgd.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) {
                    z3 = true;
                }
                options.inPreferredColorSpace = ColorSpace.get(z3 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i8 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapM49046i = m49046i(yd8Var, options, interfaceC16933b, this.f46072a);
        interfaceC16933b.mo43011a(this.f46072a, bitmapM49046i);
        if (Log.isLoggable(str, 2)) {
            m49054t(i5, i6, str2, options, bitmapM49046i, i, i2, jM37350b);
        }
        if (bitmapM49046i == null) {
            return null;
        }
        bitmapM49046i.setDensity(this.f46073b.densityDpi);
        Bitmap bitmapM59965n = zuh.m59965n(this.f46072a, bitmapM49046i, iMo57626c);
        if (bitmapM49046i.equals(bitmapM59965n)) {
            return bitmapM59965n;
        }
        this.f46072a.mo38104c(bitmapM49046i);
        return bitmapM59965n;
    }

    /* renamed from: o */
    public boolean m49066o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m12699a();
    }

    /* renamed from: p */
    public boolean m49067p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean m49068q(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: z */
    public final boolean m49069z(ImageHeaderParser.ImageType imageType) {
        return true;
    }
}
