package com.amplifyframework.auth.plugins.core;

import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.lo3;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class LoginProvider {
    public static final Companion Companion = new Companion(null);
    private final String name;
    private final String userIdentifier;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return LoginProvider$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoginProvider(int i, String str, String str2, fff fffVar) {
        if (3 != (i & 3)) {
            tbd.m49692a(i, 3, LoginProvider$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.userIdentifier = str2;
    }

    public static /* synthetic */ LoginProvider copy$default(LoginProvider loginProvider, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginProvider.name;
        }
        if ((i & 2) != 0) {
            str2 = loginProvider.userIdentifier;
        }
        return loginProvider.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self(LoginProvider loginProvider, lo3 lo3Var, uef uefVar) {
        lo3Var.mo37568p(uefVar, 0, loginProvider.name);
        lo3Var.mo37568p(uefVar, 1, loginProvider.userIdentifier);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.userIdentifier;
    }

    public final LoginProvider copy(String str, String str2) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "userIdentifier");
        return new LoginProvider(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginProvider)) {
            return false;
        }
        LoginProvider loginProvider = (LoginProvider) obj;
        return sq8.m48644c(this.name, loginProvider.name) && sq8.m48644c(this.userIdentifier, loginProvider.userIdentifier);
    }

    public final String getName() {
        return this.name;
    }

    public final String getUserIdentifier() {
        return this.userIdentifier;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.userIdentifier.hashCode();
    }

    public String toString() {
        return "LoginProvider(name=" + this.name + ", userIdentifier=" + this.userIdentifier + ")";
    }

    public LoginProvider(String str, String str2) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "userIdentifier");
        this.name = str;
        this.userIdentifier = str2;
    }
}
