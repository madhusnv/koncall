package w3;

import al.C0182j;
import android.view.View;
import bs.C0749g;
import d7.EnumC1644p;
import d7.InterfaceC1647s;
import d7.InterfaceC1649u;
import java.util.ArrayList;
import kotlin.jvm.internal.C4168z;
import tx.C7251k;
import tx.InterfaceC7250j;
import uw.InterfaceC7559c;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c3 implements InterfaceC1647s {

    /* renamed from: a */
    public final /* synthetic */ C8810d f37759a;

    /* renamed from: b */
    public final /* synthetic */ k2.g1 f37760b;

    /* renamed from: c */
    public final /* synthetic */ k2.q1 f37761c;

    /* renamed from: d */
    public final /* synthetic */ C4168z f37762d;

    /* renamed from: e */
    public final /* synthetic */ View f37763e;

    public c3(C8810d c8810d, k2.g1 g1Var, k2.q1 q1Var, C4168z c4168z, View view) {
        this.f37759a = c8810d;
        this.f37760b = g1Var;
        this.f37761c = q1Var;
        this.f37762d = c4168z;
        this.f37763e = view;
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        boolean z6;
        int i10 = b3.f37747a[enumC1644p.ordinal()];
        InterfaceC7250j interfaceC7250jM8651u = null;
        if (i10 == 1) {
            tx.c0.m13502y(this.f37759a, null, tx.b0.UNDISPATCHED, new C0749g(this.f37762d, this.f37761c, interfaceC1649u, this, this.f37763e, null, 9), 1);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                this.f37761c.m8650t();
                return;
            } else {
                k2.q1 q1Var = this.f37761c;
                synchronized (q1Var.f20519b) {
                    q1Var.f20536s = true;
                }
                return;
            }
        }
        k2.g1 g1Var = this.f37760b;
        if (g1Var != null) {
            C0182j c0182j = (C0182j) g1Var.f20393c;
            synchronized (c0182j.f555b) {
                try {
                    synchronized (c0182j.f555b) {
                        z6 = c0182j.f554a;
                    }
                    if (!z6) {
                        ArrayList arrayList = (ArrayList) c0182j.f556c;
                        c0182j.f556c = (ArrayList) c0182j.f557d;
                        c0182j.f557d = arrayList;
                        c0182j.f554a = true;
                        int size = arrayList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((InterfaceC7559c) arrayList.get(i11)).resumeWith(qw.a0.f30746a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        k2.q1 q1Var2 = this.f37761c;
        synchronized (q1Var2.f20519b) {
            if (q1Var2.f20536s) {
                q1Var2.f20536s = false;
                interfaceC7250jM8651u = q1Var2.m8651u();
            }
        }
        if (interfaceC7250jM8651u != null) {
            ((C7251k) interfaceC7250jM8651u).resumeWith(qw.a0.f30746a);
        }
    }
}
