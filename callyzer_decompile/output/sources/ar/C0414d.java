package ar;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ar.d */
/* loaded from: classes3.dex */
public final class C0414d extends AbstractC0427q {

    /* renamed from: a */
    public final int f3131a;

    /* renamed from: b */
    public final String f3132b;

    public C0414d(int i10, String simNumber) {
        AbstractC4154l.m8923f(simNumber, "simNumber");
        this.f3131a = i10;
        this.f3132b = simNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0414d)) {
            return false;
        }
        C0414d c0414d = (C0414d) obj;
        return this.f3131a == c0414d.f3131a && AbstractC4154l.m8918a(this.f3132b, c0414d.f3132b);
    }

    public final int hashCode() {
        return this.f3132b.hashCode() + (Integer.hashCode(this.f3131a) * 31);
    }

    public final String toString() {
        return "NoteEdit(id=" + this.f3131a + ", simNumber=" + this.f3132b + ")";
    }
}
