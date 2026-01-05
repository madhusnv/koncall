package p001o;

import androidx.media3.common.C2181a;
import java.io.EOFException;
import p001o.qbg;
import p001o.uth;

/* loaded from: classes2.dex */
public final class ubg implements uth {

    /* renamed from: a */
    public final uth f48689a;

    /* renamed from: b */
    public final qbg.InterfaceC16329a f48690b;

    /* renamed from: h */
    public qbg f48696h;

    /* renamed from: i */
    public C2181a f48697i;

    /* renamed from: c */
    public final gd4 f48691c = new gd4();

    /* renamed from: e */
    public int f48693e = 0;

    /* renamed from: f */
    public int f48694f = 0;

    /* renamed from: g */
    public byte[] f48695g = sqi.f45795f;

    /* renamed from: d */
    public final zwc f48692d = new zwc();

    public ubg(uth uthVar, qbg.InterfaceC16329a interfaceC16329a) {
        this.f48689a = uthVar;
        this.f48690b = interfaceC16329a;
    }

    @Override // p001o.uth
    /* renamed from: a */
    public void mo7071a(final long j, final int i, int i2, int i3, uth.C17452a c17452a) {
        if (this.f48696h == null) {
            this.f48689a.mo7071a(j, i, i2, i3, c17452a);
            return;
        }
        op0.m42512b(c17452a == null, "DRM on subtitles is not supported");
        int i4 = (this.f48694f - i3) - i2;
        this.f48696h.mo29158a(this.f48695g, i4, i2, qbg.C16330b.m45066b(), new fu3() { // from class: o.tbg
            @Override // p001o.fu3
            public final void accept(Object obj) {
                this.f46784a.m51353i(j, i, (jd4) obj);
            }
        });
        int i5 = i4 + i2;
        this.f48693e = i5;
        if (i5 == this.f48694f) {
            this.f48693e = 0;
            this.f48694f = 0;
        }
    }

    @Override // p001o.uth
    /* renamed from: b */
    public void mo7072b(C2181a c2181a) {
        op0.m42515e(c2181a.f7943n);
        op0.m42511a(xeb.m56181i(c2181a.f7943n) == 3);
        if (!c2181a.equals(this.f48697i)) {
            this.f48697i = c2181a;
            this.f48696h = this.f48690b.mo45062a(c2181a) ? this.f48690b.mo45064c(c2181a) : null;
        }
        if (this.f48696h == null) {
            this.f48689a.mo7072b(c2181a);
        } else {
            this.f48689a.mo7072b(c2181a.m6707a().o0("application/x-media3-cues").m6752O(c2181a.f7943n).s0(Long.MAX_VALUE).m6756S(this.f48690b.mo45063b(c2181a)).m6748K());
        }
    }

    @Override // p001o.uth
    /* renamed from: d */
    public int mo7073d(pu4 pu4Var, int i, boolean z, int i2) throws EOFException {
        if (this.f48696h == null) {
            return this.f48689a.mo7073d(pu4Var, i, z, i2);
        }
        m51354h(i);
        int i3 = pu4Var.read(this.f48695g, this.f48694f, i);
        if (i3 != -1) {
            this.f48694f += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p001o.uth
    /* renamed from: f */
    public void mo7074f(zwc zwcVar, int i, int i2) {
        if (this.f48696h == null) {
            this.f48689a.mo7074f(zwcVar, i, i2);
            return;
        }
        m51354h(i);
        zwcVar.m60031l(this.f48695g, this.f48694f, i);
        this.f48694f += i;
    }

    /* renamed from: h */
    public final void m51354h(int i) {
        int length = this.f48695g.length;
        int i2 = this.f48694f;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f48693e;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f48695g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f48693e, bArr2, 0, i3);
        this.f48693e = 0;
        this.f48694f = i3;
        this.f48695g = bArr2;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m51353i(jd4 jd4Var, long j, int i) {
        op0.m42519i(this.f48697i);
        byte[] bArrM28471a = this.f48691c.m28471a(jd4Var.f30186a, jd4Var.f30188c);
        this.f48692d.m60014R(bArrM28471a);
        this.f48689a.m52027e(this.f48692d, bArrM28471a.length);
        long j2 = jd4Var.f30187b;
        if (j2 == -9223372036854775807L) {
            op0.m42517g(this.f48697i.f7948s == Long.MAX_VALUE);
        } else {
            long j3 = this.f48697i.f7948s;
            j = j3 == Long.MAX_VALUE ? j + j2 : j2 + j3;
        }
        this.f48689a.mo7071a(j, i, bArrM28471a.length, 0, null);
    }

    /* renamed from: k */
    public void m51356k() {
        qbg qbgVar = this.f48696h;
        if (qbgVar != null) {
            qbgVar.reset();
        }
    }
}
