package c4;

import s4.C6755k;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c4.a */
/* loaded from: classes.dex */
public final class C0851a extends AbstractC8193c {

    /* renamed from: a */
    public ScrollCaptureCallbackC0854d f5367a;

    /* renamed from: b */
    public Object f5368b;

    /* renamed from: c */
    public C6755k f5369c;

    /* renamed from: d */
    public int f5370d;

    /* renamed from: e */
    public int f5371e;

    /* renamed from: f */
    public /* synthetic */ Object f5372f;

    /* renamed from: g */
    public final /* synthetic */ ScrollCaptureCallbackC0854d f5373g;

    /* renamed from: h */
    public int f5374h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0851a(ScrollCaptureCallbackC0854d scrollCaptureCallbackC0854d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f5373g = scrollCaptureCallbackC0854d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f5372f = obj;
        this.f5374h |= Integer.MIN_VALUE;
        return ScrollCaptureCallbackC0854d.m2296a(this.f5373g, null, null, this);
    }
}
