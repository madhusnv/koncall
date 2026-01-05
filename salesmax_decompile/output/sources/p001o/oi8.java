package p001o;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class oi8 implements gi9, Serializable {

    /* renamed from: a */
    public final Object f38401a;

    public oi8(Object obj) {
        this.f38401a = obj;
    }

    @Override // p001o.gi9
    public Object getValue() {
        return this.f38401a;
    }

    @Override // p001o.gi9
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
