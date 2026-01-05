package com.amplifyframework.auth.cognito;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vx.InterfaceC7810l;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$queueChannel$1$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {589, 101}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AWSCognitoAuthPlugin$queueChannel$1$1 extends AbstractC8199i implements InterfaceC2141e {
    final /* synthetic */ InterfaceC7810l $this_apply;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSCognitoAuthPlugin$queueChannel$1$1(InterfaceC7810l interfaceC7810l, InterfaceC7559c<? super AWSCognitoAuthPlugin$queueChannel$1$1> interfaceC7559c) {
        super(2, interfaceC7559c);
        this.$this_apply = interfaceC7810l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        return new AWSCognitoAuthPlugin$queueChannel$1$1(this.$this_apply, interfaceC7559c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r13.mo13508U(r12) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:7:0x0028, B:18:0x0061, B:22:0x0082, B:24:0x008a, B:14:0x0051, B:17:0x005a), top: B:33:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00aa -> B:8:0x002b). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L55
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            int r1 = r12.I$2
            int r6 = r12.I$1
            int r7 = r12.I$0
            java.lang.Object r8 = r12.L$5
            tx.e1 r8 = (tx.e1) r8
            java.lang.Object r8 = r12.L$3
            vx.b r8 = (vx.C7800b) r8
            java.lang.Object r9 = r12.L$2
            vx.w r9 = (vx.InterfaceC7821w) r9
            java.lang.Object r9 = r12.L$1
            vx.w r9 = (vx.InterfaceC7821w) r9
            java.lang.Object r10 = r12.L$0
            vx.w r10 = (vx.InterfaceC7821w) r10
            og.od.m10798c(r13)     // Catch: java.lang.Throwable -> L30
        L2b:
            r13 = r7
            r7 = r1
            r1 = r13
            r13 = r8
            goto L61
        L30:
            r13 = move-exception
            goto Lb3
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3b:
            int r1 = r12.I$2
            int r6 = r12.I$1
            int r7 = r12.I$0
            java.lang.Object r8 = r12.L$3
            vx.b r8 = (vx.C7800b) r8
            java.lang.Object r9 = r12.L$2
            vx.w r9 = (vx.InterfaceC7821w) r9
            java.lang.Object r9 = r12.L$1
            vx.w r9 = (vx.InterfaceC7821w) r9
            java.lang.Object r10 = r12.L$0
            vx.w r10 = (vx.InterfaceC7821w) r10
            og.od.m10798c(r13)     // Catch: java.lang.Throwable -> L30
            goto L82
        L55:
            og.od.m10798c(r13)
            vx.l r9 = r12.$this_apply
            vx.b r13 = r9.iterator()     // Catch: java.lang.Throwable -> L30
            r1 = r4
            r6 = r1
            r7 = r6
        L61:
            r12.L$0 = r5     // Catch: java.lang.Throwable -> L30
            r12.L$1 = r9     // Catch: java.lang.Throwable -> L30
            r12.L$2 = r5     // Catch: java.lang.Throwable -> L30
            r12.L$3 = r13     // Catch: java.lang.Throwable -> L30
            r12.L$4 = r5     // Catch: java.lang.Throwable -> L30
            r12.L$5 = r5     // Catch: java.lang.Throwable -> L30
            r12.I$0 = r1     // Catch: java.lang.Throwable -> L30
            r12.I$1 = r6     // Catch: java.lang.Throwable -> L30
            r12.I$2 = r7     // Catch: java.lang.Throwable -> L30
            r12.label = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r13.m14752b(r12)     // Catch: java.lang.Throwable -> L30
            if (r8 != r0) goto L7c
            goto Lac
        L7c:
            r11 = r8
            r8 = r13
            r13 = r11
            r11 = r7
            r7 = r1
            r1 = r11
        L82:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L30
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L30
            if (r13 == 0) goto Lad
            java.lang.Object r13 = r8.m14753c()     // Catch: java.lang.Throwable -> L30
            tx.e1 r13 = (tx.e1) r13     // Catch: java.lang.Throwable -> L30
            r12.L$0 = r5     // Catch: java.lang.Throwable -> L30
            r12.L$1 = r9     // Catch: java.lang.Throwable -> L30
            r12.L$2 = r5     // Catch: java.lang.Throwable -> L30
            r12.L$3 = r8     // Catch: java.lang.Throwable -> L30
            r12.L$4 = r5     // Catch: java.lang.Throwable -> L30
            r12.L$5 = r5     // Catch: java.lang.Throwable -> L30
            r12.I$0 = r7     // Catch: java.lang.Throwable -> L30
            r12.I$1 = r6     // Catch: java.lang.Throwable -> L30
            r12.I$2 = r1     // Catch: java.lang.Throwable -> L30
            r12.I$3 = r4     // Catch: java.lang.Throwable -> L30
            r12.label = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r13 = r13.mo13508U(r12)     // Catch: java.lang.Throwable -> L30
            if (r13 != r0) goto L2b
        Lac:
            return r0
        Lad:
            r9.mo14777j(r5)
            qw.a0 r13 = qw.a0.f30746a
            return r13
        Lb3:
            throw r13     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r0 = move-exception
            pg.p6.m11814a(r9, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$queueChannel$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
        return ((AWSCognitoAuthPlugin$queueChannel$1$1) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
