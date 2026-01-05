package yh;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.g */
/* loaded from: classes.dex */
public final class C8663g extends o0 {

    /* renamed from: b */
    public boolean f41968b;

    /* renamed from: c */
    public final /* synthetic */ Object f41969c;

    public C8663g(Object obj) {
        super(4);
        this.f41969c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f41968b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0, java.util.Iterator
    public final Object next() {
        if (this.f41968b) {
            throw new NoSuchElementException();
        }
        this.f41968b = true;
        return this.f41969c;
    }
}
