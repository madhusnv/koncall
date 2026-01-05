package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l1 extends m1 {
    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: c */
    public final boolean mo930c(long j6, Object obj) {
        return this.f2375a.getBoolean(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: d */
    public final double mo931d(long j6, Object obj) {
        return this.f2375a.getDouble(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: e */
    public final float mo932e(long j6, Object obj) {
        return this.f2375a.getFloat(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: j */
    public final void mo933j(Object obj, long j6, boolean z6) {
        this.f2375a.putBoolean(obj, j6, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: k */
    public final void mo934k(Object obj, long j6, byte b10) {
        this.f2375a.putByte(obj, j6, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: l */
    public final void mo935l(Object obj, long j6, double d2) {
        this.f2375a.putDouble(obj, j6, d2);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: m */
    public final void mo936m(Object obj, long j6, float f6) {
        this.f2375a.putFloat(obj, j6, f6);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: q */
    public final boolean mo964q() {
        if (!super.mo964q()) {
            return false;
        }
        try {
            Class<?> cls = this.f2375a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            n1.m1007a(th2);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    /* renamed from: r */
    public final boolean mo937r() {
        Unsafe unsafe = this.f2375a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (n1.m1013g() != null) {
                    try {
                        Class<?> cls3 = this.f2375a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        n1.m1007a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                n1.m1007a(th3);
            }
        }
        return false;
    }
}
