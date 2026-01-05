package p001o;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import p001o.d72;
import p001o.mq3;

/* loaded from: classes2.dex */
public final class td2 {

    /* renamed from: a */
    public static final td2 f46883a = new td2();

    /* renamed from: a */
    public static final void m49751a(d72.C12801a c12801a, mq3.EnumC15404c enumC15404c) {
        sq8.m48649h(c12801a, "options");
        sq8.m48649h(enumC15404c, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            c12801a.m22396g(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, enumC15404c);
        }
    }
}
