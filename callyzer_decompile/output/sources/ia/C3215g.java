package ia;

import an.e5;
import i9.C3183a;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import sc.C6804x;
import sc.InterfaceC6786f;
import ud.InterfaceC7411o;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ia.g */
/* loaded from: classes.dex */
public final class C3215g implements InterfaceC6786f {

    /* renamed from: a */
    public final InterfaceC7411o f17336a;

    /* renamed from: b */
    public final C4367l f17337b;

    /* renamed from: c */
    public final C4367l f17338c;

    public C3215g(InterfaceC7411o platformProvider) {
        AbstractC4154l.m8923f(platformProvider, "platformProvider");
        this.f17336a = platformProvider;
        this.f17337b = new C4367l(new C3183a(1, this, C3215g.class, "doResolveEndpoint", "doResolveEndpoint(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4));
        this.f17338c = new C4367l(new e5(this, null, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7557a(ww.AbstractC8193c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ia.C3212d
            if (r0 == 0) goto L13
            r0 = r5
            ia.d r0 = (ia.C3212d) r0
            int r1 = r0.f17329c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17329c = r1
            goto L18
        L13:
            ia.d r0 = new ia.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f17327a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17329c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.f17329c = r3
            l4.l r5 = r4.f17338c
            java.lang.Object r5 = r5.m9139s(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            ja.k r5 = (ja.C3617k) r5
            java.lang.String r0 = "ec2_metadata_service_endpoint"
            r1 = 0
            java.lang.String r5 = r5.m8168a(r0, r1)
            if (r5 == 0) goto L4e
            bc.a r0 = new bc.a
            r0.<init>(r5)
            return r0
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.C3215g.m7557a(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum m7558b(ww.AbstractC8193c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ia.C3213e
            if (r0 == 0) goto L13
            r0 = r5
            ia.e r0 = (ia.C3213e) r0
            int r1 = r0.f17332c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17332c = r1
            goto L18
        L13:
            ia.e r0 = new ia.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f17330a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17332c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.f17332c = r3
            l4.l r5 = r4.f17338c
            java.lang.Object r5 = r5.m9139s(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            ja.k r5 = (ja.C3617k) r5
            java.lang.String r0 = "ec2_metadata_service_endpoint_mode"
            r1 = 0
            java.lang.String r5 = r5.m8168a(r0, r1)
            if (r5 == 0) goto L52
            ia.a r0 = ia.EnumC3210b.Companion
            r0.getClass()
            ia.b r5 = ia.C3209a.m7555a(r5)
            return r5
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.C3215g.m7558b(ww.c):java.lang.Enum");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7559c(uw.InterfaceC7559c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ia.C3214f
            if (r0 == 0) goto L13
            r0 = r8
            ia.f r0 = (ia.C3214f) r0
            int r1 = r0.f17335c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17335c = r1
            goto L18
        L13:
            ia.f r0 = new ia.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f17333a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17335c
            ud.o r3 = r7.f17336a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            og.od.m10798c(r8)
            goto L7c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            og.od.m10798c(r8)
            goto L58
        L39:
            og.od.m10798c(r8)
            gc.b r8 = ea.AbstractC1976f.f9252k
            java.lang.Object r8 = gc.AbstractC2562f.m6572a(r8, r3)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L4c
            bc.a r2 = new bc.a
            r2.<init>(r8)
            goto L4d
        L4c:
            r2 = r6
        L4d:
            if (r2 != 0) goto L5b
            r0.f17335c = r5
            java.lang.Object r8 = r7.m7557a(r0)
            if (r8 != r1) goto L58
            goto L7b
        L58:
            r2 = r8
            bc.a r2 = (bc.C0642a) r2
        L5b:
            if (r2 == 0) goto L5e
            return r2
        L5e:
            gc.b r8 = ea.AbstractC1976f.f9253l
            java.lang.Object r8 = gc.AbstractC2562f.m6572a(r8, r3)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L71
            ia.a r2 = ia.EnumC3210b.Companion
            r2.getClass()
            ia.b r6 = ia.C3209a.m7555a(r8)
        L71:
            if (r6 != 0) goto L83
            r0.f17335c = r4
            java.lang.Enum r8 = r7.m7558b(r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            r6 = r8
            ia.b r6 = (ia.EnumC3210b) r6
            if (r6 != 0) goto L83
            ia.b r6 = ia.EnumC3210b.IPv4
        L83:
            bc.a r8 = r6.getDefaultEndpoint$aws_config()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.C3215g.m7559c(uw.c):java.lang.Object");
    }

    @Override // sc.InterfaceC6786f
    /* renamed from: o */
    public final Object mo1858o(C6804x c6804x, AbstractC8193c abstractC8193c) {
        return this.f17337b.m9139s(abstractC8193c);
    }
}
