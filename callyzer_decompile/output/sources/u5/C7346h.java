package u5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import pg.AbstractC5942w;
import t5.C7047e;
import t5.C7048f;
import y5.C8561g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u5.h */
/* loaded from: classes.dex */
public final class C7346h extends AbstractC5942w {
    /* renamed from: g */
    public static Font m13750g(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM13752i = m13752i(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iM13752i2 = m13752i(fontStyle, font2.getStyle());
            if (iM13752i2 < iM13752i) {
                font = font2;
                iM13752i = iM13752i2;
            }
        }
        return font;
    }

    /* renamed from: h */
    public static FontFamily m13751h(C8561g[] c8561gArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (C8561g c8561g : c8561gArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c8561g.f41554a, "r", null);
            } catch (IOException unused) {
                continue;
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c8561g.f41556c).setSlant(c8561g.f41557d ? 1 : 0).setTtcIndex(c8561g.f41555b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* renamed from: i */
    public static int m13752i(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // pg.AbstractC5942w
    /* renamed from: a */
    public final Typeface mo11899a(Context context, C7047e c7047e, Resources resources, int i10) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (C7048f c7048f : c7047e.f34071a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c7048f.f34077f).setWeight(c7048f.f34073b).setSlant(c7048f.f34074c ? 1 : 0).setTtcIndex(c7048f.f34076e).setFontVariationSettings(c7048f.f34075d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m13750g(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // pg.AbstractC5942w
    /* renamed from: b */
    public final Typeface mo11900b(Context context, C8561g[] c8561gArr, int i10) {
        try {
            FontFamily fontFamilyM13751h = m13751h(c8561gArr, context.getContentResolver());
            if (fontFamilyM13751h == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM13751h).setStyle(m13750g(fontFamilyM13751h, i10).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // pg.AbstractC5942w
    /* renamed from: c */
    public final Typeface mo11901c(Context context, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM13751h = m13751h((C8561g[]) list.get(0), contentResolver);
            if (fontFamilyM13751h == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM13751h);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyM13751h2 = m13751h((C8561g[]) list.get(i11), contentResolver);
                if (fontFamilyM13751h2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM13751h2);
                }
            }
            return customFallbackBuilder.setStyle(m13750g(fontFamilyM13751h, i10).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // pg.AbstractC5942w
    /* renamed from: d */
    public final Typeface mo11902d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // pg.AbstractC5942w
    /* renamed from: e */
    public final Typeface mo11903e(Context context, Resources resources, int i10, String str, int i11) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // pg.AbstractC5942w
    /* renamed from: f */
    public final C8561g mo11904f(C8561g[] c8561gArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
