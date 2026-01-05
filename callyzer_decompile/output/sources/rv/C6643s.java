package rv;

import kn.C4130j;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rv.s */
/* loaded from: classes3.dex */
public final class C6643s extends AbstractC6650z {

    /* renamed from: a */
    public final C4130j f31900a;

    /* renamed from: b */
    public final boolean f31901b;

    public C6643s(C4130j simVerificationViaCallLogData, boolean z6) {
        AbstractC4154l.m8923f(simVerificationViaCallLogData, "simVerificationViaCallLogData");
        this.f31900a = simVerificationViaCallLogData;
        this.f31901b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6643s)) {
            return false;
        }
        C6643s c6643s = (C6643s) obj;
        return AbstractC4154l.m8918a(this.f31900a, c6643s.f31900a) && this.f31901b == c6643s.f31901b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31901b) + (this.f31900a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectCallLog(simVerificationViaCallLogData=" + this.f31900a + ", isSelect=" + this.f31901b + ")";
    }
}
