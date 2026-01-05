package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class c7 implements dc9 {
    public /* synthetic */ c7(id5 id5Var) {
        this();
    }

    /* renamed from: i */
    public static /* synthetic */ void m20352i(c7 c7Var, jo3 jo3Var, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        c7Var.mo19321h(jo3Var, i, obj, z);
    }

    /* renamed from: a */
    public abstract Object mo18791a();

    /* renamed from: b */
    public abstract int mo18792b(Object obj);

    /* renamed from: c */
    public abstract void mo18793c(Object obj, int i);

    /* renamed from: d */
    public abstract Iterator mo20353d(Object obj);

    @Override // p001o.bn5
    public Object deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return m20354f(w75Var, null);
    }

    /* renamed from: e */
    public abstract int mo19320e(Object obj);

    /* renamed from: f */
    public final Object m20354f(w75 w75Var, Object obj) {
        Object objMo18791a;
        sq8.m48649h(w75Var, "decoder");
        if (obj == null || (objMo18791a = mo18794k(obj)) == null) {
            objMo18791a = mo18791a();
        }
        int iMo18792b = mo18792b(objMo18791a);
        jo3 jo3VarMo20420b = w75Var.mo20420b(getDescriptor());
        if (!jo3VarMo20420b.mo17245n()) {
            while (true) {
                int iMo16814k = jo3VarMo20420b.mo16814k(getDescriptor());
                if (iMo16814k == -1) {
                    break;
                }
                m20352i(this, jo3VarMo20420b, iMo18792b + iMo16814k, objMo18791a, false, 8, null);
            }
        } else {
            mo20355g(jo3VarMo20420b, objMo18791a, iMo18792b, m20356j(jo3VarMo20420b, objMo18791a));
        }
        jo3VarMo20420b.mo18548c(getDescriptor());
        return mo18795l(objMo18791a);
    }

    /* renamed from: g */
    public abstract void mo20355g(jo3 jo3Var, Object obj, int i, int i2);

    /* renamed from: h */
    public abstract void mo19321h(jo3 jo3Var, int i, Object obj, boolean z);

    /* renamed from: j */
    public final int m20356j(jo3 jo3Var, Object obj) {
        int iMo17248q = jo3Var.mo17248q(getDescriptor());
        mo18793c(obj, iMo17248q);
        return iMo17248q;
    }

    /* renamed from: k */
    public abstract Object mo18794k(Object obj);

    /* renamed from: l */
    public abstract Object mo18795l(Object obj);

    public c7() {
    }
}
