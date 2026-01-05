package vt;

import kotlin.jvm.internal.AbstractC4154l;
import pg.m6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vt.m */
/* loaded from: classes3.dex */
public final class C7782m extends m6 {

    /* renamed from: a */
    public final int f37445a;

    /* renamed from: b */
    public final String f37446b;

    public C7782m(int i10, String name) {
        AbstractC4154l.m8923f(name, "name");
        this.f37445a = i10;
        this.f37446b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7782m)) {
            return false;
        }
        C7782m c7782m = (C7782m) obj;
        return this.f37445a == c7782m.f37445a && AbstractC4154l.m8918a(this.f37446b, c7782m.f37446b);
    }

    public final int hashCode() {
        return this.f37446b.hashCode() + (Integer.hashCode(this.f37445a) * 31);
    }

    public final String toString() {
        return "NameEditBottomSheet(id=" + this.f37445a + ", name=" + this.f37446b + ")";
    }
}
