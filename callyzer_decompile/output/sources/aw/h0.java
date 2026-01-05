package aw;

import com.websoptimization.callyzerbiz.workManager.SyncCallLogNotificationManager;
import ex.InterfaceC2141e;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public Object f3369a;

    /* renamed from: b */
    public SyncCallLogNotificationManager f3370b;

    /* renamed from: c */
    public Throwable f3371c;

    /* renamed from: d */
    public StringBuilder f3372d;

    /* renamed from: e */
    public int f3373e;

    /* renamed from: f */
    public int f3374f;

    /* renamed from: g */
    public final /* synthetic */ SyncCallLogNotificationManager f3375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(SyncCallLogNotificationManager syncCallLogNotificationManager, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3375g = syncCallLogNotificationManager;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new h0(this.f3375g, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x014d, code lost:
    
        if (r0 == r9) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0151, code lost:
    
        r0 = r7;
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a7, code lost:
    
        if (r1.m16472h(900000, true, r2, r3, r16) == r9) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e3, code lost:
    
        if (r0.m16471g(r16) == r9) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c4  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
