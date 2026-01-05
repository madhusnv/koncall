package lq;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lq.a */
/* loaded from: classes3.dex */
public final class C4506a {

    /* renamed from: a */
    public final List f22414a;

    /* renamed from: b */
    public final long f22415b;

    /* renamed from: c */
    public final boolean f22416c;

    /* renamed from: d */
    public final int f22417d;

    /* renamed from: e */
    public final boolean f22418e;

    public C4506a(List list, long j6, boolean z6, int i10, boolean z10) {
        this.f22414a = list;
        this.f22415b = j6;
        this.f22416c = z6;
        this.f22417d = i10;
        this.f22418e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4506a)) {
            return false;
        }
        C4506a c4506a = (C4506a) obj;
        return AbstractC4154l.m8918a(this.f22414a, c4506a.f22414a) && this.f22415b == c4506a.f22415b && this.f22416c == c4506a.f22416c && this.f22417d == c4506a.f22417d && this.f22418e == c4506a.f22418e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22418e) + AbstractC1452a.m4556c(this.f22417d, AbstractC1452a.m4558e(AbstractC1452a.m4557d(this.f22414a.hashCode() * 31, 31, this.f22415b), 31, this.f22416c), 31);
    }

    public final String toString() {
        return "CallHistoryState(tabList=" + this.f22414a + ", updateTime=" + this.f22415b + ", isShowNotVerifiedCalls=" + this.f22416c + ", notVerifiedCallsCount=" + this.f22417d + ", isSyncLeadOnlyCallsAndLeadSubscriptionExpire=" + this.f22418e + ")";
    }
}
