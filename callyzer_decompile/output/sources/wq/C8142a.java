package wq;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wq.a */
/* loaded from: classes3.dex */
public final class C8142a {

    /* renamed from: a */
    public final List f38995a;

    /* renamed from: b */
    public final boolean f38996b;

    /* renamed from: c */
    public final boolean f38997c;

    /* renamed from: d */
    public final boolean f38998d;

    /* renamed from: e */
    public final List f38999e;

    /* renamed from: f */
    public final boolean f39000f;

    /* renamed from: g */
    public final int f39001g;

    public C8142a(List contacts, boolean z6, boolean z10, boolean z11, List selectedNumbers, boolean z12, int i10) {
        AbstractC4154l.m8923f(contacts, "contacts");
        AbstractC4154l.m8923f(selectedNumbers, "selectedNumbers");
        this.f38995a = contacts;
        this.f38996b = z6;
        this.f38997c = z10;
        this.f38998d = z11;
        this.f38999e = selectedNumbers;
        this.f39000f = z12;
        this.f39001g = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* renamed from: a */
    public static C8142a m15319a(C8142a c8142a, List list, boolean z6, boolean z10, boolean z11, ArrayList arrayList, int i10, int i11) {
        if ((i11 & 1) != 0) {
            list = c8142a.f38995a;
        }
        List contacts = list;
        if ((i11 & 2) != 0) {
            z6 = c8142a.f38996b;
        }
        boolean z12 = z6;
        if ((i11 & 4) != 0) {
            z10 = c8142a.f38997c;
        }
        boolean z13 = z10;
        if ((i11 & 8) != 0) {
            z11 = c8142a.f38998d;
        }
        boolean z14 = z11;
        ArrayList arrayList2 = arrayList;
        if ((i11 & 16) != 0) {
            arrayList2 = c8142a.f38999e;
        }
        ArrayList selectedNumbers = arrayList2;
        boolean z15 = (i11 & 32) != 0 ? c8142a.f39000f : true;
        if ((i11 & 64) != 0) {
            i10 = c8142a.f39001g;
        }
        c8142a.getClass();
        AbstractC4154l.m8923f(contacts, "contacts");
        AbstractC4154l.m8923f(selectedNumbers, "selectedNumbers");
        return new C8142a(contacts, z12, z13, z14, selectedNumbers, z15, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8142a)) {
            return false;
        }
        C8142a c8142a = (C8142a) obj;
        return AbstractC4154l.m8918a(this.f38995a, c8142a.f38995a) && this.f38996b == c8142a.f38996b && this.f38997c == c8142a.f38997c && this.f38998d == c8142a.f38998d && AbstractC4154l.m8918a(this.f38999e, c8142a.f38999e) && this.f39000f == c8142a.f39000f && this.f39001g == c8142a.f39001g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39001g) + AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f38999e, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(this.f38995a.hashCode() * 31, 31, this.f38996b), 31, this.f38997c), 31, this.f38998d), 31), 31, this.f39000f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddContactsState(contacts=");
        sb2.append(this.f38995a);
        sb2.append(", isLoading=");
        sb2.append(this.f38996b);
        sb2.append(", isRefreshLoading=");
        AbstractC0030c.m133x(sb2, this.f38997c, ", endReached=", this.f38998d, ", selectedNumbers=");
        sb2.append(this.f38999e);
        sb2.append(", onDualSim=");
        sb2.append(this.f39000f);
        sb2.append(", page=");
        return AbstractC5601a.m11233d(this.f39001g, ")", sb2);
    }
}
