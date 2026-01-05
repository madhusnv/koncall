package com.amplifyframework.core.configuration;

import com.amplifyframework.auth.AuthUserAttributeKey;
import fy.InterfaceC2401a;
import hy.C3053d;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5941v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthUserAttributeKeySerializer implements InterfaceC2401a {
    public static final AuthUserAttributeKeySerializer INSTANCE = new AuthUserAttributeKeySerializer();
    private static final InterfaceC3055f descriptor = AbstractC5941v.m11887a("AuthUserAttributeKey", C3053d.f16396j);

    private AuthUserAttributeKeySerializer() {
    }

    @Override // fy.InterfaceC2401a
    public InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public AuthUserAttributeKey deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        String lowerCase = decoder.mo7705n().toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        AuthUserAttributeKey authUserAttributeKeyCustom = AuthUserAttributeKey.custom(lowerCase);
        AbstractC4154l.m8922e(authUserAttributeKeyCustom, "custom(...)");
        return authUserAttributeKeyCustom;
    }

    @Override // fy.InterfaceC2401a
    public void serialize(InterfaceC3367d encoder, AuthUserAttributeKey value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        String keyString = value.getKeyString();
        AbstractC4154l.m8922e(keyString, "getKeyString(...)");
        encoder.mo7724r(keyString);
    }
}
