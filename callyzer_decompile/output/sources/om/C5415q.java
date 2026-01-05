package om;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.q */
/* loaded from: classes3.dex */
public final class C5415q {

    /* renamed from: a */
    public final int f27195a;

    /* renamed from: b */
    public final long f27196b;

    /* renamed from: c */
    public final String f27197c;

    /* renamed from: d */
    public final boolean f27198d;

    /* renamed from: e */
    public final String f27199e;

    /* renamed from: f */
    public final String f27200f;

    /* renamed from: g */
    public final String f27201g;

    /* renamed from: h */
    public final int f27202h;

    /* renamed from: i */
    public final EnumC8994d f27203i;

    /* renamed from: j */
    public final LocalDateTime f27204j;

    /* renamed from: k */
    public final Long f27205k;

    /* renamed from: l */
    public final int f27206l;

    /* renamed from: m */
    public final String f27207m;

    /* renamed from: n */
    public final String f27208n;

    /* renamed from: o */
    public final String f27209o;

    /* renamed from: p */
    public final boolean f27210p;

    /* renamed from: q */
    public final boolean f27211q;

    /* renamed from: r */
    public final boolean f27212r;

    public C5415q(int i10, long j6, String str, boolean z6, String str2, String name, String number, int i11, EnumC8994d enumC8994d, LocalDateTime datetime, Long l9, int i12, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(datetime, "datetime");
        this.f27195a = i10;
        this.f27196b = j6;
        this.f27197c = str;
        this.f27198d = z6;
        this.f27199e = str2;
        this.f27200f = name;
        this.f27201g = number;
        this.f27202h = i11;
        this.f27203i = enumC8994d;
        this.f27204j = datetime;
        this.f27205k = l9;
        this.f27206l = i12;
        this.f27207m = str3;
        this.f27208n = str4;
        this.f27209o = str5;
        this.f27210p = z10;
        this.f27211q = z11;
        this.f27212r = z12;
    }

    /* renamed from: a */
    public static C5415q m11122a(C5415q c5415q, String str, String str2, String str3, EnumC8994d enumC8994d, Long l9, int i10, String str4, int i11) {
        int i12 = c5415q.f27195a;
        long j6 = c5415q.f27196b;
        String notes = (i11 & 4) != 0 ? c5415q.f27197c : str;
        boolean z6 = (i11 & 8) != 0 ? c5415q.f27198d : true;
        String str5 = (i11 & 16) != 0 ? c5415q.f27199e : str2;
        String name = (i11 & 32) != 0 ? c5415q.f27200f : str3;
        String number = c5415q.f27201g;
        int i13 = c5415q.f27202h;
        EnumC8994d enumC8994d2 = (i11 & 256) != 0 ? c5415q.f27203i : enumC8994d;
        LocalDateTime datetime = c5415q.f27204j;
        Long l10 = (i11 & 1024) != 0 ? c5415q.f27205k : l9;
        int i14 = (i11 & NewHope.SENDB_BYTES) != 0 ? c5415q.f27206l : i10;
        String str6 = (i11 & 4096) != 0 ? c5415q.f27207m : str4;
        String str7 = c5415q.f27208n;
        String str8 = str6;
        String str9 = c5415q.f27209o;
        boolean z10 = c5415q.f27210p;
        boolean z11 = c5415q.f27211q;
        boolean z12 = c5415q.f27212r;
        c5415q.getClass();
        AbstractC4154l.m8923f(notes, "notes");
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(datetime, "datetime");
        return new C5415q(i12, j6, notes, z6, str5, name, number, i13, enumC8994d2, datetime, l10, i14, str8, str7, str9, z10, z11, z12);
    }

