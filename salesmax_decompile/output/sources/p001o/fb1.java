package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.activity.BaseActivitiesFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class fb1 implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ BaseActivitiesFragment f23065a;

    public /* synthetic */ fb1(BaseActivitiesFragment baseActivitiesFragment) {
        this.f23065a = baseActivitiesFragment;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return BaseActivitiesFragment.a2(this.f23065a, (PaginatedDataModel) obj, (RecyclerView.AbstractC2371h) obj2);
    }
}
