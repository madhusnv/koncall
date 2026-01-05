package t3;

import ex.InterfaceC2141e;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t3.g */
/* loaded from: classes.dex */
public final class C7020g extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public static final C7020g f34000a = new C7020g(2);

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        int iIntValue = ((Number) obj2).intValue();
        C3966o c3966o = (C3966o) interfaceC3962k;
        if (!c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
            c3966o.m8601S();
        }
        return qw.a0.f30746a;
    }
}
