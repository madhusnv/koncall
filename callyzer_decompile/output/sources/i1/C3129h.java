package i1;

import android.content.Context;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import kotlin.jvm.internal.AbstractC4154l;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.h */
/* loaded from: classes.dex */
public final class C3129h {

    /* renamed from: a */
    public final Context f16874a;

    /* renamed from: b */
    public final InterfaceC6747c f16875b;

    /* renamed from: c */
    public final long f16876c;

    /* renamed from: d */
    public final o1.h1 f16877d;

    public C3129h(Context context, InterfaceC6747c interfaceC6747c, long j6, o1.h1 h1Var) {
        this.f16874a = context;
        this.f16875b = interfaceC6747c;
        this.f16876c = j6;
        this.f16877d = h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C3129h.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        C3129h c3129h = (C3129h) obj;
        return AbstractC4154l.m8918a(this.f16874a, c3129h.f16874a) && AbstractC4154l.m8918a(this.f16875b, c3129h.f16875b) && C1565s.m5187c(this.f16876c, c3129h.f16876c) && AbstractC4154l.m8918a(this.f16877d, c3129h.f16877d);
    }

    public final int hashCode() {
        int iHashCode = (this.f16875b.hashCode() + (this.f16874a.hashCode() * 31)) * 31;
        int i10 = C1565s.f7818k;
        return this.f16877d.hashCode() + AbstractC1452a.m4557d(iHashCode, 31, this.f16876c);
    }
}
