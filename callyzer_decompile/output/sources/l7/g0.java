package l7;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends k0 {

    /* renamed from: r */
    public final Class f22039r;

    public g0(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f22039r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // l7.k0
    /* renamed from: a */
    public final Object mo9203a(String key, Bundle bundle) {
        AbstractC4154l.m8923f(bundle, "bundle");
        AbstractC4154l.m8923f(key, "key");
        return (Parcelable[]) bundle.get(key);
    }

    @Override // l7.k0
    /* renamed from: b */
    public final String mo9204b() {
        return this.f22039r.getName();
    }

    @Override // l7.k0
    /* renamed from: d */
    public final Object mo9206d(String value) {
        AbstractC4154l.m8923f(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // l7.k0
    /* renamed from: e */
    public final void mo9207e(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        AbstractC4154l.m8923f(key, "key");
        this.f22039r.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !g0.class.equals(obj.getClass())) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f22039r, ((g0) obj).f22039r);
    }

    @Override // l7.k0
    /* renamed from: g */
    public final boolean mo9208g(Object obj, Object obj2) {
        return AbstractC6662l.m12714d((Parcelable[]) obj, (Parcelable[]) obj2);
    }

    public final int hashCode() {
        return this.f22039r.hashCode();
    }
}
