package mm;

import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import java.util.EnumSet;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;
import zm.EnumC8993c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.b */
/* loaded from: classes3.dex */
public final class C4791b {

    /* renamed from: a */
    public final int f23832a;

    /* renamed from: b */
    public final C4792c f23833b;

    /* renamed from: c */
    public LocalDateTime f23834c;

    /* renamed from: d */
    public final EnumSet f23835d;

    /* renamed from: e */
    public EnumC8993c f23836e;

    /* renamed from: f */
    public String f23837f;

    /* renamed from: g */
    public String f23838g;

    /* renamed from: h */
    public String f23839h;

    /* renamed from: i */
    public String f23840i;

    /* renamed from: j */
    public String f23841j;

    /* renamed from: k */
    public final boolean f23842k;

    /* renamed from: l */
    public LocalDateTime f23843l;

    public C4791b(int i10, C4792c callLogDetails, LocalDateTime localDateTime, EnumSet enumSet, EnumC8993c enumC8993c, String str, String str2, String str3, String str4, String str5, boolean z6, LocalDateTime localDateTime2) {
        AbstractC4154l.m8923f(callLogDetails, "callLogDetails");
        this.f23832a = i10;
        this.f23833b = callLogDetails;
        this.f23834c = localDateTime;
        this.f23835d = enumSet;
        this.f23836e = enumC8993c;
        this.f23837f = str;
        this.f23838g = str2;
        this.f23839h = str3;
        this.f23840i = str4;
        this.f23841j = str5;
        this.f23842k = z6;
        this.f23843l = localDateTime2;
    }

    /* renamed from: a */
    public static C4791b m9712a(C4791b c4791b, C4792c c4792c, LocalDateTime localDateTime, EnumSet enumSet, EnumC8993c enumC8993c, String str, String str2, String str3, String str4, boolean z6, int i10) {
        int i11 = c4791b.f23832a;
        if ((i10 & 2) != 0) {
            c4792c = c4791b.f23833b;
        }
        C4792c callLogDetails = c4792c;
        LocalDateTime localDateTime2 = (i10 & 4) != 0 ? c4791b.f23834c : localDateTime;
        EnumSet callLogSyncStatusSet = (i10 & 8) != 0 ? c4791b.f23835d : enumSet;
        EnumC8993c enumC8993c2 = (i10 & 16) != 0 ? c4791b.f23836e : enumC8993c;
        String str5 = (i10 & 32) != 0 ? c4791b.f23837f : str;
        String str6 = (i10 & 64) != 0 ? c4791b.f23838g : str2;
        String str7 = (i10 & 128) != 0 ? c4791b.f23839h : str3;
        String str8 = (i10 & 256) != 0 ? c4791b.f23840i : str4;
        String str9 = c4791b.f23841j;
        boolean z10 = (i10 & 1024) != 0 ? c4791b.f23842k : z6;
        LocalDateTime localDateTime3 = c4791b.f23843l;
        c4791b.getClass();
        AbstractC4154l.m8923f(callLogDetails, "callLogDetails");
        AbstractC4154l.m8923f(callLogSyncStatusSet, "callLogSyncStatusSet");
        return new C4791b(i11, callLogDetails, localDateTime2, callLogSyncStatusSet, enumC8993c2, str5, str6, str7, str8, str9, z10, localDateTime3);
    }

    /* renamed from: b */
    public final C4792c m9713b() {
        return this.f23833b;
    }

    /* renamed from: c */
    public final EnumSet m9714c() {
        return this.f23835d;
    }

    /* renamed from: d */
    public final EnumC8993c m9715d() {
        return this.f23836e;
    }

