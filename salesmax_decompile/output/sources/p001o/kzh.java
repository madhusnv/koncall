package p001o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import p001o.bc7;
import p001o.xb7;

/* loaded from: classes2.dex */
public class kzh extends lzh {
    /* renamed from: i */
    public static int m36377i(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p001o.lzh
    /* renamed from: a */
    public Typeface mo29710a(Context context, xb7.C18100c c18100c, Resources resources, int i) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (xb7.C18101d c18101d : c18100c.m55931a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, c18101d.m55933b()).setWeight(c18101d.m55936e()).setSlant(c18101d.m55937f() ? 1 : 0).setTtcIndex(c18101d.m55934c()).setFontVariationSettings(c18101d.m55935d()).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m36379h(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p001o.lzh
    /* renamed from: b */
    public Typeface mo29711b(Context context, CancellationSignal cancellationSignal, bc7.C12352b[] c12352bArr, int i) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (bc7.C12352b c12352b : c12352bArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c12352b.m18592d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c12352b.m18593e()).setSlant(c12352b.m18594f() ? 1 : 0).setTtcIndex(c12352b.m18591c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m36379h(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p001o.lzh
    /* renamed from: d */
    public Typeface mo32958d(Context context, Resources resources, int i, String str, int i2) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p001o.lzh
    /* renamed from: g */
    public bc7.C12352b mo36378g(bc7.C12352b[] c12352bArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: h */
    public final Font m36379h(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? Constants.FROZEN_FRAME_TIME : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM36377i = m36377i(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM36377i2 = m36377i(fontStyle, font2.getStyle());
            if (iM36377i2 < iM36377i) {
                font = font2;
                iM36377i = iM36377i2;
            }
        }
        return font;
    }
}
