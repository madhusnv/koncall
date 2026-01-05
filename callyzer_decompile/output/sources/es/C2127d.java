package es;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: es.d */
/* loaded from: classes3.dex */
public final class C2127d {

    /* renamed from: a */
    public final String f9928a;

    /* renamed from: b */
    public final int f9929b;

    /* renamed from: c */
    public final String f9930c;

    /* renamed from: d */
    public final String f9931d;

    /* renamed from: e */
    public final String f9932e;

    /* renamed from: f */
    public final int f9933f;

    /* renamed from: g */
    public final String f9934g;

    /* renamed from: h */
    public final String f9935h;

    /* renamed from: i */
    public final int f9936i;

    /* renamed from: j */
    public final long f9937j;

    /* renamed from: k */
    public final String f9938k;

    /* renamed from: l */
    public final String f9939l;

    /* renamed from: m */
    public final String f9940m;

    /* renamed from: n */
    public final String f9941n;

    /* renamed from: o */
    public final String f9942o;

    /* renamed from: p */
    public final boolean f9943p;

    /* renamed from: q */
    public final String f9944q;

    /* renamed from: r */
    public final LocalDateTime f9945r;

    public C2127d(String key, int i10, String name, String numberWithCountry, String number, int i11, String duration, String callType, int i12, long j6, String str, String str2, String str3, String str4, String str5, boolean z6, String str6, LocalDateTime dateTime) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(numberWithCountry, "numberWithCountry");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(duration, "duration");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        this.f9928a = key;
        this.f9929b = i10;
        this.f9930c = name;
        this.f9931d = numberWithCountry;
        this.f9932e = number;
        this.f9933f = i11;
        this.f9934g = duration;
        this.f9935h = callType;
        this.f9936i = i12;
        this.f9937j = j6;
        this.f9938k = str;
        this.f9939l = str2;
        this.f9940m = str3;
        this.f9941n = str4;
        this.f9942o = str5;
        this.f9943p = z6;
        this.f9944q = str6;
        this.f9945r = dateTime;
    }

    /* renamed from: a */
    public static C2127d m5816a(C2127d c2127d, String str, String str2, String str3, String str4, int i10) {
        String key = c2127d.f9928a;
        int i11 = c2127d.f9929b;
        String name = c2127d.f9930c;
        String numberWithCountry = c2127d.f9931d;
        String number = c2127d.f9932e;
        int i12 = c2127d.f9933f;
        String duration = c2127d.f9934g;
        String callType = c2127d.f9935h;
        int i13 = c2127d.f9936i;
        long j6 = c2127d.f9937j;
        String str5 = c2127d.f9938k;
        String str6 = c2127d.f9939l;
        String str7 = (i10 & 4096) != 0 ? c2127d.f9940m : str;
        String str8 = (i10 & 8192) != 0 ? c2127d.f9941n : str2;
        String str9 = (i10 & 16384) != 0 ? c2127d.f9942o : str3;
        boolean z6 = c2127d.f9943p;
        LocalDateTime dateTime = c2127d.f9945r;
        c2127d.getClass();
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(numberWithCountry, "numberWithCountry");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(duration, "duration");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        return new C2127d(key, i11, name, numberWithCountry, number, i12, duration, callType, i13, j6, str5, str6, str7, str8, str9, z6, str4, dateTime);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2127d)) {
            return false;
        }
        C2127d c2127d = (C2127d) obj;
        return AbstractC4154l.m8918a(this.f9928a, c2127d.f9928a) && this.f9929b == c2127d.f9929b && AbstractC4154l.m8918a(this.f9930c, c2127d.f9930c) && AbstractC4154l.m8918a(this.f9931d, c2127d.f9931d) && AbstractC4154l.m8918a(this.f9932e, c2127d.f9932e) && this.f9933f == c2127d.f9933f && AbstractC4154l.m8918a(this.f9934g, c2127d.f9934g) && AbstractC4154l.m8918a(this.f9935h, c2127d.f9935h) && this.f9936i == c2127d.f9936i && C1565s.m5187c(this.f9937j, c2127d.f9937j) && AbstractC4154l.m8918a(this.f9938k, c2127d.f9938k) && AbstractC4154l.m8918a(this.f9939l, c2127d.f9939l) && AbstractC4154l.m8918a(this.f9940m, c2127d.f9940m) && AbstractC4154l.m8918a(this.f9941n, c2127d.f9941n) && AbstractC4154l.m8918a(this.f9942o, c2127d.f9942o) && this.f9943p == c2127d.f9943p && AbstractC4154l.m8918a(this.f9944q, c2127d.f9944q) && AbstractC4154l.m8918a(this.f9945r, c2127d.f9945r);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.f9936i, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f9933f, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f9929b, this.f9928a.hashCode() * 31, 31), 31, this.f9930c), 31, this.f9931d), 31, this.f9932e), 31), 31, this.f9934g), 31, this.f9935h), 31);
        int i10 = C1565s.f7818k;
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4557d(iM4556c, 31, this.f9937j), 31, this.f9938k), 31, this.f9939l);
        String str = this.f9940m;
        int iHashCode = (iM113d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9941n;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9942o;
        int iM4558e = AbstractC1452a.m4558e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f9943p);
        String str4 = this.f9944q;
        return this.f9945r.hashCode() + ((iM4558e + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strM5193i = C1565s.m5193i(this.f9937j);
        StringBuilder sbM125p = AbstractC0030c.m125p(this.f9929b, "LeadCallHistoryUiModel(key=", this.f9928a, ", callLogId=", ", name=");
        a1.m14319B(sbM125p, this.f9930c, ", numberWithCountry=", this.f9931d, ", number=");
        AbstractC1452a.m4551B(sbM125p, this.f9932e, ", countryCode=", this.f9933f, ", duration=");
        a1.m14319B(sbM125p, this.f9934g, ", callType=", this.f9935h, ", callTypeIcon=");
        AbstractC1452a.m4550A(sbM125p, this.f9936i, ", callTypeColor=", strM5193i, ", callDate=");
        a1.m14319B(sbM125p, this.f9938k, ", callTime=", this.f9939l, ", callStatus=");
        a1.m14319B(sbM125p, this.f9940m, ", callStatusDate=", this.f9941n, ", callStatusTime=");
        AbstractC4801l.m9749w(sbM125p, this.f9942o, ", noteEnabled=", this.f9943p, ", callNote=");
        sbM125p.append(this.f9944q);
        sbM125p.append(", dateTime=");
        sbM125p.append(this.f9945r);
        sbM125p.append(")");
        return sbM125p.toString();
    }
}
