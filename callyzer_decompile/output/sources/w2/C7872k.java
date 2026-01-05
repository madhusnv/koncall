package w2;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w2.k */
/* loaded from: classes.dex */
public final class C7872k extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public static final C7872k f37664a = new C7872k(2);

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC7877p interfaceC7877p = (InterfaceC7877p) obj2;
        if (str.length() == 0) {
            return interfaceC7877p.toString();
        }
        return str + ", " + interfaceC7877p;
    }
}
