package p001o;

import ai.salesmax.model.LeadsTeam;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public class y21 extends ArrayAdapter implements Filterable {

    /* renamed from: a */
    public List f54731a;

    /* renamed from: b */
    public List f54732b;

    /* renamed from: o.y21$a */
    public class RunnableC18297a implements Runnable {
        public RunnableC18297a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y21.this.notifyDataSetChanged();
        }
    }

    /* renamed from: o.y21$b */
    public class C18298b extends Filter {
        public C18298b() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            List listM57127m = y21.this.m57127m(charSequence != null ? charSequence.toString() : "");
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = listM57127m.size();
            filterResults.values = listM57127m;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                y21.this.m57126l((List) obj);
            }
        }
    }

    public y21(Context context, int i, List list) {
        super(context, i);
        m57126l(list);
    }

    /* renamed from: h */
    public static /* synthetic */ p09 m57121h(View view) {
        return (p09) view.getTag();
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m57122i(String str, LeadsTeam leadsTeam) {
        return ((Boolean) Optional.ofNullable(str).map(new u3c()).map(new l21()).orElse(Boolean.FALSE)).booleanValue() || leadsTeam.getTeamName().toLowerCase().startsWith(str.toLowerCase());
    }

    /* renamed from: j */
    public static /* synthetic */ boolean m57123j(String str, LeadsTeam leadsTeam) {
        return ((Boolean) Optional.ofNullable(str).map(new u3c()).map(new l21()).orElse(Boolean.FALSE)).booleanValue() || leadsTeam.getTeamName().toLowerCase().startsWith(str.toLowerCase());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ List m57124k(final String str, List list) {
        this.f54732b = list;
        return (List) list.stream().filter(new Predicate() { // from class: o.x21
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return y21.m57123j(str, (LeadsTeam) obj);
            }
        }).collect(Collectors.toList());
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public LeadsTeam getItem(int i) {
        return (LeadsTeam) this.f54731a.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f54731a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new C18298b();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        p09 p09Var = (p09) Optional.ofNullable(view).map(new Function() { // from class: o.u21
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return y21.m57121h((View) obj);
            }
        }).orElse(p09.h0(LayoutInflater.from(getContext()), null, true));
        View viewM25689B = p09Var.m25689B();
        viewM25689B.setTag(p09Var);
        p09Var.k0(Integer.valueOf(i));
        p09Var.j0((LeadsTeam) this.f54731a.get(i));
        return viewM25689B;
    }

    /* renamed from: l */
    public final void m57126l(List list) {
        this.f54731a = list;
        j0f.m33008i(new RunnableC18297a());
    }

    /* renamed from: m */
    public final List m57127m(final String str) {
        return Optional.ofNullable(this.f54732b).isPresent() ? (List) this.f54732b.stream().filter(new Predicate() { // from class: o.v21
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return y21.m57122i(str, (LeadsTeam) obj);
            }
        }).collect(Collectors.toList()) : (List) Optional.ofNullable(wi0.m54450P()).map(new Function() { // from class: o.w21
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f51304a.m57124k(str, (List) obj);
            }
        }).orElse(Collections.emptyList());
    }
}
