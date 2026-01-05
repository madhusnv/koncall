package p001o;

import androidx.media3.common.C2181a;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class a85 extends tl1 {

    /* renamed from: b */
    public C2181a f14280b;

    /* renamed from: c */
    public final xc4 f14281c;

    /* renamed from: d */
    public ByteBuffer f14282d;

    /* renamed from: e */
    public boolean f14283e;

    /* renamed from: f */
    public long f14284f;

    /* renamed from: g */
    public ByteBuffer f14285g;

    /* renamed from: h */
    public final int f14286h;

    /* renamed from: q */
    public final int f14287q;

    /* renamed from: o.a85$a */
    public static final class C12112a extends IllegalStateException {

        /* renamed from: a */
        public final int f14288a;

        /* renamed from: b */
        public final int f14289b;

        public C12112a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.f14288a = i;
            this.f14289b = i2;
        }
    }

    static {
        t2b.m49198a("media3.decoder");
    }

    public a85(int i) {
        this(i, 0);
    }

    /* renamed from: y */
    public static a85 m16673y() {
        return new a85(0);
    }

    @Override // p001o.tl1
    /* renamed from: h */
    public void mo16674h() {
        super.mo16674h();
        ByteBuffer byteBuffer = this.f14282d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f14285g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f14283e = false;
    }

    /* renamed from: u */
    public final ByteBuffer m16675u(int i) {
        int i2 = this.f14286h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f14282d;
        throw new C12112a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    /* renamed from: v */
    public void m16676v(int i) {
        int i2 = i + this.f14287q;
        ByteBuffer byteBuffer = this.f14282d;
        if (byteBuffer == null) {
            this.f14282d = m16675u(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f14282d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM16675u = m16675u(i3);
        byteBufferM16675u.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM16675u.put(byteBuffer);
        }
        this.f14282d = byteBufferM16675u;
    }

    /* renamed from: w */
    public final void m16677w() {
        ByteBuffer byteBuffer = this.f14282d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f14285g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: x */
    public final boolean m16678x() {
        return m50148j(1073741824);
    }

    /* renamed from: z */
    public void m16679z(int i) {
        ByteBuffer byteBuffer = this.f14285g;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f14285g = ByteBuffer.allocate(i);
        } else {
            this.f14285g.clear();
        }
    }

    public a85(int i, int i2) {
        this.f14281c = new xc4();
        this.f14286h = i;
        this.f14287q = i2;
    }
}
