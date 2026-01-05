package lv;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import aw.C0480t;
import b2.C0554l;
import c9.C0914i;
import c9.C0922q;
import cd.C0955j;
import cd.C0959n;
import com.amplifyframework.storage.s3.C1230b;
import com.sun.mail.util.AbstractC1452a;
import dr.C1769s;
import dy.AbstractC1856d;
import e1.d0;
import ed.C2032h;
import ed.InterfaceC2031g;
import gs.C2719e;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import s3.AbstractC6744a;
import sc.C6788h;
import sc.C6797q;
import t8.C7056b;
import u8.C7356d;
import v3.AbstractC7634f;
import v3.C7631c;
import v3.C7649u;
import v3.C7654z;
import v3.InterfaceC7652x;
import v3.a1;
import v3.c1;
import v3.d1;
import v3.g0;
import v3.h1;
import v3.i1;
import v3.o1;
import v3.x1;
import w2.AbstractC7878q;
import w2.InterfaceC7877p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lv.g */
/* loaded from: classes3.dex */
public final class C4535g {

    /* renamed from: a */
    public final /* synthetic */ int f22537a;

    /* renamed from: b */
    public final Object f22538b;

    /* renamed from: c */
    public final Object f22539c;

    /* renamed from: d */
    public Object f22540d;

    /* renamed from: e */
    public final Object f22541e;

    /* renamed from: f */
    public Object f22542f;

    /* renamed from: g */
    public Object f22543g;

    /* renamed from: h */
    public Object f22544h;

    /* renamed from: i */
    public Object f22545i;

    public C4535g(Integer num, C1230b c1230b, C0480t c0480t, C2719e c2719e, C2719e c2719e2, C1769s c1769s) {
        this.f22537a = 0;
        this.f22538b = num;
        this.f22539c = c1230b;
        this.f22540d = c0480t;
        this.f22541e = c2719e;
        this.f22542f = c2719e2;
        this.f22543g = c1769s;
        this.f22544h = AbstractC1856d.m5490a();
        this.f22545i = num;
    }

    /* renamed from: a */
    public static final void m9382a(C4535g c4535g, AbstractC7878q abstractC7878q, h1 h1Var) {
        for (AbstractC7878q abstractC7878q2 = abstractC7878q.f37674e; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37674e) {
            if (abstractC7878q2 == d1.f36794a) {
                g0 g0VarM14609v = ((g0) c4535g.f22538b).m14609v();
                h1Var.f36904p = g0VarM14609v != null ? (C7649u) g0VarM14609v.f36832K.f22539c : null;
                c4535g.f22540d = h1Var;
                return;
            } else {
                if ((abstractC7878q2.f37672c & 2) != 0) {
                    return;
                }
                abstractC7878q2.K0(h1Var);
            }
        }
    }

