package p001o;

import ai.salesmax.model.LeadsTeam;
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
public final class m31 extends ArrayAdapter implements Filterable {

    /* renamed from: a */
    public final int f34686a;

    /* renamed from: b */
    public final List f34687b;

    /* renamed from: c */
    public TextView f34688c;

    /* renamed from: d */
    public List f34689d;

    /* renamed from: o.m31$a */
    public static final class C15209a extends Filter {
        public C15209a() {
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
                arrayList = m31.this.f34687b;
            } else if (!(lowerCase.length() == 0)) {
                List list = m31.this.f34687b;
                arrayList = new ArrayList();
                for (Object obj : list) {
                    String teamName = ((LeadsTeam) obj).getTeamName();
                    Locale locale2 = Locale.getDefault();
                    sq8.m48648g(locale2, "getDefault(...)");
                    String lowerCase2 = teamName.toLowerCase(locale2);
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
            m31 m31Var = m31.this;
            Object obj = filterResults.values;
            sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.collections.List<ai.salesmax.model.LeadsTeam>");
            m31Var.f34689d = (List) obj;
            m31.this.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m31(Context context, int i, List list) {
        super(context, i, list);
        sq8.m48649h(context, "context");
        sq8.m48649h(list, "items");
        this.f34686a = i;
        this.f34687b = list;
        this.f34689d = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public LeadsTeam getItem(int i) {
        return (LeadsTeam) this.f34689d.get(i);
    }

    /* renamed from: d */
    public final TextView m38229d() {
        TextView textView = this.f34688c;
        if (textView != null) {
            return textView;
        }
        sq8.m48667z("mName");
        return null;
    }

    /* renamed from: e */
    public final void m38230e(TextView textView) {
        sq8.m48649h(textView, "<set-?>");
        this.f34688c = textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f34689d.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new C15209a();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        sq8.m48649h(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(getContext()).inflate(this.f34686a, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(z8e.assigneeName);
        sq8.m48648g(viewFindViewById, "findViewById(...)");
        m38230e((TextView) viewFindViewById);
        m38229d().setText(String.valueOf(((LeadsTeam) this.f34689d.get(i)).getTeamName()));
        sq8.m48646e(viewInflate);
        return viewInflate;
    }
}
