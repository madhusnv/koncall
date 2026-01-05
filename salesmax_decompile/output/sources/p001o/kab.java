package p001o;

import ai.salesmax.model.LeadsUser;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import p001o.ck6;
import p001o.kab;

/* loaded from: classes.dex */
public final class kab extends ArrayAdapter implements Filterable {

    /* renamed from: a */
    public final int f31746a;

    /* renamed from: b */
    public final List f31747b;

    /* renamed from: c */
    public final ck6 f31748c;

    /* renamed from: d */
    public int f31749d;

    /* renamed from: e */
    public List f31750e;

    /* renamed from: o.kab$a */
    public static final class C14758a extends Filter {
        public C14758a() {
        }

        /* renamed from: b */
        public static final void m35240b(Filter.FilterResults filterResults, kab kabVar) {
            sq8.m48649h(filterResults, "$filterResults");
            sq8.m48649h(kabVar, "this$0");
            Object obj = filterResults.values;
            if (obj != null) {
                sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.collections.List<ai.salesmax.model.LeadsUser>");
                kabVar.f31750e = (List) obj;
                kabVar.notifyDataSetChanged();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
        @Override // android.widget.Filter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String strValueOf = String.valueOf(charSequence);
            Locale locale = Locale.getDefault();
            sq8.m48648g(locale, "getDefault(...)");
            String lowerCase = strValueOf.toLowerCase(locale);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (lowerCase.length() > 0) {
                kab.this.m35238h(f9g.g0(lowerCase, '@', 0, false, 6, null));
                if (kab.this.m35237f() != -1) {
                    String strM24593G = e9g.m24593G(lowerCase, "\n", " ", false, 4, null);
                    int iG0 = f9g.g0(strM24593G, '@', 0, false, 6, null);
                    String strSubstring = strM24593G.substring(kab.this.m35237f());
                    sq8.m48648g(strSubstring, "substring(...)");
                    if (iG0 == 0) {
                        String strSubstring2 = strSubstring.substring(1);
                        sq8.m48648g(strSubstring2, "substring(...)");
                        int length = strSubstring2.length() - 1;
                        int i = 0;
                        boolean z = false;
                        while (i <= length) {
                            boolean z2 = sq8.m48651j(strSubstring2.charAt(!z ? i : length), 32) <= 0;
                            if (z) {
                                if (!z2) {
                                    break;
                                }
                                length--;
                            } else if (z2) {
                                i++;
                            } else {
                                z = true;
                            }
                        }
                        String string = strSubstring2.subSequence(i, length + 1).toString();
                        List list = kab.this.f31747b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            String name = ((LeadsUser) obj).getName();
                            Locale locale2 = Locale.getDefault();
                            sq8.m48648g(locale2, "getDefault(...)");
                            String lowerCase2 = name.toLowerCase(locale2);
                            sq8.m48648g(lowerCase2, "toLowerCase(...)");
                            if (f9g.m26306P(lowerCase2, string, false, 2, null)) {
                                arrayList.add(obj);
                            }
                        }
                        filterResults.values = arrayList;
                    } else if (strM24593G.charAt(iG0 - 1) == ' ') {
                        if (!(strSubstring.length() == 0)) {
                            int length2 = strSubstring.length() - 1;
                            int i2 = 0;
                            boolean z3 = false;
                            while (i2 <= length2) {
                                boolean z4 = sq8.m48651j(strSubstring.charAt(!z3 ? i2 : length2), 32) <= 0;
                                if (z3) {
                                    if (!z4) {
                                        break;
                                    }
                                    length2--;
                                } else if (z4) {
                                    i2++;
                                } else {
                                    z3 = true;
                                }
                            }
                            if (strSubstring.subSequence(i2, length2 + 1).toString().length() > 0 && !f9g.m26306P(strSubstring, "@[", false, 2, null) && !f9g.m26306P(strSubstring, "/n", false, 2, null)) {
                            }
                        }
                    }
                }
            }
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, final Filter.FilterResults filterResults) {
            sq8.m48649h(filterResults, "filterResults");
            final kab kabVar = kab.this;
            j0f.m33008i(new Runnable() { // from class: o.jab
                @Override // java.lang.Runnable
                public final void run() {
                    kab.C14758a.m35240b(filterResults, kabVar);
                }
            });
        }
    }

    /* renamed from: o.kab$b */
    public static final class C14759b implements ck6 {
        public C14759b() {
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
            kab.this.f31748c.mo708b(view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            ck6.C12696a.m21335a(this, editText, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kab(Context context, int i, List list, ck6 ck6Var) {
        super(context, i, list);
        sq8.m48649h(context, "context");
        sq8.m48649h(list, "items");
        sq8.m48649h(ck6Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f31746a = i;
        this.f31747b = list;
        this.f31748c = ck6Var;
        this.f31749d = -1;
        this.f31750e = list;
    }

    /* renamed from: g */
    public static final Object m35235g(View view) {
        sq8.m48649h(view, "v");
        Object tag = view.getTag();
        sq8.m48647f(tag, "null cannot be cast to non-null type ai.salesmax.databinding.ItemLeadUserBinding");
        return (t09) tag;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public LeadsUser getItem(int i) {
        return (LeadsUser) this.f31750e.get(i);
    }

    /* renamed from: f */
    public final int m35237f() {
        return this.f31749d;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f31750e.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new C14758a();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        sq8.m48649h(viewGroup, "parent");
        Object objOrElse = Optional.ofNullable(view).map(new Function() { // from class: o.iab
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return kab.m35235g((View) obj);
            }
        }).orElse(t09.i0(LayoutInflater.from(getContext()), null, true));
        sq8.m48647f(objOrElse, "null cannot be cast to non-null type ai.salesmax.databinding.ItemLeadUserBinding");
        t09 t09Var = (t09) objOrElse;
        if (t09Var.h0() == null) {
            t09Var.k0(new C14759b());
        }
        View viewM25689B = t09Var.m25689B();
        viewM25689B.setTag(t09Var);
        t09Var.m0(Integer.valueOf(i));
        t09Var.l0((LeadsUser) this.f31750e.get(i));
        return viewM25689B;
    }

    /* renamed from: h */
    public final void m35238h(int i) {
        this.f31749d = i;
    }
}
