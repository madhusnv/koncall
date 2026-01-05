package p001o;

import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import p001o.lb7;
import p001o.nh0;
import p001o.qgh;

/* loaded from: classes2.dex */
public abstract class ed0 {
    /* renamed from: a */
    public static final void m24780a(SpannableString spannableString, wzf wzfVar, int i, int i2, zl5 zl5Var, lb7.InterfaceC15049a interfaceC15049a) {
        zzf.m60159b(spannableString, wzfVar.m55496g(), i, i2);
        zzf.m60160c(spannableString, wzfVar.m55499j(), zl5Var, i, i2);
        if (wzfVar.m55502m() == null) {
            wzfVar.m55500k();
        } else {
            ac7 ac7VarM55502m = wzfVar.m55502m();
            if (ac7VarM55502m == null) {
                ac7VarM55502m = ac7.f14477b.m16853a();
            }
            wzfVar.m55500k();
            spannableString.setSpan(new StyleSpan(me0.m38808c(ac7VarM55502m, yb7.f55185a.m57463b())), i, i2, 33);
        }
        wzfVar.m55497h();
        if (wzfVar.m55506q() != null) {
            qgh qghVarM55506q = wzfVar.m55506q();
            qgh.C16401a c16401a = qgh.f41974b;
            if (qghVarM55506q.m45444c(c16401a.m45447b())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (wzfVar.m55506q().m45444c(c16401a.m45446a())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (wzfVar.m55507r() != null) {
            spannableString.setSpan(new ScaleXSpan(wzfVar.m55507r().m32157a()), i, i2, 33);
        }
        zzf.m60161d(spannableString, wzfVar.m55504o(), i, i2);
        zzf.m60158a(spannableString, wzfVar.m55493d(), i, i2);
    }

    /* renamed from: b */
    public static final SpannableString m24781b(nh0 nh0Var, zl5 zl5Var, lb7.InterfaceC15049a interfaceC15049a, c1i c1iVar) {
        sq8.m48649h(nh0Var, "<this>");
        sq8.m48649h(zl5Var, "density");
        sq8.m48649h(interfaceC15049a, "fontFamilyResolver");
        sq8.m48649h(c1iVar, "urlSpanCache");
        SpannableString spannableString = new SpannableString(nh0Var.m40556g());
        List listM40555f = nh0Var.m40555f();
        if (listM40555f != null) {
            int size = listM40555f.size();
            for (int i = 0; i < size; i++) {
                nh0.C15582a c15582a = (nh0.C15582a) listM40555f.get(i);
                m24780a(spannableString, wzf.m55490b((wzf) c15582a.m40561a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), c15582a.m40562b(), c15582a.m40563c(), zl5Var, interfaceC15049a);
            }
        }
        List listM40557h = nh0Var.m40557h(0, nh0Var.length());
        int size2 = listM40557h.size();
        for (int i2 = 0; i2 < size2; i2++) {
            nh0.C15582a c15582a2 = (nh0.C15582a) listM40557h.get(i2);
            spannableString.setSpan(qyh.m45984a((pyh) c15582a2.m40561a()), c15582a2.m40562b(), c15582a2.m40563c(), 33);
        }
        List listM40558i = nh0Var.m40558i(0, nh0Var.length());
        int size3 = listM40558i.size();
        for (int i3 = 0; i3 < size3; i3++) {
            nh0.C15582a c15582a3 = (nh0.C15582a) listM40558i.get(i3);
            spannableString.setSpan(c1iVar.m20089a((n8i) c15582a3.m40561a()), c15582a3.m40562b(), c15582a3.m40563c(), 33);
        }
        return spannableString;
    }
}
