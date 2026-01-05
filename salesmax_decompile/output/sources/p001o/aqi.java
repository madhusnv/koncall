package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.user.UsersFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final /* synthetic */ class aqi implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ UsersFragment f15149a;

    public /* synthetic */ aqi(UsersFragment usersFragment) {
        this.f15149a = usersFragment;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return UsersFragment.E1(this.f15149a, (PaginatedDataModel) obj, (RecyclerView.AbstractC2371h) obj2);
    }
}
