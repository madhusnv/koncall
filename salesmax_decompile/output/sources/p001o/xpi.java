package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.user.UsersFragment;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final /* synthetic */ class xpi implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ UsersFragment f54048a;

    public /* synthetic */ xpi(UsersFragment usersFragment) {
        this.f54048a = usersFragment;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return UsersFragment.M1(this.f54048a, (PaginatedDataModel) obj, (Integer) obj2);
    }
}
