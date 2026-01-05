package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p001o.wb9;

/* loaded from: classes3.dex */
public final class oe2 implements Map, wb9 {

    /* renamed from: a */
    public final Map f38199a = new LinkedHashMap();

    /* renamed from: o.oe2$a */
    public static final class C15769a implements Map.Entry, wb9.InterfaceC17813a {

        /* renamed from: a */
        public final Object f38200a;

        /* renamed from: b */
        public Object f38201b;

        public C15769a(Object obj, Object obj2) {
            this.f38200a = obj;
            this.f38201b = obj2;
        }

        /* renamed from: a */
        public void m42115a(Object obj) {
            this.f38201b = obj;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return sq8.m48644c(entry.getKey(), getKey()) && sq8.m48644c(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f38200a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f38201b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            sq8.m48646e(key);
            int iHashCode = key.hashCode() + 527;
            Object value = getValue();
            sq8.m48646e(value);
            return iHashCode + value.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            m42115a(obj);
            return getValue();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: a */
    public boolean m42107a(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return this.f38199a.containsKey(pe2.m43504b(str));
    }

    /* renamed from: c */
    public Object m42108c(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return this.f38199a.get(pe2.m43504b(str));
    }

    @Override // java.util.Map
    public void clear() {
        this.f38199a.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return m42107a((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f38199a.containsValue(obj);
    }

    /* renamed from: d */
    public Set m42109d() {
        Set<Map.Entry> setEntrySet = this.f38199a.entrySet();
        ArrayList arrayList = new ArrayList(dh3.m23088v(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new C15769a(((qe2) entry.getKey()).m45225a(), entry.getValue()));
        }
        return kh3.U0(arrayList);
    }

    /* renamed from: e */
    public Set m42110e() {
        Set setKeySet = this.f38199a.keySet();
        ArrayList arrayList = new ArrayList(dh3.m23088v(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((qe2) it.next()).m45225a());
        }
        return kh3.U0(arrayList);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m42109d();
    }

    /* renamed from: f */
    public int m42111f() {
        return this.f38199a.size();
    }

    /* renamed from: g */
    public Collection m42112g() {
        return this.f38199a.values();
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return m42108c((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object put(String str, Object obj) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return this.f38199a.put(pe2.m43504b(str), obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f38199a.isEmpty();
    }

    /* renamed from: k */
    public Object m42114k(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return this.f38199a.remove(pe2.m43504b(str));
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m42110e();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        sq8.m48649h(map, Constants.MessagePayloadKeys.FROM);
        for (Map.Entry entry : map.entrySet()) {
            put((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return m42114k((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m42111f();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m42112g();
    }
}
