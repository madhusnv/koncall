package qc;

import ac.EnumC0091d;
import ic.C3224b;
import ic.C3226d;
import ic.C3229g;
import ic.C3230h;
import ic.InterfaceC3227e;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import jc.C3733i;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import pg.AbstractC5927h;
import pg.g6;
import sc.AbstractC6791k;
import tc.C7117b;
import tc.C7123h;
import uw.InterfaceC7559c;
import yb.AbstractC8610b;
import zb.InterfaceC8909c;
import zb.InterfaceC8913g;
import zb.InterfaceC8914h;
import zb.InterfaceC8915i;
import zb.InterfaceC8916j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.g */
/* loaded from: classes.dex */
public final class C6161g implements InterfaceC8909c {

    /* renamed from: a */
    public String f30026a;

    /* renamed from: b */
    public final EnumC0091d f30027b;

    public C6161g(EnumC0091d enumC0091d) {
        this.f30027b = enumC0091d;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m12194c(qc.C6161g r4, zb.InterfaceC8913g r5, ww.AbstractC8193c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof qc.C6155a
            if (r0 == 0) goto L13
            r0 = r6
            qc.a r0 = (qc.C6155a) r0
            int r1 = r0.f30003f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30003f = r1
            goto L18
        L13:
            qc.a r0 = new qc.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f30001d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f30003f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qc.g r4 = r0.f30000c
            zb.g r5 = r0.f29999b
            qc.g r0 = r0.f29998a
            og.od.m10798c(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            og.od.m10798c(r6)
            java.lang.String r6 = r4.f30026a
            if (r6 != 0) goto L4f
            r0.f29998a = r4
            r0.f29999b = r5
            r0.f30000c = r4
            r0.f30003f = r3
            java.lang.Object r6 = r4.m12198b(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            java.lang.String r6 = (java.lang.String) r6
            goto L50
        L4f:
            r0 = r4
        L50:
            r4.f30026a = r6
            java.lang.String r4 = r0.f30026a
            if (r4 == 0) goto L60
            java.lang.String r6 = "context"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r5, r6)
            tc.h r4 = r0.m12197a(r5, r4)
            return r4
        L60:
            tc.a r4 = r5.mo12204d()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.C6161g.m12194c(qc.g, zb.g, ww.c):java.lang.Object");
    }

    /* renamed from: d */
    public static void m12195d(C3733i c3733i, String str) {
        Set setKeySet = ((Map) c3733i.f482a).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str2 = (String) obj;
            if (AbstractC5185w.m10138t(str2, "x-amz-checksum-", true) && !str2.equalsIgnoreCase(str)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            c3733i.m315C((String) obj2);
        }
    }

    /* renamed from: e */
    public static InterfaceC3227e m12196e(EnumC0091d enumC0091d, InterfaceC8913g interfaceC8913g) {
        AbstractC4154l.m8923f(interfaceC8913g, "<this>");
        String str = (String) interfaceC8913g.mo12202b().mo1864e(AbstractC6791k.f32300i);
        if (str != null) {
            InterfaceC3227e interfaceC3227eM11651i = g6.m11651i(str);
            if (enumC0091d == EnumC0091d.WHEN_SUPPORTED) {
                if ((interfaceC3227eM11651i instanceof C3224b) || (interfaceC3227eM11651i instanceof C3226d) || (interfaceC3227eM11651i instanceof C3229g) || (interfaceC3227eM11651i instanceof C3230h)) {
                    return interfaceC3227eM11651i;
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C7123h m12197a(InterfaceC8913g interfaceC8913g, String str) {
        C7117b c7117bM11670b = AbstractC5927h.m11670b(interfaceC8913g.mo12204d());
        InterfaceC3227e interfaceC3227eM12196e = m12196e(this.f30027b, interfaceC8913g);
        AbstractC4154l.m8920c(interfaceC3227eM12196e);
        String strM11649e = g6.m11649e(interfaceC3227eM12196e);
        c7117bM11670b.f34312c.m318F(str, strM11649e);
        m12195d(c7117bM11670b.f34312c, strM11649e);
        AbstractC8610b.m15956b(interfaceC8913g.mo12202b(), g6.m11650h(interfaceC3227eM12196e));
        return c7117bM11670b.m13401a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12198b(zb.InterfaceC8913g r7, ww.AbstractC8193c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof qc.C6159e
            if (r0 == 0) goto L13
            r0 = r8
            qc.e r0 = (qc.C6159e) r0
            int r1 = r0.f30021e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30021e = r1
            goto L18
        L13:
            qc.e r0 = new qc.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f30019c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f30021e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            ic.e r7 = r0.f30018b
            tc.b r0 = r0.f30017a
            og.od.m10798c(r8)
            goto L90
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            og.od.m10798c(r8)
            goto L77
        L3a:
            og.od.m10798c(r8)
            tc.a r8 = r7.mo12204d()
            tc.b r8 = pg.AbstractC5927h.m11670b(r8)
            ac.d r2 = r6.f30027b
            ic.e r7 = m12196e(r2, r7)
            kotlin.jvm.internal.AbstractC4154l.m8920c(r7)
            jc.u r2 = r8.f34313d
            java.lang.Long r2 = r2.getContentLength()
            if (r2 != 0) goto L7e
            jc.u r2 = r8.f34313d
            boolean r2 = r2.isOneShot()
            if (r2 != 0) goto L7e
            jc.u r8 = r8.f34313d
            wc.w r8 = pg.f8.m11626g(r8)
            kotlin.jvm.internal.AbstractC4154l.m8920c(r8)
            r2 = 0
            r0.f30017a = r2
            r0.f30018b = r2
            r0.f30021e = r4
            r2 = 8192(0x2000, double:4.0474E-320)
            java.io.Serializable r8 = wc.AbstractC7984r.m15164h(r8, r7, r2, r0)
            if (r8 != r1) goto L77
            goto L8c
        L77:
            byte[] r8 = (byte[]) r8
            java.lang.String r7 = sd.AbstractC6807a.m12983a(r8)
            return r7
        L7e:
            jc.u r2 = r8.f34313d
            r0.f30017a = r8
            r0.f30018b = r7
            r0.f30021e = r3
            java.io.Serializable r0 = pg.f8.m11621b(r2, r0)
            if (r0 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r5 = r0
            r0 = r8
            r8 = r5
        L90:
            byte[] r8 = (byte[]) r8
            if (r8 != 0) goto L97
            r8 = 0
            byte[] r8 = new byte[r8]
        L97:
            jc.u r1 = r0.f34313d
            boolean r1 = r1.isOneShot()
            if (r1 == 0) goto Laa
            jc.r r1 = jc.AbstractC3745u.Companion
            r1.getClass()
            mc.a r1 = jc.C3742r.m8277a(r8)
            r0.f34313d = r1
        Laa:
            java.lang.String r0 = "fn"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r7, r0)
            byte[] r7 = pg.g6.m11647b(r7, r8)
            java.lang.String r7 = sd.AbstractC6807a.m12983a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.C6161g.m12198b(zb.g, ww.c):java.lang.Object");
    }

    @Override // zb.InterfaceC8909c
    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    public final Object mo16556modifyBeforeAttemptCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c interfaceC7559c) {
        return ((C6165k) interfaceC8916j).f30040b;
    }

    @Override // zb.InterfaceC8909c
    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    public final Object mo16557modifyBeforeCompletiongIAlus(InterfaceC8916j interfaceC8916j, InterfaceC7559c interfaceC7559c) {
        return ((C6166l) interfaceC8916j).f30045b;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeDeserialization(InterfaceC8914h interfaceC8914h, InterfaceC7559c interfaceC7559c) {
        return ((C6170p) interfaceC8914h).f30062c;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeRetryLoop(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c) {
        return ((C6169o) interfaceC8913g).f30058b;
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeSerialization(InterfaceC8915i interfaceC8915i, InterfaceC7559c interfaceC7559c) {
        return ((C6167m) interfaceC8915i).f30049a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
    
        if (r8.longValue() > 1048576) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018d, code lost:
    
        if (r14 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019b, code lost:
    
        if (r14 == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // zb.InterfaceC8909c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object modifyBeforeSigning(zb.InterfaceC8913g r13, uw.InterfaceC7559c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.C6161g.modifyBeforeSigning(zb.g, uw.c):java.lang.Object");
    }

    @Override // zb.InterfaceC8909c
    public final Object modifyBeforeTransmit(InterfaceC8913g interfaceC8913g, InterfaceC7559c interfaceC7559c) {
        return ((C6169o) interfaceC8913g).f30058b;
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterAttempt(InterfaceC8916j interfaceC8916j) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterDeserialization(InterfaceC8916j interfaceC8916j) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterExecution(InterfaceC8916j interfaceC8916j) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterSerialization(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterSigning(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readAfterTransmit(InterfaceC8914h interfaceC8914h) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeAttempt(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeDeserialization(InterfaceC8914h interfaceC8914h) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeExecution(InterfaceC8915i interfaceC8915i) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeSerialization(InterfaceC8915i interfaceC8915i) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeSigning(InterfaceC8913g interfaceC8913g) {
    }

    @Override // zb.InterfaceC8909c
    public final void readBeforeTransmit(InterfaceC8913g interfaceC8913g) {
    }
}
