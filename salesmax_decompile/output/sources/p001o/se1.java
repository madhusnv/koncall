package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.todo.BaseTasksFragment;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final /* synthetic */ class se1 implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ BaseTasksFragment f45308a;

    public /* synthetic */ se1(BaseTasksFragment baseTasksFragment) {
        this.f45308a = baseTasksFragment;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return BaseTasksFragment.b2(this.f45308a, (PaginatedDataModel) obj, (Integer) obj2);
    }
}
