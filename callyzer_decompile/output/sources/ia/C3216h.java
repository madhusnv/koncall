package ia;

import aws.sdk.kotlin.runtime.config.imds.EC2MetadataError;
import bt.i0;
import ed.AbstractC2029e;
import ed.C2026b;
import ed.C2032h;
import ed.EnumC2030f;
import jc.g0;
import jc.h0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import og.u1;
import pg.h8;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ia.h */
/* loaded from: classes.dex */
public final class C3216h extends C2032h {

    /* renamed from: c */
    public final InterfaceC7564h f17339c;

    public C3216h(InterfaceC7564h callContext) {
        AbstractC4154l.m8923f(callContext, "callContext");
        this.f17339c = callContext;
    }

    @Override // ed.C2032h
    /* renamed from: a */
    public final AbstractC2029e mo5751a(Throwable ex2) {
        AbstractC4154l.m8923f(ex2, "ex");
        if (!(ex2 instanceof EC2MetadataError)) {
            return null;
        }
        h0 h0Var = ((EC2MetadataError) ex2).f3493d;
        if (h8.m11682a(h0Var) == g0.SERVER_ERROR) {
            return new C2026b(EnumC2030f.ServerSide);
        }
        if (h0Var.equals(h0.f19569d)) {
            return new C2026b(EnumC2030f.ServerSide);
        }
        String strM8913b = a0.m8901a(C3216h.class).m8913b();
        if (strM8913b == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
        }
        u1.m10949h(this.f17339c, strM8913b).mo332i(null, new i0(18, h0Var, ex2));
        return null;
    }
}
