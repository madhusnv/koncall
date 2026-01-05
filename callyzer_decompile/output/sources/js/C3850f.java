package js;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: js.f */
/* loaded from: classes3.dex */
public final class C3850f {

    /* renamed from: a */
    public final String f19811a;

    /* renamed from: b */
    public final String f19812b;

    /* renamed from: c */
    public final String f19813c;

    /* renamed from: d */
    public final int f19814d;

    /* renamed from: e */
    public final String f19815e;

    /* renamed from: f */
    public final Integer f19816f;

    /* renamed from: g */
    public final String f19817g;

    /* renamed from: h */
    public final List f19818h;

    /* renamed from: i */
    public final List f19819i;

    /* renamed from: j */
    public final String f19820j;

    /* renamed from: k */
    public final String f19821k;

    /* renamed from: l */
    public final int f19822l;

    /* renamed from: m */
    public final LocalDateTime f19823m;

    /* renamed from: n */
    public final LocalDateTime f19824n;

    /* renamed from: o */
    public final List f19825o;

    /* renamed from: p */
    public final C3846b f19826p;

    /* renamed from: q */
    public final List f19827q;

    /* renamed from: r */
    public final String f19828r;

    /* renamed from: s */
    public final boolean f19829s;

    /* renamed from: t */
    public final String f19830t;

    /* renamed from: u */
    public final String f19831u;

    /* renamed from: v */
    public final String f19832v;

    /* renamed from: w */
    public final ArrayList f19833w;

    /* renamed from: x */
    public final boolean f19834x;

