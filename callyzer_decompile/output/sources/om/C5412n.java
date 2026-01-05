package om;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.n */
/* loaded from: classes3.dex */
public final class C5412n {

    /* renamed from: a */
    public final LocalDateTime f27176a;

    /* renamed from: b */
    public final EnumC8994d f27177b;

    /* renamed from: c */
    public final int f27178c;

    public C5412n(LocalDateTime localDateTime, EnumC8994d enumC8994d, int i10) {
        this.f27176a = localDateTime;
        this.f27177b = enumC8994d;
        this.f27178c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5412n)) {
            return false;
        }
        C5412n c5412n = (C5412n) obj;
        return AbstractC4154l.m8918a(this.f27176a, c5412n.f27176a) && this.f27177b == c5412n.f27177b && this.f27178c == c5412n.f27178c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27178c) + ((this.f27177b.hashCode() + (this.f27176a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NeverAttendCallHistory(dateTime=");
        sb2.append(this.f27176a);
        sb2.append(", callType=");
        sb2.append(this.f27177b);
        sb2.append(", simSlot=");
        return AbstractC5601a.m11233d(this.f27178c, ")", sb2);
    }
}
