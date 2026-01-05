package p001o;

/* loaded from: classes6.dex */
public abstract class dq3 {

    /* renamed from: a */
    public static final lgg f20402a = new lgg("CLOSED");

    /* renamed from: b */
    public static final eq3 m23677b(eq3 eq3Var) {
        while (true) {
            Object objM25426g = eq3Var.m25426g();
            if (objM25426g == f20402a) {
                return eq3Var;
            }
            eq3 eq3Var2 = (eq3) objM25426g;
            if (eq3Var2 != null) {
                eq3Var = eq3Var2;
            } else if (eq3Var.m25430m()) {
                return eq3Var;
            }
        }
    }

    /* renamed from: c */
    public static final Object m23678c(ibf ibfVar, long j, nl7 nl7Var) {
        while (true) {
            if (ibfVar.f28439c >= j && !ibfVar.mo25428k()) {
                return kbf.m35360a(ibfVar);
            }
            Object objM25426g = ibfVar.m25426g();
            if (objM25426g == f20402a) {
                return kbf.m35360a(f20402a);
            }
            ibf ibfVar2 = (ibf) ((eq3) objM25426g);
            if (ibfVar2 == null) {
                ibfVar2 = (ibf) nl7Var.invoke(Long.valueOf(ibfVar.f28439c + 1), ibfVar);
                if (ibfVar.m25432o(ibfVar2)) {
                    if (ibfVar.mo25428k()) {
                        ibfVar.m25431n();
                    }
                }
            }
            ibfVar = ibfVar2;
        }
    }
}
