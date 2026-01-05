package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zma {

    /* renamed from: a */
    public final LinkedHashMap f57407a;

    public zma(int i, float f) {
        this.f57407a = new LinkedHashMap(i, f, true);
    }

    /* renamed from: a */
    public final Object m59611a(Object obj) {
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        return this.f57407a.get(obj);
    }

    /* renamed from: b */
    public final Set m59612b() {
        Set setEntrySet = this.f57407a.entrySet();
        sq8.m48648g(setEntrySet, "map.entries");
        return setEntrySet;
    }

    /* renamed from: c */
    public final boolean m59613c() {
        return this.f57407a.isEmpty();
    }

    /* renamed from: d */
    public final Object m59614d(Object obj, Object obj2) {
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj2, "value");
        return this.f57407a.put(obj, obj2);
    }

    /* renamed from: e */
    public final Object m59615e(Object obj) {
        sq8.m48649h(obj, TransferTable.COLUMN_KEY);
        return this.f57407a.remove(obj);
    }
}
