package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.AbstractC2193c;
import androidx.media3.exoplayer.InterfaceC2221p;
import java.nio.ByteBuffer;
import p001o.x8b;

/* loaded from: classes2.dex */
public final class ga2 extends AbstractC2193c {

    /* renamed from: Y */
    public final a85 f24817Y;

    /* renamed from: Z */
    public final zwc f24818Z;
    public long h0;
    public fa2 i0;
    public long j0;

    public ga2() {
        super(6);
        this.f24817Y = new a85(1);
        this.f24818Z = new zwc();
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    /* renamed from: Z */
    public void mo6887Z() {
        o0();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2221p
    /* renamed from: a */
    public int mo7449a(C2181a c2181a) {
        return "application/x-camera-motion".equals(c2181a.f7943n) ? InterfaceC2221p.m7447s(4) : InterfaceC2221p.m7447s(0);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: b */
    public boolean mo7429b() {
        return mo6890i();
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void c0(long j, boolean z) {
        this.j0 = Long.MIN_VALUE;
        o0();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: g */
    public void mo7431g(long j, long j2) {
        while (!mo6890i() && this.j0 < 100000 + j) {
            this.f24817Y.mo16674h();
            if (k0(m6881T(), this.f24817Y, 0) != -4 || this.f24817Y.m50150n()) {
                return;
            }
            long j3 = this.f24817Y.f14284f;
            this.j0 = j3;
            boolean z = j3 < m6883V();
            if (this.i0 != null && !z) {
                this.f24817Y.m16677w();
                float[] fArrN0 = n0((ByteBuffer) sqi.m48729h(this.f24817Y.f14282d));
                if (fArrN0 != null) {
                    ((fa2) sqi.m48729h(this.i0)).mo7197a(this.j0 - this.h0, fArrN0);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o, androidx.media3.exoplayer.InterfaceC2221p
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void i0(C2181a[] c2181aArr, long j, long j2, x8b.C18076b c18076b) {
        this.h0 = j2;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    public boolean isReady() {
        return true;
    }

    public final float[] n0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f24818Z.m60015S(byteBuffer.array(), byteBuffer.limit());
        this.f24818Z.m60017U(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f24818Z.m60040u());
        }
        return fArr;
    }

    public final void o0() {
        fa2 fa2Var = this.i0;
        if (fa2Var != null) {
            fa2Var.mo7198d();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c, androidx.media3.exoplayer.C2217n.b
    /* renamed from: u */
    public void mo6894u(int i, Object obj) {
        if (i == 8) {
            this.i0 = (fa2) obj;
        } else {
            super.mo6894u(i, obj);
        }
    }
}
