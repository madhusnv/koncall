package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import b6.InterfaceC0600a;
import c6.InterfaceC0883m;
import c6.InterfaceC0888r;
import d7.AbstractC1646r;
import g8.C2545e;
import g8.InterfaceC2547g;
import p007h.AbstractC2757i;
import p007h.InterfaceC2758j;
import q5.InterfaceC6124q;
import q5.InterfaceC6125r;
import r5.InterfaceC6470e;
import r5.InterfaceC6471f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends u0 implements InterfaceC6470e, InterfaceC6471f, InterfaceC6124q, InterfaceC6125r, d7.c1, p004e.e0, InterfaceC2758j, InterfaceC2547g, o1, InterfaceC0883m {

    /* renamed from: e */
    public final /* synthetic */ o0 f2643e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var) {
        super(o0Var);
        this.f2643e = o0Var;
    }

    @Override // androidx.fragment.app.o1
    /* renamed from: a */
    public final void mo1121a(j1 j1Var, j0 j0Var) {
        this.f2643e.onAttachFragment(j0Var);
    }

    @Override // c6.InterfaceC0883m
    public final void addMenuProvider(InterfaceC0888r interfaceC0888r) {
        this.f2643e.addMenuProvider(interfaceC0888r);
    }

    @Override // r5.InterfaceC6470e
    public final void addOnConfigurationChangedListener(InterfaceC0600a interfaceC0600a) {
        this.f2643e.addOnConfigurationChangedListener(interfaceC0600a);
    }

    @Override // q5.InterfaceC6124q
    public final void addOnMultiWindowModeChangedListener(InterfaceC0600a interfaceC0600a) {
        this.f2643e.addOnMultiWindowModeChangedListener(interfaceC0600a);
    }

    @Override // q5.InterfaceC6125r
    public final void addOnPictureInPictureModeChangedListener(InterfaceC0600a interfaceC0600a) {
        this.f2643e.addOnPictureInPictureModeChangedListener(interfaceC0600a);
    }

    @Override // r5.InterfaceC6471f
    public final void addOnTrimMemoryListener(InterfaceC0600a interfaceC0600a) {
        this.f2643e.addOnTrimMemoryListener(interfaceC0600a);
    }

    @Override // androidx.fragment.app.r0
    /* renamed from: b */
    public final View mo1115b(int i10) {
        return this.f2643e.findViewById(i10);
    }

    @Override // androidx.fragment.app.r0
    /* renamed from: c */
    public final boolean mo1116c() {
        Window window = this.f2643e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p007h.InterfaceC2758j
    public final AbstractC2757i getActivityResultRegistry() {
        return this.f2643e.getActivityResultRegistry();
    }

    @Override // d7.InterfaceC1649u
    public final AbstractC1646r getLifecycle() {
        return this.f2643e.mFragmentLifecycleRegistry;
    }

    @Override // p004e.e0
    public final p004e.c0 getOnBackPressedDispatcher() {
        return this.f2643e.getOnBackPressedDispatcher();
    }

    @Override // g8.InterfaceC2547g
    public final C2545e getSavedStateRegistry() {
        return this.f2643e.getSavedStateRegistry();
    }

    @Override // d7.c1
    public final d7.b1 getViewModelStore() {
        return this.f2643e.getViewModelStore();
    }

    @Override // c6.InterfaceC0883m
    public final void removeMenuProvider(InterfaceC0888r interfaceC0888r) {
        this.f2643e.removeMenuProvider(interfaceC0888r);
    }

    @Override // r5.InterfaceC6470e
    public final void removeOnConfigurationChangedListener(InterfaceC0600a interfaceC0600a) {
        this.f2643e.removeOnConfigurationChangedListener(interfaceC0600a);
    }

    @Override // q5.InterfaceC6124q
    public final void removeOnMultiWindowModeChangedListener(InterfaceC0600a interfaceC0600a) {
        this.f2643e.removeOnMultiWindowModeChangedListener(interfaceC0600a);
    }

    @Override // q5.InterfaceC6125r
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC0600a interfaceC0600a) {
        this.f2643e.removeOnPictureInPictureModeChangedListener(interfaceC0600a);
    }

    @Override // r5.InterfaceC6471f
    public final void removeOnTrimMemoryListener(InterfaceC0600a interfaceC0600a) {
        this.f2643e.removeOnTrimMemoryListener(interfaceC0600a);
    }
}
