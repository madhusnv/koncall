package p001o;

import ai.salesmax.model.DistributionData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class u11 extends ArrayAdapter implements Filterable {

    /* renamed from: a */
    public final int f48157a;

    /* renamed from: b */
    public final ArrayList f48158b;

    /* renamed from: c */
    public TextView f48159c;

    /* renamed from: d */
    public List f48160d;

    /* renamed from: o.u11$a */
    public static final class C17282a extends Filter {
        public C17282a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
        @Override // android.widget.Filter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase;
            Collection arrayList;
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
            if (lowerCase == null) {
                arrayList = u11.this.f48160d;
            } else if (!(lowerCase.length() == 0)) {
                List list = u11.this.f48160d;
                arrayList = new ArrayList();
                for (Object obj : list) {
                    String name = ((DistributionData) obj).getName();
                    Locale locale2 = Locale.getDefault();
                    sq8.m48648g(locale2, "getDefault(...)");
                    String lowerCase2 = name.toLowerCase(locale2);
                    sq8.m48648g(lowerCase2, "toLowerCase(...)");
                    if (f9g.m26306P(lowerCase2, lowerCase, false, 2, null)) {
                        arrayList.add(obj);
                    }
                }
            }
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            sq8.m48649h(filterResults, "filterResults");
            u11 u11Var = u11.this;
            Object obj = filterResults.values;
            sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.collections.List<ai.salesmax.model.DistributionData>");
            u11Var.f48160d = (List) obj;
            u11.this.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u11(Context context, int i, ArrayList arrayList) {
        super(context, i, arrayList);
        sq8.m48649h(context, "context");
        sq8.m48649h(arrayList, "items");
        this.f48157a = i;
        this.f48158b = arrayList;
        this.f48160d = arrayList;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public DistributionData getItem(int i) {
        return (DistributionData) this.f48160d.get(i);
    }

    /* renamed from: d */
    public final TextView m50838d() {
        TextView textView = this.f48159c;
        if (textView != null) {
            return textView;
        }
        sq8.m48667z("mName");
        return null;
    }

    /* renamed from: e */
    public final void m50839e(TextView textView) {
        sq8.m48649h(textView, "<set-?>");
        this.f48159c = textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f48160d.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new C17282a();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        sq8.m48649h(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(getContext()).inflate(this.f48157a, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(z8e.assigneeName);
        sq8.m48648g(viewFindViewById, "findViewById(...)");
        m50839e((TextView) viewFindViewById);
        m50838d().setText(String.valueOf(((DistributionData) this.f48160d.get(i)).getName()));
        sq8.m48646e(viewInflate);
        return viewInflate;
    }
}
