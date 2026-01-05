package p001o;

import ai.salesmax.model.BusinessSummary;
import ai.salesmax.model.PaginatedTokenResults;
import com.amplifyframework.datastore.generated.model.Business;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract class xo1 {
    /* renamed from: b */
    public static /* synthetic */ PaginatedTokenResults m56519b(PaginatedTokenResults paginatedTokenResults) {
        return paginatedTokenResults.map(new Function() { // from class: o.wo1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new BusinessSummary((Business) obj);
            }
        });
    }

    /* renamed from: c */
    public static s47 m56520c(String str, int i) {
        return uni.kC().TB().h6(str, null, i).m47686M(new rl7() { // from class: o.vo1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return xo1.m56519b((PaginatedTokenResults) obj);
            }
        });
    }
}
