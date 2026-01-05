package p001o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.message.TokenParser;
import p001o.xej;

/* loaded from: classes3.dex */
public abstract class zdj {

    /* renamed from: a */
    public static final mge f57040a = new mge("#([0-9]+)");

    /* renamed from: b */
    public static final mge f57041b = new mge("#x([0-9a-fA-F]+)");

    /* renamed from: c */
    public static final Map f57042c;

    static {
        Map mapM32684k = isa.m32684k(vyh.m53620a("lt", '<'), vyh.m53620a("gt", '>'), vyh.m53620a("amp", '&'), vyh.m53620a("apos", '\''), vyh.m53620a("quot", Character.valueOf(TokenParser.DQUOTE)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(mapM32684k.size()));
        for (Map.Entry entry : mapM32684k.entrySet()) {
            linkedHashMap.put(entry.getKey(), new char[]{((Character) entry.getValue()).charValue()});
        }
        f57042c = linkedHashMap;
    }

    /* renamed from: e */
    public static final hwc m59281e(Map map) {
        List listM36188y = ksa.m36188y(map);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM36188y) {
            if (m59282f((xej.C18137d) ((hwc) obj).m31229c())) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        hwc hwcVar = new hwc(arrayList, arrayList2);
        Map mapM32691r = isa.m32691r((Iterable) hwcVar.m31230d());
        Iterable<hwc> iterable = (Iterable) hwcVar.m31229c();
        ArrayList arrayList3 = new ArrayList(dh3.m23088v(iterable, 10));
        for (hwc hwcVar2 : iterable) {
            arrayList3.add(new xej.C18136c((String) hwcVar2.m31230d(), m59283g((xej.C18137d) hwcVar2.m31229c())));
        }
        return vyh.m53620a(mapM32691r, arrayList3);
    }

    /* renamed from: f */
    public static final boolean m59282f(xej.C18137d c18137d) {
        return (sq8.m48644c(c18137d.m56200a(), "xmlns") && c18137d.m56201b() == null) || sq8.m48644c(c18137d.m56201b(), "xmlns");
    }

    /* renamed from: g */
    public static final String m59283g(xej.C18137d c18137d) {
        if (sq8.m48644c(c18137d.m56200a(), "xmlns")) {
            return null;
        }
        return c18137d.m56200a();
    }
}
