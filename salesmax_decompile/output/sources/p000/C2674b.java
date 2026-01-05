package p000;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import p001o.sq8;

/* renamed from: b */
/* loaded from: classes.dex */
public final class C2674b extends ArrayAdapter {

    /* renamed from: a */
    public Object[] f10576a;

    /* renamed from: b */
    public final a f10577b;

    /* renamed from: b$a */
    public static final class a extends Filter {
        public a() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = C2674b.this.m10119a();
            filterResults.count = C2674b.this.m10119a().length;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C2674b.this.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2674b(Context context, int i, Object[] objArr) {
        super(context, i, objArr);
        sq8.m48649h(context, "context");
        sq8.m48649h(objArr, "values");
        this.f10576a = objArr;
        this.f10577b = new a();
    }

    /* renamed from: a */
    public final Object[] m10119a() {
        return this.f10576a;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.f10577b;
    }
}
