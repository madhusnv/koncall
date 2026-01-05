package androidx.lifecycle;

import androidx.lifecycle.b0;
import p001o.dxi;
import p001o.gi9;
import p001o.kxi;
import p001o.ob9;
import p001o.sq8;
import p001o.uk7;
import p001o.ya4;

/* loaded from: classes2.dex */
public final class a0 implements gi9 {

    /* renamed from: a */
    public final ob9 f7641a;

    /* renamed from: b */
    public final uk7 f7642b;

    /* renamed from: c */
    public final uk7 f7643c;

    /* renamed from: d */
    public final uk7 f7644d;

    /* renamed from: e */
    public dxi f7645e;

    public a0(ob9 ob9Var, uk7 uk7Var, uk7 uk7Var2, uk7 uk7Var3) {
        sq8.m48649h(ob9Var, "viewModelClass");
        sq8.m48649h(uk7Var, "storeProducer");
        sq8.m48649h(uk7Var2, "factoryProducer");
        sq8.m48649h(uk7Var3, "extrasProducer");
        this.f7641a = ob9Var;
        this.f7642b = uk7Var;
        this.f7643c = uk7Var2;
        this.f7644d = uk7Var3;
    }

    @Override // p001o.gi9
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public dxi getValue() {
        dxi dxiVar = this.f7645e;
        if (dxiVar != null) {
            return dxiVar;
        }
        dxi dxiVarM6507c = b0.f7653b.m6512a((kxi) this.f7642b.invoke(), (b0.InterfaceC2131c) this.f7643c.invoke(), (ya4) this.f7644d.invoke()).m6507c(this.f7641a);
        this.f7645e = dxiVarM6507c;
        return dxiVarM6507c;
    }

    @Override // p001o.gi9
    public boolean isInitialized() {
        return this.f7645e != null;
    }
}
