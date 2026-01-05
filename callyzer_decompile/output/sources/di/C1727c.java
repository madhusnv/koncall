package di;

import a1.C0005d;
import ai.InterfaceC0147d;
import ai.InterfaceC0157n;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: di.c */
/* loaded from: classes.dex */
public final class C1727c implements InterfaceC0157n {

    /* renamed from: a */
    public static final Logger f8371a = Logger.getLogger(C1727c.class.getName());

    @Override // ai.InterfaceC0157n
    /* renamed from: a */
    public final Class mo361a() {
        return InterfaceC0147d.class;
    }

    @Override // ai.InterfaceC0157n
    /* renamed from: b */
    public final Class mo362b() {
        return InterfaceC0147d.class;
    }

    @Override // ai.InterfaceC0157n
    /* renamed from: c */
    public final Object mo363c(C0005d c0005d) {
        C1726b c1726b = new C1726b();
        c1726b.f8370a = c0005d;
        return c1726b;
    }
}
