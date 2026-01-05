package androidx.media3.exoplayer.smoothstreaming;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.C2213j;
import androidx.media3.exoplayer.smoothstreaming.InterfaceC2226b;
import java.io.IOException;
import java.util.List;
import p001o.abf;
import p001o.bh1;
import p001o.d1g;
import p001o.dz4;
import p001o.i14;
import p001o.iz4;
import p001o.j1b;
import p001o.jn1;
import p001o.juh;
import p001o.k1b;
import p001o.k93;
import p001o.ko6;
import p001o.l93;
import p001o.m93;
import p001o.mth;
import p001o.nf8;
import p001o.nth;
import p001o.oe3;
import p001o.op0;
import p001o.pe3;
import p001o.qbg;
import p001o.sga;
import p001o.tj7;
import p001o.uh5;
import p001o.zd1;
import p001o.zga;
import p001o.zth;

/* renamed from: androidx.media3.exoplayer.smoothstreaming.a */
/* loaded from: classes2.dex */
public class C2225a implements InterfaceC2226b {

    /* renamed from: a */
    public final zga f8541a;

    /* renamed from: b */
    public final int f8542b;

    /* renamed from: c */
    public final l93[] f8543c;

    /* renamed from: d */
    public final dz4 f8544d;

    /* renamed from: e */
    public ko6 f8545e;

    /* renamed from: f */
    public d1g f8546f;

    /* renamed from: g */
    public int f8547g;

    /* renamed from: h */
    public IOException f8548h;

    /* renamed from: i */
    public long f8549i = -9223372036854775807L;

    /* renamed from: androidx.media3.exoplayer.smoothstreaming.a$a */
    public static final class a implements InterfaceC2226b.a {

        /* renamed from: a */
        public final dz4.InterfaceC13064a f8550a;

        /* renamed from: b */
        public qbg.InterfaceC16329a f8551b = new uh5();

        /* renamed from: c */
        public boolean f8552c;

