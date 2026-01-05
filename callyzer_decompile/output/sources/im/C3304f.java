package im;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5414p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.f */
/* loaded from: classes3.dex */
public final class C3304f implements InterfaceC3307i {

    /* renamed from: a */
    public final String f17549a;

    /* renamed from: b */
    public final C5414p f17550b;

    /* renamed from: c */
    public final String f17551c;

    /* renamed from: d */
    public final String f17552d;

    /* renamed from: e */
    public final LocalDateTime f17553e;

    public C3304f(String str, C5414p c5414p, String str2, String str3, LocalDateTime localDateTime) {
        this.f17549a = str;
        this.f17550b = c5414p;
        this.f17551c = str2;
        this.f17552d = str3;
        this.f17553e = localDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3304f)) {
            return false;
        }
        C3304f c3304f = (C3304f) obj;
        return AbstractC4154l.m8918a(this.f17549a, c3304f.f17549a) && AbstractC4154l.m8918a(this.f17550b, c3304f.f17550b) && AbstractC4154l.m8918a(this.f17551c, c3304f.f17551c) && AbstractC4154l.m8918a(this.f17552d, c3304f.f17552d) && AbstractC4154l.m8918a(this.f17553e, c3304f.f17553e);
    }

    public final int hashCode() {
        int iHashCode = this.f17549a.hashCode() * 31;
        C5414p c5414p = this.f17550b;
        int iHashCode2 = (iHashCode + (c5414p == null ? 0 : c5414p.hashCode())) * 31;
        String str = this.f17551c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17552d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDateTime localDateTime = this.f17553e;
        return iHashCode4 + (localDateTime != null ? localDateTime.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeadCallLogNoteUpdate(leadLogId=");
        sb2.append(this.f17549a);
        sb2.append(", callLogDetail=");
        sb2.append(this.f17550b);
        sb2.append(", note=");
        p020v.a1.m14319B(sb2, this.f17551c, ", selectedLeadStatus=", this.f17552d, ", selectedReminderTime=");
        sb2.append(this.f17553e);
        sb2.append(")");
        return sb2.toString();
    }
}
