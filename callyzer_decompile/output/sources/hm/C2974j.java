package hm;

import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.j */
/* loaded from: classes3.dex */
public final class C2974j extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f16085a;

    /* renamed from: b */
    public final /* synthetic */ PhoneStateReceiver f16086b;

    /* renamed from: c */
    public int f16087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2974j(PhoneStateReceiver phoneStateReceiver, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f16086b = phoneStateReceiver;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f16085a = obj;
        this.f16087c |= Integer.MIN_VALUE;
        PhoneStateReceiver phoneStateReceiver = this.f16086b;
        int i10 = PhoneStateReceiver.f7281A;
        return phoneStateReceiver.m4607q(null, this);
    }
}