    public C3850f(String leadId, String leadName, String leadNumber, int i10, String str, Integer num, String serialNumber, List list, List simNumbers, String str2, String str3, int i11, LocalDateTime createDate, LocalDateTime localDateTime, List list2, C3846b c3846b, List list3, String str4, boolean z6) {
        String str5;
        Object objM4907e;
        LastCallDetails lastCallDetails;
        int i12;
        AbstractC4154l.m8923f(leadId, "leadId");
        AbstractC4154l.m8923f(leadName, "leadName");
        AbstractC4154l.m8923f(leadNumber, "leadNumber");
        AbstractC4154l.m8923f(serialNumber, "serialNumber");
        AbstractC4154l.m8923f(simNumbers, "simNumbers");
        AbstractC4154l.m8923f(createDate, "createDate");
        this.f19811a = leadId;
        this.f19812b = leadName;
        this.f19813c = leadNumber;
        this.f19814d = i10;
        this.f19815e = str;
        this.f19816f = num;
        this.f19817g = serialNumber;
        this.f19818h = list;
        this.f19819i = simNumbers;
        this.f19820j = str2;
        this.f19821k = str3;
        this.f19822l = i11;
        this.f19823m = createDate;
        this.f19824n = localDateTime;
        this.f19825o = list2;
        this.f19826p = c3846b;
        this.f19827q = list3;
        this.f19828r = str4;
        this.f19829s = z6;
        C8800o c8800o = C8800o.f42459a;
        String str6 = createDate.format(C8800o.m16214w("dd-MM-yyyy"));
        AbstractC4154l.m8922e(str6, "format(...)");
        this.f19830t = str6;
        if (localDateTime != null) {
            str5 = localDateTime.format(C8800o.m16214w("dd-MM-yyyy"));
            AbstractC4154l.m8922e(str5, "format(...)");
        } else {
            str5 = "-";
        }
        this.f19831u = str5;
        String strValueOf = String.valueOf(AbstractC5178p.m10094E(leadName));
        AbstractC4154l.m8921d(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        AbstractC4154l.m8922e(upperCase, "toUpperCase(...)");
        this.f19832v = upperCase;
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
        Iterator it = list.iterator();
        while (true) {
            objM4907e = null;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue == 1) {
                i12 = R.drawable.ic_in_active_sim_1;
            } else if (iIntValue != 2) {
                arrayList.add(objM4907e);
            } else {
                i12 = R.drawable.ic_in_active_sim_2;
            }
            objM4907e = Integer.valueOf(i12);
            arrayList.add(objM4907e);
        }
        this.f19833w = arrayList;
        List list4 = this.f19819i;
        C3846b c3846b2 = this.f19826p;
        if (c3846b2 != null && (lastCallDetails = c3846b2.f19803a) != null) {
            objM4907e = lastCallDetails.m4907e();
        }
        this.f19834x = AbstractC6663m.m12767z(list4, objM4907e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* renamed from: a */
    public static C3850f m8399a(C3850f c3850f, String str, String str2, int i10, String str3, Integer num, String str4, String str5, int i11, LocalDateTime localDateTime, List list, C3846b c3846b, ArrayList arrayList, String str6, boolean z6, int i12) {
        String leadId = c3850f.f19811a;
        String leadName = (i12 & 2) != 0 ? c3850f.f19812b : str;
        String leadNumber = (i12 & 4) != 0 ? c3850f.f19813c : str2;
        int i13 = (i12 & 8) != 0 ? c3850f.f19814d : i10;
        String str7 = (i12 & 16) != 0 ? c3850f.f19815e : str3;
        Integer num2 = (i12 & 32) != 0 ? c3850f.f19816f : num;
        String serialNumber = c3850f.f19817g;
        List list2 = c3850f.f19818h;
        List simNumbers = c3850f.f19819i;
        String str8 = (i12 & 512) != 0 ? c3850f.f19820j : str4;
        String str9 = (i12 & 1024) != 0 ? c3850f.f19821k : str5;
        int i14 = (i12 & NewHope.SENDB_BYTES) != 0 ? c3850f.f19822l : i11;
        LocalDateTime createDate = c3850f.f19823m;
        LocalDateTime localDateTime2 = (i12 & 8192) != 0 ? c3850f.f19824n : localDateTime;
        int i15 = i13;
        List list3 = (i12 & 16384) != 0 ? c3850f.f19825o : list;
        C3846b c3846b2 = (i12 & 32768) != 0 ? c3850f.f19826p : c3846b;
        ArrayList arrayList2 = (i12 & 65536) != 0 ? c3850f.f19827q : arrayList;
        String str10 = (i12 & 131072) != 0 ? c3850f.f19828r : str6;
        boolean z10 = (i12 & 262144) != 0 ? c3850f.f19829s : z6;
        c3850f.getClass();
        AbstractC4154l.m8923f(leadId, "leadId");
        AbstractC4154l.m8923f(leadName, "leadName");
        AbstractC4154l.m8923f(leadNumber, "leadNumber");
        AbstractC4154l.m8923f(serialNumber, "serialNumber");
        AbstractC4154l.m8923f(simNumbers, "simNumbers");
        AbstractC4154l.m8923f(createDate, "createDate");
        return new C3850f(leadId, leadName, leadNumber, i15, str7, num2, serialNumber, list2, simNumbers, str8, str9, i14, createDate, localDateTime2, list3, c3846b2, arrayList2, str10, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3850f)) {
            return false;
        }
        C3850f c3850f = (C3850f) obj;
        return AbstractC4154l.m8918a(this.f19811a, c3850f.f19811a) && AbstractC4154l.m8918a(this.f19812b, c3850f.f19812b) && AbstractC4154l.m8918a(this.f19813c, c3850f.f19813c) && this.f19814d == c3850f.f19814d && AbstractC4154l.m8918a(this.f19815e, c3850f.f19815e) && AbstractC4154l.m8918a(this.f19816f, c3850f.f19816f) && AbstractC4154l.m8918a(this.f19817g, c3850f.f19817g) && AbstractC4154l.m8918a(this.f19818h, c3850f.f19818h) && AbstractC4154l.m8918a(this.f19819i, c3850f.f19819i) && AbstractC4154l.m8918a(this.f19820j, c3850f.f19820j) && AbstractC4154l.m8918a(this.f19821k, c3850f.f19821k) && this.f19822l == c3850f.f19822l && AbstractC4154l.m8918a(this.f19823m, c3850f.f19823m) && AbstractC4154l.m8918a(this.f19824n, c3850f.f19824n) && AbstractC4154l.m8918a(this.f19825o, c3850f.f19825o) && AbstractC4154l.m8918a(this.f19826p, c3850f.f19826p) && AbstractC4154l.m8918a(this.f19827q, c3850f.f19827q) && AbstractC4154l.m8918a(this.f19828r, c3850f.f19828r) && this.f19829s == c3850f.f19829s;
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.f19814d, AbstractC0030c.m113d(AbstractC0030c.m113d(this.f19811a.hashCode() * 31, 31, this.f19812b), 31, this.f19813c), 31);
        String str = this.f19815e;
        int iHashCode = (iM4556c + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f19816f;
        int iM4559f = AbstractC1452a.m4559f(this.f19819i, AbstractC1452a.m4559f(this.f19818h, AbstractC0030c.m113d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f19817g), 31), 31);
        String str2 = this.f19820j;
        int iHashCode2 = (iM4559f + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19821k;
        int iM7370c = m0.m7370c(this.f19823m, AbstractC1452a.m4556c(this.f19822l, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        LocalDateTime localDateTime = this.f19824n;
        int iHashCode3 = (iM7370c + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        List list = this.f19825o;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        C3846b c3846b = this.f19826p;
        int iM4559f2 = AbstractC1452a.m4559f(this.f19827q, (iHashCode4 + (c3846b == null ? 0 : c3846b.hashCode())) * 31, 31);
        String str4 = this.f19828r;
        return Boolean.hashCode(this.f19829s) + ((iM4559f2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("LeadListUIModel(leadId=", this.f19811a, ", leadName=", this.f19812b, ", leadNumber=");
        AbstractC1452a.m4551B(sbM127r, this.f19813c, ", countryCode=", this.f19814d, ", leadAlternativeNumber=");
        sbM127r.append(this.f19815e);
        sbM127r.append(", alternativeCountryCode=");
        sbM127r.append(this.f19816f);
        sbM127r.append(", serialNumber=");
        sbM127r.append(this.f19817g);
        sbM127r.append(", simSlot=");
        sbM127r.append(this.f19818h);
        sbM127r.append(", simNumbers=");
        sbM127r.append(this.f19819i);
        sbM127r.append(", leadStatus=");
        sbM127r.append(this.f19820j);
        sbM127r.append(", reminderDate=");
        AbstractC1452a.m4551B(sbM127r, this.f19821k, ", attemptCount=", this.f19822l, ", createDate=");
        sbM127r.append(this.f19823m);
        sbM127r.append(", modifiedDate=");
        sbM127r.append(this.f19824n);
        sbM127r.append(", tagList=");
        sbM127r.append(this.f19825o);
        sbM127r.append(", lastCallDetailUIModel=");
        sbM127r.append(this.f19826p);
        sbM127r.append(", dynamicFieldList=");
        sbM127r.append(this.f19827q);
        sbM127r.append(", note=");
        sbM127r.append(this.f19828r);
        sbM127r.append(", isAssignAll=");
        return AbstractC5601a.m11242m(sbM127r, this.f19829s, ")");
    }
}
