package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.o4d;

/* loaded from: classes2.dex */
public abstract class lp3 {
    /* renamed from: a */
    public static final o4d m37576a(k2e[] k2eVarArr, o4d o4dVar, un3 un3Var, int i) {
        sq8.m48649h(k2eVarArr, "values");
        sq8.m48649h(o4dVar, "parentScope");
        un3Var.mo27207i(-300354947);
        if (go3.m29189I()) {
            go3.m29200T(-300354947, i, -1, "androidx.compose.runtime.compositionLocalMapOf (CompositionLocalMap.kt:91)");
        }
        o4d.InterfaceC15711a interfaceC15711aMo40065o = p4d.m42969a().mo40065o();
        for (k2e k2eVar : k2eVarArr) {
            un3Var.mo27207i(680845765);
            if (k2eVar.m34933a() || !m37577b(o4dVar, k2eVar.m34934b())) {
                ip3 ip3VarM34934b = k2eVar.m34934b();
                sq8.m48647f(ip3VarM34934b, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                interfaceC15711aMo40065o.put(ip3VarM34934b, k2eVar.m34934b().mo32530b(k2eVar.m34935c(), un3Var, 8));
            }
            un3Var.mo27214p();
        }
        o4d o4dVarBuild = interfaceC15711aMo40065o.build();
        if (go3.m29189I()) {
            go3.m29199S();
        }
        un3Var.mo27214p();
        return o4dVarBuild;
    }

    /* renamed from: b */
    public static final boolean m37577b(o4d o4dVar, ip3 ip3Var) {
        sq8.m48649h(o4dVar, "<this>");
        sq8.m48649h(ip3Var, TransferTable.COLUMN_KEY);
        return o4dVar.containsKey(ip3Var);
    }

    /* renamed from: c */
    public static final Object m37578c(o4d o4dVar, ip3 ip3Var) {
        sq8.m48649h(o4dVar, "<this>");
        sq8.m48649h(ip3Var, TransferTable.COLUMN_KEY);
        p4g p4gVar = (p4g) o4dVar.get(ip3Var);
        if (p4gVar != null) {
            return p4gVar.getValue();
        }
        return null;
    }

    /* renamed from: d */
    public static final Object m37579d(o4d o4dVar, ip3 ip3Var) {
        sq8.m48649h(o4dVar, "<this>");
        sq8.m48649h(ip3Var, TransferTable.COLUMN_KEY);
        return m37577b(o4dVar, ip3Var) ? m37578c(o4dVar, ip3Var) : ip3Var.m32529a().getValue();
    }
}
