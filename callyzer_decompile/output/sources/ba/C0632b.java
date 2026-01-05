package ba;

import aa.AbstractC0082i;
import ex.InterfaceC2141e;
import fd.C2271i;
import fd.C2272j;
import fd.C2274l;
import fd.InterfaceC2265c;
import fd.InterfaceC2275m;
import fd.InterfaceC2276n;
import gd.C2565c;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import rw.AbstractC6662l;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ba.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0632b extends AbstractC4152j implements InterfaceC2141e {

    /* renamed from: a */
    public static final C0632b f4102a = new C0632b(2, AbstractC0639i.class, "serializeTagDocument", "serializeTagDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/Tag;)V", 1);

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2275m p02 = (InterfaceC2275m) obj;
        AbstractC0082i p12 = (AbstractC0082i) obj2;
        AbstractC4154l.m8923f(p02, "p0");
        AbstractC4154l.m8923f(p12, "p1");
        C2274l c2274l = C2274l.f10291i;
        C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("Key")}), 0);
        C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("Value")}), 0);
        C8849i c8849i = new C8849i(4);
        ((LinkedHashSet) c8849i.f42584c).add(new C2565c("Tag"));
        c8849i.m16319q(c2271i);
        c8849i.m16319q(c2271i2);
        InterfaceC2276n interfaceC2276nMo5962b = p02.mo5962b(new C2272j(c8849i));
        p12.getClass();
        interfaceC2276nMo5962b.mo2596d(c2271i, null);
        interfaceC2276nMo5962b.mo2596d(c2271i2, null);
        interfaceC2276nMo5962b.mo2598f();
        return a0.f30746a;
    }
}
