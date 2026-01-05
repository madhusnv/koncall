package p001o;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p001o.ob0;
import p001o.s0f;
import p001o.uth;

/* loaded from: classes2.dex */
public class q0f {

    /* renamed from: a */
    public final ob0 f41051a;

    /* renamed from: b */
    public final int f41052b;

    /* renamed from: c */
    public final zwc f41053c;

    /* renamed from: d */
    public C16267a f41054d;

    /* renamed from: e */
    public C16267a f41055e;

    /* renamed from: f */
    public C16267a f41056f;

    /* renamed from: g */
    public long f41057g;

    /* renamed from: o.q0f$a */
    public static final class C16267a implements ob0.InterfaceC15750a {

        /* renamed from: a */
        public long f41058a;

        /* renamed from: b */
        public long f41059b;

        /* renamed from: c */
        public nb0 f41060c;

        /* renamed from: d */
        public C16267a f41061d;

        public C16267a(long j, int i) {
            m44626d(j, i);
        }

        @Override // p001o.ob0.InterfaceC15750a
        /* renamed from: a */
        public nb0 mo41907a() {
            return (nb0) op0.m42515e(this.f41060c);
        }

        /* renamed from: b */
        public C16267a m44624b() {
            this.f41060c = null;
            C16267a c16267a = this.f41061d;
            this.f41061d = null;
            return c16267a;
        }

        /* renamed from: c */
        public void m44625c(nb0 nb0Var, C16267a c16267a) {
            this.f41060c = nb0Var;
            this.f41061d = c16267a;
        }

        /* renamed from: d */
        public void m44626d(long j, int i) {
            op0.m42517g(this.f41060c == null);
            this.f41058a = j;
            this.f41059b = j + i;
        }

        /* renamed from: e */
        public int m44627e(long j) {
            return ((int) (j - this.f41058a)) + this.f41060c.f36637b;
        }

        @Override // p001o.ob0.InterfaceC15750a
        public ob0.InterfaceC15750a next() {
            C16267a c16267a = this.f41061d;
            if (c16267a == null || c16267a.f41060c == null) {
                return null;
            }
            return c16267a;
        }
    }

    public q0f(ob0 ob0Var) {
        this.f41051a = ob0Var;
        int iMo35163e = ob0Var.mo35163e();
        this.f41052b = iMo35163e;
        this.f41053c = new zwc(32);
        C16267a c16267a = new C16267a(0L, iMo35163e);
        this.f41054d = c16267a;
        this.f41055e = c16267a;
        this.f41056f = c16267a;
    }

    /* renamed from: d */
    public static C16267a m44607d(C16267a c16267a, long j) {
        while (j >= c16267a.f41059b) {
            c16267a = c16267a.f41061d;
        }
        return c16267a;
    }

