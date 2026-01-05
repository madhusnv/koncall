package j9;

import ec.InterfaceC2004b;
import i9.C3184b;
import sb.InterfaceC6775b;
import uw.InterfaceC7559c;
import wc.c0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j9.a */
/* loaded from: classes.dex */
public final class C3606a extends c0 implements InterfaceC6775b {

    /* renamed from: c */
    public final C3184b f19235c;

    public C3606a(C3184b c3184b) {
        super(c3184b);
        this.f19235c = c3184b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19235c.close();
    }

    @Override // vc.InterfaceC7700c
    public final Object resolve(InterfaceC2004b interfaceC2004b, InterfaceC7559c interfaceC7559c) {
        return this.f19235c.f17123f.resolve(interfaceC2004b, interfaceC7559c);
    }
}
