package js;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: js.a */
/* loaded from: classes3.dex */
public final class C3845a {

    /* renamed from: a */
    public final String f19801a;

    /* renamed from: b */
    public final String f19802b;

    public C3845a(String str, String str2) {
        this.f19801a = str;
        this.f19802b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3845a)) {
            return false;
        }
        C3845a c3845a = (C3845a) obj;
        return AbstractC4154l.m8918a(this.f19801a, c3845a.f19801a) && AbstractC4154l.m8918a(this.f19802b, c3845a.f19802b);
    }

    public final int hashCode() {
        String str = this.f19801a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19802b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a1.m14333m("DynamicFieldUIModel(name=", this.f19801a, ", value=", this.f19802b, ")");
    }
}
