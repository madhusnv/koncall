package pu;

import kotlin.jvm.internal.AbstractC4154l;
import og.kc;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pu.d */
/* loaded from: classes3.dex */
public final class C6036d extends AbstractC6038f {

    /* renamed from: a */
    public final String f29485a;

    /* renamed from: b */
    public final kc f29486b;

    public C6036d(String str, kc kcVar) {
        this.f29485a = str;
        this.f29486b = kcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6036d)) {
            return false;
        }
        C6036d c6036d = (C6036d) obj;
        return AbstractC4154l.m8918a(this.f29485a, c6036d.f29485a) && AbstractC4154l.m8918a(this.f29486b, c6036d.f29486b);
    }

    public final int hashCode() {
        String str = this.f29485a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        kc kcVar = this.f29486b;
        return iHashCode + (kcVar != null ? kcVar.hashCode() : 0);
    }

    public final String toString() {
        return "Error(message=" + this.f29485a + ", troubleshootErrorAction=" + this.f29486b + ")";
    }
}
