package p2;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.d0;
import og.hb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p2.e */
/* loaded from: classes.dex */
public class C5793e extends AbstractC5791c {

    /* renamed from: d */
    public final C5792d f28388d;

    /* renamed from: e */
    public Object f28389e;

    /* renamed from: f */
    public boolean f28390f;

    /* renamed from: g */
    public int f28391g;

    public C5793e(C5792d c5792d, AbstractC5800l[] abstractC5800lArr) {
        super(c5792d.f28384c, abstractC5800lArr);
        this.f28388d = c5792d;
        this.f28391g = c5792d.f28386e;
    }

    /* renamed from: f */
    public final void m11346f(int i10, C5799k c5799k, Object obj, int i11) {
        int i12 = i11 * 5;
        AbstractC5800l[] abstractC5800lArr = this.f28379a;
        if (i12 <= 30) {
            int iM10683d = 1 << hb.m10683d(i10, i12);
            if (c5799k.m11356h(iM10683d)) {
                abstractC5800lArr[i11].m11372b(c5799k.f28402d, Integer.bitCount(c5799k.f28399a) * 2, c5799k.m11354f(iM10683d));
                this.f28380b = i11;
                return;
            } else {
                int iM11367t = c5799k.m11367t(iM10683d);
                C5799k c5799kM11366s = c5799k.m11366s(iM11367t);
                abstractC5800lArr[i11].m11372b(c5799k.f28402d, Integer.bitCount(c5799k.f28399a) * 2, iM11367t);
                m11346f(i10, c5799kM11366s, obj, i11 + 1);
                return;
            }
        }
        AbstractC5800l abstractC5800l = abstractC5800lArr[i11];
        Object[] objArr = c5799k.f28402d;
        abstractC5800l.m11372b(objArr, objArr.length, 0);
        while (true) {
            AbstractC5800l abstractC5800l2 = abstractC5800lArr[i11];
            if (AbstractC4154l.m8918a(abstractC5800l2.f28403a[abstractC5800l2.f28405c], obj)) {
                this.f28380b = i11;
                return;
            } else {
                abstractC5800lArr[i11].f28405c += 2;
            }
        }
    }

    @Override // p2.AbstractC5791c, java.util.Iterator
    public final Object next() {
        if (this.f28388d.f28386e != this.f28391g) {
            throw new ConcurrentModificationException();
        }
        if (!this.f28381c) {
            throw new NoSuchElementException();
        }
        AbstractC5800l abstractC5800l = this.f28379a[this.f28380b];
        this.f28389e = abstractC5800l.f28403a[abstractC5800l.f28405c];
        this.f28390f = true;
        return super.next();
    }

    @Override // p2.AbstractC5791c, java.util.Iterator
    public final void remove() {
        if (!this.f28390f) {
            throw new IllegalStateException();
        }
        boolean z6 = this.f28381c;
        C5792d c5792d = this.f28388d;
        if (!z6) {
            d0.m8906c(c5792d).remove(this.f28389e);
        } else {
            if (!z6) {
                throw new NoSuchElementException();
            }
            AbstractC5800l abstractC5800l = this.f28379a[this.f28380b];
            Object obj = abstractC5800l.f28403a[abstractC5800l.f28405c];
            d0.m8906c(c5792d).remove(this.f28389e);
            m11346f(obj != null ? obj.hashCode() : 0, c5792d.f28384c, obj, 0);
        }
        this.f28389e = null;
        this.f28390f = false;
        this.f28391g = c5792d.f28386e;
    }
}
