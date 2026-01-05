package i0;

import android.util.Range;
import android.util.Size;
import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i0.e */
/* loaded from: classes.dex */
public final class C3074e {

    /* renamed from: a */
    public final p2 f16443a;

    /* renamed from: b */
    public final int f16444b;

    /* renamed from: c */
    public final Size f16445c;

    /* renamed from: d */
    public final c0.a0 f16446d;

    /* renamed from: e */
    public final List f16447e;

    /* renamed from: f */
    public final s0 f16448f;

    /* renamed from: g */
    public final int f16449g;

    /* renamed from: h */
    public final Range f16450h;

    /* renamed from: i */
    public final boolean f16451i;

    public C3074e(p2 p2Var, int i10, Size size, c0.a0 a0Var, List list, s0 s0Var, int i11, Range range, boolean z6) {
        this.f16443a = p2Var;
        this.f16444b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f16445c = size;
        if (a0Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f16446d = a0Var;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f16447e = list;
        this.f16448f = s0Var;
        this.f16449g = i11;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.f16450h = range;
        this.f16451i = z6;
    }

    public final boolean equals(Object obj) {
        s0 s0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3074e) {
            C3074e c3074e = (C3074e) obj;
            s0 s0Var2 = c3074e.f16448f;
            if (this.f16443a.equals(c3074e.f16443a) && this.f16444b == c3074e.f16444b && this.f16445c.equals(c3074e.f16445c) && this.f16446d.equals(c3074e.f16446d) && this.f16447e.equals(c3074e.f16447e) && ((s0Var = this.f16448f) != null ? s0Var.equals(s0Var2) : s0Var2 == null) && this.f16449g == c3074e.f16449g && this.f16450h.equals(c3074e.f16450h) && this.f16451i == c3074e.f16451i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f16443a.hashCode() ^ 1000003) * 1000003) ^ this.f16444b) * 1000003) ^ this.f16445c.hashCode()) * 1000003) ^ this.f16446d.hashCode()) * 1000003) ^ this.f16447e.hashCode()) * 1000003;
        s0 s0Var = this.f16448f;
        return ((((((iHashCode ^ (s0Var == null ? 0 : s0Var.hashCode())) * 1000003) ^ this.f16449g) * 1000003) ^ this.f16450h.hashCode()) * 1000003) ^ (this.f16451i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb2.append(this.f16443a);
        sb2.append(", imageFormat=");
        sb2.append(this.f16444b);
        sb2.append(", size=");
        sb2.append(this.f16445c);
        sb2.append(", dynamicRange=");
        sb2.append(this.f16446d);
        sb2.append(", captureTypes=");
        sb2.append(this.f16447e);
        sb2.append(", implementationOptions=");
        sb2.append(this.f16448f);
        sb2.append(", sessionType=");
        sb2.append(this.f16449g);
        sb2.append(", targetFrameRate=");
        sb2.append(this.f16450h);
        sb2.append(", strictFrameRateRequired=");
        return AbstractC5601a.m11242m(sb2, this.f16451i, "}");
    }
}
