package kx;

import java.util.NoSuchElementException;
import rw.AbstractC6672v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kx.g */
/* loaded from: classes3.dex */
public final class C4265g extends AbstractC6672v {

    /* renamed from: a */
    public final int f21649a;

    /* renamed from: b */
    public final int f21650b;

    /* renamed from: c */
    public boolean f21651c;

    /* renamed from: d */
    public int f21652d;

    public C4265g(int i10, int i11, int i12) {
        this.f21649a = i12;
        this.f21650b = i11;
        boolean z6 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z6 = true;
        }
        this.f21651c = z6;
        this.f21652d = z6 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21651c;
    }

    @Override // rw.AbstractC6672v
    public final int nextInt() {
        int i10 = this.f21652d;
        if (i10 != this.f21650b) {
            this.f21652d = this.f21649a + i10;
            return i10;
        }
        if (!this.f21651c) {
            throw new NoSuchElementException();
        }
        this.f21651c = false;
        return i10;
    }
}
