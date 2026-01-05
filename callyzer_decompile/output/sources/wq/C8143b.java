package wq;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import vq.C7732d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wq.b */
/* loaded from: classes3.dex */
public final class C8143b {

    /* renamed from: a */
    public final String f39002a;

    /* renamed from: b */
    public final String f39003b;

    /* renamed from: c */
    public final boolean f39004c;

    /* renamed from: d */
    public final List f39005d;

    /* renamed from: e */
    public final List f39006e;

    /* renamed from: f */
    public final List f39007f;

    /* renamed from: g */
    public final List f39008g;

    /* renamed from: h */
    public final List f39009h;

    /* renamed from: i */
    public final List f39010i;

    /* renamed from: j */
    public final List f39011j;

    /* renamed from: k */
    public final List f39012k;

    /* renamed from: l */
    public final List f39013l;

    /* renamed from: m */
    public final boolean f39014m;

    /* renamed from: n */
    public final String f39015n;

    /* renamed from: o */
    public final C7732d f39016o;

    public C8143b(String str, String str2, boolean z6, List contactColumn, List totalCallsColumn, List totalOutgoingColumn, List totalIncomingColumn, List totalMissedColumn, List totalDurationColumn, List incomingCallDurationColumn, List outgoingCallDurationColumn, List lastInteractionColumn, boolean z10, String str3, C7732d c7732d) {
        AbstractC4154l.m8923f(contactColumn, "contactColumn");
        AbstractC4154l.m8923f(totalCallsColumn, "totalCallsColumn");
        AbstractC4154l.m8923f(totalOutgoingColumn, "totalOutgoingColumn");
        AbstractC4154l.m8923f(totalIncomingColumn, "totalIncomingColumn");
        AbstractC4154l.m8923f(totalMissedColumn, "totalMissedColumn");
        AbstractC4154l.m8923f(totalDurationColumn, "totalDurationColumn");
        AbstractC4154l.m8923f(incomingCallDurationColumn, "incomingCallDurationColumn");
        AbstractC4154l.m8923f(outgoingCallDurationColumn, "outgoingCallDurationColumn");
        AbstractC4154l.m8923f(lastInteractionColumn, "lastInteractionColumn");
        this.f39002a = str;
        this.f39003b = str2;
        this.f39004c = z6;
        this.f39005d = contactColumn;
        this.f39006e = totalCallsColumn;
        this.f39007f = totalOutgoingColumn;
        this.f39008g = totalIncomingColumn;
        this.f39009h = totalMissedColumn;
        this.f39010i = totalDurationColumn;
        this.f39011j = incomingCallDurationColumn;
        this.f39012k = outgoingCallDurationColumn;
        this.f39013l = lastInteractionColumn;
        this.f39014m = z10;
        this.f39015n = str3;
        this.f39016o = c7732d;
    }

