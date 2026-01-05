package xh;

import com.google.android.gms.internal.measurement.v5;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xh.f */
/* loaded from: classes.dex */
public final class C8381f implements InterfaceC8379d {

    /* renamed from: a */
    public volatile v5 f40054a;

    /* renamed from: b */
    public volatile boolean f40055b;

    /* renamed from: c */
    public Object f40056c;

    @Override // xh.InterfaceC8379d
    public final Object get() {
        if (!this.f40055b) {
            synchronized (this) {
                try {
                    if (!this.f40055b) {
                        v5 v5Var = this.f40054a;
                        Objects.requireNonNull(v5Var);
                        Object obj = v5Var.get();
                        this.f40056c = obj;
                        this.f40055b = true;
                        this.f40054a = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f40056c;
    }

    public final String toString() {
        Object string = this.f40054a;
        if (string == null) {
            String strValueOf = String.valueOf(this.f40056c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(strValueOf2);
        sb3.append(")");
        return sb3.toString();
    }
}
