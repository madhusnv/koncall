package d5;

import e5.InterfaceC1950e;
import g5.AbstractC2523m;
import g5.C2517g;
import java.util.ArrayList;
import java.util.Collections;
import y4.C8553n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d5.g */
/* loaded from: classes.dex */
public class C1603g extends C1598b implements InterfaceC1950e {

    /* renamed from: k0, reason: collision with root package name */
    public final C8553n f44180k0;

    /* renamed from: l0, reason: collision with root package name */
    public final EnumC1608l f44181l0;

    /* renamed from: m0, reason: collision with root package name */
    public final ArrayList f44182m0;

    public C1603g(C8553n c8553n, EnumC1608l enumC1608l) {
        super(c8553n);
        this.f44182m0 = new ArrayList();
        this.f44180k0 = c8553n;
        this.f44181l0 = enumC1608l;
    }

    @Override // d5.C1598b, d5.InterfaceC1604h
    /* renamed from: b */
    public final C2517g mo5238b() {
        return mo5258s();
    }

    /* renamed from: q */
    public final void m5256q(Object... objArr) {
        Collections.addAll(this.f44182m0, objArr);
    }

    /* renamed from: r */
    public final void m5257r() throws NumberFormatException {
        super.apply();
    }

    /* renamed from: s */
    public AbstractC2523m mo5258s() {
        return null;
    }

    @Override // d5.C1598b, d5.InterfaceC1604h
    public void apply() {
    }
}
