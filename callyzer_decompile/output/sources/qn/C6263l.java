package qn;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import ct.C1502a;
import fn.C2336i;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import om.C5405g;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rw.AbstractC6663m;
import ww.AbstractC8199i;
import xm.l2;
import xm.y5;
import yv.AbstractC8804s;
import yv.C8800o;
import yv.C8805t;
import yx.C8810d;
import zm.EnumC8992b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qn.l */
/* loaded from: classes3.dex */
public final class C6263l {

    /* renamed from: a */
    public final l2 f30351a;

    /* renamed from: b */
    public final y5 f30352b;

    /* renamed from: c */
    public final Context f30353c;

    /* renamed from: d */
    public final C2336i f30354d;

    /* renamed from: e */
    public final C8805t f30355e;

    /* renamed from: f */
    public final C8810d f30356f;

    public C6263l(l2 l2Var, y5 userSIMRepository, Context context, C2336i dataStoreSource, C8805t c8805t, C8810d c8810d) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(dataStoreSource, "dataStoreSource");
        this.f30351a = l2Var;
        this.f30352b = userSIMRepository;
        this.f30353c = context;
        this.f30354d = dataStoreSource;
        this.f30355e = c8805t;
        this.f30356f = c8810d;
    }

    /* renamed from: a */
    public static String m12255a(String title) {
        AbstractC4154l.m8923f(title, "title");
        Pattern patternCompile = Pattern.compile("[/'\"%^`{}\\[\\]<>]");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(title).replaceAll("");
        AbstractC4154l.m8922e(strReplaceAll, "replaceAll(...)");
        Pattern patternCompile2 = Pattern.compile("\\s+");
        AbstractC4154l.m8922e(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(" ");
        AbstractC4154l.m8922e(strReplaceAll2, "replaceAll(...)");
        return AbstractC6663m.m12748L(AbstractC6663m.m12761Y(AbstractC5178p.m10112W(AbstractC5178p.f0(150, AbstractC5178p.g0(strReplaceAll2).toString()), new String[]{" "}, 6), 3), " ", null, null, null, 62);
    }

    /* renamed from: b */
    public final void m12256b(String description) {
        AbstractC4154l.m8923f(description, "description");
        Object systemService = this.f30353c.getSystemService("clipboard");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AnnotatedPrivateKey.LABEL, description));
        String str = AbstractC8804s.f42473a;
        AbstractC8804s.f42473a = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (m12267m(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12257c(java.lang.String r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qn.C6252a
            if (r0 == 0) goto L13
            r0 = r7
            qn.a r0 = (qn.C6252a) r0
            int r1 = r0.f30300d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30300d = r1
            goto L18
        L13:
            qn.a r0 = new qn.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f30298b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f30300d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            boolean r6 = r0.f30297a
            og.od.m10798c(r7)
            goto L59
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            og.od.m10798c(r7)
            goto L46
        L38:
            og.od.m10798c(r7)
            r0.f30300d = r4
            xm.l2 r7 = r5.f30351a
            java.lang.Object r7 = r7.m15585a(r6, r0)
            if (r7 != r1) goto L46
            goto L58
        L46:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L59
            r0.f30297a = r6
            r0.f30300d = r3
            java.lang.Object r7 = r5.m12267m(r0)
            if (r7 != r1) goto L59
        L58:
            return r1
        L59:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C6263l.m12257c(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12258d(int r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qn.C6253b
            if (r0 == 0) goto L13
            r0 = r7
            qn.b r0 = (qn.C6253b) r0
            int r1 = r0.f30305e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30305e = r1
            goto L18
        L13:
            qn.b r0 = new qn.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f30303c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f30305e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            boolean r6 = r0.f30302b
            og.od.m10798c(r7)
            goto L60
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.f30301a
            og.od.m10798c(r7)
            goto L4a
        L3a:
            og.od.m10798c(r7)
            r0.f30301a = r6
            r0.f30305e = r4
            xm.l2 r7 = r5.f30351a
            java.lang.Object r7 = r7.m15587c(r6, r0)
            if (r7 != r1) goto L4a
            goto L5e
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L61
            r0.f30301a = r6
            r0.f30302b = r7
            r0.f30305e = r3
            java.lang.Object r6 = r5.m12267m(r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            r6 = r7
        L60:
            r7 = r6
        L61:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C6263l.m12258d(int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12259e(ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C6263l.m12259e(ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (r1 == r3) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c9 -> B:13:0x004e). Please report as a decompilation issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12260f(java.lang.String r20, ww.AbstractC8193c r21) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C6263l.m12260f(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m12261g(java.lang.String r12, ww.AbstractC8193c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof qn.C6256e
            if (r0 == 0) goto L13
            r0 = r13
            qn.e r0 = (qn.C6256e) r0
            int r1 = r0.f30326c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30326c = r1
            goto L18
        L13:
            qn.e r0 = new qn.e
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f30324a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f30326c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r13)
            goto L3f
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            og.od.m10798c(r13)
            r0.f30326c = r3
            xm.l2 r13 = r11.f30351a
            gn.x2 r13 = r13.f40530a
            java.lang.Object r13 = r13.m6672R(r12, r0)
            if (r13 != r1) goto L3f
            return r1
        L3f:
            java.util.List r13 = (java.util.List) r13
            java.util.ArrayList r12 = new java.util.ArrayList
            r0 = 10
            int r0 = rw.AbstractC6664n.m12768r(r13, r0)
            r12.<init>(r0)
            java.util.Iterator r13 = r13.iterator()
        L50:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r13.next()
            om.g r0 = (om.C5405g) r0
            ct.a r1 = new ct.a
            java.lang.String r2 = r0.f27131b
            java.lang.String r3 = r0.f27132c
            boolean r4 = r0.f27133d
            int r5 = r0.f27130a
            java.lang.String r8 = r0.f27139j
            r9 = 0
            r10 = 432(0x1b0, float:6.05E-43)
            r6 = 0
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.add(r1)
            goto L50
        L74:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C6263l.m12261g(java.lang.String, ww.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12262h(int r17, ww.AbstractC8193c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof qn.C6257f
            if (r2 == 0) goto L17
            r2 = r1
            qn.f r2 = (qn.C6257f) r2
            int r3 = r2.f30329c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f30329c = r3
            goto L1c
        L17:
            qn.f r2 = new qn.f
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f30327a
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f30329c
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            og.od.m10798c(r1)
            goto L50
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            og.od.m10798c(r1)
            r2.f30329c = r5
            xm.l2 r1 = r0.f30351a
            gn.x2 r1 = r1.f40530a
            an.m4 r1 = r1.f14949i
            z7.w r4 = r1.f1106a
            an.h4 r6 = new an.h4
            r7 = 1
            r8 = r17
            r6.<init>(r8, r1, r7)
            r1 = 0
            java.lang.Object r1 = og.pe.m10839n(r2, r4, r5, r1, r6)
            if (r1 != r3) goto L50
            return r3
        L50:
            pm.a r1 = (pm.C5974a) r1
            r2 = 0
            if (r1 == 0) goto L58
            om.g r3 = r1.f29217a
            goto L59
        L58:
            r3 = r2
        L59:
            if (r3 != 0) goto L5c
            return r2
        L5c:
            java.lang.Integer r1 = r1.f29218b
            if (r1 == 0) goto L65
            int r1 = r1.intValue()
            goto L66
        L65:
            r1 = r5
        L66:
            int r10 = r3.f27130a
            java.lang.String r7 = r3.f27131b
            java.lang.String r8 = r3.f27132c
            boolean r9 = r3.f27133d
            java.lang.String r12 = r3.f27138i
            int r11 = r3.f27137h
            java.lang.String r13 = r3.f27139j
            int r1 = r1 - r5
            ct.a r6 = new ct.a
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r1)
            r15 = 256(0x100, float:3.59E-43)
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C6263l.m12262h(int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m12263i(java.lang.String r13, java.lang.String r14, ww.AbstractC8193c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof qn.C6258g
            if (r0 == 0) goto L13
            r0 = r15
            qn.g r0 = (qn.C6258g) r0
            int r1 = r0.f30333d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30333d = r1
            goto L18
        L13:
            qn.g r0 = new qn.g
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f30331b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f30333d
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r14 = r0.f30330a
            og.od.m10798c(r15)
        L28:
            r9 = r14
            goto L44
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            og.od.m10798c(r15)
            r0.f30330a = r14
            r0.f30333d = r3
            xm.l2 r15 = r12.f30351a
            gn.x2 r15 = r15.f40530a
            java.lang.Object r15 = r15.m6670P(r13, r14, r0)
            if (r15 != r1) goto L28
            return r1
        L44:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = rw.AbstractC6664n.m12768r(r15, r14)
            r13.<init>(r14)
            java.util.Iterator r14 = r15.iterator()
        L55:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L7b
            java.lang.Object r15 = r14.next()
            pm.a r15 = (pm.C5974a) r15
            om.g r0 = r15.f29217a
            ct.a r2 = new ct.a
            java.lang.String r3 = r0.f27131b
            java.lang.String r4 = r0.f27132c
            boolean r5 = r0.f27133d
            int r6 = r0.f27130a
            java.lang.String r8 = r0.f27138i
            java.lang.Integer r10 = r15.f29218b
            r11 = 272(0x110, float:3.81E-43)
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.add(r2)
            goto L55
        L7b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C6263l.m12263i(java.lang.String, java.lang.String, ww.c):java.io.Serializable");
    }

    /* renamed from: j */
    public final Object m12264j(C1502a c1502a, AbstractC8199i abstractC8199i) {
        String str = c1502a.f7588a;
        String str2 = c1502a.f7589b;
        boolean z6 = c1502a.f7590c;
        EnumC8992b enumC8992b = EnumC8992b.TEMPLATE_ADD;
        int i10 = c1502a.f7592e;
        String str3 = c1502a.f7593f;
        String str4 = c1502a.f7594g;
        C8800o c8800o = C8800o.f42459a;
        return this.f30351a.m15589e(new C5405g(0, str, str2, z6, null, C8800o.m16204m(), enumC8992b, i10, str3, str4), abstractC8199i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        if (r13 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d8, code lost:
    
        if (r13 == r1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12265k(java.lang.String r12, ww.AbstractC8193c r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C6263l.m12265k(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12266l(java.lang.String r7, ww.AbstractC8193c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof qn.C6260i
            if (r0 == 0) goto L13
            r0 = r8
            qn.i r0 = (qn.C6260i) r0
            int r1 = r0.f30342c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30342c = r1
            goto L18
        L13:
            qn.i r0 = new qn.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f30340a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f30342c
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            og.od.m10798c(r8)
            return r3
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            og.od.m10798c(r8)
            goto L46
        L38:
            og.od.m10798c(r8)
            r0.f30342c = r5
            xm.y5 r8 = r6.f30352b
            java.lang.Object r8 = r8.m15702r(r7, r0)
            if (r8 != r1) goto L46
            goto L54
        L46:
            mm.m r8 = (mm.C4802m) r8
            if (r8 == 0) goto L56
            r0.f30342c = r4
            xm.l2 r7 = r6.f30351a
            java.lang.Object r7 = r7.m15592h(r8, r0)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            return r3
        L56:
            java.lang.String r7 = "fetchAllCallNoteTemplate"
            java.lang.String r8 = "User Sim Details is null"
            yv.t r0 = r6.f30355e
            r0.m16232g(r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C6263l.m12266l(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r15 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009c -> B:22:0x005a). Please report as a decompilation issue!!! */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12267m(ww.AbstractC8193c r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof qn.C6261j
            if (r0 == 0) goto L13
            r0 = r15
            qn.j r0 = (qn.C6261j) r0
            int r1 = r0.f30347e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30347e = r1
            goto L18
        L13:
            qn.j r0 = new qn.j
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.f30345c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f30347e
            xm.l2 r3 = r14.f30351a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            java.util.Iterator r2 = r0.f30343a
            og.od.m10798c(r15)
            r15 = r2
            goto L5a
        L32:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3a:
            mm.m r2 = r0.f30344b
            java.util.Iterator r7 = r0.f30343a
            og.od.m10798c(r15)
            goto L8c
        L42:
            og.od.m10798c(r15)
            goto L54
        L46:
            og.od.m10798c(r15)
            r0.f30347e = r6
            xm.y5 r15 = r14.f30352b
            java.lang.Object r15 = r15.m15696l(r0)
            if (r15 != r1) goto L54
            goto L9b
        L54:
            java.util.List r15 = (java.util.List) r15
            java.util.Iterator r15 = r15.iterator()
        L5a:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r15.next()
            mm.m r2 = (mm.C4802m) r2
            java.lang.String r7 = r2.f23891c
            if (r7 == 0) goto L5a
            r0.getClass()
            r0.f30343a = r15
            r0.f30344b = r2
            r0.f30347e = r5
            gn.x2 r8 = r3.f40530a
            an.m4 r8 = r8.f14949i
            zm.b r9 = zm.EnumC8992b.TEMPLATE_DELETED
            z7.w r10 = r8.f1106a
            an.j4 r11 = new an.j4
            r12 = 4
            r11.<init>(r8, r9, r7, r12)
            r7 = 0
            java.lang.Object r7 = og.pe.m10839n(r0, r10, r6, r7, r11)
            if (r7 != r1) goto L89
            goto L9b
        L89:
            r13 = r7
            r7 = r15
            r15 = r13
        L8c:
            java.util.List r15 = (java.util.List) r15
            r0.f30343a = r7
            r8 = 0
            r0.f30344b = r8
            r0.f30347e = r4
            java.lang.Object r15 = r3.m15593i(r15, r2, r0)
            if (r15 != r1) goto L9c
        L9b:
            return r1
        L9c:
            r15 = r7
            goto L5a
        L9e:
            qw.a0 r15 = qw.a0.f30746a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C6263l.m12267m(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12268n(java.lang.String r8, java.lang.String r9, int r10, ww.AbstractC8193c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof qn.C6262k
            if (r0 == 0) goto L14
            r0 = r11
            qn.k r0 = (qn.C6262k) r0
            int r1 = r0.f30350c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f30350c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            qn.k r0 = new qn.k
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f30348a
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r6.f30350c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            og.od.m10798c(r11)
            goto L48
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            og.od.m10798c(r11)
            yv.o r11 = yv.C8800o.f42459a
            j$.time.LocalDateTime r4 = yv.C8800o.m16204m()
            r6.f30350c = r2
            xm.l2 r1 = r7.f30351a
            r2 = r8
            r3 = r9
            r5 = r10
            java.lang.Object r11 = r1.m15596l(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L48
            return r0
        L48:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r11.getClass()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C6263l.m12268n(java.lang.String, java.lang.String, int, ww.c):java.lang.Object");
    }
}
