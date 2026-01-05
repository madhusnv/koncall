package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a */
    public final Unsafe f2375a;

    public m1(Unsafe unsafe) {
        this.f2375a = unsafe;
    }

    /* renamed from: a */
    public final int m998a(Class cls) {
        return this.f2375a.arrayBaseOffset(cls);
    }

    /* renamed from: b */
    public final int m999b(Class cls) {
        return this.f2375a.arrayIndexScale(cls);
    }

    /* renamed from: c */
    public abstract boolean mo930c(long j6, Object obj);

    /* renamed from: d */
    public abstract double mo931d(long j6, Object obj);

    /* renamed from: e */
    public abstract float mo932e(long j6, Object obj);

    /* renamed from: f */
    public final int m1000f(long j6, Object obj) {
        return this.f2375a.getInt(obj, j6);
    }

    /* renamed from: g */
    public final long m1001g(long j6, Object obj) {
        return this.f2375a.getLong(obj, j6);
    }

    /* renamed from: h */
    public final Object m1002h(long j6, Object obj) {
        return this.f2375a.getObject(obj, j6);
    }

    /* renamed from: i */
    public final long m1003i(Field field) {
        return this.f2375a.objectFieldOffset(field);
    }

    /* renamed from: j */
    public abstract void mo933j(Object obj, long j6, boolean z6);

    /* renamed from: k */
    public abstract void mo934k(Object obj, long j6, byte b10);

    /* renamed from: l */
    public abstract void mo935l(Object obj, long j6, double d2);

    /* renamed from: m */
    public abstract void mo936m(Object obj, long j6, float f6);

    /* renamed from: n */
    public final void m1004n(int i10, long j6, Object obj) {
        this.f2375a.putInt(obj, j6, i10);
    }

    /* renamed from: o */
    public final void m1005o(Object obj, long j6, long j10) {
        this.f2375a.putLong(obj, j6, j10);
    }

    /* renamed from: p */
    public final void m1006p(Object obj, long j6, Object obj2) {
        this.f2375a.putObject(obj, j6, obj2);
    }

    /* renamed from: q */
    public boolean mo964q() {
        Unsafe unsafe = this.f2375a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            n1.m1007a(th2);
            return false;
        }
    }

    /* renamed from: r */
    public abstract boolean mo937r();
}
