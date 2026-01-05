package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.user.UsersFragment;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final /* synthetic */ class ypi implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ UsersFragment f55801a;

    public /* synthetic */ ypi(UsersFragment usersFragment) {
        this.f55801a = usersFragment;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return UsersFragment.P1(this.f55801a, (PaginatedDataModel) obj, (Integer) obj2);
    }
}
