package an;

import aq.C0400c;
import aq.C0408k;
import aq.C0409l;
import bn.C0711c;
import cs.C1482a;
import cv.C1517m;
import ds.AbstractC1777a;
import ds.C1780d;
import e1.C1903e;
import es.C2127d;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import fp.AbstractC2365e;
import fs.C2370a;
import g4.C2492h;
import gs.C2721g;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;
import nx.C5176n;
import og.se;
import org.bouncycastle.i18n.MessageBundle;
import q1.C6080h;
import qm.C6246b;
import qm.C6251g;
import qp.C6266c;
import rw.AbstractC6674x;
import s2.C6734c;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1174a;

    /* renamed from: b */
    public final /* synthetic */ Object f1175b;

    /* renamed from: c */
    public final /* synthetic */ Object f1176c;

    public /* synthetic */ o1(int i10, Object obj, Object obj2) {
        this.f1174a = i10;
        this.f1175b = obj;
        this.f1176c = obj2;
    }

    /* renamed from: a */
    private final Object m493a(Object obj) throws Exception {
        LocalDateTime localDateTimeM16183G;
        String str = (String) this.f1175b;
        C0711c c0711c = (C0711c) this.f1176c;
        InterfaceC4024a _connection = (InterfaceC4024a) obj;
        AbstractC4154l.m8923f(_connection, "_connection");
        InterfaceC4026c interfaceC4026cY0 = _connection.y0("\n    SELECT *, INSTR(UPPER(title), UPPER(?)) AS position\n    FROM message_template\n    WHERE UPPER(title) LIKE '%' || UPPER(?) || '%'\n    ORDER BY position ASC, TITLE ASC\n    ");
        try {
            interfaceC4026cY0.mo1776B(1, str);
            interfaceC4026cY0.mo1776B(2, str);
            int iM10916d = se.m10916d(interfaceC4026cY0, "id");
            int iM10916d2 = se.m10916d(interfaceC4026cY0, MessageBundle.TITLE_ENTRY);
            int iM10916d3 = se.m10916d(interfaceC4026cY0, "create_date_time");
            int iM10916d4 = se.m10916d(interfaceC4026cY0, "modify_date_time");
            int iM10916d5 = se.m10916d(interfaceC4026cY0, "message_template_id");
            C1903e c1903e = new C1903e(0);
            C1903e c1903e2 = new C1903e(0);
            C1903e c1903e3 = new C1903e(0);
            while (interfaceC4026cY0.r0()) {
                String strMo1777W = interfaceC4026cY0.mo1777W(iM10916d5);
                if (!c1903e.containsKey(strMo1777W)) {
                    c1903e.put(strMo1777W, new ArrayList());
                }
                String strMo1777W2 = interfaceC4026cY0.mo1777W(iM10916d5);
                if (!c1903e2.containsKey(strMo1777W2)) {
                    c1903e2.put(strMo1777W2, new ArrayList());
                }
                String strMo1777W3 = interfaceC4026cY0.mo1777W(iM10916d5);
                if (!c1903e3.containsKey(strMo1777W3)) {
                    c1903e3.put(strMo1777W3, new ArrayList());
                }
            }
            interfaceC4026cY0.reset();
            c0711c.m1994c(_connection, c1903e);
            c0711c.m1992a(_connection, c1903e2);
            c0711c.m1993b(_connection, c1903e3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC4026cY0.r0()) {
                int i10 = (int) interfaceC4026cY0.getLong(iM10916d);
                String strMo1777W4 = interfaceC4026cY0.mo1777W(iM10916d2);
                LocalDateTime localDateTimeM16183G2 = null;
                String strMo1777W5 = interfaceC4026cY0.isNull(iM10916d3) ? null : interfaceC4026cY0.mo1777W(iM10916d3);
                if (strMo1777W5 != null) {
                    C8800o c8800o = C8800o.f42459a;
                    localDateTimeM16183G = C8800o.m16183G(strMo1777W5);
                } else {
                    localDateTimeM16183G = null;
                }
                if (localDateTimeM16183G == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                }
                String strMo1777W6 = interfaceC4026cY0.isNull(iM10916d4) ? null : interfaceC4026cY0.mo1777W(iM10916d4);
                if (strMo1777W6 != null) {
                    C8800o c8800o2 = C8800o.f42459a;
                    localDateTimeM16183G2 = C8800o.m16183G(strMo1777W6);
                }
                C6246b c6246b = new C6246b(i10, strMo1777W4, localDateTimeM16183G, localDateTimeM16183G2, interfaceC4026cY0.mo1777W(iM10916d5));
                Object objM12774b = AbstractC6674x.m12774b(c1903e, interfaceC4026cY0.mo1777W(iM10916d5));
                AbstractC4154l.m8922e(objM12774b, "getValue(...)");
                Object objM12774b2 = AbstractC6674x.m12774b(c1903e2, interfaceC4026cY0.mo1777W(iM10916d5));
                AbstractC4154l.m8922e(objM12774b2, "getValue(...)");
                Object objM12774b3 = AbstractC6674x.m12774b(c1903e3, interfaceC4026cY0.mo1777W(iM10916d5));
                AbstractC4154l.m8922e(objM12774b3, "getValue(...)");
                arrayList.add(new C6251g(c6246b, (List) objM12774b, (List) objM12774b2, (List) objM12774b3));
                iM10916d = iM10916d;
            }
            interfaceC4026cY0.close();
            return arrayList;
        } catch (Throwable th2) {
            interfaceC4026cY0.close();
            throw th2;
        }
    }

    /* renamed from: b */
    private final Object m494b(Object obj) {
        C2370a c2370a = (C2370a) this.f1175b;
        InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f1176c;
        C6080h LazyColumn = (C6080h) obj;
        AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
        List list = c2370a.f10780b;
        LazyColumn.m12099p(list.size(), new C0408k(5, new C1517m(2), list), new C0409l(list, 4), new C6734c(new C1780d(0, interfaceC2139c, list), true, -632812321));
        if (c2370a.f10779a && !list.isEmpty()) {
            LazyColumn.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC1777a.f8645a);
        }
        return qw.a0.f30746a;
    }

    /* renamed from: d */
    private final Object m495d(Object obj) {
        C2721g c2721g = (C2721g) this.f1175b;
        InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f1176c;
        C2127d onNavigateToNoteScreen = (C2127d) obj;
        AbstractC4154l.m8923f(onNavigateToNoteScreen, "onNavigateToNoteScreen");
        c2721g.m6724h(new C1482a(onNavigateToNoteScreen));
        interfaceC2139c.invoke(onNavigateToNoteScreen);
        return qw.a0.f30746a;
    }

    /* renamed from: e */
    private final Object m496e(Object obj) {
        C6266c c6266c = (C6266c) this.f1175b;
        InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f1176c;
        C6080h LazyColumn = (C6080h) obj;
        AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
        List list = c6266c.f30374a;
        LazyColumn.m12099p(list.size(), new C0408k(7, new C0400c(25), list), new C0409l(list, 6), new C6734c(new bt.a0(list, c6266c, interfaceC2141e, 1), true, -1091073711));
        if (c6266c.f30385l) {
            LazyColumn.m12098n((3 & 1) != 0 ? null : "progressView", null, AbstractC2365e.f10761a);
        }
        return qw.a0.f30746a;
    }

    /* renamed from: f */
    private final Object m497f(Object obj) {
        C5176n c5176n = (C5176n) this.f1175b;
        InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f1176c;
        C4381z it = (C4381z) obj;
        AbstractC4154l.m8923f(it, "it");
        C2492h c2492h = it.f21945a;
        if (c2492h.f13620b.length() == 0 || c5176n.m10087c(c2492h.f13620b)) {
            interfaceC2139c.invoke(it);
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05ef A[Catch: all -> 0x0603, TryCatch #0 {all -> 0x0603, blocks: (B:116:0x03b5, B:118:0x0444, B:122:0x045c, B:126:0x046b, B:130:0x0477, B:134:0x048b, B:138:0x04a1, B:142:0x04b0, B:146:0x04bf, B:150:0x04ce, B:154:0x04da, B:159:0x04e8, B:161:0x04f3, B:166:0x0501, B:168:0x050c, B:173:0x051a, B:176:0x0528, B:181:0x0536, B:184:0x0544, B:189:0x0560, B:194:0x057b, B:197:0x0586, B:202:0x059c, B:228:0x05e7, B:232:0x05f4, B:231:0x05ef, B:224:0x05da, B:226:0x05e1, B:219:0x05cd, B:221:0x05d4, B:214:0x05c0, B:216:0x05c7, B:208:0x05b0, B:210:0x05b7, B:205:0x05a4, B:201:0x0592, B:235:0x0605, B:236:0x060c, B:192:0x0575, B:188:0x055a, B:179:0x0530, B:171:0x0514, B:164:0x04fb, B:157:0x04e2, B:149:0x04c8, B:145:0x04b9, B:141:0x04aa, B:137:0x0494, B:133:0x0480, B:125:0x0465, B:121:0x0456), top: B:359:0x03b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0846 A[Catch: all -> 0x0734, TryCatch #1 {all -> 0x0734, blocks: (B:243:0x062d, B:244:0x06ad, B:246:0x06b3, B:251:0x06ca, B:253:0x06db, B:255:0x06f5, B:257:0x070e, B:258:0x0711, B:259:0x0718, B:264:0x072b, B:269:0x073a, B:274:0x074c, B:279:0x075e, B:283:0x076d, B:288:0x0781, B:292:0x07a0, B:296:0x07ac, B:301:0x07ba, B:303:0x07c5, B:307:0x07d8, B:334:0x083e, B:339:0x084c, B:342:0x0859, B:347:0x086b, B:352:0x0881, B:351:0x0876, B:346:0x0864, B:353:0x08a4, B:354:0x08ab, B:337:0x0846, B:330:0x0830, B:332:0x0837, B:324:0x081f, B:326:0x0826, B:319:0x0811, B:321:0x0818, B:313:0x07fe, B:315:0x0805, B:310:0x07ed, B:306:0x07d2, B:299:0x07b4, B:291:0x0792, B:287:0x077a, B:282:0x0767, B:278:0x0757, B:273:0x0745, B:262:0x0725, B:249:0x06c4), top: B:360:0x062d }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x084c A[Catch: all -> 0x0734, TryCatch #1 {all -> 0x0734, blocks: (B:243:0x062d, B:244:0x06ad, B:246:0x06b3, B:251:0x06ca, B:253:0x06db, B:255:0x06f5, B:257:0x070e, B:258:0x0711, B:259:0x0718, B:264:0x072b, B:269:0x073a, B:274:0x074c, B:279:0x075e, B:283:0x076d, B:288:0x0781, B:292:0x07a0, B:296:0x07ac, B:301:0x07ba, B:303:0x07c5, B:307:0x07d8, B:334:0x083e, B:339:0x084c, B:342:0x0859, B:347:0x086b, B:352:0x0881, B:351:0x0876, B:346:0x0864, B:353:0x08a4, B:354:0x08ab, B:337:0x0846, B:330:0x0830, B:332:0x0837, B:324:0x081f, B:326:0x0826, B:319:0x0811, B:321:0x0818, B:313:0x07fe, B:315:0x0805, B:310:0x07ed, B:306:0x07d2, B:299:0x07b4, B:291:0x0792, B:287:0x077a, B:282:0x0767, B:278:0x0757, B:273:0x0745, B:262:0x0725, B:249:0x06c4), top: B:360:0x062d }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0859 A[Catch: all -> 0x0734, TryCatch #1 {all -> 0x0734, blocks: (B:243:0x062d, B:244:0x06ad, B:246:0x06b3, B:251:0x06ca, B:253:0x06db, B:255:0x06f5, B:257:0x070e, B:258:0x0711, B:259:0x0718, B:264:0x072b, B:269:0x073a, B:274:0x074c, B:279:0x075e, B:283:0x076d, B:288:0x0781, B:292:0x07a0, B:296:0x07ac, B:301:0x07ba, B:303:0x07c5, B:307:0x07d8, B:334:0x083e, B:339:0x084c, B:342:0x0859, B:347:0x086b, B:352:0x0881, B:351:0x0876, B:346:0x0864, B:353:0x08a4, B:354:0x08ab, B:337:0x0846, B:330:0x0830, B:332:0x0837, B:324:0x081f, B:326:0x0826, B:319:0x0811, B:321:0x0818, B:313:0x07fe, B:315:0x0805, B:310:0x07ed, B:306:0x07d2, B:299:0x07b4, B:291:0x0792, B:287:0x077a, B:282:0x0767, B:278:0x0757, B:273:0x0745, B:262:0x0725, B:249:0x06c4), top: B:360:0x062d }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x08a4 A[SYNTHETIC] */
    @Override // ex.InterfaceC2139c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r55) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 2290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an.o1.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ o1(h3 h3Var, String str) {
        this.f1174a = 1;
        this.f1176c = str;
        this.f1175b = h3Var;
    }
}
