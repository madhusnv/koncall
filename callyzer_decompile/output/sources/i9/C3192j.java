package i9;

import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import ec.InterfaceC2004b;
import ex.InterfaceC2139c;
import hq.C3008m;
import kotlin.jvm.internal.AbstractC4152j;
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
/* renamed from: i9.j */
/* loaded from: classes.dex */
public final class C3192j implements InterfaceC6779f {

    /* renamed from: a */
    public final AbstractC4152j f17186a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3192j(InterfaceC2139c interfaceC2139c) {
        this.f17186a = (AbstractC4152j) interfaceC2139c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.c, kotlin.jvm.internal.j] */
    /* renamed from: a */
    public final String m7545a(String str) {
        String str2 = (String) this.f17186a.invoke(str);
        if (str2 != null) {
            if (AbstractC5178p.m10101L(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        throw new ProviderConfigurationException(a1.m14328h('`', "Missing value for environment variable `", str), null);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // vc.InterfaceC7700c
    public final Object resolve(InterfaceC2004b interfaceC2004b, InterfaceC7559c interfaceC7559c) {
        InterfaceC7564h context = interfaceC7559c.getContext();
        C3008m c3008m = new C3008m(9);
        EnumC5011b enumC5011b = EnumC5011b.Trace;
        String strM8913b = kotlin.jvm.internal.a0.m8901a(C3192j.class).m8913b();
        if (strM8913b == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
        }
        u1.m10948g(context, enumC5011b, strM8913b, null, c3008m);
        String strM7545a = m7545a(AbstractC3193k.f17192a);
        String strM7545a2 = m7545a(AbstractC3193k.f17193b);
        String str = AbstractC3193k.f17194c;
        ?? r82 = this.f17186a;
        return mb.m10761b(x7.m11931b(8, strM7545a, strM7545a2, (String) r82.invoke(str), "Environment", (String) r82.invoke(AbstractC3193k.f17195d)), EnumC5867a.a.CREDENTIALS_ENV_VARS);
    }

    public final String toString() {
        return gf.m10673a(this);
    }
}
