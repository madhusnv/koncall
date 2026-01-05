package tb;

import ai.AbstractC0151h;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import pg.h6;
import sb.C6778e;
import sd.AbstractC6812f;
import td.EnumC7143t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 extends AbstractC0151h {

    /* renamed from: b */
    public final InterfaceC2137a f34271b;

    /* JADX WARN: Illegal instructions before constructor call */
    public j0() {
        i0 i0Var = i0.f34266a;
        super(EnumC7093d.SIGV4, i0Var);
        this.f34271b = i0Var;
    }

    @Override // tb.o0
    /* renamed from: d */
    public final String mo13375d(String stringToSign, byte[] signingKey) {
        AbstractC4154l.m8923f(signingKey, "signingKey");
        AbstractC4154l.m8923f(stringToSign, "stringToSign");
        return AbstractC6812f.m12986a(h6.m11672b(signingKey, AbstractC5185w.m10128j(stringToSign), this.f34271b));
    }

    @Override // tb.o0
    /* renamed from: k */
    public final byte[] mo13376k(C7096g c7096g) {
        byte[] bArrM10128j = AbstractC5185w.m10128j("AWS4" + ((C6778e) c7096g.f34250l).f32240b);
        byte[] bArrM10128j2 = AbstractC5185w.m10128j(c7096g.f34241c.m13409b(EnumC7143t.ISO_8601_CONDENSED_DATE));
        InterfaceC2137a interfaceC2137a = this.f34271b;
        return h6.m11672b(h6.m11672b(h6.m11672b(h6.m11672b(bArrM10128j, bArrM10128j2, interfaceC2137a), AbstractC5185w.m10128j(c7096g.f34239a), interfaceC2137a), AbstractC5185w.m10128j(c7096g.f34240b), interfaceC2137a), AbstractC5185w.m10128j("aws4_request"), interfaceC2137a);
    }

    @Override // ai.AbstractC0151h
    /* renamed from: z */
    public final InterfaceC2137a mo346z() {
        return this.f34271b;
    }
}
