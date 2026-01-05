package lv;

import java.util.List;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lv.a */
/* loaded from: classes3.dex */
public final class C4529a extends AbstractC8193c {

    /* renamed from: a */
    public List f22502a;

    /* renamed from: b */
    public /* synthetic */ Object f22503b;

    /* renamed from: c */
    public final /* synthetic */ C4531c f22504c;

    /* renamed from: d */
    public int f22505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4529a(C4531c c4531c, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f22504c = c4531c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f22503b = obj;
        this.f22505d |= Integer.MIN_VALUE;
        return this.f22504c.m9378b(this);
    }
}
