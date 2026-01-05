package ss;

import kotlin.jvm.internal.AbstractC4154l;
import vu.C7788a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.j */
/* loaded from: classes3.dex */
public final class C6921j extends a0 {

    /* renamed from: a */
    public final C7788a f33447a;

    public C6921j(C7788a versionStateAsInfo) {
        AbstractC4154l.m8923f(versionStateAsInfo, "versionStateAsInfo");
        this.f33447a = versionStateAsInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6921j) && AbstractC4154l.m8918a(this.f33447a, ((C6921j) obj).f33447a);
    }

    public final int hashCode() {
        return this.f33447a.hashCode();
    }

    public final String toString() {
        return "OnCheckingAppVersionInfo(versionStateAsInfo=" + this.f33447a + ")";
    }
}
