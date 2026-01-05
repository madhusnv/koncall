package ye;

import android.content.Context;
import com.sun.mail.util.AbstractC1452a;
import gf.InterfaceC2585a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ye.b */
/* loaded from: classes.dex */
public final class C8637b extends AbstractC8639d {

    /* renamed from: a */
    public final Context f41918a;

    /* renamed from: b */
    public final InterfaceC2585a f41919b;

    /* renamed from: c */
    public final InterfaceC2585a f41920c;

    /* renamed from: d */
    public final String f41921d;

    public C8637b(Context context, InterfaceC2585a interfaceC2585a, InterfaceC2585a interfaceC2585a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f41918a = context;
        if (interfaceC2585a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f41919b = interfaceC2585a;
        if (interfaceC2585a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f41920c = interfaceC2585a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f41921d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8639d) {
            C8637b c8637b = (C8637b) ((AbstractC8639d) obj);
            if (this.f41918a.equals(c8637b.f41918a) && this.f41919b.equals(c8637b.f41919b) && this.f41920c.equals(c8637b.f41920c) && this.f41921d.equals(c8637b.f41921d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f41918a.hashCode() ^ 1000003) * 1000003) ^ this.f41919b.hashCode()) * 1000003) ^ this.f41920c.hashCode()) * 1000003) ^ this.f41921d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f41918a);
        sb2.append(", wallClock=");
        sb2.append(this.f41919b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f41920c);
        sb2.append(", backendName=");
        return AbstractC1452a.m4564k(sb2, this.f41921d, "}");
    }
}
