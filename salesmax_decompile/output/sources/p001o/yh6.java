package p001o;

import ai.salesmax.model.EntityListSummary;
import ai.salesmax.model.PaginatedTokenResults;
import com.amplifyframework.datastore.generated.model.EntityList;
import java.util.function.Function;
import type.ListCreationType;

/* loaded from: classes.dex */
public abstract class yh6 {
    /* renamed from: c */
    public static s47 m57812c() {
        return uni.LB().d0(new gd()).d0(new hd()).C0(la1.BUFFER);
    }

    /* renamed from: d */
    public static s47 m57813d(final String str, final int i) {
        return m57812c().m47684F(new rl7() { // from class: o.uh6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return yh6.m57814e(str, i, (l1) obj);
            }
        }).m47686M(new rl7() { // from class: o.vh6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return yh6.m57815f((PaginatedTokenResults) obj);
            }
        });
    }

    /* renamed from: e */
    public static /* synthetic */ g3e m57814e(String str, int i, l1 l1Var) {
        return l1Var.m45493Z(str, ListCreationType.BULK_UPLOAD.name(), null, i);
    }

    /* renamed from: f */
    public static /* synthetic */ PaginatedTokenResults m57815f(PaginatedTokenResults paginatedTokenResults) {
        return paginatedTokenResults.map(new Function() { // from class: o.wh6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new EntityListSummary((EntityList) obj);
            }
        }).map(new Function() { // from class: o.xh6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((EntityListSummary) obj).toEntityListInfo();
            }
        });
    }
}
