package p001o;

/* loaded from: classes2.dex */
public abstract class qlb {
    /* renamed from: a */
    public static final plb m45634a(q74 q74Var) {
        sq8.m48649h(q74Var, "<this>");
        plb plbVar = (plb) q74Var.get(plb.f40230u);
        if (plbVar != null) {
            return plbVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }
}
