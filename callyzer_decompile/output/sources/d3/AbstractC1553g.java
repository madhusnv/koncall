package d3;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import e3.AbstractC1927c;
import e3.C1928d;
import e3.C1940p;
import e3.C1941q;
import e3.C1942r;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d3.g */
/* loaded from: classes.dex */
public abstract class AbstractC1553g {
    /* renamed from: a */
    public static final Bitmap m5123a(C1552f c1552f) {
        if (c1552f instanceof C1552f) {
            return c1552f.f7745a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* renamed from: b */
    public static final Bitmap m5124b(int i10, int i11, int i12, AbstractC1927c abstractC1927c) {
        Bitmap.Config config;
        ColorSpace rgb;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace colorSpaceM5195a;
        ColorSpace colorSpace;
        Bitmap.Config configM5125c = m5125c(i12);
        if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9107e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9119q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9120r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9117o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9112j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9111i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9122t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9121s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9113k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9114l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9109g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9110h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9108f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9115m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (AbstractC4154l.m8918a(abstractC1927c, C1928d.f9118p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!AbstractC4154l.m8918a(abstractC1927c, C1928d.f9116n)) {
                if (Build.VERSION.SDK_INT >= 34 && (colorSpaceM5195a = AbstractC1568v.m5195a(abstractC1927c)) != null) {
                    rgb = colorSpaceM5195a;
                    config = configM5125c;
                    return Bitmap.createBitmap((DisplayMetrics) null, i10, i11, config, true, rgb);
                }
                if (abstractC1927c instanceof C1941q) {
                    String str = abstractC1927c.f9100a;
                    C1941q c1941q = (C1941q) abstractC1927c;
                    float[] fArrM5692a = c1941q.f9155d.m5692a();
                    C1942r c1942r = c1941q.f9158g;
                    if (c1942r != null) {
                        config = configM5125c;
                        transferParameters = new ColorSpace.Rgb.TransferParameters(c1942r.f9170b, c1942r.f9171c, c1942r.f9172d, c1942r.f9173e, c1942r.f9174f, c1942r.f9175g, c1942r.f9169a);
                    } else {
                        config = configM5125c;
                        transferParameters = null;
                    }
                    if (transferParameters != null) {
                        rgb = new ColorSpace.Rgb(str, c1941q.f9159h, fArrM5692a, transferParameters);
                    } else {
                        float[] fArr = c1941q.f9159h;
                        final C1940p c1940p = c1941q.f9163l;
                        final int i13 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: d3.u
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d2) {
                                switch (i13) {
                                }
                                return ((Number) c1940p.invoke(Double.valueOf(d2))).doubleValue();
                            }
                        };
                        final C1940p c1940p2 = c1941q.f9166o;
                        final int i14 = 1;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrM5692a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: d3.u
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d2) {
                                switch (i14) {
                                }
                                return ((Number) c1940p2.invoke(Double.valueOf(d2))).doubleValue();
                            }
                        }, c1941q.f9156e, c1941q.f9157f);
                    }
                } else {
                    config = configM5125c;
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i10, i11, config, true, rgb);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb = colorSpace;
        config = configM5125c;
        return Bitmap.createBitmap((DisplayMetrics) null, i10, i11, config, true, rgb);
    }

    /* renamed from: c */
    public static final Bitmap.Config m5125c(int i10) {
        if (i10 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i10 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i10 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 26 || i10 != 3) ? (i11 < 26 || i10 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    /* renamed from: d */
    public static final int m5126d(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i10 < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
