package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.util.List;
import java.util.Map;
import p001o.dhe;
import p001o.dt7;
import p001o.fo7;
import p001o.kzi;
import p001o.oe8;
import p001o.ovh;
import p001o.qme;
import p001o.wo0;
import p001o.yf6;

/* renamed from: com.bumptech.glide.c */
/* loaded from: classes5.dex */
public class C10726c extends ContextWrapper {

    /* renamed from: k */
    public static final ovh f11182k = new fo7();

    /* renamed from: a */
    public final wo0 f11183a;

    /* renamed from: b */
    public final dt7.InterfaceC13029b f11184b;

    /* renamed from: c */
    public final oe8 f11185c;

    /* renamed from: d */
    public final ComponentCallbacks2C10724a.a f11186d;

    /* renamed from: e */
    public final List f11187e;

    /* renamed from: f */
    public final Map f11188f;

    /* renamed from: g */
    public final yf6 f11189g;

    /* renamed from: h */
    public final C10727d f11190h;

    /* renamed from: i */
    public final int f11191i;

    /* renamed from: j */
    public qme f11192j;

    public C10726c(Context context, wo0 wo0Var, dt7.InterfaceC13029b interfaceC13029b, oe8 oe8Var, ComponentCallbacks2C10724a.a aVar, Map map, List list, yf6 yf6Var, C10727d c10727d, int i) {
        super(context.getApplicationContext());
        this.f11183a = wo0Var;
        this.f11185c = oe8Var;
        this.f11186d = aVar;
        this.f11187e = list;
        this.f11188f = map;
        this.f11189g = yf6Var;
        this.f11190h = c10727d;
        this.f11191i = i;
        this.f11184b = dt7.m23783a(interfaceC13029b);
    }

    /* renamed from: a */
    public kzi m12668a(ImageView imageView, Class cls) {
        return this.f11185c.m42119a(imageView, cls);
    }

    /* renamed from: b */
    public wo0 m12669b() {
        return this.f11183a;
    }

    /* renamed from: c */
    public List m12670c() {
        return this.f11187e;
    }

    /* renamed from: d */
    public synchronized qme m12671d() {
        if (this.f11192j == null) {
            this.f11192j = (qme) this.f11186d.build().mo17809P();
        }
        return this.f11192j;
    }

    /* renamed from: e */
    public ovh m12672e(Class cls) {
        ovh ovhVar = (ovh) this.f11188f.get(cls);
        if (ovhVar == null) {
            for (Map.Entry entry : this.f11188f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    ovhVar = (ovh) entry.getValue();
                }
            }
        }
        return ovhVar == null ? f11182k : ovhVar;
    }

    /* renamed from: f */
    public yf6 m12673f() {
        return this.f11189g;
    }

    /* renamed from: g */
    public C10727d m12674g() {
        return this.f11190h;
    }

    /* renamed from: h */
    public int m12675h() {
        return this.f11191i;
    }

    /* renamed from: i */
    public dhe m12676i() {
        return (dhe) this.f11184b.get();
    }
}
