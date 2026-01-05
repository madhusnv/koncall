package p001o;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class vf1 extends a85 {

    /* renamed from: s */
    public long f50265s;

    /* renamed from: x */
    public int f50266x;

    /* renamed from: y */
    public int f50267y;

    public vf1() {
        super(2);
        this.f50267y = 32;
    }

    /* renamed from: A */
    public boolean m52687A(a85 a85Var) {
        op0.m42511a(!a85Var.m16678x());
        op0.m42511a(!a85Var.m50149m());
        op0.m42511a(!a85Var.m50150n());
        if (!m52688B(a85Var)) {
            return false;
        }
        int i = this.f50266x;
        this.f50266x = i + 1;
        if (i == 0) {
            this.f14284f = a85Var.f14284f;
            if (a85Var.m50152r()) {
                m50154t(1);
            }
        }
        ByteBuffer byteBuffer = a85Var.f14282d;
        if (byteBuffer != null) {
            m16676v(byteBuffer.remaining());
            this.f14282d.put(byteBuffer);
        }
        this.f50265s = a85Var.f14284f;
        return true;
    }

    /* renamed from: B */
    public final boolean m52688B(a85 a85Var) {
        ByteBuffer byteBuffer;
        if (!m52692F()) {
            return true;
        }
        if (this.f50266x >= this.f50267y) {
            return false;
        }
        ByteBuffer byteBuffer2 = a85Var.f14282d;
        return byteBuffer2 == null || (byteBuffer = this.f14282d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    /* renamed from: C */
    public long m52689C() {
        return this.f14284f;
    }

    /* renamed from: D */
    public long m52690D() {
        return this.f50265s;
    }

    /* renamed from: E */
    public int m52691E() {
        return this.f50266x;
    }

    /* renamed from: F */
    public boolean m52692F() {
        return this.f50266x > 0;
    }

    /* renamed from: G */
    public void m52693G(int i) {
        op0.m42511a(i > 0);
        this.f50267y = i;
    }

    @Override // p001o.a85, p001o.tl1
    /* renamed from: h */
    public void mo16674h() {
        super.mo16674h();
        this.f50266x = 0;
    }
}
