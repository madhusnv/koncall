package com.onesignal.common.modeling;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p001o.azh;
import p001o.dh3;
import p001o.id5;
import p001o.kh3;
import p001o.sq8;
import p001o.wb9;

/* loaded from: classes6.dex */
public class MapModel<V> extends Model implements Map<String, V>, wb9 {
    /* JADX WARN: Multi-variable type inference failed */
    public MapModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // java.util.Map
    public void clear() {
        Iterator<String> it = getData().keySet().iterator();
        while (it.hasNext()) {
            Model.setOptAnyProperty$default(this, it.next(), null, null, false, 12, null);
        }
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(V v) {
        return getData().containsValue(v);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ V get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public Set<Map.Entry<String, V>> getEntries() {
        Set<Map.Entry<String, Object>> setEntrySet = getData().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (azh.m18060m(obj)) {
                arrayList.add(obj);
            }
        }
        return kh3.U0(arrayList);
    }

    public Set<String> getKeys() {
        return getData().keySet();
    }

    public int getSize() {
        return getData().size();
    }

    public Collection<V> getValues() {
        Collection<Object> collectionValues = getData().values();
        ArrayList arrayList = new ArrayList(dh3.m23088v(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return kh3.T0(arrayList);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getData().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        return put2(str, (String) obj);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends V> map) {
        sq8.m48649h(map, Constants.MessagePayloadKeys.FROM);
        for (Map.Entry<? extends String, ? extends V> entry : map.entrySet()) {
            Model.setOptAnyProperty$default(this, entry.getKey(), entry.getValue(), null, false, 12, null);
        }
    }

    @Override // java.util.Map
    public final /* bridge */ V remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public /* synthetic */ MapModel(Model model, String str, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : model, (i & 2) != 0 ? null : str);
    }

    public boolean containsKey(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return getData().containsKey(str);
    }

    public V get(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return (V) Model.getOptAnyProperty$default(this, str, null, 2, null);
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public V put2(String str, V v) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        Model.setOptAnyProperty$default(this, str, v, null, false, 12, null);
        return v;
    }

    public V remove(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        V v = (V) Model.getOptAnyProperty$default(this, str, null, 2, null);
        Model.setOptAnyProperty$default(this, str, null, null, false, 12, null);
        return v;
    }

    public MapModel(Model model, String str) {
        super(model, str);
    }
}
