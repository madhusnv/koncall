package e1;

import bx.C0799i;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import fx.InterfaceC2395a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import mx.C4912h;
import og.h1;
import q2.C6099a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f8990a;

    /* renamed from: b */
    public int f8991b;

    /* renamed from: c */
    public Object f8992c;

    /* renamed from: d */
    public final Object f8993d;

    public h0(Map map, Object obj) {
        this.f8990a = 3;
        this.f8992c = obj;
        this.f8993d = map;
    }

    /* renamed from: b */
    public void m5566b() {
        Object objInvoke;
        C0799i c0799i = (C0799i) this.f8993d;
        if (this.f8991b == -2) {
            objInvoke = ((InterfaceC2137a) c0799i.f5023b).invoke();
        } else {
            InterfaceC2139c interfaceC2139c = (InterfaceC2139c) c0799i.f5024c;
            Object obj = this.f8992c;
            AbstractC4154l.m8920c(obj);
            objInvoke = interfaceC2139c.invoke(obj);
        }
        this.f8992c = objInvoke;
        this.f8991b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8990a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                if (this.f8991b < 0) {
                    m5566b();
                }
                if (this.f8991b == 1) {
                }
                break;
            default:
                if (this.f8991b < ((Map) this.f8993d).size()) {
                }
                break;
        }
        return ((C4912h) this.f8992c).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8990a) {
            case 0:
                return ((C4912h) this.f8992c).next();
            case 1:
                return ((C4912h) this.f8992c).next();
            case 2:
                if (this.f8991b < 0) {
                    m5566b();
                }
                if (this.f8991b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f8992c;
                AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f8991b = -1;
                return obj;
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f8992c;
                this.f8991b++;
                Object obj3 = ((Map) this.f8993d).get(obj2);
                if (obj3 != null) {
                    this.f8992c = ((C6099a) obj3).f29794b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8990a) {
            case 0:
                int i10 = this.f8991b;
                if (i10 != -1) {
                    ((i0) this.f8993d).f8996b.m5564h(i10);
                    this.f8991b = -1;
                    return;
                }
                return;
            case 1:
                int i11 = this.f8991b;
                if (i11 != -1) {
                    ((m0) this.f8993d).f9029b.m5593m(i11);
                    this.f8991b = -1;
                    return;
                }
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h0(C0799i c0799i) {
        this.f8990a = 2;
        this.f8993d = c0799i;
        this.f8991b = -2;
    }

    public h0(m0 m0Var) {
        this.f8990a = 1;
        this.f8993d = m0Var;
        this.f8991b = -1;
        this.f8992c = h1.m10679a(new l0(m0Var, this, null));
    }

    public h0(i0 i0Var) {
        this.f8990a = 0;
        this.f8993d = i0Var;
        this.f8991b = -1;
        this.f8992c = h1.m10679a(new g0(i0Var, this, null));
    }
}
