package nx;

import fx.InterfaceC2395a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.b */
/* loaded from: classes3.dex */
public final class C5164b implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public int f25251a = -1;

    /* renamed from: b */
    public int f25252b;

    /* renamed from: c */
    public int f25253c;

    /* renamed from: d */
    public C4266h f25254d;

    /* renamed from: e */
    public int f25255e;

    /* renamed from: f */
    public final /* synthetic */ C5165c f25256f;

    public C5164b(C5165c c5165c) {
        this.f25256f = c5165c;
        int iM11912c = w9.m11912c(0, 0, c5165c.f25257a.length());
        this.f25252b = iM11912c;
        this.f25253c = iM11912c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10075b() {
        /*
            r7 = this;
            int r0 = r7.f25253c
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f25251a = r1
            r0 = 0
            r7.f25254d = r0
            return
        Lb:
            nx.c r2 = r7.f25256f
            int r3 = r2.f25258b
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f25255e
            int r6 = r6 + r5
            r7.f25255e = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f25257a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            kx.h r0 = new kx.h
            int r1 = r7.f25252b
            java.lang.CharSequence r2 = r2.f25257a
            int r2 = nx.AbstractC5178p.m10095F(r2)
            r0.<init>(r1, r2, r5)
            r7.f25254d = r0
            r7.f25253c = r4
            goto L79
        L34:
            ex.e r0 = r2.f25259c
            java.lang.CharSequence r3 = r2.f25257a
            int r6 = r7.f25253c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            qw.k r0 = (qw.C6361k) r0
            if (r0 != 0) goto L58
            kx.h r0 = new kx.h
            int r1 = r7.f25252b
            java.lang.CharSequence r2 = r2.f25257a
            int r2 = nx.AbstractC5178p.m10095F(r2)
            r0.<init>(r1, r2, r5)
            r7.f25254d = r0
            r7.f25253c = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f30755a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f30756b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f25252b
            kx.h r3 = pg.w9.m11919j(r3, r2)
            r7.f25254d = r3
            int r2 = r2 + r0
            r7.f25252b = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f25253c = r2
        L79:
            r7.f25251a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nx.C5164b.m10075b():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f25251a == -1) {
            m10075b();
        }
        return this.f25251a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f25251a == -1) {
            m10075b();
        }
        if (this.f25251a == 0) {
            throw new NoSuchElementException();
        }
        C4266h c4266h = this.f25254d;
        AbstractC4154l.m8921d(c4266h, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f25254d = null;
        this.f25251a = -1;
        return c4266h;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
