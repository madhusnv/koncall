package pq;

import kotlin.jvm.internal.AbstractC4154l;
import mm.C4791b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pq.a */
/* loaded from: classes3.dex */
public final class C5996a {

    /* renamed from: a */
    public final String f29312a;

    /* renamed from: b */
    public final C4791b f29313b;

    public C5996a(String str, C4791b callLog) {
        AbstractC4154l.m8923f(callLog, "callLog");
        this.f29312a = str;
        this.f29313b = callLog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5996a)) {
            return false;
        }
        C5996a c5996a = (C5996a) obj;
        return AbstractC4154l.m8918a(this.f29312a, c5996a.f29312a) && AbstractC4154l.m8918a(this.f29313b, c5996a.f29313b);
    }

    public final int hashCode() {
        return this.f29313b.hashCode() + (this.f29312a.hashCode() * 31);
    }

    public final String toString() {
        return "CallLogWithDateModel(date=" + this.f29312a + ", callLog=" + this.f29313b + ")";
    }
}
