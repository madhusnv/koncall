package ws;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ws.q */
/* loaded from: classes3.dex */
public final class C8176q {

    /* renamed from: a */
    public final int f39099a;

    /* renamed from: b */
    public final long f39100b;

    /* renamed from: c */
    public final String f39101c;

    /* renamed from: d */
    public final String f39102d;

    /* renamed from: e */
    public final LocalDateTime f39103e;

    /* renamed from: f */
    public final String f39104f;

    /* renamed from: g */
    public final String f39105g;

    /* renamed from: h */
    public final String f39106h;

    /* renamed from: i */
    public final String f39107i;

    /* renamed from: j */
    public final String f39108j;

    /* renamed from: k */
    public final String f39109k;

    /* renamed from: l */
    public final String f39110l;

    /* renamed from: m */
    public final String f39111m;

    /* renamed from: n */
    public final List f39112n;

    /* renamed from: o */
    public final String f39113o;

    /* renamed from: p */
    public final int f39114p;

    public C8176q(int i10, long j6, String str, String str2, LocalDateTime dateTime, String contact, String str3, String str4, String simcountryCode, String contactCountryCode, String hour, String min, String sec, List errorList, String str5) {
        AbstractC4154l.m8923f(dateTime, "dateTime");
        AbstractC4154l.m8923f(contact, "contact");
        AbstractC4154l.m8923f(simcountryCode, "simcountryCode");
        AbstractC4154l.m8923f(contactCountryCode, "contactCountryCode");
        AbstractC4154l.m8923f(hour, "hour");
        AbstractC4154l.m8923f(min, "min");
        AbstractC4154l.m8923f(sec, "sec");
        AbstractC4154l.m8923f(errorList, "errorList");
        this.f39099a = i10;
        this.f39100b = j6;
        this.f39101c = str;
        this.f39102d = str2;
        this.f39103e = dateTime;
        this.f39104f = contact;
        this.f39105g = str3;
        this.f39106h = str4;
        this.f39107i = simcountryCode;
        this.f39108j = contactCountryCode;
        this.f39109k = hour;
        this.f39110l = min;
        this.f39111m = sec;
        this.f39112n = errorList;
        this.f39113o = str5;
        this.f39114p = R.drawable.ic_in_active_sim_1;
    }

    /* renamed from: a */
    public static C8176q m15339a(C8176q c8176q, String str, String str2, String str3, String str4, String str5, String str6, List list, int i10) {
        int i11 = c8176q.f39099a;
        long j6 = c8176q.f39100b;
        String str7 = c8176q.f39101c;
        String str8 = (i10 & 8) != 0 ? c8176q.f39102d : str;
        LocalDateTime dateTime = c8176q.f39103e;
        String contact = c8176q.f39104f;
        String str9 = (i10 & 64) != 0 ? c8176q.f39105g : str2;
        String str10 = (i10 & 128) != 0 ? c8176q.f39106h : str3;
        String simcountryCode = c8176q.f39107i;
        String contactCountryCode = c8176q.f39108j;
        String hour = (i10 & 1024) != 0 ? c8176q.f39109k : str4;
        String min = (i10 & NewHope.SENDB_BYTES) != 0 ? c8176q.f39110l : str5;
        String sec = (i10 & 4096) != 0 ? c8176q.f39111m : str6;
        List errorList = (i10 & 8192) != 0 ? c8176q.f39112n : list;
        String str11 = c8176q.f39113o;
        c8176q.getClass();
        AbstractC4154l.m8923f(dateTime, "dateTime");
        AbstractC4154l.m8923f(contact, "contact");
        AbstractC4154l.m8923f(simcountryCode, "simcountryCode");
        AbstractC4154l.m8923f(contactCountryCode, "contactCountryCode");
        AbstractC4154l.m8923f(hour, "hour");
        AbstractC4154l.m8923f(min, "min");
        AbstractC4154l.m8923f(sec, "sec");
        AbstractC4154l.m8923f(errorList, "errorList");
        return new C8176q(i11, j6, str7, str8, dateTime, contact, str9, str10, simcountryCode, contactCountryCode, hour, min, sec, errorList, str11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8176q)) {
            return false;
        }
        C8176q c8176q = (C8176q) obj;
        return this.f39099a == c8176q.f39099a && this.f39100b == c8176q.f39100b && AbstractC4154l.m8918a(this.f39101c, c8176q.f39101c) && AbstractC4154l.m8918a(this.f39102d, c8176q.f39102d) && AbstractC4154l.m8918a(this.f39103e, c8176q.f39103e) && AbstractC4154l.m8918a(this.f39104f, c8176q.f39104f) && AbstractC4154l.m8918a(this.f39105g, c8176q.f39105g) && AbstractC4154l.m8918a(this.f39106h, c8176q.f39106h) && AbstractC4154l.m8918a(this.f39107i, c8176q.f39107i) && AbstractC4154l.m8918a(this.f39108j, c8176q.f39108j) && AbstractC4154l.m8918a(this.f39109k, c8176q.f39109k) && AbstractC4154l.m8918a(this.f39110l, c8176q.f39110l) && AbstractC4154l.m8918a(this.f39111m, c8176q.f39111m) && AbstractC4154l.m8918a(this.f39112n, c8176q.f39112n) && AbstractC4154l.m8918a(this.f39113o, c8176q.f39113o);
    }

    public final int hashCode() {
        int iM4557d = AbstractC1452a.m4557d(Integer.hashCode(this.f39099a) * 31, 31, this.f39100b);
        String str = this.f39101c;
        int iHashCode = (iM4557d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39102d;
        int iM113d = AbstractC0030c.m113d(m0.m7370c(this.f39103e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.f39104f);
        String str3 = this.f39105g;
        int iHashCode2 = (iM113d + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39106h;
        int iM4559f = AbstractC1452a.m4559f(this.f39112n, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f39107i), 31, this.f39108j), 31, this.f39109k), 31, this.f39110l), 31, this.f39111m), 31);
        String str5 = this.f39113o;
        return iM4559f + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CorruptCallLogUIModel(id=");
        sb2.append(this.f39099a);
        sb2.append(", callLogId=");
        sb2.append(this.f39100b);
        a1.m14319B(sb2, ", name=", this.f39101c, ", simNumber=", this.f39102d);
        sb2.append(", dateTime=");
        sb2.append(this.f39103e);
        sb2.append(", contact=");
        sb2.append(this.f39104f);
        a1.m14319B(sb2, ", callType=", this.f39105g, ", callDuration=", this.f39106h);
        a1.m14319B(sb2, ", simcountryCode=", this.f39107i, ", contactCountryCode=", this.f39108j);
        a1.m14319B(sb2, ", hour=", this.f39109k, ", min=", this.f39110l);
        sb2.append(", sec=");
        sb2.append(this.f39111m);
        sb2.append(", errorList=");
        sb2.append(this.f39112n);
        return a1.m14335o(sb2, ", phoneAccountId=", this.f39113o, ")");
    }
}
