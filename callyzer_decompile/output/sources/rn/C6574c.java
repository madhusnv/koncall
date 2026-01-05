package rn;

import ex.InterfaceC2141e;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rn.c */
/* loaded from: classes3.dex */
public final class C6574c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f31474a;

    /* renamed from: b */
    public int f31475b;

    /* renamed from: c */
    public final /* synthetic */ h0 f31476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6574c(h0 h0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f31474a = i10;
        this.f31476c = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f31474a) {
            case 0:
                return new C6574c(this.f31476c, interfaceC7559c, 0);
            default:
                return new C6574c(this.f31476c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f31474a) {
        }
        return ((C6574c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f31474a
            switch(r0) {
                case 0: goto L3a;
                default: goto L5;
            }
        L5:
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r10.f31475b
            r2 = 1
            if (r1 == 0) goto L20
            if (r1 != r2) goto L18
            og.od.m10798c(r11)
            qw.n r11 = (qw.C6364n) r11
            r11.getClass()
            r8 = r10
            goto L37
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            og.od.m10798c(r11)
            rn.h0 r11 = r10.f31476c
            wo.s r3 = r11.f31526h
            r10.f31475b = r2
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "CallRecordingUseCase"
            r9 = 7
            r8 = r10
            java.lang.Object r11 = wo.C8134s.m15300o(r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L37
            goto L39
        L37:
            qw.a0 r0 = qw.a0.f30746a
        L39:
            return r0
        L3a:
            r8 = r10
            rn.h0 r0 = r8.f31476c
            android.content.Context r1 = r0.f31519a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r8.f31475b
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L5b
            if (r3 == r5) goto L57
            if (r3 != r4) goto L4f
            og.od.m10798c(r11)
            goto L72
        L4f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L57:
            og.od.m10798c(r11)
            goto L69
        L5b:
            og.od.m10798c(r11)
            r8.f31475b = r5
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r11 = tx.c0.m13489l(r5, r10)
            if (r11 != r2) goto L69
            goto Lc5
        L69:
            r8.f31475b = r4
            java.lang.Object r11 = r0.m12620n(r10)
            if (r11 != r2) goto L72
            goto Lc5
        L72:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 <= 0) goto Lc3
            po.e r2 = r0.f31527i
            r11 = 2131951843(0x7f1300e3, float:1.9540112E38)
            java.lang.String r4 = r1.getString(r11)
            r11 = 2131951844(0x7f1300e4, float:1.9540114E38)
            java.lang.String r5 = r1.getString(r11)
            java.lang.String r11 = "getString(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r5, r11)
            zv.c r0 = new zv.c
            r3 = 2131952735(0x7f13045f, float:1.9541921E38)
            java.lang.String r3 = r1.getString(r3)
            kotlin.jvm.internal.AbstractC4154l.m8922e(r3, r11)
            android.content.Intent r11 = new android.content.Intent
            java.lang.Class<com.websoptimization.callyzerbiz.services.CallRecordingNotificationActionService> r6 = com.websoptimization.callyzerbiz.services.CallRecordingNotificationActionService.class
            r11.<init>(r1, r6)
            java.lang.String r6 = "action"
            java.lang.String r7 = "UploadWork"
            r11.putExtra(r6, r7)
            r6 = 0
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r11 = android.app.PendingIntent.getService(r1, r6, r11, r7)
            java.lang.String r1 = "getService(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r11, r1)
            r0.<init>(r3, r11)
            java.util.List r6 = og.pe.m10833h(r0)
            r7 = 56
            r3 = 562(0x232, float:7.88E-43)
            po.C5984e.m12017i(r2, r3, r4, r5, r6, r7)
        Lc3:
            qw.a0 r2 = qw.a0.f30746a
        Lc5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.C6574c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
