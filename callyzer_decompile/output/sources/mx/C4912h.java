package mx;

import fx.InterfaceC2395a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qw.a0;
import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mx.h */
/* loaded from: classes3.dex */
public final class C4912h implements Iterator, InterfaceC7559c, InterfaceC2395a {

    /* renamed from: a */
    public int f24450a;

    /* renamed from: b */
    public Object f24451b;

    /* renamed from: c */
    public InterfaceC7559c f24452c;

    /* renamed from: b */
    public final RuntimeException m9804b() {
        int i10 = this.f24450a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f24450a);
    }

    /* renamed from: d */
    public final EnumC7794a m9805d(Object obj, InterfaceC7559c frame) {
        this.f24451b = obj;
        this.f24450a = 3;
        this.f24452c = frame;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        AbstractC4154l.m8923f(frame, "frame");
        return enumC7794a;
    }

    @Override // uw.InterfaceC7559c
    public final InterfaceC7564h getContext() {
        return C7565i.f36440a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f24450a;
            if (i10 != 0) {
                break;
            }
            this.f24450a = 5;
            InterfaceC7559c interfaceC7559c = this.f24452c;
            AbstractC4154l.m8920c(interfaceC7559c);
            this.f24452c = null;
            interfaceC7559c.resumeWith(a0.f30746a);
        }
        if (i10 == 1) {
            AbstractC4154l.m8920c(null);
            throw null;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw m9804b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f24450a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f24450a = 1;
            AbstractC4154l.m8920c(null);
            throw null;
        }
        if (i10 != 3) {
            throw m9804b();
        }
        this.f24450a = 0;
        Object obj = this.f24451b;
        this.f24451b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // uw.InterfaceC7559c
    public final void resumeWith(Object obj) {
        od.m10798c(obj);
        this.f24450a = 4;
    }
}
