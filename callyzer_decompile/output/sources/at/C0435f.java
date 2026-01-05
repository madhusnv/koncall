package at;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: at.f */
/* loaded from: classes3.dex */
public final class C0435f {

    /* renamed from: a */
    public final boolean f3199a;

    /* renamed from: b */
    public final String f3200b;

    /* renamed from: c */
    public final String f3201c;

    /* renamed from: d */
    public final boolean f3202d;

    /* renamed from: e */
    public final String f3203e;

    public C0435f(boolean z6, String str, String str2, boolean z10, String route, int i10) {
        str2 = (i10 & 4) != 0 ? "" : str2;
        z10 = (i10 & 8) != 0 ? false : z10;
        route = (i10 & 16) != 0 ? "" : route;
        AbstractC4154l.m8923f(route, "route");
        this.f3199a = z6;
        this.f3200b = str;
        this.f3201c = str2;
        this.f3202d = z10;
        this.f3203e = route;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0435f)) {
            return false;
        }
        C0435f c0435f = (C0435f) obj;
        return this.f3199a == c0435f.f3199a && AbstractC4154l.m8918a(this.f3200b, c0435f.f3200b) && AbstractC4154l.m8918a(this.f3201c, c0435f.f3201c) && this.f3202d == c0435f.f3202d && AbstractC4154l.m8918a(this.f3203e, c0435f.f3203e);
    }

    public final int hashCode() {
        return this.f3203e.hashCode() + AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC0030c.m113d(Boolean.hashCode(this.f3199a) * 31, 31, this.f3200b), 31, this.f3201c), 31, this.f3202d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToastData(isExecute=");
        sb2.append(this.f3199a);
        sb2.append(", toast=");
        sb2.append(this.f3200b);
        sb2.append(", failedToast=");
        AbstractC4801l.m9749w(sb2, this.f3201c, ", isNavigate=", this.f3202d, ", route=");
        return AbstractC1452a.m4564k(sb2, this.f3203e, ")");
    }
}
