package k1;

import ex.InterfaceC2141e;
import s4.C6761q;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public long f20288a;

    /* renamed from: b */
    public int f20289b;

    /* renamed from: c */
    public /* synthetic */ long f20290c;

    /* renamed from: d */
    public final /* synthetic */ x1 f20291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(x1 x1Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20291d = x1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        w1 w1Var = new w1(this.f20291d, interfaceC7559c);
        w1Var.f20290c = ((C6761q) obj).f32216a;
        return w1Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        long j6 = ((C6761q) obj).f32216a;
        w1 w1Var = new w1(this.f20291d, (InterfaceC7559c) obj2);
        w1Var.f20290c = j6;
        return w1Var.invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r14.f20289b
            r2 = 3
            r3 = 2
            r4 = 1
            k1.x1 r5 = r14.f20291d
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            long r0 = r14.f20288a
            long r2 = r14.f20290c
            og.od.m10798c(r15)
            goto L71
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            long r3 = r14.f20288a
            long r6 = r14.f20290c
            og.od.m10798c(r15)
            goto L57
        L29:
            long r6 = r14.f20290c
            og.od.m10798c(r15)
            goto L41
        L2f:
            og.od.m10798c(r15)
            long r6 = r14.f20290c
            o3.d r15 = r5.f20314f
            r14.f20290c = r6
            r14.f20289b = r4
            java.lang.Object r15 = r15.m10429b(r6, r14)
            if (r15 != r0) goto L41
            goto L6e
        L41:
            s4.q r15 = (s4.C6761q) r15
            long r8 = r15.f32216a
            long r8 = s4.C6761q.m12961d(r6, r8)
            r14.f20290c = r6
            r14.f20288a = r8
            r14.f20289b = r3
            java.lang.Object r15 = r5.m8476b(r8, r14)
            if (r15 != r0) goto L56
            goto L6e
        L56:
            r3 = r8
        L57:
            s4.q r15 = (s4.C6761q) r15
            long r11 = r15.f32216a
            o3.d r8 = r5.f20314f
            long r9 = s4.C6761q.m12961d(r3, r11)
            r14.f20290c = r6
            r14.f20288a = r11
            r14.f20289b = r2
            r13 = r14
            java.lang.Object r15 = r8.m10428a(r9, r11, r13)
            if (r15 != r0) goto L6f
        L6e:
            return r0
        L6f:
            r2 = r6
            r0 = r11
        L71:
            s4.q r15 = (s4.C6761q) r15
            long r4 = r15.f32216a
            long r0 = s4.C6761q.m12961d(r0, r4)
            long r0 = s4.C6761q.m12961d(r2, r0)
            s4.q r15 = new s4.q
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
