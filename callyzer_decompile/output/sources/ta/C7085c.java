package ta;

import dc.InterfaceC1681a;
import ea.AbstractC1976f;
import gc.AbstractC2562f;
import i9.C3183a;
import ia.C3211c;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import qw.InterfaceC6357g;
import ud.InterfaceC7411o;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ta.c */
/* loaded from: classes.dex */
public final class C7085c implements InterfaceC1681a, Closeable {

    /* renamed from: a */
    public final InterfaceC6357g f34190a;

    /* renamed from: b */
    public final InterfaceC7411o f34191b;

    /* renamed from: c */
    public final C4367l f34192c = new C4367l(new C3183a(1, this, C7085c.class, "loadRegion", "loadRegion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 23));

    public C7085c(InterfaceC6357g interfaceC6357g, InterfaceC7411o interfaceC7411o) {
        this.f34190a = interfaceC6357g;
        this.f34191b = interfaceC7411o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC6357g interfaceC6357g = this.f34190a;
        if (interfaceC6357g.isInitialized()) {
            ((C3211c) interfaceC6357g.getValue()).close();
        }
    }

    @Override // dc.InterfaceC1681a
    /* renamed from: h */
    public final Object mo5383h(AbstractC8193c abstractC8193c) {
        if (AbstractC4154l.m8918a(AbstractC2562f.m6572a(AbstractC1976f.f9251j, this.f34191b), Boolean.TRUE)) {
            return null;
        }
        return this.f34192c.m9139s(abstractC8193c);
    }
}
