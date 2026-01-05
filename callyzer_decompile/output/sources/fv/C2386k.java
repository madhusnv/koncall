package fv;

import android.content.Context;
import av.EnumC0460c;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.data.model.response.LeadNoteSaveResponse;
import com.websoptimization.callyzerbiz.data.model.response.LeadVerifiedNumberResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import d7.w0;
import dr.C1770t;
import ev.C2136a;
import g2.f4;
import g2.h4;
import im.f1;
import im.x0;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4800k;
import no.C5122i;
import om.C5414p;
import pg.o6;
import pg.t6;
import qn.C6263l;
import qw.C6361k;
import qw.a0;
import rw.C6668r;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import wj.C8090p;
import wo.C8134s;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.c1;
import wx.m1;
import yk.C8687a;
import yv.C8789d;
import yv.C8800o;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fv.k */
/* loaded from: classes3.dex */
public final class C2386k extends w0 {

    /* renamed from: b */
    public final Context f10851b;

    /* renamed from: c */
    public final C5122i f10852c;

    /* renamed from: d */
    public final C8090p f10853d;

    /* renamed from: e */
    public final C6263l f10854e;

    /* renamed from: f */
    public final C8687a f10855f;

    /* renamed from: g */
    public final Context f10856g;

    /* renamed from: h */
    public final C8805t f10857h;

    /* renamed from: i */
    public final C8803r f10858i;

    /* renamed from: j */
    public final Integer f10859j;

    /* renamed from: k */
    public final C8810d f10860k;

    /* renamed from: l */
    public final String f10861l;

    /* renamed from: m */
    public final LastCallDetails f10862m;

    /* renamed from: n */
    public final boolean f10863n;

    /* renamed from: o */
    public final C8134s f10864o;

    /* renamed from: p */
    public final C7806h f10865p;

    /* renamed from: q */
    public final C8203d f10866q;

    /* renamed from: r */
    public final m1 f10867r;

    /* renamed from: s */
    public final wx.w0 f10868s;

    /* renamed from: t */
    public final m1 f10869t;

    /* renamed from: u */
    public C4800k f10870u;

    /* renamed from: v */
    public LocalDateTime f10871v;

