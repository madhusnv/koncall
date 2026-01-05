package p001o;

import ai.salesmax.model.LeadsUser;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import p001o.b31;

/* loaded from: classes.dex */
public final class b31 extends ArrayAdapter implements Filterable {

    /* renamed from: a */
    public final int f15496a;

    /* renamed from: b */
    public final List f15497b;

    /* renamed from: c */
    public List f15498c;

    /* renamed from: o.b31$a */
    public static final class C12279a extends Filter {
        public C12279a() {
        }

        /* renamed from: b */
        public static final void m18125b(b31 b31Var, Filter.FilterResults filterResults) {
            sq8.m48649h(b31Var, "this$0");
            sq8.m48649h(filterResults, "$filterResults");
            Object obj = filterResults.values;
            sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.collections.List<ai.salesmax.model.LeadsUser>");
            b31Var.f15498c = (List) obj;
            b31Var.notifyDataSetChanged();
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
        @Override // android.widget.Filter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase;
            String string;
            if (charSequence == null || (string = charSequence.toString()) == null) {
                lowerCase = null;
            } else {
                Locale locale = Locale.getDefault();
                sq8.m48648g(locale, "getDefault(...)");
                lowerCase = string.toLowerCase(locale);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (lowerCase != null) {
                if (lowerCase.length() == 0) {
                    filterResults.values = b31.this.f15497b;
                } else if (!(f9g.Z0(lowerCase).toString().length() == 0) && !sq8.m48644c(f9g.Z0(lowerCase).toString(), "@")) {
                    List list = b31.this.f15497b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        String name = ((LeadsUser) obj).getName();
                        Locale locale2 = Locale.getDefault();
                        sq8.m48648g(locale2, "getDefault(...)");
                        String lowerCase2 = name.toLowerCase(locale2);
                        sq8.m48648g(lowerCase2, "toLowerCase(...)");
                        if (f9g.m26306P(lowerCase2, lowerCase, false, 2, null)) {
                            arrayList.add(obj);
                        }
                    }
                    filterResults.values = arrayList;
                }
            }
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, final Filter.FilterResults filterResults) {
            sq8.m48649h(filterResults, "filterResults");
            final b31 b31Var = b31.this;
            j0f.m33008i(new Runnable() { // from class: o.a31
                @Override // java.lang.Runnable
                public final void run() {
                    b31.C12279a.m18125b(b31Var, filterResults);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b31(Context context, int i, List list) {
        super(context, i, list);
        sq8.m48649h(context, "context");
        sq8.m48649h(list, "items");
        this.f15496a = i;
        this.f15497b = list;
        this.f15498c = list;
    }

    /* renamed from: e */
    public static final Object m18122e(View view) {
        sq8.m48649h(view, "v");
        Object tag = view.getTag();
        sq8.m48647f(tag, "null cannot be cast to non-null type ai.salesmax.databinding.ItemAutocompleteUserBinding");
        return (ow8) tag;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public LeadsUser getItem(int i) {
        return (LeadsUser) this.f15498c.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f15498c.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new C12279a();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        sq8.m48649h(viewGroup, "parent");
        Object objOrElse = Optional.ofNullable(view).map(new Function() { // from class: o.z21
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return b31.m18122e((View) obj);
            }
        }).orElse(ow8.h0(LayoutInflater.from(getContext()), null, true));
        sq8.m48647f(objOrElse, "null cannot be cast to non-null type ai.salesmax.databinding.ItemAutocompleteUserBinding");
        ow8 ow8Var = (ow8) objOrElse;
        View viewM25689B = ow8Var.m25689B();
        viewM25689B.setTag(ow8Var);
        ow8Var.k0(Integer.valueOf(i));
        ow8Var.j0((LeadsUser) this.f15498c.get(i));
        return viewM25689B;
    }
}
