package wj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e1.C1903e;
import java.util.Map;
import pg.AbstractC5932m;
import tf.AbstractC7149a;
import v0.C7622f;
import wg.C8034g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.o */
/* loaded from: classes.dex */
public final class C8089o extends AbstractC7149a {
    public static final Parcelable.Creator<C8089o> CREATOR = new C8034g(2);

    /* renamed from: a */
    public final Bundle f38719a;

    /* renamed from: b */
    public C1903e f38720b;

    /* renamed from: c */
    public C8083i f38721c;

    public C8089o(Bundle bundle) {
        this.f38719a = bundle;
    }

    /* renamed from: b */
    public final Map m15223b() {
        if (this.f38720b == null) {
            C1903e c1903e = new C1903e(0);
            Bundle bundle = this.f38719a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c1903e.put(str, str2);
                    }
                }
            }
            this.f38720b = c1903e;
        }
        return this.f38720b;
    }

    /* renamed from: c */
    public final C8083i m15224c() {
        if (this.f38721c == null) {
            Bundle bundle = this.f38719a;
            if (C7622f.m14509w(bundle)) {
                this.f38721c = new C8083i(new C7622f(bundle));
            }
        }
        return this.f38721c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11774b(parcel, 2, this.f38719a);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
