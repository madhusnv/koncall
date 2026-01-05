package rt;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rt.a */
/* loaded from: classes3.dex */
public final class C6617a {

    /* renamed from: a */
    public final String f31771a;

    /* renamed from: b */
    public final String f31772b;

    /* renamed from: c */
    public final String f31773c;

    /* renamed from: d */
    public final String f31774d;

    /* renamed from: e */
    public final EnumC8994d f31775e;

    /* renamed from: f */
    public final LocalDateTime f31776f;

    /* renamed from: g */
    public final String f31777g;

    /* renamed from: h */
    public final String f31778h;

    /* renamed from: i */
    public final int f31779i;

    /* renamed from: j */
    public final String f31780j;

    /* renamed from: k */
    public final String f31781k;

    /* renamed from: l */
    public final String f31782l;

    public C6617a(String name, String number, String empNumber, String countryCode, EnumC8994d enumC8994d, LocalDateTime localDateTime, String str, String fromWhere, int i10, String secondaryNumber, String secondaryCountryCode, String callRecordingUrl) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(empNumber, "empNumber");
        AbstractC4154l.m8923f(countryCode, "countryCode");
        AbstractC4154l.m8923f(fromWhere, "fromWhere");
        AbstractC4154l.m8923f(secondaryNumber, "secondaryNumber");
        AbstractC4154l.m8923f(secondaryCountryCode, "secondaryCountryCode");
        AbstractC4154l.m8923f(callRecordingUrl, "callRecordingUrl");
        this.f31771a = name;
        this.f31772b = number;
        this.f31773c = empNumber;
        this.f31774d = countryCode;
        this.f31775e = enumC8994d;
        this.f31776f = localDateTime;
        this.f31777g = str;
        this.f31778h = fromWhere;
        this.f31779i = i10;
        this.f31780j = secondaryNumber;
        this.f31781k = secondaryCountryCode;
        this.f31782l = callRecordingUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6617a)) {
            return false;
        }
        C6617a c6617a = (C6617a) obj;
        return AbstractC4154l.m8918a(this.f31771a, c6617a.f31771a) && AbstractC4154l.m8918a(this.f31772b, c6617a.f31772b) && AbstractC4154l.m8918a(this.f31773c, c6617a.f31773c) && AbstractC4154l.m8918a(this.f31774d, c6617a.f31774d) && this.f31775e == c6617a.f31775e && AbstractC4154l.m8918a(this.f31776f, c6617a.f31776f) && AbstractC4154l.m8918a(this.f31777g, c6617a.f31777g) && AbstractC4154l.m8918a(this.f31778h, c6617a.f31778h) && this.f31779i == c6617a.f31779i && AbstractC4154l.m8918a(this.f31780j, c6617a.f31780j) && AbstractC4154l.m8918a(this.f31781k, c6617a.f31781k) && AbstractC4154l.m8918a(this.f31782l, c6617a.f31782l);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(this.f31771a.hashCode() * 31, 31, this.f31772b), 31, this.f31773c), 31, this.f31774d);
        EnumC8994d enumC8994d = this.f31775e;
        int iHashCode = (iM113d + (enumC8994d == null ? 0 : enumC8994d.hashCode())) * 31;
        LocalDateTime localDateTime = this.f31776f;
        int iHashCode2 = (iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        String str = this.f31777g;
        return this.f31782l.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f31779i, AbstractC0030c.m113d((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f31778h), 31), 31, this.f31780j), 31, this.f31781k);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("CallLogData(name=", this.f31771a, ", number=", this.f31772b, ", empNumber=");
        a1.m14319B(sbM127r, this.f31773c, ", countryCode=", this.f31774d, ", mCallType=");
        sbM127r.append(this.f31775e);
        sbM127r.append(", mDateTime=");
        sbM127r.append(this.f31776f);
        sbM127r.append(", duration=");
        a1.m14319B(sbM127r, this.f31777g, ", fromWhere=", this.f31778h, ", selectedSimP=");
        AbstractC1452a.m4550A(sbM127r, this.f31779i, ", secondaryNumber=", this.f31780j, ", secondaryCountryCode=");
        return AbstractC0030c.m124o(sbM127r, this.f31781k, ", callRecordingUrl=", this.f31782l, ")");
    }

    public /* synthetic */ C6617a(String str, String str2, String str3, String str4, EnumC8994d enumC8994d, LocalDateTime localDateTime, String str5, String str6, int i10, String str7, String str8, String str9, int i11) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? null : enumC8994d, (i11 & 32) == 0 ? localDateTime : null, (i11 & 64) != 0 ? "0" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) != 0 ? 1 : i10, (i11 & 512) != 0 ? "" : str7, (i11 & 1024) != 0 ? "" : str8, (i11 & NewHope.SENDB_BYTES) != 0 ? "" : str9);
    }
}
