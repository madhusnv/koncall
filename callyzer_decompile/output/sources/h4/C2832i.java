package h4;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.i */
/* loaded from: classes.dex */
public final class C2832i implements CharacterIterator {

    /* renamed from: a */
    public final CharSequence f15809a;

    /* renamed from: b */
    public final int f15810b;

    /* renamed from: c */
    public int f15811c = 0;

    public C2832i(CharSequence charSequence, int i10) {
        this.f15809a = charSequence;
        this.f15810b = i10;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f15811c;
        if (i10 == this.f15810b) {
            return (char) 65535;
        }
        return this.f15809a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f15811c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f15810b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f15811c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f15810b;
        if (i10 == 0) {
            this.f15811c = i10;
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f15811c = i11;
        return this.f15809a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f15811c + 1;
        this.f15811c = i10;
        int i11 = this.f15810b;
        if (i10 < i11) {
            return this.f15809a.charAt(i10);
        }
        this.f15811c = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f15811c;
        if (i10 <= 0) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f15811c = i11;
        return this.f15809a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 > this.f15810b || i10 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f15811c = i10;
        return current();
    }
}
