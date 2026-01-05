package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.AbstractC4154l;
import p3.h0;
import v3.a1;
import w2.AbstractC7878q;
import x1.d1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends a1 {

    /* renamed from: a */
    public final Object f2125a;

    /* renamed from: b */
    public final Object f2126b;

    /* renamed from: c */
    public final PointerInputEventHandler f2127c;

    public SuspendPointerInputElement(Object obj, d1 d1Var, PointerInputEventHandler pointerInputEventHandler, int i10) {
        d1Var = (i10 & 2) != 0 ? null : d1Var;
        this.f2125a = obj;
        this.f2126b = d1Var;
        this.f2127c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return AbstractC4154l.m8918a(this.f2125a, suspendPointerInputElement.f2125a) && AbstractC4154l.m8918a(this.f2126b, suspendPointerInputElement.f2126b) && this.f2127c == suspendPointerInputElement.f2127c;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new h0(this.f2125a, this.f2126b, this.f2127c);
    }

    public final int hashCode() {
        Object obj = this.f2125a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f2126b;
        return this.f2127c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        h0 h0Var = (h0) abstractC7878q;
        Object obj = h0Var.f28456q;
        Object obj2 = this.f2125a;
        boolean z6 = !AbstractC4154l.m8918a(obj, obj2);
        h0Var.f28456q = obj2;
        Object obj3 = h0Var.f28457r;
        Object obj4 = this.f2126b;
        if (!AbstractC4154l.m8918a(obj3, obj4)) {
            z6 = true;
        }
        h0Var.f28457r = obj4;
        Class<?> cls = h0Var.f28459t.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f2127c;
        if (cls == pointerInputEventHandler.getClass() ? z6 : true) {
            h0Var.N0();
        }
        h0Var.f28459t = pointerInputEventHandler;
    }
}