    /* renamed from: b */
    public static AbstractC7878q m9383b(InterfaceC7877p interfaceC7877p, AbstractC7878q abstractC7878q) {
        AbstractC7878q abstractC7878qMo621h;
        if (interfaceC7877p instanceof a1) {
            abstractC7878qMo621h = ((a1) interfaceC7877p).mo621h();
            abstractC7878qMo621h.f37672c = i1.m14629f(abstractC7878qMo621h);
        } else {
            C7631c c7631c = new C7631c();
            c7631c.f37672c = i1.m14627d(interfaceC7877p);
            c7631c.f36789q = interfaceC7877p;
            c7631c.f36791s = new HashSet();
            abstractC7878qMo621h = c7631c;
        }
        if (abstractC7878qMo621h.f37683p) {
            AbstractC6744a.m12907b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC7878qMo621h.f37678j = true;
        AbstractC7878q abstractC7878q2 = abstractC7878q.f37675f;
        if (abstractC7878q2 != null) {
            abstractC7878q2.f37674e = abstractC7878qMo621h;
            abstractC7878qMo621h.f37675f = abstractC7878q2;
        }
        abstractC7878q.f37675f = abstractC7878qMo621h;
        abstractC7878qMo621h.f37674e = abstractC7878q;
        return abstractC7878qMo621h;
    }

    /* renamed from: c */
    public static AbstractC7878q m9384c(AbstractC7878q abstractC7878q) {
        boolean z6 = abstractC7878q.f37683p;
        if (z6) {
            d0 d0Var = i1.f36919a;
            if (!z6) {
                AbstractC6744a.m12907b("autoInvalidateRemovedNode called on unattached node");
            }
            i1.m14624a(abstractC7878q, -1, 2);
            abstractC7878q.I0();
            abstractC7878q.C0();
        }
        AbstractC7878q abstractC7878q2 = abstractC7878q.f37675f;
        AbstractC7878q abstractC7878q3 = abstractC7878q.f37674e;
        if (abstractC7878q2 != null) {
            abstractC7878q2.f37674e = abstractC7878q3;
            abstractC7878q.f37675f = null;
        }
        if (abstractC7878q3 != null) {
            abstractC7878q3.f37675f = abstractC7878q2;
            abstractC7878q.f37674e = null;
        }
        AbstractC4154l.m8920c(abstractC7878q3);
        return abstractC7878q3;
    }

    /* renamed from: n */
    public static void m9385n(InterfaceC7877p interfaceC7877p, InterfaceC7877p interfaceC7877p2, AbstractC7878q abstractC7878q) {
        if ((interfaceC7877p instanceof a1) && (interfaceC7877p2 instanceof a1)) {
            c1 c1Var = d1.f36794a;
            AbstractC4154l.m8921d(abstractC7878q, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((a1) interfaceC7877p2).mo622i(abstractC7878q);
            if (abstractC7878q.f37683p) {
                i1.m14626c(abstractC7878q);
                return;
            } else {
                abstractC7878q.f37679k = true;
                return;
            }
        }
        if (!(abstractC7878q instanceof C7631c)) {
            AbstractC6744a.m12907b("Unknown Modifier.Node type");
            return;
        }
        C7631c c7631c = (C7631c) abstractC7878q;
        if (c7631c.f37683p) {
            c7631c.M0();
        }
        c7631c.f36789q = interfaceC7877p2;
        c7631c.f37672c = i1.m14627d(interfaceC7877p2);
        if (c7631c.f37683p) {
            c7631c.L0(false);
        }
        if (abstractC7878q.f37683p) {
            i1.m14626c(abstractC7878q);
        } else {
            abstractC7878q.f37679k = true;
        }
    }

    /* renamed from: d */
    public boolean m9386d(int i10) {
        return (i10 & ((AbstractC7878q) this.f22542f).f37673d) != 0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:73)|(1:(3:(1:(1:(1:(5:15|16|54|55|56)(2:20|21))(7:22|71|23|24|50|(4:53|54|55|56)|59))(5:27|28|61|62|63))(6:30|68|31|44|(2:46|(1:48)(3:49|50|(0)))(2:57|(4:60|61|62|63))|59)|66|67)(1:35))(3:36|(1:39)|59)|69|40|(3:43|44|(0)(0))|59) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0125, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0126, code lost:
    
        r1 = r15;
        r15 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:50:0x00df, B:31:0x0070, B:44:0x00b7, B:46:0x00c1, B:57:0x0105), top: B:68:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105 A[Catch: all -> 0x0074, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:50:0x00df, B:31:0x0070, B:44:0x00b7, B:46:0x00c1, B:57:0x0105), top: B:68:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r15v13, types: [gs.e] */
    /* JADX WARN: Type inference failed for: r15v19, types: [dr.s] */
    /* JADX WARN: Type inference failed for: r15v5, types: [dy.a, dy.c] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, lv.d, uw.c] */
    /* JADX WARN: Type inference failed for: r1v3, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v2, types: [gs.e] */
    /* JADX WARN: Type inference failed for: r9v3, types: [aw.t] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m9387e(ww.AbstractC8193c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lv.C4535g.m9387e(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m9388f(ww.AbstractC8193c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lv.C4533e
            if (r0 == 0) goto L13
            r0 = r5
            lv.e r0 = (lv.C4533e) r0
            int r1 = r0.f22533d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22533d = r1
            goto L18
        L13:
            lv.e r0 = new lv.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f22531b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f22533d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dy.c r0 = r0.f22530a
            og.od.m10798c(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            og.od.m10798c(r5)
            java.lang.Object r5 = r4.f22544h
            dy.c r5 = (dy.C1855c) r5
            r0.f22530a = r5
            r0.f22533d = r3
            java.lang.Object r0 = r5.mo1768h(r0)
            if (r0 != r1) goto L43
            return r1
        L43:
            r0 = r5
        L44:
            r5 = 0
            java.lang.Object r1 = r4.f22538b     // Catch: java.lang.Throwable -> L51
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L51
            r4.f22545i = r1     // Catch: java.lang.Throwable -> L51
            r0.mo1769j(r5)
            qw.a0 r5 = qw.a0.f30746a
            return r5
        L51:
            r1 = move-exception
            r0.mo1769j(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lv.C4535g.m9388f(ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (m9387e(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m9389g(ww.AbstractC8193c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof lv.C4534f
            if (r0 == 0) goto L13
            r0 = r6
            lv.f r0 = (lv.C4534f) r0
            int r1 = r0.f22536c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22536c = r1
            goto L18
        L13:
            lv.f r0 = new lv.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f22534a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f22536c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r6)
            goto L4b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            og.od.m10798c(r6)
            goto L42
        L36:
            og.od.m10798c(r6)
            r0.f22536c = r4
            java.lang.Object r6 = r5.m9388f(r0)
            if (r6 != r1) goto L42
            goto L4a
        L42:
            r0.f22536c = r3
            java.lang.Object r6 = r5.m9387e(r0)
            if (r6 != r1) goto L4b
        L4a:
            return r1
        L4b:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lv.C4535g.m9389g(ww.c):java.lang.Object");
    }

    /* renamed from: h */
    public void m9390h() {
        h1 h1Var = (h1) this.f22540d;
        C7649u c7649u = (C7649u) this.f22539c;
        while (h1Var != c7649u) {
            h1Var.d1();
            h1Var = h1Var.f36903n;
            AbstractC4154l.m8920c(h1Var);
        }
        c7649u.d1();
        for (AbstractC7878q abstractC7878q = (AbstractC7878q) this.f22542f; abstractC7878q != null; abstractC7878q = abstractC7878q.f37675f) {
            abstractC7878q.H0();
            if (abstractC7878q.f37678j) {
                d0 d0Var = i1.f36919a;
                if (!abstractC7878q.f37683p) {
                    AbstractC6744a.m12907b("autoInvalidateInsertedNode called on unattached node");
                }
                i1.m14624a(abstractC7878q, -1, 1);
            }
            if (abstractC7878q.f37679k) {
                i1.m14626c(abstractC7878q);
            }
            abstractC7878q.f37678j = false;
            abstractC7878q.f37679k = false;
        }
    }

