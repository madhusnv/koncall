package mq;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.p */
/* loaded from: classes3.dex */
public final class C4848p extends AbstractC4854v {

    /* renamed from: a */
    public final String f24309a;

    /* renamed from: b */
    public final boolean f24310b;

    public C4848p(String msg, boolean z6) {
        AbstractC4154l.m8923f(msg, "msg");
        this.f24309a = msg;
        this.f24310b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4848p)) {
            return false;
        }
        C4848p c4848p = (C4848p) obj;
        return AbstractC4154l.m8918a(this.f24309a, c4848p.f24309a) && this.f24310b == c4848p.f24310b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24310b) + AbstractC0030c.m113d(-1481198928, 31, this.f24309a);
    }

    public final String toString() {
        return "OnTraceLogs(tag=FileSelection, msg=" + this.f24309a + ", toFirebase=" + this.f24310b + ")";
    }
}
