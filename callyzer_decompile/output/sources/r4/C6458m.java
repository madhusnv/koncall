package r4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.m */
/* loaded from: classes.dex */
public final class C6458m {

    /* renamed from: a */
    public final int f31120a;

    /* renamed from: a */
    public static String m12445a(int i10) {
        return i10 == 1 ? "Ltr" : i10 == 2 ? "Rtl" : i10 == 3 ? "Content" : i10 == 4 ? "ContentOrLtr" : i10 == 5 ? "ContentOrRtl" : i10 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6458m) {
            return this.f31120a == ((C6458m) obj).f31120a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31120a);
    }

    public final String toString() {
        return m12445a(this.f31120a);
    }
}
