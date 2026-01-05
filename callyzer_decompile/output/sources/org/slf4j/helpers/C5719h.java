package org.slf4j.helpers;

import f00.InterfaceC2172a;
import f00.InterfaceC2173b;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: org.slf4j.helpers.h */
/* loaded from: classes3.dex */
public final class C5719h implements InterfaceC2172a {

    /* renamed from: a */
    public volatile boolean f28199a = false;

    /* renamed from: b */
    public final ConcurrentHashMap f28200b = new ConcurrentHashMap();

    /* renamed from: c */
    public final LinkedBlockingQueue f28201c = new LinkedBlockingQueue();

    @Override // f00.InterfaceC2172a
    /* renamed from: c */
    public final synchronized InterfaceC2173b mo5823c(String str) {
        C5718g c5718g;
        c5718g = (C5718g) this.f28200b.get(str);
        if (c5718g == null) {
            c5718g = new C5718g(str, this.f28201c, this.f28199a);
            this.f28200b.put(str, c5718g);
        }
        return c5718g;
    }
}
