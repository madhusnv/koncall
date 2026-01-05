package com.amplifyframework.auth.plugins.core;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import jy.n0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class LoginProvider {
    public static final Companion Companion = new Companion(null);
    private final String name;
    private final String userIdentifier;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC2401a serializer() {
            return LoginProvider$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }
    }

    public /* synthetic */ LoginProvider(int i10, String str, String str2, w0 w0Var) {
        if (3 != (i10 & 3)) {
            n0.m8426g(i10, 3, LoginProvider$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.userIdentifier = str2;
    }

    public static /* synthetic */ LoginProvider copy$default(LoginProvider loginProvider, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loginProvider.name;
        }
        if ((i10 & 2) != 0) {
            str2 = loginProvider.userIdentifier;
        }
        return loginProvider.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$aws_auth_plugins_core_release(LoginProvider loginProvider, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
        C4597u c4597u = (C4597u) interfaceC3365b;
        c4597u.m9444w(interfaceC3055f, 0, loginProvider.name);
        c4597u.m9444w(interfaceC3055f, 1, loginProvider.userIdentifier);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.userIdentifier;
    }

    public final LoginProvider copy(String name, String userIdentifier) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(userIdentifier, "userIdentifier");
        return new LoginProvider(name, userIdentifier);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginProvider)) {
            return false;
        }
        LoginProvider loginProvider = (LoginProvider) obj;
        return AbstractC4154l.m8918a(this.name, loginProvider.name) && AbstractC4154l.m8918a(this.userIdentifier, loginProvider.userIdentifier);
    }

    public final String getName() {
        return this.name;
    }

    public final String getUserIdentifier() {
        return this.userIdentifier;
    }

    public int hashCode() {
        return this.userIdentifier.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return a1.m14333m("LoginProvider(name=", this.name, ", userIdentifier=", this.userIdentifier, ")");
    }

    public LoginProvider(String name, String userIdentifier) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(userIdentifier, "userIdentifier");
        this.name = name;
        this.userIdentifier = userIdentifier;
    }
}
