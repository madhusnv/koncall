package d7;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.v */
/* loaded from: classes.dex */
public final class C1650v {

    /* renamed from: a */
    public EnumC1645q f8140a;

    /* renamed from: b */
    public InterfaceC1647s f8141b;

    /* renamed from: a */
    public final void m5352a(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        EnumC1645q targetState = enumC1644p.getTargetState();
        EnumC1645q state1 = this.f8140a;
        AbstractC4154l.m8923f(state1, "state1");
        if (targetState != null && targetState.compareTo(state1) < 0) {
            state1 = targetState;
        }
        this.f8140a = state1;
        this.f8141b.mo1120u(interfaceC1649u, enumC1644p);
        this.f8140a = targetState;
    }
}
