package p001o;

import ai.salesmax.model.LeadTeamMember;
import ai.salesmax.model.LeadsUser;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.amazonaws.util.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public class l31 extends ArrayAdapter implements Filterable {

    /* renamed from: a */
    public List f33219a;

    /* renamed from: b */
    public List f33220b;

    /* renamed from: c */
    public String f33221c;

    /* renamed from: o.l31$a */
    public class C14989a extends Filter {
        public C14989a() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            List listM36482t = l31.this.m36482t(charSequence != null ? charSequence.toString() : "");
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = listM36482t.size();
            filterResults.values = listM36482t;
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                l31.this.m36481s((List) obj);
            }
        }
    }

    public l31(Context context, int i) {
        super(context, i);
        m36481s(m36482t(""));
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m36472l(String str, LeadsUser leadsUser) {
        return Objects.equals(leadsUser.getId(), str);
    }

    /* renamed from: m */
    public static /* synthetic */ v09 m36473m(View view) {
        return (v09) view.getTag();
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m36474n(String str, LeadsUser leadsUser) {
        return ((Boolean) Optional.ofNullable(str).map(new u3c()).map(new l21()).orElse(Boolean.FALSE)).booleanValue() || leadsUser.getName().toLowerCase().startsWith(str.toLowerCase());
    }

    /* renamed from: o */
    public static /* synthetic */ boolean m36475o(String str, LeadsUser leadsUser) {
        return ((Boolean) Optional.ofNullable(str).map(new u3c()).map(new l21()).orElse(Boolean.FALSE)).booleanValue() || leadsUser.getName().toLowerCase().startsWith(str.toLowerCase());
    }

    /* renamed from: p */
    public static /* synthetic */ Set m36476p(List list) {
        return (Set) list.stream().map(new Function() { // from class: o.k31
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((LeadTeamMember) obj).getMemberUser();
            }
        }).collect(Collectors.toSet());
    }

    /* renamed from: q */
    public static /* synthetic */ boolean m36477q(String str, LeadsUser leadsUser) {
        return ((Boolean) Optional.ofNullable(str).map(new u3c()).map(new l21()).orElse(Boolean.FALSE)).booleanValue() || leadsUser.getName().toLowerCase().startsWith(str.toLowerCase());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ List m36478r(final String str, Set set) {
        this.f33220b = new ArrayList(set);
        return (List) set.stream().filter(new Predicate() { // from class: o.j31
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l31.m36477q(str, (LeadsUser) obj);
            }
        }).collect(Collectors.toList());
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f33219a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new C14989a();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        v09 v09Var = (v09) Optional.ofNullable(view).map(new Function() { // from class: o.i31
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l31.m36473m((View) obj);
            }
        }).orElse(v09.h0(LayoutInflater.from(getContext()), null, true));
        View viewM25689B = v09Var.m25689B();
        viewM25689B.setTag(v09Var);
        v09Var.k0(Integer.valueOf(i));
        v09Var.j0((LeadsUser) this.f33219a.get(i));
        return viewM25689B;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public LeadsUser getItem(int i) {
        return (LeadsUser) this.f33219a.get(i);
    }

    /* renamed from: k */
    public Optional m36480k(final String str) {
        return lpi.m37619T().stream().filter(new Predicate() { // from class: o.d31
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l31.m36472l(str, (LeadsUser) obj);
            }
        }).findFirst();
    }

    /* renamed from: s */
    public final void m36481s(List list) {
        this.f33219a = list;
        j0f.m33008i(new Runnable() { // from class: o.c31
            @Override // java.lang.Runnable
            public final void run() {
                this.f17213a.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: t */
    public final List m36482t(final String str) {
        if (Optional.ofNullable(this.f33220b).isPresent()) {
            return (List) this.f33220b.stream().filter(new Predicate() { // from class: o.e31
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return l31.m36474n(str, (LeadsUser) obj);
                }
            }).collect(Collectors.toList());
        }
        if (!StringUtils.isBlank(this.f33221c) && !"ALL".equalsIgnoreCase(this.f33221c)) {
            return (List) o4h.m41547K(this.f33221c).m47686M(new rl7() { // from class: o.g31
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return l31.m36476p((List) obj);
                }
            }).m47686M(new rl7() { // from class: o.h31
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return this.f26154a.m36478r(str, (Set) obj);
                }
            }).m47699d(Collections.emptyList());
        }
        this.f33220b = new ArrayList(lpi.m37619T());
        return (List) lpi.m37619T().stream().filter(new Predicate() { // from class: o.f31
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l31.m36475o(str, (LeadsUser) obj);
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: u */
    public void m36483u(String str) {
        List list = this.f33219a;
        if (list != null) {
            list.clear();
        }
        this.f33221c = str;
        this.f33220b = null;
        m36481s(m36482t(""));
    }

    public l31(Context context, int i, String str) {
        this(context, i);
        m36483u(str);
    }
}
