package p001o;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class fad implements cad {
    @Override // p001o.cad
    /* renamed from: a */
    public Typeface mo20630a(ac7 ac7Var, int i) {
        sq8.m48649h(ac7Var, "fontWeight");
        return m26349b(null, ac7Var, i);
    }

    /* renamed from: b */
    public final Typeface m26349b(String str, ac7 ac7Var, int i) {
        if (yb7.m57461d(i, yb7.f55185a.m57463b()) && sq8.m48644c(ac7Var, ac7.f14477b.m16853a())) {
            if (str == null || str.length() == 0) {
                Typeface typeface = Typeface.DEFAULT;
                sq8.m48648g(typeface, "DEFAULT");
                return typeface;
            }
        }
        int iM38808c = me0.m38808c(ac7Var, i);
        if (str == null || str.length() == 0) {
            Typeface typefaceDefaultFromStyle = Typeface.defaultFromStyle(iM38808c);
            sq8.m48648g(typefaceDefaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return typefaceDefaultFromStyle;
        }
        Typeface typefaceCreate = Typeface.create(str, iM38808c);
        sq8.m48648g(typefaceCreate, "{\n            Typeface.c…y, targetStyle)\n        }");
        return typefaceCreate;
    }
}
