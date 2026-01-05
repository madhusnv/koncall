package i0;

import android.util.Range;
import android.util.Size;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i0.m */
/* loaded from: classes.dex */
public final class C3082m {

    /* renamed from: h */
    public static final Range f16521h = new Range(0, 0);

    /* renamed from: a */
    public final Size f16522a;

    /* renamed from: b */
    public final Size f16523b;

    /* renamed from: c */
    public final c0.a0 f16524c;

    /* renamed from: d */
    public final int f16525d;

    /* renamed from: e */
    public final Range f16526e;

    /* renamed from: f */
    public final s0 f16527f;

    /* renamed from: g */
    public final boolean f16528g;

    public C3082m(Size size, Size size2, c0.a0 a0Var, int i10, Range range, s0 s0Var, boolean z6) {
        this.f16522a = size;
        this.f16523b = size2;
        this.f16524c = a0Var;
        this.f16525d = i10;
        this.f16526e = range;
        this.f16527f = s0Var;
        this.f16528g = z6;
    }

    /* renamed from: a */
    public static p013o.i2 m7362a(Size size) {
        p013o.i2 i2Var = new p013o.i2();
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        i2Var.f25538a = size;
        i2Var.f25539b = size;
        i2Var.f25541d = 0;
        Range range = f16521h;
        if (range == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        i2Var.f25542e = range;
        i2Var.f25540c = c0.a0.f5035d;
        i2Var.f25544g = Boolean.FALSE;
        return i2Var;
    }

    /* renamed from: b */
    public final p013o.i2 m7363b() {
        p013o.i2 i2Var = new p013o.i2();
        i2Var.f25538a = this.f16522a;
        i2Var.f25539b = this.f16523b;
        i2Var.f25540c = this.f16524c;
        i2Var.f25541d = Integer.valueOf(this.f16525d);
        i2Var.f25542e = this.f16526e;
        i2Var.f25543f = this.f16527f;
        i2Var.f25544g = Boolean.valueOf(this.f16528g);
        return i2Var;
    }

    public final boolean equals(Object obj) {
        s0 s0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3082m) {
            C3082m c3082m = (C3082m) obj;
            s0 s0Var2 = c3082m.f16527f;
            if (this.f16522a.equals(c3082m.f16522a) && this.f16523b.equals(c3082m.f16523b) && this.f16524c.equals(c3082m.f16524c) && this.f16525d == c3082m.f16525d && this.f16526e.equals(c3082m.f16526e) && ((s0Var = this.f16527f) != null ? s0Var.equals(s0Var2) : s0Var2 == null) && this.f16528g == c3082m.f16528g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f16522a.hashCode() ^ 1000003) * 1000003) ^ this.f16523b.hashCode()) * 1000003) ^ this.f16524c.hashCode()) * 1000003) ^ this.f16525d) * 1000003) ^ this.f16526e.hashCode()) * 1000003;
        s0 s0Var = this.f16527f;
        return ((iHashCode ^ (s0Var == null ? 0 : s0Var.hashCode())) * 1000003) ^ (this.f16528g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StreamSpec{resolution=");
        sb2.append(this.f16522a);
        sb2.append(", originalConfiguredResolution=");
        sb2.append(this.f16523b);
        sb2.append(", dynamicRange=");
        sb2.append(this.f16524c);
        sb2.append(", sessionType=");
        sb2.append(this.f16525d);
        sb2.append(", expectedFrameRateRange=");
        sb2.append(this.f16526e);
        sb2.append(", implementationOptions=");
        sb2.append(this.f16527f);
        sb2.append(", zslDisabled=");
        return AbstractC5601a.m11242m(sb2, this.f16528g, "}");
    }
}
