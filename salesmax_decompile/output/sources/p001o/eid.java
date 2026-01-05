package p001o;

import com.apollographql.apollo.api.ResponseField;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class eid {

    /* renamed from: a */
    public static final Map f21744a = isa.m32684k(vyh.m53620a(kge.m35689b(String.class), sm1.m48531z(h8g.f26398a)), vyh.m53620a(kge.m35689b(Character.TYPE), sm1.m48524s(eh2.f21610a)), vyh.m53620a(kge.m35689b(char[].class), sm1.m48508c()), vyh.m53620a(kge.m35689b(Double.TYPE), sm1.m48525t(fx5.f24237a)), vyh.m53620a(kge.m35689b(double[].class), sm1.m48509d()), vyh.m53620a(kge.m35689b(Float.TYPE), sm1.m48527v(e37.f20857a)), vyh.m53620a(kge.m35689b(float[].class), sm1.m48510e()), vyh.m53620a(kge.m35689b(Long.TYPE), sm1.m48529x(hla.f27108a)), vyh.m53620a(kge.m35689b(long[].class), sm1.m48513h()), vyh.m53620a(kge.m35689b(p0i.class), sm1.m48503C(p0i.f39160b)), vyh.m53620a(kge.m35689b(q0i.class), sm1.m48519n()), vyh.m53620a(kge.m35689b(Integer.TYPE), sm1.m48528w(cl8.f18292a)), vyh.m53620a(kge.m35689b(int[].class), sm1.m48511f()), vyh.m53620a(kge.m35689b(j0i.class), sm1.m48502B(j0i.f29524b)), vyh.m53620a(kge.m35689b(l0i.class), sm1.m48518m()), vyh.m53620a(kge.m35689b(Short.TYPE), sm1.m48530y(wpf.f52456a)), vyh.m53620a(kge.m35689b(short[].class), sm1.m48516k()), vyh.m53620a(kge.m35689b(d1i.class), sm1.m48504D(d1i.f19007b)), vyh.m53620a(kge.m35689b(e1i.class), sm1.m48520o()), vyh.m53620a(kge.m35689b(Byte.TYPE), sm1.m48523r(gq1.f25657a)), vyh.m53620a(kge.m35689b(byte[].class), sm1.m48507b()), vyh.m53620a(kge.m35689b(wzh.class), sm1.m48501A(wzh.f52958b)), vyh.m53620a(kge.m35689b(xzh.class), sm1.m48517l()), vyh.m53620a(kge.m35689b(Boolean.TYPE), sm1.m48522q(gk1.f25372a)), vyh.m53620a(kge.m35689b(boolean[].class), sm1.m48506a()), vyh.m53620a(kge.m35689b(y3i.class), sm1.m48505E(y3i.f54824a)), vyh.m53620a(kge.m35689b(Void.class), sm1.m48515j()), vyh.m53620a(kge.m35689b(k16.class), sm1.m48526u(k16.f31358b)));

    /* renamed from: a */
    public static final uef m25119a(String str, vhd vhdVar) {
        sq8.m48649h(str, "serialName");
        sq8.m48649h(vhdVar, ResponseField.VARIABLE_IDENTIFIER_KEY);
        m25122d(str);
        return new yhd(str, vhdVar);
    }

    /* renamed from: b */
    public static final dc9 m25120b(ob9 ob9Var) {
        sq8.m48649h(ob9Var, "<this>");
        return (dc9) f21744a.get(ob9Var);
    }

    /* renamed from: c */
    public static final String m25121c(String str) {
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? qh2.m45488i(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        sq8.m48648g(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    /* renamed from: d */
    public static final void m25122d(String str) {
        Iterator it = f21744a.keySet().iterator();
        while (it.hasNext()) {
            String strMo26337d = ((ob9) it.next()).mo26337d();
            sq8.m48646e(strMo26337d);
            String strM25121c = m25121c(strMo26337d);
            if (e9g.m24606x(str, "kotlin." + strM25121c, true) || e9g.m24606x(str, strM25121c, true)) {
                throw new IllegalArgumentException(x8g.m55850f("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + m25121c(strM25121c) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