    public C2386k(Context context, C5122i noteUseCase, C8090p c8090p, C6263l c6263l, C8687a c8687a, Context context2, C8805t c8805t, C8803r networkState, Integer num, C8810d c8810d, String str, LastCallDetails lastCallDetails, boolean z6, C8134s c8134s) {
        AbstractC4154l.m8923f(noteUseCase, "noteUseCase");
        AbstractC4154l.m8923f(networkState, "networkState");
        this.f10851b = context;
        this.f10852c = noteUseCase;
        this.f10853d = c8090p;
        this.f10854e = c6263l;
        this.f10855f = c8687a;
        this.f10856g = context2;
        this.f10857h = c8805t;
        this.f10858i = networkState;
        this.f10859j = num;
        this.f10860k = c8810d;
        this.f10861l = str;
        this.f10862m = lastCallDetails;
        this.f10863n = z6;
        this.f10864o = c8134s;
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f10865p = c7806hM11805a;
        this.f10866q = c1.m15389t(c7806hM11805a);
        Locale locale = Locale.getDefault();
        AbstractC4154l.m8922e(locale, "getDefault(...)");
        h4 h4VarM6144d = f4.m6144d(locale, null, null, 62);
        ArrayList arrayList = new ArrayList();
        EnumC0460c enumC0460c = EnumC0460c.NotProcessed;
        C6361k c6361k = new C6361k("", Boolean.FALSE);
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new C2136a(null, c6668r, c6668r, "", false, false, "", "", null, null, false, false, false, "", c6668r, 0, true, false, null, null, h4VarM6144d, arrayList, enumC0460c, c6361k));
        this.f10867r = m1VarM15372c;
        this.f10868s = new wx.w0(m1VarM15372c);
        this.f10869t = c1.m15372c("");
        c0.m13502y(c8810d, null, null, new C2376a(this, interfaceC7559c, 0), 3);
        c0.m13502y(c8810d, null, null, new C2376a(this, interfaceC7559c, 1), 3);
        c0.m13502y(c8810d, null, null, new C2377b(this, interfaceC7559c, 0), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r34v0, types: [fv.k] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6060e(fv.C2386k r34, ww.AbstractC8193c r35) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fv.C2386k.m6060e(fv.k, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6061f(fv.C2386k r30, ww.AbstractC8193c r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fv.C2386k.m6061f(fv.k, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6062g(fv.C2386k r32, ww.AbstractC8193c r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fv.C2386k.m6062g(fv.k, ww.c):java.lang.Object");
    }

    /* renamed from: h */
    public static final Object m6063h(C2386k c2386k, AbstractC8199i abstractC8199i) {
        Object value;
        String string;
        m1 m1Var = c2386k.f10867r;
        do {
            value = m1Var.getValue();
            string = c2386k.f10851b.getString(R.string.something_went_wrong_try_again);
            AbstractC4154l.m8922e(string, "getString(...)");
        } while (!m1Var.m15397i(value, C2136a.m5817a((C2136a) value, null, null, null, null, false, string, null, null, false, false, null, null, 0, false, null, null, null, null, null, null, 268433407)));
        Object objMo14775g = c2386k.f10865p.mo14775g(Boolean.FALSE, abstractC8199i);
        return objMo14775g == EnumC7794a.COROUTINE_SUSPENDED ? objMo14775g : a0.f30746a;
    }

    /* renamed from: i */
    public static final void m6064i(C2386k c2386k, f1 f1Var) {
        Object value;
        String string;
        Object value2;
        String string2;
        Context context = c2386k.f10851b;
        m1 m1Var = c2386k.f10867r;
        if ((f1Var instanceof x0) || (f1Var instanceof im.w0)) {
            do {
                value = m1Var.getValue();
                string = context.getString(R.string.something_went_wrong_try_again);
                AbstractC4154l.m8922e(string, "getString(...)");
            } while (!m1Var.m15397i(value, C2136a.m5817a((C2136a) value, null, null, null, null, false, string, null, null, false, false, null, null, 0, false, null, null, null, null, null, null, 268351487)));
            return;
        }
        do {
            value2 = m1Var.getValue();
            string2 = context.getString(R.string.something_went_wrong_try_again);
            AbstractC4154l.m8922e(string2, "getString(...)");
        } while (!m1Var.m15397i(value2, C2136a.m5817a((C2136a) value2, null, null, null, null, false, string2, null, null, false, false, null, null, 0, false, null, null, null, null, null, null, 268417023)));
    }

    /* renamed from: j */
    public static final void m6065j(C2386k c2386k, LeadNoteSaveResponse leadNoteSaveResponse) {
        Object value;
        String string;
        C5414p c5414p;
        Object value2;
        m1 m1Var = c2386k.f10867r;
        if (leadNoteSaveResponse.m4810h() && (c5414p = ((C2136a) c2386k.f10868s.f39340a.getValue()).f9969a) != null && leadNoteSaveResponse.m4804b() == c5414p.f27190g && AbstractC4154l.m8918a(leadNoteSaveResponse.m4803a(), c5414p.f27191h.getTypeName()) && leadNoteSaveResponse.m4806d() == c5414p.f27193k) {
            C8800o c8800o = C8800o.f42459a;
            if (C8800o.m16184H(leadNoteSaveResponse.m4805c()) == C8800o.m16184H(c5414p.f27192j) && AbstractC4154l.m8918a(leadNoteSaveResponse.m4809g(), c5414p.f27189f) && AbstractC4154l.m8918a(leadNoteSaveResponse.m4807e(), c5414p.f27194l)) {
                do {
                    value2 = m1Var.getValue();
                } while (!m1Var.m15397i(value2, C2136a.m5817a((C2136a) value2, null, null, null, null, false, "", null, null, false, false, null, null, 0, false, null, null, null, null, null, null, 268417023)));
                c0.m13502y(c2386k.f10860k, null, null, new C1770t(c2386k, leadNoteSaveResponse, null, 16), 3);
                return;
            }
        }
        do {
            value = m1Var.getValue();
            string = c2386k.f10851b.getString(R.string.something_went_wrong_try_again);
            AbstractC4154l.m8922e(string, "getString(...)");
        } while (!m1Var.m15397i(value, C2136a.m5817a((C2136a) value, null, null, null, null, false, string, null, null, false, false, null, null, 0, false, null, null, null, null, null, null, 268417023)));
    }

    /* renamed from: k */
    public static final void m6066k(C2386k c2386k, t6 t6Var) {
        Object value;
        String string;
        Object value2;
        m1 m1Var = c2386k.f10867r;
        if (t6Var instanceof im.a0) {
            do {
                value2 = m1Var.getValue();
            } while (!m1Var.m15397i(value2, C2136a.m5817a((C2136a) value2, null, null, null, null, false, ((im.a0) t6Var).f17535a, null, null, false, false, null, null, 0, false, null, null, null, null, null, null, 268417023)));
            return;
        }
        C8805t c8805t = c2386k.f10857h;
        C5414p c5414p = ((C2136a) c2386k.f10868s.f39340a.getValue()).f9969a;
        c8805t.m16231f("saveNoteInDB ResultData.Error else id " + (c5414p != null ? Integer.valueOf(c5414p.f27184a) : null) + " error " + t6Var);
        do {
            value = m1Var.getValue();
            string = c2386k.f10851b.getString(R.string.something_went_wrong_try_again);
            AbstractC4154l.m8922e(string, "getString(...)");
        } while (!m1Var.m15397i(value, C2136a.m5817a((C2136a) value, null, null, null, null, false, string, null, null, false, false, null, null, 0, false, null, null, null, null, null, null, 268417023)));
    }

    /* renamed from: l */
    public static final Object m6067l(C2386k c2386k, boolean z6, AbstractC8199i abstractC8199i) {
        Object value;
        String string;
        if (z6) {
            Object objMo14775g = c2386k.f10865p.mo14775g(Boolean.TRUE, abstractC8199i);
            if (objMo14775g == EnumC7794a.COROUTINE_SUSPENDED) {
                return objMo14775g;
            }
        } else {
            m1 m1Var = c2386k.f10867r;
            do {
                value = m1Var.getValue();
                string = c2386k.f10851b.getString(R.string.something_went_wrong_try_again);
                AbstractC4154l.m8922e(string, "getString(...)");
            } while (!m1Var.m15397i(value, C2136a.m5817a((C2136a) value, null, null, null, null, false, string, null, null, false, false, null, null, 0, false, null, null, null, null, null, null, 268417023)));
        }
        return a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6068m(fv.C2386k r26, om.C5414p r27, ww.AbstractC8193c r28) {
        /*
            r0 = r26
            r1 = r28
            boolean r2 = r1 instanceof fv.C2385j
            if (r2 == 0) goto L17
            r2 = r1
            fv.j r2 = (fv.C2385j) r2
            int r3 = r2.f10850d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f10850d = r3
            goto L1c
        L17:
            fv.j r2 = new fv.j
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f10848b
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f10850d
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2e
            om.p r2 = r2.f10847a
            og.od.m10798c(r1)
            r5 = r2
            goto L4b
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            og.od.m10798c(r1)
            no.i r1 = r0.f10852c
            r4 = r27
            r2.f10847a = r4
            r2.f10850d = r5
            xm.y5 r1 = r1.f25091d
            java.lang.Object r1 = r1.m15696l(r2)
            if (r1 != r3) goto L4a
            return r3
        L4a:
            r5 = r4
        L4b:
            r16 = r1
            java.util.List r16 = (java.util.List) r16
            wx.m1 r0 = r0.f10867r
        L51:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            ev.a r4 = (ev.C2136a) r4
            java.util.Iterator r2 = r16.iterator()
        L5c:
            boolean r3 = r2.hasNext()
            r6 = 0
            if (r3 == 0) goto L77
            java.lang.Object r3 = r2.next()
            r7 = r3
            mm.m r7 = (mm.C4802m) r7
            java.lang.String r7 = r7.f23891c
            if (r5 == 0) goto L70
            java.lang.String r6 = r5.f27194l
        L70:
            boolean r6 = kotlin.jvm.internal.AbstractC4154l.m8918a(r7, r6)
            if (r6 == 0) goto L5c
            r6 = r3
        L77:
            mm.m r6 = (mm.C4802m) r6
            if (r6 == 0) goto L80
            int r2 = r6.f23893e
        L7d:
            r17 = r2
            goto L82
        L80:
            r2 = -1
            goto L7d
        L82:
            if (r5 == 0) goto L8b
            java.lang.String r2 = r5.f27186c
            if (r2 != 0) goto L89
            goto L8b
        L89:
            r8 = r2
            goto L8e
        L8b:
            java.lang.String r2 = ""
            goto L89
        L8e:
            r24 = 0
            r25 = 267648990(0xff3ffde, float:2.4060206E-29)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            ev.a r2 = ev.C2136a.m5817a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = r0.m15397i(r1, r2)
            if (r1 == 0) goto L51
            qw.a0 r0 = qw.a0.f30746a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fv.C2386k.m6068m(fv.k, om.p, ww.c):java.lang.Object");
    }

    /* renamed from: n */
    public static final void m6069n(C2386k c2386k) throws NumberFormatException {
        C5414p c5414p;
        Object value;
        C2136a c2136a;
        String str;
        String str2;
        LastCallDetails lastCallDetails = c2386k.f10862m;
        if (lastCallDetails != null) {
            String strM4906d = lastCallDetails.m4906d();
            LocalDateTime localDateTimeM4904b = lastCallDetails.m4904b();
            long jM16156c = C8789d.m16156c(lastCallDetails.m4909g());
            String strM4907e = lastCallDetails.m4907e();
            String strM4911i = lastCallDetails.m4911i();
            int iM4908f = lastCallDetails.m4908f();
            EnumC8994d enumC8994dM16165o = C8789d.m16165o(lastCallDetails.m4905c());
            AbstractC4154l.m8920c(enumC8994dM16165o);
            c5414p = new C5414p(-1, 0L, lastCallDetails.m4910h(), true, strM4906d, strM4911i, iM4908f, enumC8994dM16165o, localDateTimeM4904b, jM16156c, strM4907e);
        } else {
            c5414p = null;
        }
        C5414p c5414p2 = c5414p;
        m1 m1Var = c2386k.f10867r;
        do {
            value = m1Var.getValue();
            c2136a = (C2136a) value;
            str = c2386k.f10861l;
            AbstractC4154l.m8920c(str);
            if (c5414p2 == null || (str2 = c5414p2.f27186c) == null) {
                str2 = "";
            }
        } while (!m1Var.m15397i(value, C2136a.m5817a(c2136a, c5414p2, null, null, str2, false, null, null, null, false, false, str, null, 0, false, null, null, null, null, null, null, 268304350)));
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* renamed from: o */
    public final java.lang.Object m6070o(ww.AbstractC8193c r65) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fv.C2386k.m6070o(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6071p(ww.AbstractC8193c r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            boolean r2 = r1 instanceof fv.C2381f
            if (r2 == 0) goto L17
            r2 = r1
            fv.f r2 = (fv.C2381f) r2
            int r3 = r2.f10832c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f10832c = r3
            goto L1c
        L17:
            fv.f r2 = new fv.f
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f10830a
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f10832c
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            og.od.m10798c(r1)
            goto L46
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            og.od.m10798c(r1)
            r2.f10832c = r5
            wj.p r1 = r0.f10853d
            java.lang.Object r1 = r1.f38725c
            xm.r3 r1 = (xm.r3) r1
            r4 = 0
            java.lang.Object r1 = r1.m15610i(r4, r2)
            if (r1 != r3) goto L46
            return r3
        L46:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r1)
        L50:
            wx.m1 r1 = r0.f10867r
            java.lang.Object r3 = r1.getValue()
            r4 = r3
            ev.a r4 = (ev.C2136a) r4
            java.util.List r6 = rw.AbstractC6663m.c0(r2)
            r24 = 0
            r25 = 268435447(0xffffff7, float:2.5243535E-29)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            ev.a r4 = ev.C2136a.m5817a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = r1.m15397i(r3, r4)
            if (r1 == 0) goto L50
            qw.a0 r1 = qw.a0.f30746a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fv.C2386k.m6071p(ww.c):java.lang.Object");
    }

    /* renamed from: q */
    public final void m6072q() {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f10867r;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C2136a.m5817a((C2136a) value, null, null, null, null, false, null, null, null, false, false, null, null, 0, false, null, null, null, null, null, null, 268386303)));
    }

    /* renamed from: r */
    public final void m6073r(List list) {
        m1 m1Var;
        wx.w0 w0Var;
        Object value;
        Object value2;
        String strM4824d;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            m1Var = this.f10867r;
            w0Var = this.f10868s;
            if (!zHasNext) {
                break;
            }
            LeadVerifiedNumberResponse leadVerifiedNumberResponse = (LeadVerifiedNumberResponse) it.next();
            C5414p c5414p = ((C2136a) w0Var.f39340a.getValue()).f9969a;
            AbstractC4154l.m8920c(c5414p);
            if (AbstractC4154l.m8918a(c5414p.f27189f, leadVerifiedNumberResponse.m4825e())) {
                C5414p c5414p2 = ((C2136a) w0Var.f39340a.getValue()).f9969a;
                AbstractC4154l.m8920c(c5414p2);
                if (c5414p2.f27190g == leadVerifiedNumberResponse.m4821a() && leadVerifiedNumberResponse.m4826f()) {
                    do {
                        value2 = m1Var.getValue();
                        strM4824d = leadVerifiedNumberResponse.m4824d();
                        AbstractC4154l.m8920c(strM4824d);
                    } while (!m1Var.m15397i(value2, C2136a.m5817a((C2136a) value2, null, null, null, null, false, null, null, null, false, true, strM4824d, null, 0, false, null, null, null, null, null, null, 268271615)));
                }
            }
        }
        do {
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C2136a.m5817a((C2136a) value, null, null, null, null, false, "", null, null, false, false, null, null, 0, false, null, null, null, null, null, null, 268417023)));
        if (((C2136a) w0Var.f39340a.getValue()).f9980l) {
            c0.m13502y(this.f10860k, null, null, new C2376a(this, null, 6), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015c  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6074s(og.id r43) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fv.C2386k.m6074s(og.id):void");
    }
}
