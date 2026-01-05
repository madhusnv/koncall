package b2;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import uw.InterfaceC7559c;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public final /* synthetic */ int f3704b;

    /* renamed from: c */
    public int f3705c;

    /* renamed from: d */
    public /* synthetic */ Object f3706d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2139c f3707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3704b = i10;
        this.f3707e = interfaceC2139c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3704b) {
            case 0:
                c0 c0Var = new c0(this.f3707e, interfaceC7559c, 0);
                c0Var.f3706d = obj;
                return c0Var;
            default:
                c0 c0Var2 = new c0(this.f3707e, interfaceC7559c, 1);
                c0Var2.f3706d = obj;
                return c0Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        p3.f0 f0Var = (p3.f0) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f3704b) {
        }
        return ((c0) create(f0Var, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008b -> B:33:0x008e). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f3704b
            ex.c r1 = r6.f3707e
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            switch(r0) {
                case 0: goto L63;
                default: goto La;
            }
        La:
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r6.f3705c
            r5 = 2
            if (r4 == 0) goto L27
            if (r4 == r3) goto L1f
            if (r4 != r5) goto L19
            og.od.m10798c(r7)
            goto L59
        L19:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
            throw r7
        L1f:
            java.lang.Object r2 = r6.f3706d
            p3.f0 r2 = (p3.f0) r2
            og.od.m10798c(r7)
            goto L3a
        L27:
            og.od.m10798c(r7)
            java.lang.Object r7 = r6.f3706d
            r2 = r7
            p3.f0 r2 = (p3.f0) r2
            r6.f3706d = r2
            r6.f3705c = r3
            java.lang.Object r7 = pg.q7.m11832a(r2, r6)
            if (r7 != r0) goto L3a
            goto L62
        L3a:
            p3.q r7 = (p3.C5819q) r7
            r7.m11405a()
            long r3 = r7.f28478c
            c3.b r7 = new c3.b
            r7.<init>(r3)
            r1.invoke(r7)
            r7 = 0
            r6.f3706d = r7
            r6.f3705c = r5
            k1.g0 r7 = k1.i2.f20132a
            p3.k r7 = p3.EnumC5813k.Main
            java.lang.Object r7 = k1.i2.m8453g(r2, r7, r6)
            if (r7 != r0) goto L59
            goto L62
        L59:
            p3.q r7 = (p3.C5819q) r7
            if (r7 == 0) goto L60
            r7.m11405a()
        L60:
            qw.a0 r0 = qw.a0.f30746a
        L62:
            return r0
        L63:
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r6.f3705c
            if (r4 == 0) goto L79
            if (r4 != r3) goto L73
            java.lang.Object r2 = r6.f3706d
            p3.f0 r2 = (p3.f0) r2
            og.od.m10798c(r7)
            goto L8e
        L73:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
            throw r7
        L79:
            og.od.m10798c(r7)
            java.lang.Object r7 = r6.f3706d
            p3.f0 r7 = (p3.f0) r7
            r2 = r7
        L81:
            p3.k r7 = p3.EnumC5813k.Initial
            r6.f3706d = r2
            r6.f3705c = r3
            java.lang.Object r7 = r2.m11384b(r7, r6)
            if (r7 != r0) goto L8e
            return r0
        L8e:
            p3.j r7 = (p3.C5812j) r7
            boolean r7 = ja.AbstractC3629w.m8174f(r7)
            r7 = r7 ^ r3
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r1.invoke(r7)
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
