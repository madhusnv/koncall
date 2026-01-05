package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class mrc implements pl7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ List f35873a;

    public /* synthetic */ mrc(List list) {
        this.f35873a = list;
    }

    @Override // p001o.pl7
    /* renamed from: w */
    public final Object mo17639w(Object obj, Object obj2, Object obj3) {
        return PaginatedTokenResults.lambda$fromList$7fbea7f5$1(this.f35873a, (Integer) obj, (String) obj2, (Integer) obj3);
    }
}
