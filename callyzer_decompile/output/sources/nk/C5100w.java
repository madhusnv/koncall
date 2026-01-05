package nk;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import kk.AbstractC4103w;
import kk.EnumC4100t;
import kk.InterfaceC4101u;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.w */
/* loaded from: classes.dex */
public final class C5100w extends AbstractC4103w {

    /* renamed from: b */
    public static final C5098u f24988b = new C5098u(0, new C5100w(EnumC4100t.LAZILY_PARSED_NUMBER));

    /* renamed from: a */
    public final InterfaceC4101u f24989a;

    public C5100w(InterfaceC4101u interfaceC4101u) {
        this.f24989a = interfaceC4101u;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) {
        EnumC6565b enumC6565bE0 = c6564a.E0();
        int i10 = AbstractC5099v.f24987a[enumC6565bE0.ordinal()];
        if (i10 == 1) {
            c6564a.A0();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f24989a.readNumber(c6564a);
        }
        throw new JsonSyntaxException("Expecting number, got: " + enumC6565bE0 + "; at path " + c6564a.mo10021H());
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        c6566c.t0((Number) obj);
    }
}
