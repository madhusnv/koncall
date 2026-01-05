package gv;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2139c;
import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gv.d */
/* loaded from: classes3.dex */
public final class C2733d implements InterfaceC2139c {

    /* renamed from: a */
    public static final C2733d f15266a = new C2733d();

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        String it = (String) obj;
        AbstractC4154l.m8923f(it, "it");
        C8791f c8791f = C8791f.f42457a;
        List listM10112W = AbstractC5178p.m10112W(it, new String[]{"@"}, 6);
        String strM4561h = (String) listM10112W.get(0);
        String str = (String) listM10112W.get(1);
        if (strM4561h.length() > 3) {
            strM4561h = AbstractC1452a.m4561h(AbstractC5178p.f0(3, strM4561h), AbstractC5185w.m10134p(strM4561h.length() - 3, "*"));
        }
        return m0.m7379l(strM4561h, "@", str);
    }
}
