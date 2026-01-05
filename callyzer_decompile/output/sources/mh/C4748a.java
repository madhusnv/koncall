package mh;

import android.graphics.Typeface;
import l4.d0;
import lh.C4466b;
import og.z0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mh.a */
/* loaded from: classes.dex */
public final class C4748a extends z0 {

    /* renamed from: a */
    public final Typeface f23724a;

    /* renamed from: b */
    public final d0 f23725b;

    /* renamed from: c */
    public boolean f23726c;

    public C4748a(d0 d0Var, Typeface typeface) {
        this.f23724a = typeface;
        this.f23725b = d0Var;
    }

    @Override // og.z0
    /* renamed from: b */
    public final void mo7029b(int i10) {
        if (this.f23726c) {
            return;
        }
        C4466b c4466b = (C4466b) this.f23725b.f21881b;
        C4748a c4748a = c4466b.f22264v;
        if (c4748a != null) {
            c4748a.f23726c = true;
        }
        Typeface typeface = c4466b.f22261s;
        Typeface typeface2 = this.f23724a;
        if (typeface != typeface2) {
            c4466b.f22261s = typeface2;
            c4466b.m9318g();
        }
    }

    @Override // og.z0
    /* renamed from: c */
    public final void mo7030c(Typeface typeface, boolean z6) {
        if (this.f23726c) {
            return;
        }
        C4466b c4466b = (C4466b) this.f23725b.f21881b;
        C4748a c4748a = c4466b.f22264v;
        if (c4748a != null) {
            c4748a.f23726c = true;
        }
        if (c4466b.f22261s != typeface) {
            c4466b.f22261s = typeface;
            c4466b.m9318g();
        }
    }
}
