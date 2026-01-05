package l7;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class j0 extends k0 {

    /* renamed from: r */
    public final Class f22055r;

    public j0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f22055r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // l7.k0
    /* renamed from: a */
    public final Object mo9203a(String key, Bundle bundle) {
        AbstractC4154l.m8923f(bundle, "bundle");
        AbstractC4154l.m8923f(key, "key");
        return (Serializable) bundle.get(key);
    }

    @Override // l7.k0
    /* renamed from: b */
    public String mo9204b() {
        return this.f22055r.getName();
    }

    @Override // l7.k0
    /* renamed from: e */
    public final void mo9207e(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        this.f22055r.cast(value);
        bundle.putSerializable(key, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f22055r, ((j0) obj).f22055r);
    }

    @Override // l7.k0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Serializable mo9206d(String value) {
        AbstractC4154l.m8923f(value, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f22055r.hashCode();
    }

    public j0(Class cls, int i10) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f22055r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
