package om;

import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4792c;
import p020v.a1;
import zm.EnumC8993c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.d */
/* loaded from: classes3.dex */
public final class C5402d {

    /* renamed from: a */
    public final int f27104a;

    /* renamed from: b */
    public final C4792c f27105b;

    /* renamed from: c */
    public final String f27106c;

    /* renamed from: d */
    public final EnumC8993c f27107d;

    /* renamed from: e */
    public final String f27108e;

    /* renamed from: f */
    public final String f27109f;

    /* renamed from: g */
    public final String f27110g;

    /* renamed from: h */
    public final String f27111h;

    /* renamed from: i */
    public final boolean f27112i;

    /* renamed from: j */
    public final Integer f27113j;

    /* renamed from: k */
    public final boolean f27114k;

    /* renamed from: l */
    public final LocalDateTime f27115l;

    /* renamed from: m */
    public final LocalDateTime f27116m;

    /* renamed from: n */
    public final LocalDateTime f27117n;

    /* renamed from: o */
    public final LocalDateTime f27118o;

    public C5402d(int i10, C4792c c4792c, String str, EnumC8993c enumC8993c, String str2, String str3, String str4, String str5, boolean z6, Integer num, boolean z10, LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3, LocalDateTime localDateTime4) {
        this.f27104a = i10;
        this.f27105b = c4792c;
        this.f27106c = str;
        this.f27107d = enumC8993c;
        this.f27108e = str2;
        this.f27109f = str3;
        this.f27110g = str4;
        this.f27111h = str5;
        this.f27112i = z6;
        this.f27113j = num;
        this.f27114k = z10;
        this.f27115l = localDateTime;
        this.f27116m = localDateTime2;
        this.f27117n = localDateTime3;
        this.f27118o = localDateTime4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5402d)) {
            return false;
        }
        C5402d c5402d = (C5402d) obj;
        return this.f27104a == c5402d.f27104a && AbstractC4154l.m8918a(this.f27105b, c5402d.f27105b) && AbstractC4154l.m8918a(this.f27106c, c5402d.f27106c) && this.f27107d == c5402d.f27107d && AbstractC4154l.m8918a(this.f27108e, c5402d.f27108e) && AbstractC4154l.m8918a(this.f27109f, c5402d.f27109f) && AbstractC4154l.m8918a(this.f27110g, c5402d.f27110g) && AbstractC4154l.m8918a(this.f27111h, c5402d.f27111h) && this.f27112i == c5402d.f27112i && AbstractC4154l.m8918a(this.f27113j, c5402d.f27113j) && this.f27114k == c5402d.f27114k && AbstractC4154l.m8918a(this.f27115l, c5402d.f27115l) && AbstractC4154l.m8918a(this.f27116m, c5402d.f27116m) && AbstractC4154l.m8918a(this.f27117n, c5402d.f27117n) && AbstractC4154l.m8918a(this.f27118o, c5402d.f27118o);
    }

    public final int hashCode() {
        int iHashCode = (this.f27105b.hashCode() + (Integer.hashCode(this.f27104a) * 31)) * 31;
        String str = this.f27106c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC8993c enumC8993c = this.f27107d;
        int iHashCode3 = (iHashCode2 + (enumC8993c == null ? 0 : enumC8993c.hashCode())) * 31;
        String str2 = this.f27108e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27109f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f27110g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f27111h;
        int iM4558e = AbstractC1452a.m4558e((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f27112i);
        Integer num = this.f27113j;
        int iM4558e2 = AbstractC1452a.m4558e((iM4558e + (num == null ? 0 : num.hashCode())) * 31, 31, this.f27114k);
        LocalDateTime localDateTime = this.f27115l;
        int iHashCode7 = (iM4558e2 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.f27116m;
        int iHashCode8 = (iHashCode7 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
        LocalDateTime localDateTime3 = this.f27117n;
        int iHashCode9 = (iHashCode8 + (localDateTime3 == null ? 0 : localDateTime3.hashCode())) * 31;
        LocalDateTime localDateTime4 = this.f27118o;
        return iHashCode9 + (localDateTime4 != null ? localDateTime4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallLogUserSimView(id=");
        sb2.append(this.f27104a);
        sb2.append(", callLogDetails=");
        sb2.append(this.f27105b);
        sb2.append(", userName=");
        sb2.append(this.f27106c);
        sb2.append(", callRecordSyncStatus=");
        sb2.append(this.f27107d);
        sb2.append(", callRecordingSourcePath=");
        a1.m14319B(sb2, this.f27108e, ", callRecordCompressPath=", this.f27109f, ", callRecordWebPath=");
        a1.m14319B(sb2, this.f27110g, ", notes=", this.f27111h, ", isLeadCallLog=");
        sb2.append(this.f27112i);
        sb2.append(", simPosition=");
        sb2.append(this.f27113j);
        sb2.append(", isCallRecordingEnable=");
        sb2.append(this.f27114k);
        sb2.append(", syncStartDateTime=");
        sb2.append(this.f27115l);
        sb2.append(", syncEndDateTime=");
        sb2.append(this.f27116m);
        sb2.append(", callRecordingStartDateTime=");
        sb2.append(this.f27117n);
        sb2.append(", callRecordingEndDateTime=");
        sb2.append(this.f27118o);
        sb2.append(")");
        return sb2.toString();
    }
}
