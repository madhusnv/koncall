package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import og.C5367h;
import og.qa;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c2 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f6514a = 0;

    /* renamed from: b */
    public Object f6515b;

    /* renamed from: c */
    public Object f6516c;

    public c2(C5367h c5367h, Iterator it) {
        this.f6516c = it;
    }

    /* renamed from: a */
    public q0 m3814a() {
        q0 q0Var;
        ArrayDeque arrayDeque = (ArrayDeque) this.f6515b;
        q0 q0Var2 = (q0) this.f6516c;
        if (q0Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            q0Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            r0 r0Var = ((d2) arrayDeque.pop()).f6521e;
            while (r0Var instanceof d2) {
                d2 d2Var = (d2) r0Var;
                arrayDeque.push(d2Var);
                r0Var = d2Var.f6520d;
            }
            q0Var = (q0) r0Var;
        } while (q0Var.mo3818e() == 0);
        this.f6516c = q0Var;
        return q0Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6514a) {
            case 0:
                return ((q0) this.f6516c) != null;
            default:
                return ((Iterator) this.f6516c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6514a) {
            case 0:
                return m3814a();
            default:
                Map.Entry entry = (Map.Entry) ((Iterator) this.f6516c).next();
                this.f6515b = entry;
                return entry.getKey();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6514a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                qa.m10850e("no calls to next() since the last call to remove()", ((Map.Entry) this.f6515b) != null);
                Collection collection = (Collection) ((Map.Entry) this.f6515b).getValue();
                ((Iterator) this.f6516c).remove();
                collection.size();
                collection.clear();
                this.f6515b = null;
                return;
        }
    }

    public c2(r0 r0Var) {
        if (!(r0Var instanceof d2)) {
            this.f6515b = null;
            this.f6516c = (q0) r0Var;
            return;
        }
        d2 d2Var = (d2) r0Var;
        ArrayDeque arrayDeque = new ArrayDeque(d2Var.f6523g);
        this.f6515b = arrayDeque;
        arrayDeque.push(d2Var);
        r0 r0Var2 = d2Var.f6520d;
        while (r0Var2 instanceof d2) {
            d2 d2Var2 = (d2) r0Var2;
            ((ArrayDeque) this.f6515b).push(d2Var2);
            r0Var2 = d2Var2.f6520d;
        }
        this.f6516c = (q0) r0Var2;
    }
}
