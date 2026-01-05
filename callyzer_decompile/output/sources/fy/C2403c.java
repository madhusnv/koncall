package fy;

import bt.i0;
import hy.InterfaceC3055f;
import i0.m0;
import iy.InterfaceC3364a;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlinx.serialization.SerializationException;
import lx.InterfaceC4564c;
import ly.C4597u;
import og.nd;
import og.qf;
import qw.C6361k;
import qw.EnumC6359i;
import rw.AbstractC6662l;
import rw.AbstractC6674x;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fy.c */
/* loaded from: classes3.dex */
public final class C2403c implements InterfaceC2401a {

    /* renamed from: a */
    public final C4147e f10882a;

    /* renamed from: b */
    public final List f10883b;

    /* renamed from: c */
    public final Object f10884c;

    /* renamed from: d */
    public final Map f10885d;

    /* renamed from: e */
    public final LinkedHashMap f10886e;

    public C2403c(String str, C4147e c4147e, InterfaceC4564c[] interfaceC4564cArr, InterfaceC2401a[] interfaceC2401aArr, Annotation[] annotationArr) {
        this.f10882a = c4147e;
        this.f10883b = C6668r.f31943a;
        this.f10884c = nd.m10781b(EnumC6359i.PUBLICATION, new i0(12, str, this));
        if (interfaceC4564cArr.length != interfaceC2401aArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + c4147e.m8914c() + " should be marked @Serializable");
        }
        int iMin = Math.min(interfaceC4564cArr.length, interfaceC2401aArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new C6361k(interfaceC4564cArr[i10], interfaceC2401aArr[i10]));
        }
        Map mapM12784l = AbstractC6674x.m12784l(arrayList);
        this.f10885d = mapM12784l;
        Set<Map.Entry> setEntrySet = mapM12784l.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strMo7277a = ((InterfaceC2401a) entry.getValue()).getDescriptor().mo7277a();
            Object obj = linkedHashMap.get(strMo7277a);
            if (obj == null) {
                linkedHashMap.containsKey(strMo7277a);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f10882a + "' have the same serial name '" + strMo7277a + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strMo7277a, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC6674x.m12776d(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (InterfaceC2401a) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f10886e = linkedHashMap2;
        this.f10883b = AbstractC6662l.m12711a(annotationArr);
    }

    /* renamed from: a */
    public final InterfaceC4564c m6077a() {
        return this.f10882a;
    }

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        InterfaceC3055f descriptor = getDescriptor();
        InterfaceC3364a interfaceC3364aMo7699c = interfaceC3366c.mo7699c(descriptor);
        Object objMo7689u = null;
        String strMo7681d = null;
        while (true) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(getDescriptor());
            if (iMo7685o == -1) {
                if (objMo7689u == null) {
                    throw new IllegalArgumentException(m0.m7378k("Polymorphic value has not been read for class ", strMo7681d).toString());
                }
                interfaceC3364aMo7699c.mo7680b(descriptor);
                return objMo7689u;
            }
            if (iMo7685o == 0) {
                strMo7681d = interfaceC3364aMo7699c.mo7681d(getDescriptor(), iMo7685o);
            } else {
                if (iMo7685o != 1) {
                    StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strMo7681d == null) {
                        strMo7681d = "unknown class";
                    }
                    sb2.append(strMo7681d);
                    sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb2.append(iMo7685o);
                    throw new SerializationException(sb2.toString());
                }
                if (strMo7681d == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                objMo7689u = interfaceC3364aMo7699c.mo7689u(getDescriptor(), iMo7685o, qf.m10863a(this, interfaceC3364aMo7699c, strMo7681d), null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qw.g] */
    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return (InterfaceC3055f) this.f10884c.getValue();
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object value) {
        AbstractC4154l.m8923f(value, "value");
        InterfaceC2401a interfaceC2401aM10864b = qf.m10864b(this, (C4597u) interfaceC3367d, value);
        InterfaceC3055f descriptor = getDescriptor();
        C4597u c4597u = (C4597u) interfaceC3367d.mo7711c(descriptor);
        c4597u.m9444w(getDescriptor(), 0, interfaceC2401aM10864b.getDescriptor().mo7277a());
        c4597u.m9443v(getDescriptor(), 1, interfaceC2401aM10864b, value);
        c4597u.mo7693b(descriptor);
    }
}
