package is;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest;
import com.websoptimization.callyzerbiz.data.model.request.lead_request.StaticProperties;
import im.EnumC3316r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import or.C5445h;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import rw.C6668r;
import rw.C6669s;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: is.b */
/* loaded from: classes3.dex */
public final class C3348b {

    /* renamed from: a */
    public final List f17713a;

    /* renamed from: b */
    public final boolean f17714b;

    /* renamed from: c */
    public final int f17715c;

    /* renamed from: d */
    public final String f17716d;

    /* renamed from: e */
    public final int f17717e;

    /* renamed from: f */
    public final boolean f17718f;

    /* renamed from: g */
    public final boolean f17719g;

    /* renamed from: h */
    public final boolean f17720h;

    /* renamed from: i */
    public final List f17721i;

    /* renamed from: j */
    public final EnumC7204p f17722j;

    /* renamed from: k */
    public final boolean f17723k;

    /* renamed from: l */
    public final Integer f17724l;

    /* renamed from: m */
    public final EnumC3316r f17725m;

    /* renamed from: n */
    public final C5445h f17726n;

    /* renamed from: o */
    public final LeadFilterRequest f17727o;

    /* renamed from: p */
    public final List f17728p;

    /* renamed from: q */
    public final boolean f17729q;

    /* renamed from: r */
    public final Map f17730r;

    public C3348b(List list, boolean z6, int i10, String str, int i11, boolean z10, boolean z11, boolean z12, List list2, EnumC7204p selectedSimOptionMode, boolean z13, Integer num, EnumC3316r sortBy, C5445h c5445h, LeadFilterRequest leadFilterRequest, List list3, boolean z14, Map map) {
        AbstractC4154l.m8923f(selectedSimOptionMode, "selectedSimOptionMode");
        AbstractC4154l.m8923f(sortBy, "sortBy");
        this.f17713a = list;
        this.f17714b = z6;
        this.f17715c = i10;
        this.f17716d = str;
        this.f17717e = i11;
        this.f17718f = z10;
        this.f17719g = z11;
        this.f17720h = z12;
        this.f17721i = list2;
        this.f17722j = selectedSimOptionMode;
        this.f17723k = z13;
        this.f17724l = num;
        this.f17725m = sortBy;
        this.f17726n = c5445h;
        this.f17727o = leadFilterRequest;
        this.f17728p = list3;
        this.f17729q = z14;
        this.f17730r = map;
    }

