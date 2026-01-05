package ad;

import bj.C0669a;
import com.amplifyframework.core.model.ModelIdentifier;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ad.o */
/* loaded from: classes.dex */
public final class C0108o {
    /* renamed from: a */
    public static C0109p m297a(C0108o c0108o, String value) {
        final C0110q encoding = AbstractC0114u.f387c;
        c0108o.getClass();
        AbstractC4154l.m8923f(value, "value");
        AbstractC4154l.m8923f(encoding, "encoding");
        try {
            final C0104k c0104k = new C0104k();
            final C0669a c0669a = new C0669a(value);
            c0669a.m1940b(new String[]{"://"}, new C0105l(c0104k, 0));
            c0669a.m1941c(new String[]{"/", "?", ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER}, new C0105l(c0104k, 1));
            final int i10 = 0;
            InterfaceC2137a interfaceC2137a = new InterfaceC2137a() { // from class: ad.m
                @Override // ex.InterfaceC2137a
                public final Object invoke() {
                    switch (i10) {
                        case 0:
                            c0669a.m1941c(new String[]{"?", ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER}, new C0107n(c0104k, encoding, 2));
                            break;
                        default:
                            c0669a.m1941c(new String[]{ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER}, new C0107n(c0104k, encoding, 0));
                            break;
                    }
                    return a0.f30746a;
                }
            };
            if (AbstractC5185w.m10133o(c0669a.f4225b, 0, 1, value, "/", false)) {
                interfaceC2137a.invoke();
            }
            final int i11 = 1;
            InterfaceC2137a interfaceC2137a2 = new InterfaceC2137a() { // from class: ad.m
                @Override // ex.InterfaceC2137a
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            c0669a.m1941c(new String[]{"?", ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER}, new C0107n(c0104k, encoding, 2));
                            break;
                        default:
                            c0669a.m1941c(new String[]{ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER}, new C0107n(c0104k, encoding, 0));
                            break;
                    }
                    return a0.f30746a;
                }
            };
            if (AbstractC5185w.m10133o(c0669a.f4225b, 0, 1, value, "?", false)) {
                interfaceC2137a2.invoke();
            }
            if (AbstractC5185w.m10133o(c0669a.f4225b, 0, 1, value, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, false)) {
                c0669a.f4225b = 1 + c0669a.f4225b;
                c0669a.m1941c(new String[0], new C0107n(c0104k, encoding, 1));
            }
            return c0104k.m293a();
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(AbstractC5601a.m11238i("Cannot parse \"", value, "\" as a URL"), e2);
        }
    }
}
