package qp;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qp.a */
/* loaded from: classes3.dex */
public final class C6264a {

    /* renamed from: a */
    public final List f30357a;

    /* renamed from: b */
    public final List f30358b;

    /* renamed from: c */
    public final boolean f30359c;

    /* renamed from: d */
    public final boolean f30360d;

    /* renamed from: e */
    public final List f30361e;

    /* renamed from: f */
    public final LocalDateTime f30362f;

    /* renamed from: g */
    public final LocalDateTime f30363g;

    /* renamed from: h */
    public final EnumC7204p f30364h;

    /* renamed from: i */
    public final boolean f30365i;

    public C6264a(List summaryList, List analysisList, boolean z6, boolean z10, List excludeNumbers, LocalDateTime localDateTime, LocalDateTime localDateTime2, EnumC7204p simSelectionMode, boolean z11) {
        AbstractC4154l.m8923f(summaryList, "summaryList");
        AbstractC4154l.m8923f(analysisList, "analysisList");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        this.f30357a = summaryList;
        this.f30358b = analysisList;
        this.f30359c = z6;
        this.f30360d = z10;
        this.f30361e = excludeNumbers;
        this.f30362f = localDateTime;
        this.f30363g = localDateTime2;
        this.f30364h = simSelectionMode;
        this.f30365i = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /* renamed from: a */
    public static C6264a m12269a(C6264a c6264a, List list, List list2, boolean z6, boolean z10, ArrayList arrayList, LocalDateTime localDateTime, LocalDateTime localDateTime2, EnumC7204p enumC7204p, boolean z11, int i10) {
        if ((i10 & 1) != 0) {
            list = c6264a.f30357a;
        }
        List summaryList = list;
        if ((i10 & 2) != 0) {
            list2 = c6264a.f30358b;
        }
        List analysisList = list2;
        if ((i10 & 4) != 0) {
            z6 = c6264a.f30359c;
        }
        boolean z12 = z6;
        if ((i10 & 8) != 0) {
            z10 = c6264a.f30360d;
        }
        boolean z13 = z10;
        c6264a.getClass();
        ArrayList arrayList2 = arrayList;
        if ((i10 & 32) != 0) {
            arrayList2 = c6264a.f30361e;
        }
        ArrayList excludeNumbers = arrayList2;
        c6264a.getClass();
        LocalDateTime startDate = (i10 & 128) != 0 ? c6264a.f30362f : localDateTime;
        LocalDateTime endDate = (i10 & 256) != 0 ? c6264a.f30363g : localDateTime2;
        EnumC7204p simSelectionMode = (i10 & 512) != 0 ? c6264a.f30364h : enumC7204p;
        boolean z14 = (i10 & 1024) != 0 ? c6264a.f30365i : z11;
        c6264a.getClass();
        AbstractC4154l.m8923f(summaryList, "summaryList");
        AbstractC4154l.m8923f(analysisList, "analysisList");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        AbstractC4154l.m8923f(startDate, "startDate");
        AbstractC4154l.m8923f(endDate, "endDate");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        return new C6264a(summaryList, analysisList, z12, z13, excludeNumbers, startDate, endDate, simSelectionMode, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6264a)) {
            return false;
        }
        C6264a c6264a = (C6264a) obj;
        return AbstractC4154l.m8918a(this.f30357a, c6264a.f30357a) && AbstractC4154l.m8918a(this.f30358b, c6264a.f30358b) && this.f30359c == c6264a.f30359c && this.f30360d == c6264a.f30360d && AbstractC4154l.m8918a(this.f30361e, c6264a.f30361e) && this.f30362f.equals(c6264a.f30362f) && this.f30363g.equals(c6264a.f30363g) && this.f30364h == c6264a.f30364h && this.f30365i == c6264a.f30365i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30365i) + ((this.f30364h.hashCode() + m0.m7370c(this.f30363g, m0.m7370c(this.f30362f, AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f30361e, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f30358b, this.f30357a.hashCode() * 31, 31), 31, this.f30359c), 961, this.f30360d), 31), 31, false), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalyticsState(summaryList=");
        sb2.append(this.f30357a);
        sb2.append(", analysisList=");
        sb2.append(this.f30358b);
        sb2.append(", isEmpty=");
        AbstractC0030c.m133x(sb2, this.f30359c, ", isLoading=", this.f30360d, ", error=, excludeNumbers=");
        sb2.append(this.f30361e);
        sb2.append(", isGetExcludeNumber=false, startDate=");
        sb2.append(this.f30362f);
        sb2.append(", endDate=");
        sb2.append(this.f30363g);
        sb2.append(", simSelectionMode=");
        sb2.append(this.f30364h);
        sb2.append(", isExclude=");
        return AbstractC5601a.m11242m(sb2, this.f30365i, ")");
    }
}
