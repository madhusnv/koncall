package xm;

import com.websoptimization.callyzerbiz.data.model.request.NotesSyncRequest;
import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q1 extends AbstractC8193c {

    /* renamed from: a */
    public NotesSyncRequest f40727a;

    /* renamed from: b */
    public InterfaceC1853a f40728b;

    /* renamed from: c */
    public int f40729c;

    /* renamed from: d */
    public /* synthetic */ Object f40730d;

    /* renamed from: e */
    public final /* synthetic */ x1 f40731e;

    /* renamed from: f */
    public int f40732f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(x1 x1Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40731e = x1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40730d = obj;
        this.f40732f |= Integer.MIN_VALUE;
        return this.f40731e.m15653D(null, this);
    }
}
