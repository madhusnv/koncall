package vt;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vt.e */
/* loaded from: classes3.dex */
public final class C7774e extends AbstractC7777h {

    /* renamed from: a */
    public final boolean f37437a;

    /* renamed from: b */
    public final String f37438b;

    public C7774e(boolean z6, String extenSionName) {
        AbstractC4154l.m8923f(extenSionName, "extenSionName");
        this.f37437a = z6;
        this.f37438b = extenSionName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7774e)) {
            return false;
        }
        C7774e c7774e = (C7774e) obj;
        return this.f37437a == c7774e.f37437a && AbstractC4154l.m8918a(this.f37438b, c7774e.f37438b);
    }

    public final int hashCode() {
        return this.f37438b.hashCode() + (Boolean.hashCode(this.f37437a) * 31);
    }

    public final String toString() {
        return "ExtensionDisConnected(isDisconnected=" + this.f37437a + ", extenSionName=" + this.f37438b + ")";
    }
}
