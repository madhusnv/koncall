package p001o;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class had {

    /* renamed from: a */
    public static final uef[] f26562a = new uef[0];

    /* renamed from: a */
    public static final Set m30142a(uef uefVar) {
        sq8.m48649h(uefVar, "<this>");
        if (uefVar instanceof js1) {
            return ((js1) uefVar).mo34452a();
        }
        HashSet hashSet = new HashSet(uefVar.mo16762d());
        int iMo16762d = uefVar.mo16762d();
        for (int i = 0; i < iMo16762d; i++) {
            hashSet.add(uefVar.mo16763e(i));
        }
        return hashSet;
    }

    /* renamed from: b */
    public static final uef[] m30143b(List list) {
        uef[] uefVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (uefVarArr = (uef[]) list.toArray(new uef[0])) == null) ? f26562a : uefVarArr;
    }

    /* renamed from: c */
    public static final String m30144c(String str) {
        sq8.m48649h(str, "className");
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    /* renamed from: d */
    public static final String m30145d(ob9 ob9Var) {
        sq8.m48649h(ob9Var, "<this>");
        String strMo26337d = ob9Var.mo26337d();
        if (strMo26337d == null) {
            strMo26337d = "<local class name not available>";
        }
        return m30144c(strMo26337d);
    }

    /* renamed from: e */
    public static final Void m30146e(ob9 ob9Var) {
        sq8.m48649h(ob9Var, "<this>");
        throw new gff(m30145d(ob9Var));
    }
}
