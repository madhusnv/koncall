package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: a */
    public final Unsafe f7089a;

    public q1(Unsafe unsafe) {
        this.f7089a = unsafe;
    }

    /* renamed from: a */
    public final int m4369a(Class cls) {
        return this.f7089a.arrayBaseOffset(cls);
    }

    /* renamed from: b */
    public final int m4370b(Class cls) {
        return this.f7089a.arrayIndexScale(cls);
    }

    /* renamed from: c */
    public abstract boolean mo4355c(long j6, Object obj);

    /* renamed from: d */
    public abstract byte mo4356d(long j6, Object obj);

    /* renamed from: e */
    public abstract double mo4357e(long j6, Object obj);

    /* renamed from: f */
    public abstract float mo4358f(long j6, Object obj);

    /* renamed from: g */
    public final int m4371g(long j6, Object obj) {
        return this.f7089a.getInt(obj, j6);
    }

    /* renamed from: h */
    public final long m4372h(long j6, Object obj) {
        return this.f7089a.getLong(obj, j6);
    }

    /* renamed from: i */
    public final Object m4373i(long j6, Object obj) {
        return this.f7089a.getObject(obj, j6);
    }

    /* renamed from: j */
    public final long m4374j(Field field) {
        return this.f7089a.objectFieldOffset(field);
    }

    /* renamed from: k */
    public abstract void mo4359k(Object obj, long j6, boolean z6);

    /* renamed from: l */
    public abstract void mo4360l(Object obj, long j6, byte b10);

    /* renamed from: m */
    public abstract void mo4361m(Object obj, long j6, double d2);

    /* renamed from: n */
    public abstract void mo4362n(Object obj, long j6, float f6);

    /* renamed from: o */
    public final void m4375o(int i10, long j6, Object obj) {
        this.f7089a.putInt(obj, j6, i10);
    }

    /* renamed from: p */
    public final void m4376p(Object obj, long j6, long j10) {
        this.f7089a.putLong(obj, j6, j10);
    }

    /* renamed from: q */
    public final void m4377q(Object obj, long j6, Object obj2) {
        this.f7089a.putObject(obj, j6, obj2);
    }
}
