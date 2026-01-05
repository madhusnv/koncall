package db;

import bb.C0640a;
import sc.C6804x;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: db.a */
/* loaded from: classes.dex */
public final class C1679a extends AbstractC8193c {

    /* renamed from: a */
    public C6804x f8216a;

    /* renamed from: b */
    public /* synthetic */ Object f8217b;

    /* renamed from: c */
    public final /* synthetic */ C0640a f8218c;

    /* renamed from: d */
    public int f8219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679a(C0640a c0640a, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8218c = c0640a;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8217b = obj;
        this.f8219d |= Integer.MIN_VALUE;
        return this.f8218c.mo1858o(null, this);
    }
}
