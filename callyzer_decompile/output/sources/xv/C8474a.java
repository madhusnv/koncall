package xv;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xv.a */
/* loaded from: classes3.dex */
public final class C8474a {

    /* renamed from: a */
    public final boolean f41290a;

    /* renamed from: b */
    public final boolean f41291b;

    /* renamed from: c */
    public final String f41292c;

    public C8474a(String str, boolean z6, boolean z10) {
        this.f41290a = z6;
        this.f41291b = z10;
        this.f41292c = str;
    }

    /* renamed from: a */
    public static C8474a m15775a(C8474a c8474a, String str, int i10) {
        boolean z6 = (i10 & 1) != 0 ? c8474a.f41290a : false;
        boolean z10 = (i10 & 2) != 0 ? c8474a.f41291b : true;
        if ((i10 & 4) != 0) {
            str = c8474a.f41292c;
        }
        c8474a.getClass();
        return new C8474a(str, z6, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8474a)) {
            return false;
        }
        C8474a c8474a = (C8474a) obj;
        return this.f41290a == c8474a.f41290a && this.f41291b == c8474a.f41291b && AbstractC4154l.m8918a(this.f41292c, c8474a.f41292c);
    }

    public final int hashCode() {
        return this.f41292c.hashCode() + AbstractC1452a.m4558e(Boolean.hashCode(this.f41290a) * 31, 31, this.f41291b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MainActivityState(isKeepOnSplashScreen=");
        sb2.append(this.f41290a);
        sb2.append(", showAccNumChangeBottomSheet=");
        sb2.append(this.f41291b);
        sb2.append(", startScreen=");
        return AbstractC1452a.m4564k(sb2, this.f41292c, ")");
    }
}