    /* renamed from: i */
    public static C16267a m44608i(C16267a c16267a, long j, ByteBuffer byteBuffer, int i) {
        C16267a c16267aM44607d = m44607d(c16267a, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (c16267aM44607d.f41059b - j));
            byteBuffer.put(c16267aM44607d.f41060c.f36636a, c16267aM44607d.m44627e(j), iMin);
            i -= iMin;
            j += iMin;
            if (j == c16267aM44607d.f41059b) {
                c16267aM44607d = c16267aM44607d.f41061d;
            }
        }
        return c16267aM44607d;
    }

    /* renamed from: j */
    public static C16267a m44609j(C16267a c16267a, long j, byte[] bArr, int i) {
        C16267a c16267aM44607d = m44607d(c16267a, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (c16267aM44607d.f41059b - j));
            System.arraycopy(c16267aM44607d.f41060c.f36636a, c16267aM44607d.m44627e(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == c16267aM44607d.f41059b) {
                c16267aM44607d = c16267aM44607d.f41061d;
            }
        }
        return c16267aM44607d;
    }

    /* renamed from: k */
    public static C16267a m44610k(C16267a c16267a, a85 a85Var, s0f.C16709b c16709b, zwc zwcVar) {
        long j = c16709b.f44419b;
        int iM60010N = 1;
        zwcVar.m60013Q(1);
        C16267a c16267aM44609j = m44609j(c16267a, j, zwcVar.m60024e(), 1);
        long j2 = j + 1;
        byte b = zwcVar.m60024e()[0];
        boolean z = (b & 128) != 0;
        int i = b & 127;
        xc4 xc4Var = a85Var.f14281c;
        byte[] bArr = xc4Var.f53485a;
        if (bArr == null) {
            xc4Var.f53485a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        C16267a c16267aM44609j2 = m44609j(c16267aM44609j, j2, xc4Var.f53485a, i);
        long j3 = j2 + i;
        if (z) {
            zwcVar.m60013Q(2);
            c16267aM44609j2 = m44609j(c16267aM44609j2, j3, zwcVar.m60024e(), 2);
            j3 += 2;
            iM60010N = zwcVar.m60010N();
        }
        int i2 = iM60010N;
        int[] iArr = xc4Var.f53488d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = xc4Var.f53489e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            zwcVar.m60013Q(i3);
            c16267aM44609j2 = m44609j(c16267aM44609j2, j3, zwcVar.m60024e(), i3);
            j3 += i3;
            zwcVar.m60017U(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = zwcVar.m60010N();
                iArr4[i4] = zwcVar.m60008L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = c16709b.f44418a - ((int) (j3 - c16709b.f44419b));
        }
        uth.C17452a c17452a = (uth.C17452a) sqi.m48729h(c16709b.f44420c);
        xc4Var.m55968c(i2, iArr2, iArr4, c17452a.f49485b, xc4Var.f53485a, c17452a.f49484a, c17452a.f49486c, c17452a.f49487d);
        long j4 = c16709b.f44419b;
        int i5 = (int) (j3 - j4);
        c16709b.f44419b = j4 + i5;
        c16709b.f44418a -= i5;
        return c16267aM44609j2;
    }

    /* renamed from: l */
    public static C16267a m44611l(C16267a c16267a, a85 a85Var, s0f.C16709b c16709b, zwc zwcVar) {
        if (a85Var.m16678x()) {
            c16267a = m44610k(c16267a, a85Var, c16709b, zwcVar);
        }
        if (!a85Var.m50149m()) {
            a85Var.m16676v(c16709b.f44418a);
            return m44608i(c16267a, c16709b.f44419b, a85Var.f14282d, c16709b.f44418a);
        }
        zwcVar.m60013Q(4);
        C16267a c16267aM44609j = m44609j(c16267a, c16709b.f44419b, zwcVar.m60024e(), 4);
        int iM60008L = zwcVar.m60008L();
        c16709b.f44419b += 4;
        c16709b.f44418a -= 4;
        a85Var.m16676v(iM60008L);
        C16267a c16267aM44608i = m44608i(c16267aM44609j, c16709b.f44419b, a85Var.f14282d, iM60008L);
        c16709b.f44419b += iM60008L;
        int i = c16709b.f44418a - iM60008L;
        c16709b.f44418a = i;
        a85Var.m16679z(i);
        return m44608i(c16267aM44608i, c16709b.f44419b, a85Var.f14285g, c16709b.f44418a);
    }

    /* renamed from: a */
    public final void m44612a(C16267a c16267a) {
        if (c16267a.f41060c == null) {
            return;
        }
        this.f41051a.mo35159a(c16267a);
        c16267a.m44624b();
    }

    /* renamed from: b */
    public void m44613b(long j) {
        C16267a c16267a;
        if (j == -1) {
            return;
        }
        while (true) {
            c16267a = this.f41054d;
            if (j < c16267a.f41059b) {
                break;
            }
            this.f41051a.mo35161c(c16267a.f41060c);
            this.f41054d = this.f41054d.m44624b();
        }
        if (this.f41055e.f41058a < c16267a.f41058a) {
            this.f41055e = c16267a;
        }
    }

    /* renamed from: c */
    public void m44614c(long j) {
        op0.m42511a(j <= this.f41057g);
        this.f41057g = j;
        if (j != 0) {
            C16267a c16267a = this.f41054d;
            if (j != c16267a.f41058a) {
                while (this.f41057g > c16267a.f41059b) {
                    c16267a = c16267a.f41061d;
                }
                C16267a c16267a2 = (C16267a) op0.m42515e(c16267a.f41061d);
                m44612a(c16267a2);
                C16267a c16267a3 = new C16267a(c16267a.f41059b, this.f41052b);
                c16267a.f41061d = c16267a3;
                if (this.f41057g == c16267a.f41059b) {
                    c16267a = c16267a3;
                }
                this.f41056f = c16267a;
                if (this.f41055e == c16267a2) {
                    this.f41055e = c16267a3;
                    return;
                }
                return;
            }
        }
        m44612a(this.f41054d);
        C16267a c16267a4 = new C16267a(this.f41057g, this.f41052b);
        this.f41054d = c16267a4;
        this.f41055e = c16267a4;
        this.f41056f = c16267a4;
    }

    /* renamed from: e */
    public long m44615e() {
        return this.f41057g;
    }

    /* renamed from: f */
    public void m44616f(a85 a85Var, s0f.C16709b c16709b) {
        m44611l(this.f41055e, a85Var, c16709b, this.f41053c);
    }

    /* renamed from: g */
    public final void m44617g(int i) {
        long j = this.f41057g + i;
        this.f41057g = j;
        C16267a c16267a = this.f41056f;
        if (j == c16267a.f41059b) {
            this.f41056f = c16267a.f41061d;
        }
    }

    /* renamed from: h */
    public final int m44618h(int i) {
        C16267a c16267a = this.f41056f;
        if (c16267a.f41060c == null) {
            c16267a.m44625c(this.f41051a.mo35160b(), new C16267a(this.f41056f.f41059b, this.f41052b));
        }
        return Math.min(i, (int) (this.f41056f.f41059b - this.f41057g));
    }

    /* renamed from: m */
    public void m44619m(a85 a85Var, s0f.C16709b c16709b) {
        this.f41055e = m44611l(this.f41055e, a85Var, c16709b, this.f41053c);
    }

    /* renamed from: n */
    public void m44620n() {
        m44612a(this.f41054d);
        this.f41054d.m44626d(0L, this.f41052b);
        C16267a c16267a = this.f41054d;
        this.f41055e = c16267a;
        this.f41056f = c16267a;
        this.f41057g = 0L;
        this.f41051a.mo35162d();
    }

    /* renamed from: o */
    public void m44621o() {
        this.f41055e = this.f41054d;
    }

    /* renamed from: p */
    public int m44622p(pu4 pu4Var, int i, boolean z) throws EOFException {
        int iM44618h = m44618h(i);
        C16267a c16267a = this.f41056f;
        int i2 = pu4Var.read(c16267a.f41060c.f36636a, c16267a.m44627e(this.f41057g), iM44618h);
        if (i2 != -1) {
            m44617g(i2);
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: q */
    public void m44623q(zwc zwcVar, int i) {
        while (i > 0) {
            int iM44618h = m44618h(i);
            C16267a c16267a = this.f41056f;
            zwcVar.m60031l(c16267a.f41060c.f36636a, c16267a.m44627e(this.f41057g), iM44618h);
            i -= iM44618h;
            m44617g(iM44618h);
        }
    }
}
