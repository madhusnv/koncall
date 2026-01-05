package jp;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jp.l */
/* loaded from: classes3.dex */
public final class C3831l extends AbstractC3837r {

    /* renamed from: a */
    public final int f19783a;

    /* renamed from: b */
    public final String f19784b;

    public C3831l(int i10, String simNumber) {
        AbstractC4154l.m8923f(simNumber, "simNumber");
        this.f19783a = i10;
        this.f19784b = simNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3831l)) {
            return false;
        }
        C3831l c3831l = (C3831l) obj;
        return this.f19783a == c3831l.f19783a && AbstractC4154l.m8918a(this.f19784b, c3831l.f19784b);
    }

    public final int hashCode() {
        return this.f19784b.hashCode() + (Integer.hashCode(this.f19783a) * 31);
    }

    public final String toString() {
        return "NoteEdit(id=" + this.f19783a + ", simNumber=" + this.f19784b + ")";
    }
}
