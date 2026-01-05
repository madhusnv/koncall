package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class jh2 extends fh2 {

    /* renamed from: a */
    public final int f30423a;

    /* renamed from: b */
    public final int f30424b;

    /* renamed from: c */
    public boolean f30425c;

    /* renamed from: d */
    public int f30426d;

    public jh2(char c, char c2, int i) {
        this.f30423a = i;
        this.f30424b = c2;
        boolean z = true;
        if (i <= 0 ? sq8.m48651j(c, c2) < 0 : sq8.m48651j(c, c2) > 0) {
            z = false;
        }
        this.f30425c = z;
        this.f30426d = z ? c : c2;
    }

    @Override // p001o.fh2
    /* renamed from: a */
    public char mo26686a() {
        int i = this.f30426d;
        if (i != this.f30424b) {
            this.f30426d = this.f30423a + i;
        } else {
            if (!this.f30425c) {
                throw new NoSuchElementException();
            }
            this.f30425c = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30425c;
    }
}
