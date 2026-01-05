package ad;

import ac.C0088a;
import ec.C2022t;
import ec.InterfaceC2015m;
import ec.InterfaceC2017o;
import ex.InterfaceC2139c;
import fc.C2261i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.d0;
import mx.InterfaceC4911g;
import nx.AbstractC5178p;
import qw.C6361k;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import sd.C6808b;
import sd.C6813g;
import sd.InterfaceC6811e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ad.g */
/* loaded from: classes.dex */
public final class C0100g implements InterfaceC2017o {

    /* renamed from: a */
    public final InterfaceC2017o f349a = new C2022t(new LinkedHashMap());

    /* renamed from: b */
    public boolean f350b = false;

    /* renamed from: c */
    public final C2261i f351c;

    /* renamed from: d */
    public final C2261i f352d;

    public C0100g() {
        C0094a c0094a = C0094a.f343a;
        C6813g c6813g = C6813g.f32360j;
        int i10 = 0;
        this.f351c = new C2261i(this, c0094a, new C0088a(1, c6813g, InterfaceC6811e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 1), C0095b.f344a, new C0088a(1, c6813g, InterfaceC6811e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", i10, 2));
        int i11 = 1;
        this.f352d = new C2261i(this, C0098e.f347a, new C0088a(i11, c6813g, InterfaceC6811e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", i10, 5), C0099f.f348a, new C0088a(i11, c6813g, InterfaceC6811e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", i10, 6));
    }

    @Override // ec.InterfaceC2017o
    /* renamed from: a */
    public final InterfaceC4911g mo261a() {
        return this.f349a.mo261a();
    }

    @Override // ec.InterfaceC2017o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean mo270k(C6808b key, Collection values) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(values, "values");
        return this.f349a.mo270k(key, values);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f349a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof C6808b)) {
            return false;
        }
        return this.f349a.containsKey((C6808b) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!d0.m8910g(obj)) {
            return false;
        }
        List value = (List) obj;
        AbstractC4154l.m8923f(value, "value");
        return this.f349a.containsValue(value);
    }

    /* renamed from: d */
    public final C0103j m263d() {
        return new C0103j(this.f349a.mo264e(), this.f350b);
    }

    @Override // ec.InterfaceC2017o
    /* renamed from: e */
    public final InterfaceC2015m mo264e() {
        return this.f349a.mo264e();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f349a.entrySet();
    }

    /* renamed from: f */
    public final void m265f(C0103j c0103j) {
        clear();
        for (Map.Entry entry : c0103j.f356a.entrySet()) {
            put(entry.getKey(), (Object) AbstractC6663m.d0((List) entry.getValue()));
        }
        this.f350b = c0103j.f357b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ec.InterfaceC2017o
    /* renamed from: g */
    public final boolean mo266g(Object obj, String str) {
        C6808b value = (C6808b) obj;
        AbstractC4154l.m8923f(value, "value");
        return this.f349a.mo266g(value, (String) ((C6808b) str));
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof C6808b)) {
            return null;
        }
        return (List) this.f349a.get((C6808b) obj);
    }

    /* renamed from: h */
    public final void m267h(InterfaceC6811e encoding, InterfaceC2139c interfaceC2139c) {
        C2261i c2261i;
        AbstractC4154l.m8923f(encoding, "encoding");
        if (encoding.equals(C6813g.f32360j)) {
            c2261i = this.f351c;
        } else {
            int i10 = 0;
            int i11 = 1;
            c2261i = new C2261i(this, C0096c.f345a, new C0088a(i11, encoding, InterfaceC6811e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", i10, 3), C0097d.f346a, new C0088a(i11, encoding, InterfaceC6811e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", i10, 4));
        }
        interfaceC2139c.invoke(c2261i);
    }

    /* renamed from: i */
    public final void m268i(C2261i c2261i, String str) {
        String str2;
        clear();
        this.f350b = AbstractC4154l.m8918a(str, "?");
        String strM10107R = AbstractC5178p.m10107R(str, "?");
        if (strM10107R.length() <= 0) {
            return;
        }
        List listM10112W = AbstractC5178p.m10112W(strM10107R, new String[]{"&"}, 6);
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listM10112W, 10));
        Iterator it = listM10112W.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    C6361k c6361k = (C6361k) obj;
                    String str3 = (String) c6361k.f30755a;
                    Object arrayList2 = linkedHashMap.get(str3);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str3, arrayList2);
                    }
                    ((List) arrayList2).add((String) c6361k.f30756b);
                }
                c2261i.mo271m(linkedHashMap);
                return;
            }
            String str4 = (String) it.next();
            List listM10112W2 = AbstractC5178p.m10112W(str4, new String[]{"="}, 6);
            String str5 = (String) listM10112W2.get(0);
            int size2 = listM10112W2.size();
            if (size2 == 1) {
                str2 = "";
            } else {
                if (size2 != 2) {
                    throw new IllegalArgumentException("invalid query string segment ".concat(str4));
                }
                str2 = (String) listM10112W2.get(1);
            }
            arrayList.add(new C6361k(str5, str2));
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f349a.isEmpty();
    }

    @Override // ec.InterfaceC2017o, java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final List put(C6808b key, C6808b value) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        return this.f349a.put((Object) key, (Object) value);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f349a.keySet();
    }

    @Override // ec.InterfaceC2017o
    /* renamed from: m */
    public final void mo271m(Map map) {
        this.f349a.mo271m(map);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        C6808b key = (C6808b) obj;
        List value = (List) obj2;
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        return (List) this.f349a.put((InterfaceC2017o) key, (C6808b) value);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC4154l.m8923f(from, "from");
        this.f349a.putAll(from);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof C6808b)) {
            return null;
        }
        return (List) this.f349a.remove((C6808b) obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f349a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f349a.values();
    }
}