        public a(dz4.InterfaceC13064a interfaceC13064a) {
            this.f8550a = interfaceC13064a;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.InterfaceC2226b.a
        /* renamed from: c */
        public C2181a mo7493c(C2181a c2181a) {
            String str;
            if (!this.f8552c || !this.f8551b.mo45062a(c2181a)) {
                return c2181a;
            }
            C2181a.b bVarM6756S = c2181a.m6707a().o0("application/x-media3-cues").m6756S(this.f8551b.mo45063b(c2181a));
            StringBuilder sb = new StringBuilder();
            sb.append(c2181a.f7943n);
            if (c2181a.f7939j != null) {
                str = " " + c2181a.f7939j;
            } else {
                str = "";
            }
            sb.append(str);
            return bVarM6756S.m6752O(sb.toString()).s0(Long.MAX_VALUE).m6748K();
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.InterfaceC2226b.a
        /* renamed from: d */
        public InterfaceC2226b mo7494d(zga zgaVar, d1g d1gVar, int i, ko6 ko6Var, juh juhVar, oe3 oe3Var) {
            dz4 dz4VarMo23962a = this.f8550a.mo23962a();
            if (juhVar != null) {
                dz4VarMo23962a.mo23961j(juhVar);
            }
            return new C2225a(zgaVar, d1gVar, i, ko6Var, dz4VarMo23962a, oe3Var, this.f8551b, this.f8552c);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.InterfaceC2226b.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a mo7492b(boolean z) {
            this.f8552c = z;
            return this;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.InterfaceC2226b.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a mo7491a(qbg.InterfaceC16329a interfaceC16329a) {
            this.f8551b = interfaceC16329a;
            return this;
        }
    }

    /* renamed from: androidx.media3.exoplayer.smoothstreaming.a$b */
    public static final class b extends zd1 {

        /* renamed from: e */
        public final d1g.C12783b f8553e;

        /* renamed from: f */
        public final int f8554f;

        public b(d1g.C12783b c12783b, int i, int i2) {
            super(i2, c12783b.f18998k - 1);
            this.f8553e = c12783b;
            this.f8554f = i;
        }

        @Override // p001o.k1b
        /* renamed from: a */
        public long mo7052a() {
            m59216c();
            return this.f8553e.m22244e((int) m59217d());
        }

        @Override // p001o.k1b
        /* renamed from: b */
        public long mo7053b() {
            return mo7052a() + this.f8553e.m22242c((int) m59217d());
        }
    }

    public C2225a(zga zgaVar, d1g d1gVar, int i, ko6 ko6Var, dz4 dz4Var, oe3 oe3Var, qbg.InterfaceC16329a interfaceC16329a, boolean z) {
        this.f8541a = zgaVar;
        this.f8546f = d1gVar;
        this.f8542b = i;
        this.f8545e = ko6Var;
        this.f8544d = dz4Var;
        d1g.C12783b c12783b = d1gVar.f18982f[i];
        this.f8543c = new l93[ko6Var.length()];
        for (int i2 = 0; i2 < this.f8543c.length; i2++) {
            int iMo22950f = ko6Var.mo22950f(i2);
            C2181a c2181a = c12783b.f18997j[iMo22950f];
            nth[] nthVarArr = c2181a.f7947r != null ? ((d1g.C12782a) op0.m42515e(d1gVar.f18981e)).f18987c : null;
            int i3 = c12783b.f18988a;
            this.f8543c[i2] = new jn1(new tj7(interfaceC16329a, !z ? 35 : 3, null, new mth(iMo22950f, i3, c12783b.f18990c, -9223372036854775807L, d1gVar.f18983g, c2181a, 0, nthVarArr, i3 == 2 ? 4 : 0, null, null), nf8.m40499E(), null), c12783b.f18988a, c2181a);
        }
    }

    /* renamed from: k */
    public static j1b m7487k(C2181a c2181a, dz4 dz4Var, Uri uri, int i, long j, long j2, long j3, int i2, Object obj, l93 l93Var, pe3.C16078a c16078a) {
        iz4 iz4VarM32924a = new iz4.C14403b().m32932i(uri).m32924a();
        if (c16078a != null) {
            iz4VarM32924a = c16078a.m43507a().m43505a(iz4VarM32924a);
        }
        return new i14(dz4Var, iz4VarM32924a, c2181a, i2, obj, j, j2, j3, -9223372036854775807L, i, 1, j, l93Var);
    }

    @Override // p001o.q93
    /* renamed from: a */
    public void mo7021a() throws IOException {
        IOException iOException = this.f8548h;
        if (iOException != null) {
            throw iOException;
        }
        this.f8541a.mo6966a();
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.InterfaceC2226b
    /* renamed from: b */
    public void mo7488b(ko6 ko6Var) {
        this.f8545e = ko6Var;
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.InterfaceC2226b
    /* renamed from: d */
    public void mo7489d(d1g d1gVar) {
        d1g.C12783b[] c12783bArr = this.f8546f.f18982f;
        int i = this.f8542b;
        d1g.C12783b c12783b = c12783bArr[i];
        int i2 = c12783b.f18998k;
        d1g.C12783b c12783b2 = d1gVar.f18982f[i];
        if (i2 == 0 || c12783b2.f18998k == 0) {
            this.f8547g += i2;
        } else {
            int i3 = i2 - 1;
            long jM22244e = c12783b.m22244e(i3) + c12783b.m22242c(i3);
            long jM22244e2 = c12783b2.m22244e(0);
            if (jM22244e <= jM22244e2) {
                this.f8547g += i2;
            } else {
                this.f8547g += c12783b.m22243d(jM22244e2);
            }
        }
        this.f8546f = d1gVar;
    }

    @Override // p001o.q93
    /* renamed from: e */
    public long mo7022e(long j, abf abfVar) {
        d1g.C12783b c12783b = this.f8546f.f18982f[this.f8542b];
        int iM22243d = c12783b.m22243d(j);
        long jM22244e = c12783b.m22244e(iM22243d);
        return abfVar.m16823a(j, jM22244e, (jM22244e >= j || iM22243d >= c12783b.f18998k + (-1)) ? jM22244e : c12783b.m22244e(iM22243d + 1));
    }

    @Override // p001o.q93
    /* renamed from: f */
    public boolean mo7023f(k93 k93Var, boolean z, sga.C16838c c16838c, sga sgaVar) {
        sga.C16837b c16837bMo48311b = sgaVar.mo48311b(zth.m59937c(this.f8545e), c16838c);
        if (z && c16837bMo48311b != null && c16837bMo48311b.f45393a == 2) {
            ko6 ko6Var = this.f8545e;
            if (ko6Var.mo22951g(ko6Var.mo22948b(k93Var.f31662d), c16837bMo48311b.f45394b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p001o.q93
    /* renamed from: g */
    public boolean mo7024g(long j, k93 k93Var, List list) {
        if (this.f8548h != null) {
            return false;
        }
        return this.f8545e.mo35979c(j, k93Var, list);
    }

    @Override // p001o.q93
    /* renamed from: h */
    public void mo7025h(k93 k93Var) {
    }

    @Override // p001o.q93
    /* renamed from: i */
    public final void mo7026i(C2213j c2213j, long j, List list, m93 m93Var) {
        int iMo31352e;
        if (this.f8548h != null) {
            return;
        }
        d1g.C12783b c12783b = this.f8546f.f18982f[this.f8542b];
        if (c12783b.f18998k == 0) {
            m93Var.f35003b = !r4.f18980d;
            return;
        }
        if (list.isEmpty()) {
            iMo31352e = c12783b.m22243d(j);
        } else {
            iMo31352e = (int) (((j1b) list.get(list.size() - 1)).mo31352e() - this.f8547g);
            if (iMo31352e < 0) {
                this.f8548h = new bh1();
                return;
            }
        }
        if (iMo31352e >= c12783b.f18998k) {
            m93Var.f35003b = !this.f8546f.f18980d;
            return;
        }
        long j2 = c2213j.f8421a;
        long j3 = j - j2;
        long jM7490l = m7490l(j2);
        int length = this.f8545e.length();
        k1b[] k1bVarArr = new k1b[length];
        for (int i = 0; i < length; i++) {
            k1bVarArr[i] = new b(c12783b, this.f8545e.mo22950f(i), iMo31352e);
        }
        this.f8545e.mo16359k(j2, j3, jM7490l, list, k1bVarArr);
        long jM22244e = c12783b.m22244e(iMo31352e);
        long jM22242c = jM22244e + c12783b.m22242c(iMo31352e);
        long j4 = list.isEmpty() ? j : -9223372036854775807L;
        int i2 = iMo31352e + this.f8547g;
        int iMo16357d = this.f8545e.mo16357d();
        l93 l93Var = this.f8543c[iMo16357d];
        Uri uriM22240a = c12783b.m22240a(this.f8545e.mo22950f(iMo16357d), iMo31352e);
        this.f8549i = SystemClock.elapsedRealtime();
        m93Var.f35002a = m7487k(this.f8545e.mo22955q(), this.f8544d, uriM22240a, i2, jM22244e, jM22242c, j4, this.f8545e.mo16360r(), this.f8545e.mo16358i(), l93Var, null);
    }

    @Override // p001o.q93
    /* renamed from: j */
    public int mo7027j(long j, List list) {
        return (this.f8548h != null || this.f8545e.length() < 2) ? list.size() : this.f8545e.mo19892o(j, list);
    }

    /* renamed from: l */
    public final long m7490l(long j) {
        d1g d1gVar = this.f8546f;
        if (!d1gVar.f18980d) {
            return -9223372036854775807L;
        }
        d1g.C12783b c12783b = d1gVar.f18982f[this.f8542b];
        int i = c12783b.f18998k - 1;
        return (c12783b.m22244e(i) + c12783b.m22242c(i)) - j;
    }

    @Override // p001o.q93
    public void release() {
        for (l93 l93Var : this.f8543c) {
            l93Var.release();
        }
    }
}
