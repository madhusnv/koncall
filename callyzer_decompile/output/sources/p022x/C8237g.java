package p022x;

import android.os.Build;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.g */
/* loaded from: classes.dex */
public final class C8237g {

    /* renamed from: a */
    public final C8235e f39376a;

    public C8237g(C8235e c8235e) {
        this.f39376a = c8235e;
    }

    /* renamed from: a */
    public static C8237g m15410a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new C8237g(new C8236f(obj)) : new C8237g(new C8235e(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8237g)) {
            return false;
        }
        return this.f39376a.equals(((C8237g) obj).f39376a);
    }

    public final int hashCode() {
        return this.f39376a.hashCode();
    }

    public final String toString() {
        return this.f39376a.toString();
    }
}
