package tk;

import ee.C2039g;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tk.a */
/* loaded from: classes.dex */
public final class C7171a extends LinkedHashMap {

    /* renamed from: a */
    public final /* synthetic */ C2039g f34433a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7171a(int i10, C2039g c2039g) {
        super(i10, 0.75f, true);
        this.f34433a = c2039g;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f34433a.f9605b;
    }
}
