package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.todo.BaseTasksFragment;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final /* synthetic */ class xe1 implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ BaseTasksFragment f53575a;

    /* renamed from: b */
    public final /* synthetic */ long f53576b;

    public /* synthetic */ xe1(BaseTasksFragment baseTasksFragment, long j) {
        this.f53575a = baseTasksFragment;
        this.f53576b = j;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return BaseTasksFragment.e2(this.f53575a, this.f53576b, (PaginatedDataModel) obj, (Integer) obj2);
    }
}
