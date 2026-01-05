package p001o;

import p001o.jo3;

/* loaded from: classes6.dex */
public abstract class e9 implements dc9 {
    /* renamed from: b */
    public final Object m24526b(jo3 jo3Var) {
        return jo3.C14621a.m34148c(jo3Var, getDescriptor(), 1, xdd.m56096a(this, jo3Var, jo3Var.mo17247p(getDescriptor(), 0)), null, 8, null);
    }

    /* renamed from: c */
    public bn5 mo24527c(jo3 jo3Var, String str) {
        sq8.m48649h(jo3Var, "decoder");
        return jo3Var.mo20419a().mo21129d(mo24529e(), str);
    }

    /* renamed from: d */
    public iff mo24528d(h76 h76Var, Object obj) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(obj, "value");
        return h76Var.mo25648a().mo21130e(mo24529e(), obj);
    }

    @Override // p001o.bn5
    public final Object deserialize(w75 w75Var) {
        Object objM34148c;
        sq8.m48649h(w75Var, "decoder");
        uef descriptor = getDescriptor();
        jo3 jo3VarMo20420b = w75Var.mo20420b(descriptor);
        gge ggeVar = new gge();
        if (jo3VarMo20420b.mo17245n()) {
            objM34148c = m24526b(jo3VarMo20420b);
        } else {
            objM34148c = null;
            while (true) {
                int iMo16814k = jo3VarMo20420b.mo16814k(getDescriptor());
                if (iMo16814k != -1) {
                    if (iMo16814k == 0) {
                        ggeVar.f25106a = jo3VarMo20420b.mo17247p(getDescriptor(), iMo16814k);
                    } else {
                        if (iMo16814k != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) ggeVar.f25106a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(iMo16814k);
                            throw new gff(sb.toString());
                        }
                        Object obj = ggeVar.f25106a;
                        if (obj == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                        ggeVar.f25106a = obj;
                        objM34148c = jo3.C14621a.m34148c(jo3VarMo20420b, getDescriptor(), iMo16814k, xdd.m56096a(this, jo3VarMo20420b, (String) obj), null, 8, null);
                    }
                } else {
                    if (objM34148c == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ggeVar.f25106a)).toString());
                    }
                    sq8.m48647f(objM34148c, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                }
            }
        }
        jo3VarMo20420b.mo18548c(descriptor);
        return objM34148c;
    }

    /* renamed from: e */
    public abstract ob9 mo24529e();

    @Override // p001o.iff
    public final void serialize(h76 h76Var, Object obj) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(obj, "value");
        iff iffVarM56097b = xdd.m56097b(this, h76Var, obj);
        uef descriptor = getDescriptor();
        lo3 lo3VarMo29876b = h76Var.mo29876b(descriptor);
        lo3VarMo29876b.mo37568p(getDescriptor(), 0, iffVarM56097b.getDescriptor().mo16766h());
        uef descriptor2 = getDescriptor();
        sq8.m48647f(iffVarM56097b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        lo3VarMo29876b.mo37566l(descriptor2, 1, iffVarM56097b, obj);
        lo3VarMo29876b.mo37560c(descriptor);
    }
}
