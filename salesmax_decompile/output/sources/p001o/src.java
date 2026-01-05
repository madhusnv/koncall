package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import java.io.Serializable;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class src implements pl7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ PaginatedTokenResults f45843a;

    /* renamed from: b */
    public final /* synthetic */ Function f45844b;

    public /* synthetic */ src(PaginatedTokenResults paginatedTokenResults, Function function) {
        this.f45843a = paginatedTokenResults;
        this.f45844b = function;
    }

    @Override // p001o.pl7
    /* renamed from: w */
    public final Object mo17639w(Object obj, Object obj2, Object obj3) {
        return this.f45843a.lambda$batchMap$fbde34e1$1(this.f45844b, obj, (String) obj2, (Integer) obj3);
    }
}
