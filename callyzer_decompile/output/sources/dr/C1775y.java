package dr;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import ao.C0372k;
import ar.AbstractC0427q;
import ar.C0411a;
import ar.C0412b;
import ar.C0413c;
import ar.C0414d;
import ar.C0415e;
import ar.C0416f;
import ar.C0417g;
import ar.C0418h;
import ar.C0419i;
import ar.C0420j;
import ar.C0421k;
import ar.C0422l;
import ar.C0423m;
import ar.C0424n;
import ar.C0425o;
import ar.C0426p;
import ay.C0496f;
import ay.ExecutorC0495e;
import bq.C0732l;
import bq.C0733m;
import br.C0738a;
import br.C0739b;
import br.C0740c;
import br.C0741d;
import br.C0742e;
import c9.C0908c;
import c9.C0910e;
import com.sun.mail.imap.IMAPStore;
import com.websoptimization.callyzerbiz.R;
import cr.C1479a;
import cr.C1480b;
import d7.n0;
import eo.C2082h;
import i7.C3178a;
import im.C3299a;
import im.C3300b;
import j$.time.LocalDateTime;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4184n;
import ln.C4494g;
import lv.C4531c;
import nn.C5113e;
import no.C5122i;
import nx.AbstractC5178p;
import og.pe;
import om.C5407i;
import pg.f9;
import pg.g9;
import pg.o6;
import pn.C5979e;
import qr.C6293q;
import qr.C6294r;
import qr.C6296t;
import qr.g0;
import qw.C6361k;
import qw.C6363m;
import qw.C6364n;
import rn.h0;
import rt.C6617a;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.C6668r;
import sq.g2;
import tq.EnumC7202n;
import tq.EnumC7204p;
import tx.c0;
import tx.m0;
import ur.AbstractC7523p;
import ur.AbstractC7524q;
import ur.AbstractC7529v;
import ur.C7508a;
import ur.C7509b;
import ur.C7514g;
import ur.C7518k;
import ur.C7519l;
import ur.C7520m;
import ur.C7522o;
import ur.C7530w;
import ur.C7531x;
import ur.i0;
import ur.p0;
import ur.q0;
import ur.r0;
import ur.u0;
import uw.C7565i;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import wx.w0;
import yv.C8791f;
import yv.C8800o;
import yv.C8805t;
import yx.C8810d;
import zk.C8989c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.y */
/* loaded from: classes3.dex */
public final class C1775y extends AbstractC7524q {

    /* renamed from: A */
    public boolean f8617A;

    /* renamed from: B */
    public final C4531c f8618B;

    /* renamed from: C */
    public final C6293q f8619C;

    /* renamed from: D */
    public final g0 f8620D;

    /* renamed from: E */
    public final C6294r f8621E;

    /* renamed from: F */
    public final C6296t f8622F;

    /* renamed from: f */
    public final Context f8623f;

    /* renamed from: g */
    public final C0910e f8624g;

    /* renamed from: h */
    public final mn.g0 f8625h;

    /* renamed from: i */
    public final C0908c f8626i;

    /* renamed from: j */
    public final C8810d f8627j;

    /* renamed from: k */
    public final C2082h f8628k;

    /* renamed from: l */
    public final C8805t f8629l;

    /* renamed from: m */
    public final C5979e f8630m;

    /* renamed from: n */
    public final C5122i f8631n;

    /* renamed from: o */
    public final h0 f8632o;

    /* renamed from: p */
    public final C4494g f8633p;

    /* renamed from: q */
    public final C5113e f8634q;

    /* renamed from: r */
    public final m1 f8635r;

    /* renamed from: s */
    public final w0 f8636s;

    /* renamed from: t */
    public final ArrayList f8637t;

    /* renamed from: u */
    public final C7806h f8638u;

    /* renamed from: v */
    public final C8203d f8639v;

    /* renamed from: w */
    public final C7806h f8640w;

    /* renamed from: x */
    public final C8203d f8641x;

    /* renamed from: y */
    public final m1 f8642y;

    /* renamed from: z */
    public final w0 f8643z;

