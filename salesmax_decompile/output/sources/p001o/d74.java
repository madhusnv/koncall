package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class d74 {
    /* renamed from: a */
    public static final Collection m22397a(Collection collection, xk7 xk7Var, xk7 xk7Var2) {
        sq8.m48649h(collection, "<this>");
        sq8.m48649h(xk7Var, "src2Dest");
        sq8.m48649h(xk7Var2, "dest2Src");
        return new zg3(collection, xk7Var, xk7Var2);
    }

    /* renamed from: b */
    public static final d69 m22398b(Iterator it, xk7 xk7Var) {
        sq8.m48649h(it, "<this>");
        sq8.m48649h(xk7Var, "src2Dest");
        return new d69(it, xk7Var);
    }

    /* renamed from: c */
    public static final uob m22399c(Collection collection, xk7 xk7Var, xk7 xk7Var2) {
        sq8.m48649h(collection, "<this>");
        sq8.m48649h(xk7Var, "src2Dest");
        sq8.m48649h(xk7Var2, "dest2Src");
        return new uob(collection, xk7Var, xk7Var2);
    }

    /* renamed from: d */
    public static final epb m22400d(Iterator it, xk7 xk7Var) {
        sq8.m48649h(it, "<this>");
        sq8.m48649h(xk7Var, "src2Dest");
        return new epb(it, xk7Var);
    }

    /* renamed from: e */
    public static final fpb m22401e(ListIterator listIterator, xk7 xk7Var, xk7 xk7Var2) {
        sq8.m48649h(listIterator, "<this>");
        sq8.m48649h(xk7Var, "src2Dest");
        sq8.m48649h(xk7Var2, "dest2Src");
        return new fpb(listIterator, xk7Var, xk7Var2);
    }

    /* renamed from: f */
    public static final gpb m22402f(List list, xk7 xk7Var, xk7 xk7Var2) {
        sq8.m48649h(list, "<this>");
        sq8.m48649h(xk7Var, "src2Dest");
        sq8.m48649h(xk7Var2, "dest2Src");
        return new gpb(list, xk7Var, xk7Var2);
    }

    /* renamed from: g */
    public static final ppb m22403g(kpb kpbVar, xk7 xk7Var, xk7 xk7Var2, xk7 xk7Var3, xk7 xk7Var4) {
        sq8.m48649h(kpbVar, "<this>");
        sq8.m48649h(xk7Var, "kSrc2Dest");
        sq8.m48649h(xk7Var2, "kDest2Src");
        sq8.m48649h(xk7Var3, "vSrc2Dest");
        sq8.m48649h(xk7Var4, "vDest2Src");
        return new ppb(kpbVar, xk7Var, xk7Var2, xk7Var3, xk7Var4);
    }

    /* renamed from: h */
    public static final ypb m22404h(Set set, xk7 xk7Var, xk7 xk7Var2) {
        sq8.m48649h(set, "<this>");
        sq8.m48649h(xk7Var, "src2Dest");
        sq8.m48649h(xk7Var2, "dest2Src");
        return new ypb(set, xk7Var, xk7Var2);
    }
}
