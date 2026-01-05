package nx;

import fc.C2254b;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import mq.C4833a;
import mx.AbstractC4913i;
import p2.AbstractC5800l;
import p2.C5790b;
import p2.C5798j;
import p2.C5799k;
import p2.C5801m;
import pg.w9;
import rw.AbstractC6651a;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.k */
/* loaded from: classes3.dex */
public final class C5173k extends AbstractC6651a {

    /* renamed from: a */
    public final /* synthetic */ int f25278a;

    /* renamed from: b */
    public final Object f25279b;

    public /* synthetic */ C5173k(int i10, Object obj) {
        this.f25278a = i10;
        this.f25279b = obj;
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        switch (this.f25278a) {
            case 0:
                return ((C5174l) this.f25279b).f25280a.groupCount() + 1;
            default:
                C5790b c5790b = (C5790b) this.f25279b;
                c5790b.getClass();
                return c5790b.f28378b;
        }
    }

    @Override // rw.AbstractC6651a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f25278a) {
            case 0:
                if (obj == null ? true : obj instanceof C5171i) {
                    return super.contains((C5171i) obj);
                }
                return false;
            default:
                return ((C5790b) this.f25279b).containsValue(obj);
        }
    }

    /* renamed from: h */
    public C5171i m10081h(int i10) {
        Matcher matcher = ((C5174l) this.f25279b).f25280a;
        C4266h c4266hM11919j = w9.m11919j(matcher.start(i10), matcher.end(i10));
        if (c4266hM11919j.f21646a < 0) {
            return null;
        }
        String strGroup = matcher.group(i10);
        AbstractC4154l.m8922e(strGroup, "group(...)");
        return new C5171i(strGroup, c4266hM11919j);
    }

    @Override // rw.AbstractC6651a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f25278a) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f25278a) {
            case 0:
                return new C2254b(AbstractC4913i.m9811g(AbstractC6663m.m12766y(new C4266h(0, size() - 1, 1)), new C4833a(5, this)));
            default:
                C5799k c5799k = ((C5790b) this.f25279b).f28377a;
                AbstractC5800l[] abstractC5800lArr = new AbstractC5800l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    abstractC5800lArr[i10] = new C5801m(2);
                }
                return new C5798j(c5799k, abstractC5800lArr);
        }
    }
}
