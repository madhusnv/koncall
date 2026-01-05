package ms;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ms.c */
/* loaded from: classes3.dex */
public final class C4868c extends AbstractC4871f {

    /* renamed from: a */
    public final int f24377a;

    /* renamed from: b */
    public final String f24378b;

    public C4868c(int i10, String simNumber) {
        AbstractC4154l.m8923f(simNumber, "simNumber");
        this.f24377a = i10;
        this.f24378b = simNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4868c)) {
            return false;
        }
        C4868c c4868c = (C4868c) obj;
        return this.f24377a == c4868c.f24377a && AbstractC4154l.m8918a(this.f24378b, c4868c.f24378b);
    }

    public final int hashCode() {
        return this.f24378b.hashCode() + (Integer.hashCode(this.f24377a) * 31);
    }

    public final String toString() {
        return "EditNotes(id=" + this.f24377a + ", simNumber=" + this.f24378b + ")";
    }
}
