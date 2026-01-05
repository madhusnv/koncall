package s0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s0.b */
/* loaded from: classes.dex */
public final class C6698b {

    /* renamed from: a */
    public final UUID f32009a;

    /* renamed from: b */
    public final int f32010b;

    /* renamed from: c */
    public final int f32011c;

    /* renamed from: d */
    public final Rect f32012d;

    /* renamed from: e */
    public final Size f32013e;

    /* renamed from: f */
    public final int f32014f;

    /* renamed from: g */
    public final boolean f32015g;

    public C6698b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z6) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f32009a = uuid;
        this.f32010b = i10;
        this.f32011c = i11;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f32012d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f32013e = size;
        this.f32014f = i12;
        this.f32015g = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6698b)) {
            return false;
        }
        C6698b c6698b = (C6698b) obj;
        return this.f32009a.equals(c6698b.f32009a) && this.f32010b == c6698b.f32010b && this.f32011c == c6698b.f32011c && this.f32012d.equals(c6698b.f32012d) && this.f32013e.equals(c6698b.f32013e) && this.f32014f == c6698b.f32014f && this.f32015g == c6698b.f32015g;
    }

    public final int hashCode() {
        return ((((((((((((((this.f32009a.hashCode() ^ 1000003) * 1000003) ^ this.f32010b) * 1000003) ^ this.f32011c) * 1000003) ^ this.f32012d.hashCode()) * 1000003) ^ this.f32013e.hashCode()) * 1000003) ^ this.f32014f) * 1000003) ^ (this.f32015g ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutConfig{getUuid=");
        sb2.append(this.f32009a);
        sb2.append(", getTargets=");
        sb2.append(this.f32010b);
        sb2.append(", getFormat=");
        sb2.append(this.f32011c);
        sb2.append(", getCropRect=");
        sb2.append(this.f32012d);
        sb2.append(", getSize=");
        sb2.append(this.f32013e);
        sb2.append(", getRotationDegrees=");
        sb2.append(this.f32014f);
        sb2.append(", isMirroring=");
        return AbstractC5601a.m11242m(sb2, this.f32015g, ", shouldRespectInputCropRect=false}");
    }
}
