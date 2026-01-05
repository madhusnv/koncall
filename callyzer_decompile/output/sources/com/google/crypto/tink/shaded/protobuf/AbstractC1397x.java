package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.x */
/* loaded from: classes.dex */
public abstract class AbstractC1397x implements Cloneable {

    /* renamed from: a */
    public final a0 f7127a;

    /* renamed from: b */
    public a0 f7128b;

    /* renamed from: c */
    public boolean f7129c = false;

    public AbstractC1397x(a0 a0Var) {
        this.f7127a = a0Var;
        this.f7128b = (a0) a0Var.mo4165f(EnumC1399z.NEW_MUTABLE_INSTANCE);
    }

    /* renamed from: d */
    public static void m4457d(a0 a0Var, a0 a0Var2) {
        b1 b1Var = b1.f7019c;
        b1Var.getClass();
        b1Var.m4170a(a0Var.getClass()).mo4223j(a0Var, a0Var2);
    }

    /* renamed from: a */
    public final a0 m4458a() {
        a0 a0VarM4459b = m4459b();
        if (a0VarM4459b.m4166i()) {
            return a0VarM4459b;
        }
        throw new UninitializedMessageException();
    }

    /* renamed from: b */
    public final a0 m4459b() {
        if (this.f7129c) {
            return this.f7128b;
        }
        a0 a0Var = this.f7128b;
        a0Var.getClass();
        b1 b1Var = b1.f7019c;
        b1Var.getClass();
        b1Var.m4170a(a0Var.getClass()).mo4214a(a0Var);
        this.f7129c = true;
        return this.f7128b;
    }

    /* renamed from: c */
    public final void m4460c() {
        if (this.f7129c) {
            a0 a0Var = (a0) this.f7128b.mo4165f(EnumC1399z.NEW_MUTABLE_INSTANCE);
            m4457d(a0Var, this.f7128b);
            this.f7128b = a0Var;
            this.f7129c = false;
        }
    }

    public final Object clone() {
        a0 a0Var = this.f7127a;
        a0Var.getClass();
        AbstractC1397x abstractC1397x = (AbstractC1397x) a0Var.mo4165f(EnumC1399z.NEW_BUILDER);
        a0 a0VarM4459b = m4459b();
        abstractC1397x.m4460c();
        m4457d(abstractC1397x.f7128b, a0VarM4459b);
        return abstractC1397x;
    }
}
