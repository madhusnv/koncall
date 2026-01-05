package ss;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.t */
/* loaded from: classes3.dex */
public final class C6931t extends a0 {

    /* renamed from: a */
    public final Context f33491a;

    /* renamed from: b */
    public final String f33492b;

    public C6931t(Context context, String log) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(log, "log");
        this.f33491a = context;
        this.f33492b = log;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6931t)) {
            return false;
        }
        C6931t c6931t = (C6931t) obj;
        return AbstractC4154l.m8918a(this.f33491a, c6931t.f33491a) && AbstractC4154l.m8918a(this.f33492b, c6931t.f33492b);
    }

    public final int hashCode() {
        return this.f33492b.hashCode() + (((this.f33491a.hashCode() * 31) - 1852268635) * 31);
    }

    public final String toString() {
        return "OnTraceLog(context=" + this.f33491a + ", tag=MainScreen, log=" + this.f33492b + ")";
    }
}
