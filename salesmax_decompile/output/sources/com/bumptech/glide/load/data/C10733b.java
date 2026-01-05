package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC10732a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p001o.bgd;

/* renamed from: com.bumptech.glide.load.data.b */
/* loaded from: classes5.dex */
public class C10733b {

    /* renamed from: b */
    public static final InterfaceC10732a.a f11212b = new a();

    /* renamed from: a */
    public final Map f11213a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.b$a */
    public class a implements InterfaceC10732a.a {
        @Override // com.bumptech.glide.load.data.InterfaceC10732a.a
        /* renamed from: a */
        public Class mo12703a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC10732a.a
        /* renamed from: b */
        public InterfaceC10732a mo12704b(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.b$b */
    public static final class b implements InterfaceC10732a {

        /* renamed from: a */
        public final Object f11214a;

        public b(Object obj) {
            this.f11214a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC10732a
        /* renamed from: b */
        public void mo12700b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC10732a
        /* renamed from: c */
        public Object mo12701c() {
            return this.f11214a;
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC10732a m12706a(Object obj) {
        InterfaceC10732a.a aVar;
        bgd.m18886d(obj);
        aVar = (InterfaceC10732a.a) this.f11213a.get(obj.getClass());
        if (aVar == null) {
            Iterator it = this.f11213a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC10732a.a aVar2 = (InterfaceC10732a.a) it.next();
                if (aVar2.mo12703a().isAssignableFrom(obj.getClass())) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f11212b;
        }
        return aVar.mo12704b(obj);
    }

    /* renamed from: b */
    public synchronized void m12707b(InterfaceC10732a.a aVar) {
        this.f11213a.put(aVar.mo12703a(), aVar);
    }
}
