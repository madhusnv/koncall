package s1;

import androidx.compose.foundation.lazy.layout.C0248b;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import v3.InterfaceC7644p;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.r */
/* loaded from: classes.dex */
public final class C6723r extends AbstractC7878q implements InterfaceC7644p {

    /* renamed from: q */
    public C0248b f32122q;

    @Override // w2.AbstractC7878q
    public final void D0() {
        this.f32122q.getClass();
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        C0248b c0248b = this.f32122q;
        c0248b.m695d();
        c0248b.f1989b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6723r) && AbstractC4154l.m8918a(this.f32122q, ((C6723r) obj).f32122q);
    }

    @Override // v3.InterfaceC7644p
    public final void h0(v3.i0 i0Var) {
        ArrayList arrayList = this.f32122q.f1995h;
        if (arrayList.size() <= 0) {
            i0Var.m14622b();
        } else {
            AbstractC1452a.m4578y(arrayList.get(0));
            throw null;
        }
    }

    public final int hashCode() {
        return this.f32122q.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f32122q + ')';
    }
}
