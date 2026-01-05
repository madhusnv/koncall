package mq;

import kotlin.jvm.internal.AbstractC4154l;
import kq.C4181k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.s */
/* loaded from: classes3.dex */
public final class C4851s extends AbstractC4854v {

    /* renamed from: a */
    public final C4181k f24316a;

    public C4851s(C4181k c4181k) {
        this.f24316a = c4181k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4851s) && AbstractC4154l.m8918a(this.f24316a, ((C4851s) obj).f24316a);
    }

    public final int hashCode() {
        C4181k c4181k = this.f24316a;
        if (c4181k == null) {
            return 0;
        }
        return c4181k.hashCode();
    }

    public final String toString() {
        return "SetCallLogData(item=" + this.f24316a + ")";
    }
}
