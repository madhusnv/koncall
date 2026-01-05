package io;

import java.io.File;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: io.a */
/* loaded from: classes3.dex */
public final class C3326a extends AbstractC8193c {

    /* renamed from: a */
    public File f17599a;

    /* renamed from: b */
    public StringBuilder f17600b;

    /* renamed from: c */
    public StringBuilder f17601c;

    /* renamed from: d */
    public boolean f17602d;

    /* renamed from: e */
    public /* synthetic */ Object f17603e;

    /* renamed from: f */
    public final /* synthetic */ C3330e f17604f;

    /* renamed from: g */
    public int f17605g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3326a(C3330e c3330e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17604f = c3330e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17603e = obj;
        this.f17605g |= Integer.MIN_VALUE;
        return this.f17604f.m7661g(null, false, this);
    }
}
