package mv;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import ov.AbstractC5753d;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mv.e */
/* loaded from: classes3.dex */
public final class C4891e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24417a;

    /* renamed from: b */
    public /* synthetic */ Object f24418b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f24419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4891e(InterfaceC2137a interfaceC2137a, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24417a = i10;
        this.f24419c = interfaceC2137a;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24417a) {
            case 0:
                C4891e c4891e = new C4891e(this.f24419c, interfaceC7559c, 0);
                c4891e.f24418b = obj;
                return c4891e;
            default:
                C4891e c4891e2 = new C4891e(this.f24419c, interfaceC7559c, 1);
                c4891e2.f24418b = obj;
                return c4891e2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f24417a) {
            case 0:
                C4891e c4891e = (C4891e) create((AbstractC5753d) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c4891e.invokeSuspend(a0Var);
                return a0Var;
            default:
                return ((C4891e) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        return r1.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r0.m13579l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        throw r5;
     */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.f24417a
            ex.a r1 = r4.f24419c
            switch(r0) {
                case 0: goto L5a;
                default: goto L7;
            }
        L7:
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            og.od.m10798c(r5)
            java.lang.Object r5 = r4.f24418b
            tx.z r5 = (tx.InterfaceC7266z) r5
            uw.h r5 = r5.mo1865w()
            tx.y1 r0 = new tx.y1     // Catch: java.lang.InterruptedException -> L47
            r0.<init>()     // Catch: java.lang.InterruptedException -> L47
            tx.e1 r5 = tx.c0.m13495r(r5)     // Catch: java.lang.InterruptedException -> L47
            r2 = 1
            tx.o0 r5 = tx.c0.m13498u(r5, r2, r0)     // Catch: java.lang.InterruptedException -> L47
            r0.f34700f = r5     // Catch: java.lang.InterruptedException -> L47
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = tx.y1.f34698g     // Catch: java.lang.InterruptedException -> L47
        L26:
            int r2 = r5.get(r0)     // Catch: java.lang.InterruptedException -> L47
            if (r2 == 0) goto L38
            r5 = 2
            if (r2 == r5) goto L3f
            r5 = 3
            if (r2 != r5) goto L33
            goto L3f
        L33:
            tx.y1.m13578m(r2)     // Catch: java.lang.InterruptedException -> L47
            r5 = 0
            throw r5     // Catch: java.lang.InterruptedException -> L47
        L38:
            r3 = 0
            boolean r2 = r5.compareAndSet(r0, r2, r3)     // Catch: java.lang.InterruptedException -> L47
            if (r2 == 0) goto L26
        L3f:
            java.lang.Object r5 = r1.invoke()     // Catch: java.lang.Throwable -> L49
            r0.m13579l()     // Catch: java.lang.InterruptedException -> L47
            return r5
        L47:
            r5 = move-exception
            goto L4e
        L49:
            r5 = move-exception
            r0.m13579l()     // Catch: java.lang.InterruptedException -> L47
            throw r5     // Catch: java.lang.InterruptedException -> L47
        L4e:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Blocking call was interrupted due to parent cancellation"
            r0.<init>(r1)
            java.lang.Throwable r5 = r0.initCause(r5)
            throw r5
        L5a:
            java.lang.Object r0 = r4.f24418b
            ov.d r0 = (ov.AbstractC5753d) r0
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            og.od.m10798c(r5)
            ov.a r5 = ov.C5750a.f28307a
            boolean r5 = kotlin.jvm.internal.AbstractC4154l.m8918a(r0, r5)
            if (r5 == 0) goto L6e
            r1.invoke()
        L6e:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mv.C4891e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
