package hm;

import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.n */
/* loaded from: classes3.dex */
public final class C2978n extends AbstractC8193c {

    /* renamed from: a */
    public Object f16112a;

    /* renamed from: b */
    public Throwable f16113b;

    /* renamed from: c */
    public int f16114c;

    /* renamed from: d */
    public /* synthetic */ Object f16115d;

    /* renamed from: e */
    public final /* synthetic */ PhoneStateReceiver f16116e;

    /* renamed from: f */
    public int f16117f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2978n(PhoneStateReceiver phoneStateReceiver, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f16116e = phoneStateReceiver;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f16115d = obj;
        this.f16117f |= Integer.MIN_VALUE;
        return PhoneStateReceiver.m4596f(this.f16116e, this);
    }
}
