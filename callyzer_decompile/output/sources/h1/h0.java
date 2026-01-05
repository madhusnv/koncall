package h1;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a */
    public final Float f15445a;

    /* renamed from: b */
    public InterfaceC2792w f15446b;

    public h0(Float f6, InterfaceC2792w interfaceC2792w) {
        this.f15445a = f6;
        this.f15446b = interfaceC2792w;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return h0Var.f15445a.equals(this.f15445a) && AbstractC4154l.m8918a(h0Var.f15446b, this.f15446b);
    }

    public final int hashCode() {
        return this.f15446b.hashCode() + AbstractC1452a.m4556c(0, this.f15445a.hashCode() * 31, 31);
    }
}
