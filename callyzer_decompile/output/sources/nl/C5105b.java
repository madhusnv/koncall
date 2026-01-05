package nl;

import java.util.ArrayList;
import java.util.Iterator;
import ml.AbstractC4787b;
import ml.C4788c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nl.b */
/* loaded from: classes.dex */
public final class C5105b extends AbstractC4787b implements Iterable {

    /* renamed from: b */
    public final ArrayList f25004b;

    /* renamed from: c */
    public byte[] f25005c;

    public C5105b(ArrayList arrayList) {
        super(C4788c.f23825f);
        this.f25004b = arrayList;
    }

    @Override // ml.AbstractC4787b
    /* renamed from: a */
    public final Object mo9711a() {
        return new ArrayList(this.f25004b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ArrayList(this.f25004b).iterator();
    }
}
