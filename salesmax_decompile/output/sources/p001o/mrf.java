package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class mrf {
    /* renamed from: a */
    public static final vz0 m39527a(boolean z, String str, List list, Boolean bool, Boolean bool2) {
        qx0 qx0VarM50736a;
        if (!z && str == null && list == null && bool == null && bool2 == null) {
            qx0VarM50736a = tx0.m50736a();
        } else {
            tob tobVarM50740e = tx0.m50740e();
            if (!(list == null || list.isEmpty())) {
                tobVarM50740e.mo34002p(x81.f53319a.m55807k(), kh3.V0(list));
            }
            orf.m42603a(tobVarM50740e, z, str, bool, bool2);
            qx0VarM50736a = tobVarM50740e;
        }
        return xz0.m56984a(d01.f18915b.m22175c(), qx0VarM50736a);
    }

    /* renamed from: b */
    public static /* synthetic */ vz0 m39528b(boolean z, String str, List list, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        return m39527a(z, str, list, bool, bool2);
    }
}
