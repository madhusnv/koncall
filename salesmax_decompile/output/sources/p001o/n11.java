package p001o;

import ai.salesmax.model.LeadsUser;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Filter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p001o.ck6;

/* loaded from: classes.dex */
public final class n11 extends ArrayAdapter {

    /* renamed from: a */
    public final ArrayList f36203a;

    /* renamed from: b */
    public final ck6 f36204b;

    /* renamed from: c */
    public final ArrayList f36205c;

    /* renamed from: d */
    public final ArrayList f36206d;

    /* renamed from: e */
    public Filter f36207e;

    /* renamed from: o.n11$a */
    public static final class C15460a implements ck6 {
        public C15460a() {
        }

        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
            n11.this.f36204b.mo708b(view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* renamed from: o.n11$b */
    public static final class C15461b extends Filter {
        public C15461b() {
        }

        @Override // android.widget.Filter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convertResultToString(Object obj) {
            sq8.m48649h(obj, "resultValue");
            return ((LeadsUser) obj).getName();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            sq8.m48649h(charSequence, "constraint");
            n11 n11Var = n11.this;
            n11Var.f36206d.clear();
            Iterator it = n11Var.f36205c.iterator();
            while (it.hasNext()) {
                LeadsUser leadsUser = (LeadsUser) it.next();
                String name = leadsUser.getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
                String lowerCase2 = charSequence.toString().toLowerCase(locale);
                sq8.m48648g(lowerCase2, "toLowerCase(...)");
                if (e9g.m24597K(lowerCase, lowerCase2, false, 2, null)) {
                    n11Var.f36206d.add(leadsUser);
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = n11Var.f36206d;
            filterResults.count = n11Var.f36206d.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            sq8.m48649h(charSequence, "constraint");
            sq8.m48649h(filterResults, "results");
            Object obj = filterResults.values;
            sq8.m48647f(obj, "null cannot be cast to non-null type java.util.ArrayList<ai.salesmax.model.LeadsUser>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.salesmax.model.LeadsUser> }");
            ArrayList arrayList = (ArrayList) obj;
            if (filterResults.count > 0) {
                n11.this.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    n11.this.add((LeadsUser) it.next());
                }
                n11.this.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n11(Context context, int i, ArrayList arrayList, ck6 ck6Var) {
        super(context, i, arrayList);
        sq8.m48649h(context, "context");
        sq8.m48649h(arrayList, "items");
        sq8.m48649h(ck6Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f36203a = arrayList;
        this.f36204b = ck6Var;
        Object objClone = arrayList.clone();
        sq8.m48647f(objClone, "null cannot be cast to non-null type java.util.ArrayList<ai.salesmax.model.LeadsUser>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.salesmax.model.LeadsUser> }");
        this.f36205c = (ArrayList) objClone;
        this.f36206d = new ArrayList();
        this.f36207e = new C15461b();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.f36207e;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        t09 t09VarI0;
        sq8.m48649h(viewGroup, "parent");
        if (view == null) {
            t09VarI0 = t09.i0(LayoutInflater.from(getContext()), null, true);
        } else {
            Object tag = view.getTag();
            sq8.m48647f(tag, "null cannot be cast to non-null type ai.salesmax.databinding.ItemLeadUserBinding");
            t09VarI0 = (t09) tag;
        }
        sq8.m48646e(t09VarI0);
        if (t09VarI0.h0() == null) {
            t09VarI0.k0(new C15460a());
        }
        View viewM25689B = t09VarI0.m25689B();
        viewM25689B.setTag(t09VarI0);
        t09VarI0.m0(Integer.valueOf(i));
        Object obj = this.f36203a.get(i);
        sq8.m48648g(obj, "get(...)");
        t09VarI0.l0((LeadsUser) obj);
        return viewM25689B;
    }
}
