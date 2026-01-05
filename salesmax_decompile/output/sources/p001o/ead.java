package p001o;

import android.graphics.Typeface;
import p001o.yb7;

/* loaded from: classes2.dex */
public final class ead implements cad {
    @Override // p001o.cad
    /* renamed from: a */
    public Typeface mo20630a(ac7 ac7Var, int i) {
        sq8.m48649h(ac7Var, "fontWeight");
        return m24665b(null, ac7Var, i);
    }

    /* renamed from: b */
    public final Typeface m24665b(String str, ac7 ac7Var, int i) {
        yb7.C18370a c18370a = yb7.f55185a;
        if (yb7.m57461d(i, c18370a.m57463b()) && sq8.m48644c(ac7Var, ac7.f14477b.m16853a())) {
            if (str == null || str.length() == 0) {
                Typeface typeface = Typeface.DEFAULT;
                sq8.m48648g(typeface, "DEFAULT");
                return typeface;
            }
        }
        Typeface typefaceCreate = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), ac7Var.m16852e(), yb7.m57461d(i, c18370a.m57462a()));
        sq8.m48648g(typefaceCreate, "create(\n            fami…ontStyle.Italic\n        )");
        return typefaceCreate;
    }
}
