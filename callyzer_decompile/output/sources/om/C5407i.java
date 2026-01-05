package om;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;
import zm.EnumC8993c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.i */
/* loaded from: classes3.dex */
public final class C5407i {

    /* renamed from: a */
    public final int f27143a;

    /* renamed from: b */
    public final String f27144b;

    /* renamed from: c */
    public final String f27145c;

    /* renamed from: d */
    public final int f27146d;

    /* renamed from: e */
    public final EnumC8994d f27147e;

    /* renamed from: f */
    public final LocalDateTime f27148f;

    /* renamed from: g */
    public final long f27149g;

    /* renamed from: h */
    public final String f27150h;

    /* renamed from: i */
    public final Integer f27151i;

    /* renamed from: j */
    public final EnumC8993c f27152j;

    /* renamed from: k */
    public final String f27153k;

    /* renamed from: l */
    public final String f27154l;

    /* renamed from: m */
    public final String f27155m;

    /* renamed from: n */
    public final String f27156n;

    public C5407i(int i10, String name, String number, int i11, EnumC8994d callType, LocalDateTime localDateTime, long j6, String str, Integer num, EnumC8993c enumC8993c, String str2, String str3, String str4, String simNumber) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        this.f27143a = i10;
        this.f27144b = name;
        this.f27145c = number;
        this.f27146d = i11;
        this.f27147e = callType;
        this.f27148f = localDateTime;
        this.f27149g = j6;
        this.f27150h = str;
        this.f27151i = num;
        this.f27152j = enumC8993c;
        this.f27153k = str2;
        this.f27154l = str3;
        this.f27155m = str4;
        this.f27156n = simNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5407i)) {
            return false;
        }
        C5407i c5407i = (C5407i) obj;
        return this.f27143a == c5407i.f27143a && AbstractC4154l.m8918a(this.f27144b, c5407i.f27144b) && AbstractC4154l.m8918a(this.f27145c, c5407i.f27145c) && this.f27146d == c5407i.f27146d && this.f27147e == c5407i.f27147e && AbstractC4154l.m8918a(this.f27148f, c5407i.f27148f) && this.f27149g == c5407i.f27149g && AbstractC4154l.m8918a(this.f27150h, c5407i.f27150h) && AbstractC4154l.m8918a(this.f27151i, c5407i.f27151i) && this.f27152j == c5407i.f27152j && AbstractC4154l.m8918a(this.f27153k, c5407i.f27153k) && AbstractC4154l.m8918a(this.f27154l, c5407i.f27154l) && AbstractC4154l.m8918a(this.f27155m, c5407i.f27155m) && AbstractC4154l.m8918a(this.f27156n, c5407i.f27156n);
    }

    public final int hashCode() {
        int iM4557d = AbstractC1452a.m4557d(m0.m7370c(this.f27148f, (this.f27147e.hashCode() + AbstractC1452a.m4556c(this.f27146d, AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f27143a) * 31, 31, this.f27144b), 31, this.f27145c), 31)) * 31, 31), 31, this.f27149g);
        String str = this.f27150h;
        int iHashCode = (iM4557d + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f27151i;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        EnumC8993c enumC8993c = this.f27152j;
        int iHashCode3 = (iHashCode2 + (enumC8993c == null ? 0 : enumC8993c.hashCode())) * 31;
        String str2 = this.f27153k;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27154l;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f27155m;
        return this.f27156n.hashCode() + ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f27143a, "ContactDetailCallHist(id=", ", name=", this.f27144b, ", number=");
        AbstractC1452a.m4551B(sbM14337q, this.f27145c, ", countryCode=", this.f27146d, ", callType=");
        sbM14337q.append(this.f27147e);
        sbM14337q.append(", datetime=");
        sbM14337q.append(this.f27148f);
        sbM14337q.append(", duration=");
        sbM14337q.append(this.f27149g);
        sbM14337q.append(", note=");
        sbM14337q.append(this.f27150h);
        sbM14337q.append(", simPosition=");
        sbM14337q.append(this.f27151i);
        sbM14337q.append(", callRecordSyncStatus=");
        sbM14337q.append(this.f27152j);
        a1.m14319B(sbM14337q, ", callRecordingSourcePath=", this.f27153k, ", callRecordCompressPath=", this.f27154l);
        a1.m14319B(sbM14337q, ", callRecordWebPath=", this.f27155m, ", simNumber=", this.f27156n);
        sbM14337q.append(")");
        return sbM14337q.toString();
    }
}
