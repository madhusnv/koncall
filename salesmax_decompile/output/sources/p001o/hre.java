package p001o;

import com.amplifyframework.core.model.ModelIdentifier;
import p001o.m18;

/* loaded from: classes3.dex */
public abstract class hre {
    /* renamed from: a */
    public static final String m31019a(String str) {
        String strP0;
        if (str == null || (strP0 = f9g.P0(str, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, null, 2, null)) == null) {
            return null;
        }
        return f9g.V0(strP0, ":", null, 2, null);
    }

    /* renamed from: b */
    public static final g48 m31020b(g48 g48Var, byte[] bArr) {
        m18 m18VarM38178a;
        sq8.m48649h(g48Var, "<this>");
        if (bArr == null || (m18VarM38178a = m18.Companion.m38178a(bArr)) == null) {
            m18VarM38178a = m18.C15196d.f34631a;
        }
        return j48.m33187b(g48Var.getStatus(), g48Var.getHeaders(), m18VarM38178a);
    }
}
