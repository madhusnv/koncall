package p020v;

import android.util.Size;
import i0.C3082m;
import i0.g2;
import i0.w2;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.b */
/* loaded from: classes.dex */
public final class C7592b {

    /* renamed from: a */
    public final String f36475a;

    /* renamed from: b */
    public final Class f36476b;

    /* renamed from: c */
    public final g2 f36477c;

    /* renamed from: d */
    public final w2 f36478d;

    /* renamed from: e */
    public final Size f36479e;

    /* renamed from: f */
    public final C3082m f36480f;

    /* renamed from: g */
    public final List f36481g;

    public C7592b(String str, Class cls, g2 g2Var, w2 w2Var, Size size, C3082m c3082m, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f36475a = str;
        this.f36476b = cls;
        if (g2Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f36477c = g2Var;
        if (w2Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f36478d = w2Var;
        this.f36479e = size;
        this.f36480f = c3082m;
        this.f36481g = arrayList;
    }

    public final boolean equals(Object obj) {
        Size size;
        C3082m c3082m;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7592b) {
            C7592b c7592b = (C7592b) obj;
            List list2 = c7592b.f36481g;
            C3082m c3082m2 = c7592b.f36480f;
            Size size2 = c7592b.f36479e;
            if (this.f36475a.equals(c7592b.f36475a) && this.f36476b.equals(c7592b.f36476b) && this.f36477c.equals(c7592b.f36477c) && this.f36478d.equals(c7592b.f36478d) && ((size = this.f36479e) != null ? size.equals(size2) : size2 == null) && ((c3082m = this.f36480f) != null ? c3082m.equals(c3082m2) : c3082m2 == null) && ((list = this.f36481g) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f36475a.hashCode() ^ 1000003) * 1000003) ^ this.f36476b.hashCode()) * 1000003) ^ this.f36477c.hashCode()) * 1000003) ^ this.f36478d.hashCode()) * 1000003;
        Size size = this.f36479e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        C3082m c3082m = this.f36480f;
        int iHashCode3 = (iHashCode2 ^ (c3082m == null ? 0 : c3082m.hashCode())) * 1000003;
        List list = this.f36481g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UseCaseInfo{useCaseId=");
        sb2.append(this.f36475a);
        sb2.append(", useCaseType=");
        sb2.append(this.f36476b);
        sb2.append(", sessionConfig=");
        sb2.append(this.f36477c);
        sb2.append(", useCaseConfig=");
        sb2.append(this.f36478d);
        sb2.append(", surfaceResolution=");
        sb2.append(this.f36479e);
        sb2.append(", streamSpec=");
        sb2.append(this.f36480f);
        sb2.append(", captureTypes=");
        return AbstractC5601a.m11240k("}", sb2, this.f36481g);
    }
}
