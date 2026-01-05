package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.cc;

/* loaded from: classes2.dex */
public abstract class tg3 {

    /* renamed from: o.tg3$a */
    public static final class C17079a extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C17079a f47008a = new C17079a();

        public C17079a() {
            super(0);
        }

        @Override // p001o.uk7
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public static final boolean m49825a(List list) {
        List listM21246k;
        long jM48060s;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listM21246k = ch3.m21246k();
        } else {
            listM21246k = new ArrayList();
            Object obj = list.get(0);
            int iM21248m = ch3.m21248m(list);
            int i = 0;
            while (i < iM21248m) {
                i++;
                Object obj2 = list.get(i);
                pcf pcfVar = (pcf) obj2;
                pcf pcfVar2 = (pcf) obj;
                listM21246k.add(s9c.m48045d(v9c.m52474a(Math.abs(s9c.m48052k(pcfVar2.m43356h().m38943d()) - s9c.m48052k(pcfVar.m43356h().m38943d())), Math.abs(s9c.m48053l(pcfVar2.m43356h().m38943d()) - s9c.m48053l(pcfVar.m43356h().m38943d())))));
                obj = obj2;
            }
        }
        if (listM21246k.size() == 1) {
            jM48060s = ((s9c) kh3.f0(listM21246k)).m48060s();
        } else {
            if (listM21246k.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objF0 = kh3.f0(listM21246k);
            int iM21248m2 = ch3.m21248m(listM21246k);
            if (1 <= iM21248m2) {
                int i2 = 1;
                while (true) {
                    objF0 = s9c.m48045d(s9c.m48057p(((s9c) objF0).m48060s(), ((s9c) listM21246k.get(i2)).m48060s()));
                    if (i2 == iM21248m2) {
                        break;
                    }
                    i2++;
                }
            }
            jM48060s = ((s9c) objF0).m48060s();
        }
        return s9c.m48047f(jM48060s) < s9c.m48046e(jM48060s);
    }

    /* renamed from: b */
    public static final void m49826b(pcf pcfVar, cc ccVar) {
        sq8.m48649h(pcfVar, "node");
        sq8.m48649h(ccVar, "info");
        kcf kcfVarM43360l = pcfVar.m43360l();
        tcf tcfVar = tcf.f46841a;
        tq.m50332a(lcf.m36963a(kcfVarM43360l, tcfVar.m49714a()));
        ArrayList arrayList = new ArrayList();
        if (lcf.m36963a(pcfVar.m43360l(), tcfVar.m49731r()) != null) {
            List listM43366r = pcfVar.m43366r();
            int size = listM43366r.size();
            for (int i = 0; i < size; i++) {
                pcf pcfVar2 = (pcf) listM43366r.get(i);
                if (pcfVar2.m43360l().m35414e(tcf.f46841a.m49732s())) {
                    arrayList.add(pcfVar2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean zM49825a = m49825a(arrayList);
            ccVar.q0(cc.C12628e.m20831b(zM49825a ? 1 : arrayList.size(), zM49825a ? arrayList.size() : 1, false, 0));
        }
    }

    /* renamed from: c */
    public static final void m49827c(pcf pcfVar, cc ccVar) {
        sq8.m48649h(pcfVar, "node");
        sq8.m48649h(ccVar, "info");
        kcf kcfVarM43360l = pcfVar.m43360l();
        tcf tcfVar = tcf.f46841a;
        tq.m50332a(lcf.m36963a(kcfVarM43360l, tcfVar.m49715b()));
        pcf pcfVarM43364p = pcfVar.m43364p();
        if (pcfVarM43364p == null || lcf.m36963a(pcfVarM43364p.m43360l(), tcfVar.m49731r()) == null) {
            return;
        }
        tq.m50332a(lcf.m36963a(pcfVarM43364p.m43360l(), tcfVar.m49714a()));
        if (pcfVar.m43360l().m35414e(tcfVar.m49732s())) {
            ArrayList arrayList = new ArrayList();
            List listM43366r = pcfVarM43364p.m43366r();
            int size = listM43366r.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                pcf pcfVar2 = (pcf) listM43366r.get(i2);
                if (pcfVar2.m43360l().m35414e(tcf.f46841a.m49732s())) {
                    arrayList.add(pcfVar2);
                    if (pcfVar2.m43363o().m59432Y() < pcfVar.m43363o().m59432Y()) {
                        i++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean zM49825a = m49825a(arrayList);
                cc.C12629f c12629fM20832a = cc.C12629f.m20832a(zM49825a ? 0 : i, 1, zM49825a ? i : 0, 1, false, ((Boolean) pcfVar.m43360l().m35417o(tcf.f46841a.m49732s(), C17079a.f47008a)).booleanValue());
                if (c12629fM20832a != null) {
                    ccVar.r0(c12629fM20832a);
                }
            }
        }
    }
}
