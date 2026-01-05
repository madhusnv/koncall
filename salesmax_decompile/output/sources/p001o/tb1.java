package p001o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p001o.vy0;

/* loaded from: classes2.dex */
public abstract class tb1 implements vy0 {

    /* renamed from: b */
    public vy0.C17692a f46750b;

    /* renamed from: c */
    public vy0.C17692a f46751c;

    /* renamed from: d */
    public vy0.C17692a f46752d;

    /* renamed from: e */
    public vy0.C17692a f46753e;

    /* renamed from: f */
    public ByteBuffer f46754f;

    /* renamed from: g */
    public ByteBuffer f46755g;

    /* renamed from: h */
    public boolean f46756h;

    public tb1() {
        ByteBuffer byteBuffer = vy0.f51019a;
        this.f46754f = byteBuffer;
        this.f46755g = byteBuffer;
        vy0.C17692a c17692a = vy0.C17692a.f51020e;
        this.f46752d = c17692a;
        this.f46753e = c17692a;
        this.f46750b = c17692a;
        this.f46751c = c17692a;
    }

    @Override // p001o.vy0
    /* renamed from: a */
    public boolean mo21720a() {
        return this.f46753e != vy0.C17692a.f51020e;
    }

    @Override // p001o.vy0
    /* renamed from: b */
    public boolean mo32950b() {
        return this.f46756h && this.f46755g == vy0.f51019a;
    }

    @Override // p001o.vy0
    /* renamed from: c */
    public ByteBuffer mo32951c() {
        ByteBuffer byteBuffer = this.f46755g;
        this.f46755g = vy0.f51019a;
        return byteBuffer;
    }

    @Override // p001o.vy0
    /* renamed from: d */
    public final vy0.C17692a mo32952d(vy0.C17692a c17692a) {
        this.f46752d = c17692a;
        this.f46753e = mo21722h(c17692a);
        return mo21720a() ? this.f46753e : vy0.C17692a.f51020e;
    }

    @Override // p001o.vy0
    /* renamed from: f */
    public final void mo32953f() {
        this.f46756h = true;
        mo21724j();
    }

    @Override // p001o.vy0
    public final void flush() {
        this.f46755g = vy0.f51019a;
        this.f46756h = false;
        this.f46750b = this.f46752d;
        this.f46751c = this.f46753e;
        mo21723i();
    }

    /* renamed from: g */
    public final boolean m49664g() {
        return this.f46755g.hasRemaining();
    }

    /* renamed from: h */
    public abstract vy0.C17692a mo21722h(vy0.C17692a c17692a);

    /* renamed from: i */
    public void mo21723i() {
    }

    /* renamed from: j */
    public void mo21724j() {
    }

    /* renamed from: k */
    public void mo21725k() {
    }

    /* renamed from: l */
    public final ByteBuffer m49665l(int i) {
        if (this.f46754f.capacity() < i) {
            this.f46754f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f46754f.clear();
        }
        ByteBuffer byteBuffer = this.f46754f;
        this.f46755g = byteBuffer;
        return byteBuffer;
    }

    @Override // p001o.vy0
    public final void reset() {
        flush();
        this.f46754f = vy0.f51019a;
        vy0.C17692a c17692a = vy0.C17692a.f51020e;
        this.f46752d = c17692a;
        this.f46753e = c17692a;
        this.f46750b = c17692a;
        this.f46751c = c17692a;
        mo21725k();
    }
}
