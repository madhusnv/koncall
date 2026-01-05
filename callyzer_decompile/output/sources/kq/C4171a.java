package kq;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kq.a */
/* loaded from: classes3.dex */
public final class C4171a {

    /* renamed from: a */
    public final String f21175a;

    /* renamed from: b */
    public final String f21176b;

    public C4171a(String date, String key) {
        AbstractC4154l.m8923f(date, "date");
        AbstractC4154l.m8923f(key, "key");
        this.f21175a = date;
        this.f21176b = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4171a)) {
            return false;
        }
        C4171a c4171a = (C4171a) obj;
        return AbstractC4154l.m8918a(this.f21175a, c4171a.f21175a) && AbstractC4154l.m8918a(this.f21176b, c4171a.f21176b);
    }

    public final int hashCode() {
        return this.f21176b.hashCode() + (this.f21175a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("CallHistoryDateUIModel(date=", this.f21175a, ", key=", this.f21176b, ")");
    }
}
