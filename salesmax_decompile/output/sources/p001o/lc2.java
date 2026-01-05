package p001o;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p001o.c5e;
import p001o.l8i;
import p001o.s8i;

/* loaded from: classes3.dex */
public abstract class lc2 {

    /* renamed from: a */
    public static final Set f33592a = nif.m40668i("connection", "expect", "sec-websocket-key", "sec-websocket-protocol", "sec-websocket-version", "upgrade", "user-agent", "x-amzn-trace-id");

    /* renamed from: b */
    public static final mge f33593b = new mge(" +");

    /* renamed from: o.lc2$a */
    public static final class C15055a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return uk3.m51674d(((y66) ((Map.Entry) obj).getKey()).m57311c(), ((y66) ((Map.Entry) obj2).getKey()).m57311c());
        }
    }

    /* renamed from: o.lc2$b */
    public static final class C15056b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return uk3.m51674d(((y66) obj).m57311c(), ((y66) obj2).m57311c());
        }
    }

    /* renamed from: f */
    public static final String m36890f(hwc hwcVar) {
        return ((String) hwcVar.m31229c()) + ':' + kh3.p0((Iterable) hwcVar.m31230d(), ",", null, null, 0, null, new xk7() { // from class: o.kc2
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return lc2.m36891g((String) obj);
            }
        }, 30, null);
    }

    /* renamed from: g */
    public static final CharSequence m36891g(String str) {
        sq8.m48649h(str, "it");
        return m36897m(str);
    }

    /* renamed from: h */
    public static final String m36892h(l8i.C15036a c15036a, z81 z81Var) {
        sq8.m48649h(c15036a, "<this>");
        sq8.m48649h(z81Var, "config");
        s8i.C16783a c16783aM36767h = c15036a.m36767h();
        List listM48009f = c16783aM36767h.m48009f();
        xk7 xk7Var = z81Var.m58893n() ? new xk7() { // from class: o.ic2
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return lc2.m36893i((y66) obj);
            }
        } : new xk7() { // from class: o.jc2
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return lc2.m36894j((y66) obj);
            }
        };
        s8i.C16784b c16784b = s8i.f44985c;
        s8i.C16783a c16783a = new s8i.C16783a();
        List listM48009f2 = c16783a.m48009f();
        Iterator it = listM48009f.iterator();
        while (it.hasNext()) {
            listM48009f2.add(xk7Var.invoke(it.next()));
        }
        c16783a.m48017n(c16783aM36767h.m48010g());
        if (z81Var.m58885f()) {
            c16783a.m48011h();
        }
        return c16783a.m48004a().toString();
    }

    /* renamed from: i */
    public static final y66 m36893i(y66 y66Var) {
        sq8.m48649h(y66Var, "existing");
        return e3d.f20909h.m24251h().mo24242b(y66Var.m57311c());
    }

    /* renamed from: j */
    public static final y66 m36894j(y66 y66Var) {
        sq8.m48649h(y66Var, "it");
        return y66Var;
    }

    /* renamed from: k */
    public static final String m36895k(l8i.C15036a c15036a) {
        sq8.m48649h(c15036a, "<this>");
        c5e.C12568b c12568b = c5e.f17362c;
        c5e.C12567a c12567a = new c5e.C12567a();
        Set<Map.Entry> setEntrySet = c15036a.m36766g().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            y66 y66Var = (y66) entry.getKey();
            List list = (List) entry.getValue();
            y66 y66VarM57314f = y66Var.m57314f(e3d.f20909h.m24251h());
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((y66) it.next()).m57314f(e3d.f20909h.m24251h()));
            }
            hwc hwcVarM53620a = vyh.m53620a(y66VarM57314f, arrayList);
            linkedHashMap.put(hwcVarM53620a.m31229c(), hwcVarM53620a.m31230d());
        }
        for (Map.Entry entry2 : kh3.I0(linkedHashMap.entrySet(), new C15055a())) {
            hwc hwcVarM53620a2 = vyh.m53620a((y66) entry2.getKey(), kh3.T0(kh3.I0((List) entry2.getValue(), new C15056b())));
            c12567a.put((c5e.C12567a) hwcVarM53620a2.m31229c(), hwcVarM53620a2.m31230d());
        }
        return f9g.u0(c12567a.m20270d().toString(), "?");
    }

    /* renamed from: l */
    public static final boolean m36896l(String str, z81 z81Var) {
        Set set = f33592a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        return !set.contains(lowerCase) && ((Boolean) z81Var.m58889j().invoke(str)).booleanValue();
    }

    /* renamed from: m */
    public static final String m36897m(String str) {
        return f9g.Z0(f33593b.m38996h(str, " ")).toString();
    }
}
