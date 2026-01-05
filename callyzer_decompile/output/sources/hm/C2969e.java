package hm;

import android.content.Context;
import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import java.util.List;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4166x;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.e */
/* loaded from: classes3.dex */
public final class C2969e extends AbstractC8193c {

    /* renamed from: a */
    public Context f16045a;

    /* renamed from: b */
    public List f16046b;

    /* renamed from: c */
    public C4166x f16047c;

    /* renamed from: d */
    public C4164v f16048d;

    /* renamed from: e */
    public C4164v f16049e;

    /* renamed from: f */
    public int f16050f;

    /* renamed from: g */
    public int f16051g;

    /* renamed from: h */
    public int f16052h;

    /* renamed from: j */
    public /* synthetic */ Object f16053j;

    /* renamed from: k */
    public final /* synthetic */ PhoneStateReceiver f16054k;

    /* renamed from: l */
    public int f16055l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2969e(PhoneStateReceiver phoneStateReceiver, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f16054k = phoneStateReceiver;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f16053j = obj;
        this.f16055l |= Integer.MIN_VALUE;
        PhoneStateReceiver phoneStateReceiver = this.f16054k;
        int i10 = PhoneStateReceiver.f7281A;
        return phoneStateReceiver.m4598h(null, 0, this);
    }
}
