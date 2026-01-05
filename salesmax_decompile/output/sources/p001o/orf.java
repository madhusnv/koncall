package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.dx7;

/* loaded from: classes3.dex */
public abstract class orf {
    /* renamed from: a */
    public static final void m42603a(tob tobVar, boolean z, String str, Boolean bool, Boolean bool2) {
        sq8.m48649h(tobVar, "attrs");
        if (z) {
            tobVar.mo34002p(x81.f53319a.m55800d(), dx7.C13056g.f20626b);
        }
        x81 x81Var = x81.f53319a;
        m42604b(tobVar, x81Var.m55808l(), str);
        if (bool != null) {
            tobVar.mo34002p(x81Var.m55809m(), Boolean.valueOf(!bool.booleanValue()));
        }
        if (bool2 != null) {
            tobVar.mo34002p(x81Var.m55801e(), bool2);
        }
    }

    /* renamed from: b */
    public static final void m42604b(tob tobVar, kx0 kx0Var, String str) {
        sq8.m48649h(tobVar, "<this>");
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        if (str == null || f9g.d0(str)) {
            return;
        }
        tobVar.mo34002p(kx0Var, str);
    }

    /* renamed from: c */
    public static final vz0 m42605c(boolean z, String str, String str2, Boolean bool, Boolean bool2) {
        qx0 qx0VarM50736a;
        if (!z && str == null && str2 == null && bool == null && bool2 == null) {
            qx0VarM50736a = tx0.m50736a();
        } else {
            tob tobVarM50740e = tx0.m50740e();
            m42604b(tobVarM50740e, x81.f53319a.m55806j(), str2);
            m42603a(tobVarM50740e, z, str, bool, bool2);
            qx0VarM50736a = tobVarM50740e;
        }
        return xz0.m56984a(d01.f18915b.m22174b(), qx0VarM50736a);
    }

    /* renamed from: d */
    public static /* synthetic */ vz0 m42606d(boolean z, String str, String str2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        return m42605c(z, str, str2, bool, bool2);
    }
}
