package fc;

import ec.C2012j;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import og.df;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fc.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C2260h implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f10265a;

    /* renamed from: b */
    public final /* synthetic */ C2261i f10266b;

    public /* synthetic */ C2260h(C2261i c2261i, int i10) {
        this.f10265a = i10;
        this.f10266b = c2261i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ex.c, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r1v2, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f10265a) {
            case 0:
                List it = (List) obj;
                AbstractC4154l.m8923f(it, "it");
                C2261i c2261i = this.f10266b;
                return df.m10612b(it, c2261i.f10270d, c2261i.f10271e);
            case 1:
                List it2 = (List) obj;
                AbstractC4154l.m8923f(it2, "it");
                ArrayList arrayList = new ArrayList();
                ?? r12 = this.f10266b.f10271e;
                Iterator it3 = it2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(r12.invoke(it3.next()));
                }
                return arrayList;
            default:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC4154l.m8923f(entry, "<destruct>");
                Object key = entry.getKey();
                Object value = entry.getValue();
                C2261i c2261i2 = this.f10266b;
                return new C2012j(c2261i2.f10268b.get(key), c2261i2.f10270d.get(value));
        }
    }
}