    /* renamed from: i */
    public void m9391i() {
        for (AbstractC7878q abstractC7878q = (x1) this.f22541e; abstractC7878q != null; abstractC7878q = abstractC7878q.f37674e) {
            if (abstractC7878q.f37683p) {
                abstractC7878q.I0();
            }
        }
        h1 h1Var = (C7649u) this.f22539c;
        h1 h1Var2 = (h1) this.f22540d;
        while (h1Var != h1Var2) {
            o1 o1Var = h1Var.f36901K;
            if (o1Var != null) {
                o1Var.destroy();
            }
            h1Var.f36901K = null;
            h1Var = h1Var.f36904p;
            AbstractC4154l.m8920c(h1Var);
        }
        o1 o1Var2 = h1Var2.f36901K;
        if (o1Var2 != null) {
            o1Var2.destroy();
        }
        h1Var2.f36901K = null;
    }

    /* renamed from: j */
    public void m9392j(InterfaceC2031g interfaceC2031g) {
        AbstractC4154l.m8923f(interfaceC2031g, "<set-?>");
        this.f22545i = interfaceC2031g;
    }

    /* renamed from: k */
    public void m9393k(C0959n c0959n) {
        AbstractC4154l.m8923f(c0959n, "<set-?>");
        this.f22544h = c0959n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0266, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026c, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0154, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0156, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0158, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0159, code lost:
    
        if (r13 > r3) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015b, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015f, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016d, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0170, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0172, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017d, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0184, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018c, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018f, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0191, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0196, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0198, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a2, code lost:
    
        if (r14 <= r7) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a4, code lost:
    
        if (r11 <= r15) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a6, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b2, code lost:
    
        if (r0.m7354b(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b4, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bb, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c3, code lost:
    
        if (r24 == 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c5, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c7, code lost:
    
        if (r11 < r12) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c9, code lost:
    
        if (r11 > r3) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cf, code lost:
    
        if (r16[r17 + r11] < r14) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d1, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m9394l(int r32, m2.C4640e r33, m2.C4640e r34, w2.AbstractC7878q r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lv.C4535g.m9394l(int, m2.e, m2.e, w2.q, boolean):void");
    }

    /* renamed from: m */
    public void m9395m() {
        C7654z c7654z;
        g0 g0Var = (g0) this.f22538b;
        h1 h1Var = (C7649u) this.f22539c;
        for (AbstractC7878q abstractC7878q = ((x1) this.f22541e).f37674e; abstractC7878q != null; abstractC7878q = abstractC7878q.f37674e) {
            InterfaceC7652x interfaceC7652xM14546g = AbstractC7634f.m14546g(abstractC7878q);
            if (interfaceC7652xM14546g != null) {
                h1 h1Var2 = abstractC7878q.f37677h;
                if (h1Var2 != null) {
                    C7654z c7654z2 = (C7654z) h1Var2;
                    InterfaceC7652x interfaceC7652x = c7654z2.f37078V;
                    c7654z2.s1(interfaceC7652xM14546g);
                    c7654z = c7654z2;
                    if (interfaceC7652x != abstractC7878q) {
                        o1 o1Var = c7654z2.f36901K;
                        c7654z = c7654z2;
                        if (o1Var != null) {
                            o1Var.invalidate();
                            c7654z = c7654z2;
                        }
                    }
                } else {
                    C7654z c7654z3 = new C7654z(g0Var, interfaceC7652xM14546g);
                    abstractC7878q.K0(c7654z3);
                    c7654z = c7654z3;
                }
                h1Var.f36904p = c7654z;
                c7654z.f36903n = h1Var;
                h1Var = c7654z;
            } else {
                abstractC7878q.K0(h1Var);
            }
        }
        g0 g0VarM14609v = g0Var.m14609v();
        h1Var.f36904p = g0VarM14609v != null ? (C7649u) g0VarM14609v.f36832K.f22539c : null;
        this.f22540d = h1Var;
    }

    public String toString() {
        switch (this.f22537a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("[");
                AbstractC7878q abstractC7878q = (AbstractC7878q) this.f22542f;
                x1 x1Var = (x1) this.f22541e;
                if (abstractC7878q == x1Var) {
                    sb2.append("]");
                } else {
                    while (true) {
                        if (abstractC7878q != null && abstractC7878q != x1Var) {
                            sb2.append(String.valueOf(abstractC7878q));
                            if (abstractC7878q.f37675f == x1Var) {
                                sb2.append("]");
                            } else {
                                sb2.append(",");
                                abstractC7878q = abstractC7878q.f37675f;
                            }
                        }
                    }
                }
                String string = sb2.toString();
                AbstractC4154l.m8922e(string, "toString(...)");
                return string;
            case 4:
                StringBuilder sb3 = new StringBuilder("[ kex=");
                sb3.append((String) this.f22538b);
                sb3.append("; sig=");
                sb3.append((String) this.f22539c);
                sb3.append("; c2sCipher=");
                sb3.append((String) this.f22540d);
                sb3.append("; s2cCipher=");
                sb3.append((String) this.f22541e);
                sb3.append("; c2sMAC=");
                sb3.append((String) this.f22542f);
                sb3.append("; s2cMAC=");
                sb3.append((String) this.f22543g);
                sb3.append("; c2sComp=");
                sb3.append((String) this.f22544h);
                sb3.append("; s2cComp=");
                return AbstractC1452a.m4564k(sb3, (String) this.f22545i, ";  ]");
            default:
                return super.toString();
        }
    }

    public C4535g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f22537a = 4;
        this.f22538b = str;
        this.f22539c = str2;
        this.f22540d = str3;
        this.f22541e = str4;
        this.f22542f = str5;
        this.f22543g = str6;
        this.f22544h = str7;
        this.f22545i = str8;
    }

    public C4535g(g0 g0Var) {
        this.f22537a = 3;
        this.f22538b = g0Var;
        C7649u c7649u = new C7649u(g0Var);
        this.f22539c = c7649u;
        this.f22540d = c7649u;
        x1 x1Var = c7649u.f37016V;
        this.f22541e = x1Var;
        this.f22542f = x1Var;
    }

    public C4535g() {
        this.f22537a = 1;
        this.f22538b = new C6788h(3);
        this.f22539c = new C6788h(3);
        this.f22540d = new C6788h(3);
        this.f22541e = new C6788h(3);
        this.f22542f = C6797q.f32307d;
        this.f22544h = new C0959n(new C0554l(new C0955j()));
        this.f22545i = C2032h.f9587b;
    }

    public C4535g(Context context, C7056b c7056b, C0914i c0914i, C7356d c7356d, WorkDatabase workDatabase, C0922q c0922q, ArrayList arrayList) {
        this.f22537a = 2;
        AbstractC4154l.m8923f(context, "context");
        this.f22538b = c7056b;
        this.f22539c = c0914i;
        this.f22540d = c7356d;
        this.f22541e = workDatabase;
        this.f22542f = c0922q;
        this.f22543g = arrayList;
        Context applicationContext = context.getApplicationContext();
        AbstractC4154l.m8922e(applicationContext, "context.applicationContext");
        this.f22544h = applicationContext;
        this.f22545i = new C4367l(27);
    }
}
