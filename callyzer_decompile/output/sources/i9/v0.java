package i9;

import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import ec.InterfaceC2004b;
import hq.C3008m;
import nd.EnumC5011b;
import nx.AbstractC5178p;
import og.gf;
import og.mb;
import og.u1;
import p020v.a1;
import pa.EnumC5867a;
import pg.x7;
import sb.InterfaceC6779f;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 implements InterfaceC6779f {

    /* renamed from: a */
    public final C3183a f17285a;

    public v0(C3183a c3183a) {
        this.f17285a = c3183a;
    }

    /* renamed from: a */
    public final String m7552a(String str) {
        String str2 = (String) this.f17285a.invoke(str);
        if (str2 != null) {
            if (AbstractC5178p.m10101L(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        throw new ProviderConfigurationException(a1.m14328h('`', "Missing value for system property `", str), null);
    }

    @Override // vc.InterfaceC7700c
    public final Object resolve(InterfaceC2004b interfaceC2004b, InterfaceC7559c interfaceC7559c) {
        InterfaceC7564h context = interfaceC7559c.getContext();
        C3008m c3008m = new C3008m(17);
        EnumC5011b enumC5011b = EnumC5011b.Trace;
        String strM8913b = kotlin.jvm.internal.a0.m8901a(v0.class).m8913b();
        if (strM8913b == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
        }
        u1.m10948g(context, enumC5011b, strM8913b, null, c3008m);
        String strM7552a = m7552a(w0.f17299a);
        String strM7552a2 = m7552a(w0.f17300b);
        String str = w0.f17301c;
        C3183a c3183a = this.f17285a;
        return mb.m10761b(x7.m11931b(8, strM7552a, strM7552a2, (String) c3183a.invoke(str), "SystemProperties", (String) c3183a.invoke(w0.f17302d)), EnumC5867a.a.CREDENTIALS_JVM_SYSTEM_PROPERTIES);
    }

    public final String toString() {
        return gf.m10673a(this);
    }
}
