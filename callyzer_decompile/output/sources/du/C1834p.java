package du;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: du.p */
/* loaded from: classes3.dex */
public final class C1834p extends AbstractC1839u {

    /* renamed from: a */
    public final Context f8811a;

    /* renamed from: b */
    public final String f8812b;

    public C1834p(Context context, String msg) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(msg, "msg");
        this.f8811a = context;
        this.f8812b = msg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1834p)) {
            return false;
        }
        C1834p c1834p = (C1834p) obj;
        return AbstractC4154l.m8918a(this.f8811a, c1834p.f8811a) && AbstractC4154l.m8918a(this.f8812b, c1834p.f8812b);
    }

    public final int hashCode() {
        return this.f8812b.hashCode() + (((this.f8811a.hashCode() * 31) - 1852268635) * 31);
    }

    public final String toString() {
        return "OnTraceLog(context=" + this.f8811a + ", tag=MainScreen, msg=" + this.f8812b + ")";
    }
}
