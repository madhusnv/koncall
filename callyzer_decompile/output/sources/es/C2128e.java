package es;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.model.response.lead.Leads;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: es.e */
/* loaded from: classes3.dex */
public final class C2128e {

    /* renamed from: a */
    public final Leads f9946a;

    /* renamed from: b */
    public final String f9947b;

    /* renamed from: c */
    public final String f9948c;

    /* renamed from: d */
    public final int f9949d;

    /* renamed from: e */
    public final String f9950e;

    /* renamed from: f */
    public final Integer f9951f;

    /* renamed from: g */
    public final String f9952g;

    /* renamed from: h */
    public final List f9953h;

    /* renamed from: i */
    public final Boolean f9954i;

    /* renamed from: j */
    public final List f9955j;

    /* renamed from: k */
    public final String f9956k;

    /* renamed from: l */
    public final String f9957l;

    /* renamed from: m */
    public final List f9958m;

    /* renamed from: n */
    public final String f9959n;

    /* renamed from: o */
    public final List f9960o;

    /* renamed from: p */
    public final String f9961p;

    public C2128e(Leads leads, String primaryNumber, String leadNumber, int i10, String str, Integer num, String str2, List list, Boolean bool, List list2, String str3, String str4, List dynamicFields, String str5, List list3, String serialNumber) {
        AbstractC4154l.m8923f(leads, "leads");
        AbstractC4154l.m8923f(primaryNumber, "primaryNumber");
        AbstractC4154l.m8923f(leadNumber, "leadNumber");
        AbstractC4154l.m8923f(dynamicFields, "dynamicFields");
        AbstractC4154l.m8923f(serialNumber, "serialNumber");
        this.f9946a = leads;
        this.f9947b = primaryNumber;
        this.f9948c = leadNumber;
        this.f9949d = i10;
        this.f9950e = str;
        this.f9951f = num;
        this.f9952g = str2;
        this.f9953h = list;
        this.f9954i = bool;
        this.f9955j = list2;
        this.f9956k = str3;
        this.f9957l = str4;
        this.f9958m = dynamicFields;
        this.f9959n = str5;
        this.f9960o = list3;
        this.f9961p = serialNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2128e)) {
            return false;
        }
        C2128e c2128e = (C2128e) obj;
        return AbstractC4154l.m8918a(this.f9946a, c2128e.f9946a) && AbstractC4154l.m8918a(this.f9947b, c2128e.f9947b) && AbstractC4154l.m8918a(this.f9948c, c2128e.f9948c) && this.f9949d == c2128e.f9949d && AbstractC4154l.m8918a(this.f9950e, c2128e.f9950e) && AbstractC4154l.m8918a(this.f9951f, c2128e.f9951f) && AbstractC4154l.m8918a(this.f9952g, c2128e.f9952g) && AbstractC4154l.m8918a(this.f9953h, c2128e.f9953h) && AbstractC4154l.m8918a(this.f9954i, c2128e.f9954i) && AbstractC4154l.m8918a(this.f9955j, c2128e.f9955j) && AbstractC4154l.m8918a(this.f9956k, c2128e.f9956k) && AbstractC4154l.m8918a(this.f9957l, c2128e.f9957l) && AbstractC4154l.m8918a(this.f9958m, c2128e.f9958m) && AbstractC4154l.m8918a(this.f9959n, c2128e.f9959n) && AbstractC4154l.m8918a(this.f9960o, c2128e.f9960o) && AbstractC4154l.m8918a(this.f9961p, c2128e.f9961p);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.f9949d, AbstractC0030c.m113d(AbstractC0030c.m113d(this.f9946a.hashCode() * 31, 31, this.f9947b), 31, this.f9948c), 31);
        String str = this.f9950e;
        int iHashCode = (iM4556c + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f9951f;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f9952g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f9953h;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f9954i;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list2 = this.f9955j;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.f9956k;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9957l;
        int iM4559f = AbstractC1452a.m4559f(this.f9958m, (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.f9959n;
        return this.f9961p.hashCode() + AbstractC1452a.m4559f(this.f9960o, (iM4559f + (str5 != null ? str5.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeadDetailsUiModel(leads=");
        sb2.append(this.f9946a);
        sb2.append(", primaryNumber=");
        sb2.append(this.f9947b);
        sb2.append(", leadNumber=");
        AbstractC1452a.m4551B(sb2, this.f9948c, ", leadCountryCode=", this.f9949d, ", leadSecNumber=");
        sb2.append(this.f9950e);
        sb2.append(", leadSecCountryCode=");
        sb2.append(this.f9951f);
        sb2.append(", secondaryNumber=");
        sb2.append(this.f9952g);
        sb2.append(", leadTags=");
        sb2.append(this.f9953h);
        sb2.append(", isAssignedToAll=");
        sb2.append(this.f9954i);
        sb2.append(", assignedTo=");
        sb2.append(this.f9955j);
        sb2.append(", leadStatus=");
        a1.m14319B(sb2, this.f9956k, ", simNumber=", this.f9957l, ", dynamicFields=");
        sb2.append(this.f9958m);
        sb2.append(", email=");
        sb2.append(this.f9959n);
        sb2.append(", simIcon=");
        sb2.append(this.f9960o);
        sb2.append(", serialNumber=");
        sb2.append(this.f9961p);
        sb2.append(")");
        return sb2.toString();
    }
}
