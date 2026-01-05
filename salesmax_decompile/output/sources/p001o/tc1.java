package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.leads.BaseLeadsFragment;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class tc1 implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ BaseLeadsFragment f46796a;

    /* renamed from: b */
    public final /* synthetic */ long f46797b;

    public /* synthetic */ tc1(BaseLeadsFragment baseLeadsFragment, long j) {
        this.f46796a = baseLeadsFragment;
        this.f46797b = j;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return BaseLeadsFragment.H2(this.f46796a, this.f46797b, (PaginatedDataModel) obj, (Integer) obj2);
    }
}
