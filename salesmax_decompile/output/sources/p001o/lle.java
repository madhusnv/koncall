package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.user.ReporteeFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final /* synthetic */ class lle implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ ReporteeFragment f34018a;

    public /* synthetic */ lle(ReporteeFragment reporteeFragment) {
        this.f34018a = reporteeFragment;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ReporteeFragment.F1(this.f34018a, (PaginatedDataModel) obj, (RecyclerView.AbstractC2371h) obj2);
    }
}
