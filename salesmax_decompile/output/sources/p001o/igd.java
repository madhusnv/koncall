package p001o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class igd {

    /* renamed from: o.igd$b */
    public static class C14287b implements hgd, Serializable {

        /* renamed from: a */
        public final List f28649a;

        @Override // p001o.hgd
        public boolean apply(Object obj) {
            for (int i = 0; i < this.f28649a.size(); i++) {
                if (!((hgd) this.f28649a.get(i)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C14287b) {
                return this.f28649a.equals(((C14287b) obj).f28649a);
            }
            return false;
        }

        public int hashCode() {
            return this.f28649a.hashCode() + 306654252;
        }

        public String toString() {
            return igd.m32113d("and", this.f28649a);
        }

        public C14287b(List list) {
            this.f28649a = list;
        }
    }

    /* renamed from: b */
    public static hgd m32111b(hgd hgdVar, hgd hgdVar2) {
        return new C14287b(m32112c((hgd) dgd.m23062o(hgdVar), (hgd) dgd.m23062o(hgdVar2)));
    }

    /* renamed from: c */
    public static List m32112c(hgd hgdVar, hgd hgdVar2) {
        return Arrays.asList(hgdVar, hgdVar2);
    }

    /* renamed from: d */
    public static String m32113d(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
