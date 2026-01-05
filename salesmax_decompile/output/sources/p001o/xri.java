package p001o;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public interface xri {

    /* renamed from: o.xri$a */
    public static final class C18232a {
        /* renamed from: a */
        public static void m56731a(xri xriVar, nl7 nl7Var) {
            sq8.m48649h(nl7Var, "body");
            for (Map.Entry entry : xriVar.mo17772b()) {
                nl7Var.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        /* renamed from: b */
        public static Object m56732b(xri xriVar, String str) {
            sq8.m48649h(str, "name");
            List listMo17773c = xriVar.mo17773c(str);
            if (listMo17773c != null) {
                return kh3.h0(listMo17773c);
            }
            return null;
        }
    }

    /* renamed from: a */
    boolean mo17771a();

    /* renamed from: b */
    Set mo17772b();

    /* renamed from: c */
    List mo17773c(String str);

    boolean contains(String str);

    /* renamed from: d */
    void mo17774d(nl7 nl7Var);

    Object get(String str);

    boolean isEmpty();

    Set names();
}
