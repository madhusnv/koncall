package p001o;

import java.util.Iterator;
import java.util.Map;
import p001o.jo3;

/* loaded from: classes6.dex */
public abstract class xra extends c7 {

    /* renamed from: a */
    public final dc9 f54170a;

    /* renamed from: b */
    public final dc9 f54171b;

    public /* synthetic */ xra(dc9 dc9Var, dc9 dc9Var2, id5 id5Var) {
        this(dc9Var, dc9Var2);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public abstract uef getDescriptor();

    /* renamed from: m */
    public final dc9 m56697m() {
        return this.f54170a;
    }

    /* renamed from: n */
    public final dc9 m56698n() {
        return this.f54171b;
    }

    @Override // p001o.c7
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void mo20355g(jo3 jo3Var, Map map, int i, int i2) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(map, "builder");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        il8 il8VarM18615r = bce.m18615r(bce.m18616s(0, i2 * 2), 2);
        int iM32260e = il8VarM18615r.m32260e();
        int iM32261j = il8VarM18615r.m32261j();
        int iM32262n = il8VarM18615r.m32262n();
        if ((iM32262n <= 0 || iM32260e > iM32261j) && (iM32262n >= 0 || iM32261j > iM32260e)) {
            return;
        }
        while (true) {
            mo19321h(jo3Var, i + iM32260e, map, false);
            if (iM32260e == iM32261j) {
                return;
            } else {
                iM32260e += iM32262n;
            }
        }
    }

    @Override // p001o.c7
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void mo19321h(jo3 jo3Var, int i, Map map, boolean z) {
        int iMo16814k;
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(map, "builder");
        Object objM34148c = jo3.C14621a.m34148c(jo3Var, getDescriptor(), i, this.f54170a, null, 8, null);
        if (z) {
            iMo16814k = jo3Var.mo16814k(getDescriptor());
            if (!(iMo16814k == i + 1)) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + iMo16814k).toString());
            }
        } else {
            iMo16814k = i + 1;
        }
        int i2 = iMo16814k;
        map.put(objM34148c, (!map.containsKey(objM34148c) || (this.f54171b.getDescriptor().getKind() instanceof vhd)) ? jo3.C14621a.m34148c(jo3Var, getDescriptor(), i2, this.f54171b, null, 8, null) : jo3Var.mo17252u(getDescriptor(), i2, this.f54171b, isa.m32682i(map, objM34148c)));
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, Object obj) {
        sq8.m48649h(h76Var, "encoder");
        int iMo19320e = mo19320e(obj);
        uef descriptor = getDescriptor();
        lo3 lo3VarMo29874D = h76Var.mo29874D(descriptor, iMo19320e);
        Iterator itMo20353d = mo20353d(obj);
        int i = 0;
        while (itMo20353d.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo20353d.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            lo3VarMo29874D.mo37566l(getDescriptor(), i, m56697m(), key);
            lo3VarMo29874D.mo37566l(getDescriptor(), i2, m56698n(), value);
            i = i2 + 1;
        }
        lo3VarMo29874D.mo37560c(descriptor);
    }

    public xra(dc9 dc9Var, dc9 dc9Var2) {
        super(null);
        this.f54170a = dc9Var;
        this.f54171b = dc9Var2;
    }
}
