package p001o;

import java.util.Iterator;
import p001o.jo3;

/* loaded from: classes6.dex */
public abstract class ug3 extends c7 {

    /* renamed from: a */
    public final dc9 f48897a;

    public /* synthetic */ ug3(dc9 dc9Var, id5 id5Var) {
        this(dc9Var);
    }

    @Override // p001o.c7
    /* renamed from: g */
    public final void mo20355g(jo3 jo3Var, Object obj, int i, int i2) {
        sq8.m48649h(jo3Var, "decoder");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i3 = 0; i3 < i2; i3++) {
            mo19321h(jo3Var, i + i3, obj, false);
        }
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public abstract uef getDescriptor();

    @Override // p001o.c7
    /* renamed from: h */
    public void mo19321h(jo3 jo3Var, int i, Object obj, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        mo18796n(obj, i, jo3.C14621a.m34148c(jo3Var, getDescriptor(), i, this.f48897a, null, 8, null));
    }

    /* renamed from: n */
    public abstract void mo18796n(Object obj, int i, Object obj2);

    @Override // p001o.iff
    public void serialize(h76 h76Var, Object obj) {
        sq8.m48649h(h76Var, "encoder");
        int iMo19320e = mo19320e(obj);
        uef descriptor = getDescriptor();
        lo3 lo3VarMo29874D = h76Var.mo29874D(descriptor, iMo19320e);
        Iterator itMo20353d = mo20353d(obj);
        for (int i = 0; i < iMo19320e; i++) {
            lo3VarMo29874D.mo37566l(getDescriptor(), i, this.f48897a, itMo20353d.next());
        }
        lo3VarMo29874D.mo37560c(descriptor);
    }

    public ug3(dc9 dc9Var) {
        super(null);
        this.f48897a = dc9Var;
    }
}
