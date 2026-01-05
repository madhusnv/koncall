package y2;

import vx.C7800b;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y2.c */
/* loaded from: classes.dex */
public final class C8533c extends AbstractC8193c {

    /* renamed from: a */
    public ViewOnAttachStateChangeListenerC8534d f41457a;

    /* renamed from: b */
    public C7800b f41458b;

    /* renamed from: c */
    public /* synthetic */ Object f41459c;

    /* renamed from: d */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC8534d f41460d;

    /* renamed from: e */
    public int f41461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8533c(ViewOnAttachStateChangeListenerC8534d viewOnAttachStateChangeListenerC8534d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41460d = viewOnAttachStateChangeListenerC8534d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41459c = obj;
        this.f41461e |= Integer.MIN_VALUE;
        return this.f41460d.m15798a(this);
    }
}
