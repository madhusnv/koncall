package i0;

import a9.C0073l;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i0.k */
/* loaded from: classes.dex */
public final class C3080k {

    /* renamed from: a */
    public final v0 f16501a;

    /* renamed from: b */
    public final List f16502b;

    /* renamed from: c */
    public final int f16503c;

    /* renamed from: d */
    public final int f16504d;

    /* renamed from: e */
    public final c0.a0 f16505e;

    public C3080k(v0 v0Var, List list, int i10, int i11, c0.a0 a0Var) {
        this.f16501a = v0Var;
        this.f16502b = list;
        this.f16503c = i10;
        this.f16504d = i11;
        this.f16505e = a0Var;
    }

    /* renamed from: a */
    public static C0073l m7353a(v0 v0Var) {
        C0073l c0073l = new C0073l();
        if (v0Var == null) {
            throw new NullPointerException("Null surface");
        }
        c0073l.f264a = v0Var;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        c0073l.f265b = list;
        c0073l.f266c = -1;
        c0073l.f267d = -1;
        c0073l.f268e = c0.a0.f5035d;
        return c0073l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3080k)) {
            return false;
        }
        C3080k c3080k = (C3080k) obj;
        return this.f16501a.equals(c3080k.f16501a) && this.f16502b.equals(c3080k.f16502b) && this.f16503c == c3080k.f16503c && this.f16504d == c3080k.f16504d && this.f16505e.equals(c3080k.f16505e);
    }

    public final int hashCode() {
        return ((((((((this.f16501a.hashCode() ^ 1000003) * 1000003) ^ this.f16502b.hashCode()) * (-721379959)) ^ this.f16503c) * 1000003) ^ this.f16504d) * 1000003) ^ this.f16505e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f16501a + ", sharedSurfaces=" + this.f16502b + ", physicalCameraId=null, mirrorMode=" + this.f16503c + ", surfaceGroupId=" + this.f16504d + ", dynamicRange=" + this.f16505e + "}";
    }
}
