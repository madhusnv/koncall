package om;

import a2.AbstractC0030c;
import android.os.Parcel;
import android.os.Parcelable;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lf.C4462m;
import p020v.a1;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.p */
/* loaded from: classes3.dex */
public final class C5414p implements Parcelable {
    public static final Parcelable.Creator<C5414p> CREATOR = new C4462m(11);

    /* renamed from: a */
    public final int f27184a;

    /* renamed from: b */
    public final long f27185b;

    /* renamed from: c */
    public final String f27186c;

    /* renamed from: d */
    public final boolean f27187d;

    /* renamed from: e */
    public final String f27188e;

    /* renamed from: f */
    public final String f27189f;

    /* renamed from: g */
    public final int f27190g;

    /* renamed from: h */
    public final EnumC8994d f27191h;

    /* renamed from: j */
    public final LocalDateTime f27192j;

    /* renamed from: k */
    public final long f27193k;

    /* renamed from: l */
    public final String f27194l;

    public C5414p(int i10, long j6, String str, boolean z6, String name, String number, int i11, EnumC8994d callType, LocalDateTime datetime, long j10, String simNumber) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(datetime, "datetime");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        this.f27184a = i10;
        this.f27185b = j6;
        this.f27186c = str;
        this.f27187d = z6;
        this.f27188e = name;
        this.f27189f = number;
        this.f27190g = i11;
        this.f27191h = callType;
        this.f27192j = datetime;
        this.f27193k = j10;
        this.f27194l = simNumber;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5414p)) {
            return false;
        }
        C5414p c5414p = (C5414p) obj;
        return this.f27184a == c5414p.f27184a && this.f27185b == c5414p.f27185b && AbstractC4154l.m8918a(this.f27186c, c5414p.f27186c) && this.f27187d == c5414p.f27187d && AbstractC4154l.m8918a(this.f27188e, c5414p.f27188e) && AbstractC4154l.m8918a(this.f27189f, c5414p.f27189f) && this.f27190g == c5414p.f27190g && this.f27191h == c5414p.f27191h && AbstractC4154l.m8918a(this.f27192j, c5414p.f27192j) && this.f27193k == c5414p.f27193k && AbstractC4154l.m8918a(this.f27194l, c5414p.f27194l);
    }

    public final int hashCode() {
        int iM4557d = AbstractC1452a.m4557d(Integer.hashCode(this.f27184a) * 31, 31, this.f27185b);
        String str = this.f27186c;
        return this.f27194l.hashCode() + AbstractC1452a.m4557d(m0.m7370c(this.f27192j, (this.f27191h.hashCode() + AbstractC1452a.m4556c(this.f27190g, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e((iM4557d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f27187d), 31, this.f27188e), 31, this.f27189f), 31)) * 31, 31), 31, this.f27193k);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NoteCallLog(id=");
        sb2.append(this.f27184a);
        sb2.append(", callLogId=");
        sb2.append(this.f27185b);
        sb2.append(", notes=");
        sb2.append(this.f27186c);
        sb2.append(", isLeadCallLog=");
        sb2.append(this.f27187d);
        a1.m14319B(sb2, ", name=", this.f27188e, ", number=", this.f27189f);
        sb2.append(", countryCode=");
        sb2.append(this.f27190g);
        sb2.append(", callType=");
        sb2.append(this.f27191h);
        sb2.append(", datetime=");
        sb2.append(this.f27192j);
        sb2.append(", duration=");
        sb2.append(this.f27193k);
        sb2.append(", simNumber=");
        sb2.append(this.f27194l);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(this.f27184a);
        dest.writeLong(this.f27185b);
        dest.writeString(this.f27186c);
        dest.writeInt(this.f27187d ? 1 : 0);
        dest.writeString(this.f27188e);
        dest.writeString(this.f27189f);
        dest.writeInt(this.f27190g);
        dest.writeString(this.f27191h.name());
        dest.writeSerializable(this.f27192j);
        dest.writeLong(this.f27193k);
        dest.writeString(this.f27194l);
    }
}
