package p001o;

import p001o.mq3;

/* loaded from: classes2.dex */
public interface u82 extends lce {

    /* renamed from: a */
    public static final mq3.AbstractC15402a f48544a = mq3.AbstractC15402a.m39507a("camerax.core.camera.useCaseConfigFactory", d9i.class);

    /* renamed from: b */
    public static final mq3.AbstractC15402a f48545b = mq3.AbstractC15402a.m39507a("camerax.core.camera.compatibilityId", cb8.class);

    /* renamed from: c */
    public static final mq3.AbstractC15402a f48546c = mq3.AbstractC15402a.m39507a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* renamed from: d */
    public static final mq3.AbstractC15402a f48547d = mq3.AbstractC15402a.m39507a("camerax.core.camera.SessionProcessor", lhf.class);

    /* renamed from: e */
    public static final mq3.AbstractC15402a f48548e = mq3.AbstractC15402a.m39507a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* renamed from: f */
    public static final mq3.AbstractC15402a f48549f = mq3.AbstractC15402a.m39507a("camerax.core.camera.isPostviewSupported", Boolean.class);

    /* renamed from: g */
    public static final mq3.AbstractC15402a f48550g = mq3.AbstractC15402a.m39507a("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);

    /* renamed from: K */
    default boolean m51197K() {
        return ((Boolean) mo36958d(f48549f, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: Q */
    cb8 mo51198Q();

    /* renamed from: R */
    default boolean m51199R() {
        return ((Boolean) mo36958d(f48550g, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: j */
    default d9i m51200j() {
        return (d9i) mo36958d(f48544a, d9i.f19443a);
    }

    /* renamed from: q */
    default int m51201q() {
        return ((Integer) mo36958d(f48546c, 0)).intValue();
    }

    /* renamed from: u */
    default lhf m51202u(lhf lhfVar) {
        tq.m50332a(mo36958d(f48547d, lhfVar));
        return null;
    }
}
