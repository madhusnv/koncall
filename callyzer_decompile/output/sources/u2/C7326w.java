package u2;

import fx.InterfaceC2398d;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.w */
/* loaded from: classes.dex */
public final class C7326w implements Map.Entry, InterfaceC2398d {

    /* renamed from: a */
    public final Object f34935a;

    /* renamed from: b */
    public Object f34936b;

    /* renamed from: c */
    public final /* synthetic */ C7327x f34937c;

    public C7326w(C7327x c7327x) {
        this.f34937c = c7327x;
        Map.Entry entry = c7327x.f34941d;
        AbstractC4154l.m8920c(entry);
        this.f34935a = entry.getKey();
        Map.Entry entry2 = c7327x.f34941d;
        AbstractC4154l.m8920c(entry2);
        this.f34936b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f34935a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f34936b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C7327x c7327x = this.f34937c;
        if (c7327x.f34938a.m13712f().f34908d != c7327x.f34940c) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f34936b;
        c7327x.f34938a.put(this.f34935a, obj);
        this.f34936b = obj;
        return obj2;
    }
}
