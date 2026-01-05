package hm;

import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import j$.time.LocalDateTime;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.c */
/* loaded from: classes3.dex */
public final class C2967c extends AbstractC8193c {

    /* renamed from: a */
    public String f16037a;

    /* renamed from: b */
    public LocalDateTime f16038b;

    /* renamed from: c */
    public /* synthetic */ Object f16039c;

    /* renamed from: d */
    public final /* synthetic */ PhoneStateReceiver f16040d;

    /* renamed from: e */
    public int f16041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2967c(PhoneStateReceiver phoneStateReceiver, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f16040d = phoneStateReceiver;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f16039c = obj;
        this.f16041e |= Integer.MIN_VALUE;
        PhoneStateReceiver phoneStateReceiver = this.f16040d;
        int i10 = PhoneStateReceiver.f7281A;
        return phoneStateReceiver.m4597g(null, null, this);
    }
}
