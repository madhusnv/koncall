package f8;

import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5179q;
import nx.AbstractC5185w;
import qw.a0;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f8.j */
/* loaded from: classes.dex */
public final class C2215j {

    /* renamed from: a */
    public final String f10184a;

    /* renamed from: b */
    public final boolean f10185b;

    /* renamed from: c */
    public final List f10186c;

    /* renamed from: d */
    public final List f10187d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public C2215j(String name, boolean z6, List columns, List orders) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(columns, "columns");
        AbstractC4154l.m8923f(orders, "orders");
        this.f10184a = name;
        this.f10185b = z6;
        this.f10186c = columns;
        this.f10187d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                orders.add("ASC");
            }
        }
        this.f10187d = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2215j) {
            C2215j c2215j = (C2215j) obj;
            String str = c2215j.f10184a;
            if (this.f10185b == c2215j.f10185b && AbstractC4154l.m8918a(this.f10186c, c2215j.f10186c) && AbstractC4154l.m8918a(this.f10187d, c2215j.f10187d)) {
                String str2 = this.f10184a;
                return AbstractC5185w.m10138t(str2, "index_", false) ? AbstractC5185w.m10138t(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10184a;
        return this.f10187d.hashCode() + AbstractC1452a.m4559f(this.f10186c, (((AbstractC5185w.m10138t(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f10185b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Index {\n            |   name = '");
        sb2.append(this.f10184a);
        sb2.append("',\n            |   unique = '");
        sb2.append(this.f10185b);
        sb2.append("',\n            |   columns = {");
        AbstractC5179q.m10120b(AbstractC6663m.m12748L(this.f10186c, ",", null, null, null, 62));
        AbstractC5179q.m10120b("},");
        a0 a0Var = a0.f30746a;
        sb2.append(a0Var);
        sb2.append("\n            |   orders = {");
        AbstractC5179q.m10120b(AbstractC6663m.m12748L(this.f10187d, ",", null, null, null, 62));
        AbstractC5179q.m10120b(" }");
        sb2.append(a0Var);
        sb2.append("\n            |}\n        ");
        return AbstractC5179q.m10120b(AbstractC5179q.m10123e(sb2.toString()));
    }
}
