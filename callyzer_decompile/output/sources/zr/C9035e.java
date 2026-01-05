package zr;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zr.e */
/* loaded from: classes3.dex */
public final class C9035e {

    /* renamed from: a */
    public final String f43543a;

    /* renamed from: b */
    public final String f43544b;

    public C9035e(String title, String str) {
        AbstractC4154l.m8923f(title, "title");
        this.f43543a = title;
        this.f43544b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9035e)) {
            return false;
        }
        C9035e c9035e = (C9035e) obj;
        return AbstractC4154l.m8918a(this.f43543a, c9035e.f43543a) && AbstractC4154l.m8918a(this.f43544b, c9035e.f43544b);
    }

    public final int hashCode() {
        return this.f43544b.hashCode() + (this.f43543a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("ValidationMessage(title=", this.f43543a, ", msg=", this.f43544b, ")");
    }
}
