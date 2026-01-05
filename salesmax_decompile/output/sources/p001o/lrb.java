package p001o;

import java.io.Serializable;

/* loaded from: classes6.dex */
public abstract class lrb implements vja, Serializable {
    @Override // p001o.vja
    public abstract String getName();

    public Object readResolve() {
        return yja.m57897l(getName());
    }
}
