package jy;

import fy.InterfaceC2401a;
import hy.AbstractC3054e;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import iy.InterfaceC3367d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class f0 extends AbstractC3864a {

    /* renamed from: a */
    public final InterfaceC2401a f19893a;

    /* renamed from: b */
    public final e0 f19894b;

    public f0(InterfaceC2401a vSerializer) {
        a1 a1Var = a1.f19869a;
        AbstractC4154l.m8923f(vSerializer, "vSerializer");
        this.f19893a = vSerializer;
        this.f19894b = new e0(a1.f19870b, vSerializer.getDescriptor());
    }

    @Override // jy.AbstractC3864a
    /* renamed from: a */
    public final Object mo8406a() {
        return new LinkedHashMap();
    }

    @Override // jy.AbstractC3864a
    /* renamed from: b */
    public final int mo8407b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        AbstractC4154l.m8923f(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: c */
    public final Iterator mo8408c(Object obj) {
        Map map = (Map) obj;
        AbstractC4154l.m8923f(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        Map map = (Map) obj;
        AbstractC4154l.m8923f(map, "<this>");
        return map.size();
    }

    @Override // jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        Map builder = (Map) obj;
        AbstractC4154l.m8923f(builder, "builder");
        a1 a1Var = a1.f19869a;
        e0 e0Var = this.f19894b;
        Object objMo7689u = interfaceC3364a.mo7689u(e0Var, i10, a1Var, null);
        int iMo7685o = interfaceC3364a.mo7685o(e0Var);
        if (iMo7685o != i10 + 1) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("Value must follow key in a map, index for key: ", i10, iMo7685o, ", returned index for value: ").toString());
        }
        boolean zContainsKey = builder.containsKey(objMo7689u);
        InterfaceC2401a interfaceC2401a = this.f19893a;
        builder.put(objMo7689u, (!zContainsKey || (interfaceC2401a.getDescriptor().mo7280e() instanceof AbstractC3054e)) ? interfaceC3364a.mo7689u(e0Var, iMo7685o, interfaceC2401a, null) : interfaceC3364a.mo7689u(e0Var, iMo7685o, interfaceC2401a, AbstractC6674x.m12774b(builder, objMo7689u)));
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        AbstractC4154l.m8923f(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return this.f19894b;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: h */
    public final Object mo8413h(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        AbstractC4154l.m8923f(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        mo8409d(obj);
        e0 descriptor = this.f19894b;
        AbstractC4154l.m8923f(descriptor, "descriptor");
        InterfaceC3365b interfaceC3365bMo7711c = ((C4597u) interfaceC3367d).mo7711c(descriptor);
        Iterator itMo8408c = mo8408c(obj);
        int i10 = 0;
        while (itMo8408c.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo8408c.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            C4597u c4597u = (C4597u) interfaceC3365bMo7711c;
            c4597u.m9443v(descriptor, i10, a1.f19869a, key);
            i10 += 2;
            c4597u.m9443v(descriptor, i11, this.f19893a, value);
        }
        interfaceC3365bMo7711c.mo7693b(descriptor);
    }
}
