package c9;

import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7059e;
import t8.C7064j;
import t8.EnumC7055a;
import t8.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.p */
/* loaded from: classes.dex */
public final class C0921p {

    /* renamed from: a */
    public final String f5604a;

    /* renamed from: b */
    public final e0 f5605b;

    /* renamed from: c */
    public final C7064j f5606c;

    /* renamed from: d */
    public final long f5607d;

    /* renamed from: e */
    public final long f5608e;

    /* renamed from: f */
    public final long f5609f;

    /* renamed from: g */
    public final C7059e f5610g;

    /* renamed from: h */
    public final int f5611h;

    /* renamed from: i */
    public final EnumC7055a f5612i;

    /* renamed from: j */
    public final long f5613j;

    /* renamed from: k */
    public final long f5614k;

    /* renamed from: l */
    public final int f5615l;

    /* renamed from: m */
    public final int f5616m;

    /* renamed from: n */
    public final long f5617n;

    /* renamed from: o */
    public final int f5618o;

    /* renamed from: p */
    public final List f5619p;

    /* renamed from: q */
    public final List f5620q;

    public C0921p(String id2, e0 state, C7064j output, long j6, long j10, long j11, C7059e c7059e, int i10, EnumC7055a backoffPolicy, long j12, long j13, int i11, int i12, long j14, int i13, ArrayList tags, ArrayList progress) {
        AbstractC4154l.m8923f(id2, "id");
        AbstractC4154l.m8923f(state, "state");
        AbstractC4154l.m8923f(output, "output");
        AbstractC4154l.m8923f(backoffPolicy, "backoffPolicy");
        AbstractC4154l.m8923f(tags, "tags");
        AbstractC4154l.m8923f(progress, "progress");
        this.f5604a = id2;
        this.f5605b = state;
        this.f5606c = output;
        this.f5607d = j6;
        this.f5608e = j10;
        this.f5609f = j11;
        this.f5610g = c7059e;
        this.f5611h = i10;
        this.f5612i = backoffPolicy;
        this.f5613j = j12;
        this.f5614k = j13;
        this.f5615l = i11;
        this.f5616m = i12;
        this.f5617n = j14;
        this.f5618o = i13;
        this.f5619p = tags;
        this.f5620q = progress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0921p)) {
            return false;
        }
        C0921p c0921p = (C0921p) obj;
        return AbstractC4154l.m8918a(this.f5604a, c0921p.f5604a) && this.f5605b == c0921p.f5605b && AbstractC4154l.m8918a(this.f5606c, c0921p.f5606c) && this.f5607d == c0921p.f5607d && this.f5608e == c0921p.f5608e && this.f5609f == c0921p.f5609f && AbstractC4154l.m8918a(this.f5610g, c0921p.f5610g) && this.f5611h == c0921p.f5611h && this.f5612i == c0921p.f5612i && this.f5613j == c0921p.f5613j && this.f5614k == c0921p.f5614k && this.f5615l == c0921p.f5615l && this.f5616m == c0921p.f5616m && this.f5617n == c0921p.f5617n && this.f5618o == c0921p.f5618o && AbstractC4154l.m8918a(this.f5619p, c0921p.f5619p) && AbstractC4154l.m8918a(this.f5620q, c0921p.f5620q);
    }

    public final int hashCode() {
        return this.f5620q.hashCode() + AbstractC1452a.m4559f(this.f5619p, AbstractC1452a.m4556c(this.f5618o, AbstractC1452a.m4557d(AbstractC1452a.m4556c(this.f5616m, AbstractC1452a.m4556c(this.f5615l, AbstractC1452a.m4557d(AbstractC1452a.m4557d((this.f5612i.hashCode() + AbstractC1452a.m4556c(this.f5611h, (this.f5610g.hashCode() + AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d((this.f5606c.hashCode() + ((this.f5605b.hashCode() + (this.f5604a.hashCode() * 31)) * 31)) * 31, 31, this.f5607d), 31, this.f5608e), 31, this.f5609f)) * 31, 31)) * 31, 31, this.f5613j), 31, this.f5614k), 31), 31), 31, this.f5617n), 31), 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.f5604a + ", state=" + this.f5605b + ", output=" + this.f5606c + ", initialDelay=" + this.f5607d + ", intervalDuration=" + this.f5608e + ", flexDuration=" + this.f5609f + ", constraints=" + this.f5610g + ", runAttemptCount=" + this.f5611h + ", backoffPolicy=" + this.f5612i + ", backoffDelayDuration=" + this.f5613j + ", lastEnqueueTime=" + this.f5614k + ", periodCount=" + this.f5615l + ", generation=" + this.f5616m + ", nextScheduleTimeOverride=" + this.f5617n + ", stopReason=" + this.f5618o + ", tags=" + this.f5619p + ", progress=" + this.f5620q + ')';
    }
}
