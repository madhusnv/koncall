package p001o;

import java.util.Map;
import p001o.nra;

/* loaded from: classes6.dex */
public class sra implements qra {
    /* renamed from: i */
    public static int m48773i(int i, Object obj, Object obj2) {
        ora oraVar = (ora) obj;
        nra nraVar = (nra) obj2;
        int iM41007a = 0;
        if (oraVar.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : oraVar.entrySet()) {
            iM41007a += nraVar.m41007a(i, entry.getKey(), entry.getValue());
        }
        return iM41007a;
    }

    /* renamed from: j */
    public static ora m48774j(Object obj, Object obj2) {
        ora oraVarM42595A = (ora) obj;
        ora oraVar = (ora) obj2;
        if (!oraVar.isEmpty()) {
            if (!oraVarM42595A.m42597t()) {
                oraVarM42595A = oraVarM42595A.m42595A();
            }
            oraVarM42595A.m42599y(oraVar);
        }
        return oraVarM42595A;
    }

    @Override // p001o.qra
    /* renamed from: a */
    public Object mo45806a(Object obj, Object obj2) {
        return m48774j(obj, obj2);
    }

    @Override // p001o.qra
    /* renamed from: b */
    public nra.C15645a mo45807b(Object obj) {
        return ((nra) obj).m41008c();
    }

    @Override // p001o.qra
    /* renamed from: c */
    public Map mo45808c(Object obj) {
        return (ora) obj;
    }

    @Override // p001o.qra
    /* renamed from: d */
    public Object mo45809d(Object obj) {
        return ora.m42592g().m42595A();
    }

    @Override // p001o.qra
    /* renamed from: e */
    public Map mo45810e(Object obj) {
        return (ora) obj;
    }

    @Override // p001o.qra
    /* renamed from: f */
    public Object mo45811f(Object obj) {
        ((ora) obj).m42598u();
        return obj;
    }

    @Override // p001o.qra
    /* renamed from: g */
    public int mo45812g(int i, Object obj, Object obj2) {
        return m48773i(i, obj, obj2);
    }

    @Override // p001o.qra
    /* renamed from: h */
    public boolean mo45813h(Object obj) {
        return !((ora) obj).m42597t();
    }
}
