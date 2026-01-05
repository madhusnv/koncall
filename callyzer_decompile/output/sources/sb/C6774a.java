package sb;

import an.b3;
import ec.InterfaceC2004b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import og.bb;
import og.gf;
import ox.C5770a;
import ox.EnumC5772c;
import td.C7124a;
import ud.C7399c;
import uw.InterfaceC7559c;
import wc.AbstractC7984r;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sb.a */
/* loaded from: classes.dex */
public final class C6774a implements InterfaceC6775b {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32233f = AtomicIntegerFieldUpdater.newUpdater(C6774a.class, "e");

    /* renamed from: a */
    public final C6780g f32234a;

    /* renamed from: b */
    public final long f32235b;

    /* renamed from: c */
    public final C7124a f32236c;

    /* renamed from: d */
    public final C7399c f32237d;

    /* renamed from: e */
    public volatile /* synthetic */ int f32238e;

    public C6774a(C6780g c6780g) {
        int i10 = C5770a.f28335d;
        EnumC5772c enumC5772c = EnumC5772c.SECONDS;
        long jM10551g = bb.m10551g(900, enumC5772c);
        long jM10551g2 = bb.m10551g(10, enumC5772c);
        C7124a c7124a = C7124a.f34340a;
        this.f32234a = c6780g;
        this.f32235b = jM10551g;
        this.f32236c = c7124a;
        this.f32237d = new C7399c(jM10551g2, c7124a);
        this.f32238e = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (f32233f.compareAndSet(this, 0, 1)) {
            this.f32237d.close();
            AbstractC7984r.m15160d(this.f32234a);
        }
    }

    @Override // vc.InterfaceC7700c
    public final Object resolve(InterfaceC2004b interfaceC2004b, InterfaceC7559c interfaceC7559c) {
        if (this.f32238e == 0) {
            return this.f32237d.m13805h(new b3(this, interfaceC2004b, null, 9), (AbstractC8193c) interfaceC7559c);
        }
        throw new IllegalStateException("Credentials provider is closed");
    }

    public final String toString() {
        return gf.m10673a(this) + ": " + gf.m10673a(this.f32234a);
    }
}