    /* renamed from: a */
    public static C8143b m15320a(C8143b c8143b, String str, String str2, boolean z6, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, boolean z10, String str3, C7732d c7732d, int i10) {
        String str4 = (i10 & 1) != 0 ? c8143b.f39002a : str;
        String str5 = (i10 & 2) != 0 ? c8143b.f39003b : str2;
        boolean z11 = (i10 & 4) != 0 ? c8143b.f39004c : z6;
        List contactColumn = (i10 & 8) != 0 ? c8143b.f39005d : list;
        List totalCallsColumn = (i10 & 16) != 0 ? c8143b.f39006e : list2;
        List totalOutgoingColumn = (i10 & 32) != 0 ? c8143b.f39007f : list3;
        List totalIncomingColumn = (i10 & 64) != 0 ? c8143b.f39008g : list4;
        List totalMissedColumn = (i10 & 128) != 0 ? c8143b.f39009h : list5;
        List totalDurationColumn = (i10 & 256) != 0 ? c8143b.f39010i : list6;
        List incomingCallDurationColumn = (i10 & 512) != 0 ? c8143b.f39011j : list7;
        List outgoingCallDurationColumn = (i10 & 1024) != 0 ? c8143b.f39012k : list8;
        List lastInteractionColumn = (i10 & NewHope.SENDB_BYTES) != 0 ? c8143b.f39013l : list9;
        boolean z12 = (i10 & 4096) != 0 ? c8143b.f39014m : z10;
        String str6 = (i10 & 8192) != 0 ? c8143b.f39015n : str3;
        C7732d c7732d2 = (i10 & 16384) != 0 ? c8143b.f39016o : c7732d;
        c8143b.getClass();
        AbstractC4154l.m8923f(contactColumn, "contactColumn");
        AbstractC4154l.m8923f(totalCallsColumn, "totalCallsColumn");
        AbstractC4154l.m8923f(totalOutgoingColumn, "totalOutgoingColumn");
        AbstractC4154l.m8923f(totalIncomingColumn, "totalIncomingColumn");
        AbstractC4154l.m8923f(totalMissedColumn, "totalMissedColumn");
        AbstractC4154l.m8923f(totalDurationColumn, "totalDurationColumn");
        AbstractC4154l.m8923f(incomingCallDurationColumn, "incomingCallDurationColumn");
        AbstractC4154l.m8923f(outgoingCallDurationColumn, "outgoingCallDurationColumn");
        AbstractC4154l.m8923f(lastInteractionColumn, "lastInteractionColumn");
        return new C8143b(str4, str5, z11, contactColumn, totalCallsColumn, totalOutgoingColumn, totalIncomingColumn, totalMissedColumn, totalDurationColumn, incomingCallDurationColumn, outgoingCallDurationColumn, lastInteractionColumn, z12, str6, c7732d2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8143b)) {
            return false;
        }
        C8143b c8143b = (C8143b) obj;
        return AbstractC4154l.m8918a(this.f39002a, c8143b.f39002a) && AbstractC4154l.m8918a(this.f39003b, c8143b.f39003b) && this.f39004c == c8143b.f39004c && AbstractC4154l.m8918a(this.f39005d, c8143b.f39005d) && AbstractC4154l.m8918a(this.f39006e, c8143b.f39006e) && AbstractC4154l.m8918a(this.f39007f, c8143b.f39007f) && AbstractC4154l.m8918a(this.f39008g, c8143b.f39008g) && AbstractC4154l.m8918a(this.f39009h, c8143b.f39009h) && AbstractC4154l.m8918a(this.f39010i, c8143b.f39010i) && AbstractC4154l.m8918a(this.f39011j, c8143b.f39011j) && AbstractC4154l.m8918a(this.f39012k, c8143b.f39012k) && AbstractC4154l.m8918a(this.f39013l, c8143b.f39013l) && this.f39014m == c8143b.f39014m && AbstractC4154l.m8918a(this.f39015n, c8143b.f39015n) && AbstractC4154l.m8918a(this.f39016o, c8143b.f39016o);
    }

    public final int hashCode() {
        String str = this.f39002a;
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f39013l, AbstractC1452a.m4559f(this.f39012k, AbstractC1452a.m4559f(this.f39011j, AbstractC1452a.m4559f(this.f39010i, AbstractC1452a.m4559f(this.f39009h, AbstractC1452a.m4559f(this.f39008g, AbstractC1452a.m4559f(this.f39007f, AbstractC1452a.m4559f(this.f39006e, AbstractC1452a.m4559f(this.f39005d, AbstractC1452a.m4558e(AbstractC0030c.m113d((str == null ? 0 : str.hashCode()) * 31, 31, this.f39003b), 31, this.f39004c), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f39014m);
        String str2 = this.f39015n;
        return this.f39016o.hashCode() + ((iM4558e + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("CompareResultState(fromDate=", this.f39002a, ", toDate=", this.f39003b, ", isCalculating=");
        sbM127r.append(this.f39004c);
        sbM127r.append(", contactColumn=");
        sbM127r.append(this.f39005d);
        sbM127r.append(", totalCallsColumn=");
        sbM127r.append(this.f39006e);
        sbM127r.append(", totalOutgoingColumn=");
        sbM127r.append(this.f39007f);
        sbM127r.append(", totalIncomingColumn=");
        sbM127r.append(this.f39008g);
        sbM127r.append(", totalMissedColumn=");
        sbM127r.append(this.f39009h);
        sbM127r.append(", totalDurationColumn=");
        sbM127r.append(this.f39010i);
        sbM127r.append(", incomingCallDurationColumn=");
        sbM127r.append(this.f39011j);
        sbM127r.append(", outgoingCallDurationColumn=");
        sbM127r.append(this.f39012k);
        sbM127r.append(", lastInteractionColumn=");
        sbM127r.append(this.f39013l);
        sbM127r.append(", isExportReportEnabled=");
        AbstractC4801l.m9751y(sbM127r, this.f39014m, ", exportToCsvFileName=", this.f39015n, ", exportCSVResultState=");
        sbM127r.append(this.f39016o);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
