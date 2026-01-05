package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class t2g {
    /* renamed from: a */
    public static final Object m49205a(List list) {
        sq8.m48649h(list, "<this>");
        return hh3.m30449I(list);
    }

    /* renamed from: b */
    public static final Object m49206b(List list) {
        sq8.m48649h(list, "<this>");
        return hh3.m30450J(list);
    }

    /* renamed from: c */
    public static final boolean m49207c(List list, Object obj) {
        sq8.m48649h(list, "<this>");
        return list.add(obj);
    }

    /* renamed from: d */
    public static final Object m49208d(List list, Object obj) {
        sq8.m48649h(list, "<this>");
        Object objM49206b = m49206b(list);
        m49207c(list, obj);
        return objM49206b;
    }

    /* renamed from: e */
    public static final Object m49209e(List list) {
        sq8.m48649h(list, "<this>");
        return list.get(list.size() - 1);
    }

    /* renamed from: f */
    public static final Object m49210f(List list) {
        sq8.m48649h(list, "<this>");
        if (!list.isEmpty()) {
            return m49209e(list);
        }
        return null;
    }
}
