package wm;

import android.content.Context;
import om.C5414p;
import pv.C6041a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wm.h */
/* loaded from: classes3.dex */
public final class C8112h extends AbstractC8193c {

    /* renamed from: a */
    public Context f38814a;

    /* renamed from: b */
    public C6041a f38815b;

    /* renamed from: c */
    public C5414p f38816c;

    /* renamed from: d */
    public /* synthetic */ Object f38817d;

    /* renamed from: e */
    public final /* synthetic */ C8114j f38818e;

    /* renamed from: f */
    public int f38819f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8112h(C8114j c8114j, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38818e = c8114j;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38817d = obj;
        this.f38819f |= Integer.MIN_VALUE;
        return this.f38818e.m15295j(null, null, this);
    }
}
