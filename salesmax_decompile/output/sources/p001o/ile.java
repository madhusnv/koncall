package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.user.ReporteeFragment;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final /* synthetic */ class ile implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ ReporteeFragment f28825a;

    public /* synthetic */ ile(ReporteeFragment reporteeFragment) {
        this.f28825a = reporteeFragment;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ReporteeFragment.N1(this.f28825a, (PaginatedDataModel) obj, (Integer) obj2);
    }
}
