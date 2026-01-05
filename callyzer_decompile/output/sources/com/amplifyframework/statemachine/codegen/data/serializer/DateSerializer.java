package com.amplifyframework.statemachine.codegen.data.serializer;

import fy.InterfaceC2401a;
import hy.C3053d;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import java.util.Date;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5941v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DateSerializer implements InterfaceC2401a {
    public static final DateSerializer INSTANCE = new DateSerializer();

    private DateSerializer() {
    }

    @Override // fy.InterfaceC2401a
    public InterfaceC3055f getDescriptor() {
        return AbstractC5941v.m11887a("Date", C3053d.f16394h);
    }

    @Override // fy.InterfaceC2401a
    public Date deserialize(InterfaceC3366c decoder) {
        AbstractC4154l.m8923f(decoder, "decoder");
        return new Date(decoder.mo7706p());
    }

    @Override // fy.InterfaceC2401a
    public void serialize(InterfaceC3367d encoder, Date value) {
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(value, "value");
        encoder.mo7723q(value.getTime());
    }
}
