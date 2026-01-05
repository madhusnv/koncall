package p2;

import fx.InterfaceC2395a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p2.c */
/* loaded from: classes.dex */
public abstract class AbstractC5791c implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public final AbstractC5800l[] f28379a;

    /* renamed from: b */
    public int f28380b;

    /* renamed from: c */
    public boolean f28381c = true;

    public AbstractC5791c(C5799k c5799k, AbstractC5800l[] abstractC5800lArr) {
        this.f28379a = abstractC5800lArr;
        abstractC5800lArr[0].m11372b(c5799k.f28402d, Integer.bitCount(c5799k.f28399a) * 2, 0);
        this.f28380b = 0;
        m11342b();
    }

    /* renamed from: b */
    public final void m11342b() {
        int i10 = this.f28380b;
        AbstractC5800l[] abstractC5800lArr = this.f28379a;
        AbstractC5800l abstractC5800l = abstractC5800lArr[i10];
        if (abstractC5800l.f28405c < abstractC5800l.f28404b) {
            return;
        }
        while (-1 < i10) {
            int iM11343d = m11343d(i10);
            if (iM11343d == -1) {
                AbstractC5800l abstractC5800l2 = abstractC5800lArr[i10];
                int i11 = abstractC5800l2.f28405c;
                Object[] objArr = abstractC5800l2.f28403a;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    abstractC5800l2.f28405c = i11 + 1;
                    iM11343d = m11343d(i10);
                }
            }
            if (iM11343d != -1) {
                this.f28380b = iM11343d;
                return;
            }
            if (i10 > 0) {
                AbstractC5800l abstractC5800l3 = abstractC5800lArr[i10 - 1];
                int i12 = abstractC5800l3.f28405c;
                int length2 = abstractC5800l3.f28403a.length;
                abstractC5800l3.f28405c = i12 + 1;
            }
            abstractC5800lArr[i10].m11372b(C5799k.f28398e.f28402d, 0, 0);
            i10--;
        }
        this.f28381c = false;
    }

    /* renamed from: d */
    public final int m11343d(int i10) {
        AbstractC5800l[] abstractC5800lArr = this.f28379a;
        AbstractC5800l abstractC5800l = abstractC5800lArr[i10];
        int i11 = abstractC5800l.f28405c;
        if (i11 < abstractC5800l.f28404b) {
            return i10;
        }
        Object[] objArr = abstractC5800l.f28403a;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        C5799k c5799k = (C5799k) obj;
        if (i10 == 6) {
            AbstractC5800l abstractC5800l2 = abstractC5800lArr[i10 + 1];
            Object[] objArr2 = c5799k.f28402d;
            abstractC5800l2.m11372b(objArr2, objArr2.length, 0);
        } else {
            abstractC5800lArr[i10 + 1].m11372b(c5799k.f28402d, Integer.bitCount(c5799k.f28399a) * 2, 0);
        }
        return m11343d(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28381c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f28381c) {
            throw new NoSuchElementException();
        }
        Object next = this.f28379a[this.f28380b].next();
        m11342b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
