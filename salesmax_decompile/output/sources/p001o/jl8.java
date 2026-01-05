package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class jl8 extends dl8 {

    /* renamed from: a */
    public final int f30665a;

    /* renamed from: b */
    public final int f30666b;

    /* renamed from: c */
    public boolean f30667c;

    /* renamed from: d */
    public int f30668d;

    public jl8(int i, int i2, int i3) {
        this.f30665a = i3;
        this.f30666b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f30667c = z;
        this.f30668d = z ? i : i2;
    }

    @Override // p001o.dl8
    /* renamed from: a */
    public int mo23412a() {
        int i = this.f30668d;
        if (i != this.f30666b) {
            this.f30668d = this.f30665a + i;
        } else {
            if (!this.f30667c) {
                throw new NoSuchElementException();
            }
            this.f30667c = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30667c;
    }
}
