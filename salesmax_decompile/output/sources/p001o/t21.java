package p001o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public class t21 extends ArrayAdapter implements Filterable {

    /* renamed from: a */
    public List f46249a;

    /* renamed from: b */
    public List f46250b;

    /* renamed from: o.t21$a */
    public class C16978a extends Filter {
        public C16978a() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            List listM49196r = t21.this.m49196r(charSequence != null ? charSequence.toString() : "");
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = listM49196r.size();
            filterResults.values = listM49196r;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                t21.this.f46249a = (List) obj;
                t21.this.notifyDataSetChanged();
            }
        }
    }

    public t21(Context context, int i) {
        super(context, i);
        m49195q(new ArrayList());
        m49194p();
    }

    /* renamed from: j */
    public static /* synthetic */ j09 m49187j(View view) {
        return (j09) view.getTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m49188k(List list) {
        m49195q(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m49189l() {
        final List listM49196r = m49196r("");
        j0f.m33008i(new Runnable() { // from class: o.p21
            @Override // java.lang.Runnable
            public final void run() {
                this.f39192a.m49188k(listM49196r);
            }
        });
    }

    /* renamed from: m */
    public static /* synthetic */ boolean m49190m(String str, String str2) {
        return ((Boolean) Optional.ofNullable(str).map(new u3c()).map(new l21()).orElse(Boolean.FALSE)).booleanValue() || str2.toLowerCase().startsWith(str.toLowerCase());
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m49191n(String str, String str2) {
        return ((Boolean) Optional.ofNullable(str).map(new u3c()).map(new l21()).orElse(Boolean.FALSE)).booleanValue() || str2.toLowerCase().startsWith(str.toLowerCase());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ List m49192o(final String str, List list) {
        this.f46250b = list;
        return (List) list.stream().filter(new Predicate() { // from class: o.s21
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return t21.m49191n(str, (String) obj);
            }
        }).collect(Collectors.toList());
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f46249a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new C16978a();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        j09 j09Var = (j09) Optional.ofNullable(view).map(new Function() { // from class: o.o21
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return t21.m49187j((View) obj);
            }
        }).orElse(j09.h0(LayoutInflater.from(getContext()), null, true));
        View viewM25689B = j09Var.m25689B();
        viewM25689B.setTag(j09Var);
        j09Var.k0(Integer.valueOf(i));
        j09Var.j0((String) this.f46249a.get(i));
        return viewM25689B;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return (String) this.f46249a.get(i);
    }

    /* renamed from: p */
    public final void m49194p() {
        new Thread(new Runnable() { // from class: o.n21
            @Override // java.lang.Runnable
            public final void run() {
                this.f36262a.m49189l();
            }
        }).start();
    }

    /* renamed from: q */
    public final void m49195q(List list) {
        this.f46249a = list;
    }

    /* renamed from: r */
    public final List m49196r(final String str) {
        if (Optional.ofNullable(this.f46250b).isPresent()) {
            return (List) this.f46250b.stream().filter(new Predicate() { // from class: o.q21
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return t21.m49190m(str, (String) obj);
                }
            }).collect(Collectors.toList());
        }
        try {
            return (List) lw9.b0().d0(new rl7() { // from class: o.r21
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return this.f42768a.m49192o(str, (List) obj);
                }
            }).m55727f();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public t21(Context context, int i, List list) {
        this(context, i);
        this.f46250b = null;
    }
}
