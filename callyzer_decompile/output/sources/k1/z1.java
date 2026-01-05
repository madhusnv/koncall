package k1;

import ex.InterfaceC2141e;
import p3.C5819q;
import uw.InterfaceC7559c;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z1 extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public long f20339b;

    /* renamed from: c */
    public int f20340c;

    /* renamed from: d */
    public /* synthetic */ Object f20341d;

    /* renamed from: e */
    public final /* synthetic */ C5819q f20342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(C5819q c5819q, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20342e = c5819q;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        z1 z1Var = new z1(this.f20342e, interfaceC7559c);
        z1Var.f20341d = obj;
        return z1Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((z1) create((p3.f0) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:12:0x0041). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r7.f20340c
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f20339b
            java.lang.Object r1 = r7.f20341d
            p3.f0 r1 = (p3.f0) r1
            og.od.m10798c(r8)
            goto L41
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            og.od.m10798c(r8)
            java.lang.Object r8 = r7.f20341d
            p3.f0 r8 = (p3.f0) r8
            p3.q r1 = r7.f20342e
            long r3 = r1.f28477b
            w3.t2 r1 = r8.m11386d()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L32:
            r7.f20341d = r1
            r7.f20339b = r3
            r7.f20340c = r2
            r8 = 0
            r5 = 3
            java.lang.Object r8 = k1.i2.m8449c(r1, r8, r7, r5)
            if (r8 != r0) goto L41
            return r0
        L41:
            p3.q r8 = (p3.C5819q) r8
            long r5 = r8.f28477b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L32
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.z1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
