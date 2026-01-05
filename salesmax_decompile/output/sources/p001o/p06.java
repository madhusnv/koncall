package p001o;

import androidx.media3.common.C2181a;
import com.google.firebase.perf.util.Constants;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.hyh;
import p001o.q06;

/* loaded from: classes2.dex */
public final class p06 implements n46 {

    /* renamed from: a */
    public final zwc f39136a;

    /* renamed from: c */
    public final String f39138c;

    /* renamed from: d */
    public final int f39139d;

    /* renamed from: e */
    public String f39140e;

    /* renamed from: f */
    public uth f39141f;

    /* renamed from: h */
    public int f39143h;

    /* renamed from: i */
    public int f39144i;

    /* renamed from: j */
    public long f39145j;

    /* renamed from: k */
    public C2181a f39146k;

    /* renamed from: l */
    public int f39147l;

    /* renamed from: m */
    public int f39148m;

    /* renamed from: g */
    public int f39142g = 0;

    /* renamed from: p */
    public long f39151p = -9223372036854775807L;

    /* renamed from: b */
    public final AtomicInteger f39137b = new AtomicInteger();

    /* renamed from: n */
    public int f39149n = -1;

    /* renamed from: o */
    public int f39150o = -1;

    public p06(String str, int i, int i2) {
        this.f39136a = new zwc(new byte[i2]);
        this.f39138c = str;
        this.f39139d = i;
    }

