package o6;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.s */
/* loaded from: classes.dex */
public final class C5317s extends AbstractC8193c {

    /* renamed from: a */
    public C5321w f26142a;

    /* renamed from: b */
    public b1 f26143b;

    /* renamed from: c */
    public boolean f26144c;

    /* renamed from: d */
    public /* synthetic */ Object f26145d;

    /* renamed from: e */
    public final /* synthetic */ C5321w f26146e;

    /* renamed from: f */
    public int f26147f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5317s(C5321w c5321w, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f26146e = c5321w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f26145d = obj;
        this.f26147f |= Integer.MIN_VALUE;
        return C5321w.m10460e(this.f26146e, false, this);
    }
}
