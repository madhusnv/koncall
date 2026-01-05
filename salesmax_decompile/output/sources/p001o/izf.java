package p001o;

import com.google.android.gms.cast.MediaStatus;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p001o.vy0;

/* loaded from: classes2.dex */
public class izf implements vy0 {

    /* renamed from: b */
    public int f29431b;

    /* renamed from: c */
    public float f29432c = 1.0f;

    /* renamed from: d */
    public float f29433d = 1.0f;

    /* renamed from: e */
    public vy0.C17692a f29434e;

    /* renamed from: f */
    public vy0.C17692a f29435f;

    /* renamed from: g */
    public vy0.C17692a f29436g;

    /* renamed from: h */
    public vy0.C17692a f29437h;

    /* renamed from: i */
    public boolean f29438i;

    /* renamed from: j */
    public hzf f29439j;

    /* renamed from: k */
    public ByteBuffer f29440k;

    /* renamed from: l */
    public ShortBuffer f29441l;

    /* renamed from: m */
    public ByteBuffer f29442m;

    /* renamed from: n */
    public long f29443n;

    /* renamed from: o */
    public long f29444o;

    /* renamed from: p */
    public boolean f29445p;

    public izf() {
        vy0.C17692a c17692a = vy0.C17692a.f51020e;
        this.f29434e = c17692a;
        this.f29435f = c17692a;
        this.f29436g = c17692a;
        this.f29437h = c17692a;
        ByteBuffer byteBuffer = vy0.f51019a;
        this.f29440k = byteBuffer;
        this.f29441l = byteBuffer.asShortBuffer();
        this.f29442m = byteBuffer;
        this.f29431b = -1;
    }

    @Override // p001o.vy0
    /* renamed from: a */
    public final boolean mo21720a() {
        return this.f29435f.f51021a != -1 && (Math.abs(this.f29432c - 1.0f) >= 1.0E-4f || Math.abs(this.f29433d - 1.0f) >= 1.0E-4f || this.f29435f.f51021a != this.f29434e.f51021a);
    }

    @Override // p001o.vy0
    /* renamed from: b */
    public final boolean mo32950b() {
        hzf hzfVar;
        return this.f29445p && ((hzfVar = this.f29439j) == null || hzfVar.m31312k() == 0);
    }

    @Override // p001o.vy0
    /* renamed from: c */
    public final ByteBuffer mo32951c() {
        int iM31312k;
        hzf hzfVar = this.f29439j;
        if (hzfVar != null && (iM31312k = hzfVar.m31312k()) > 0) {
            if (this.f29440k.capacity() < iM31312k) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iM31312k).order(ByteOrder.nativeOrder());
                this.f29440k = byteBufferOrder;
                this.f29441l = byteBufferOrder.asShortBuffer();
            } else {
                this.f29440k.clear();
                this.f29441l.clear();
            }
            hzfVar.m31311j(this.f29441l);
            this.f29444o += iM31312k;
            this.f29440k.limit(iM31312k);
            this.f29442m = this.f29440k;
        }
        ByteBuffer byteBuffer = this.f29442m;
        this.f29442m = vy0.f51019a;
        return byteBuffer;
    }

    @Override // p001o.vy0
    /* renamed from: d */
    public final vy0.C17692a mo32952d(vy0.C17692a c17692a) throws vy0.C17693b {
        if (c17692a.f51023c != 2) {
            throw new vy0.C17693b(c17692a);
        }
        int i = this.f29431b;
        if (i == -1) {
            i = c17692a.f51021a;
        }
        this.f29434e = c17692a;
        vy0.C17692a c17692a2 = new vy0.C17692a(i, c17692a.f51022b, 2);
        this.f29435f = c17692a2;
        this.f29438i = true;
        return c17692a2;
    }

    @Override // p001o.vy0
    /* renamed from: e */
    public final void mo21721e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            hzf hzfVar = (hzf) op0.m42515e(this.f29439j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f29443n += iRemaining;
            hzfVar.m31320t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p001o.vy0
    /* renamed from: f */
    public final void mo32953f() {
        hzf hzfVar = this.f29439j;
        if (hzfVar != null) {
            hzfVar.m31319s();
        }
        this.f29445p = true;
    }

    @Override // p001o.vy0
    public final void flush() {
        if (mo21720a()) {
            vy0.C17692a c17692a = this.f29434e;
            this.f29436g = c17692a;
            vy0.C17692a c17692a2 = this.f29435f;
            this.f29437h = c17692a2;
            if (this.f29438i) {
                this.f29439j = new hzf(c17692a.f51021a, c17692a.f51022b, this.f29432c, this.f29433d, c17692a2.f51021a);
            } else {
                hzf hzfVar = this.f29439j;
                if (hzfVar != null) {
                    hzfVar.m31310i();
                }
            }
        }
        this.f29442m = vy0.f51019a;
        this.f29443n = 0L;
        this.f29444o = 0L;
        this.f29445p = false;
    }

    /* renamed from: g */
    public final long m32954g(long j) {
        if (this.f29444o < MediaStatus.COMMAND_QUEUE_REPEAT_ALL) {
            return (long) (this.f29432c * j);
        }
        long jM31313l = this.f29443n - ((hzf) op0.m42515e(this.f29439j)).m31313l();
        int i = this.f29437h.f51021a;
        int i2 = this.f29436g.f51021a;
        return i == i2 ? sqi.a1(j, jM31313l, this.f29444o) : sqi.a1(j, jM31313l * i, this.f29444o * i2);
    }

    /* renamed from: h */
    public final void m32955h(float f) {
        if (this.f29433d != f) {
            this.f29433d = f;
            this.f29438i = true;
        }
    }

    /* renamed from: i */
    public final void m32956i(float f) {
        if (this.f29432c != f) {
            this.f29432c = f;
            this.f29438i = true;
        }
    }

    @Override // p001o.vy0
    public final void reset() {
        this.f29432c = 1.0f;
        this.f29433d = 1.0f;
        vy0.C17692a c17692a = vy0.C17692a.f51020e;
        this.f29434e = c17692a;
        this.f29435f = c17692a;
        this.f29436g = c17692a;
        this.f29437h = c17692a;
        ByteBuffer byteBuffer = vy0.f51019a;
        this.f29440k = byteBuffer;
        this.f29441l = byteBuffer.asShortBuffer();
        this.f29442m = byteBuffer;
        this.f29431b = -1;
        this.f29438i = false;
        this.f29439j = null;
        this.f29443n = 0L;
        this.f29444o = 0L;
        this.f29445p = false;
    }
}
