package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.C10827b;
import com.facebook.login.C10830e;
import com.facebook.login.widget.LoginButton;
import p001o.a94;
import p001o.fka;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class DeviceLoginButton extends LoginButton {
    public Uri s0;

    /* renamed from: com.facebook.login.widget.DeviceLoginButton$a */
    public final class C10831a extends LoginButton.ViewOnClickListenerC10834c {
        public C10831a() {
            super();
        }

        @Override // com.facebook.login.widget.LoginButton.ViewOnClickListenerC10834c
        /* renamed from: b */
        public C10830e mo13423b() {
            if (a94.m16694d(this)) {
                return null;
            }
            try {
                C10827b c10827bM13362a = C10827b.f11639o.m13362a();
                c10827bM13362a.m13412z(DeviceLoginButton.this.getDefaultAudience());
                c10827bM13362a.m13390C(fka.DEVICE_AUTH);
                c10827bM13362a.m13360L(DeviceLoginButton.this.getDeviceRedirectUri());
                return c10827bM13362a;
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
    }

    public final Uri getDeviceRedirectUri() {
        return this.s0;
    }

    @Override // com.facebook.login.widget.LoginButton
    public LoginButton.ViewOnClickListenerC10834c getNewLoginClickListener() {
        return new C10831a();
    }

    public final void setDeviceRedirectUri(Uri uri) {
        this.s0 = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context) {
        super(context);
        sq8.m48649h(context, "context");
    }
}
