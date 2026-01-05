package f8;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f8.g */
/* loaded from: classes.dex */
public final class C2212g implements Comparable {

    /* renamed from: a */
    public final int f10168a;

    /* renamed from: b */
    public final int f10169b;

    /* renamed from: c */
    public final String f10170c;

    /* renamed from: d */
    public final String f10171d;

    public C2212g(String from, int i10, int i11, String to2) {
        AbstractC4154l.m8923f(from, "from");
        AbstractC4154l.m8923f(to2, "to");
        this.f10168a = i10;
        this.f10169b = i11;
        this.f10170c = from;
        this.f10171d = to2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2212g other = (C2212g) obj;
        AbstractC4154l.m8923f(other, "other");
        int i10 = this.f10168a - other.f10168a;
        return i10 == 0 ? this.f10169b - other.f10169b : i10;
    }
}
