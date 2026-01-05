package rj;

import sj.C6850b;
import sj.EnumC6852d;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rj.f */
/* loaded from: classes.dex */
public final class C6560f implements InterfaceC6562h {

    /* renamed from: a */
    public final C8650g f31416a;

    public C6560f(C8650g c8650g) {
        this.f31416a = c8650g;
    }

    @Override // rj.InterfaceC6562h
    /* renamed from: a */
    public final boolean mo12572a(Exception exc) {
        return false;
    }

    @Override // rj.InterfaceC6562h
    /* renamed from: b */
    public final boolean mo12573b(C6850b c6850b) {
        EnumC6852d enumC6852d = c6850b.f32523b;
        if (enumC6852d != EnumC6852d.UNREGISTERED && enumC6852d != EnumC6852d.REGISTERED && enumC6852d != EnumC6852d.REGISTER_ERROR) {
            return false;
        }
        this.f31416a.m15971d(c6850b.f32522a);
        return true;
    }
}
