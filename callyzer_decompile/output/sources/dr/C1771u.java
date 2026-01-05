package dr;

import en.C2073f;
import java.util.ArrayList;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.u */
/* loaded from: classes3.dex */
public final class C1771u extends AbstractC8193c {

    /* renamed from: a */
    public C2073f f8594a;

    /* renamed from: b */
    public ArrayList f8595b;

    /* renamed from: c */
    public int f8596c;

    /* renamed from: d */
    public /* synthetic */ Object f8597d;

    /* renamed from: e */
    public final /* synthetic */ C1772v f8598e;

    /* renamed from: f */
    public int f8599f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771u(C1772v c1772v, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f8598e = c1772v;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8597d = obj;
        this.f8599f |= Integer.MIN_VALUE;
        return this.f8598e.m5444c(null, this);
    }
}
