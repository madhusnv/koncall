package com.razorpay;

import android.app.Activity;

/* loaded from: classes6.dex */
final class p$$q_ {

    /* renamed from: b */
    public static String f13801b = "magic_version";

    /* renamed from: a */
    Activity f13802a;

    /* renamed from: c */
    private String f13803c;

    public p$$q_(Activity activity) {
        this.f13802a = activity;
    }

    /* renamed from: a */
    public final String m16101a() {
        if (this.f13803c == null) {
            if (BaseUtils.getLocalVersion(this.f13802a, f13801b).equals(BaseUtils.getVersionFromJsonString(BaseConfig.getVersionJSON(), f13801b))) {
                this.f13803c = BaseConfig.getMagicJs();
            } else {
                try {
                    this.f13803c = BaseUtils.getFileFromInternal(this.f13802a, g$_H$.m16059a().getMagicJsFileName(), f13801b);
                } catch (Exception unused) {
                    this.f13803c = BaseConfig.getMagicJs();
                }
            }
        }
        return this.f13803c;
    }
}