    public C1775y(Context context, C0910e c0910e, mn.g0 g0Var, C0908c c0908c, C8810d c8810d, C2082h c2082h, C8805t c8805t, C5979e c5979e, C5122i noteUseCase, h0 callRecordingUseCase, C4494g c4494g, C5113e c5113e, n0 savedStateHandle) {
        AbstractC4154l.m8923f(noteUseCase, "noteUseCase");
        AbstractC4154l.m8923f(callRecordingUseCase, "callRecordingUseCase");
        AbstractC4154l.m8923f(savedStateHandle, "savedStateHandle");
        this.f8623f = context;
        this.f8624g = c0910e;
        this.f8625h = g0Var;
        this.f8626i = c0908c;
        this.f8627j = c8810d;
        this.f8628k = c2082h;
        this.f8629l = c8805t;
        this.f8630m = c5979e;
        this.f8631n = noteUseCase;
        this.f8632o = callRecordingUseCase;
        this.f8633p = c4494g;
        this.f8634q = c5113e;
        String str = (String) savedStateHandle.m5330a(IMAPStore.ID_NAME);
        String contactName = Uri.decode(str == null ? "" : str);
        String str2 = (String) savedStateHandle.m5330a("country_code");
        String countryCode = Uri.decode(str2 == null ? "" : str2);
        String str3 = (String) savedStateHandle.m5330a("number");
        String number = Uri.decode(str3 != null ? str3 : "");
        AbstractC4154l.m8922e(contactName, "contactName");
        AbstractC4154l.m8922e(countryCode, "countryCode");
        AbstractC4154l.m8922e(number, "number");
        C6668r c6668r = C6668r.f31943a;
        C0739b c0739b = new C0739b(c6668r, false, false, true, 0, false, false, false, c6668r);
        C0742e c0742e = new C0742e(c6668r);
        C0738a c0738a = new C0738a(new C1479a());
        C8800o c8800o = C8800o.f42459a;
        InterfaceC7559c interfaceC7559c = null;
        int i10 = 0;
        m1 m1VarM15372c = c1.m15372c(new C0740c(false, false, c0739b, c0742e, c0738a, c6668r, C8800o.m16209r(), C8800o.m16201j(), EnumC7204p.DEFAULT, C8800o.m16209r(), C8800o.m16201j(), c6668r, contactName, countryCode, number, new C4184n(false, -1), false, null, new C0741d(null, null, null), false));
        this.f8635r = m1VarM15372c;
        this.f8636s = new w0(m1VarM15372c);
        this.f8637t = new ArrayList();
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f8638u = c7806hM11805a;
        this.f8639v = c1.m15389t(c7806hM11805a);
        C7806h c7806hM11805a2 = o6.m11805a(0, null, null, 7);
        this.f8640w = c7806hM11805a2;
        this.f8641x = c1.m15389t(c7806hM11805a2);
        m1 m1VarM15372c2 = c1.m15372c(null);
        this.f8642y = m1VarM15372c2;
        this.f8643z = new w0(m1VarM15372c2);
        int i11 = 1;
        int i12 = 2;
        int i13 = 3;
        this.f8618B = new C4531c(Integer.valueOf(((C0740c) m1VarM15372c.getValue()).f4669c.f4662e), new C1751a(this, i10), new C1751a(this, i11), new C1758h(this, interfaceC7559c, i13), new C1758h(this, interfaceC7559c, i12), new C1765o(this, interfaceC7559c, i10), null, new C1766p(this, interfaceC7559c, i12), new C1766p(this, interfaceC7559c, i11), new C1769s(this, interfaceC7559c, i10), 1088);
        this.f8619C = new C6293q(C7531x.m14296a(C2082h.f9741e, null, 3), new C1752b(this, 0), context);
        this.f8620D = new g0(f9.m11628b(context, R.string.sort_by), new C7530w(1, pe.m10835j(p0.f36251c, q0.f36256c, u0.f36264c, r0.f36258c), false), context);
        this.f8621E = new C6294r(C2082h.m5793b(), new C1752b(this, 1), context);
        this.f8622F = new C6296t(C2082h.m5795d(), new C1752b(this, 2), context);
        if (AbstractC5178p.m10101L(countryCode) || AbstractC5178p.m10101L(number)) {
            c0.m13502y(d7.q0.m5340g(this), null, null, new C1753c(this, interfaceC7559c, i10), 3);
            return;
        }
        c0.m13502y(c8810d, null, null, new C1754d(this, null), 3);
        C3178a c3178aM5340g = d7.q0.m5340g(this);
        C0496f c0496f = m0.f34659a;
        c0.m13502y(c3178aM5340g, ExecutorC0495e.f3538c, null, new C1753c(this, interfaceC7559c, i13), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f9, code lost:
    
        if (r1 == r6) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157 A[LOOP:0: B:46:0x013c->B:50:0x0157, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f9 -> B:13:0x0055). Please report as a decompilation issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5448h(dr.C1775y r24, ww.AbstractC8193c r25) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.C1775y.m5448h(dr.y, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5449i(dr.C1775y r13, int r14, ww.AbstractC8193c r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.C1775y.m5449i(dr.y, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5450j(dr.C1775y r13, int r14, ww.AbstractC8193c r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.C1775y.m5450j(dr.y, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5451k(dr.C1775y r13, ww.AbstractC8193c r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.C1775y.m5451k(dr.y, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r0 == r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5452l(dr.C1775y r24, ww.AbstractC8193c r25) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.C1775y.m5452l(dr.y, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
    
        if (r0 == r5) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5453m(dr.C1775y r26, ww.AbstractC8193c r27) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.C1775y.m5453m(dr.y, ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0102 -> B:36:0x0105). Please report as a decompilation issue!!! */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5454n(dr.C1775y r27, java.util.List r28, ww.AbstractC8193c r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.C1775y.m5454n(dr.y, java.util.List, ww.c):java.lang.Object");
    }

    @Override // ur.AbstractC7524q
    /* renamed from: e */
    public final void mo2033e(AbstractC7523p event) {
        m1 m1Var;
        Object value;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C7518k;
        C8810d c8810d = this.f8627j;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            c0.m13502y(c8810d, null, null, new C0732l(event, this, interfaceC7559c, 2, false), 3);
            return;
        }
        boolean z10 = event instanceof C7514g;
        C6294r c6294r = this.f8621E;
        C6296t c6296t = this.f8622F;
        if (z10) {
            C7514g c7514g = (C7514g) event;
            int i10 = c7514g.f36216a;
            int i11 = AbstractC1755e.f8501a[c7514g.f36217b.ordinal()];
            if (i11 == 1) {
                c6294r.m12316q(i10);
            } else if (i11 == 2) {
                c6296t.m12324q(i10);
            }
            c0.m13502y(c8810d, null, null, new C1753c(this, interfaceC7559c, 6), 3);
            return;
        }
        if (event.equals(C7508a.f36203a)) {
            c6294r.m12329m();
            c6296t.m12329m();
            return;
        }
        if (event instanceof C7509b) {
            c0.m13502y(c8810d, null, null, new C0733m((AbstractC7524q) this, interfaceC7559c, 2, false), 3);
            return;
        }
        boolean z11 = event instanceof C7519l;
        C6293q c6293q = this.f8619C;
        if (z11) {
            c6293q.m12311p(((C7519l) event).f36237a);
            return;
        }
        if (!(event instanceof C7520m)) {
            if (event instanceof C7522o) {
                c0.m13502y(c8810d, null, null, new C0372k(this, event, interfaceC7559c, 29), 3);
                return;
            }
            return;
        }
        c6293q.m12312q(((C7520m) event).f36240a);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM12310o = c6293q.m12310o();
        int size = arrayListM12310o.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListM12310o.get(i12);
            i12++;
            arrayList.add(((AbstractC7529v) obj).f36267c);
        }
        do {
            m1Var = this.f8635r;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C0740c.m2037a((C0740c) value, false, null, null, null, arrayList, null, null, null, null, false, null, null, false, 1048543)));
        c0.m13502y(c8810d, null, null, new C1753c(this, interfaceC7559c, 7), 3);
    }

    @Override // ur.AbstractC7524q
    /* renamed from: f */
    public final void mo2034f() {
        m1 m1Var;
        Object value;
        ArrayList arrayListD0 = AbstractC6663m.d0(((i0) this.f36253c.f39340a.getValue()).f36224a);
        c0.m13502y(this.f8627j, null, null, new C1770t(arrayListD0, this, null, 0), 3);
        do {
            m1Var = this.f36252b;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, i0.m14293a((i0) value, arrayListD0, null, null, null, null, 30)));
    }

    /* renamed from: o */
    public final tx.g0 m5455o() {
        w0 w0Var = this.f8636s;
        List list = ((C0740c) w0Var.f39340a.getValue()).f4672f;
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EnumC8994d enumC8994dJ0 = g2.j0((EnumC7202n) it.next());
            AbstractC4154l.m8920c(enumC8994dJ0);
            arrayList.add(enumC8994dJ0);
        }
        ArrayList arrayListD0 = AbstractC6663m.d0(arrayList);
        if (((C0740c) w0Var.f39340a.getValue()).f4672f.isEmpty()) {
            arrayListD0.add(EnumC8994d.OUTGOING);
            arrayListD0.add(EnumC8994d.INCOMING);
        }
        return c0.m13482e(this.f8627j, null, new C1757g(this, arrayListD0, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m5456p(ww.AbstractC8193c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof dr.C1760j
            if (r0 == 0) goto L13
            r0 = r5
            dr.j r0 = (dr.C1760j) r0
            int r1 = r0.f8541c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8541c = r1
            goto L18
        L13:
            dr.j r0 = new dr.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8539a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f8541c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.f8541c = r3
            rn.h0 r5 = r4.f8632o
            xm.s2 r5 = r5.f31523e
            java.lang.Object r5 = r5.m15629n(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.util.Map r5 = (java.util.Map) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L52:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r0.add(r2)
            goto L52
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.C1775y.m5456p(ww.c):java.io.Serializable");
    }

    /* renamed from: q */
    public final tx.g0 m5457q() {
        List list = ((C0740c) this.f8636s.f39340a.getValue()).f4672f;
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EnumC8994d enumC8994dJ0 = g2.j0((EnumC7202n) it.next());
            AbstractC4154l.m8920c(enumC8994dJ0);
            arrayList.add(enumC8994dJ0);
        }
        return c0.m13482e(this.f8627j, null, new C1762l(this, arrayList, null), 3);
    }

    /* renamed from: r */
    public final void m5458r(boolean z6) {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f8635r;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C0740c.m2037a((C0740c) value, z6, null, null, null, null, null, null, null, null, false, null, null, false, 1048573)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v20, types: [android.net.Uri, java.lang.Boolean, java.lang.Integer] */
    /* renamed from: s */
    public final void m5459s(AbstractC0427q event) {
        Object value;
        Object value2;
        Object value3;
        C0740c c0740c;
        Object value4;
        C0740c c0740c2;
        ArrayList arrayListD0;
        Object value5;
        C0740c c0740c3;
        Object value6;
        Iterable iterable;
        Object value7;
        Object value8;
        Object value9;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C0413c;
        C8810d c8810d = this.f8627j;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            c0.m13502y(c8810d, null, null, new C1753c(this, interfaceC7559c, 5), 3);
            return;
        }
        int i10 = 1;
        if (event instanceof C0424n) {
            c0.m13502y(c8810d, null, null, new C1765o(this, interfaceC7559c, i10), 3);
            return;
        }
        if (event instanceof C0425o) {
            c0.m13502y(c8810d, null, null, new C1765o(this, interfaceC7559c, 2), 3);
            return;
        }
        boolean z10 = event instanceof C0421k;
        C0910e c0910e = this.f8624g;
        if (z10) {
            C0421k c0421k = (C0421k) event;
            c0910e.m2585D("+" + c0421k.f3140a + c0421k.f3141b);
            return;
        }
        if (event instanceof C0422l) {
            c0910e.m2588G(((C0422l) event).f3142a);
            return;
        }
        if (event instanceof C0411a) {
            c0910e.m2609s(((C0411a) event).f3128a);
            return;
        }
        boolean z11 = event instanceof C0426p;
        m1 m1Var = this.f8635r;
        if (z11) {
            c0910e.m2587F(((C0740c) m1Var.getValue()).f4680n.concat(((C0740c) m1Var.getValue()).f4681o));
            return;
        }
        if (event instanceof C0414d) {
            C0414d c0414d = (C0414d) event;
            c0.m13502y(c8810d, null, null, new C1768r(this, c0414d.f3132b, c0414d.f3131a, interfaceC7559c, 0), 3);
            return;
        }
        boolean z12 = event instanceof C0412b;
        w0 w0Var = this.f8636s;
        if (z12) {
            StringBuilder sb2 = new StringBuilder("Contact Report");
            sb2.append(" " + ((C0740c) w0Var.f39340a.getValue()).f4681o + " ");
            C8800o c8800o = C8800o.f42459a;
            sb2.append(C8800o.m16177A(((C0740c) w0Var.f39340a.getValue()).f4676j));
            sb2.append(" to ");
            sb2.append(C8800o.m16177A(((C0740c) w0Var.f39340a.getValue()).f4677k));
            sb2.append(".csv");
            do {
                value9 = m1Var.getValue();
            } while (!m1Var.m15397i(value9, C0740c.m2037a((C0740c) value9, false, null, null, null, null, null, null, null, null, false, sb2.toString(), null, false, 917503)));
            return;
        }
        int i11 = 0;
        if (event instanceof C0420j) {
            C0420j c0420j = (C0420j) event;
            Uri uri = c0420j.f3138a;
            if (uri == null) {
                do {
                    value8 = m1Var.getValue();
                } while (!m1Var.m15397i(value8, C0740c.m2037a((C0740c) value8, false, null, null, null, null, null, null, null, null, false, null, new C0741d(null, null, null), false, 655359)));
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C3299a(pe.m10834i("Sr.No", "Name", "From Number", "To Number", "Date", "Time", "Duration", "Type", "Note")));
            Object obj = ((C6364n) c0.m13468D(C7565i.f36440a, new C1753c(this, interfaceC7559c, i10))).f30758a;
            boolean z13 = obj instanceof C6363m;
            if (z13) {
                iterable = C6668r.f31943a;
            } else {
                if (z13) {
                    obj = null;
                }
                iterable = (List) obj;
            }
            if (iterable != null) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        ?? r21 = interfaceC7559c;
                        pe.m10842q();
                        throw r21;
                    }
                    C1480b c1480b = (C1480b) next;
                    String strValueOf = String.valueOf(i12);
                    C5407i c5407i = c1480b.f7551a;
                    String str = c5407i.f27144b;
                    String str2 = c5407i.f27156n;
                    String str3 = c5407i.f27145c;
                    InterfaceC7559c interfaceC7559c2 = interfaceC7559c;
                    String str4 = c1480b.f7555e;
                    Iterator it2 = it;
                    String str5 = c1480b.f7553c;
                    String str6 = c1480b.f7552b;
                    String strName = c5407i.f27147e.name();
                    String str7 = c1480b.f7551a.f27150h;
                    arrayList.add(new C3299a(pe.m10834i(strValueOf, str, str2, str3, str4, str5, str6, strName, str7 == null ? "" : str7)));
                    it = it2;
                    i11 = i12;
                    interfaceC7559c = interfaceC7559c2;
                }
            }
            new C8989c(24, new C3300b(arrayList)).f0(uri, c0420j.f3139b);
            do {
                value7 = m1Var.getValue();
            } while (!m1Var.m15397i(value7, C0740c.m2037a((C0740c) value7, false, null, null, null, null, null, null, null, null, false, null, new C0741d(Boolean.TRUE, Integer.valueOf(R.string.csv_exported_true), uri), false, 655359)));
            return;
        }
        Object obj2 = null;
        if (event instanceof C0415e) {
            while (true) {
                Object value10 = m1Var.getValue();
                ?? r42 = obj2;
                if (m1Var.m15397i(value10, C0740c.m2037a((C0740c) value10, false, null, null, null, null, null, null, null, null, false, null, new C0741d(r42, r42, r42), false, 655359))) {
                    return;
                } else {
                    obj2 = null;
                }
            }
        } else {
            if (event instanceof C0418h) {
                do {
                    value6 = m1Var.getValue();
                } while (!m1Var.m15397i(value6, C0740c.m2037a((C0740c) value6, false, null, null, null, null, null, null, null, new C4184n(true, ((C0418h) event).f3136a), false, null, null, false, 1015807)));
                return;
            }
            if (event instanceof C0416f) {
                do {
                    value5 = m1Var.getValue();
                    c0740c3 = (C0740c) value5;
                } while (!m1Var.m15397i(value5, C0740c.m2037a(c0740c3, false, null, null, null, null, null, null, null, new C4184n(false, c0740c3.f4682p.f21222b), false, null, null, false, 1015807)));
                return;
            }
            if (event instanceof C0417g) {
                do {
                    value3 = m1Var.getValue();
                    c0740c = (C0740c) value3;
                } while (!m1Var.m15397i(value3, C0740c.m2037a(c0740c, false, null, null, null, null, null, null, null, new C4184n(false, c0740c.f4682p.f21222b), false, null, null, false, 1015807)));
                if (!this.f8617A) {
                    this.f8617A = true;
                    m5460t();
                }
                do {
                    value4 = m1Var.getValue();
                    c0740c2 = (C0740c) value4;
                    arrayListD0 = AbstractC6663m.d0(c0740c2.f4669c.f4666i);
                    arrayListD0.add(Integer.valueOf(((C0740c) m1Var.getValue()).f4682p.f21222b));
                } while (!m1Var.m15397i(value4, C0740c.m2037a(c0740c2, false, C0739b.m2036a(c0740c2.f4669c, null, false, false, false, 0, false, false, false, arrayListD0, 255), null, null, null, null, null, null, null, false, null, null, false, 1048571)));
                c0.m13502y(c8810d, null, null, new C1753c(this, null, 4), 3);
                return;
            }
            if (event instanceof C0423m) {
                C5407i c5407i2 = ((C1480b) ((C0740c) w0Var.f39340a.getValue()).f4669c.f4658a.get(0)).f7551a;
                String str8 = c5407i2.f27144b;
                String str9 = c5407i2.f27156n;
                String str10 = c5407i2.f27145c;
                String strValueOf2 = String.valueOf(c5407i2.f27146d);
                EnumC8994d enumC8994d = c5407i2.f27147e;
                LocalDateTime localDateTime = c5407i2.f27148f;
                String strValueOf3 = String.valueOf(c5407i2.f27149g);
                String str11 = c5407i2.f27155m;
                c0.m13502y(c8810d, null, null, new C0372k(this, new C6617a(str8, str10, str9, strValueOf2, enumC8994d, localDateTime, strValueOf3, null, 0, null, null, str11 == null ? "" : str11, 1920), (InterfaceC7559c) null, 28), 3);
                return;
            }
            Object obj3 = null;
            if (!(event instanceof C0419i)) {
                throw new NoWhenBranchMatchedException();
            }
            C6361k c6361k = ((C0419i) event).f3137a;
            m1 m1Var2 = this.f8642y;
            if (c6361k != null) {
                Object obj4 = c6361k.f30755a;
                Object obj5 = c6361k.f30756b;
                C8791f c8791f = C8791f.f42457a;
                if (C8791f.m16171d((String) obj5)) {
                    AbstractC4154l.m8920c(obj5);
                    String str12 = (String) obj5;
                    boolean zM10116x = AbstractC5178p.m10116x(str12, "content://", false);
                    Context context = this.f8623f;
                    Uri uriM754d = zM10116x ? Uri.parse(str12) : FileProvider.m754d(context, new File(str12));
                    if (zM10116x) {
                        AbstractC4154l.m8920c(uriM754d);
                        if (!g9.m11663c(context, uriM754d)) {
                            int iIntValue = ((Number) obj4).intValue();
                            this.f8629l.m16231f("recording play failed for: " + iIntValue);
                            c0.m13502y(c8810d, null, null, new C1758h(this, iIntValue, null, i10), 3);
                            do {
                                value2 = m1Var2.getValue();
                            } while (!m1Var2.m15397i(value2, null));
                            return;
                        }
                    }
                    do {
                        value = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value, new C6361k(obj4, uriM754d)));
                    return;
                }
                return;
            }
            while (true) {
                Object value11 = m1Var2.getValue();
                if (m1Var2.m15397i(value11, obj3)) {
                    return;
                } else {
                    obj3 = null;
                }
            }
        }
    }

    /* renamed from: t */
    public final void m5460t() {
        InterfaceC7559c interfaceC7559c = null;
        c0.m13502y(d7.q0.m5340g(this), null, null, new C1765o(this, interfaceC7559c, 4), 3);
        c0.m13502y(d7.q0.m5340g(this), null, null, new C1753c(this, interfaceC7559c, 8), 3);
    }
}
