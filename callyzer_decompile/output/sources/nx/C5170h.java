package nx;

import fx.InterfaceC2395a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.h */
/* loaded from: classes3.dex */
public final class C5170h implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public final CharSequence f25269a;

    /* renamed from: b */
    public int f25270b;

    /* renamed from: c */
    public int f25271c;

    /* renamed from: d */
    public int f25272d;

    /* renamed from: e */
    public int f25273e;

    public C5170h(CharSequence string) {
        AbstractC4154l.m8923f(string, "string");
        this.f25269a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f25270b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f25273e < 0) {
            this.f25270b = 2;
            return false;
        }
        CharSequence charSequence = this.f25269a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i13 = this.f25271c; i13 < length2; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < charSequence.length() && charSequence.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f25270b = 1;
                this.f25273e = i10;
                this.f25272d = length;
                return true;
            }
        }
        i10 = -1;
        this.f25270b = 1;
        this.f25273e = i10;
        this.f25272d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f25270b = 0;
        int i10 = this.f25272d;
        int i11 = this.f25271c;
        this.f25271c = this.f25273e + i10;
        return this.f25269a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
