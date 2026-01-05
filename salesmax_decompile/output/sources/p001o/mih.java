package p001o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.AbstractC2193c;
import androidx.media3.exoplayer.InterfaceC2221p;
import java.nio.ByteBuffer;
import java.util.Objects;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class mih extends AbstractC2193c implements Handler.Callback {

    /* renamed from: Y */
    public final ed4 f35521Y;

    /* renamed from: Z */
    public final a85 f35522Z;
    public id4 h0;
    public final jbg i0;
    public boolean j0;
    public int k0;
    public hbg l0;
    public mbg m0;
    public nbg n0;
    public nbg o0;
    public int p0;
    public final Handler q0;
    public final jih r0;
    public final if7 s0;
    public boolean t0;
    public boolean u0;
    public C2181a v0;
    public long w0;
    public long x0;
    public long y0;
    public boolean z0;

    public mih(jih jihVar, Looper looper) {
        this(jihVar, looper, jbg.f30124a);
    }

    public static boolean v0(C2181a c2181a) {
        return Objects.equals(c2181a.f7943n, "application/x-media3-cues");
    }

    public final void A0(long j) {
        boolean z;
        this.x0 = j;
        if (this.o0 == null) {
            ((hbg) op0.m42515e(this.l0)).mo18814b(j);
            try {
                this.o0 = (nbg) ((hbg) op0.m42515e(this.l0)).mo16896a();
            } catch (ibg e) {
                s0(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.n0 != null) {
            long jQ0 = q0();
            z = false;
            while (jQ0 <= j) {
                this.p0++;
                jQ0 = q0();
                z = true;
            }
        } else {
            z = false;
        }
        nbg nbgVar = this.o0;
        if (nbgVar != null) {
            if (nbgVar.m50150n()) {
                if (!z && q0() == Long.MAX_VALUE) {
                    if (this.k0 == 2) {
                        B0();
                    } else {
                        x0();
                        this.u0 = true;
                    }
                }
            } else if (nbgVar.f15666b <= j) {
                nbg nbgVar2 = this.n0;
                if (nbgVar2 != null) {
                    nbgVar2.mo18274u();
                }
                this.p0 = nbgVar.mo21115a(j);
                this.n0 = nbgVar;
                this.o0 = null;
                z = true;
            }
        }
        if (z) {
            op0.m42515e(this.n0);
            D0(new hd4(this.n0.mo21116c(j), r0(p0(j))));
        }
        if (this.k0 == 2) {
            return;
        }
        while (!this.t0) {
            try {
                mbg mbgVar = this.m0;
                if (mbgVar == null) {
                    mbgVar = (mbg) ((hbg) op0.m42515e(this.l0)).mo18817e();
                    if (mbgVar == null) {
                        return;
                    } else {
                        this.m0 = mbgVar;
                    }
                }
                if (this.k0 == 1) {
                    mbgVar.m50154t(4);
                    ((hbg) op0.m42515e(this.l0)).mo18815c(mbgVar);
                    this.m0 = null;
                    this.k0 = 2;
                    return;
                }
                int iK0 = k0(this.s0, mbgVar, 0);
                if (iK0 == -4) {
                    if (mbgVar.m50150n()) {
                        this.t0 = true;
                        this.j0 = false;
                    } else {
                        C2181a c2181a = this.s0.f28594b;
                        if (c2181a == null) {
                            return;
                        }
                        mbgVar.f35125s = c2181a.f7948s;
                        mbgVar.m16677w();
                        this.j0 &= !mbgVar.m50152r();
                    }
                    if (!this.j0) {
                        ((hbg) op0.m42515e(this.l0)).mo18815c(mbgVar);
                        this.m0 = null;
                    }
                } else if (iK0 == -3) {
                    return;
                }
            } catch (ibg e2) {
                s0(e2);
                return;
            }
        }
    }

    public final void B0() {
        y0();
        t0();
    }

    public void C0(long j) {
        op0.m42517g(mo6896y());
        this.y0 = j;
    }

    public final void D0(hd4 hd4Var) {
        Handler handler = this.q0;
        if (handler != null) {
            handler.obtainMessage(1, hd4Var).sendToTarget();
        } else {
            u0(hd4Var);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    /* renamed from: Z */
    public void mo6887Z() {
        this.v0 = null;
        this.y0 = -9223372036854775807L;
        o0();
        this.w0 = -9223372036854775807L;
        this.x0 = -9223372036854775807L;
        if (this.l0 != null) {
            y0();
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2221p
    /* renamed from: a */
    public int mo7449a(C2181a c2181a) {
        if (v0(c2181a) || this.i0.mo33493a(c2181a)) {
            return InterfaceC2221p.m7447s(c2181a.f7928K == 0 ? 4 : 2);
        }
        return xeb.m56188p(c2181a.f7943n) ? InterfaceC2221p.m7447s(1) : InterfaceC2221p.m7447s(0);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: b */
    public boolean mo7429b() {
        return this.u0;
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void c0(long j, boolean z) {
        this.x0 = j;
        id4 id4Var = this.h0;
        if (id4Var != null) {
            id4Var.clear();
        }
        o0();
        this.t0 = false;
        this.u0 = false;
        this.y0 = -9223372036854775807L;
        C2181a c2181a = this.v0;
        if (c2181a == null || v0(c2181a)) {
            return;
        }
        if (this.k0 != 0) {
            B0();
            return;
        }
        x0();
        hbg hbgVar = (hbg) op0.m42515e(this.l0);
        hbgVar.flush();
        hbgVar.mo18816d(m6883V());
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: g */
    public void mo7431g(long j, long j2) {
        if (mo6896y()) {
            long j3 = this.y0;
            if (j3 != -9223372036854775807L && j >= j3) {
                x0();
                this.u0 = true;
            }
        }
        if (this.u0) {
            return;
        }
        if (v0((C2181a) op0.m42515e(this.v0))) {
            op0.m42515e(this.h0);
            z0(j);
        } else {
            n0();
            A0(j);
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o, androidx.media3.exoplayer.InterfaceC2221p
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        u0((hd4) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void i0(C2181a[] c2181aArr, long j, long j2, x8b.C18076b c18076b) {
        this.w0 = j2;
        C2181a c2181a = c2181aArr[0];
        this.v0 = c2181a;
        if (v0(c2181a)) {
            this.h0 = this.v0.f7925H == 1 ? new jbb() : new tke();
            return;
        }
        n0();
        if (this.l0 != null) {
            this.k0 = 1;
        } else {
            t0();
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    public boolean isReady() {
        return true;
    }

    public final void n0() {
        op0.m42518h(this.z0 || Objects.equals(this.v0.f7943n, "application/cea-608") || Objects.equals(this.v0.f7943n, "application/x-mp4-cea-608") || Objects.equals(this.v0.f7943n, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.v0.f7943n + " samples (expected application/x-media3-cues).");
    }

    public final void o0() {
        D0(new hd4(nf8.m40499E(), r0(this.x0)));
    }

    public final long p0(long j) {
        int iMo21115a = this.n0.mo21115a(j);
        if (iMo21115a == 0 || this.n0.mo21118e() == 0) {
            return this.n0.f15666b;
        }
        if (iMo21115a != -1) {
            return this.n0.mo21117d(iMo21115a - 1);
        }
        return this.n0.mo21117d(r2.mo21118e() - 1);
    }

    public final long q0() {
        if (this.p0 == -1) {
            return Long.MAX_VALUE;
        }
        op0.m42515e(this.n0);
        if (this.p0 >= this.n0.mo21118e()) {
            return Long.MAX_VALUE;
        }
        return this.n0.mo21117d(this.p0);
    }

    public final long r0(long j) {
        op0.m42517g(j != -9223372036854775807L);
        op0.m42517g(this.w0 != -9223372036854775807L);
        return j - this.w0;
    }

    public final void s0(ibg ibgVar) {
        ria.m46820d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.v0, ibgVar);
        o0();
        B0();
    }

    public final void t0() {
        this.j0 = true;
        hbg hbgVarMo33494b = this.i0.mo33494b((C2181a) op0.m42515e(this.v0));
        this.l0 = hbgVarMo33494b;
        hbgVarMo33494b.mo18816d(m6883V());
    }

    public final void u0(hd4 hd4Var) {
        this.r0.mo7183l(hd4Var.f26674a);
        this.r0.mo7192u(hd4Var);
    }

    public final boolean w0(long j) {
        if (this.t0 || k0(this.s0, this.f35522Z, 0) != -4) {
            return false;
        }
        if (this.f35522Z.m50150n()) {
            this.t0 = true;
            return false;
        }
        this.f35522Z.m16677w();
        ByteBuffer byteBuffer = (ByteBuffer) op0.m42515e(this.f35522Z.f14282d);
        jd4 jd4VarM24782a = this.f35521Y.m24782a(this.f35522Z.f14284f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f35522Z.mo16674h();
        return this.h0.mo31917d(jd4VarM24782a, j);
    }

    public final void x0() {
        this.m0 = null;
        this.p0 = -1;
        nbg nbgVar = this.n0;
        if (nbgVar != null) {
            nbgVar.mo18274u();
            this.n0 = null;
        }
        nbg nbgVar2 = this.o0;
        if (nbgVar2 != null) {
            nbgVar2.mo18274u();
            this.o0 = null;
        }
    }

    public final void y0() {
        x0();
        ((hbg) op0.m42515e(this.l0)).release();
        this.l0 = null;
        this.k0 = 0;
    }

    public final void z0(long j) {
        boolean zW0 = w0(j);
        long jMo31916c = this.h0.mo31916c(this.x0);
        if (jMo31916c == Long.MIN_VALUE && this.t0 && !zW0) {
            this.u0 = true;
        }
        if (jMo31916c != Long.MIN_VALUE && jMo31916c <= j) {
            zW0 = true;
        }
        if (zW0) {
            nf8 nf8VarMo31914a = this.h0.mo31914a(j);
            long jMo31915b = this.h0.mo31915b(j);
            D0(new hd4(nf8VarMo31914a, r0(jMo31915b)));
            this.h0.mo31918e(jMo31915b);
        }
        this.x0 = j;
    }

    public mih(jih jihVar, Looper looper, jbg jbgVar) {
        super(3);
        this.r0 = (jih) op0.m42515e(jihVar);
        this.q0 = looper == null ? null : sqi.m48746y(looper, this);
        this.i0 = jbgVar;
        this.f35521Y = new ed4();
        this.f35522Z = new a85(1);
        this.s0 = new if7();
        this.y0 = -9223372036854775807L;
        this.w0 = -9223372036854775807L;
        this.x0 = -9223372036854775807L;
        this.z0 = false;
    }
}
