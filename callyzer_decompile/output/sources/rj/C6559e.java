package rj;

import sj.C6850b;
import sj.EnumC6852d;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rj.e */
/* loaded from: classes.dex */
public final class C6559e implements InterfaceC6562h {

    /* renamed from: a */
    public final C6563i f31414a;

    /* renamed from: b */
    public final C8650g f31415b;

    public C6559e(C6563i c6563i, C8650g c8650g) {
        this.f31414a = c6563i;
        this.f31415b = c8650g;
    }

    @Override // rj.InterfaceC6562h
    /* renamed from: a */
    public final boolean mo12572a(Exception exc) {
        this.f31415b.m15970c(exc);
        return true;
    }

    @Override // rj.InterfaceC6562h
    /* renamed from: b */
    public final boolean mo12573b(C6850b c6850b) {
        if (c6850b.f32523b != EnumC6852d.REGISTERED || this.f31414a.m12575a(c6850b)) {
            return false;
        }
        String str = c6850b.f32524c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f31415b.m15969b(new C6555a(str, c6850b.f32526e, c6850b.f32527f));
        return true;
    }
}
