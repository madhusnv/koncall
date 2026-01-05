package fb;

import androidx.datastore.preferences.protobuf.o1;
import eb.l1;
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
/* renamed from: fb.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C2229c extends AbstractC4152j implements InterfaceC2141e {

    /* renamed from: a */
    public static final C2229c f10216a = new C2229c(2, o1.class, "serializeDeviceSecretVerifierConfigTypeDocument", "serializeDeviceSecretVerifierConfigTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/DeviceSecretVerifierConfigType;)V", 1);

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2275m p02 = (InterfaceC2275m) obj;
        l1 p12 = (l1) obj2;
        AbstractC4154l.m8923f(p02, "p0");
        AbstractC4154l.m8923f(p12, "p1");
        C2274l c2274l = C2274l.f10291i;
        C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("PasswordVerifier")}), 0);
        C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Salt")}), 0);
        InterfaceC2276n interfaceC2276nMo5962b = p02.mo5962b(new C2272j(a1.m14343w(c2271i, c2271i2)));
        String str = p12.f9358a;
        if (str != null) {
            interfaceC2276nMo5962b.mo2596d(c2271i, str);
        }
        String str2 = p12.f9359b;
        if (str2 != null) {
            interfaceC2276nMo5962b.mo2596d(c2271i2, str2);
        }
        interfaceC2276nMo5962b.mo2598f();
        return qw.a0.f30746a;
    }
}
