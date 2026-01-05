package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.leads.BaseLeadsFragment;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class gd1 implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ BaseLeadsFragment f24990a;

    public /* synthetic */ gd1(BaseLeadsFragment baseLeadsFragment) {
        this.f24990a = baseLeadsFragment;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return BaseLeadsFragment.C2(this.f24990a, (PaginatedDataModel) obj, (Integer) obj2);
    }
}
