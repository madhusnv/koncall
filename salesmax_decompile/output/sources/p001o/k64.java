package p001o;

import p001o.y54;

/* loaded from: classes6.dex */
public abstract class k64 {

    /* renamed from: a */
    public static final y54.C18321c f31524a = y54.m57218h("opencensus-trace-span-key");

    /* renamed from: a */
    public static pzf m35028a(y54 y54Var) {
        pzf pzfVar = (pzf) f31524a.m57225a((y54) kri.m36136b(y54Var, "context"));
        return pzfVar == null ? si1.f45452e : pzfVar;
    }

    /* renamed from: b */
    public static y54 m35029b(y54 y54Var, pzf pzfVar) {
        return ((y54) kri.m36136b(y54Var, "context")).m57224s(f31524a, pzfVar);
    }
}
