package p001o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.amazonaws.util.StringUtils;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public class m21 extends ArrayAdapter implements Filterable {

    /* renamed from: a */
    public List f34658a;

    /* renamed from: b */
    public List f34659b;

    /* renamed from: c */
    public String f34660c;

    /* renamed from: o.m21$a */
    public class C15202a extends Filter {
        public C15202a() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            List listM38217s = m21.this.m38217s(charSequence != null ? charSequence.toString() : "");
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = listM38217s.size();
            filterResults.values = listM38217s;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                m21.this.f34658a = (List) obj;
                m21.this.notifyDataSetChanged();
            }
        }
    }

    public m21(Context context, String str, int i) {
        super(context, i);
        this.f34660c = str;
        m38216r(Collections.emptyList());
        m38214p();
    }

    /* renamed from: j */
    public static /* synthetic */ j09 m38207j(View view) {
        return (j09) view.getTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m38208k(List list) {
        m38216r(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m38209l() {
        final List listM38217s = m38217s("");
        j0f.m33008i(new Runnable() { // from class: o.j21
            @Override // java.lang.Runnable
            public final void run() {
                this.f29607a.m38208k(listM38217s);
            }
        });
    }

    /* renamed from: m */
    public static /* synthetic */ boolean m38210m(String str, String str2) {
        return ((Boolean) Optional.ofNullable(str).map(new u3c()).map(new l21()).orElse(Boolean.FALSE)).booleanValue() || str2.toLowerCase().startsWith(str.toLowerCase());
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m38211n(String str, String str2) {
        return ((Boolean) Optional.ofNullable(str).map(new u3c()).map(new l21()).orElse(Boolean.FALSE)).booleanValue() || str2.toLowerCase().startsWith(str.toLowerCase());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ List m38212o(final String str, List list) {
        this.f34659b = list;
        return (List) list.stream().filter(new Predicate() { // from class: o.k21
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return m21.m38211n(str, (String) obj);
            }
        }).collect(Collectors.toList());
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f34658a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new C15202a();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        j09 j09Var = (j09) Optional.ofNullable(view).map(new Function() { // from class: o.f21
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m21.m38207j((View) obj);
            }
        }).orElse(j09.h0(LayoutInflater.from(getContext()), null, true));
        View viewM25689B = j09Var.m25689B();
        viewM25689B.setTag(j09Var);
        j09Var.k0(Integer.valueOf(i));
        j09Var.j0((String) this.f34658a.get(i));
        return viewM25689B;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return (String) this.f34658a.get(i);
    }

    /* renamed from: p */
    public final void m38214p() {
        if (StringUtils.isBlank(this.f34660c)) {
            return;
        }
        new Thread(new Runnable() { // from class: o.g21
            @Override // java.lang.Runnable
            public final void run() {
                this.f24477a.m38209l();
            }
        }).start();
    }

    /* renamed from: q */
    public void m38215q(String str) {
        List list = this.f34658a;
        if (list != null) {
            list.clear();
        }
        this.f34659b = null;
        this.f34660c = str;
        m38216r(Collections.emptyList());
        m38214p();
    }

    /* renamed from: r */
    public final void m38216r(List list) {
        this.f34658a = list;
    }

    /* renamed from: s */
    public final List m38217s(final String str) {
        if (Optional.ofNullable(this.f34659b).isPresent()) {
            return (List) this.f34659b.stream().filter(new Predicate() { // from class: o.h21
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return m21.m38210m(str, (String) obj);
                }
            }).collect(Collectors.toList());
        }
        if (!StringUtils.isBlank(this.f34660c)) {
            return (List) lw9.a0(this.f34660c).d0(new rl7() { // from class: o.i21
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return this.f27947a.m38212o(str, (List) obj);
                }
            }).m55727f();
        }
        this.f34659b = null;
        return Collections.emptyList();
    }

    public m21(Context context, String str, int i, List list) {
        this(context, str, i);
        this.f34660c = str;
        this.f34659b = null;
    }
}
