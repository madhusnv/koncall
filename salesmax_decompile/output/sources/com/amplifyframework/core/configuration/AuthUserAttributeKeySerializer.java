package com.amplifyframework.core.configuration;

import com.amplifyframework.auth.AuthUserAttributeKey;
import java.util.Locale;
import p001o.dc9;
import p001o.h76;
import p001o.sq8;
import p001o.uef;
import p001o.vhd;
import p001o.w75;
import p001o.yef;

/* loaded from: classes5.dex */
public final class AuthUserAttributeKeySerializer implements dc9 {
    public static final AuthUserAttributeKeySerializer INSTANCE = new AuthUserAttributeKeySerializer();
    private static final uef descriptor = yef.m57704a("AuthUserAttributeKey", vhd.C17587i.f50350a);

    private AuthUserAttributeKeySerializer() {
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.bn5
    public AuthUserAttributeKey deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        String lowerCase = w75Var.mo17215B().toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        AuthUserAttributeKey authUserAttributeKeyCustom = AuthUserAttributeKey.custom(lowerCase);
        sq8.m48648g(authUserAttributeKeyCustom, "custom(...)");
        return authUserAttributeKeyCustom;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, AuthUserAttributeKey authUserAttributeKey) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(authUserAttributeKey, "value");
        String keyString = authUserAttributeKey.getKeyString();
        sq8.m48648g(keyString, "getKeyString(...)");
        h76Var.mo29875F(keyString);
    }
}
