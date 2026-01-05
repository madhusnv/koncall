package l7;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends k0 {

    /* renamed from: r */
    public final Class f22053r;

    public i0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f22053r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // l7.k0
    /* renamed from: a */
    public final Object mo9203a(String key, Bundle bundle) {
        AbstractC4154l.m8923f(bundle, "bundle");
        AbstractC4154l.m8923f(key, "key");
        return (Serializable[]) bundle.get(key);
    }

    @Override // l7.k0
    /* renamed from: b */
    public final String mo9204b() {
        return this.f22053r.getName();
    }

    @Override // l7.k0
    /* renamed from: d */
    public final Object mo9206d(String value) {
        AbstractC4154l.m8923f(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // l7.k0
    /* renamed from: e */
    public final void mo9207e(Bundle bundle, String key, Object obj) {
        ?? r42 = (Serializable[]) obj;
        AbstractC4154l.m8923f(key, "key");
        this.f22053r.cast(r42);
        bundle.putSerializable(key, r42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !i0.class.equals(obj.getClass())) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f22053r, ((i0) obj).f22053r);
    }

    @Override // l7.k0
    /* renamed from: g */
    public final boolean mo9208g(Object obj, Object obj2) {
        return AbstractC6662l.m12714d((Serializable[]) obj, (Serializable[]) obj2);
    }

    public final int hashCode() {
        return this.f22053r.hashCode();
    }
}
