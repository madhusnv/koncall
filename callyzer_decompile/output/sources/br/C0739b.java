package br;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: br.b */
/* loaded from: classes3.dex */
public final class C0739b {

    /* renamed from: a */
    public final List f4658a;

    /* renamed from: b */
    public final boolean f4659b;

    /* renamed from: c */
    public final boolean f4660c;

    /* renamed from: d */
    public final boolean f4661d;

    /* renamed from: e */
    public final int f4662e;

    /* renamed from: f */
    public final boolean f4663f;

    /* renamed from: g */
    public final boolean f4664g;

    /* renamed from: h */
    public final boolean f4665h;

    /* renamed from: i */
    public final List f4666i;

    public C0739b(List callHistoryList, boolean z6, boolean z10, boolean z11, int i10, boolean z12, boolean z13, boolean z14, List downloadingIds) {
        AbstractC4154l.m8923f(callHistoryList, "callHistoryList");
        AbstractC4154l.m8923f(downloadingIds, "downloadingIds");
        this.f4658a = callHistoryList;
        this.f4659b = z6;
        this.f4660c = z10;
        this.f4661d = z11;
        this.f4662e = i10;
        this.f4663f = z12;
        this.f4664g = z13;
        this.f4665h = z14;
        this.f4666i = downloadingIds;
    }

    /* renamed from: a */
    public static C0739b m2036a(C0739b c0739b, List list, boolean z6, boolean z10, boolean z11, int i10, boolean z12, boolean z13, boolean z14, List list2, int i11) {
        if ((i11 & 1) != 0) {
            list = c0739b.f4658a;
        }
        List callHistoryList = list;
        if ((i11 & 2) != 0) {
            z6 = c0739b.f4659b;
        }
        boolean z15 = z6;
        if ((i11 & 4) != 0) {
            z10 = c0739b.f4660c;
        }
        boolean z16 = z10;
        if ((i11 & 8) != 0) {
            z11 = c0739b.f4661d;
        }
        boolean z17 = z11;
        if ((i11 & 16) != 0) {
            i10 = c0739b.f4662e;
        }
        int i12 = i10;
        boolean z18 = (i11 & 32) != 0 ? c0739b.f4663f : z12;
        boolean z19 = (i11 & 64) != 0 ? c0739b.f4664g : z13;
        boolean z20 = (i11 & 128) != 0 ? c0739b.f4665h : z14;
        List downloadingIds = (i11 & 256) != 0 ? c0739b.f4666i : list2;
        AbstractC4154l.m8923f(callHistoryList, "callHistoryList");
        AbstractC4154l.m8923f(downloadingIds, "downloadingIds");
        return new C0739b(callHistoryList, z15, z16, z17, i12, z18, z19, z20, downloadingIds);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0739b)) {
            return false;
        }
        C0739b c0739b = (C0739b) obj;
        return AbstractC4154l.m8918a(this.f4658a, c0739b.f4658a) && this.f4659b == c0739b.f4659b && this.f4660c == c0739b.f4660c && this.f4661d == c0739b.f4661d && this.f4662e == c0739b.f4662e && this.f4663f == c0739b.f4663f && this.f4664g == c0739b.f4664g && this.f4665h == c0739b.f4665h && AbstractC4154l.m8918a(this.f4666i, c0739b.f4666i);
    }

    public final int hashCode() {
        return this.f4666i.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f4662e, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(this.f4658a.hashCode() * 31, 31, this.f4659b), 31, this.f4660c), 31, this.f4661d), 31), 31, this.f4663f), 31, this.f4664g), 31, this.f4665h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallHistoryContactDetailState(callHistoryList=");
        sb2.append(this.f4658a);
        sb2.append(", isLoadingCallHist=");
        sb2.append(this.f4659b);
        sb2.append(", isRefreshLoading=");
        AbstractC0030c.m133x(sb2, this.f4660c, ", isAcs=", this.f4661d, ", page=");
        sb2.append(this.f4662e);
        sb2.append(", endReached=");
        sb2.append(this.f4663f);
        sb2.append(", isDurationSorting=");
        AbstractC0030c.m133x(sb2, this.f4664g, ", isDateSorting=", this.f4665h, ", downloadingIds=");
        return AbstractC5601a.m11240k(")", sb2, this.f4666i);
    }
}
