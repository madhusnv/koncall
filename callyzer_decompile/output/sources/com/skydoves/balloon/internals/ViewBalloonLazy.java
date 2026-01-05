package com.skydoves.balloon.internals;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.fragment.app.j1;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.Balloon.Factory;
import d7.InterfaceC1649u;
import d7.q0;
import dx.AbstractC1851a;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4160r;
import lx.InterfaceC4564c;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ViewBalloonLazy<T extends Balloon.Factory> implements InterfaceC6357g, Serializable {
    private Balloon cached;
    private final InterfaceC4564c factory;
    private final View view;

    public ViewBalloonLazy(View view, InterfaceC4564c factory) {
        AbstractC4154l.m8923f(view, "view");
        AbstractC4154l.m8923f(factory, "factory");
        this.view = view;
        this.factory = factory;
    }

    @Override // qw.InterfaceC6357g
    public boolean isInitialized() {
        return this.cached != null;
    }

    public String toString() {
        return isInitialized() ? getValue().toString() : "Lazy value not initialized yet.";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qw.InterfaceC6357g
    public Balloon getValue() {
        Balloon balloon = this.cached;
        if (balloon != null) {
            return balloon;
        }
        Context context = this.view.getContext();
        final InterfaceC4564c interfaceC4564c = this.factory;
        Balloon.Factory factory = (Balloon.Factory) ((Class) new AbstractC4160r(interfaceC4564c) { // from class: com.skydoves.balloon.internals.ViewBalloonLazy$value$factory$1
            @Override // lx.InterfaceC4571j
            public Object get() {
                return AbstractC1851a.m5483b((InterfaceC4564c) this.receiver);
            }
        }.get()).getDeclaredConstructor(null).newInstance(null);
        InterfaceC1649u interfaceC1649uM5337d = q0.m5337d(this.view);
        if (interfaceC1649uM5337d != null) {
            AbstractC4154l.m8920c(context);
            Balloon balloonCreate = factory.create(context, interfaceC1649uM5337d);
            this.cached = balloonCreate;
            return balloonCreate;
        }
        if (context instanceof InterfaceC1649u) {
            Balloon balloonCreate2 = factory.create(context, (InterfaceC1649u) context);
            this.cached = balloonCreate2;
            return balloonCreate2;
        }
        try {
            View view = this.view;
            j0 j0VarM1150E = j1.m1150E(view);
            if (j0VarM1150E == null) {
                throw new IllegalStateException("View " + view + " does not have a Fragment set");
            }
            if (j0VarM1150E.getContext() == null) {
                throw new IllegalArgumentException("Balloon can not be initialized. The passed fragment's context is null.");
            }
            InterfaceC1649u viewLifecycleOwner = j0VarM1150E.getView() != null ? j0VarM1150E.getViewLifecycleOwner() : j0VarM1150E;
            AbstractC4154l.m8920c(viewLifecycleOwner);
            Context contextRequireContext = j0VarM1150E.requireContext();
            AbstractC4154l.m8922e(contextRequireContext, "requireContext(...)");
            Balloon balloonCreate3 = factory.create(contextRequireContext, viewLifecycleOwner);
            this.cached = balloonCreate3;
            return balloonCreate3;
        } catch (Exception unused) {
            throw new IllegalArgumentException("Balloon can not be initialized. The passed context is not an instance of the LifecycleOwner.");
        }
    }
}