    @Override // p001o.n46
    /* renamed from: a */
    public void mo24646a(zwc zwcVar) throws byc {
        op0.m42519i(this.f39141f);
        while (zwcVar.m60020a() > 0) {
            switch (this.f39142g) {
                case 0:
                    if (!m42835j(zwcVar)) {
                        break;
                    } else {
                        int i = this.f39148m;
                        if (i != 3 && i != 4) {
                            if (i != 1) {
                                this.f39142g = 2;
                                break;
                            } else {
                                this.f39142g = 1;
                                break;
                            }
                        } else {
                            this.f39142g = 4;
                            break;
                        }
                    }
                    break;
                case 1:
                    if (!m42831f(zwcVar, this.f39136a.m60024e(), 18)) {
                        break;
                    } else {
                        m42832g();
                        this.f39136a.m60017U(0);
                        this.f39141f.m52027e(this.f39136a, 18);
                        this.f39142g = 6;
                        break;
                    }
                case 2:
                    if (!m42831f(zwcVar, this.f39136a.m60024e(), 7)) {
                        break;
                    } else {
                        this.f39149n = q06.m44601j(this.f39136a.m60024e());
                        this.f39142g = 3;
                        break;
                    }
                case 3:
                    if (!m42831f(zwcVar, this.f39136a.m60024e(), this.f39149n)) {
                        break;
                    } else {
                        m42833h();
                        this.f39136a.m60017U(0);
                        this.f39141f.m52027e(this.f39136a, this.f39149n);
                        this.f39142g = 6;
                        break;
                    }
                case 4:
                    if (!m42831f(zwcVar, this.f39136a.m60024e(), 6)) {
                        break;
                    } else {
                        int iM44603l = q06.m44603l(this.f39136a.m60024e());
                        this.f39150o = iM44603l;
                        int i2 = this.f39143h;
                        if (i2 > iM44603l) {
                            int i3 = i2 - iM44603l;
                            this.f39143h = i2 - i3;
                            zwcVar.m60017U(zwcVar.m60025f() - i3);
                        }
                        this.f39142g = 5;
                        break;
                    }
                case 5:
                    if (!m42831f(zwcVar, this.f39136a.m60024e(), this.f39150o)) {
                        break;
                    } else {
                        m42834i();
                        this.f39136a.m60017U(0);
                        this.f39141f.m52027e(this.f39136a, this.f39150o);
                        this.f39142g = 6;
                        break;
                    }
                case 6:
                    int iMin = Math.min(zwcVar.m60020a(), this.f39147l - this.f39143h);
                    this.f39141f.m52027e(zwcVar, iMin);
                    int i4 = this.f39143h + iMin;
                    this.f39143h = i4;
                    if (i4 == this.f39147l) {
                        op0.m42517g(this.f39151p != -9223372036854775807L);
                        this.f39141f.mo7071a(this.f39151p, this.f39148m == 4 ? 0 : 1, this.f39147l, 0, null);
                        this.f39151p += this.f39145j;
                        this.f39142g = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        this.f39142g = 0;
        this.f39143h = 0;
        this.f39144i = 0;
        this.f39151p = -9223372036854775807L;
        this.f39137b.set(0);
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        c14129d.m31294a();
        this.f39140e = c14129d.m31295b();
        this.f39141f = vq6Var.mo32487f(c14129d.m31296c(), 1);
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        this.f39151p = j;
    }

    /* renamed from: f */
    public final boolean m42831f(zwc zwcVar, byte[] bArr, int i) {
        int iMin = Math.min(zwcVar.m60020a(), i - this.f39143h);
        zwcVar.m60031l(bArr, this.f39143h, iMin);
        int i2 = this.f39143h + iMin;
        this.f39143h = i2;
        return i2 == i;
    }

    /* renamed from: g */
    public final void m42832g() {
        byte[] bArrM60024e = this.f39136a.m60024e();
        if (this.f39146k == null) {
            C2181a c2181aM44599h = q06.m44599h(bArrM60024e, this.f39140e, this.f39138c, this.f39139d, null);
            this.f39146k = c2181aM44599h;
            this.f39141f.mo7072b(c2181aM44599h);
        }
        this.f39147l = q06.m44593b(bArrM60024e);
        this.f39145j = br8.m19637d(sqi.Z0(q06.m44598g(bArrM60024e), this.f39146k.f7920C));
    }

    /* renamed from: h */
    public final void m42833h() throws byc {
        q06.C16266b c16266bM44600i = q06.m44600i(this.f39136a.m60024e());
        m42836k(c16266bM44600i);
        this.f39147l = c16266bM44600i.f41044d;
        long j = c16266bM44600i.f41045e;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        this.f39145j = j;
    }

    /* renamed from: i */
    public final void m42834i() throws byc {
        q06.C16266b c16266bM44602k = q06.m44602k(this.f39136a.m60024e(), this.f39137b);
        if (this.f39148m == 3) {
            m42836k(c16266bM44602k);
        }
        this.f39147l = c16266bM44602k.f41044d;
        long j = c16266bM44602k.f41045e;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        this.f39145j = j;
    }

    /* renamed from: j */
    public final boolean m42835j(zwc zwcVar) {
        while (zwcVar.m60020a() > 0) {
            int i = this.f39144i << 8;
            this.f39144i = i;
            int iM60004H = i | zwcVar.m60004H();
            this.f39144i = iM60004H;
            int iM44594c = q06.m44594c(iM60004H);
            this.f39148m = iM44594c;
            if (iM44594c != 0) {
                byte[] bArrM60024e = this.f39136a.m60024e();
                int i2 = this.f39144i;
                bArrM60024e[0] = (byte) ((i2 >> 24) & Constants.MAX_HOST_LENGTH);
                bArrM60024e[1] = (byte) ((i2 >> 16) & Constants.MAX_HOST_LENGTH);
                bArrM60024e[2] = (byte) ((i2 >> 8) & Constants.MAX_HOST_LENGTH);
                bArrM60024e[3] = (byte) (i2 & Constants.MAX_HOST_LENGTH);
                this.f39143h = 4;
                this.f39144i = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void m42836k(q06.C16266b c16266b) {
        int i;
        int i2 = c16266b.f41042b;
        if (i2 == -2147483647 || (i = c16266b.f41043c) == -1) {
            return;
        }
        C2181a c2181a = this.f39146k;
        if (c2181a != null && i == c2181a.f7919B && i2 == c2181a.f7920C && sqi.m48724c(c16266b.f41041a, c2181a.f7943n)) {
            return;
        }
        C2181a c2181a2 = this.f39146k;
        C2181a c2181aM6748K = (c2181a2 == null ? new C2181a.b() : c2181a2.m6707a()).a0(this.f39140e).o0(c16266b.f41041a).m6751N(c16266b.f41043c).p0(c16266b.f41042b).e0(this.f39138c).m0(this.f39139d).m6748K();
        this.f39146k = c2181aM6748K;
        this.f39141f.mo7072b(c2181aM6748K);
    }
}
