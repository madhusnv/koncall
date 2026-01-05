package p001o;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes2.dex */
public class qd4 extends Filter {

    /* renamed from: a */
    public InterfaceC16338a f41639a;

    /* renamed from: o.qd4$a */
    public interface InterfaceC16338a {
        /* renamed from: a */
        void mo20857a(Cursor cursor);

        /* renamed from: b */
        CharSequence mo20858b(Cursor cursor);

        /* renamed from: c */
        Cursor mo20859c(CharSequence charSequence);

        /* renamed from: d */
        Cursor mo43414d();
    }

    public qd4(InterfaceC16338a interfaceC16338a) {
        this.f41639a = interfaceC16338a;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f41639a.mo20858b((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorMo20859c = this.f41639a.mo20859c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorMo20859c != null) {
            filterResults.count = cursorMo20859c.getCount();
            filterResults.values = cursorMo20859c;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorMo43414d = this.f41639a.mo43414d();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorMo43414d) {
            return;
        }
        this.f41639a.mo20857a((Cursor) obj);
    }
}
