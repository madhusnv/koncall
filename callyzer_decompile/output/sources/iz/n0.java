package iz;

import b00.C0526k;
import b00.C0529n;
import b00.InterfaceC0528m;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class n0 implements Closeable {

    /* renamed from: b */
    public static final m0 f17961b;

    /* renamed from: a */
    public l0 f17962a;

    static {
        C0529n c0529n = C0529n.f3647d;
        AbstractC4154l.m8923f(c0529n, "<this>");
        C0526k c0526k = new C0526k();
        c0526k.A0(c0529n);
        f17961b = new m0(null, c0529n.f3648a.length, c0526k);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC4297c.m8998b(mo7462n());
    }

    /* renamed from: h */
    public abstract long mo7460h();

    /* renamed from: j */
    public abstract C3393z mo7461j();

    /* renamed from: n */
    public abstract InterfaceC0528m mo7462n();
}
