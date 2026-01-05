package mm;

import a2.AbstractC0030c;
import android.os.Parcel;
import android.os.Parcelable;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lf.C4462m;
import og.bb;
import ox.C5770a;
import ox.EnumC5772c;
import yv.C8800o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.c */
/* loaded from: classes3.dex */
public final class C4792c implements Parcelable {
    public static final Parcelable.Creator<C4792c> CREATOR = new C4462m(8);

    /* renamed from: a */
    public final String f23844a;

    /* renamed from: b */
    public final String f23845b;

    /* renamed from: c */
    public final String f23846c;

    /* renamed from: d */
    public final int f23847d;

    /* renamed from: e */
    public final EnumC8994d f23848e;

    /* renamed from: f */
    public final LocalDateTime f23849f;

    /* renamed from: g */
    public final String f23850g;

    /* renamed from: h */
    public final Long f23851h;

    /* renamed from: j */
    public final long f23852j;

    /* renamed from: k */
    public String f23853k;

    /* renamed from: l */
    public final long f23854l;

    public C4792c(String name, String str, String number, int i10, EnumC8994d enumC8994d, LocalDateTime datetime, String str2, Long l9, long j6) {
        long jM11293d;
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(datetime, "datetime");
        this.f23844a = name;
        this.f23845b = str;
        this.f23846c = number;
        this.f23847d = i10;
        this.f23848e = enumC8994d;
        this.f23849f = datetime;
        this.f23850g = str2;
        this.f23851h = l9;
        this.f23852j = j6;
        C8800o c8800o = C8800o.f42459a;
        long jM16184H = C8800o.m16184H(datetime);
        if (l9 != null) {
            int i11 = C5770a.f28335d;
            jM11293d = C5770a.m11293d(bb.m10552h(l9.longValue(), EnumC5772c.SECONDS));
        } else {
            jM11293d = 0;
        }
        this.f23854l = jM16184H + jM11293d;
    }

    /* renamed from: a */
    public final long m9719a() {
        return this.f23854l;
    }

    /* renamed from: b */
    public final LocalDateTime m9720b() {
        return this.f23849f;
    }

    /* renamed from: c */
    public final Long m9721c() {
        return this.f23851h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4792c)) {
            return false;
        }
        C4792c c4792c = (C4792c) obj;
        return AbstractC4154l.m8918a(this.f23844a, c4792c.f23844a) && AbstractC4154l.m8918a(this.f23845b, c4792c.f23845b) && AbstractC4154l.m8918a(this.f23846c, c4792c.f23846c) && this.f23847d == c4792c.f23847d && this.f23848e == c4792c.f23848e && AbstractC4154l.m8918a(this.f23849f, c4792c.f23849f) && AbstractC4154l.m8918a(this.f23850g, c4792c.f23850g) && AbstractC4154l.m8918a(this.f23851h, c4792c.f23851h) && this.f23852j == c4792c.f23852j;
    }

    public final int hashCode() {
        int iHashCode = this.f23844a.hashCode() * 31;
        String str = this.f23845b;
        int iM4556c = AbstractC1452a.m4556c(this.f23847d, AbstractC0030c.m113d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f23846c), 31);
        EnumC8994d enumC8994d = this.f23848e;
        int iM7370c = m0.m7370c(this.f23849f, (iM4556c + (enumC8994d == null ? 0 : enumC8994d.hashCode())) * 31, 31);
        String str2 = this.f23850g;
        int iHashCode2 = (iM7370c + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l9 = this.f23851h;
        return Long.hashCode(this.f23852j) + ((iHashCode2 + (l9 != null ? l9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f23853k;
        StringBuilder sbM127r = AbstractC0030c.m127r("name := ", this.f23844a, " >>>> number := ", this.f23846c, " >>>> countryCode:= ");
        sbM127r.append(this.f23847d);
        sbM127r.append(" >>>> callType := ");
        sbM127r.append(this.f23848e);
        sbM127r.append(" >>>> dateTime := ");
        sbM127r.append(this.f23849f);
        sbM127r.append(" >>>>simNumber := ");
        sbM127r.append(this.f23850g);
        sbM127r.append(" >>> duration := ");
        sbM127r.append(this.f23851h);
        sbM127r.append(" >>>> callLogId := ");
        sbM127r.append(this.f23852j);
        return AbstractC1452a.m4564k(sbM127r, " >>>> phoneAccountId := ", str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeString(this.f23844a);
        dest.writeString(this.f23845b);
        dest.writeString(this.f23846c);
        dest.writeInt(this.f23847d);
        EnumC8994d enumC8994d = this.f23848e;
        if (enumC8994d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC8994d.name());
        }
        dest.writeSerializable(this.f23849f);
        dest.writeString(this.f23850g);
        Long l9 = this.f23851h;
        if (l9 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l9.longValue());
        }
        dest.writeLong(this.f23852j);
    }

    public /* synthetic */ C4792c(String str, String str2, int i10, EnumC8994d enumC8994d, LocalDateTime localDateTime, String str3, Long l9, long j6, int i11) {
        this(str, (i11 & 2) != 0 ? null : "cool1", str2, i10, enumC8994d, localDateTime, str3, l9, (i11 & 256) != 0 ? 0L : j6);
    }
}
