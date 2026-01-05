package p001o;

import androidx.compose.ui.focus.AbstractC1934h;
import androidx.compose.ui.focus.C1932f;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class k77 implements Comparator {

    /* renamed from: a */
    public static final k77 f31570a = new k77();

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(C1932f c1932f, C1932f c1932f2) {
        if (c1932f == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (c1932f2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int i = 0;
        if (!AbstractC1934h.m4932g(c1932f) || !AbstractC1934h.m4932g(c1932f2)) {
            if (AbstractC1934h.m4932g(c1932f)) {
                return -1;
            }
            return AbstractC1934h.m4932g(c1932f2) ? 1 : 0;
        }
        xzb xzbVarM17354C = c1932f.m17354C();
        zh9 zh9VarA0 = xzbVarM17354C != null ? xzbVarM17354C.a0() : null;
        if (zh9VarA0 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        xzb xzbVarM17354C2 = c1932f2.m17354C();
        zh9 zh9VarA02 = xzbVarM17354C2 != null ? xzbVarM17354C2.a0() : null;
        if (zh9VarA02 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (sq8.m48644c(zh9VarA0, zh9VarA02)) {
            return 0;
        }
        fqb fqbVarM35110b = m35110b(zh9VarA0);
        fqb fqbVarM35110b2 = m35110b(zh9VarA02);
        int iMin = Math.min(fqbVarM35110b.m27354o() - 1, fqbVarM35110b2.m27354o() - 1);
        if (iMin >= 0) {
            while (sq8.m48644c(fqbVarM35110b.m27353n()[i], fqbVarM35110b2.m27353n()[i])) {
                if (i != iMin) {
                    i++;
                }
            }
            return sq8.m48651j(((zh9) fqbVarM35110b.m27353n()[i]).m59432Y(), ((zh9) fqbVarM35110b2.m27353n()[i]).m59432Y());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
    }

    /* renamed from: b */
    public final fqb m35110b(zh9 zh9Var) {
        fqb fqbVar = new fqb(new zh9[16], 0);
        while (zh9Var != null) {
            fqbVar.m27343b(0, zh9Var);
            zh9Var = zh9Var.m59431X();
        }
        return fqbVar;
    }
}
