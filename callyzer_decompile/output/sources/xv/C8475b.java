package xv;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xv.b */
/* loaded from: classes3.dex */
public final class C8475b {

    /* renamed from: a */
    public final boolean f41293a;

    /* renamed from: b */
    public final List f41294b;

    public C8475b(List list, boolean z6) {
        this.f41293a = z6;
        this.f41294b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8475b)) {
            return false;
        }
        C8475b c8475b = (C8475b) obj;
        return this.f41293a == c8475b.f41293a && AbstractC4154l.m8918a(this.f41294b, c8475b.f41294b);
    }

    public final int hashCode() {
        return this.f41294b.hashCode() + (Boolean.hashCode(this.f41293a) * 31);
    }

    public final String toString() {
        return "PermissionData(isPermissionGranted=" + this.f41293a + ", permission=" + this.f41294b + ")";
    }
}
