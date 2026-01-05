package d4;

import kotlin.jvm.internal.AbstractC4154l;
import qw.InterfaceC6355e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d4.a */
/* loaded from: classes.dex */
public final class C1573a {

    /* renamed from: a */
    public final String f7825a;

    /* renamed from: b */
    public final InterfaceC6355e f7826b;

    public C1573a(String str, InterfaceC6355e interfaceC6355e) {
        this.f7825a = str;
        this.f7826b = interfaceC6355e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573a)) {
            return false;
        }
        C1573a c1573a = (C1573a) obj;
        return AbstractC4154l.m8918a(this.f7825a, c1573a.f7825a) && AbstractC4154l.m8918a(this.f7826b, c1573a.f7826b);
    }

    public final int hashCode() {
        String str = this.f7825a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC6355e interfaceC6355e = this.f7826b;
        return iHashCode + (interfaceC6355e != null ? interfaceC6355e.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f7825a + ", action=" + this.f7826b + ')';
    }
}
