package c8;

import b8.InterfaceC0607b;
import ex.InterfaceC2141e;
import java.io.IOException;
import l8.InterfaceC4431e;
import nf.C5047i;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c8.b */
/* loaded from: classes.dex */
public final class C0899b implements InterfaceC0607b {

    /* renamed from: a */
    public final C5047i f5552a;

    public C0899b(C5047i c5047i) {
        this.f5552a = c5047i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((InterfaceC4431e) this.f5552a.f24823b).close();
    }

    @Override // b8.InterfaceC0607b
    /* renamed from: s */
    public final Object mo1767s(boolean z6, InterfaceC2141e interfaceC2141e, AbstractC8193c abstractC8193c) {
        InterfaceC4431e interfaceC4431e = (InterfaceC4431e) this.f5552a.f24823b;
        interfaceC4431e.getClass();
        return interfaceC2141e.invoke(new C0902e(new C0898a(interfaceC4431e.mo9273O())), abstractC8193c);
    }
}
