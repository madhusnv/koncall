package fk;

import android.app.Application;
import android.content.Context;
import dr.C1770t;
import ik.C3287k;
import ji.C3773g;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.o */
/* loaded from: classes.dex */
public final class C2309o {

    /* renamed from: a */
    public final C3773g f10463a;

    /* renamed from: b */
    public final C3287k f10464b;

    public C2309o(C3773g firebaseApp, C3287k settings, InterfaceC7564h backgroundDispatcher, a1 sessionsActivityLifecycleCallbacks) {
        AbstractC4154l.m8923f(firebaseApp, "firebaseApp");
        AbstractC4154l.m8923f(settings, "settings");
        AbstractC4154l.m8923f(backgroundDispatcher, "backgroundDispatcher");
        AbstractC4154l.m8923f(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f10463a = firebaseApp;
        this.f10464b = settings;
        firebaseApp.m8293a();
        Context applicationContext = firebaseApp.f19662a.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            applicationContext.getClass().toString();
            return;
        }
        ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
        tx.c0.m13502y(tx.c0.m13479b(backgroundDispatcher), null, null, new C1770t(this, sessionsActivityLifecycleCallbacks, null, 11), 3);
    }
}
