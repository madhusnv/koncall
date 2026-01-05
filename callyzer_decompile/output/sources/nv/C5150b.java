package nv;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nv.b */
/* loaded from: classes3.dex */
public final class C5150b {

    /* renamed from: a */
    public final List f25218a;

    /* renamed from: b */
    public final boolean f25219b;

    public C5150b(List permissionList, boolean z6) {
        AbstractC4154l.m8923f(permissionList, "permissionList");
        this.f25218a = permissionList;
        this.f25219b = z6;
    }

    /* renamed from: a */
    public static C5150b m10058a(C5150b c5150b, List permissionList, int i10) {
        if ((i10 & 1) != 0) {
            permissionList = c5150b.f25218a;
        }
        boolean z6 = (i10 & 2) != 0 ? c5150b.f25219b : true;
        c5150b.getClass();
        AbstractC4154l.m8923f(permissionList, "permissionList");
        return new C5150b(permissionList, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5150b)) {
            return false;
        }
        C5150b c5150b = (C5150b) obj;
        return AbstractC4154l.m8918a(this.f25218a, c5150b.f25218a) && this.f25219b == c5150b.f25219b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25219b) + (this.f25218a.hashCode() * 31);
    }

    public final String toString() {
        return "PermissionState(permissionList=" + this.f25218a + ", isPermissionLoading=" + this.f25219b + ")";
    }
}
