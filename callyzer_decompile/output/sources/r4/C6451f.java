package r4;

import com.skydoves.balloon.internals.DefinitionKt;
import m4.AbstractC4646a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.f */
/* loaded from: classes.dex */
public final class C6451f {

    /* renamed from: b */
    public static final float f31107b;

    /* renamed from: c */
    public static final float f31108c;

    /* renamed from: d */
    public static final float f31109d;

    /* renamed from: a */
    public final float f31110a;

    static {
        m12442a(DefinitionKt.NO_Float_VALUE);
        m12442a(0.5f);
        f31107b = 0.5f;
        m12442a(-1.0f);
        f31108c = -1.0f;
        m12442a(1.0f);
        f31109d = 1.0f;
    }

    /* renamed from: a */
    public static void m12442a(float f6) {
        if ((DefinitionKt.NO_Float_VALUE > f6 || f6 > 1.0f) && f6 != -1.0f) {
            AbstractC4646a.m9526b("topRatio should be in [0..1] range or -1");
        }
    }

    /* renamed from: b */
    public static String m12443b(float f6) {
        if (f6 == DefinitionKt.NO_Float_VALUE) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f6 == f31107b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f6 == f31108c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f6 == f31109d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f6 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6451f) {
            return Float.compare(this.f31110a, ((C6451f) obj).f31110a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31110a);
    }

    public final String toString() {
        return m12443b(this.f31110a);
    }
}
