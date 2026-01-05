package fr;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import im.EnumC3310l;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fr.a */
/* loaded from: classes3.dex */
public final class C2369a {

    /* renamed from: a */
    public final List f10771a;

    /* renamed from: b */
    public final EnumC3310l f10772b;

    /* renamed from: c */
    public final boolean f10773c;

    /* renamed from: d */
    public final boolean f10774d;

    /* renamed from: e */
    public final boolean f10775e;

    /* renamed from: f */
    public final boolean f10776f;

    /* renamed from: g */
    public final boolean f10777g;

    /* renamed from: h */
    public final int f10778h;

    public C2369a(List frequentCalls, EnumC3310l contactListState, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        AbstractC4154l.m8923f(frequentCalls, "frequentCalls");
        AbstractC4154l.m8923f(contactListState, "contactListState");
        this.f10771a = frequentCalls;
        this.f10772b = contactListState;
        this.f10773c = z6;
        this.f10774d = z10;
        this.f10775e = z11;
        this.f10776f = z12;
        this.f10777g = z13;
        this.f10778h = i10;
    }

    /* renamed from: a */
    public static C2369a m6056a(C2369a c2369a, List list, EnumC3310l enumC3310l, boolean z6, boolean z10, boolean z11, int i10, int i11) {
        if ((i11 & 1) != 0) {
            list = c2369a.f10771a;
        }
        List frequentCalls = list;
        if ((i11 & 2) != 0) {
            enumC3310l = c2369a.f10772b;
        }
        EnumC3310l contactListState = enumC3310l;
        boolean z12 = (i11 & 4) != 0 ? c2369a.f10773c : true;
        if ((i11 & 8) != 0) {
            z6 = c2369a.f10774d;
        }
        boolean z13 = z6;
        boolean z14 = (i11 & 16) != 0 ? c2369a.f10775e : z10;
        boolean z15 = (i11 & 32) != 0 ? c2369a.f10776f : true;
        boolean z16 = (i11 & 64) != 0 ? c2369a.f10777g : z11;
        int i12 = (i11 & 128) != 0 ? c2369a.f10778h : i10;
        c2369a.getClass();
        AbstractC4154l.m8923f(frequentCalls, "frequentCalls");
        AbstractC4154l.m8923f(contactListState, "contactListState");
        return new C2369a(frequentCalls, contactListState, z12, z13, z14, z15, z16, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2369a)) {
            return false;
        }
        C2369a c2369a = (C2369a) obj;
        return AbstractC4154l.m8918a(this.f10771a, c2369a.f10771a) && this.f10772b == c2369a.f10772b && this.f10773c == c2369a.f10773c && this.f10774d == c2369a.f10774d && this.f10775e == c2369a.f10775e && this.f10776f == c2369a.f10776f && this.f10777g == c2369a.f10777g && this.f10778h == c2369a.f10778h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10778h) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e((this.f10772b.hashCode() + (this.f10771a.hashCode() * 31)) * 31, 31, this.f10773c), 31, this.f10774d), 31, this.f10775e), 31, this.f10776f), 31, this.f10777g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactState(frequentCalls=");
        sb2.append(this.f10771a);
        sb2.append(", contactListState=");
        sb2.append(this.f10772b);
        sb2.append(", success=");
        AbstractC0030c.m133x(sb2, this.f10773c, ", isLoading=", this.f10774d, ", isRefreshLoading=");
        AbstractC0030c.m133x(sb2, this.f10775e, ", isContactRefresh=", this.f10776f, ", endReached=");
        sb2.append(this.f10777g);
        sb2.append(", page=");
        sb2.append(this.f10778h);
        sb2.append(")");
        return sb2.toString();
    }
}
