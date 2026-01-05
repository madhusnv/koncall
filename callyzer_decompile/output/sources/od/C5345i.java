package od;

import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import g00.EnumC2418c;
import nd.InterfaceC5016g;
import nd.InterfaceC5018i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: od.i */
/* loaded from: classes.dex */
public final class C5345i implements InterfaceC5018i {

    /* renamed from: a */
    public static final C5345i f26259a = new C5345i();

    /* renamed from: b */
    public static final boolean f26260b;

    static {
        boolean z6;
        try {
            AbstractC2175d.m5853c("version_check").mo5850z(EnumC2418c.DEBUG);
            z6 = true;
        } catch (NoSuchMethodError unused) {
            AbstractC2175d.m5852b(C5345i.class).warn("falling back to SLF4J 1.x compatible binding");
            z6 = false;
        }
        f26260b = z6;
    }

    @Override // nd.InterfaceC5018i
    /* renamed from: a */
    public final InterfaceC5016g mo9905a(String str) {
        InterfaceC2173b interfaceC2173bM5853c = AbstractC2175d.m5853c(str);
        return f26260b ? new C5343g(interfaceC2173bM5853c) : new C5340d(interfaceC2173bM5853c);
    }
}
