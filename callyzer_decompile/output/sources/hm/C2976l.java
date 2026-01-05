package hm;

import android.content.Context;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import mm.C4792c;
import mm.C4796g;
import mm.C4803n;
import pv.C6041a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.l */
/* loaded from: classes3.dex */
public final class C2976l extends AbstractC8193c {

    /* renamed from: a */
    public Context f16096a;

    /* renamed from: b */
    public C6041a f16097b;

    /* renamed from: c */
    public C4803n f16098c;

    /* renamed from: d */
    public C4796g f16099d;

    /* renamed from: e */
    public C4792c f16100e;

    /* renamed from: f */
    public boolean f16101f;

    /* renamed from: g */
    public /* synthetic */ Object f16102g;

    /* renamed from: h */
    public final /* synthetic */ PhoneStateReceiver f16103h;

    /* renamed from: j */
    public int f16104j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2976l(PhoneStateReceiver phoneStateReceiver, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f16103h = phoneStateReceiver;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f16102g = obj;
        this.f16104j |= Integer.MIN_VALUE;
        PhoneStateReceiver phoneStateReceiver = this.f16103h;
        int i10 = PhoneStateReceiver.f7281A;
        return phoneStateReceiver.m4609s(null, null, false, this);
    }
}
