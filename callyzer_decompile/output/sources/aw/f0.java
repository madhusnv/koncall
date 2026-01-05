package aw;

import com.websoptimization.callyzerbiz.workManager.SyncCallLogNotificationManager;
import ex.InterfaceC2141e;
import java.io.Serializable;
import kotlin.jvm.internal.C4166x;
import o6.C5321w;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class f0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3348a = 0;

    /* renamed from: b */
    public int f3349b;

    /* renamed from: c */
    public Object f3350c;

    /* renamed from: d */
    public boolean f3351d;

    /* renamed from: e */
    public Serializable f3352e;

    /* renamed from: f */
    public Serializable f3353f;

    /* renamed from: g */
    public Object f3354g;

    /* renamed from: h */
    public final /* synthetic */ Object f3355h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(SyncCallLogNotificationManager syncCallLogNotificationManager, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3355h = syncCallLogNotificationManager;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3348a) {
            case 0:
                return new f0((SyncCallLogNotificationManager) this.f3355h, interfaceC7559c);
            default:
                f0 f0Var = new f0((C4166x) this.f3353f, (C5321w) this.f3354g, this.f3355h, this.f3351d, interfaceC7559c);
                f0Var.f3350c = obj;
                return f0Var;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3348a) {
            case 0:
                return ((f0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((f0) create((o6.h0) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r11.m10450b(r3, r31) == r10) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f6, code lost:
    
        if (r2 == r13) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0238, code lost:
    
        if (r1.m16472h(r2, true, r4, r6, r31) == r13) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0221  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(C4166x c4166x, C5321w c5321w, Object obj, boolean z6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3353f = c4166x;
        this.f3354g = c5321w;
        this.f3355h = obj;
        this.f3351d = z6;
    }
}