    /* renamed from: e */
    public final int m9716e() {
        return this.f23832a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4791b)) {
            return false;
        }
        C4791b c4791b = (C4791b) obj;
        return this.f23832a == c4791b.f23832a && AbstractC4154l.m8918a(this.f23833b, c4791b.f23833b) && AbstractC4154l.m8918a(this.f23834c, c4791b.f23834c) && AbstractC4154l.m8918a(this.f23835d, c4791b.f23835d) && this.f23836e == c4791b.f23836e && AbstractC4154l.m8918a(this.f23837f, c4791b.f23837f) && AbstractC4154l.m8918a(this.f23838g, c4791b.f23838g) && AbstractC4154l.m8918a(this.f23839h, c4791b.f23839h) && AbstractC4154l.m8918a(this.f23840i, c4791b.f23840i) && AbstractC4154l.m8918a(this.f23841j, c4791b.f23841j) && this.f23842k == c4791b.f23842k && AbstractC4154l.m8918a(this.f23843l, c4791b.f23843l);
    }

    /* renamed from: f */
    public final C4803n m9717f() {
        String str = this.f23841j;
        LocalDateTime localDateTime = this.f23843l;
        C4792c callLogDetails = this.f23833b;
        AbstractC4154l.m8923f(callLogDetails, "callLogDetails");
        EnumSet callLogSyncStatus = this.f23835d;
        AbstractC4154l.m8923f(callLogSyncStatus, "callLogSyncStatus");
        C4803n c4803n = new C4803n(0, callLogDetails, callLogSyncStatus, null);
        c4803n.f23916e = str;
        c4803n.f23919h = localDateTime;
        c4803n.f23917f = callLogDetails.f23853k;
        return c4803n;
    }

    /* renamed from: g */
    public final void m9718g(EnumC8993c enumC8993c) {
        this.f23836e = enumC8993c;
    }

    public final int hashCode() {
        int iHashCode = (this.f23833b.hashCode() + (Integer.hashCode(this.f23832a) * 31)) * 31;
        LocalDateTime localDateTime = this.f23834c;
        int iHashCode2 = (this.f23835d.hashCode() + ((iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31)) * 31;
        EnumC8993c enumC8993c = this.f23836e;
        int iHashCode3 = (iHashCode2 + (enumC8993c == null ? 0 : enumC8993c.hashCode())) * 31;
        String str = this.f23837f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23838g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f23839h;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23840i;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f23841j;
        int iM4558e = AbstractC1452a.m4558e((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f23842k);
        LocalDateTime localDateTime2 = this.f23843l;
        return iM4558e + (localDateTime2 != null ? localDateTime2.hashCode() : 0);
    }

    public final String toString() {
        LocalDateTime localDateTime = this.f23834c;
        String str = this.f23841j;
        EnumC8993c enumC8993c = this.f23836e;
        String str2 = this.f23837f;
        String str3 = this.f23838g;
        String str4 = this.f23839h;
        String str5 = this.f23840i;
        StringBuilder sb2 = new StringBuilder("CallLog[id=");
        sb2.append(this.f23832a);
        sb2.append(",callLogDetails=");
        sb2.append(this.f23833b);
        sb2.append(",modifyDateTime=");
        sb2.append(localDateTime);
        sb2.append(",callLogSyncStatus:");
        sb2.append(this.f23835d);
        sb2.append(",notes=");
        sb2.append(str);
        sb2.append(",callRecordingSyncStatus=");
        sb2.append(enumC8993c);
        sb2.append(",callRecordingSourcePath=");
        a1.m14319B(sb2, str2, ",callRecordingCompressPath=", str3, ",callRecordingWebPath=");
        a1.m14319B(sb2, str4, ",callRecordingFileId=", str5, ",isLeadCallLog=");
        return AbstractC5601a.m11242m(sb2, this.f23842k, "]");
    }

    public /* synthetic */ C4791b(int i10, C4792c c4792c, LocalDateTime localDateTime, EnumSet enumSet, String str, boolean z6, int i11) {
        this(i10, c4792c, (i11 & 4) != 0 ? null : localDateTime, enumSet, null, null, null, null, null, (i11 & 512) != 0 ? null : str, z6, null);
    }
}
