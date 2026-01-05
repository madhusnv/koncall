package lv;

import java.util.List;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lv.b */
/* loaded from: classes3.dex */
public final class C4530b extends AbstractC8193c {

    /* renamed from: a */
    public List f22506a;

    /* renamed from: b */
    public /* synthetic */ Object f22507b;

    /* renamed from: c */
    public final /* synthetic */ C4531c f22508c;

    /* renamed from: d */
    public int f22509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4530b(C4531c c4531c, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f22508c = c4531c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f22507b = obj;
        this.f22509d |= Integer.MIN_VALUE;
        return this.f22508c.m9380d(this);
    }
}
