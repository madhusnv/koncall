package gq;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gq.a */
/* loaded from: classes3.dex */
public final class C2704a {

    /* renamed from: a */
    public final String f15104a;

    /* renamed from: b */
    public final int f15105b;

    public C2704a(String title, int i10) {
        AbstractC4154l.m8923f(title, "title");
        this.f15104a = title;
        this.f15105b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2704a)) {
            return false;
        }
        C2704a c2704a = (C2704a) obj;
        return AbstractC4154l.m8918a(this.f15104a, c2704a.f15104a) && this.f15105b == c2704a.f15105b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15105b) + (this.f15104a.hashCode() * 31);
    }

    public final String toString() {
        return "Tabs(title=" + this.f15104a + ", icon=" + this.f15105b + ")";
    }
}
