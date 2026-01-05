package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h1 {
    /* renamed from: a */
    public final boolean m4275a(Object obj, e1 e1Var) throws InvalidProtocolBufferException {
        int iMo4207t = e1Var.mo4207t();
        int i10 = iMo4207t >>> 3;
        int i11 = iMo4207t & 7;
        if (i11 == 0) {
            ((i1) obj).m4285c(i10 << 3, Long.valueOf(e1Var.mo4185J()));
            return true;
        }
        if (i11 == 1) {
            ((i1) obj).m4285c((i10 << 3) | 1, Long.valueOf(e1Var.mo4190c()));
            return true;
        }
        if (i11 == 2) {
            ((i1) obj).m4285c((i10 << 3) | 2, e1Var.mo4178C());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.m4150b();
            }
            ((i1) obj).m4285c((i10 << 3) | 5, Integer.valueOf(e1Var.mo4195h()));
            return true;
        }
        i1 i1VarM4283b = i1.m4283b();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        while (e1Var.mo4213z() != Integer.MAX_VALUE && m4275a(i1VarM4283b, e1Var)) {
        }
        if (i13 != e1Var.mo4207t()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        i1VarM4283b.f7053e = false;
        ((i1) obj).m4285c(i12 | 3, i1VarM4283b);
        return true;
    }
}
