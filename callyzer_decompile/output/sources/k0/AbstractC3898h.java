package k0;

import c3.C0848c;
import mb.b1;
import mb.c1;
import mb.d1;
import mb.e1;
import t3.InterfaceC7033t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k0.h */
/* loaded from: classes.dex */
public abstract class AbstractC3898h {

    /* renamed from: a */
    public static volatile ScheduledExecutorServiceC3894d f20004a;

    /* renamed from: a */
    public static e1 m8430a(String str) {
        return str.equals("OFF") ? b1.f23195b : str.equals("ON") ? c1.f23220b : new d1(str);
    }

    /* renamed from: b */
    public static final C0848c m8431b(InterfaceC7033t interfaceC7033t) {
        C0848c c0848cM13277f = t3.c1.m13277f(interfaceC7033t);
        long jMo13295B = interfaceC7033t.mo13295B(c0848cM13277f.m2282d());
        float f6 = c0848cM13277f.f5356c;
        float f10 = c0848cM13277f.f5357d;
        long jMo13295B2 = interfaceC7033t.mo13295B((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        return new C0848c(Float.intBitsToFloat((int) (jMo13295B >> 32)), Float.intBitsToFloat((int) (jMo13295B & 4294967295L)), Float.intBitsToFloat((int) (jMo13295B2 >> 32)), Float.intBitsToFloat((int) (jMo13295B2 & 4294967295L)));
    }
}
