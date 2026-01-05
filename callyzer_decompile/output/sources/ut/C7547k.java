package ut;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ut.k */
/* loaded from: classes3.dex */
public final class C7547k {

    /* renamed from: a */
    public final int f36324a;

    /* renamed from: b */
    public final String f36325b;

    /* renamed from: c */
    public final String f36326c;

    /* renamed from: d */
    public final boolean f36327d;

    public C7547k(int i10, String str, String number, boolean z6) {
        AbstractC4154l.m8923f(number, "number");
        this.f36324a = i10;
        this.f36325b = str;
        this.f36326c = number;
        this.f36327d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7547k)) {
            return false;
        }
        C7547k c7547k = (C7547k) obj;
        return this.f36324a == c7547k.f36324a && AbstractC4154l.m8918a(this.f36325b, c7547k.f36325b) && AbstractC4154l.m8918a(this.f36326c, c7547k.f36326c) && this.f36327d == c7547k.f36327d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36327d) + AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f36324a) * 31, 31, this.f36325b), 31, this.f36326c);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f36324a, "SimUiData(slot=", ", username=", this.f36325b, ", number=");
        sbM14337q.append(this.f36326c);
        sbM14337q.append(", isSyncOnlyLeadFeature=");
        sbM14337q.append(this.f36327d);
        sbM14337q.append(")");
        return sbM14337q.toString();
    }
}
