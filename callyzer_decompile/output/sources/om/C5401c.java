package om;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4792c;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;
import zm.EnumC8993c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.c */
/* loaded from: classes3.dex */
public final class C5401c {

    /* renamed from: a */
    public final int f27095a;

    /* renamed from: b */
    public final C4792c f27096b;

    /* renamed from: c */
    public final Integer f27097c;

    /* renamed from: d */
    public final String f27098d;

    /* renamed from: e */
    public final boolean f27099e;

    /* renamed from: f */
    public final EnumC8993c f27100f;

    /* renamed from: g */
    public final String f27101g;

    /* renamed from: h */
    public final String f27102h;

    /* renamed from: i */
    public final boolean f27103i;

    public C5401c(int i10, C4792c c4792c, Integer num, String str, boolean z6, EnumC8993c enumC8993c, String str2, String str3, boolean z10) {
        this.f27095a = i10;
        this.f27096b = c4792c;
        this.f27097c = num;
        this.f27098d = str;
        this.f27099e = z6;
        this.f27100f = enumC8993c;
        this.f27101g = str2;
        this.f27102h = str3;
        this.f27103i = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5401c)) {
            return false;
        }
        C5401c c5401c = (C5401c) obj;
        return this.f27095a == c5401c.f27095a && AbstractC4154l.m8918a(this.f27096b, c5401c.f27096b) && AbstractC4154l.m8918a(this.f27097c, c5401c.f27097c) && AbstractC4154l.m8918a(this.f27098d, c5401c.f27098d) && this.f27099e == c5401c.f27099e && this.f27100f == c5401c.f27100f && AbstractC4154l.m8918a(this.f27101g, c5401c.f27101g) && AbstractC4154l.m8918a(this.f27102h, c5401c.f27102h) && this.f27103i == c5401c.f27103i;
    }

    public final int hashCode() {
        int iHashCode = (this.f27096b.hashCode() + (Integer.hashCode(this.f27095a) * 31)) * 31;
        Integer num = this.f27097c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f27098d;
        int iM4558e = AbstractC1452a.m4558e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f27099e);
        EnumC8993c enumC8993c = this.f27100f;
        int iHashCode3 = (iM4558e + (enumC8993c == null ? 0 : enumC8993c.hashCode())) * 31;
        String str2 = this.f27101g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27102h;
        return Boolean.hashCode(this.f27103i) + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallHistoryCallLog(id=");
        sb2.append(this.f27095a);
        sb2.append(", callLogDetails=");
        sb2.append(this.f27096b);
        sb2.append(", simPosition=");
        sb2.append(this.f27097c);
        sb2.append(", notes=");
        sb2.append(this.f27098d);
        sb2.append(", isLeadCallLog=");
        sb2.append(this.f27099e);
        sb2.append(", callRecordingSyncStatus=");
        sb2.append(this.f27100f);
        sb2.append(", callRecordingSourcePath=");
        a1.m14319B(sb2, this.f27101g, ", callRecordWebPath=", this.f27102h, ", canCallRecording=");
        return AbstractC5601a.m11242m(sb2, this.f27103i, ")");
    }
}
