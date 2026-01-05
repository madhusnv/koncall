package xh;

import com.google.android.gms.internal.measurement.v5;
import java.io.Serializable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xh.e */
/* loaded from: classes.dex */
public final class C8380e implements InterfaceC8379d, Serializable {

    /* renamed from: a */
    public final v5 f40051a;

    /* renamed from: b */
    public volatile transient boolean f40052b;

    /* renamed from: c */
    public transient Object f40053c;

    public C8380e(v5 v5Var) {
        this.f40051a = v5Var;
    }

    @Override // xh.InterfaceC8379d
    public final Object get() {
        if (!this.f40052b) {
            synchronized (this) {
                try {
                    if (!this.f40052b) {
                        Object obj = this.f40051a.get();
                        this.f40053c = obj;
                        this.f40052b = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f40053c;
    }

    public final String toString() {
        Object string;
        if (this.f40052b) {
            String strValueOf = String.valueOf(this.f40053c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        } else {
            string = this.f40051a;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(strValueOf2);
        sb3.append(")");
        return sb3.toString();
    }
}
