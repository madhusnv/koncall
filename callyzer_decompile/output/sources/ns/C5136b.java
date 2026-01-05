package ns;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import uv.AbstractC7548a;
import yv.AbstractC8788c;
import yv.C8789d;
import yv.C8800o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ns.b */
/* loaded from: classes3.dex */
public final class C5136b {

    /* renamed from: a */
    public final String f25138a;

    /* renamed from: b */
    public final String f25139b;

    /* renamed from: c */
    public final EnumC8994d f25140c;

    /* renamed from: d */
    public final LocalDateTime f25141d;

    /* renamed from: e */
    public final Long f25142e;

    /* renamed from: f */
    public final String f25143f;

    /* renamed from: g */
    public final int f25144g;

    /* renamed from: h */
    public final int f25145h;

    /* renamed from: i */
    public final String f25146i;

    /* renamed from: j */
    public final String f25147j;

    /* renamed from: k */
    public final String f25148k;

    /* renamed from: l */
    public final String f25149l;

    /* renamed from: m */
    public final int f25150m;

    public C5136b(String name, String number, EnumC8994d enumC8994d, LocalDateTime localDateTime, Long l9, String simNumber, int i10, int i11, String str) {
        int i12;
        String strM16160g;
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        this.f25138a = name;
        this.f25139b = number;
        this.f25140c = enumC8994d;
        this.f25141d = localDateTime;
        this.f25142e = l9;
        this.f25143f = simNumber;
        this.f25144g = i10;
        this.f25145h = i11;
        this.f25146i = str;
        C8800o c8800o = C8800o.f42459a;
        this.f25147j = C8800o.m16205n(localDateTime);
        this.f25148k = C8800o.m16186J(localDateTime);
        this.f25149l = (l9 == null || (strM16160g = C8789d.m16160g(false, l9.longValue())) == null) ? "0s" : strM16160g;
        int[] iArr = AbstractC5135a.f25137a;
        int i13 = iArr[enumC8994d.ordinal()];
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i14 = AbstractC7548a.f36346S;
        int i15 = AbstractC8788c.f42452a[enumC8994d.ordinal()];
        if (i15 != 1 && i15 != 2 && i15 != 3 && i15 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i16 = iArr[enumC8994d.ordinal()];
        if (i16 == 1) {
            i12 = R.drawable.ic_incoming_call;
        } else if (i16 == 2) {
            i12 = R.drawable.ic_outgoing_call;
        } else if (i16 == 3) {
            i12 = R.drawable.ic_missed_call;
        } else {
            if (i16 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.drawable.ic_rejected_call;
        }
        this.f25150m = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5136b)) {
            return false;
        }
        C5136b c5136b = (C5136b) obj;
        return AbstractC4154l.m8918a(this.f25138a, c5136b.f25138a) && AbstractC4154l.m8918a(this.f25139b, c5136b.f25139b) && this.f25140c == c5136b.f25140c && AbstractC4154l.m8918a(this.f25141d, c5136b.f25141d) && AbstractC4154l.m8918a(this.f25142e, c5136b.f25142e) && AbstractC4154l.m8918a(this.f25143f, c5136b.f25143f) && this.f25144g == c5136b.f25144g && this.f25145h == c5136b.f25145h && AbstractC4154l.m8918a(this.f25146i, c5136b.f25146i);
    }

    public final int hashCode() {
        int iM7370c = m0.m7370c(this.f25141d, (this.f25140c.hashCode() + AbstractC0030c.m113d(this.f25138a.hashCode() * 31, 31, this.f25139b)) * 31, 31);
        Long l9 = this.f25142e;
        int iM4556c = AbstractC1452a.m4556c(this.f25145h, AbstractC1452a.m4556c(this.f25144g, AbstractC0030c.m113d((iM7370c + (l9 == null ? 0 : l9.hashCode())) * 31, 31, this.f25143f), 31), 31);
        String str = this.f25146i;
        return iM4556c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("NotVerifiedLogUiModel(name=", this.f25138a, ", number=", this.f25139b, ", callType=");
        sbM127r.append(this.f25140c);
        sbM127r.append(", datetime=");
        sbM127r.append(this.f25141d);
        sbM127r.append(", duration=");
        sbM127r.append(this.f25142e);
        sbM127r.append(", simNumber=");
        sbM127r.append(this.f25143f);
        sbM127r.append(", slot=");
        sbM127r.append(this.f25144g);
        sbM127r.append(", id=");
        sbM127r.append(this.f25145h);
        sbM127r.append(", note=");
        return AbstractC1452a.m4564k(sbM127r, this.f25146i, ")");
    }
}
