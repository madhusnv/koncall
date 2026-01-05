package i9;

import java.io.Serializable;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.p */
/* loaded from: classes.dex */
public final class C3198p extends AbstractC8193c {

    /* renamed from: a */
    public Serializable f17226a;

    /* renamed from: b */
    public Serializable f17227b;

    /* renamed from: c */
    public /* synthetic */ Object f17228c;

    /* renamed from: d */
    public final /* synthetic */ C3199q f17229d;

    /* renamed from: e */
    public int f17230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3198p(C3199q c3199q, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f17229d = c3199q;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17228c = obj;
        this.f17230e |= Integer.MIN_VALUE;
        return this.f17229d.m7550h(this);
    }
}
