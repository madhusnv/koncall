package p001o;

import p001o.bff;
import p001o.p9g;

/* loaded from: classes6.dex */
public final class ydd implements yff {

    /* renamed from: a */
    public final boolean f55321a;

    /* renamed from: b */
    public final String f55322b;

    public ydd(boolean z, String str) {
        sq8.m48649h(str, "discriminator");
        this.f55321a = z;
        this.f55322b = str;
    }

    @Override // p001o.yff
    /* renamed from: a */
    public void mo57653a(ob9 ob9Var, xk7 xk7Var) {
        sq8.m48649h(ob9Var, "baseClass");
        sq8.m48649h(xk7Var, "defaultDeserializerProvider");
    }

    @Override // p001o.yff
    /* renamed from: b */
    public void mo57654b(ob9 ob9Var, xk7 xk7Var) {
        sq8.m48649h(ob9Var, "baseClass");
        sq8.m48649h(xk7Var, "defaultSerializerProvider");
    }

    @Override // p001o.yff
    /* renamed from: c */
    public void mo57655c(ob9 ob9Var, ob9 ob9Var2, dc9 dc9Var) {
        sq8.m48649h(ob9Var, "baseClass");
        sq8.m48649h(ob9Var2, "actualClass");
        sq8.m48649h(dc9Var, "actualSerializer");
        uef descriptor = dc9Var.getDescriptor();
        m57657e(descriptor, ob9Var2);
        if (this.f55321a) {
            return;
        }
        m57656d(descriptor, ob9Var2);
    }

    /* renamed from: d */
    public final void m57656d(uef uefVar, ob9 ob9Var) {
        int iMo16762d = uefVar.mo16762d();
        for (int i = 0; i < iMo16762d; i++) {
            String strMo16763e = uefVar.mo16763e(i);
            if (sq8.m48644c(strMo16763e, this.f55322b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + ob9Var + " has property '" + strMo16763e + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    /* renamed from: e */
    public final void m57657e(uef uefVar, ob9 ob9Var) {
        bff kind = uefVar.getKind();
        if ((kind instanceof udd) || sq8.m48644c(kind, bff.C12372a.f16098a)) {
            throw new IllegalArgumentException("Serializer for " + ob9Var.mo26337d() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f55321a) {
            return;
        }
        if (sq8.m48644c(kind, p9g.C16038b.f39682a) || sq8.m48644c(kind, p9g.C16039c.f39683a) || (kind instanceof vhd) || (kind instanceof bff.C12373b)) {
            throw new IllegalArgumentException("Serializer for " + ob9Var.mo26337d() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
    }
}
