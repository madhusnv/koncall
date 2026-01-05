package hm;

import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import pv.C6041a;
import pv.C6042b;
import ww.AbstractC8193c;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.k */
/* loaded from: classes3.dex */
public final class C2975k extends AbstractC8193c {

    /* renamed from: a */
    public C6041a f16088a;

    /* renamed from: b */
    public m1 f16089b;

    /* renamed from: c */
    public Object f16090c;

    /* renamed from: d */
    public C6042b f16091d;

    /* renamed from: e */
    public int f16092e;

    /* renamed from: f */
    public /* synthetic */ Object f16093f;

    /* renamed from: g */
    public final /* synthetic */ PhoneStateReceiver f16094g;

    /* renamed from: h */
    public int f16095h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2975k(PhoneStateReceiver phoneStateReceiver, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f16094g = phoneStateReceiver;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f16093f = obj;
        this.f16095h |= Integer.MIN_VALUE;
        PhoneStateReceiver phoneStateReceiver = this.f16094g;
        int i10 = PhoneStateReceiver.f7281A;
        return phoneStateReceiver.m4608r(null, this);
    }
}
