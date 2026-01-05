package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.activity.BaseActivitiesFragment;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class hb1 implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ BaseActivitiesFragment f26577a;

    public /* synthetic */ hb1(BaseActivitiesFragment baseActivitiesFragment) {
        this.f26577a = baseActivitiesFragment;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return BaseActivitiesFragment.j2(this.f26577a, (PaginatedDataModel) obj, (Integer) obj2);
    }
}
