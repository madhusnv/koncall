package p001o;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import p001o.mz5;

/* loaded from: classes2.dex */
public interface fz5 {

    /* renamed from: o.fz5$a */
    public static class C13592a extends IOException {

        /* renamed from: a */
        public final int f24271a;

        public C13592a(Throwable th, int i) {
            super(th);
            this.f24271a = i;
        }
    }

    /* renamed from: e */
    static void m27774e(fz5 fz5Var, fz5 fz5Var2) {
        if (fz5Var == fz5Var2) {
            return;
        }
        if (fz5Var2 != null) {
            fz5Var2.mo27779f(null);
        }
        if (fz5Var != null) {
            fz5Var.mo27781h(null);
        }
    }

    /* renamed from: a */
    UUID mo27775a();

    /* renamed from: b */
    boolean mo27776b();

    /* renamed from: c */
    C13592a mo27777c();

    /* renamed from: d */
    vc4 mo27778d();

    /* renamed from: f */
    void mo27779f(mz5.C15451a c15451a);

    /* renamed from: g */
    Map mo27780g();

    int getState();

    /* renamed from: h */
    void mo27781h(mz5.C15451a c15451a);

    /* renamed from: i */
    boolean mo27782i(String str);
}
