package p001o;

import p001o.mq3;

/* loaded from: classes2.dex */
public interface kd8 extends lce {

    /* renamed from: h */
    public static final mq3.AbstractC15402a f31942h = mq3.AbstractC15402a.m39507a("camerax.core.imageInput.inputFormat", Integer.TYPE);

    /* renamed from: i */
    public static final mq3.AbstractC15402a f31943i = mq3.AbstractC15402a.m39507a("camerax.core.imageInput.inputDynamicRange", y16.class);

    /* renamed from: E */
    default y16 m35425E() {
        return (y16) fgd.m26663g((y16) mo36958d(f31943i, y16.f54702c));
    }

    /* renamed from: n */
    default int mo19021n() {
        return ((Integer) mo36960f(f31942h)).intValue();
    }
}
