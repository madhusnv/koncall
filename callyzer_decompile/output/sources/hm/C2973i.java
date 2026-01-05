package hm;

import android.content.Context;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.i */
/* loaded from: classes3.dex */
public final class C2973i extends AbstractC8193c {

    /* renamed from: a */
    public Context f16080a;

    /* renamed from: b */
    public boolean f16081b;

    /* renamed from: c */
    public /* synthetic */ Object f16082c;

    /* renamed from: d */
    public final /* synthetic */ PhoneStateReceiver f16083d;

    /* renamed from: e */
    public int f16084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2973i(PhoneStateReceiver phoneStateReceiver, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f16083d = phoneStateReceiver;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f16082c = obj;
        this.f16084e |= Integer.MIN_VALUE;
        return PhoneStateReceiver.m4595e(this.f16083d, null, false, this);
    }
}
