package rr;

import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import or.C5454q;
import u2.C7320q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rr.j */
/* loaded from: classes3.dex */
public final class C6610j {

    /* renamed from: a */
    public final ArrayList f31762a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f31763b = new ArrayList();

    /* renamed from: c */
    public String f31764c = "";

    /* renamed from: d */
    public final C7320q f31765d = new C7320q();

    /* renamed from: a */
    public final void m12667a(String name, boolean z6) {
        Object obj;
        AbstractC4154l.m8923f(name, "name");
        ArrayList arrayList = this.f31763b;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (AbstractC4154l.m8918a(((C5454q) obj).f27491a, name)) {
                break;
            }
        }
        C5454q c5454q = (C5454q) obj;
        if (c5454q != null) {
            int iIndexOf = arrayList.indexOf(c5454q);
            arrayList.set(iIndexOf, C5454q.m11181a((C5454q) arrayList.get(iIndexOf), z6));
        }
        m12668b(this.f31764c);
    }

    /* renamed from: b */
    public final void m12668b(String query) {
        AbstractC4154l.m8923f(query, "query");
        this.f31764c = query;
        C7320q c7320q = this.f31765d;
        c7320q.clear();
        int length = query.length();
        ArrayList arrayList = this.f31763b;
        if (length == 0) {
            c7320q.addAll(arrayList);
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C5454q c5454q = (C5454q) obj;
            String str = c5454q.f27491a;
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            String lowerCase2 = this.f31764c.toLowerCase(locale);
            AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
            if (!AbstractC5178p.m10116x(lowerCase, lowerCase2, false)) {
                String lowerCase3 = c5454q.f27492b.toLowerCase(locale);
                AbstractC4154l.m8922e(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = this.f31764c.toLowerCase(locale);
                AbstractC4154l.m8922e(lowerCase4, "toLowerCase(...)");
                if (AbstractC5178p.m10116x(lowerCase3, lowerCase4, false)) {
                }
            }
            c7320q.add(c5454q);
        }
    }
}
