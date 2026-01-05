package p001o;

import ai.salesmax.model.AutoCallConfig;
import android.app.Application;

/* loaded from: classes.dex */
public final class k11 extends zf0 {

    /* renamed from: c */
    public final AutoCallConfig f31355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k11(Application application) {
        super(application);
        sq8.m48649h(application, "application");
        this.f31355c = AutoCallConfig.Companion.instance();
    }

    /* renamed from: g */
    public final AutoCallConfig m34851g() {
        return this.f31355c;
    }

    /* renamed from: h */
    public final boolean m34852h() {
        return this.f31355c.isPaused();
    }

    /* renamed from: i */
    public final void m34853i() {
        AutoCallConfig.Companion.resetInstance();
    }

    /* renamed from: j */
    public final void m34854j(boolean z) {
        this.f31355c.setPaused(z);
    }
}
