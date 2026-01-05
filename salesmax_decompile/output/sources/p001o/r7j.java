package p001o;

import ai.salesmax.model.PaginatedTokenResults;

/* loaded from: classes.dex */
public abstract class r7j {
    /* renamed from: g */
    public static x6c m46319g() {
        return uni.LB().d0(new gd()).d0(new hd());
    }

    /* renamed from: h */
    public static /* synthetic */ PaginatedTokenResults m46320h(PaginatedTokenResults paginatedTokenResults) {
        return paginatedTokenResults.map(new q7j());
    }

    /* renamed from: i */
    public static /* synthetic */ x8c m46321i(int i, l1 l1Var) {
        return l1Var.Rx(i).m47686M(new rl7() { // from class: o.n7j
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return r7j.m46320h((PaginatedTokenResults) obj);
            }
        }).h0();
    }

    /* renamed from: j */
    public static /* synthetic */ PaginatedTokenResults m46322j(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new o7j());
        map.loadInitial();
        return map;
    }

    /* renamed from: k */
    public static /* synthetic */ PaginatedTokenResults m46323k(PaginatedTokenResults paginatedTokenResults) {
        return paginatedTokenResults.map(new q7j());
    }

    /* renamed from: l */
    public static /* synthetic */ x8c m46324l(String str, int i, String str2, l1 l1Var) {
        return l1Var.j4(str, i, str2).m47686M(new rl7() { // from class: o.p7j
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return r7j.m46323k((PaginatedTokenResults) obj);
            }
        }).h0();
    }

    /* renamed from: m */
    public static /* synthetic */ PaginatedTokenResults m46325m(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new o7j());
        map.loadInitial();
        return map;
    }

    /* renamed from: n */
    public static x6c m46326n(final int i) {
        return m46319g().m55717M(new rl7() { // from class: o.l7j
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return r7j.m46321i(i, (l1) obj);
            }
        }).d0(new rl7() { // from class: o.m7j
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return r7j.m46322j((PaginatedTokenResults) obj);
            }
        });
    }

    /* renamed from: o */
    public static x6c m46327o(final String str, final int i, final String str2) {
        return m46319g().m55717M(new rl7() { // from class: o.j7j
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return r7j.m46324l(str, i, str2, (l1) obj);
            }
        }).d0(new rl7() { // from class: o.k7j
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return r7j.m46325m((PaginatedTokenResults) obj);
            }
        });
    }
}
