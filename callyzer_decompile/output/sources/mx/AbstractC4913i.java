package mx;

import bx.C0797g;
import bx.C0799i;
import ex.InterfaceC2139c;
import hq.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5179q;
import og.h1;
import og.pe;
import qc.C6158d;
import rw.C6668r;

/* renamed from: mx.i */
/* loaded from: classes3.dex */
public abstract class AbstractC4913i extends h1 {
    /* renamed from: b */
    public static InterfaceC4911g m9806b(Iterator it) {
        AbstractC4154l.m8923f(it, "<this>");
        return new C4905a(new C4914j(1, it));
    }

    /* renamed from: c */
    public static C4910f m9807c(C4914j c4914j, InterfaceC2139c interfaceC2139c) {
        return new C4910f(c4914j, true, interfaceC2139c);
    }

    /* renamed from: d */
    public static Object m9808d(C4910f c4910f) {
        C0797g c0797g = new C0797g(c4910f);
        if (c0797g.hasNext()) {
            return c0797g.next();
        }
        return null;
    }

    /* renamed from: e */
    public static InterfaceC4911g m9809e(InterfaceC2139c interfaceC2139c, Object obj) {
        if (obj == null) {
            return C4909e.f24446a;
        }
        return new C0799i(1, new C6158d(9, obj), interfaceC2139c);
    }

    /* renamed from: f */
    public static String m9810f(InterfaceC4911g interfaceC4911g, String str, String str2, InterfaceC2139c interfaceC2139c, int i10) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 32) != 0) {
            interfaceC2139c = null;
        }
        AbstractC4154l.m8923f(interfaceC4911g, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i11 = 0;
        for (Object obj : interfaceC4911g) {
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str);
            }
            AbstractC5179q.m10119a(sb2, obj, interfaceC2139c);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    /* renamed from: g */
    public static C4915k m9811g(InterfaceC4911g interfaceC4911g, InterfaceC2139c interfaceC2139c) {
        AbstractC4154l.m8923f(interfaceC4911g, "<this>");
        return new C4915k(interfaceC4911g, interfaceC2139c, 1);
    }

    /* renamed from: h */
    public static C4910f m9812h(InterfaceC4911g interfaceC4911g, InterfaceC2139c interfaceC2139c) {
        return new C4910f(new C4915k(interfaceC4911g, interfaceC2139c, 1), false, new d0(20));
    }

    /* renamed from: i */
    public static List m9813i(InterfaceC4911g interfaceC4911g) {
        Iterator it = interfaceC4911g.iterator();
        if (!it.hasNext()) {
            return C6668r.f31943a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return pe.m10833h(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
