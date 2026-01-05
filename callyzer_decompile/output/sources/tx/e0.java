package tx;

import ay.C0496f;
import ux.C7569c;
import yx.AbstractC8819m;
import yx.AbstractC8825s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class e0 {

    /* renamed from: a */
    public static final h0 f34625a;

    static {
        String property;
        h0 h0Var;
        int i10 = AbstractC8825s.f42520a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C0496f c0496f = m0.f34659a;
            C7569c c7569c = AbstractC8819m.f42514a;
            C7569c c7569c2 = c7569c.f36446f;
            h0Var = c7569c;
            if (c7569c == null) {
                h0Var = d0.f34618k;
            }
        } else {
            h0Var = d0.f34618k;
        }
        f34625a = h0Var;
    }
}
