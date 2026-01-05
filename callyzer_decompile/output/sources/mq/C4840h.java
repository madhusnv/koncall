package mq;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.h */
/* loaded from: classes3.dex */
public final class C4840h extends AbstractC4854v {

    /* renamed from: a */
    public final int f24251a;

    /* renamed from: b */
    public final String f24252b;

    public C4840h(int i10, String simNumber) {
        AbstractC4154l.m8923f(simNumber, "simNumber");
        this.f24251a = i10;
        this.f24252b = simNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4840h)) {
            return false;
        }
        C4840h c4840h = (C4840h) obj;
        return this.f24251a == c4840h.f24251a && AbstractC4154l.m8918a(this.f24252b, c4840h.f24252b);
    }

    public final int hashCode() {
        return this.f24252b.hashCode() + (Integer.hashCode(this.f24251a) * 31);
    }

    public final String toString() {
        return "NoteEdit(id=" + this.f24251a + ", simNumber=" + this.f24252b + ")";
    }
}
