package f8;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5179q;
import qw.a0;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f8.i */
/* loaded from: classes.dex */
public final class C2214i {

    /* renamed from: a */
    public final String f10179a;

    /* renamed from: b */
    public final String f10180b;

    /* renamed from: c */
    public final String f10181c;

    /* renamed from: d */
    public final List f10182d;

    /* renamed from: e */
    public final List f10183e;

    public C2214i(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
        AbstractC4154l.m8923f(referenceTable, "referenceTable");
        AbstractC4154l.m8923f(onDelete, "onDelete");
        AbstractC4154l.m8923f(onUpdate, "onUpdate");
        AbstractC4154l.m8923f(columnNames, "columnNames");
        AbstractC4154l.m8923f(referenceColumnNames, "referenceColumnNames");
        this.f10179a = referenceTable;
        this.f10180b = onDelete;
        this.f10181c = onUpdate;
        this.f10182d = columnNames;
        this.f10183e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2214i)) {
            return false;
        }
        C2214i c2214i = (C2214i) obj;
        if (AbstractC4154l.m8918a(this.f10179a, c2214i.f10179a) && AbstractC4154l.m8918a(this.f10180b, c2214i.f10180b) && AbstractC4154l.m8918a(this.f10181c, c2214i.f10181c) && AbstractC4154l.m8918a(this.f10182d, c2214i.f10182d)) {
            return AbstractC4154l.m8918a(this.f10183e, c2214i.f10183e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10183e.hashCode() + AbstractC1452a.m4559f(this.f10182d, AbstractC0030c.m113d(AbstractC0030c.m113d(this.f10179a.hashCode() * 31, 31, this.f10180b), 31, this.f10181c), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb2.append(this.f10179a);
        sb2.append("',\n            |   onDelete = '");
        sb2.append(this.f10180b);
        sb2.append("',\n            |   onUpdate = '");
        sb2.append(this.f10181c);
        sb2.append("',\n            |   columnNames = {");
        AbstractC5179q.m10120b(AbstractC6663m.m12748L(AbstractC6663m.m12759W(this.f10182d), ",", null, null, null, 62));
        AbstractC5179q.m10120b("},");
        a0 a0Var = a0.f30746a;
        sb2.append(a0Var);
        sb2.append("\n            |   referenceColumnNames = {");
        AbstractC5179q.m10120b(AbstractC6663m.m12748L(AbstractC6663m.m12759W(this.f10183e), ",", null, null, null, 62));
        AbstractC5179q.m10120b(" }");
        sb2.append(a0Var);
        sb2.append("\n            |}\n        ");
        return AbstractC5179q.m10120b(AbstractC5179q.m10123e(sb2.toString()));
    }
}
