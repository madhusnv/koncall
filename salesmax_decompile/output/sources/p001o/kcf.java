package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class kcf implements ycf, Iterable, sb9 {

    /* renamed from: a */
    public final Map f31923a = new LinkedHashMap();

    /* renamed from: b */
    public boolean f31924b;

    /* renamed from: c */
    public boolean f31925c;

    /* renamed from: A */
    public final void m35412A(boolean z) {
        this.f31924b = z;
    }

    @Override // p001o.ycf
    /* renamed from: d */
    public void mo35413d(xcf xcfVar, Object obj) {
        sq8.m48649h(xcfVar, TransferTable.COLUMN_KEY);
        if (!(obj instanceof bb) || !m35414e(xcfVar)) {
            this.f31923a.put(xcfVar, obj);
            return;
        }
        Object obj2 = this.f31923a.get(xcfVar);
        sq8.m48647f(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        bb bbVar = (bb) obj2;
        Map map = this.f31923a;
        bb bbVar2 = (bb) obj;
        String strM18512b = bbVar2.m18512b();
        if (strM18512b == null) {
            strM18512b = bbVar.m18512b();
        }
        tl7 tl7VarM18511a = bbVar2.m18511a();
        if (tl7VarM18511a == null) {
            tl7VarM18511a = bbVar.m18511a();
        }
        map.put(xcfVar, new bb(strM18512b, tl7VarM18511a));
    }

    /* renamed from: e */
    public final boolean m35414e(xcf xcfVar) {
        sq8.m48649h(xcfVar, TransferTable.COLUMN_KEY);
        return this.f31923a.containsKey(xcfVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcf)) {
            return false;
        }
        kcf kcfVar = (kcf) obj;
        return sq8.m48644c(this.f31923a, kcfVar.f31923a) && this.f31924b == kcfVar.f31924b && this.f31925c == kcfVar.f31925c;
    }

    public int hashCode() {
        return (((this.f31923a.hashCode() * 31) + Boolean.hashCode(this.f31924b)) * 31) + Boolean.hashCode(this.f31925c);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f31923a.entrySet().iterator();
    }

    /* renamed from: j */
    public final kcf m35415j() {
        kcf kcfVar = new kcf();
        kcfVar.f31924b = this.f31924b;
        kcfVar.f31925c = this.f31925c;
        kcfVar.f31923a.putAll(this.f31923a);
        return kcfVar;
    }

    /* renamed from: n */
    public final Object m35416n(xcf xcfVar) {
        sq8.m48649h(xcfVar, TransferTable.COLUMN_KEY);
        Object obj = this.f31923a.get(xcfVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + xcfVar + " - consider getOrElse or getOrNull");
    }

    /* renamed from: o */
    public final Object m35417o(xcf xcfVar, uk7 uk7Var) {
        sq8.m48649h(xcfVar, TransferTable.COLUMN_KEY);
        sq8.m48649h(uk7Var, "defaultValue");
        Object obj = this.f31923a.get(xcfVar);
        return obj == null ? uk7Var.invoke() : obj;
    }

    /* renamed from: p */
    public final Object m35418p(xcf xcfVar, uk7 uk7Var) {
        sq8.m48649h(xcfVar, TransferTable.COLUMN_KEY);
        sq8.m48649h(uk7Var, "defaultValue");
        Object obj = this.f31923a.get(xcfVar);
        return obj == null ? uk7Var.invoke() : obj;
    }

    /* renamed from: r */
    public final boolean m35419r() {
        return this.f31925c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f31924b) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f31925c) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f31923a.entrySet()) {
            xcf xcfVar = (xcf) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(xcfVar.m56027a());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return gb9.m28310a(this, null) + "{ " + ((Object) sb) + " }";
    }

    /* renamed from: v */
    public final boolean m35420v() {
        return this.f31924b;
    }

    /* renamed from: w */
    public final void m35421w(kcf kcfVar) {
        sq8.m48649h(kcfVar, "child");
        for (Map.Entry entry : kcfVar.f31923a.entrySet()) {
            xcf xcfVar = (xcf) entry.getKey();
            Object value = entry.getValue();
            Object obj = this.f31923a.get(xcfVar);
            sq8.m48647f(xcfVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objM56028b = xcfVar.m56028b(obj, value);
            if (objM56028b != null) {
                this.f31923a.put(xcfVar, objM56028b);
            }
        }
    }

    /* renamed from: y */
    public final void m35422y(boolean z) {
        this.f31925c = z;
    }
}
