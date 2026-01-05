package fs;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import es.C2124a;
import es.C2128e;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fs.b */
/* loaded from: classes3.dex */
public final class C2371b {

    /* renamed from: a */
    public final boolean f10787a;

    /* renamed from: b */
    public final boolean f10788b;

    /* renamed from: c */
    public final C2124a f10789c;

    /* renamed from: d */
    public final String f10790d;

    /* renamed from: e */
    public final String f10791e;

    /* renamed from: f */
    public final C2128e f10792f;

    /* renamed from: g */
    public final String f10793g;

    /* renamed from: h */
    public final boolean f10794h;

    /* renamed from: i */
    public final boolean f10795i;

    /* renamed from: j */
    public final boolean f10796j;

    /* renamed from: k */
    public final List f10797k;

    /* renamed from: l */
    public final String f10798l;

    public C2371b(boolean z6, boolean z10, C2124a c2124a, String str, String str2, C2128e c2128e, String str3, boolean z11, boolean z12, boolean z13, List list, String str4) {
        this.f10787a = z6;
        this.f10788b = z10;
        this.f10789c = c2124a;
        this.f10790d = str;
        this.f10791e = str2;
        this.f10792f = c2128e;
        this.f10793g = str3;
        this.f10794h = z11;
        this.f10795i = z12;
        this.f10796j = z13;
        this.f10797k = list;
        this.f10798l = str4;
    }

    /* renamed from: a */
    public static C2371b m6058a(C2371b c2371b, boolean z6, C2124a c2124a, String str, String str2, C2128e c2128e, String str3, boolean z10, boolean z11, List list, String str4, int i10) {
        boolean z12 = (i10 & 1) != 0 ? c2371b.f10787a : z6;
        boolean z13 = (i10 & 2) != 0 ? c2371b.f10788b : false;
        C2124a c2124a2 = (i10 & 4) != 0 ? c2371b.f10789c : c2124a;
        String leadId = (i10 & 8) != 0 ? c2371b.f10790d : str;
        String leadFullName = (i10 & 16) != 0 ? c2371b.f10791e : str2;
        C2128e c2128e2 = (i10 & 32) != 0 ? c2371b.f10792f : c2128e;
        String str5 = (i10 & 64) != 0 ? c2371b.f10793g : str3;
        boolean z14 = (i10 & 128) != 0 ? c2371b.f10794h : z10;
        boolean z15 = (i10 & 256) != 0 ? c2371b.f10795i : true;
        boolean z16 = (i10 & 512) != 0 ? c2371b.f10796j : z11;
        List leadCallCounts = (i10 & 1024) != 0 ? c2371b.f10797k : list;
        String summaryDateSpan = (i10 & NewHope.SENDB_BYTES) != 0 ? c2371b.f10798l : str4;
        c2371b.getClass();
        AbstractC4154l.m8923f(leadId, "leadId");
        AbstractC4154l.m8923f(leadFullName, "leadFullName");
        AbstractC4154l.m8923f(leadCallCounts, "leadCallCounts");
        AbstractC4154l.m8923f(summaryDateSpan, "summaryDateSpan");
        return new C2371b(z12, z13, c2124a2, leadId, leadFullName, c2128e2, str5, z14, z15, z16, leadCallCounts, summaryDateSpan);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2371b)) {
            return false;
        }
        C2371b c2371b = (C2371b) obj;
        return this.f10787a == c2371b.f10787a && this.f10788b == c2371b.f10788b && AbstractC4154l.m8918a(this.f10789c, c2371b.f10789c) && AbstractC4154l.m8918a(this.f10790d, c2371b.f10790d) && AbstractC4154l.m8918a(this.f10791e, c2371b.f10791e) && AbstractC4154l.m8918a(this.f10792f, c2371b.f10792f) && AbstractC4154l.m8918a(this.f10793g, c2371b.f10793g) && this.f10794h == c2371b.f10794h && this.f10795i == c2371b.f10795i && this.f10796j == c2371b.f10796j && AbstractC4154l.m8918a(this.f10797k, c2371b.f10797k) && AbstractC4154l.m8918a(this.f10798l, c2371b.f10798l);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(Boolean.hashCode(this.f10787a) * 31, 31, this.f10788b);
        C2124a c2124a = this.f10789c;
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d((iM4558e + (c2124a == null ? 0 : c2124a.hashCode())) * 31, 31, this.f10790d), 31, this.f10791e);
        C2128e c2128e = this.f10792f;
        int iHashCode = (iM113d + (c2128e == null ? 0 : c2128e.hashCode())) * 31;
        String str = this.f10793g;
        return this.f10798l.hashCode() + AbstractC1452a.m4559f(this.f10797k, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f10794h), 31, this.f10795i), 31, this.f10796j), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeadDetailsUiState(isLoading=");
        sb2.append(this.f10787a);
        sb2.append(", isMultipleData=");
        sb2.append(this.f10788b);
        sb2.append(", connectedSIMData=");
        sb2.append(this.f10789c);
        sb2.append(", leadId=");
        sb2.append(this.f10790d);
        sb2.append(", leadFullName=");
        sb2.append(this.f10791e);
        sb2.append(", leadDetailsData=");
        sb2.append(this.f10792f);
        sb2.append(", errorMessage=");
        AbstractC4801l.m9749w(sb2, this.f10793g, ", isNetworkConnected=", this.f10794h, ", loadedSuccessfully=");
        AbstractC0030c.m133x(sb2, this.f10795i, ", isShowSIM=", this.f10796j, ", leadCallCounts=");
        sb2.append(this.f10797k);
        sb2.append(", summaryDateSpan=");
        sb2.append(this.f10798l);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ C2371b() {
        this(false, false, null, "", "", null, null, true, false, false, C6668r.f31943a, "");
    }
}
