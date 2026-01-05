package sc;

import java.util.LinkedHashMap;
import kc.C4046a;
import kc.InterfaceC4050e;
import rb.C6489b;
import rw.AbstractC6674x;
import ug.C7451v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sc.r */
/* loaded from: classes.dex */
public abstract class AbstractC6798r {

    /* renamed from: a */
    public static final C6797q f32311a;

    static {
        C6797q c6797q = C6797q.f32307d;
        C7451v c7451v = new C7451v(21);
        InterfaceC4050e[] interfaceC4050eArr = {C4046a.f20888a};
        l4.d0 d0Var = new l4.d0(16, interfaceC4050eArr);
        int iM12776d = AbstractC6674x.m12776d(1);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM12776d >= 16 ? iM12776d : 16);
        InterfaceC4050e interfaceC4050e = interfaceC4050eArr[0];
        linkedHashMap.put(new C6489b(interfaceC4050e.mo8835c()), interfaceC4050e);
        f32311a = new C6797q(d0Var, linkedHashMap, c7451v);
    }
}
