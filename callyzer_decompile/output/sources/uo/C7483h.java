package uo;

import android.content.Context;
import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uo.h */
/* loaded from: classes3.dex */
public final class C7483h extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public boolean f36124a;

    /* renamed from: b */
    public int f36125b;

    /* renamed from: c */
    public final /* synthetic */ C7485j f36126c;

    /* renamed from: d */
    public final /* synthetic */ Context f36127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7483h(C7485j c7485j, Context context, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f36126c = c7485j;
        this.f36127d = context;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C7483h(this.f36126c, this.f36127d, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C7483h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r11 = this;
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r11.f36125b
            java.lang.String r2 = "need_to_update_device_settings"
            qw.a0 r3 = qw.a0.f30746a
            android.content.Context r4 = r11.f36127d
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            uo.j r9 = r11.f36126c
            if (r1 == 0) goto L37
            if (r1 == r8) goto L33
            if (r1 == r7) goto L2d
            if (r1 == r6) goto L27
            if (r1 != r5) goto L1f
            og.od.m10798c(r12)
            goto Lb1
        L1f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L27:
            og.od.m10798c(r12)     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            return r3
        L2b:
            r12 = move-exception
            goto L89
        L2d:
            boolean r1 = r11.f36124a
            og.od.m10798c(r12)     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            goto L5f
        L33:
            og.od.m10798c(r12)     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            goto L44
        L37:
            og.od.m10798c(r12)
            r11.f36125b = r8     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            java.lang.Object r12 = uo.C7485j.m14284a(r9, r4, r11)     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            if (r12 != r0) goto L44
            goto Lb0
        L44:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            boolean r1 = r12.booleanValue()     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            xm.y2 r12 = r9.f36143b     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            r10 = r1 ^ 1
            r11.f36124a = r1     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            r11.f36125b = r7     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            fn.i r12 = r12.f41035a     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            java.lang.Object r12 = r12.m6031k(r2, r10, r11)     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            if (r12 != r0) goto L5b
            goto L5c
        L5b:
            r12 = r3
        L5c:
            if (r12 != r0) goto L5f
            goto Lb0
        L5f:
            java.lang.String r12 = pg.y8.m11946a(r4)     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            if (r12 == 0) goto Lb1
            int r4 = r12.length()     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            if (r4 != 0) goto L6c
            goto Lb1
        L6c:
            xm.y2 r4 = r9.f36143b     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            r11.f36124a = r1     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            r11.f36125b = r6     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            fn.i r1 = r4.f41035a     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            km.a r1 = r1.f10585a     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            java.lang.String r4 = "default_dialer_package"
            km.o r1 = (km.C4120o) r1     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            java.lang.Object r12 = r1.m8891m(r4, r12, r11)     // Catch: com.websoptimization.callyzerbiz.common.exception.SimStateException -> L2b
            if (r12 != r0) goto L81
            goto L82
        L81:
            r12 = r3
        L82:
            if (r12 != r0) goto L85
            goto L86
        L85:
            r12 = r3
        L86:
            if (r12 != r0) goto Lb1
            goto Lb0
        L89:
            yv.t r1 = r9.f36147f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "saveDeviceSettings:- "
            r4.<init>(r6)
            com.websoptimization.callyzerbiz.common.exception.SimStateException$a r12 = r12.f7329a
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r1.m16231f(r12)
            xm.y2 r12 = r9.f36143b
            r11.f36125b = r5
            fn.i r12 = r12.f41035a
            java.lang.Object r12 = r12.m6031k(r2, r8, r11)
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            if (r12 != r1) goto Lad
            goto Lae
        Lad:
            r12 = r3
        Lae:
            if (r12 != r0) goto Lb1
        Lb0:
            return r0
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.C7483h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
