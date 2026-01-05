package fb;

import eb.c3;
import ex.InterfaceC2141e;
import fd.C2271i;
import fd.C2272j;
import fd.C2274l;
import fd.InterfaceC2265c;
import fd.InterfaceC2275m;
import fd.InterfaceC2276n;
import hd.C2896h;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fb.s */
/* loaded from: classes.dex */
public final /* synthetic */ class C2245s extends AbstractC4152j implements InterfaceC2141e {

    /* renamed from: a */
    public static final C2245s f10231a = new C2245s(2, AbstractC2251y.class, "serializeSoftwareTokenMfaSettingsTypeDocument", "serializeSoftwareTokenMfaSettingsTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/SoftwareTokenMfaSettingsType;)V", 1);

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2275m p02 = (InterfaceC2275m) obj;
        c3 p12 = (c3) obj2;
        AbstractC4154l.m8923f(p02, "p0");
        AbstractC4154l.m8923f(p12, "p1");
        C2274l c2274l = C2274l.f10284b;
        C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Enabled")}), 0);
        C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("PreferredMfa")}), 0);
        InterfaceC2276n interfaceC2276nMo5962b = p02.mo5962b(new C2272j(a1.m14343w(c2271i, c2271i2)));
        interfaceC2276nMo5962b.mo2604n(c2271i, p12.f9283a);
        interfaceC2276nMo5962b.mo2604n(c2271i2, p12.f9284b);
        interfaceC2276nMo5962b.mo2598f();
        return qw.a0.f30746a;
    }
}
