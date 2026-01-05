package com.facebook.login;

import android.net.Uri;
import p001o.a94;
import p001o.gi9;
import p001o.id5;
import p001o.kf9;
import p001o.si9;
import p001o.uk7;

/* renamed from: com.facebook.login.b */
/* loaded from: classes5.dex */
public final class C10827b extends C10830e {

    /* renamed from: o */
    public static final b f11639o = new b(null);

    /* renamed from: p */
    public static final gi9 f11640p = si9.m48360a(a.f11642a);

    /* renamed from: n */
    public Uri f11641n;

    /* renamed from: com.facebook.login.b$a */
    public static final class a extends kf9 implements uk7 {

        /* renamed from: a */
        public static final a f11642a = new a();

        public a() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C10827b invoke() {
            return new C10827b();
        }
    }

    /* renamed from: com.facebook.login.b$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final C10827b m13362a() {
            return (C10827b) C10827b.m13359K().getValue();
        }
    }

    /* renamed from: K */
    public static final /* synthetic */ gi9 m13359K() {
        if (a94.m16694d(C10827b.class)) {
            return null;
        }
        try {
            return f11640p;
        } catch (Throwable th) {
            a94.m16692b(th, C10827b.class);
            return null;
        }
    }

    /* renamed from: L */
    public final void m13360L(Uri uri) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            this.f11641n = uri;
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