    /* renamed from: b */
    public final int m11123b() {
        return this.f27202h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5415q)) {
            return false;
        }
        C5415q c5415q = (C5415q) obj;
        return this.f27195a == c5415q.f27195a && this.f27196b == c5415q.f27196b && AbstractC4154l.m8918a(this.f27197c, c5415q.f27197c) && this.f27198d == c5415q.f27198d && AbstractC4154l.m8918a(this.f27199e, c5415q.f27199e) && AbstractC4154l.m8918a(this.f27200f, c5415q.f27200f) && AbstractC4154l.m8918a(this.f27201g, c5415q.f27201g) && this.f27202h == c5415q.f27202h && this.f27203i == c5415q.f27203i && AbstractC4154l.m8918a(this.f27204j, c5415q.f27204j) && AbstractC4154l.m8918a(this.f27205k, c5415q.f27205k) && this.f27206l == c5415q.f27206l && AbstractC4154l.m8918a(this.f27207m, c5415q.f27207m) && AbstractC4154l.m8918a(this.f27208n, c5415q.f27208n) && AbstractC4154l.m8918a(this.f27209o, c5415q.f27209o) && this.f27210p == c5415q.f27210p && this.f27211q == c5415q.f27211q && this.f27212r == c5415q.f27212r;
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4557d(Integer.hashCode(this.f27195a) * 31, 31, this.f27196b), 31, this.f27197c), 31, this.f27198d);
        String str = this.f27199e;
        int iM4556c = AbstractC1452a.m4556c(this.f27202h, AbstractC0030c.m113d(AbstractC0030c.m113d((iM4558e + (str == null ? 0 : str.hashCode())) * 31, 31, this.f27200f), 31, this.f27201g), 31);
        EnumC8994d enumC8994d = this.f27203i;
        int iM7370c = m0.m7370c(this.f27204j, (iM4556c + (enumC8994d == null ? 0 : enumC8994d.hashCode())) * 31, 31);
        Long l9 = this.f27205k;
        int iM4556c2 = AbstractC1452a.m4556c(this.f27206l, (iM7370c + (l9 == null ? 0 : l9.hashCode())) * 31, 31);
        String str2 = this.f27207m;
        int iHashCode = (iM4556c2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27208n;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f27209o;
        return Boolean.hashCode(this.f27212r) + AbstractC1452a.m4558e(AbstractC1452a.m4558e((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f27210p), 31, this.f27211q);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotePopUpCallLogDetail(id=");
        sb2.append(this.f27195a);
        sb2.append(", callLogId=");
        sb2.append(this.f27196b);
        sb2.append(", notes=");
        sb2.append(this.f27197c);
        sb2.append(", isLeadCallLog=");
        sb2.append(this.f27198d);
        a1.m14319B(sb2, ", leadId=", this.f27199e, ", name=", this.f27200f);
        sb2.append(", number=");
        sb2.append(this.f27201g);
        sb2.append(", countryCode=");
        sb2.append(this.f27202h);
        sb2.append(", callType=");
        sb2.append(this.f27203i);
        sb2.append(", datetime=");
        sb2.append(this.f27204j);
        sb2.append(", duration=");
        sb2.append(this.f27205k);
        sb2.append(", simPosition=");
        sb2.append(this.f27206l);
        a1.m14319B(sb2, ", simNumber=", this.f27207m, ", phoneAccountId=", this.f27208n);
        sb2.append(", inCompleteReason=");
        sb2.append(this.f27209o);
        sb2.append(", isCallLog=");
        sb2.append(this.f27210p);
        sb2.append(", isVerificationCallLog=");
        sb2.append(this.f27211q);
        sb2.append(", isCorruptCallLog=");
        sb2.append(this.f27212r);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5415q(int i10, long j6, boolean z6, String str, String str2, String str3, int i11, EnumC8994d enumC8994d, LocalDateTime localDateTime, Long l9, String str4, String str5, String str6, boolean z10, boolean z11, boolean z12, int i12) {
        LocalDateTime localDateTime2;
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        long j10 = (i12 & 2) != 0 ? 0L : j6;
        boolean z13 = (i12 & 8) != 0 ? false : z6;
        String str7 = (i12 & 16) != 0 ? null : str;
        String str8 = (i12 & 32) != 0 ? "" : str2;
        String str9 = (i12 & 64) != 0 ? "" : str3;
        int i14 = (i12 & 128) != 0 ? -1 : i11;
        EnumC8994d enumC8994d2 = (i12 & 256) != 0 ? null : enumC8994d;
        if ((i12 & 512) != 0) {
            LocalDateTime localDateTimeNow = LocalDateTime.now();
            AbstractC4154l.m8922e(localDateTimeNow, "now(...)");
            localDateTime2 = localDateTimeNow;
        } else {
            localDateTime2 = localDateTime;
        }
        this(i13, j10, "", z13, str7, str8, str9, i14, enumC8994d2, localDateTime2, (i12 & 1024) != 0 ? null : l9, 0, (i12 & 4096) != 0 ? null : str4, (i12 & 8192) != 0 ? null : str5, (i12 & 16384) != 0 ? null : str6, (32768 & i12) != 0 ? false : z10, (65536 & i12) != 0 ? false : z11, (i12 & 131072) != 0 ? false : z12);
    }
}
