package mq;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.o */
/* loaded from: classes3.dex */
public final class C4847o extends AbstractC4854v {

    /* renamed from: a */
    public final int f24306a;

    /* renamed from: b */
    public final Context f24307b;

    public C4847o(Context context, int i10) {
        AbstractC4154l.m8923f(context, "context");
        this.f24306a = i10;
        this.f24307b = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4847o)) {
            return false;
        }
        C4847o c4847o = (C4847o) obj;
        return this.f24306a == c4847o.f24306a && AbstractC4154l.m8918a(this.f24307b, c4847o.f24307b);
    }

    public final int hashCode() {
        return this.f24307b.hashCode() + (Integer.hashCode(this.f24306a) * 31);
    }

    public final String toString() {
        return "OnShareRequestForId(callLogId=" + this.f24306a + ", context=" + this.f24307b + ")";
    }
}
