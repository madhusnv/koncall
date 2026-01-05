package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class vh8 implements Iterator, sb9 {

    /* renamed from: a */
    public int f50331a;

    /* renamed from: b */
    public int f50332b;

    /* renamed from: c */
    public boolean f50333c;

    public vh8(int i) {
        this.f50331a = i;
    }

    /* renamed from: a */
    public abstract Object mo17588a(int i);

    /* renamed from: e */
    public abstract void mo17589e(int i);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f50332b < this.f50331a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objMo17588a = mo17588a(this.f50332b);
        this.f50332b++;
        this.f50333c = true;
        return objMo17588a;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f50333c) {
            throw new IllegalStateException("Call next() before removing an element.".toString());
        }
        int i = this.f50332b - 1;
        this.f50332b = i;
        mo17589e(i);
        this.f50331a--;
        this.f50333c = false;
    }
}
