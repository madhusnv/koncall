package c9;

import a1.C0011j;
import a2.AbstractC0030c;
import androidx.work.OverwritingInputMerger;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import og.ia;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import t8.C7059e;
import t8.C7064j;
import t8.C7077w;
import t8.EnumC7055a;
import t8.c0;
import t8.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.q */
/* loaded from: classes.dex */
public final class C0922q {

    /* renamed from: y */
    public static final C0011j f5621y;

    /* renamed from: a */
    public final String f5622a;

    /* renamed from: b */
    public e0 f5623b;

    /* renamed from: c */
    public final String f5624c;

    /* renamed from: d */
    public final String f5625d;

    /* renamed from: e */
    public C7064j f5626e;

    /* renamed from: f */
    public final C7064j f5627f;

    /* renamed from: g */
    public long f5628g;

    /* renamed from: h */
    public final long f5629h;

    /* renamed from: i */
    public final long f5630i;

    /* renamed from: j */
    public C7059e f5631j;

    /* renamed from: k */
    public final int f5632k;

    /* renamed from: l */
    public EnumC7055a f5633l;

    /* renamed from: m */
    public long f5634m;

    /* renamed from: n */
    public long f5635n;

    /* renamed from: o */
    public final long f5636o;

    /* renamed from: p */
    public final long f5637p;

    /* renamed from: q */
    public boolean f5638q;

    /* renamed from: r */
    public final c0 f5639r;

    /* renamed from: s */
    public final int f5640s;

    /* renamed from: t */
    public final int f5641t;

    /* renamed from: u */
    public final long f5642u;

    /* renamed from: v */
    public final int f5643v;

    /* renamed from: w */
    public final int f5644w;

    /* renamed from: x */
    public String f5645x;

