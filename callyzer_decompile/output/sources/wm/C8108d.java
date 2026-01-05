package wm;

import android.content.Context;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wm.d */
/* loaded from: classes3.dex */
public final class C8108d extends AbstractC8193c {

    /* renamed from: a */
    public Context f38791a;

    /* renamed from: b */
    public /* synthetic */ Object f38792b;

    /* renamed from: c */
    public final /* synthetic */ C8114j f38793c;

    /* renamed from: d */
    public int f38794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8108d(C8114j c8114j, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38793c = c8114j;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38792b = obj;
        this.f38794d |= Integer.MIN_VALUE;
        return C8114j.m15289d(this.f38793c, null, this);
    }
}
