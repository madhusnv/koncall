package cs;

import kotlin.jvm.internal.AbstractC4154l;
import og.hb;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cs.c */
/* loaded from: classes3.dex */
public final class C1484c extends hb {

    /* renamed from: a */
    public final String f7562a;

    /* renamed from: b */
    public final String f7563b;

    public C1484c(String countryCode, String number) {
        AbstractC4154l.m8923f(countryCode, "countryCode");
        AbstractC4154l.m8923f(number, "number");
        this.f7562a = countryCode;
        this.f7563b = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1484c)) {
            return false;
        }
        C1484c c1484c = (C1484c) obj;
        return AbstractC4154l.m8918a(this.f7562a, c1484c.f7562a) && AbstractC4154l.m8918a(this.f7563b, c1484c.f7563b);
    }

    public final int hashCode() {
        return this.f7563b.hashCode() + (this.f7562a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("OnCopyPressed(countryCode=", this.f7562a, ", number=", this.f7563b, ")");
    }
}
