package p001o;

import com.apollographql.apollo.api.ResponseField;
import p001o.p9g;

/* loaded from: classes6.dex */
public abstract class yef {

    /* renamed from: o.yef$a */
    public static final class C18391a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C18391a f55381a = new C18391a();

        public C18391a() {
            super(1);
        }

        /* renamed from: a */
        public final void m57707a(ga3 ga3Var) {
            sq8.m48649h(ga3Var, "$this$null");
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m57707a((ga3) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public static final uef m57704a(String str, vhd vhdVar) {
        sq8.m48649h(str, "serialName");
        sq8.m48649h(vhdVar, ResponseField.VARIABLE_IDENTIFIER_KEY);
        if (!f9g.d0(str)) {
            return eid.m25119a(str, vhdVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    /* renamed from: b */
    public static final uef m57705b(String str, bff bffVar, uef[] uefVarArr, xk7 xk7Var) {
        sq8.m48649h(str, "serialName");
        sq8.m48649h(bffVar, ResponseField.VARIABLE_IDENTIFIER_KEY);
        sq8.m48649h(uefVarArr, "typeParameters");
        sq8.m48649h(xk7Var, "builder");
        if (!(!f9g.d0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!sq8.m48644c(bffVar, p9g.C16037a.f39681a))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        ga3 ga3Var = new ga3(str);
        xk7Var.invoke(ga3Var);
        return new wef(str, bffVar, ga3Var.m28282f().size(), gp0.D0(uefVarArr), ga3Var);
    }

    /* renamed from: c */
    public static /* synthetic */ uef m57706c(String str, bff bffVar, uef[] uefVarArr, xk7 xk7Var, int i, Object obj) {
        if ((i & 8) != 0) {
            xk7Var = C18391a.f55381a;
        }
        return m57705b(str, bffVar, uefVarArr, xk7Var);
    }
}
