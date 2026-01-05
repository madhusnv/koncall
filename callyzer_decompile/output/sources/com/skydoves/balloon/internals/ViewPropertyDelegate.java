package com.skydoves.balloon.internals;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import lx.InterfaceC4574m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ViewPropertyDelegate<T> {
    private final InterfaceC2137a invalidator;
    private T propertyValue;

    public ViewPropertyDelegate(T t7, InterfaceC2137a invalidator) {
        AbstractC4154l.m8923f(invalidator, "invalidator");
        this.invalidator = invalidator;
        this.propertyValue = t7;
    }

    public T getValue(Object obj, InterfaceC4574m property) {
        AbstractC4154l.m8923f(property, "property");
        return this.propertyValue;
    }

    public void setValue(Object obj, InterfaceC4574m property, T t7) {
        AbstractC4154l.m8923f(property, "property");
        if (AbstractC4154l.m8918a(this.propertyValue, t7)) {
            return;
        }
        this.propertyValue = t7;
        this.invalidator.invoke();
    }
}
