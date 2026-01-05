package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;

/* loaded from: classes3.dex */
public abstract class tx0 {
    /* renamed from: a */
    public static final qx0 m50736a() {
        return b66.f15584a;
    }

    /* renamed from: b */
    public static final Object m50737b(qx0 qx0Var, kx0 kx0Var) {
        sq8.m48649h(qx0Var, "<this>");
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        Object objMo18191b = qx0Var.mo18191b(kx0Var);
        if (objMo18191b != null) {
            return objMo18191b;
        }
        throw new IllegalStateException("No instance for " + kx0Var);
    }

    /* renamed from: c */
    public static final boolean m50738c(qx0 qx0Var) {
        sq8.m48649h(qx0Var, "<this>");
        return !qx0Var.isEmpty();
    }

    /* renamed from: d */
    public static final void m50739d(tob tobVar, qx0 qx0Var) {
        sq8.m48649h(tobVar, "<this>");
        sq8.m48649h(qx0Var, "other");
        for (kx0 kx0Var : qx0Var.mo18190a()) {
            sq8.m48647f(kx0Var, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.collections.AttributeKey<kotlin.Any>");
            tobVar.mo34002p(kx0Var, m50737b(qx0Var, kx0Var));
        }
    }

    /* renamed from: e */
    public static final tob m50740e() {
        return new sx0();
    }

    /* renamed from: f */
    public static final void m50741f(tob tobVar, kx0 kx0Var, Object obj) {
        sq8.m48649h(tobVar, "<this>");
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
        if (tobVar.mo18192c(kx0Var)) {
            return;
        }
        tobVar.mo34002p(kx0Var, obj);
    }

    /* renamed from: g */
    public static final void m50742g(tob tobVar, kx0 kx0Var, Object obj) {
        sq8.m48649h(tobVar, "<this>");
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        if (obj != null) {
            m50741f(tobVar, kx0Var, obj);
        }
    }

    /* renamed from: h */
    public static final void m50743h(tob tobVar, kx0 kx0Var, Object obj) {
        sq8.m48649h(tobVar, "<this>");
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        if (obj != null) {
            tobVar.mo34002p(kx0Var, obj);
        }
    }

    /* renamed from: i */
    public static final Object m50744i(tob tobVar, kx0 kx0Var) {
        sq8.m48649h(tobVar, "<this>");
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        Object objMo18191b = tobVar.mo18191b(kx0Var);
        tobVar.mo34003q(kx0Var);
        return objMo18191b;
    }

    /* renamed from: j */
    public static final tob m50745j(qx0 qx0Var) {
        sq8.m48649h(qx0Var, "<this>");
        return new sx0(qx0Var);
    }
}
