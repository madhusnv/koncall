package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.activity.BaseActivitiesFragment;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class ib1 implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ BaseActivitiesFragment f28370a;

    /* renamed from: b */
    public final /* synthetic */ long f28371b;

    public /* synthetic */ ib1(BaseActivitiesFragment baseActivitiesFragment, long j) {
        this.f28370a = baseActivitiesFragment;
        this.f28371b = j;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return BaseActivitiesFragment.n2(this.f28370a, this.f28371b, (PaginatedDataModel) obj, (Integer) obj2);
    }
}
