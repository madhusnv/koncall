package com.skydoves.balloon;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import java.util.Iterator;
import og.od;
import pg.n6;
import qw.a0;
import tx.C7251k;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.skydoves.balloon.Balloon$Companion$initConsumerIfNeeded$1", m15344f = "Balloon.kt", m15345l = {3330, 3355}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Balloon$Companion$initConsumerIfNeeded$1 extends AbstractC8199i implements InterfaceC2141e {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.skydoves.balloon.Balloon$Companion$initConsumerIfNeeded$1$1", m15344f = "Balloon.kt", m15345l = {3362}, m15346m = "invokeSuspend")
    /* renamed from: com.skydoves.balloon.Balloon$Companion$initConsumerIfNeeded$1$1 */
    public static final class C14061 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ Balloon $balloon;
        final /* synthetic */ DeferredBalloonGroup $group;
        final /* synthetic */ BalloonPlacement $placement;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14061(Balloon balloon, BalloonPlacement balloonPlacement, DeferredBalloonGroup deferredBalloonGroup, InterfaceC7559c<? super C14061> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$balloon = balloon;
            this.$placement = balloonPlacement;
            this.$group = deferredBalloonGroup;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C14061(this.$balloon, this.$placement, this.$group, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                Balloon balloon = this.$balloon;
                BalloonPlacement balloonPlacement = this.$placement;
                final DeferredBalloonGroup deferredBalloonGroup = this.$group;
                this.L$0 = balloon;
                this.L$1 = balloonPlacement;
                this.L$2 = deferredBalloonGroup;
                this.label = 1;
                final C7251k c7251k = new C7251k(1, n6.m11797c(this));
                c7251k.m13540p();
                balloon.show(balloonPlacement);
                final OnBalloonDismissListener onBalloonDismissListener = balloon.builder.getOnBalloonDismissListener();
                balloon.setOnBalloonDismissListener(new InterfaceC2137a() { // from class: com.skydoves.balloon.Balloon$Companion$initConsumerIfNeeded$1$1$1$1
                    @Override // ex.InterfaceC2137a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m16660invoke();
                        return a0.f30746a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m16660invoke() {
                        c7251k.resumeWith(a0.f30746a);
                        OnBalloonDismissListener onBalloonDismissListener2 = onBalloonDismissListener;
                        if (onBalloonDismissListener2 != null) {
                            onBalloonDismissListener2.onBalloonDismiss();
                        }
                        if (deferredBalloonGroup.getDismissSequentially()) {
                            return;
                        }
                        Iterator<T> it = deferredBalloonGroup.getBalloons().iterator();
                        while (it.hasNext()) {
                            ((DeferredBalloon) it.next()).getBalloon().dismiss();
                        }
                    }
                });
                if (c7251k.m13539o() == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C14061) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    public Balloon$Companion$initConsumerIfNeeded$1(InterfaceC7559c<? super Balloon$Companion$initConsumerIfNeeded$1> interfaceC7559c) {
        super(2, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        Balloon$Companion$initConsumerIfNeeded$1 balloon$Companion$initConsumerIfNeeded$1 = new Balloon$Companion$initConsumerIfNeeded$1(interfaceC7559c);
        balloon$Companion$initConsumerIfNeeded$1.L$0 = obj;
        return balloon$Companion$initConsumerIfNeeded$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        if (tx.c0.m13483f(r5, r12) == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:33:0x00c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bf -> B:33:0x00c2). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r12.L$1
            vx.b r1 = (vx.C7800b) r1
            java.lang.Object r4 = r12.L$0
            tx.z r4 = (tx.InterfaceC7266z) r4
            og.od.m10798c(r13)
            goto Lc2
        L19:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L21:
            java.lang.Object r1 = r12.L$1
            vx.b r1 = (vx.C7800b) r1
            java.lang.Object r4 = r12.L$0
            tx.z r4 = (tx.InterfaceC7266z) r4
            og.od.m10798c(r13)
            goto L4f
        L2d:
            og.od.m10798c(r13)
            java.lang.Object r13 = r12.L$0
            tx.z r13 = (tx.InterfaceC7266z) r13
            com.skydoves.balloon.Balloon$Companion r1 = com.skydoves.balloon.Balloon.Companion
            vx.l r1 = r1.getChannel()
            vx.b r1 = r1.iterator()
        L3e:
            r12.L$0 = r13
            r12.L$1 = r1
            r12.label = r3
            java.lang.Object r4 = r1.m14752b(r12)
            if (r4 != r0) goto L4c
            goto Lc1
        L4c:
            r11 = r4
            r4 = r13
            r13 = r11
        L4f:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lc5
            java.lang.Object r13 = r1.m14753c()
            com.skydoves.balloon.DeferredBalloonGroup r13 = (com.skydoves.balloon.DeferredBalloonGroup) r13
            java.util.List r5 = r13.getBalloons()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto Lc2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r6 = r13.getBalloons()
            java.util.Iterator r6 = r6.iterator()
        L74:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb5
            java.lang.Object r7 = r6.next()
            com.skydoves.balloon.DeferredBalloon r7 = (com.skydoves.balloon.DeferredBalloon) r7
            com.skydoves.balloon.Balloon r8 = r7.component1()
            com.skydoves.balloon.BalloonPlacement r7 = r7.component2()
            android.view.View r9 = r7.getAnchor()
            boolean r9 = com.skydoves.balloon.Balloon.access$canShowBalloonWindow(r8, r9)
            if (r9 == 0) goto L74
            boolean r9 = r8.shouldShowUp()
            if (r9 != 0) goto La6
            com.skydoves.balloon.Balloon$Builder r7 = com.skydoves.balloon.Balloon.access$getBuilder$p(r8)
            ex.a r7 = r7.getRunIfReachedShowCounts()
            if (r7 == 0) goto L74
            r7.invoke()
            goto L74
        La6:
            com.skydoves.balloon.Balloon$Companion$initConsumerIfNeeded$1$1 r9 = new com.skydoves.balloon.Balloon$Companion$initConsumerIfNeeded$1$1
            r10 = 0
            r9.<init>(r8, r7, r13, r10)
            r7 = 3
            tx.g0 r7 = tx.c0.m13482e(r4, r10, r9, r7)
            r5.add(r7)
            goto L74
        Lb5:
            r12.L$0 = r4
            r12.L$1 = r1
            r12.label = r2
            java.lang.Object r13 = tx.c0.m13483f(r5, r12)
            if (r13 != r0) goto Lc2
        Lc1:
            return r0
        Lc2:
            r13 = r4
            goto L3e
        Lc5:
            qw.a0 r13 = qw.a0.f30746a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.balloon.Balloon$Companion$initConsumerIfNeeded$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
        return ((Balloon$Companion$initConsumerIfNeeded$1) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
