package qp;

import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6668r;
import tq.EnumC7204p;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qp.i */
/* loaded from: classes3.dex */
public final class C6272i {

    /* renamed from: a */
    public final List f30434a;

    /* renamed from: b */
    public final List f30435b;

    /* renamed from: c */
    public final List f30436c;

    /* renamed from: d */
    public final EnumC7204p f30437d;

    /* renamed from: e */
    public final LocalDateTime f30438e;

    /* renamed from: f */
    public final LocalDateTime f30439f;

    /* renamed from: g */
    public final List f30440g;

    /* renamed from: h */
    public final boolean f30441h;

    /* renamed from: i */
    public final boolean f30442i;

    /* renamed from: j */
    public final boolean f30443j;

    public C6272i(List list, List list2, List list3, EnumC7204p simSelectionMode, LocalDateTime localDateTime, LocalDateTime localDateTime2, List list4, boolean z6, boolean z10, boolean z11) {
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        this.f30434a = list;
        this.f30435b = list2;
        this.f30436c = list3;
        this.f30437d = simSelectionMode;
        this.f30438e = localDateTime;
        this.f30439f = localDateTime2;
        this.f30440g = list4;
        this.f30441h = z6;
        this.f30442i = z10;
        this.f30443j = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.util.List] */
    /* renamed from: a */
    public static C6272i m12276a(C6272i c6272i, List list, List list2, List list3, EnumC7204p enumC7204p, LocalDateTime localDateTime, LocalDateTime localDateTime2, ArrayList arrayList, boolean z6, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            list = c6272i.f30434a;
        }
        List topAllFrequentCalls = list;
        if ((i10 & 2) != 0) {
            list2 = c6272i.f30435b;
        }
        List topIncomingFrequentCalls = list2;
        if ((i10 & 4) != 0) {
            list3 = c6272i.f30436c;
        }
        List topOutgoingFrequentCalls = list3;
        if ((i10 & 8) != 0) {
            enumC7204p = c6272i.f30437d;
        }
        EnumC7204p simSelectionMode = enumC7204p;
        LocalDateTime startDate = (i10 & 16) != 0 ? c6272i.f30438e : localDateTime;
        LocalDateTime endDate = (i10 & 32) != 0 ? c6272i.f30439f : localDateTime2;
        ArrayList excludeNumbers = (i10 & 64) != 0 ? c6272i.f30440g : arrayList;
        boolean z11 = (i10 & 128) != 0 ? c6272i.f30441h : z6;
        boolean z12 = (i10 & 256) != 0 ? c6272i.f30442i : false;
        boolean z13 = (i10 & 512) != 0 ? c6272i.f30443j : z10;
        c6272i.getClass();
        AbstractC4154l.m8923f(topAllFrequentCalls, "topAllFrequentCalls");
        AbstractC4154l.m8923f(topIncomingFrequentCalls, "topIncomingFrequentCalls");
        AbstractC4154l.m8923f(topOutgoingFrequentCalls, "topOutgoingFrequentCalls");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(startDate, "startDate");
        AbstractC4154l.m8923f(endDate, "endDate");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        return new C6272i(topAllFrequentCalls, topIncomingFrequentCalls, topOutgoingFrequentCalls, simSelectionMode, startDate, endDate, excludeNumbers, z11, z12, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6272i)) {
            return false;
        }
        C6272i c6272i = (C6272i) obj;
        return AbstractC4154l.m8918a(this.f30434a, c6272i.f30434a) && AbstractC4154l.m8918a(this.f30435b, c6272i.f30435b) && AbstractC4154l.m8918a(this.f30436c, c6272i.f30436c) && this.f30437d == c6272i.f30437d && AbstractC4154l.m8918a(this.f30438e, c6272i.f30438e) && AbstractC4154l.m8918a(this.f30439f, c6272i.f30439f) && AbstractC4154l.m8918a(this.f30440g, c6272i.f30440g) && this.f30441h == c6272i.f30441h && this.f30442i == c6272i.f30442i && this.f30443j == c6272i.f30443j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30443j) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f30440g, m0.m7370c(this.f30439f, m0.m7370c(this.f30438e, (this.f30437d.hashCode() + AbstractC1452a.m4559f(this.f30436c, AbstractC1452a.m4559f(this.f30435b, this.f30434a.hashCode() * 31, 31), 31)) * 31, 31), 31), 31), 31, this.f30441h), 31, this.f30442i);
    }

    public final String toString() {
        return "TopFrequentCallState(topAllFrequentCalls=" + this.f30434a + ", topIncomingFrequentCalls=" + this.f30435b + ", topOutgoingFrequentCalls=" + this.f30436c + ", simSelectionMode=" + this.f30437d + ", startDate=" + this.f30438e + ", endDate=" + this.f30439f + ", excludeNumbers=" + this.f30440g + ", isLoading=" + this.f30441h + ", isEmpty=" + this.f30442i + ", isExclude=" + this.f30443j + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C6272i() {
        EnumC7204p enumC7204p = EnumC7204p.DEFAULT;
        C8800o c8800o = C8800o.f42459a;
        LocalDateTime localDateTimeM16209r = C8800o.m16209r();
        LocalDateTime localDateTimeM16201j = C8800o.m16201j();
        C6668r c6668r = C6668r.f31943a;
        this(c6668r, c6668r, c6668r, enumC7204p, localDateTimeM16209r, localDateTimeM16201j, c6668r, false, false, false);
    }
}
