package r4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.t */
/* loaded from: classes.dex */
public final class C6465t {

    /* renamed from: c */
    public static final C6465t f31131c = new C6465t(2, false);

    /* renamed from: d */
    public static final C6465t f31132d = new C6465t(1, true);

    /* renamed from: a */
    public final int f31133a;

    /* renamed from: b */
    public final boolean f31134b;

    public C6465t(int i10, boolean z6) {
        this.f31133a = i10;
        this.f31134b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6465t)) {
            return false;
        }
        C6465t c6465t = (C6465t) obj;
        return this.f31133a == c6465t.f31133a && this.f31134b == c6465t.f31134b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31134b) + (Integer.hashCode(this.f31133a) * 31);
    }

    public final String toString() {
        return equals(f31131c) ? "TextMotion.Static" : equals(f31132d) ? "TextMotion.Animated" : "Invalid";
    }
}
