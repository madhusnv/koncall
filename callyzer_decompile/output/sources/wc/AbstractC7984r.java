package wc;

import b00.AbstractC0517b;
import i1.C3122a;
import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import pg.r7;
import v0.C7622f;
import ww.AbstractC8193c;
import xc.AbstractC8329j;
import xc.C8325f;
import xc.C8327h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.r */
/* loaded from: classes.dex */
public abstract class AbstractC7984r {

    /* renamed from: a */
    public static final C7970d f38412a = new C7970d(null);

    /* renamed from: a */
    public static final void m15157a(C7622f c7622f, Object resource) {
        AbstractC4154l.m8923f(c7622f, "<this>");
        AbstractC4154l.m8923f(resource, "resource");
        if (resource instanceof b0) {
            b0 b0Var = (b0) resource;
            synchronized (b0Var.f38338a) {
                a0 a0Var = b0Var.f38338a;
                if (a0Var.f38336b) {
                    throw new IllegalStateException("caller attempted to share() a fully unshared object");
                }
                a0Var.f38335a++;
            }
            ((List) c7622f.f36778a).add(b0Var);
        }
    }

    /* renamed from: b */
    public static final InterfaceC7986t m15158b(d0 d0Var) {
        AbstractC4154l.m8923f(d0Var, "<this>");
        if (d0Var instanceof InterfaceC7986t) {
            return (InterfaceC7986t) d0Var;
        }
        return new C7967a(AbstractC0517b.m1523b(d0Var instanceof C8325f ? ((C8325f) d0Var).f39899a : new C8327h(d0Var)));
    }

    /* renamed from: c */
    public static final InterfaceC7987u m15159c(e0 e0Var) {
        AbstractC4154l.m8923f(e0Var, "<this>");
        return e0Var instanceof InterfaceC7987u ? (InterfaceC7987u) e0Var : new C7968b(AbstractC0517b.m1524c(r7.m11851b(e0Var)));
    }

    /* renamed from: d */
    public static final void m15160d(Object obj) {
        AbstractC4154l.m8923f(obj, "<this>");
        if (obj instanceof Closeable) {
            ((Closeable) obj).close();
        }
    }

    /* renamed from: e */
    public static final Object m15161e(InterfaceC7989w interfaceC7989w, d0 d0Var, AbstractC8193c abstractC8193c) {
        return tx.c0.m13475K(AbstractC8329j.f39903a, new C3122a(d0Var, interfaceC7989w, null), abstractC8193c);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15162f(wc.InterfaceC7989w r7, wc.C7985s r8, ww.AbstractC8193c r9) {
        /*
            boolean r0 = r9 instanceof wc.C7990x
            if (r0 == 0) goto L13
            r0 = r9
            wc.x r0 = (wc.C7990x) r0
            int r1 = r0.f38417d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38417d = r1
            goto L18
        L13:
            wc.x r0 = new wc.x
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f38416c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38417d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            wc.s r7 = r0.f38415b
            wc.w r8 = r0.f38414a
            og.od.m10798c(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L4b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            og.od.m10798c(r9)
        L39:
            r0.f38414a = r7
            r0.f38415b = r8
            r0.f38417d = r3
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = r7.read(r8, r4, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            boolean r9 = r7.isClosedForRead()
            if (r9 == 0) goto L39
            qw.a0 r7 = qw.a0.f30746a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.AbstractC7984r.m15162f(wc.w, wc.s, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15163g(wc.InterfaceC7989w r4, ww.AbstractC8193c r5) {
        /*
            boolean r0 = r5 instanceof wc.C7991y
            if (r0 == 0) goto L13
            r0 = r5
            wc.y r0 = (wc.C7991y) r0
            int r1 = r0.f38420c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38420c = r1
            goto L18
        L13:
            wc.y r0 = new wc.y
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f38419b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38420c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wc.s r4 = r0.f38418a
            og.od.m10798c(r5)
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            og.od.m10798c(r5)
            wc.s r5 = new wc.s
            r5.<init>()
            r0.f38418a = r5
            r0.f38420c = r3
            java.lang.Object r4 = m15162f(r4, r5, r0)
            if (r4 != r1) goto L44
            return r1
        L44:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.AbstractC7984r.m15163g(wc.w, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0099 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m15164h(wc.InterfaceC7989w r11, ic.InterfaceC3227e r12, long r13, ww.AbstractC8193c r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof wc.C7992z
            if (r0 == 0) goto L13
            r0 = r15
            wc.z r0 = (wc.C7992z) r0
            int r1 = r0.f38427g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38427g = r1
            goto L18
        L13:
            wc.z r0 = new wc.z
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f38426f
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38427g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L46
            if (r2 != r4) goto L3e
            long r11 = r0.f38425e
            ic.e r13 = r0.f38424d
            wc.s r14 = r0.f38423c
            ic.e r2 = r0.f38422b
            wc.w r6 = r0.f38421a
            og.od.m10798c(r15)
            r9 = r2
            r2 = r14
            r10 = r0
            r0 = r15
            r14 = r11
            r12 = r9
            r11 = r6
            r6 = r10
            goto La0
        L3e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L46:
            long r11 = r0.f38425e
            wc.s r13 = r0.f38423c
            ic.e r14 = r0.f38422b
            wc.w r2 = r0.f38421a
            og.od.m10798c(r15)
            r9 = r14
            r14 = r13
            r13 = r9
            goto L7b
        L55:
            og.od.m10798c(r15)
            wc.s r15 = new wc.s
            r15.<init>()
        L5d:
            boolean r2 = r11.isClosedForRead()
            if (r2 != 0) goto Lab
            r0.f38421a = r11
            r0.f38422b = r12
            r0.f38423c = r15
            r0.f38424d = r3
            r0.f38425e = r13
            r0.f38427g = r5
            java.lang.Object r2 = r11.read(r15, r13, r0)
            if (r2 != r1) goto L76
            goto L98
        L76:
            r2 = r11
            r9 = r13
            r13 = r12
            r11 = r9
            r14 = r15
        L7b:
            r0.f38421a = r2
            r0.f38422b = r13
            r0.f38423c = r14
            r0.f38424d = r13
            r0.f38425e = r11
            r0.f38427g = r4
            ay.f r15 = tx.m0.f34659a
            ay.e r15 = ay.ExecutorC0495e.f3538c
            bu.a r6 = new bu.a
            r7 = 26
            r6.<init>(r14, r3, r7)
            java.lang.Object r15 = tx.c0.m13475K(r15, r6, r0)
            if (r15 != r1) goto L99
        L98:
            return r1
        L99:
            r6 = r0
            r0 = r15
            r9 = r11
            r12 = r13
            r11 = r2
            r2 = r14
            r14 = r9
        La0:
            byte[] r0 = (byte[]) r0
            r7 = 0
            int r8 = r0.length
            r13.update(r0, r7, r8)
            r13 = r14
            r15 = r2
            r0 = r6
            goto L5d
        Lab:
            byte[] r11 = r12.mo7578a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.AbstractC7984r.m15164h(wc.w, ic.e, long, ww.c):java.io.Serializable");
    }
}
