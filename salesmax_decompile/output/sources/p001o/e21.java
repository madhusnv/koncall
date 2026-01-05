package p001o;

import ai.salesmax.model.Leads;
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
public class e21 extends ArrayAdapter implements Filterable {

    /* renamed from: a */
    public PaginatedDataModel f20804a;

    /* renamed from: o.e21$a */
    public class RunnableC13086a implements Runnable {
        public RunnableC13086a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e21.this.notifyDataSetChanged();
        }
    }

    /* renamed from: o.e21$b */
    public class C13087b extends Filter {
        public C13087b() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            PaginatedDataModel paginatedDataModelM24146k = e21.this.m24146k(charSequence != null ? charSequence.toString() : "");
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = paginatedDataModelM24146k.size();
            filterResults.values = paginatedDataModelM24146k;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                e21.this.m24145j((PaginatedDataModel) obj);
            }
        }
    }

    public e21(Context context, int i) {
        super(context, i);
        m24145j(m24146k(""));
    }

    /* renamed from: g */
    public static /* synthetic */ h09 m24141g(View view) {
        return (h09) view.getTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m24142h(ResultsChangedEvent resultsChangedEvent) {
        j0f.m33008i(new RunnableC13086a());
    }

    /* renamed from: i */
    public static /* synthetic */ PaginatedDataModel m24143i(PaginatedTokenResults paginatedTokenResults) {
        return new PaginatedDataModel("", paginatedTokenResults);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Leads getItem(int i) {
        return (Leads) this.f20804a.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f20804a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new C13087b();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        h09 h09Var = (h09) Optional.ofNullable(view).map(new Function() { // from class: o.b21
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return e21.m24141g((View) obj);
            }
        }).orElse(h09.h0(LayoutInflater.from(getContext()), null, true));
        View viewM25689B = h09Var.m25689B();
        viewM25689B.setTag(h09Var);
        h09Var.k0(Integer.valueOf(i));
        h09Var.j0((Leads) this.f20804a.get(i));
        return viewM25689B;
    }

    /* renamed from: j */
    public final void m24145j(PaginatedDataModel paginatedDataModel) {
        PaginatedDataModel paginatedDataModel2 = this.f20804a;
        if (paginatedDataModel2 != null) {
            paginatedDataModel2.reset();
        }
        this.f20804a = paginatedDataModel;
        paginatedDataModel.addResultsChangedListener(new ResultsChangeListener() { // from class: o.c21
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public final void onResultsChanged(ResultsChangedEvent resultsChangedEvent) {
                this.f17151a.m24142h(resultsChangedEvent);
            }
        });
    }

    /* renamed from: k */
    public final PaginatedDataModel m24146k(String str) {
        return (PaginatedDataModel) iu9.n0(str.toString(), 10).m47686M(new rl7() { // from class: o.d21
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return e21.m24143i((PaginatedTokenResults) obj);
            }
        }).m47698c();
    }

    public e21(Context context, int i, PaginatedDataModel paginatedDataModel) {
        super(context, i);
        m24145j(paginatedDataModel);
    }
}