    /* renamed from: a */
    public static C3348b m7669a(C3348b c3348b, List list, boolean z6, int i10, String str, int i11, boolean z10, boolean z11, boolean z12, List list2, EnumC7204p enumC7204p, boolean z13, Integer num, EnumC3316r enumC3316r, C5445h c5445h, LeadFilterRequest leadFilterRequest, List list3, boolean z14, Map map, int i12) {
        List leadList = (i12 & 1) != 0 ? c3348b.f17713a : list;
        boolean z15 = (i12 & 2) != 0 ? c3348b.f17714b : z6;
        int i13 = (i12 & 4) != 0 ? c3348b.f17715c : i10;
        String errorMassage = (i12 & 8) != 0 ? c3348b.f17716d : str;
        int i14 = (i12 & 16) != 0 ? c3348b.f17717e : i11;
        boolean z16 = (i12 & 32) != 0 ? c3348b.f17718f : z10;
        boolean z17 = (i12 & 64) != 0 ? c3348b.f17719g : z11;
        boolean z18 = (i12 & 128) != 0 ? c3348b.f17720h : z12;
        List simOptionList = (i12 & 256) != 0 ? c3348b.f17721i : list2;
        EnumC7204p selectedSimOptionMode = (i12 & 512) != 0 ? c3348b.f17722j : enumC7204p;
        boolean z19 = (i12 & 1024) != 0 ? c3348b.f17723k : z13;
        Integer num2 = (i12 & NewHope.SENDB_BYTES) != 0 ? c3348b.f17724l : num;
        c3348b.getClass();
        c3348b.getClass();
        EnumC3316r sortBy = (i12 & 16384) != 0 ? c3348b.f17725m : enumC3316r;
        C5445h c5445h2 = (32768 & i12) != 0 ? c3348b.f17726n : c5445h;
        LeadFilterRequest selectedLeadFilter = (i12 & 65536) != 0 ? c3348b.f17727o : leadFilterRequest;
        boolean z20 = z15;
        List tagList = (i12 & 131072) != 0 ? c3348b.f17728p : list3;
        int i15 = i13;
        boolean z21 = (i12 & 262144) != 0 ? c3348b.f17729q : z14;
        Map leadsGroupedByDate = (i12 & 524288) != 0 ? c3348b.f17730r : map;
        c3348b.getClass();
        AbstractC4154l.m8923f(leadList, "leadList");
        AbstractC4154l.m8923f(errorMassage, "errorMassage");
        AbstractC4154l.m8923f(simOptionList, "simOptionList");
        AbstractC4154l.m8923f(selectedSimOptionMode, "selectedSimOptionMode");
        AbstractC4154l.m8923f(sortBy, "sortBy");
        AbstractC4154l.m8923f(selectedLeadFilter, "selectedLeadFilter");
        AbstractC4154l.m8923f(tagList, "tagList");
        AbstractC4154l.m8923f(leadsGroupedByDate, "leadsGroupedByDate");
        return new C3348b(leadList, z20, i15, errorMassage, i14, z16, z17, z18, simOptionList, selectedSimOptionMode, z19, num2, sortBy, c5445h2, selectedLeadFilter, tagList, z21, leadsGroupedByDate);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3348b)) {
            return false;
        }
        C3348b c3348b = (C3348b) obj;
        return AbstractC4154l.m8918a(this.f17713a, c3348b.f17713a) && this.f17714b == c3348b.f17714b && this.f17715c == c3348b.f17715c && AbstractC4154l.m8918a(this.f17716d, c3348b.f17716d) && this.f17717e == c3348b.f17717e && this.f17718f == c3348b.f17718f && this.f17719g == c3348b.f17719g && this.f17720h == c3348b.f17720h && AbstractC4154l.m8918a(this.f17721i, c3348b.f17721i) && this.f17722j == c3348b.f17722j && this.f17723k == c3348b.f17723k && AbstractC4154l.m8918a(this.f17724l, c3348b.f17724l) && this.f17725m == c3348b.f17725m && AbstractC4154l.m8918a(this.f17726n, c3348b.f17726n) && AbstractC4154l.m8918a(this.f17727o, c3348b.f17727o) && AbstractC4154l.m8918a(this.f17728p, c3348b.f17728p) && this.f17729q == c3348b.f17729q && AbstractC4154l.m8918a(this.f17730r, c3348b.f17730r);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e((this.f17722j.hashCode() + AbstractC1452a.m4559f(this.f17721i, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f17717e, AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f17715c, AbstractC1452a.m4558e(this.f17713a.hashCode() * 31, 31, this.f17714b), 31), 31, this.f17716d), 31), 31, this.f17718f), 31, this.f17719g), 31, this.f17720h), 31)) * 31, 31, this.f17723k);
        Integer num = this.f17724l;
        int iHashCode = (this.f17725m.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e((iM4558e + (num == null ? 0 : num.hashCode())) * 31, 31, false), 31, false)) * 31;
        C5445h c5445h = this.f17726n;
        return this.f17730r.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f17728p, (this.f17727o.hashCode() + ((iHashCode + (c5445h != null ? c5445h.hashCode() : 0)) * 31)) * 31, 31), 31, this.f17729q);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeadTabState(leadList=");
        sb2.append(this.f17713a);
        sb2.append(", isMyLoading=");
        sb2.append(this.f17714b);
        sb2.append(", page=");
        AbstractC1452a.m4550A(sb2, this.f17715c, ", errorMassage=", this.f17716d, ", totalLeadCount=");
        sb2.append(this.f17717e);
        sb2.append(", isOpenErrorBottom=");
        sb2.append(this.f17718f);
        sb2.append(", isEmpty=");
        AbstractC0030c.m133x(sb2, this.f17719g, ", isShowSIM=", this.f17720h, ", simOptionList=");
        sb2.append(this.f17721i);
        sb2.append(", selectedSimOptionMode=");
        sb2.append(this.f17722j);
        sb2.append(", isLeadRefresh=");
        sb2.append(this.f17723k);
        sb2.append(", totalDue=");
        sb2.append(this.f17724l);
        sb2.append(", isPlaceCall=false, isNoteEdited=false, sortBy=");
        sb2.append(this.f17725m);
        sb2.append(", sorting=");
        sb2.append(this.f17726n);
        sb2.append(", selectedLeadFilter=");
        sb2.append(this.f17727o);
        sb2.append(", tagList=");
        sb2.append(this.f17728p);
        sb2.append(", callNotConnected=");
        sb2.append(this.f17729q);
        sb2.append(", leadsGroupedByDate=");
        sb2.append(this.f17730r);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ C3348b() {
        EnumC7204p enumC7204p = EnumC7204p.DEFAULT;
        EnumC3316r enumC3316r = EnumC3316r.Newest;
        StaticProperties staticProperties = new StaticProperties(null, null, null, null, null, null, null, null, null, 511, null);
        C6669s c6669s = C6669s.f31944a;
        LeadFilterRequest leadFilterRequest = new LeadFilterRequest(staticProperties, c6669s);
        C6668r c6668r = C6668r.f31943a;
        this(c6668r, false, 0, "", 0, false, false, false, c6668r, enumC7204p, false, null, enumC3316r, null, leadFilterRequest, c6668r, false, c6669s);
    }
}
