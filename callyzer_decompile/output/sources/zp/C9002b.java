package zp;

import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import im.EnumC3309k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4790a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zp.b */
/* loaded from: classes3.dex */
public final class C9002b {

    /* renamed from: a */
    public final C4790a f43357a;

    /* renamed from: b */
    public final EnumC3309k f43358b;

    /* renamed from: c */
    public final String f43359c;

    /* renamed from: d */
    public final int f43360d;

    public C9002b(C4790a c4790a, EnumC3309k label, String str, int i10) {
        int i11;
        c4790a = (i10 & 1) != 0 ? new C4790a(null, null) : c4790a;
        str = (i10 & 4) != 0 ? "" : str;
        AbstractC4154l.m8923f(label, "label");
        this.f43357a = c4790a;
        this.f43358b = label;
        this.f43359c = str;
        switch (AbstractC9001a.f43356a[label.ordinal()]) {
            case 1:
                i11 = R.string.top_caller;
                break;
            case 2:
                i11 = R.string.top_10_frequent_talks;
                break;
            case 3:
                i11 = R.string.longest_call;
                break;
            case 4:
                i11 = R.string.highest_call;
                break;
            case 5:
                i11 = R.string.average_call_duration;
                break;
            case 6:
                i11 = R.string.top_10_call_duration;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f43360d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9002b)) {
            return false;
        }
        C9002b c9002b = (C9002b) obj;
        return AbstractC4154l.m8918a(this.f43357a, c9002b.f43357a) && this.f43358b == c9002b.f43358b && AbstractC4154l.m8918a(this.f43359c, c9002b.f43359c);
    }

    public final int hashCode() {
        return this.f43359c.hashCode() + ((this.f43358b.hashCode() + (this.f43357a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalysisUiModel(analysisData=");
        sb2.append(this.f43357a);
        sb2.append(", label=");
        sb2.append(this.f43358b);
        sb2.append(", description=");
        return AbstractC1452a.m4564k(sb2, this.f43359c, ")");
    }
}
