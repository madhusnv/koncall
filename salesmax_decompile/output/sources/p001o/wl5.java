package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class wl5 implements ief {

    /* renamed from: a */
    public final CharSequence f52287a;

    /* renamed from: b */
    public final int f52288b;

    /* renamed from: c */
    public final int f52289c;

    /* renamed from: d */
    public final nl7 f52290d;

    /* renamed from: o.wl5$a */
    public static final class C17924a implements Iterator, sb9 {

        /* renamed from: a */
        public int f52291a = -1;

        /* renamed from: b */
        public int f52292b;

        /* renamed from: c */
        public int f52293c;

        /* renamed from: d */
        public kl8 f52294d;

        /* renamed from: e */
        public int f52295e;

        public C17924a() {
            int iM18608k = bce.m18608k(wl5.this.f52288b, 0, wl5.this.f52287a.length());
            this.f52292b = iM18608k;
            this.f52293c = iM18608k;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m54682a() {
            hwc hwcVar;
            if (this.f52293c < 0) {
                this.f52291a = 0;
                this.f52294d = null;
                return;
            }
            if (wl5.this.f52289c > 0) {
                int i = this.f52295e + 1;
                this.f52295e = i;
                if (i >= wl5.this.f52289c) {
                    this.f52294d = new kl8(this.f52292b, f9g.m26312V(wl5.this.f52287a));
                    this.f52293c = -1;
                } else if (this.f52293c <= wl5.this.f52287a.length() && (hwcVar = (hwc) wl5.this.f52290d.invoke(wl5.this.f52287a, Integer.valueOf(this.f52293c))) != null) {
                    int iIntValue = ((Number) hwcVar.m31227a()).intValue();
                    int iIntValue2 = ((Number) hwcVar.m31228b()).intValue();
                    this.f52294d = bce.m18616s(this.f52292b, iIntValue);
                    int i2 = iIntValue + iIntValue2;
                    this.f52292b = i2;
                    this.f52293c = i2 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f52294d = new kl8(this.f52292b, f9g.m26312V(wl5.this.f52287a));
                    this.f52293c = -1;
                }
            }
            this.f52291a = 1;
        }

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public kl8 next() {
            if (this.f52291a == -1) {
                m54682a();
            }
            if (this.f52291a == 0) {
                throw new NoSuchElementException();
            }
            kl8 kl8Var = this.f52294d;
            sq8.m48647f(kl8Var, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f52294d = null;
            this.f52291a = -1;
            return kl8Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52291a == -1) {
                m54682a();
            }
            return this.f52291a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public wl5(CharSequence charSequence, int i, int i2, nl7 nl7Var) {
        sq8.m48649h(charSequence, "input");
        sq8.m48649h(nl7Var, "getNextMatch");
        this.f52287a = charSequence;
        this.f52288b = i;
        this.f52289c = i2;
        this.f52290d = nl7Var;
    }

    @Override // p001o.ief
    public Iterator iterator() {
        return new C17924a();
    }
}
