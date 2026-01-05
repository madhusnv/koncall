package p001o;

import p001o.q74;

/* loaded from: classes6.dex */
public abstract class zze {
    /* renamed from: b */
    public static final void m60155b(final wze wzeVar, q74 q74Var) {
        if (((Number) q74Var.fold(0, new nl7() { // from class: o.yze
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(zze.m60156c(wzeVar, ((Integer) obj).intValue(), (q74.InterfaceC16311b) obj2));
            }
        })).intValue() == wzeVar.f52944c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + wzeVar.f52943b + ",\n\t\tbut emission happened in " + q74Var + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* renamed from: c */
    public static final int m60156c(wze wzeVar, int i, q74.InterfaceC16311b interfaceC16311b) {
        q74.InterfaceC16312c key = interfaceC16311b.getKey();
        q74.InterfaceC16311b interfaceC16311b2 = wzeVar.f52943b.get(key);
        if (key != p69.f39399t) {
            if (interfaceC16311b != interfaceC16311b2) {
                return Integer.MIN_VALUE;
            }
            return i + 1;
        }
        p69 p69Var = (p69) interfaceC16311b2;
        sq8.m48647f(interfaceC16311b, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        p69 p69VarM60157d = m60157d((p69) interfaceC16311b, p69Var);
        if (p69VarM60157d == p69Var) {
            return p69Var == null ? i : i + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + p69VarM60157d + ", expected child of " + p69Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    /* renamed from: d */
    public static final p69 m60157d(p69 p69Var, p69 p69Var2) {
        while (p69Var != null) {
            if (p69Var == p69Var2) {
                return p69Var;
            }
            if (!(p69Var instanceof f6f)) {
                return p69Var;
            }
            p69Var = ((f6f) p69Var).g0();
        }
        return null;
    }
}
