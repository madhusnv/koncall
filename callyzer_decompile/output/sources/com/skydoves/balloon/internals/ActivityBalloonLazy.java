package com.skydoves.balloon.internals;

import android.content.Context;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.Balloon.Factory;
import d7.InterfaceC1649u;
import dx.AbstractC1851a;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4160r;
import lx.InterfaceC4564c;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ActivityBalloonLazy<T extends Balloon.Factory> implements InterfaceC6357g, Serializable {
    private Balloon cached;
    private final Context context;
    private final InterfaceC4564c factory;
    private final InterfaceC1649u lifecycleOwner;

    public ActivityBalloonLazy(Context context, InterfaceC1649u lifecycleOwner, InterfaceC4564c factory) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(lifecycleOwner, "lifecycleOwner");
        AbstractC4154l.m8923f(factory, "factory");
        this.context = context;
        this.lifecycleOwner = lifecycleOwner;
        this.factory = factory;
    }

    @Override // qw.InterfaceC6357g
    public boolean isInitialized() {
        return this.cached != null;
    }

    public String toString() {
        return isInitialized() ? getValue().toString() : "Lazy value not initialized yet.";
    }

    @Override // qw.InterfaceC6357g
    public Balloon getValue() {
        Balloon balloon = this.cached;
        if (balloon != null) {
            return balloon;
        }
        final InterfaceC4564c interfaceC4564c = this.factory;
        Balloon balloonCreate = ((Balloon.Factory) ((Class) new AbstractC4160r(interfaceC4564c) { // from class: com.skydoves.balloon.internals.ActivityBalloonLazy$value$factory$1
            @Override // lx.InterfaceC4571j
            public Object get() {
                return AbstractC1851a.m5483b((InterfaceC4564c) this.receiver);
            }
        }.get()).getDeclaredConstructor(null).newInstance(null)).create(this.context, this.lifecycleOwner);
        this.cached = balloonCreate;
        return balloonCreate;
    }
}
