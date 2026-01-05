package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.leads.BaseLeadsFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class hd1 implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ BaseLeadsFragment f26669a;

    public /* synthetic */ hd1(BaseLeadsFragment baseLeadsFragment) {
        this.f26669a = baseLeadsFragment;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return BaseLeadsFragment.u2(this.f26669a, (PaginatedDataModel) obj, (RecyclerView.AbstractC2371h) obj2);
    }
}
