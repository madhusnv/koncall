package og;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.l */
/* loaded from: classes.dex */
public final class C5371l extends C5368i implements ListIterator {

    /* renamed from: e */
    public final /* synthetic */ C5372m f26605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5371l(C5372m c5372m) {
        super(c5372m);
        this.f26605e = c5372m;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C5372m c5372m = this.f26605e;
        boolean zIsEmpty = c5372m.isEmpty();
        m10694a();
        ((ListIterator) this.f26524b).add(obj);
        if (zIsEmpty) {
            c5372m.m10754a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m10694a();
        return ((ListIterator) this.f26524b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m10694a();
        return ((ListIterator) this.f26524b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m10694a();
        return ((ListIterator) this.f26524b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m10694a();
        return ((ListIterator) this.f26524b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m10694a();
        ((ListIterator) this.f26524b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5371l(C5372m c5372m, int i10) {
        super(c5372m, ((List) c5372m.f26628b).listIterator(i10));
        this.f26605e = c5372m;
    }
}
