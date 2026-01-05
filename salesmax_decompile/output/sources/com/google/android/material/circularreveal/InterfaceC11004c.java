package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.C11003b;
import p001o.oza;

/* renamed from: com.google.android.material.circularreveal.c */
/* loaded from: classes3.dex */
public interface InterfaceC11004c extends C11003b.a {

    /* renamed from: com.google.android.material.circularreveal.c$b */
    public static class b implements TypeEvaluator {

        /* renamed from: b */
        public static final TypeEvaluator f12371b = new b();

        /* renamed from: a */
        public final e f12372a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f, e eVar, e eVar2) {
            this.f12372a.m14444b(oza.m42807f(eVar.f12375a, eVar2.f12375a, f), oza.m42807f(eVar.f12376b, eVar2.f12376b, f), oza.m42807f(eVar.f12377c, eVar2.f12377c, f));
            return this.f12372a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c */
    public static class c extends Property {

        /* renamed from: a */
        public static final Property f12373a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(InterfaceC11004c interfaceC11004c) {
            return interfaceC11004c.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(InterfaceC11004c interfaceC11004c, e eVar) {
            interfaceC11004c.setRevealInfo(eVar);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$d */
    public static class d extends Property {

        /* renamed from: a */
        public static final Property f12374a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(InterfaceC11004c interfaceC11004c) {
            return Integer.valueOf(interfaceC11004c.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(InterfaceC11004c interfaceC11004c, Integer num) {
            interfaceC11004c.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$e */
    public static class e {

        /* renamed from: a */
        public float f12375a;

        /* renamed from: b */
        public float f12376b;

        /* renamed from: c */
        public float f12377c;

        public e() {
        }

        /* renamed from: a */
        public boolean m14443a() {
            return this.f12377c == Float.MAX_VALUE;
        }

        /* renamed from: b */
        public void m14444b(float f, float f2, float f3) {
            this.f12375a = f;
            this.f12376b = f2;
            this.f12377c = f3;
        }

        /* renamed from: c */
        public void m14445c(e eVar) {
            m14444b(eVar.f12375a, eVar.f12376b, eVar.f12377c);
        }

        public e(float f, float f2, float f3) {
            this.f12375a = f;
            this.f12376b = f2;
            this.f12377c = f3;
        }

        public e(e eVar) {
            this(eVar.f12375a, eVar.f12376b, eVar.f12377c);
        }
    }

    /* renamed from: a */
    void mo14416a();

    /* renamed from: b */
    void mo14417b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
