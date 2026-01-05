package kq;

import a2.AbstractC0030c;
import android.os.Parcel;
import android.os.Parcelable;
import com.sun.mail.util.AbstractC1452a;
import gg.b0;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;
import zm.EnumC8993c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kq.k */
/* loaded from: classes3.dex */
public final class C4181k implements Parcelable {
    public static final Parcelable.Creator<C4181k> CREATOR = new b0(26);

    /* renamed from: B */
    public final int f21188B;

    /* renamed from: C */
    public final String f21189C;

    /* renamed from: a */
    public final int f21190a;

    /* renamed from: b */
    public final String f21191b;

    /* renamed from: c */
    public final String f21192c;

    /* renamed from: d */
    public final int f21193d;

    /* renamed from: e */
    public final EnumC8994d f21194e;

    /* renamed from: f */
    public final LocalDateTime f21195f;

    /* renamed from: g */
    public final long f21196g;

    /* renamed from: h */
    public final EnumC8993c f21197h;

    /* renamed from: j */
    public final String f21198j;

    /* renamed from: k */
    public final String f21199k;

    /* renamed from: l */
    public final boolean f21200l;

    /* renamed from: m */
    public final String f21201m;

    /* renamed from: n */
    public final String f21202n;

    /* renamed from: p */
    public final Integer f21203p;

    /* renamed from: q */
    public final Boolean f21204q;

    /* renamed from: r */
    public final boolean f21205r;

    /* renamed from: s */
    public final List f21206s;

    /* renamed from: t */
    public final int f21207t;

    /* renamed from: v */
    public final Integer f21208v;

    /* renamed from: w */
    public final String f21209w;

    /* renamed from: x */
    public final String f21210x;

    /* renamed from: y */
    public final String f21211y;

    /* renamed from: z */
    public final String f21212z;

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4181k(int r11, java.lang.String r12, java.lang.String r13, int r14, zm.EnumC8994d r15, j$.time.LocalDateTime r16, long r17, zm.EnumC8993c r19, java.lang.String r20, java.lang.String r21, boolean r22, java.lang.String r23, java.lang.String r24, java.lang.Integer r25, java.lang.Boolean r26, boolean r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.C4181k.<init>(int, java.lang.String, java.lang.String, int, zm.d, j$.time.LocalDateTime, long, zm.c, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, boolean, java.util.List):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4181k)) {
            return false;
        }
        C4181k c4181k = (C4181k) obj;
        return this.f21190a == c4181k.f21190a && AbstractC4154l.m8918a(this.f21191b, c4181k.f21191b) && AbstractC4154l.m8918a(this.f21192c, c4181k.f21192c) && this.f21193d == c4181k.f21193d && this.f21194e == c4181k.f21194e && AbstractC4154l.m8918a(this.f21195f, c4181k.f21195f) && this.f21196g == c4181k.f21196g && this.f21197h == c4181k.f21197h && AbstractC4154l.m8918a(this.f21198j, c4181k.f21198j) && AbstractC4154l.m8918a(this.f21199k, c4181k.f21199k) && this.f21200l == c4181k.f21200l && AbstractC4154l.m8918a(this.f21201m, c4181k.f21201m) && AbstractC4154l.m8918a(this.f21202n, c4181k.f21202n) && AbstractC4154l.m8918a(this.f21203p, c4181k.f21203p) && AbstractC4154l.m8918a(this.f21204q, c4181k.f21204q) && this.f21205r == c4181k.f21205r && AbstractC4154l.m8918a(this.f21206s, c4181k.f21206s);
    }

    public final int hashCode() {
        int iM4557d = AbstractC1452a.m4557d(m0.m7370c(this.f21195f, (this.f21194e.hashCode() + AbstractC1452a.m4556c(this.f21193d, AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f21190a) * 31, 31, this.f21191b), 31, this.f21192c), 31)) * 31, 31), 31, this.f21196g);
        EnumC8993c enumC8993c = this.f21197h;
        int iHashCode = (iM4557d + (enumC8993c == null ? 0 : enumC8993c.hashCode())) * 31;
        String str = this.f21198j;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21199k;
        int iM4558e = AbstractC1452a.m4558e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f21200l);
        String str3 = this.f21201m;
        int iM113d = AbstractC0030c.m113d((iM4558e + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f21202n);
        Integer num = this.f21203p;
        int iHashCode3 = (iM113d + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f21204q;
        return this.f21206s.hashCode() + AbstractC1452a.m4558e((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f21205r);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f21190a, "CallHistoryUiModel(id=", ", name=", this.f21191b, ", number=");
        AbstractC1452a.m4551B(sbM14337q, this.f21192c, ", countryCode=", this.f21193d, ", mCallType=");
        sbM14337q.append(this.f21194e);
        sbM14337q.append(", mDateTime=");
        sbM14337q.append(this.f21195f);
        sbM14337q.append(", duration=");
        sbM14337q.append(this.f21196g);
        sbM14337q.append(", callRecordingSyncStatus=");
        sbM14337q.append(this.f21197h);
        a1.m14319B(sbM14337q, ", callRecordingSourcePath=", this.f21198j, ", callRecordingWebPath=", this.f21199k);
        sbM14337q.append(", canCallRecordingAttach=");
        sbM14337q.append(this.f21200l);
        sbM14337q.append(", notes=");
        sbM14337q.append(this.f21201m);
        sbM14337q.append(", mSimNumber=");
        sbM14337q.append(this.f21202n);
        sbM14337q.append(", mSimPosition=");
        sbM14337q.append(this.f21203p);
        sbM14337q.append(", isLeadCallLog=");
        sbM14337q.append(this.f21204q);
        sbM14337q.append(", isLeadSubscription=");
        sbM14337q.append(this.f21205r);
        sbM14337q.append(", actionItemList=");
        sbM14337q.append(this.f21206s);
        sbM14337q.append(")");
        return sbM14337q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeInt(this.f21190a);
        dest.writeString(this.f21191b);
        dest.writeString(this.f21192c);
        dest.writeInt(this.f21193d);
        dest.writeString(this.f21194e.name());
        dest.writeSerializable(this.f21195f);
        dest.writeLong(this.f21196g);
        EnumC8993c enumC8993c = this.f21197h;
        if (enumC8993c == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC8993c.name());
        }
        dest.writeString(this.f21198j);
        dest.writeString(this.f21199k);
        dest.writeInt(this.f21200l ? 1 : 0);
        dest.writeString(this.f21201m);
        dest.writeString(this.f21202n);
        Integer num = this.f21203p;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Boolean bool = this.f21204q;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeInt(this.f21205r ? 1 : 0);
        List list = this.f21206s;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), i10);
        }
    }
}
