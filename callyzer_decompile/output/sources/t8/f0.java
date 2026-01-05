package t8;

import com.sun.mail.util.AbstractC1452a;
import java.util.HashSet;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a */
    public final UUID f34140a;

    /* renamed from: b */
    public final e0 f34141b;

    /* renamed from: c */
    public final HashSet f34142c;

    /* renamed from: d */
    public final C7064j f34143d;

    /* renamed from: e */
    public final C7064j f34144e;

    /* renamed from: f */
    public final int f34145f;

    /* renamed from: g */
    public final int f34146g;

    /* renamed from: h */
    public final C7059e f34147h;

    /* renamed from: i */
    public final long f34148i;

    /* renamed from: j */
    public final d0 f34149j;

    /* renamed from: k */
    public final long f34150k;

    /* renamed from: l */
    public final int f34151l;

    public f0(UUID uuid, e0 state, HashSet hashSet, C7064j outputData, C7064j progress, int i10, int i11, C7059e c7059e, long j6, d0 d0Var, long j10, int i12) {
        AbstractC4154l.m8923f(state, "state");
        AbstractC4154l.m8923f(outputData, "outputData");
        AbstractC4154l.m8923f(progress, "progress");
        this.f34140a = uuid;
        this.f34141b = state;
        this.f34142c = hashSet;
        this.f34143d = outputData;
        this.f34144e = progress;
        this.f34145f = i10;
        this.f34146g = i11;
        this.f34147h = c7059e;
        this.f34148i = j6;
        this.f34149j = d0Var;
        this.f34150k = j10;
        this.f34151l = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !f0.class.equals(obj.getClass())) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f34145f == f0Var.f34145f && this.f34146g == f0Var.f34146g && this.f34140a.equals(f0Var.f34140a) && this.f34141b == f0Var.f34141b && AbstractC4154l.m8918a(this.f34143d, f0Var.f34143d) && this.f34147h.equals(f0Var.f34147h) && this.f34148i == f0Var.f34148i && AbstractC4154l.m8918a(this.f34149j, f0Var.f34149j) && this.f34150k == f0Var.f34150k && this.f34151l == f0Var.f34151l && this.f34142c.equals(f0Var.f34142c)) {
            return AbstractC4154l.m8918a(this.f34144e, f0Var.f34144e);
        }
        return false;
    }

    public final int hashCode() {
        int iM4557d = AbstractC1452a.m4557d((this.f34147h.hashCode() + ((((((this.f34144e.hashCode() + ((this.f34142c.hashCode() + ((this.f34143d.hashCode() + ((this.f34141b.hashCode() + (this.f34140a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f34145f) * 31) + this.f34146g) * 31)) * 31, 31, this.f34148i);
        d0 d0Var = this.f34149j;
        return Integer.hashCode(this.f34151l) + AbstractC1452a.m4557d((iM4557d + (d0Var != null ? d0Var.hashCode() : 0)) * 31, 31, this.f34150k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f34140a + "', state=" + this.f34141b + ", outputData=" + this.f34143d + ", tags=" + this.f34142c + ", progress=" + this.f34144e + ", runAttemptCount=" + this.f34145f + ", generation=" + this.f34146g + ", constraints=" + this.f34147h + ", initialDelayMillis=" + this.f34148i + ", periodicityInfo=" + this.f34149j + ", nextScheduleTimeMillis=" + this.f34150k + "}, stopReason=" + this.f34151l;
    }
}
