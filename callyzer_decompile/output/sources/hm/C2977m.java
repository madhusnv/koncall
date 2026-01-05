package hm;

import android.content.Context;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import om.C5414p;
import pv.C6041a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.m */
/* loaded from: classes3.dex */
public final class C2977m extends AbstractC8193c {

    /* renamed from: a */
    public Context f16105a;

    /* renamed from: b */
    public C6041a f16106b;

    /* renamed from: c */
    public C5414p f16107c;

    /* renamed from: d */
    public boolean f16108d;

    /* renamed from: e */
    public /* synthetic */ Object f16109e;

    /* renamed from: f */
    public final /* synthetic */ PhoneStateReceiver f16110f;

    /* renamed from: g */
    public int f16111g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2977m(PhoneStateReceiver phoneStateReceiver, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f16110f = phoneStateReceiver;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f16109e = obj;
        this.f16111g |= Integer.MIN_VALUE;
        PhoneStateReceiver phoneStateReceiver = this.f16110f;
        int i10 = PhoneStateReceiver.f7281A;
        return phoneStateReceiver.m4610t(null, null, false, this);
    }
}
