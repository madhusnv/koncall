package mf;

import be.C0655j;
import c0.b1;
import c0.u1;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.C4367l;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mf.b */
/* loaded from: classes.dex */
public final class C4719b {

    /* renamed from: a */
    public boolean f23612a;

    /* renamed from: b */
    public boolean f23613b;

    /* renamed from: c */
    public boolean f23614c;

    /* renamed from: d */
    public Object f23615d;

    /* renamed from: e */
    public Object f23616e;

    /* renamed from: f */
    public Object f23617f;

    /* renamed from: g */
    public Object f23618g;

    /* renamed from: h */
    public Object f23619h;

    /* renamed from: i */
    public Object f23620i;

    /* renamed from: a */
    public void m9586a() {
        C0655j c0655j = (C0655j) this.f23618g;
        if (c0655j != null) {
            c0655j.mo1881k();
            this.f23618g = null;
        }
        C8849i c8849i = (C8849i) this.f23620i;
        if (c8849i != null) {
            ((AtomicBoolean) c8849i.f42584c).set(false);
            this.f23620i = null;
        }
        m9587b();
        u1 u1Var = (u1) this.f23619h;
        if (u1Var != null) {
            u1Var.mo7416a();
            this.f23619h = null;
        }
    }

    /* renamed from: b */
    public void m9587b() {
        boolean zIsEmpty;
        C4367l c4367l = (C4367l) this.f23617f;
        while (true) {
            synchronized (c4367l.f21922c) {
                zIsEmpty = ((ArrayDeque) c4367l.f21921b).isEmpty();
            }
            if (zIsEmpty) {
                return;
            } else {
                ((b1) c4367l.m9133m()).close();
            }
        }
    }
}
