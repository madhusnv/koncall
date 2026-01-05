package mq;

import ex.InterfaceC2142f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import lq.C4508c;
import og.cf;
import og.od;
import q6.C6133e;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import s6.C6763b;
import s6.C6765d;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class z0 extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f24362a = 1;

    /* renamed from: b */
    public /* synthetic */ Object f24363b;

    /* renamed from: c */
    public /* synthetic */ Object f24364c;

    public /* synthetic */ z0(int i10, InterfaceC7559c interfaceC7559c) {
        super(i10, interfaceC7559c);
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f24362a) {
            case 0:
                ((Number) obj2).intValue();
                z0 z0Var = new z0((a1) this.f24364c, (InterfaceC7559c) obj3);
                z0Var.f24363b = (List) obj;
                qw.a0 a0Var = qw.a0.f30746a;
                z0Var.invokeSuspend(a0Var);
                return a0Var;
            default:
                z0 z0Var2 = new z0(3, (InterfaceC7559c) obj3);
                z0Var2.f24363b = (C6133e) obj;
                z0Var2.f24364c = (C6763b) obj2;
                return z0Var2.invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean z6;
        boolean z10 = false;
        int i10 = 1;
        switch (this.f24362a) {
            case 0:
                List list = (List) this.f24363b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1 a1Var = (a1) this.f24364c;
                ArrayList arrayListM12754R = AbstractC6663m.m12754R(((C4508c) a1Var.f24149p.f39340a.getValue()).f22428a, list);
                m1 m1Var = a1Var.f24148o;
                while (true) {
                    Object value = m1Var.getValue();
                    C4508c c4508c = (C4508c) value;
                    int size = arrayListM12754R.size();
                    if (list.size() < a1Var.f24150q) {
                        obj2 = value;
                        z6 = true;
                    } else {
                        obj2 = value;
                        z6 = z10;
                    }
                    if (m1Var.m15397i(obj2, C4508c.m9341a(c4508c, arrayListM12754R, z6, false, 0, true, size, false, null, false, null, 972))) {
                        if (!a1Var.f24156w) {
                            C8810d c8810d = a1Var.f24154u;
                            InterfaceC7559c interfaceC7559c = null;
                            tx.c0.m13502y(c8810d, null, null, new w0(a1Var, interfaceC7559c, i10), 3);
                            tx.c0.m13502y(c8810d, null, null, new w0(a1Var, interfaceC7559c, 2), 3);
                        }
                        return qw.a0.f30746a;
                    }
                    z10 = false;
                }
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C6133e c6133e = (C6133e) this.f24363b;
                C6763b c6763b = (C6763b) this.f24364c;
                Set setKeySet = c6763b.m12964a().keySet();
                ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C6765d) it.next()).f32221a);
                }
                Map<String, ?> all = c6133e.f29888a.getAll();
                AbstractC4154l.m8922e(all, "prefs.all");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Set set = c6133e.f29889b;
                    if (set != null ? set.contains(key) : true) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC6674x.m12776d(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if (value2 instanceof Set) {
                        value2 = AbstractC6663m.g0((Iterable) value2);
                    }
                    linkedHashMap2.put(key2, value2);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    if (!arrayList.contains((String) entry3.getKey())) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                C6763b c6763b2 = new C6763b(AbstractC6674x.m12786n(c6763b.m12964a()), false);
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    String name = (String) entry4.getKey();
                    Object value3 = entry4.getValue();
                    if (value3 instanceof Boolean) {
                        c6763b2.m12969f(cf.m10580a(name), value3);
                    } else if (value3 instanceof Float) {
                        AbstractC4154l.m8923f(name, "name");
                        c6763b2.m12969f(new C6765d(name), value3);
                    } else if (value3 instanceof Integer) {
                        c6763b2.m12969f(cf.m10582c(name), value3);
                    } else if (value3 instanceof Long) {
                        c6763b2.m12969f(cf.m10583d(name), value3);
                    } else if (value3 instanceof String) {
                        c6763b2.m12969f(cf.m10584e(name), value3);
                    } else if (value3 instanceof Set) {
                        c6763b2.m12969f(cf.m10585f(name), (Set) value3);
                    }
                }
                return new C6763b(AbstractC6674x.m12786n(c6763b2.m12964a()), true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, InterfaceC7559c interfaceC7559c) {
        super(3, interfaceC7559c);
        this.f24364c = a1Var;
    }
}
