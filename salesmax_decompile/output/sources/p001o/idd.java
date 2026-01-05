package p001o;

import p001o.ese;

/* loaded from: classes3.dex */
public final class idd implements tse {

    /* renamed from: a */
    public final tse f28496a;

    /* renamed from: b */
    public final q74 f28497b;

    public idd(tse tseVar, q74 q74Var) {
        sq8.m48649h(tseVar, "policy");
        sq8.m48649h(q74Var, "coroutineContext");
        this.f28496a = tseVar;
        this.f28497b = q74Var;
    }

    /* renamed from: b */
    public static final String m31940b() {
        return "request failed with non-retryable error";
    }

    @Override // p001o.tse
    public ese evaluate(Object obj) {
        ese eseVarEvaluate = this.f28496a.evaluate(obj);
        if (eseVarEvaluate instanceof ese.C13255b) {
            q74 q74Var = this.f28497b;
            uk7 uk7Var = new uk7() { // from class: o.hdd
                @Override // p001o.uk7
                public final Object invoke() {
                    return idd.m31940b();
                }
            };
            fja fjaVar = fja.Debug;
            String strMo26336c = kge.m35689b(ose.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
            }
            v74.m52399d(q74Var, fjaVar, strMo26336c, null, uk7Var);
        }
        return eseVarEvaluate;
    }
}
