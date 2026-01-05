package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.g2;
import e1.C1901c;
import e1.C1903e;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class f1 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f2323a;

    /* renamed from: b */
    public final /* synthetic */ Map f2324b;

    public /* synthetic */ f1(Map map, int i10) {
        this.f2323a = i10;
        this.f2324b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f2323a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((c1) this.f2324b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((k6) this.f2324b).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((g2) this.f2324b).m3885d((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f2323a) {
            case 0:
                ((c1) this.f2324b).clear();
                break;
            case 1:
                ((k6) this.f2324b).clear();
                break;
            case 2:
                ((g2) this.f2324b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f2323a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((c1) this.f2324b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((k6) this.f2324b).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((g2) this.f2324b).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj4 != value3) {
                    return obj4 != null && obj4.equals(value3);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f2323a) {
            case 0:
                return new e1((c1) this.f2324b, 0);
            case 1:
                return new e1((k6) this.f2324b);
            case 2:
                return new e1((g2) this.f2324b, 2);
            default:
                return new C1901c((C1903e) this.f2324b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f2323a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((c1) this.f2324b).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((k6) this.f2324b).remove(entry2.getKey());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((g2) this.f2324b).remove(entry3.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2323a) {
            case 0:
                return ((c1) this.f2324b).size();
            case 1:
                return ((k6) this.f2324b).size();
            case 2:
                return ((g2) this.f2324b).size();
            default:
                return ((C1903e) this.f2324b).f9065c;
        }
    }
}
