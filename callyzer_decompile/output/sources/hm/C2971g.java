package hm;

import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import java.util.List;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.g */
/* loaded from: classes3.dex */
public final class C2971g extends AbstractC8193c {

    /* renamed from: a */
    public List f16060a;

    /* renamed from: b */
    public List f16061b;

    /* renamed from: c */
    public String f16062c;

    /* renamed from: d */
    public int f16063d;

    /* renamed from: e */
    public /* synthetic */ Object f16064e;

    /* renamed from: f */
    public final /* synthetic */ PhoneStateReceiver f16065f;

    /* renamed from: g */
    public int f16066g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2971g(PhoneStateReceiver phoneStateReceiver, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f16065f = phoneStateReceiver;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f16064e = obj;
        this.f16066g |= Integer.MIN_VALUE;
        return PhoneStateReceiver.m4594d(this.f16065f, null, this);
    }
}
