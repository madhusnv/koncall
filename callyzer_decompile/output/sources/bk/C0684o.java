package bk;

import a1.C0004c;
import a1.C0013l;
import ak.C0162a;
import ak.C0165d;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import p020v.a1;
import pg.l8;
import xm.o4;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.o */
/* loaded from: classes.dex */
public final class C0684o {

    /* renamed from: a */
    public final /* synthetic */ int f4291a;

    /* renamed from: b */
    public final /* synthetic */ Object f4292b;

    public /* synthetic */ C0684o(int i10, Object obj) {
        this.f4291a = i10;
        this.f4292b = obj;
    }

    /* renamed from: a */
    public final void m1963a(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        switch (this.f4291a) {
            case 0:
                C0685p c0685p = (C0685p) this.f4292b;
                synchronized (c0685p) {
                    c0685p.f4298d = true;
                }
                ((C0685p) this.f4292b).m1971g(firebaseRemoteConfigException);
                return;
            default:
                a1.m14346z("Realtime update error: ", firebaseRemoteConfigException.getMessage(), ((o4) this.f4292b).f40673c, "RemoteConfigRepository");
                return;
        }
    }

    /* renamed from: b */
    public final void m1964b(C0162a c0162a) {
        switch (this.f4291a) {
            case 0:
                break;
            default:
                o4 o4Var = (o4) this.f4292b;
                if (!c0162a.f500a.isEmpty()) {
                    C0165d c0165d = o4Var.f40674d;
                    C8656m c8656mM1948b = c0165d.f507c.m1948b();
                    C8656m c8656mM1948b2 = c0165d.f508d.m1948b();
                    l8.m11767h(c8656mM1948b, c8656mM1948b2).m15981h(c0165d.f506b, new C0013l(2, c0165d, c8656mM1948b, c8656mM1948b2)).m15976c(new C0004c(24, c0162a, o4Var));
                    break;
                }
                break;
        }
    }

    /* renamed from: c */
    private final void m1962c(C0162a c0162a) {
    }
}
