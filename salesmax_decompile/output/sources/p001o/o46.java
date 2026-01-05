package p001o;

import android.content.Context;
import android.graphics.Color;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes3.dex */
public class o46 {

    /* renamed from: f */
    public static final int f37723f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f37724a;

    /* renamed from: b */
    public final int f37725b;

    /* renamed from: c */
    public final int f37726c;

    /* renamed from: d */
    public final int f37727d;

    /* renamed from: e */
    public final float f37728e;

    public o46(Context context) {
        this(ota.m42658b(context, x5e.elevationOverlayEnabled, false), gua.m29503b(context, x5e.elevationOverlayColor, 0), gua.m29503b(context, x5e.elevationOverlayAccentColor, 0), gua.m29503b(context, x5e.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    public float m41512a(float f) {
        if (this.f37728e <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m41513b(int i, float f) {
        int i2;
        float fM41512a = m41512a(f);
        int iAlpha = Color.alpha(i);
        int iM29512k = gua.m29512k(ni3.m40624p(i, Constants.MAX_HOST_LENGTH), this.f37725b, fM41512a);
        if (fM41512a > 0.0f && (i2 = this.f37726c) != 0) {
            iM29512k = gua.m29511j(iM29512k, ni3.m40624p(i2, f37723f));
        }
        return ni3.m40624p(iM29512k, iAlpha);
    }

    /* renamed from: c */
    public int m41514c(int i, float f) {
        return (this.f37724a && m41517f(i)) ? m41513b(i, f) : i;
    }

    /* renamed from: d */
    public int m41515d(float f) {
        return m41514c(this.f37727d, f);
    }

    /* renamed from: e */
    public boolean m41516e() {
        return this.f37724a;
    }

    /* renamed from: f */
    public final boolean m41517f(int i) {
        return ni3.m40624p(i, Constants.MAX_HOST_LENGTH) == this.f37727d;
    }

    public o46(boolean z, int i, int i2, int i3, float f) {
        this.f37724a = z;
        this.f37725b = i;
        this.f37726c = i2;
        this.f37727d = i3;
        this.f37728e = f;
    }
}