    static {
        AbstractC4154l.m8922e(C7077w.m13372b("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
        f5621y = new C0011j(23);
    }

    public C0922q(String id2, e0 state, String workerClassName, String inputMergerClassName, C7064j input, C7064j output, long j6, long j10, long j11, C7059e constraints, int i10, EnumC7055a backoffPolicy, long j12, long j13, long j14, long j15, boolean z6, c0 outOfQuotaPolicy, int i11, int i12, long j16, int i13, int i14, String str) {
        AbstractC4154l.m8923f(id2, "id");
        AbstractC4154l.m8923f(state, "state");
        AbstractC4154l.m8923f(workerClassName, "workerClassName");
        AbstractC4154l.m8923f(inputMergerClassName, "inputMergerClassName");
        AbstractC4154l.m8923f(input, "input");
        AbstractC4154l.m8923f(output, "output");
        AbstractC4154l.m8923f(constraints, "constraints");
        AbstractC4154l.m8923f(backoffPolicy, "backoffPolicy");
        AbstractC4154l.m8923f(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f5622a = id2;
        this.f5623b = state;
        this.f5624c = workerClassName;
        this.f5625d = inputMergerClassName;
        this.f5626e = input;
        this.f5627f = output;
        this.f5628g = j6;
        this.f5629h = j10;
        this.f5630i = j11;
        this.f5631j = constraints;
        this.f5632k = i10;
        this.f5633l = backoffPolicy;
        this.f5634m = j12;
        this.f5635n = j13;
        this.f5636o = j14;
        this.f5637p = j15;
        this.f5638q = z6;
        this.f5639r = outOfQuotaPolicy;
        this.f5640s = i11;
        this.f5641t = i12;
        this.f5642u = j16;
        this.f5643v = i13;
        this.f5644w = i14;
        this.f5645x = str;
    }

    /* renamed from: b */
    public static C0922q m2668b(C0922q c0922q, String str, C7064j c7064j) {
        String id2 = c0922q.f5622a;
        e0 state = c0922q.f5623b;
        String inputMergerClassName = c0922q.f5625d;
        C7064j output = c0922q.f5627f;
        long j6 = c0922q.f5628g;
        long j10 = c0922q.f5629h;
        long j11 = c0922q.f5630i;
        C7059e constraints = c0922q.f5631j;
        int i10 = c0922q.f5632k;
        EnumC7055a backoffPolicy = c0922q.f5633l;
        long j12 = c0922q.f5634m;
        long j13 = c0922q.f5635n;
        long j14 = c0922q.f5636o;
        long j15 = c0922q.f5637p;
        boolean z6 = c0922q.f5638q;
        c0 outOfQuotaPolicy = c0922q.f5639r;
        int i11 = c0922q.f5640s;
        int i12 = c0922q.f5641t;
        long j16 = c0922q.f5642u;
        int i13 = c0922q.f5643v;
        int i14 = c0922q.f5644w;
        String str2 = c0922q.f5645x;
        c0922q.getClass();
        AbstractC4154l.m8923f(id2, "id");
        AbstractC4154l.m8923f(state, "state");
        AbstractC4154l.m8923f(inputMergerClassName, "inputMergerClassName");
        AbstractC4154l.m8923f(output, "output");
        AbstractC4154l.m8923f(constraints, "constraints");
        AbstractC4154l.m8923f(backoffPolicy, "backoffPolicy");
        AbstractC4154l.m8923f(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new C0922q(id2, state, str, inputMergerClassName, c7064j, output, j6, j10, j11, constraints, i10, backoffPolicy, j12, j13, j14, j15, z6, outOfQuotaPolicy, i11, i12, j16, i13, i14, str2);
    }

    /* renamed from: a */
    public final long m2669a() {
        return ia.m10697a(this.f5623b == e0.ENQUEUED && this.f5632k > 0, this.f5632k, this.f5633l, this.f5634m, this.f5635n, this.f5640s, m2671d(), this.f5628g, this.f5630i, this.f5629h, this.f5642u);
    }

    /* renamed from: c */
    public final boolean m2670c() {
        return !AbstractC4154l.m8918a(C7059e.f34128j, this.f5631j);
    }

    /* renamed from: d */
    public final boolean m2671d() {
        return this.f5629h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0922q)) {
            return false;
        }
        C0922q c0922q = (C0922q) obj;
        return AbstractC4154l.m8918a(this.f5622a, c0922q.f5622a) && this.f5623b == c0922q.f5623b && AbstractC4154l.m8918a(this.f5624c, c0922q.f5624c) && AbstractC4154l.m8918a(this.f5625d, c0922q.f5625d) && AbstractC4154l.m8918a(this.f5626e, c0922q.f5626e) && AbstractC4154l.m8918a(this.f5627f, c0922q.f5627f) && this.f5628g == c0922q.f5628g && this.f5629h == c0922q.f5629h && this.f5630i == c0922q.f5630i && AbstractC4154l.m8918a(this.f5631j, c0922q.f5631j) && this.f5632k == c0922q.f5632k && this.f5633l == c0922q.f5633l && this.f5634m == c0922q.f5634m && this.f5635n == c0922q.f5635n && this.f5636o == c0922q.f5636o && this.f5637p == c0922q.f5637p && this.f5638q == c0922q.f5638q && this.f5639r == c0922q.f5639r && this.f5640s == c0922q.f5640s && this.f5641t == c0922q.f5641t && this.f5642u == c0922q.f5642u && this.f5643v == c0922q.f5643v && this.f5644w == c0922q.f5644w && AbstractC4154l.m8918a(this.f5645x, c0922q.f5645x);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.f5644w, AbstractC1452a.m4556c(this.f5643v, AbstractC1452a.m4557d(AbstractC1452a.m4556c(this.f5641t, AbstractC1452a.m4556c(this.f5640s, (this.f5639r.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d((this.f5633l.hashCode() + AbstractC1452a.m4556c(this.f5632k, (this.f5631j.hashCode() + AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d((this.f5627f.hashCode() + ((this.f5626e.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d((this.f5623b.hashCode() + (this.f5622a.hashCode() * 31)) * 31, 31, this.f5624c), 31, this.f5625d)) * 31)) * 31, 31, this.f5628g), 31, this.f5629h), 31, this.f5630i)) * 31, 31)) * 31, 31, this.f5634m), 31, this.f5635n), 31, this.f5636o), 31, this.f5637p), 31, this.f5638q)) * 31, 31), 31), 31, this.f5642u), 31), 31);
        String str = this.f5645x;
        return iM4556c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("{WorkSpec: "), this.f5622a, '}');
    }

    public /* synthetic */ C0922q(String str, e0 e0Var, String str2, String str3, C7064j c7064j, C7064j c7064j2, long j6, long j10, long j11, C7059e c7059e, int i10, EnumC7055a enumC7055a, long j12, long j13, long j14, long j15, boolean z6, c0 c0Var, int i11, long j16, int i12, int i13, String str4, int i14) {
        this(str, (i14 & 2) != 0 ? e0.ENQUEUED : e0Var, str2, (i14 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i14 & 16) != 0 ? C7064j.f34159b : c7064j, (i14 & 32) != 0 ? C7064j.f34159b : c7064j2, (i14 & 64) != 0 ? 0L : j6, (i14 & 128) != 0 ? 0L : j10, (i14 & 256) != 0 ? 0L : j11, (i14 & 512) != 0 ? C7059e.f34128j : c7059e, (i14 & 1024) != 0 ? 0 : i10, (i14 & NewHope.SENDB_BYTES) != 0 ? EnumC7055a.EXPONENTIAL : enumC7055a, (i14 & 4096) != 0 ? 30000L : j12, (i14 & 8192) != 0 ? -1L : j13, (i14 & 16384) == 0 ? j14 : 0L, (32768 & i14) != 0 ? -1L : j15, (65536 & i14) != 0 ? false : z6, (131072 & i14) != 0 ? c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST : c0Var, (262144 & i14) != 0 ? 0 : i11, 0, (1048576 & i14) != 0 ? Long.MAX_VALUE : j16, (2097152 & i14) != 0 ? 0 : i12, (4194304 & i14) != 0 ? -256 : i13, (i14 & 8388608) != 0 ? null : str4);
    }
}
