package p001o;

import ai.salesmax.model.BusinessInfo;
import ai.salesmax.model.BusinessSummary;
import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.event.ResultsChangeListener;
import ai.salesmax.model.event.ResultsChangedEvent;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.Optional;
import java.util.function.Function;

/* loaded from: classes.dex */
public class t11 extends ArrayAdapter implements Filterable {

    /* renamed from: a */
    public PaginatedDataModel f46197a;

    /* renamed from: o.t11$a */
    public class RunnableC16957a implements Runnable {
        public RunnableC16957a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t11.this.notifyDataSetChanged();
        }
    }

    /* renamed from: o.t11$b */
    public class C16958b extends Filter {
        public C16958b() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            PaginatedDataModel paginatedDataModelM49127m = t11.this.m49127m(charSequence != null ? charSequence.toString() : "");
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = paginatedDataModelM49127m.size();
            filterResults.values = paginatedDataModelM49127m;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                t11.this.m49126l((PaginatedDataModel) obj);
            }
        }
    }

    public t11(Context context, int i, PaginatedDataModel paginatedDataModel) {
        super(context, i);
        m49126l(paginatedDataModel);
    }

    /* renamed from: h */
    public static /* synthetic */ uw8 m49121h(View view) {
        return (uw8) view.getTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m49122i(ResultsChangedEvent resultsChangedEvent) {
        j0f.m33008i(new RunnableC16957a());
    }

    /* renamed from: j */
    public static /* synthetic */ PaginatedTokenResults m49123j(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.s11
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((BusinessSummary) obj).toBusinessInfo();
            }
        });
        map.loadInitial();
        return map;
    }

    /* renamed from: k */
    public static /* synthetic */ PaginatedDataModel m49124k(PaginatedTokenResults paginatedTokenResults) {
        return new PaginatedDataModel("", paginatedTokenResults);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public BusinessInfo getItem(int i) {
        return (BusinessInfo) this.f46197a.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f46197a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new C16958b();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        uw8 uw8Var = (uw8) Optional.ofNullable(view).map(new Function() { // from class: o.p11
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return t11.m49121h((View) obj);
            }
        }).orElse(uw8.h0(LayoutInflater.from(getContext()), null, true));
        View viewM25689B = uw8Var.m25689B();
        viewM25689B.setTag(uw8Var);
        uw8Var.k0(Integer.valueOf(i));
        uw8Var.j0((BusinessInfo) this.f46197a.get(i));
        return viewM25689B;
    }

    /* renamed from: l */
    public final void m49126l(PaginatedDataModel paginatedDataModel) {
        PaginatedDataModel paginatedDataModel2 = this.f46197a;
        if (paginatedDataModel2 != null) {
            paginatedDataModel2.reset();
        }
        this.f46197a = paginatedDataModel;
        paginatedDataModel.addResultsChangedListener(new ResultsChangeListener() { // from class: o.o11
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public final void onResultsChanged(ResultsChangedEvent resultsChangedEvent) {
                this.f37520a.m49122i(resultsChangedEvent);
            }
        });
    }

    /* renamed from: m */
    public final PaginatedDataModel m49127m(String str) {
        return (PaginatedDataModel) xo1.m56520c(str.toString(), 10).m47686M(new rl7() { // from class: o.q11
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return t11.m49123j((PaginatedTokenResults) obj);
            }
        }).m47686M(new rl7() { // from class: o.r11
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return t11.m49124k((PaginatedTokenResults) obj);
            }
        }).m47698c();
    }
}
