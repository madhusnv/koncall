package an;

import android.content.Context;
import android.net.Uri;
import aq.C0409l;
import com.websoptimization.callyzerbiz.R;
import d7.AbstractC1646r;
import d7.EnumC1645q;
import d7.InterfaceC1648t;
import d7.InterfaceC1649u;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import g1.C2426f;
import g2.ja;
import hq.C3012q;
import i1.C3135n;
import java.util.ArrayList;
import java.util.List;
import kn.C4121a;
import kn.C4122b;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import mm.C4791b;
import n7.C4970o;
import nx.AbstractC5178p;
import or.C5454q;
import ou.C5749f;
import ov.C5757h;
import p7.C5836g;
import q1.C6080h;
import qr.AbstractC6297u;
import qr.C6281e;
import qr.C6286j;
import qr.C6294r;
import qw.C6361k;
import s2.C6734c;
import sq.C6908y;
import u2.C7320q;
import ur.AbstractC7524q;
import ur.C7514g;
import ur.C7530w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1490a;

    /* renamed from: b */
    public final /* synthetic */ Object f1491b;

    /* renamed from: c */
    public final /* synthetic */ Object f1492c;

    /* renamed from: d */
    public final /* synthetic */ Object f1493d;

    public /* synthetic */ w1(int i10, Object obj, Object obj2, Object obj3) {
        this.f1490a = i10;
        this.f1491b = obj;
        this.f1492c = obj2;
        this.f1493d = obj3;
    }

    /* renamed from: a */
    private final Object m534a(Object obj) {
        InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f1491b;
        C5454q c5454q = (C5454q) this.f1492c;
        InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f1493d;
        ((Boolean) obj).booleanValue();
        interfaceC2139c.invoke(c5454q);
        interfaceC2137a.invoke();
        return qw.a0.f30746a;
    }

    /* renamed from: b */
    private final Object m535b(Object obj) {
        C5749f c5749f = (C5749f) this.f1491b;
        Context context = (Context) this.f1492c;
        InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f1493d;
        C6080h LazyColumn = (C6080h) obj;
        AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
        List list = c5749f.f28306a;
        LazyColumn.m12099p(list.size(), null, new C0409l(list, 16), new C6734c(new bt.a0(list, context, interfaceC2139c, 3), true, -632812321));
        return qw.a0.f30746a;
    }

    /* renamed from: d */
    private final Object m536d(Object obj) {
        List list = (List) this.f1491b;
        C5757h c5757h = (C5757h) this.f1492c;
        k2.w0 w0Var = (k2.w0) this.f1493d;
        C6080h LazyColumn = (C6080h) obj;
        AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
        LazyColumn.m12099p(list.size(), null, new C0409l(list, 18), new C6734c(new bt.a0(list, c5757h, w0Var, 4), true, -1091073711));
        return qw.a0.f30746a;
    }

    /* renamed from: e */
    private final Object m537e(Object obj) {
        C7320q c7320q = (C7320q) this.f1491b;
        C4409i c4409i = (C4409i) this.f1492c;
        C4970o c4970o = (C4970o) this.f1493d;
        c7320q.add(c4409i);
        return new C2426f(c4970o, c4409i, c7320q);
    }

    /* renamed from: f */
    private final Object m538f(Object obj) {
        C5836g c5836g = (C5836g) this.f1491b;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f1492c;
        C4409i c4409i = (C4409i) this.f1493d;
        InterfaceC1649u interfaceC1649u = (InterfaceC1649u) obj;
        ArrayList arrayList = c5836g.f28534g;
        boolean z6 = false;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj2 = arrayList.get(i10);
                i10++;
                if (AbstractC4154l.m8918a(((C6361k) obj2).f30755a, j0Var.getTag())) {
                    z6 = true;
                    break;
                }
            }
        }
        if (interfaceC1649u != null && !z6) {
            AbstractC1646r lifecycle = j0Var.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.mo5344b().isAtLeast(EnumC1645q.CREATED)) {
                lifecycle.mo5343a((InterfaceC1648t) c5836g.f28536i.invoke(c4409i));
            }
        }
        return qw.a0.f30746a;
    }

    /* renamed from: g */
    private final Object m539g(Object obj) {
        ArrayList arrayList = (ArrayList) this.f1491b;
        C7530w c7530w = (C7530w) this.f1492c;
        InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f1493d;
        C6080h LazyColumn = (C6080h) obj;
        AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
        LazyColumn.m12099p(arrayList.size(), new C3135n(26, new C3012q(29), arrayList), new b2.o0(2, arrayList), new C6734c(new C6281e(arrayList, c7530w, interfaceC2139c, arrayList, 1), true, -1091073711));
        return qw.a0.f30746a;
    }

    /* renamed from: h */
    private final Object m540h(Object obj) {
        List list = (List) this.f1491b;
        C7530w c7530w = (C7530w) this.f1492c;
        InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f1493d;
        C6080h LazyColumn = (C6080h) obj;
        AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
        LazyColumn.m12099p(list.size(), new C3135n(25, new C3012q(28), list), new C0409l(list, 24), new C6734c(new C6281e(list, c7530w, interfaceC2139c, list, 0), true, -1091073711));
        return qw.a0.f30746a;
    }

    /* renamed from: i */
    private final Object m541i(Object obj) {
        AbstractC6297u abstractC6297u = (AbstractC6297u) this.f1491b;
        k2.w0 w0Var = (k2.w0) this.f1492c;
        AbstractC7524q abstractC7524q = (AbstractC7524q) this.f1493d;
        int iIntValue = ((Integer) obj).intValue();
        C6294r c6294r = (C6294r) abstractC6297u;
        if (((ur.f0) c6294r.f30591d.f36269a.get(iIntValue)).f36215a == R.string.custom) {
            w0Var.setValue(Boolean.TRUE);
        } else {
            abstractC7524q.mo2033e(new C7514g(iIntValue, c6294r.f30598k));
        }
        return qw.a0.f30746a;
    }

    /* renamed from: j */
    private final Object m542j(Object obj) {
        ArrayList arrayList = (ArrayList) this.f1491b;
        C7320q c7320q = (C7320q) this.f1492c;
        InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f1493d;
        C6080h LazyColumn = (C6080h) obj;
        AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
        LazyColumn.m12099p(arrayList.size(), new C3135n(27, new C6286j(3), arrayList), new b2.o0(3, arrayList), new C6734c(new C6281e(arrayList, c7320q, interfaceC2139c, arrayList), true, -1091073711));
        return qw.a0.f30746a;
    }

    /* renamed from: k */
    private final Object m543k(Object obj) {
        C4791b c4791b = (C4791b) this.f1491b;
        List list = (List) this.f1492c;
        List list2 = (List) this.f1493d;
        C4122b doc = (C4122b) obj;
        AbstractC4154l.m8923f(doc, "doc");
        Uri uri = doc.f21063a;
        c4791b.f23837f = uri.toString();
        list.add(new C4121a(c4791b, uri, null, null, uri.toString(), null, 0L, 4076));
        list2.remove(doc);
        return qw.a0.f30746a;
    }

    /* renamed from: l */
    private final Object m544l(Object obj) {
        ja jaVar = (ja) this.f1491b;
        InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f1492c;
        InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) this.f1493d;
        if (!jaVar.m6181c()) {
            if (interfaceC2137a != null) {
                interfaceC2137a.invoke();
            } else {
                interfaceC2137a2.invoke();
            }
        }
        return qw.a0.f30746a;
    }

    /* renamed from: m */
    private final Object m545m(Object obj) {
        List list = (List) this.f1491b;
        InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f1492c;
        InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) this.f1493d;
        C6080h LazyColumn = (C6080h) obj;
        AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
        LazyColumn.m12099p(list.size(), null, new C6908y(list, 3), new C6734c(new bt.a0(list, interfaceC2139c, interfaceC2139c2, 8), true, -632812321));
        return qw.a0.f30746a;
    }

    /* renamed from: n */
    private final Object m546n(Object obj) {
        C7320q c7320q = (C7320q) this.f1491b;
        ArrayList arrayList = (ArrayList) this.f1492c;
        k2.w0 w0Var = (k2.w0) this.f1493d;
        String it = (String) obj;
        AbstractC4154l.m8923f(it, "it");
        w0Var.setValue(it);
        c7320q.clear();
        if (it.length() > 0) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                if (AbstractC5178p.m10116x((String) obj2, (String) w0Var.getValue(), true)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        c7320q.addAll(arrayList);
        return qw.a0.f30746a;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06af A[Catch: all -> 0x04ac, TryCatch #3 {all -> 0x04ac, blocks: (B:153:0x048e, B:154:0x0493, B:156:0x0499, B:159:0x04af, B:160:0x0534, B:162:0x053a, B:167:0x0551, B:170:0x055f, B:172:0x0578, B:174:0x0590, B:175:0x0593, B:176:0x059a, B:181:0x05ad, B:183:0x05b6, B:187:0x05c5, B:191:0x05d4, B:195:0x05e3, B:199:0x05f2, B:203:0x0601, B:207:0x060d, B:212:0x061b, B:215:0x0629, B:220:0x0641, B:246:0x06a7, B:251:0x06b5, B:254:0x06c2, B:259:0x06d6, B:264:0x06ec, B:263:0x06e1, B:258:0x06cf, B:265:0x071f, B:266:0x0726, B:249:0x06af, B:242:0x069b, B:244:0x06a2, B:237:0x068e, B:239:0x0695, B:232:0x0681, B:234:0x0688, B:226:0x0670, B:228:0x0679, B:223:0x065e, B:219:0x063a, B:210:0x0615, B:202:0x05fb, B:198:0x05ec, B:194:0x05dd, B:190:0x05ce, B:186:0x05bf, B:179:0x05a7, B:165:0x054b), top: B:341:0x048e }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06b5 A[Catch: all -> 0x04ac, TryCatch #3 {all -> 0x04ac, blocks: (B:153:0x048e, B:154:0x0493, B:156:0x0499, B:159:0x04af, B:160:0x0534, B:162:0x053a, B:167:0x0551, B:170:0x055f, B:172:0x0578, B:174:0x0590, B:175:0x0593, B:176:0x059a, B:181:0x05ad, B:183:0x05b6, B:187:0x05c5, B:191:0x05d4, B:195:0x05e3, B:199:0x05f2, B:203:0x0601, B:207:0x060d, B:212:0x061b, B:215:0x0629, B:220:0x0641, B:246:0x06a7, B:251:0x06b5, B:254:0x06c2, B:259:0x06d6, B:264:0x06ec, B:263:0x06e1, B:258:0x06cf, B:265:0x071f, B:266:0x0726, B:249:0x06af, B:242:0x069b, B:244:0x06a2, B:237:0x068e, B:239:0x0695, B:232:0x0681, B:234:0x0688, B:226:0x0670, B:228:0x0679, B:223:0x065e, B:219:0x063a, B:210:0x0615, B:202:0x05fb, B:198:0x05ec, B:194:0x05dd, B:190:0x05ce, B:186:0x05bf, B:179:0x05a7, B:165:0x054b), top: B:341:0x048e }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06c2 A[Catch: all -> 0x04ac, TryCatch #3 {all -> 0x04ac, blocks: (B:153:0x048e, B:154:0x0493, B:156:0x0499, B:159:0x04af, B:160:0x0534, B:162:0x053a, B:167:0x0551, B:170:0x055f, B:172:0x0578, B:174:0x0590, B:175:0x0593, B:176:0x059a, B:181:0x05ad, B:183:0x05b6, B:187:0x05c5, B:191:0x05d4, B:195:0x05e3, B:199:0x05f2, B:203:0x0601, B:207:0x060d, B:212:0x061b, B:215:0x0629, B:220:0x0641, B:246:0x06a7, B:251:0x06b5, B:254:0x06c2, B:259:0x06d6, B:264:0x06ec, B:263:0x06e1, B:258:0x06cf, B:265:0x071f, B:266:0x0726, B:249:0x06af, B:242:0x069b, B:244:0x06a2, B:237:0x068e, B:239:0x0695, B:232:0x0681, B:234:0x0688, B:226:0x0670, B:228:0x0679, B:223:0x065e, B:219:0x063a, B:210:0x0615, B:202:0x05fb, B:198:0x05ec, B:194:0x05dd, B:190:0x05ce, B:186:0x05bf, B:179:0x05a7, B:165:0x054b), top: B:341:0x048e }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07d1 A[Catch: all -> 0x075c, TryCatch #2 {all -> 0x075c, blocks: (B:272:0x0744, B:274:0x074d, B:277:0x0757, B:281:0x0763, B:283:0x0769, B:288:0x0781, B:315:0x07d1, B:320:0x07e4, B:323:0x07f1, B:327:0x080f, B:328:0x0825, B:329:0x082a, B:318:0x07de, B:330:0x082b, B:331:0x0832, B:310:0x07c1, B:312:0x07c8, B:305:0x07b3, B:307:0x07ba, B:300:0x07a6, B:302:0x07ad, B:294:0x0796, B:296:0x079d, B:291:0x0789, B:287:0x077a, B:280:0x075f), top: B:340:0x0744 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x082b A[Catch: all -> 0x075c, TryCatch #2 {all -> 0x075c, blocks: (B:272:0x0744, B:274:0x074d, B:277:0x0757, B:281:0x0763, B:283:0x0769, B:288:0x0781, B:315:0x07d1, B:320:0x07e4, B:323:0x07f1, B:327:0x080f, B:328:0x0825, B:329:0x082a, B:318:0x07de, B:330:0x082b, B:331:0x0832, B:310:0x07c1, B:312:0x07c8, B:305:0x07b3, B:307:0x07ba, B:300:0x07a6, B:302:0x07ad, B:294:0x0796, B:296:0x079d, B:291:0x0789, B:287:0x077a, B:280:0x075f), top: B:340:0x0744 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x071f A[SYNTHETIC] */
    @Override // ex.InterfaceC2139c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r56) {
        /*
            Method dump skipped, instructions count: 2170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an.w1.invoke(java.lang.Object):java.lang.Object");
    }
}
