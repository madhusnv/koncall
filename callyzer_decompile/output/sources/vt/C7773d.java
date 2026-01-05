package vt;

import kotlin.jvm.internal.AbstractC4154l;
import um.C7474a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vt.d */
/* loaded from: classes3.dex */
public final class C7773d extends AbstractC7777h {

    /* renamed from: a */
    public final C7474a f37436a;

    public C7773d(C7474a c7474a) {
        this.f37436a = c7474a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7773d) && AbstractC4154l.m8918a(this.f37436a, ((C7773d) obj).f37436a);
    }

    public final int hashCode() {
        return this.f37436a.hashCode();
    }

    public final String toString() {
        return "ExtensionConnected(responseData=" + this.f37436a + ")";
    }
}
