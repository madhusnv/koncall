package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.todo.BaseTasksFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final /* synthetic */ class te1 implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ BaseTasksFragment f46919a;

    public /* synthetic */ te1(BaseTasksFragment baseTasksFragment) {
        this.f46919a = baseTasksFragment;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return BaseTasksFragment.T1(this.f46919a, (PaginatedDataModel) obj, (RecyclerView.AbstractC2371h) obj2);
    }
}
