package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.concurrent.locks.ReentrantLock;
import p001o.fi4;
import p001o.id5;
import p001o.ii4;
import p001o.ji4;
import p001o.sq8;

/* renamed from: com.facebook.login.a */
/* loaded from: classes5.dex */
public final class C10826a extends ii4 {

    /* renamed from: b */
    public static fi4 f11636b;

    /* renamed from: c */
    public static ji4 f11637c;

    /* renamed from: a */
    public static final a f11635a = new a(null);

    /* renamed from: d */
    public static final ReentrantLock f11638d = new ReentrantLock();

    /* renamed from: com.facebook.login.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final ji4 m13356b() {
            C10826a.f11638d.lock();
            ji4 ji4Var = C10826a.f11637c;
            C10826a.f11637c = null;
            C10826a.f11638d.unlock();
            return ji4Var;
        }

        /* renamed from: c */
        public final void m13357c(Uri uri) {
            sq8.m48649h(uri, ImagesContract.URL);
            m13358d();
            C10826a.f11638d.lock();
            ji4 ji4Var = C10826a.f11637c;
            if (ji4Var != null) {
                ji4Var.m33859f(uri, null, null);
            }
            C10826a.f11638d.unlock();
        }

        /* renamed from: d */
        public final void m13358d() {
            fi4 fi4Var;
            C10826a.f11638d.lock();
            if (C10826a.f11637c == null && (fi4Var = C10826a.f11636b) != null) {
                C10826a.f11637c = fi4Var.m26738f(null);
            }
            C10826a.f11638d.unlock();
        }
    }

    @Override // p001o.ii4
    public void onCustomTabsServiceConnected(ComponentName componentName, fi4 fi4Var) {
        sq8.m48649h(componentName, "name");
        sq8.m48649h(fi4Var, "newClient");
        fi4Var.m26740h(0L);
        f11636b = fi4Var;
        f11635a.m13358d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        sq8.m48649h(componentName, "componentName");
    }
}
