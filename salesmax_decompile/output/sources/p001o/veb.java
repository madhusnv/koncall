package p001o;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public abstract class veb {
    /* renamed from: a */
    public static final jw7 m52663a(jw7 jw7Var, ueb... uebVarArr) {
        sq8.m48649h(jw7Var, "handler");
        sq8.m48649h(uebVarArr, "middleware");
        if (uebVarArr.length == 0) {
            return jw7Var;
        }
        List listM29254U = gp0.m29254U(uebVarArr, 1);
        f85 f85Var = new f85(jw7Var, (ueb) gp0.s0(uebVarArr));
        if (!listM29254U.isEmpty()) {
            ListIterator listIterator = listM29254U.listIterator(listM29254U.size());
            while (listIterator.hasPrevious()) {
                f85Var = new f85(f85Var, (ueb) listIterator.previous());
            }
        }
        return f85Var;
    }
}
