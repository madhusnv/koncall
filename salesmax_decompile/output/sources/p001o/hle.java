package p001o;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.ui.user.ReporteeFragment;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final /* synthetic */ class hle implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ ReporteeFragment f27112a;

    public /* synthetic */ hle(ReporteeFragment reporteeFragment) {
        this.f27112a = reporteeFragment;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ReporteeFragment.Q1(this.f27112a, (PaginatedDataModel) obj, (Integer) obj2);
    }
}
