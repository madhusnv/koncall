package jb;

import nf.C5047i;
import sc.C6804x;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jb.a */
/* loaded from: classes.dex */
public final class C3699a extends AbstractC8193c {

    /* renamed from: a */
    public C6804x f19438a;

    /* renamed from: b */
    public /* synthetic */ Object f19439b;

    /* renamed from: c */
    public final /* synthetic */ C5047i f19440c;

    /* renamed from: d */
    public int f19441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3699a(C5047i c5047i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f19440c = c5047i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f19439b = obj;
        this.f19441d |= Integer.MIN_VALUE;
        return this.f19440c.mo1858o(null, this);
    }
}
