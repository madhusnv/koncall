package p001o;

import java.util.Set;

/* loaded from: classes6.dex */
public abstract class r7g {

    /* renamed from: a */
    public static final Set f43118a = nif.m40668i(sm1.m48502B(j0i.f29524b).getDescriptor(), sm1.m48503C(p0i.f39160b).getDescriptor(), sm1.m48501A(wzh.f52958b).getDescriptor(), sm1.m48504D(d1i.f19007b).getDescriptor());

    /* renamed from: a */
    public static final boolean m46311a(uef uefVar) {
        sq8.m48649h(uefVar, "<this>");
        return uefVar.isInline() && sq8.m48644c(uefVar, l89.m36744i());
    }

    /* renamed from: b */
    public static final boolean m46312b(uef uefVar) {
        sq8.m48649h(uefVar, "<this>");
        return uefVar.isInline() && f43118a.contains(uefVar);
    }
}
