package p001o;

import ai.salesmax.model.EntityListInfo;
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
public class a21 extends ArrayAdapter implements Filterable {

    /* renamed from: a */
    public PaginatedDataModel f14049a;

    /* renamed from: o.a21$a */
    public class RunnableC12075a implements Runnable {
        public RunnableC12075a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a21.this.notifyDataSetChanged();
        }
    }

    /* renamed from: o.a21$b */
    public class C12076b extends Filter {
        public C12076b() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            PaginatedDataModel paginatedDataModelM16354o = a21.this.m16354o(charSequence != null ? charSequence.toString() : "");
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = paginatedDataModelM16354o.size();
            filterResults.values = paginatedDataModelM16354o;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                a21.this.m16353n((PaginatedDataModel) obj);
                a21.this.notifyDataSetChanged();
            }
        }
    }

    public a21(Context context, int i) {
        super(context, i);
        m16353n(m16354o(""));
    }

    /* renamed from: i */
    public static /* synthetic */ ty8 m16347i(View view) {
        return (ty8) view.getTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m16348j(ResultsChangedEvent resultsChangedEvent) {
        j0f.m33008i(new RunnableC12075a());
    }

    /* renamed from: k */
    public static /* synthetic */ EntityListInfo m16349k(EntityListInfo entityListInfo) {
        return entityListInfo;
    }

    /* renamed from: l */
    public static /* synthetic */ PaginatedTokenResults m16350l(PaginatedTokenResults paginatedTokenResults) {
        PaginatedTokenResults map = paginatedTokenResults.map(new Function() { // from class: o.z11
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return a21.m16349k((EntityListInfo) obj);
            }
        });
        map.loadInitial();
        return map;
    }

    /* renamed from: m */
    public static /* synthetic */ PaginatedDataModel m16351m(PaginatedTokenResults paginatedTokenResults) {
        return new PaginatedDataModel("", paginatedTokenResults);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f14049a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new C12076b();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ty8 ty8Var = (ty8) Optional.ofNullable(view).map(new Function() { // from class: o.w11
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return a21.m16347i((View) obj);
            }
        }).orElse(ty8.h0(LayoutInflater.from(getContext()), null, true));
        View viewM25689B = ty8Var.m25689B();
        viewM25689B.setTag(ty8Var);
        ty8Var.k0(Integer.valueOf(i));
        ty8Var.j0((EntityListInfo) this.f14049a.get(i));
        return viewM25689B;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public EntityListInfo getItem(int i) {
        return (EntityListInfo) this.f14049a.get(i);
    }

    /* renamed from: n */
    public final void m16353n(PaginatedDataModel paginatedDataModel) {
        PaginatedDataModel paginatedDataModel2 = this.f14049a;
        if (paginatedDataModel2 != null) {
            paginatedDataModel2.reset();
        }
        this.f14049a = paginatedDataModel;
        paginatedDataModel.addResultsChangedListener(new ResultsChangeListener() { // from class: o.v11
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public final void onResultsChanged(ResultsChangedEvent resultsChangedEvent) {
                this.f49739a.m16348j(resultsChangedEvent);
            }
        });
    }

    /* renamed from: o */
    public final PaginatedDataModel m16354o(String str) {
        return (PaginatedDataModel) yh6.m57813d(str.toString(), 10).m47686M(new rl7() { // from class: o.x11
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return a21.m16350l((PaginatedTokenResults) obj);
            }
        }).m47686M(new rl7() { // from class: o.y11
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return a21.m16351m((PaginatedTokenResults) obj);
            }
        }).m47698c();
    }
}
