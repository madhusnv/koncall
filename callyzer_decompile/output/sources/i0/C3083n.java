package i0;

import android.util.Size;
import java.util.HashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i0.n */
/* loaded from: classes.dex */
public final class C3083n {

    /* renamed from: a */
    public final Size f16529a;

    /* renamed from: b */
    public final HashMap f16530b;

    /* renamed from: c */
    public final Size f16531c;

    /* renamed from: d */
    public final HashMap f16532d;

    /* renamed from: e */
    public final Size f16533e;

    /* renamed from: f */
    public final HashMap f16534f;

    /* renamed from: g */
    public final HashMap f16535g;

    /* renamed from: h */
    public final HashMap f16536h;

    /* renamed from: i */
    public final HashMap f16537i;

    public C3083n(Size size, HashMap map, Size size2, HashMap map2, Size size3, HashMap map3, HashMap map4, HashMap map5, HashMap map6) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f16529a = size;
        this.f16530b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f16531c = size2;
        this.f16532d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f16533e = size3;
        this.f16534f = map3;
        this.f16535g = map4;
        this.f16536h = map5;
        this.f16537i = map6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3083n)) {
            return false;
        }
        C3083n c3083n = (C3083n) obj;
        return this.f16529a.equals(c3083n.f16529a) && this.f16530b.equals(c3083n.f16530b) && this.f16531c.equals(c3083n.f16531c) && this.f16532d.equals(c3083n.f16532d) && this.f16533e.equals(c3083n.f16533e) && this.f16534f.equals(c3083n.f16534f) && this.f16535g.equals(c3083n.f16535g) && this.f16536h.equals(c3083n.f16536h) && this.f16537i.equals(c3083n.f16537i);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f16529a.hashCode() ^ 1000003) * 1000003) ^ this.f16530b.hashCode()) * 1000003) ^ this.f16531c.hashCode()) * 1000003) ^ this.f16532d.hashCode()) * 1000003) ^ this.f16533e.hashCode()) * 1000003) ^ this.f16534f.hashCode()) * 1000003) ^ this.f16535g.hashCode()) * 1000003) ^ this.f16536h.hashCode()) * 1000003) ^ this.f16537i.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f16529a + ", s720pSizeMap=" + this.f16530b + ", previewSize=" + this.f16531c + ", s1440pSizeMap=" + this.f16532d + ", recordSize=" + this.f16533e + ", maximumSizeMap=" + this.f16534f + ", maximum4x3SizeMap=" + this.f16535g + ", maximum16x9SizeMap=" + this.f16536h + ", ultraMaximumSizeMap=" + this.f16537i + "}";
    }
}
