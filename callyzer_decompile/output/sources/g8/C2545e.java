package g8;

import android.os.Bundle;
import d7.C1638k;
import i8.C3182a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import og.cg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g8.e */
/* loaded from: classes.dex */
public final class C2545e {

    /* renamed from: a */
    public final C3182a f13874a;

    /* renamed from: b */
    public C2541a f13875b;

    public C2545e(C3182a c3182a) {
        this.f13874a = c3182a;
    }

    /* renamed from: a */
    public final Bundle m6563a(String key) {
        AbstractC4154l.m8923f(key, "key");
        C3182a c3182a = this.f13874a;
        if (!c3182a.f17112g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = c3182a.f17111f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM10588c = bundle.containsKey(key) ? cg.m10588c(key, bundle) : null;
        bundle.remove(key);
        if (bundle.isEmpty()) {
            c3182a.f17111f = null;
        }
        return bundleM10588c;
    }

    /* renamed from: b */
    public final InterfaceC2544d m6564b() {
        InterfaceC2544d interfaceC2544d;
        C3182a c3182a = this.f13874a;
        synchronized (c3182a.f17108c) {
            Iterator it = c3182a.f17109d.entrySet().iterator();
            do {
                interfaceC2544d = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                InterfaceC2544d interfaceC2544d2 = (InterfaceC2544d) entry.getValue();
                if (AbstractC4154l.m8918a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    interfaceC2544d = interfaceC2544d2;
                }
            } while (interfaceC2544d == null);
        }
        return interfaceC2544d;
    }

    /* renamed from: c */
    public final void m6565c(String str, InterfaceC2544d provider) {
        AbstractC4154l.m8923f(provider, "provider");
        C3182a c3182a = this.f13874a;
        synchronized (c3182a.f17108c) {
            if (c3182a.f17109d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            c3182a.f17109d.put(str, provider);
        }
    }

    /* renamed from: d */
    public final void m6566d() throws NoSuchMethodException, SecurityException {
        if (!this.f13874a.f17113h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C2541a c2541a = this.f13875b;
        if (c2541a == null) {
            c2541a = new C2541a(this);
        }
        this.f13875b = c2541a;
        try {
            C1638k.class.getDeclaredConstructor(null);
            C2541a c2541a2 = this.f13875b;
            if (c2541a2 != null) {
                c2541a2.f13871a.add(C1638k.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C1638k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }
}
