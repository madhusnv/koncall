package l7;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends k0 {

    /* renamed from: r */
    public final Class f22044r;

    public h0(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f22044r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // l7.k0
    /* renamed from: a */
    public final Object mo9203a(String key, Bundle bundle) {
        AbstractC4154l.m8923f(bundle, "bundle");
        AbstractC4154l.m8923f(key, "key");
        return bundle.get(key);
    }

    @Override // l7.k0
    /* renamed from: b */
    public final String mo9204b() {
        return this.f22044r.getName();
    }

    @Override // l7.k0
    /* renamed from: d */
    public final Object mo9206d(String value) {
        AbstractC4154l.m8923f(value, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // l7.k0
    /* renamed from: e */
    public final void mo9207e(Bundle bundle, String key, Object obj) {
        AbstractC4154l.m8923f(key, "key");
        this.f22044r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(key, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(key, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !h0.class.equals(obj.getClass())) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f22044r, ((h0) obj).f22044r);
    }

    public final int hashCode() {
        return this.f22044r.hashCode();
    }
}
